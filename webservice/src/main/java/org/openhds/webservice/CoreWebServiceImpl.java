package org.openhds.webservice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;
import org.openhds.controller.exception.ConstraintViolations;
import org.openhds.controller.idgeneration.IdValidator;
import org.openhds.controller.idgeneration.IndividualGenerator;
import org.openhds.controller.service.CurrentUser;
import org.openhds.controller.service.DeathService;
import org.openhds.controller.service.EntityService;
import org.openhds.controller.service.FieldWorkerService;
import org.openhds.controller.service.InMigrationService;
import org.openhds.controller.service.IndividualService;
import org.openhds.controller.service.LocationHierarchyService;
import org.openhds.controller.service.OutMigrationService;
import org.openhds.controller.service.PregnancyService;
import org.openhds.controller.service.SocialGroupService;
import org.openhds.controller.service.VisitService;
import org.openhds.controller.service.WhitelistService;
import org.openhds.controller.util.OpenHDSResult;
import org.openhds.dao.service.GenericDao;
import org.openhds.domain.model.Death;
import org.openhds.domain.model.FieldWorker;
import org.openhds.domain.model.InMigration;
import org.openhds.domain.model.Individual;
import org.openhds.domain.model.Location;
import org.openhds.domain.model.LocationHierarchy;
import org.openhds.domain.model.Membership;
import org.openhds.domain.model.MigrationType;
import org.openhds.domain.model.OutMigration;
import org.openhds.domain.model.PregnancyObservation;
import org.openhds.domain.model.PregnancyOutcome;
import org.openhds.domain.model.PrivilegeConstants;
import org.openhds.domain.model.ReferencedBaseEntity;
import org.openhds.domain.model.ReferencedEntity;
import org.openhds.domain.model.Relationship;
import org.openhds.domain.model.Residency;
import org.openhds.domain.model.SocialGroup;
import org.openhds.domain.model.Visit;
import org.openhds.domain.service.impl.SitePropertiesServiceImpl;

@Produces("application/xml")
@Consumes("application/xml")
public class CoreWebServiceImpl {
	private static final String NO_FW_FOUND = "No field worker was specified";
	private static final String NO_INDIV_FOUND = "No individual was specified";
	private static final String NO_VISIT_FOUND = "No visit was specified";
	
    private static final String INVALID_LOCATION_ID = "Invalid Location Id";
    private static final String INVALID_LOCATION_HID = "Invalid LocationH Id";
    private static final String INVALID_SOCIALGROUP = "No Social Group Record Found";
    private static final String INVALID_VISIT_ID = "Invalid Visit Id";
    private static final String INVALID_FIELD_WORKER_ID = "Invalid Field Worker Id";
    private static final String INDIVIDUAL_ID_NOT_FOUND = "Invalid Individual Id";
    
    private VisitService visitService;
    private LocationHierarchyService locationService;
    private PregnancyService pregnancyService;
    private DeathService deathService;
    private SocialGroupService socialGroupService;
    private InMigrationService inMigrationService;
    private IndividualService individualService;
    private OutMigrationService outmigrationService;
    private FieldWorkerService fieldWorkerService;
    private EntityService entityService;
    private GenericDao genericDao;
    private WhitelistService whitelistService;
    private IdValidator idUtilities;
    private SitePropertiesServiceImpl siteProperties;
    private IndividualGenerator indivGen;
    private CurrentUser currentUser;
   
    @Context
    HttpServletRequest request;

    Logger log = Logger.getLogger(CoreWebServiceImpl.class);
       
    @POST
    @Path("/visit")
    public Response createVisit(Visit visit) {
       
        String locationId = visit.getVisitLocation().getExtId();
        String fieldWorkerId = visit.getCollectedBy().getExtId();
       
        HashMap<String, List<String>> idTemplates = new HashMap<String, List<String>>();
        idTemplates.put("Location", Arrays.asList(locationId));
        idTemplates.put("FieldWorker", Arrays.asList(fieldWorkerId));
       
        OpenHDSResult result = idUtilities.evaluateCheckDigits(idTemplates);
        if (!result.isSuccess())
            return Response.status(400).build();
                      
        if (authenticateOrigin()) {
                  
            try {   
                visit.setVisitLocation(locationService.findLocationById(locationId, INVALID_LOCATION_ID));
                visit.setCollectedBy(fieldWorkerService.findFieldWorkerById(fieldWorkerId, INVALID_FIELD_WORKER_ID));
                              
                visitService.evaluateVisit(visit);
                visit.setStatus(siteProperties.getDataStatusValidCode());
               
                entityService.create(visit);
            } catch (Exception e) {
                return Response.status(400).build();
            }
            log.info("created visit via web service call with locationId=" + locationId + ", fieldWorkerId=" + fieldWorkerId + ", recordedDate=" + visit.getVisitDate());
            return Response.ok().build();
        }
        return Response.status(401).build();
    }
    
    /**
     * Builder class to aggregate the the operations involved in retrieving
     * previously saved entities
     */
    private class FieldBuilder {
    	ConstraintViolations violations = new ConstraintViolations();
    	Visit visit;
    	FieldWorker fw;
    	LocationHierarchy lh;
    	//Location loc;
    	SocialGroup sg;
		List<Individual> individuals = new ArrayList<Individual>();
    	
    	public FieldBuilder referenceField(Visit visit) {
    		if (visit.getExtId() == null) {
    			violations.addViolations("No visit id provided");
    		} else {
    			try {
					this.visit = visitService.findVisitById(visit.getExtId(), INVALID_VISIT_ID);
				} catch (Exception e) {
					violations.addViolations(INVALID_VISIT_ID);
				}
    		}
    		
    		return this;
    	}

		public void validate() throws ConstraintViolations {
			if (hasViolations()) {
				throw violations;
			}
		}

		public FieldBuilder referenceField(Individual individual, String msg) {
    		if (individual.getExtId() == null) {
    			violations.addViolations(msg);
    		} else {
    			try {
    				individuals.add(individualService.findIndivById(individual.getExtId(), msg));
    			} catch(Exception e) {
    				violations.addViolations(msg);
    			}
    		}
    		
    		return this;
    	}

    	public FieldBuilder referenceField(FieldWorker collectedBy) {
    		if (collectedBy.getExtId() == null) {
    			violations.addViolations("No field worker id provided");
    		} else {
    			try {
    				fw = fieldWorkerService.findFieldWorkerById(collectedBy.getExtId(), INVALID_FIELD_WORKER_ID);
    			} catch(Exception e) {
    				violations.addViolations(INVALID_FIELD_WORKER_ID);
    			}
    		}
    		
    		return this;
    	}
    	
    	public FieldBuilder referenceField(LocationHierarchy locationlevel) {
    		if (locationlevel.getExtId() == null) {
    			violations.addViolations("No Village provided");
    		} else {
    			try {
    				lh = locationService.findLocationHierarchyById(locationlevel.getExtId(), INVALID_LOCATION_HID);
    			} catch(Exception e) {
    				violations.addViolations(INVALID_LOCATION_HID);
    			}
    		}
    		
    		return this;
    	}
    	
    	
    	public FieldBuilder referenceField(Location location) {
    		if (location.getExtId() == null) {
    			violations.addViolations("No Location provided");
    		} else {
    			try {
    				//System.out.println(location.getExtId());
    			//	loc = locationService.findLocationById(location.getExtId(), INVALID_LOCATION_ID);
    			} catch(Exception e) {
    				violations.addViolations(INVALID_LOCATION_ID);
    			}
    		}
    		
    		return this;
    	}
    	
    	
    	public FieldBuilder referenceField(SocialGroup socialgroup) {
    		if (socialgroup.getExtId() == null) {
    			violations.addViolations("No socialgroup provided");
    		} else {
    			try {
    				sg = socialGroupService.findSocialGroupById(socialgroup.getExtId(), INVALID_SOCIALGROUP);
     			} catch(Exception e) {
    				violations.addViolations(INVALID_SOCIALGROUP);
    			}
    		}
    		
    		return this;
    	}
    	
    	
    	public boolean hasViolations() {
    		return violations.hasViolations();
    	}
    }
    
    /**
     * Template that provides a generic algorithm for inserting
     * an entity into the system
     * @param <T> The type of entity to be inserted
     */
    private abstract class InsertTemplate<T> {
    	
    	private final List<String> nullMessages = new ArrayList<String>();
    	
    	public Response insert(T entity) {
    		if (!authenticateOrigin()) {
    			return Response.status(401).build();
    		}
    		
    		try {
    			verifyRequiredFields(entity);
    			validateReqequireFields();
    			
    			FieldBuilder builder = new FieldBuilder();
    			buildReferentialFields(entity, builder);
    			builder.validate();
    			
    			setReferentialFields(entity, builder);
    			saveEntity(entity);
    		} catch(ConstraintViolations e) {
    			WebServiceCallException ex = new WebServiceCallException(e);
    			return Response.status(Status.OK).entity(ex).build();
    		} catch(Exception e) {
    			ConstraintViolations v = new ConstraintViolations(e.getMessage());
    			WebServiceCallException ex = new WebServiceCallException(v);
    			return Response.status(Status.OK).entity(ex).build();
    		}
    		
    		return Response.ok().build();
    	}

		protected final void checkNonNull(Object value, String msg) {
    		if (value == null) {
    			nullMessages.add(msg);
    		}
    	}

    	private void validateReqequireFields() throws ConstraintViolations {
    		if (nullMessages.size() > 0) {
    			throw new ConstraintViolations("Required fields missing", nullMessages);
    		}
		}
    	
    	protected abstract void verifyRequiredFields(T entity);
    	
		protected abstract void buildReferentialFields(T entity, FieldBuilder builder);

		protected abstract void setReferentialFields(T entity, FieldBuilder builder);

		protected abstract void saveEntity(T entity) throws ConstraintViolations, Exception;
		
		private boolean authenticateOrigin() {
            return whitelistService.evaluateAddress(request);
        }    	
    }
    
    @POST
    @Path("/death")
    public Response createDeath(Death death) {
    	return new DeathInsert().insert(death);
    }
    
    private class DeathInsert extends InsertTemplate<Death> {

		@Override
		protected void buildReferentialFields(Death entity, FieldBuilder builder) {
			builder.referenceField(entity.getIndividual(), INDIVIDUAL_ID_NOT_FOUND)
				   .referenceField(entity.getVisitDeath())
				   .referenceField(entity.getCollectedBy());
		}

		@Override
		protected void setReferentialFields(Death entity, FieldBuilder builder) {
            entity.setIndividual(builder.individuals.get(0));
            entity.setCollectedBy(builder.fw);
            entity.setVisitDeath(builder.visit);
		}

		@Override
		protected void saveEntity(Death entity) throws ConstraintViolations, Exception {
            deathService.evaluateDeath(entity);
            deathService.createDeath(entity);			
		}

		@Override
		protected void verifyRequiredFields(Death entity) {
			checkNonNull(entity.getCollectedBy(), NO_FW_FOUND);
			checkNonNull(entity.getDeathCause(), "No death cause was specified");
			checkNonNull(entity.getDeathDate(), "No death date was specified");
			checkNonNull(entity.getDeathPlace(), "No death place was specified");
			checkNonNull(entity.getVisitDeath(), NO_VISIT_FOUND);
			checkNonNull(entity.getIndividual(), NO_INDIV_FOUND);
		}
    }
    
    @POST
    @Path("/inmigration")
    public Response createInMigration(InMigration inmigration) {      
    	return new InMigrationInsert().insert(inmigration);
    }
    
    private class InMigrationInsert extends InsertTemplate<InMigration> {

		@Override
		protected void buildReferentialFields(InMigration entity, FieldBuilder builder) {
	    	builder.referenceField(entity.getCollectedBy())
			   	   .referenceField(entity.getVisit());
	    	
	    	if (referencesIndividual(entity)) {
	    		builder.referenceField(entity.getIndividual(), INDIVIDUAL_ID_NOT_FOUND);
	    	} else {
	    		builder.referenceField(entity.getIndividual().getMother(), "Mother id was not found");
	    		builder.referenceField(entity.getIndividual().getFather(), "Father id was not found");
	    	}
		}

		private boolean referencesIndividual(InMigration entity) {
			return !entity.isUnknownIndividual() && entity.getMigType().equals(MigrationType.INTERNAL_INMIGRATION);
		}

		@Override
		protected void setReferentialFields(InMigration entity, FieldBuilder builder) {
			entity.setCollectedBy(builder.fw);
			entity.setVisit(builder.visit);
			if (referencesIndividual(entity)) {
				entity.setIndividual(builder.individuals.get(0));
			} else {
				entity.getIndividual().setCollectedBy(builder.fw);
				entity.getIndividual().setMother(builder.individuals.get(0));
				entity.getIndividual().setFather(builder.individuals.get(1));
			}
		}

		@Override
		protected void saveEntity(InMigration entity) throws ConstraintViolations, Exception {
			inMigrationService.evaluateInMigration(entity);
			inMigrationService.createInMigration(entity);
		}

		@Override
		protected void verifyRequiredFields(InMigration entity) {
			checkNonNull(entity.getCollectedBy(), NO_FW_FOUND);
			checkNonNull(entity.getIndividual(), NO_INDIV_FOUND);
			checkNonNull(entity.getMigType(), "No migration type specified");
			checkNonNull(entity.getOrigin(), "No origin was specified");
			checkNonNull(entity.getReason(), "No reason was specified");
			checkNonNull(entity.getRecordedDate(), "Date of Migration was not specified");
			checkNonNull(entity.getVisit(), NO_VISIT_FOUND);
			if (entity.getIndividual() != null && !referencesIndividual(entity)) {
				// check the fields on the individual
				Individual indiv = entity.getIndividual();
				if (!indivGen.generated) {
					checkNonNull(indiv.getExtId(), "No ext id was specified on migrant");
				}
				checkNonNull(indiv.getFirstName(), "No first name was specified on migrant");
				checkNonNull(indiv.getLastName(), "No last name was specified on migrant");
				checkNonNull(indiv.getGender(), "No gender was specified on migrant");
				checkNonNull(indiv.getDob(), "No date of birth was specified on migrant");
				checkNonNull(indiv.getDobAspect(), "No date of birth aspect was specified on migrant");
				checkNonNull(indiv.getMother(), "No mother was specified on migrant");
				checkNonNull(indiv.getFather(), "No father was specified on migrant");
			}
		}
    }


    //
    @POST
    @Path("/individual")
    public Response createIndividual(Individual individual) {      
    	return new IndividualInsert().insert(individual);
    }
    
    private class IndividualInsert extends InsertTemplate<Individual> {

		@Override
		protected void buildReferentialFields(Individual entity, FieldBuilder builder) {
	    	builder.referenceField(entity.getCollectedBy());
	    	    builder.referenceField(entity.getMother(), "Mother id was not found");
	    		builder.referenceField(entity.getFather(), "Father id was not found");
	    	
		}



		@Override
		protected void setReferentialFields(Individual entity, FieldBuilder builder) {
			    entity.setCollectedBy(builder.fw);
				entity.setMother(builder.individuals.get(0));
				entity.setFather(builder.individuals.get(1));
				entity.setExtId(entity.getExtId());
		}

		@Override
		protected void saveEntity(Individual entity) throws ConstraintViolations, Exception {
			entityService.create(entity);
		}

		@Override
		protected void verifyRequiredFields(Individual entity) {
			checkNonNull(entity.getCollectedBy(), NO_FW_FOUND);
			if (entity != null ) {
				// check the fields on the individual
				Individual indiv = entity;
			    checkNonNull(indiv.getExtId(), "No ext id was specified on individual");
				checkNonNull(indiv.getFirstName(), "No first name was specified on individual");
				checkNonNull(indiv.getLastName(), "No last name was specified on individual");
				checkNonNull(indiv.getGender(), "No gender was specified on individual");
				checkNonNull(indiv.getDob(), "No date of birth was specified on individual");
				checkNonNull(indiv.getDobAspect(), "No date of birth aspect was specified on individual");
				checkNonNull(indiv.getMother(), "No mother was specified on individual");
				checkNonNull(indiv.getFather(), "No father was specified on individual");
			}
		}
    }
    
    
    
    @POST
    @Path("/location")
    public Response createLocation(Location location) {      
    	return new LocationInsert().insert(location);
    }
    
    
    private class LocationInsert extends InsertTemplate<Location> {

		@Override
		protected void buildReferentialFields(Location entity, FieldBuilder builder) {
	    	builder.referenceField(entity.getCollectedBy());
	    	builder.referenceField(entity.getLocationLevel());	    	
		}



		@Override
		protected void setReferentialFields(Location entity, FieldBuilder builder) {
			    entity.setCollectedBy(builder.fw);
				entity.setLocationType("RUR");
				entity.setLocationName("Location" + entity.getExtId());
				entity.setExtId(entity.getExtId());
				entity.setLocationLevel(builder.lh);
				entity.setAccuracy(entity.getAccuracy());
				entity.setAltitude(entity.getAltitude());
				entity.setLatitude(entity.getLatitude());
				entity.setLongitude(entity.getLongitude());
			}

		@Override
		protected void saveEntity(Location entity) throws ConstraintViolations, Exception {
			entityService.create(entity);
		}

		@Override
		protected void verifyRequiredFields(Location entity) {
			checkNonNull(entity.getCollectedBy(), NO_FW_FOUND);
			if (entity != null ) {
				// check the fields on the location
				Location location = entity;
				checkNonNull(location.getLocationLevel(), "No Village was specified for the House");
			}
		}
    }
    
    @POST
    @Path("/relationship")
    public Response createRelationship(Relationship relationship) {      
    	return new RelationshipInsert().insert(relationship);
    }
    
    
    private class RelationshipInsert extends InsertTemplate<Relationship> {

		@Override
		protected void buildReferentialFields(Relationship entity, FieldBuilder builder) {
	    	builder.referenceField(entity.getCollectedBy());
	    	builder.referenceField(entity.getIndividualA(), "IndividualA id was not found");
	    	builder.referenceField(entity.getIndividualB(), "IndividualB id was not found");
		}



		@Override
		protected void setReferentialFields(Relationship entity, FieldBuilder builder) {
			    entity.setCollectedBy(builder.fw);			    
				entity.setStartDate(entity.getStartDate());
				entity.setIndividualA(builder.individuals.get(0));
				entity.setIndividualB(builder.individuals.get(1));
				entity.setaIsToB("2");
				entity.setEndType(siteProperties.getNotApplicableCode());
     	}

		@Override
		protected void saveEntity(Relationship entity) throws ConstraintViolations, Exception {
			entityService.create(entity);
		}

		@Override
		protected void verifyRequiredFields(Relationship entity) {
			checkNonNull(entity.getCollectedBy(), NO_FW_FOUND);
			if (entity != null ) {
				// check the fields on the relationship
				Relationship relationship = entity;
				checkNonNull(relationship.getIndividualA(), "No Individual A was specified for the Memebrship");
				checkNonNull(relationship.getIndividualB(), "No Individual B was specified for the Memebrship");
			}
		}
    }
    
    @POST
    @Path("/residency")
    public Response createResidency(Residency residency) {      
    	return new ResidencyInsert().insert(residency);
    }
    
    
    private class ResidencyInsert extends InsertTemplate<Residency> {

		@Override
		protected void buildReferentialFields(Residency entity, FieldBuilder builder) {
	    	builder.referenceField(entity.getCollectedBy());
	    	builder.referenceField(entity.getIndividual(), "Individual id was not found");
	    	//builder.referenceField(entity.getLocation());;
		}



		@Override
		protected void setReferentialFields(Residency entity, FieldBuilder builder) {
			    Location loc = null;
			    Calendar cal;
			    DateFormat formatter ; 
			    Date date = null;; 
			    formatter = new SimpleDateFormat("dd-MM-yy");
			    try {
					date = (Date)formatter.parse(siteProperties.getEarliestEnumerationDate());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			    cal=Calendar.getInstance();
			    cal.setTime(date);
			    entity.setCollectedBy(builder.fw);			    
				entity.setStartDate(cal);
				entity.setIndividual(builder.individuals.get(0));
				try {
					loc =locationService.findLocationById(entity.getLocation().getExtId(), INVALID_LOCATION_ID);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//entity.setLocation(entity.getLocation());
				entity.setLocation(loc);
				entity.setStartType(siteProperties.getEnumerationCode());
				entity.setEndType(siteProperties.getNotApplicableCode());
     	}

		@Override
		protected void saveEntity(Residency entity) throws ConstraintViolations, Exception {
			entityService.create(entity);
		}

		@Override
		protected void verifyRequiredFields(Residency entity) {
			checkNonNull(entity.getCollectedBy(), NO_FW_FOUND);
			if (entity != null ) {
				// check the fields on the residency
				Residency residency = entity;
				checkNonNull(residency.getIndividual(), "No Individual was specified for the residency");
			}
		}
    }
    
    
    @POST
    @Path("/membership")
    public Response createMembership(Membership mebership) {      
    	return new MembershipInsert().insert(mebership);
    }
    
    
    private class MembershipInsert extends InsertTemplate<Membership> {

		@Override
		protected void buildReferentialFields(Membership entity, FieldBuilder builder) {
	    	builder.referenceField(entity.getCollectedBy());
	    	builder.referenceField(entity.getIndividual(), "Individual id was not found");
	    	builder.referenceField(entity.getSocialGroup());
		}



		@Override
		protected void setReferentialFields(Membership entity, FieldBuilder builder) {
			    entity.setCollectedBy(builder.fw);			    
				entity.setbIsToA(entity.getbIsToA());
				entity.setSocialGroup(builder.sg);
				entity.setStartDate(entity.getStartDate());
				entity.setIndividual(builder.individuals.get(0));
				entity.setStartType(siteProperties.getEnumerationCode());
				entity.setEndType(siteProperties.getNotApplicableCode());
     	}

		@Override
		protected void saveEntity(Membership entity) throws ConstraintViolations, Exception {
			entityService.create(entity);
		}

		@Override
		protected void verifyRequiredFields(Membership entity) {
			checkNonNull(entity.getCollectedBy(), NO_FW_FOUND);
			if (entity != null ) {
				// check the fields on the relationship
				Membership membership = entity;
				checkNonNull(membership.getSocialGroup(), "No Social group was specified for the Memebrship");
			}
		}
    }
    
    
    @POST
    @Path("/socialgroup")
    public Response createSocialGroup(SocialGroup socialGroup) {      
    	return new SocialGroupInsert().insert(socialGroup);
    }
    
    
    private class SocialGroupInsert extends InsertTemplate<SocialGroup> {

		@Override
		protected void buildReferentialFields(SocialGroup entity, FieldBuilder builder) {
	    	builder.referenceField(entity.getCollectedBy());
	    	    builder.referenceField(entity.getGroupHead(), "Group Head id was not found");
		}



		@Override
		protected void setReferentialFields(SocialGroup entity, FieldBuilder builder) {
			    entity.setCollectedBy(builder.fw);
				entity.setGroupType("COH");
				entity.setGroupName("Household" + entity.getExtId());
				entity.setExtId(entity.getExtId());
				entity.setGroupHead(builder.individuals.get(0));
				}

		@Override
		protected void saveEntity(SocialGroup entity) throws ConstraintViolations, Exception {
			entityService.create(entity);
		}

		@Override
		protected void verifyRequiredFields(SocialGroup entity) {
			checkNonNull(entity.getCollectedBy(), NO_FW_FOUND);
			if (entity != null ) {
				// check the fields on the socialgroup
				SocialGroup socialgroup = entity;
				checkNonNull(socialgroup.getGroupHead(), "No Head group was specified for the Household");
			}
		}
    }
    
    
    //
    
    @POST
    @Path("/pregnancyobservation")
    public Response createPregnancyObservation(PregnancyObservation pregObserv) {
    	return new PregnancyObservationInsert().insert(pregObserv);
    }
    
    private class PregnancyObservationInsert extends InsertTemplate<PregnancyObservation> {

    	@Override
		protected void saveEntity(PregnancyObservation entity) throws ConstraintViolations, Exception {
			pregnancyService.evaluatePregnancyObservation(entity);
			entityService.create(entity);
		}

		@Override
		protected void buildReferentialFields(PregnancyObservation entity, FieldBuilder builder) {
			builder.referenceField(entity.getCollectedBy())
			   	   .referenceField(entity.getMother(), "Mother permanent id not found")
			   	   .referenceField(entity.getVisit());
		}

		@Override
		protected void setReferentialFields(PregnancyObservation entity, FieldBuilder builder) {
			entity.setCollectedBy(builder.fw);
			entity.setMother(builder.individuals.get(0));	
			entity.setVisit(builder.visit);
		}

		@Override
		protected void verifyRequiredFields(PregnancyObservation entity) {
			checkNonNull(entity.getCollectedBy(), NO_FW_FOUND);
			checkNonNull(entity.getExpectedDeliveryDate(), "Expected delivery date was not specified for the observation");
			checkNonNull(entity.getMother(), "No mother was specified for the observation");
			checkNonNull(entity.getRecordedDate(), "Recorded date was not specified for the observation");
			checkNonNull(entity.getVisit(), "No visit was specified for the observation");
		}
    }

    @POST
    @Path("/outmigration")
    public Response createOutMigration(OutMigration outmigration) {
    	return new OutMigrationInsert().insert(outmigration);
    }
    
    private class OutMigrationInsert extends InsertTemplate<OutMigration> {

		@Override
		protected void buildReferentialFields(OutMigration entity, FieldBuilder builder) {
			builder.referenceField(entity.getCollectedBy())
				   .referenceField(entity.getIndividual(), INDIVIDUAL_ID_NOT_FOUND)
				   .referenceField(entity.getVisit());
		}

		@Override
		protected void setReferentialFields(OutMigration entity, FieldBuilder builder) {
            entity.setIndividual(builder.individuals.get(0));
            entity.setCollectedBy(builder.fw);
            entity.setVisit(builder.visit);
		}

		@Override
		protected void saveEntity(OutMigration entity) throws ConstraintViolations, Exception {
			outmigrationService.evaluateOutMigration(entity);
			outmigrationService.createOutMigration(entity);
		}

		@Override
		protected void verifyRequiredFields(OutMigration entity) {
			checkNonNull(entity.getCollectedBy(), NO_FW_FOUND);
			checkNonNull(entity.getDestination(), "No destination was specified for out migration");
			checkNonNull(entity.getIndividual(), "No individual was specified for out migration");
			checkNonNull(entity.getReason(), "No reason was specified for out migration");
			checkNonNull(entity.getRecordedDate(), "Recorded date not specified for out migration");
			checkNonNull(entity.getVisit(), "No visit was specified for out migration");
		}
    }

    @POST
    @Path("/pregnancyoutcome")
    public Response createPregnancyOutcome(PregnancyOutcome pregnancyOutcome) {
    	return new PregnancyOutcomeInsert().insert(pregnancyOutcome);
    }
    
    private class PregnancyOutcomeInsert extends InsertTemplate<PregnancyOutcome> {

		@Override
		protected void buildReferentialFields(PregnancyOutcome entity, FieldBuilder builder) {
			builder.referenceField(entity.getMother(), "Mother permanent Id is not valid")
				   .referenceField(entity.getFather(), "Father permanent Id is not valid")
				   .referenceField(entity.getVisit())
				   .referenceField(entity.getCollectedBy());
		}

		@Override
		protected void setReferentialFields(PregnancyOutcome entity, FieldBuilder builder) {
            entity.setMother(builder.individuals.get(0));
            entity.setFather(builder.individuals.get(1));
            entity.setVisit(builder.visit);
            entity.setCollectedBy(builder.fw);			
		}

		@Override
		protected void saveEntity(PregnancyOutcome entity) throws ConstraintViolations, Exception {
			 pregnancyService.evaluatePregnancyOutcome(entity);
             pregnancyService.createPregnancyOutcome(entity);			
		}

		@Override
		protected void verifyRequiredFields(PregnancyOutcome entity) {
			// TODO Auto-generated method stub
			
		}

    }

    @GET
    @Path("/hierarchy")
    public ReferencedEntity getHierarchyIds() {
       
    	ReferencedEntity refEntity = new ReferencedEntity();
        List<LocationHierarchy> hierarchyList = genericDao.findAll(LocationHierarchy.class, false);
           
        int count = 0;
        for (LocationHierarchy item : hierarchyList) {
            if (!item.getExtId().equals("HIERARCHY_ROOT")) {
                Map<String, String> params = new HashMap<String, String>();
                params.put("name", item.getName());
               
                ReferencedBaseEntity entity = new ReferencedBaseEntity();
                entity.setExtId(item.getExtId());
                entity.setType("hierarchy");
                entity.setParams(params);
                refEntity.getEntity().add(entity);
                count++;
            }

        }
        refEntity.setCount(count);
        return refEntity;
    }    
    
    @GET
    @Path("entityIds/{locationHierarchy}")
    public ReferencedEntity getIdsByLocationHierarchyLevel(@PathParam("locationHierarchy") String locationHierarchy) {
    	// since the service layer is used (which requires certain privileges), must proxy current user since no user is actually required
    	// to be logged in
    	boolean proxied = false;
    	if (currentUser.getCurrentUser() == null) {
    		currentUser.setProxyUser("mobile", "mobile", new String[]{ PrivilegeConstants.VIEW_ENTITY });
    		proxied = true;
    	}
    		
    	
    	ReferencedEntity refEntity = new ReferencedEntity();
        List<LocationHierarchy> hierarchyList = genericDao.findListByProperty(LocationHierarchy.class, "extId", locationHierarchy);
   
        for (LocationHierarchy item : hierarchyList) 
        	refEntity = processLocationHierarchy(item, refEntity);
        
        // -- village --
            List<LocationHierarchy> villageList = genericDao.findAll(LocationHierarchy.class, false);
        //List<LocationHierarchy> villageList = genericDao.findListByProperty(LocationHierarchy.class, "extId", locationHierarchy);
            for (LocationHierarchy item : villageList) {
           	if ( !item.getExtId().equals("HIERARCHY_ROOT") && item.getLevel().getKeyIdentifier()==3){
        	    Map<String, String> params = new HashMap<String, String>();
                params.put("name", item.getName());
                ReferencedBaseEntity entity = new ReferencedBaseEntity();
                entity.setExtId(item.getExtId());
                entity.setType("village");
                entity.setParams(params);
                refEntity.getEntity().add(entity);
                refEntity.increaseCount();
            }
            
        }
        
        
        // -- fieldworker --
        List<FieldWorker> fwList = genericDao.findAll(FieldWorker.class,true);
        for (FieldWorker fw : fwList) {
          
        
            	ReferencedBaseEntity entity = new ReferencedBaseEntity();
            	Map<String, String> params = new HashMap<String, String>();
                params.put("firstname", fw.getFirstName());
                params.put("lastname", fw.getLastName());
               
                entity.setExtId(fw.getExtId());
                entity.setType("fieldworker");
                entity.setParams(params);
                refEntity.getEntity().add(entity);
                refEntity.increaseCount();
               
        }
        
        if (proxied) {
        	// clear current user if proxied, otherwise the user could become associated with a session
        	currentUser.clearCurrentUser();
        }
    
        return refEntity;
    }
    
    /**
     * Recursive function to perform a search on the location hierarchy when retrieving entity ids
     * by location hierarchy level.
     * @param item - the current item in the location hierarchy tree
     */
     public ReferencedEntity processLocationHierarchy(LocationHierarchy item, ReferencedEntity output) {
           	 
        // base case
        if (item.getLevel().equals(locationService.getLowestLevel())) {
           
            // obtain ids
            // -- location --
            List<Location> locationList = genericDao.findListByProperty(Location.class, "locationLevel", item, true);
            for (Location loc : locationList) {
                ReferencedBaseEntity entity = new ReferencedBaseEntity();
                Map<String, String> params = new HashMap<String, String>();
                params.put("name", loc.getLocationName());
               
                entity.setExtId(loc.getExtId());
                entity.setType("location");
                entity.setParams(params);
                output.getEntity().add(entity);
                output.increaseCount();
            }
           
            // -- individual --
            List<Individual> individualList = genericDao.findAll(Individual.class, true);
            for (Individual indiv : individualList) {
               
                Residency residency = indiv.getCurrentResidency();
                if (residency != null) {   
                    if (residency.getLocation().getLocationLevel().getExtId().equals(item.getExtId())) {
                        ReferencedBaseEntity entity = new ReferencedBaseEntity();
                        Map<String, String> params = new HashMap<String, String>();
                        params.put("firstname", indiv.getFirstName());
                        params.put("lastname", indiv.getLastName());
                        
                        Map<String, String> memberships = findMembershipForIndividual(indiv);
                        params.putAll(memberships);
                       
                        if (indiv.getGender().equals(siteProperties.getMaleCode()))
                            params.put("gender", "M");
                        else if (indiv.getGender().equals(siteProperties.getFemaleCode()))
                            params.put("gender", "F");
                        
                       	Location location = residency.getLocation()	;
                        params.put("location", location.getExtId());
                        params.put("village", location.getLocationLevel().getExtId());
                       
                        entity.setExtId(indiv.getExtId());
                        entity.setType("individual");
                        entity.setParams(params);
                        output.getEntity().add(entity);
                        output.increaseCount();
                    }   
                }
            }  
           
            // -- social group --
            List<SocialGroup> socialgroupList = genericDao.findAll(SocialGroup.class, true);
            for (SocialGroup sg : socialgroupList) {
               
                Residency residency = sg.getGroupHead().getCurrentResidency();
                if (residency != null) {
                    if (residency.getLocation().getLocationLevel().getExtId().equals(item.getExtId())) {
                    	ReferencedBaseEntity entity = new ReferencedBaseEntity();
                        Map<String, String> params = new HashMap<String, String>();
                        params.put("groupname", sg.getGroupName());
                       
                        entity.setExtId(sg.getExtId());
                        entity.setType("household");
                        entity.setParams(params);
                        output.getEntity().add(entity);
                        output.increaseCount();
                    }   
                }
            }
           
            // -- visit --
            List<Visit> visitList = genericDao.findAll(Visit.class, true);
            for (Visit visit : visitList) {
                if (visit.getVisitLocation().getLocationLevel().equals(item)) {
                	ReferencedBaseEntity entity = new ReferencedBaseEntity();
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("round", visit.getRoundNumber().toString());
                   
                    entity.setExtId(visit.getExtId());
                    entity.setType("visit");
                    entity.setParams(params);
                    output.getEntity().add(entity);
                    output.increaseCount();
                }   
            }
           

            
            return output;
        }
       
        // find all location hierarchy items that are children, continue to recurse
        List<LocationHierarchy> hierarchyList = genericDao.findListByProperty(LocationHierarchy.class, "parent", item);
       
        for (LocationHierarchy locationHierarchy : hierarchyList){
            processLocationHierarchy(locationHierarchy, output);
        }
       
       
        return output;
    }
                      
    private Map<String, String> findMembershipForIndividual(Individual indiv) {
    	Map<String, String> socialGroupEntries = new HashMap<String, String>();
    	// since the values are going in a map the keys must be unique
    	// cnt is used to ensure names are unique within the map
    	int cnt = 0;
    	Set<Membership> memberships = indiv.getAllMemberships();
    	for(Membership m : memberships) {
    		socialGroupEntries.put("socialgroup" + cnt, m.getSocialGroup().getExtId());
    		cnt++;
    	}
    	
    	// this is additional logic to ensure head of house have memberships
    	// its possible a household is created such that the head wasn't assign an explicit membership
    	List<SocialGroup> groups = socialGroupService.getAllSocialGroups(indiv);
    	if (groups.size() > 0) {
    		// look for duplicates
    		Collection<String> values = socialGroupEntries.values();
    		for(SocialGroup sg : groups) {
    			if (!values.contains(sg.getExtId())) {
    				socialGroupEntries.put("socialgroup" + cnt, sg.getExtId());
    				cnt++;
    			}
    		}
    	}
		
    	return socialGroupEntries;
	}

	private boolean authenticateOrigin() {
        return whitelistService.evaluateAddress(request);
    }

    public void setVisitService(VisitService visitService) {
        this.visitService = visitService;
    }

    public void setPregnancyService(PregnancyService pregObservService) {
        this.pregnancyService = pregObservService;
    }

    public void setLocationService(LocationHierarchyService locationService) {
        this.locationService = locationService;
    }

    public void setSocialGroupService(SocialGroupService socialGroupService) {
        this.socialGroupService = socialGroupService;
    }

    
    public void setDeathService(DeathService deathService) {
        this.deathService = deathService;
    }

    public void setEntityService(EntityService entityService) {
        this.entityService = entityService;
    }

    public void setGenericDao(GenericDao genericDao) {
        this.genericDao = genericDao;
    }

    public void setInMigrationService(InMigrationService inMigrationService) {
        this.inMigrationService = inMigrationService;
    }

    public void setIndividualService(IndividualService individualService) {
        this.individualService = individualService;
    }

    public void setOutmigrationService(OutMigrationService outmigrationService) {
        this.outmigrationService = outmigrationService;
    }

    public void setWhitelistService(WhitelistService whitelistService) {
        this.whitelistService = whitelistService;
    }

    public void setFieldWorkerService(FieldWorkerService fieldWorkerService) {
        this.fieldWorkerService = fieldWorkerService;
    }

    public void setIdUtilities(IdValidator idUtilities) {
        this.idUtilities = idUtilities;
    }
   
    public void setSiteProperties(SitePropertiesServiceImpl siteProperties) {
        this.siteProperties = siteProperties;
    }

	public void setIndivGen(IndividualGenerator indivGen) {
		this.indivGen = indivGen;
	}
	
	public void setCurrentUser(CurrentUser currentUser) {
		this.currentUser = currentUser;
	}
}
