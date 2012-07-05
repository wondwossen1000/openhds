package org.openhds.extensions;

import javax.persistence.EnumType;
import org.openhds.domain.util.CalendarAdapter;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JDocComment;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JVar;

public class InMigrationTemplateBuilder implements ExtensionTemplate {

	JCodeModel jCodeModel;
	boolean templateBuilt = false;
	
	JMethod jmsMigType;
	
	InMigrationTemplateBuilder(JCodeModel jCodeModel) {
		this.jCodeModel = jCodeModel;
	}
	
	@Override
	public void buildTemplate(JDefinedClass jc) {
		
		JDocComment jDocComment = jc.javadoc();
		jDocComment.add("Generated by JCodeModel");
		
		jc._extends(org.openhds.domain.model.AuditableCollectedEntity.class);
		jc._implements(java.io.Serializable.class);
		
		buildClassAnnotations(jc);	
		buildFieldsAndMethods(jc);
		buildAdditionalMethods(jc);
		
		templateBuilt = true;
	}

	private void buildAdditionalMethods(JDefinedClass jc) {
		
		JMethod jmsMigInternal = jc.method(JMod.PUBLIC, void.class, "setMigTypeInternal");
		JBlock jmsMigInternalBlock = jmsMigInternal.body();
		JClass jMigInternalTypeClassRef = jCodeModel.ref(org.openhds.domain.model.MigrationType.class);	
		jmsMigInternalBlock.invoke(jmsMigType).arg(jMigInternalTypeClassRef.staticRef("INTERNAL_INMIGRATION"));
		
		JMethod jmsMigExternal = jc.method(JMod.PUBLIC, void.class, "setMigTypeExternal");
		JBlock jmsMigExternalBlock = jmsMigExternal.body();
		JClass jMigExternalTypeClassRef = jCodeModel.ref(org.openhds.domain.model.MigrationType.class);	
		jmsMigExternalBlock.invoke(jmsMigType).arg(jMigExternalTypeClassRef.staticRef("EXTERNAL_INMIGRATION"));
	}

	@Override
	public void buildFieldsAndMethods(JDefinedClass jc) {
		
		// serial uuid
		JFieldVar jfSerial = jc.field(JMod.PUBLIC | JMod.STATIC | JMod.FINAL, long.class, "serialVersionUID");
		jfSerial.init(JExpr.lit(7889700709284952892L));
		
		// individual		
		JFieldVar jfIndividual = jc.field(JMod.PRIVATE , org.openhds.domain.model.Individual.class, "individual");
		jfIndividual.annotate(javax.validation.constraints.NotNull.class);
		jfIndividual.annotate(org.openhds.domain.constraint.Searchable.class);
		jfIndividual.annotate(javax.persistence.ManyToOne.class);
		jfIndividual.annotate(org.openhds.domain.constraint.CheckIndividualNotUnknown.class);
		JAnnotationUse jaIndividualDesc = jfIndividual.annotate(org.openhds.domain.annotations.Description.class);
		jaIndividualDesc.param("description", "Individual who is inmigrating, identified by external id.");
		
		// getter
		JMethod jmgIndividual = jc.method(JMod.PUBLIC, org.openhds.domain.model.Individual.class, "getIndividual");
		JBlock jmgIndividualBlock = jmgIndividual.body();
		jmgIndividualBlock._return(jfIndividual);
		
		// setter
		JMethod jmsIndividual = jc.method(JMod.PUBLIC, void.class, "setIndividual");
		JVar jvarIndividual = jmsIndividual.param(org.openhds.domain.model.Individual.class, "indiv");
		JBlock jmsIndividualBlock = jmsIndividual.body();
		jmsIndividualBlock.assign(jfIndividual, jvarIndividual);
		
		// residency
		JFieldVar jfResidency = jc.field(JMod.PRIVATE , org.openhds.domain.model.Residency.class, "residency");
		JClass jClassRef = jCodeModel.ref(org.openhds.domain.model.Residency.class);
		jfResidency.init(JExpr._new(jClassRef));	
		jfResidency.annotate(javax.persistence.OneToOne.class);
		jfResidency.annotate(javax.validation.constraints.NotNull.class);
		JAnnotationUse jaResidencyDesc = jfResidency.annotate(org.openhds.domain.annotations.Description.class);
		jaResidencyDesc.param("description", "The residency the individual is inmigrating to.");
		
		// getter
		JMethod jmgResidency = jc.method(JMod.PUBLIC, org.openhds.domain.model.Residency.class, "getResidency");
		JBlock jmgResidencyBlock = jmgResidency.body();
		jmgResidencyBlock._return(jfResidency);
		
		// setter
		JMethod jmsResidency = jc.method(JMod.PUBLIC, void.class, "setResidency");
		JVar jvarResidency = jmsResidency.param(org.openhds.domain.model.Residency.class, "res");
		JBlock jmsResidencyBlock = jmsResidency.body();
		jmsResidencyBlock.assign(jfResidency, jvarResidency);
		
		// origin
		JFieldVar jfOrigin = jc.field(JMod.PRIVATE , java.lang.String.class, "origin");
		jfOrigin.annotate(org.openhds.domain.constraint.Searchable.class);
		jfOrigin.annotate(org.openhds.domain.constraint.CheckFieldNotBlank.class);
		JAnnotationUse jaOriginDesc = jfOrigin.annotate(org.openhds.domain.annotations.Description.class);
		jaOriginDesc.param("description", "Name origin of the inmigration.");
		
		// getter
		JMethod jmgOrigin = jc.method(JMod.PUBLIC, java.lang.String.class, "getOrigin");
		JBlock jmgOriginBlock = jmgOrigin.body();
		jmgOriginBlock._return(jfOrigin);
		
		// setter
		JMethod jmsOrigin = jc.method(JMod.PUBLIC, void.class, "setOrigin");
		JVar jvarOrigin = jmsOrigin.param(java.lang.String.class, "name");
		JBlock jmsOriginBlock = jmsOrigin.body();
		jmsOriginBlock.assign(jfOrigin, jvarOrigin);
		
		// reason
		JFieldVar jfReason = jc.field(JMod.PRIVATE , java.lang.String.class, "reason");
		jfReason.annotate(org.openhds.domain.constraint.Searchable.class);
		jfReason.annotate(org.openhds.domain.constraint.CheckFieldNotBlank.class);
		JAnnotationUse jaReasonDesc = jfReason.annotate(org.openhds.domain.annotations.Description.class);
		jaReasonDesc.param("description", "The reason for inmigrating.");
		
		// getter
		JMethod jmgReason = jc.method(JMod.PUBLIC, java.lang.String.class, "getReason");
		JBlock jmgReasonBlock = jmgReason.body();
		jmgReasonBlock._return(jfReason);
		
		// setter
		JMethod jmsReason = jc.method(JMod.PUBLIC, void.class, "setReason");
		JVar jvarReason = jmsReason.param(java.lang.String.class, "name");
		JBlock jmsReasonBlock = jmsReason.body();
		jmsReasonBlock.assign(jfReason, jvarReason);
		
		// recordedDate
		JFieldVar jfRecordedDate = jc.field(JMod.PRIVATE , java.util.Calendar.class, "recordedDate");
		jfRecordedDate.annotate(javax.validation.constraints.NotNull.class);
		JAnnotationUse jaRecordedDateTemporal = jfRecordedDate.annotate(javax.persistence.Temporal.class);
		jaRecordedDateTemporal.param("value", javax.persistence.TemporalType.DATE);
		JAnnotationUse jaRecordedDateDesc = jfRecordedDate.annotate(org.openhds.domain.annotations.Description.class);
		jaRecordedDateDesc.param("description", "Recorded date of the inmigration.");
		
		// getter
		JMethod jmgRecordedDate = jc.method(JMod.PUBLIC, java.util.Calendar.class, "getRecordedDate");
		JAnnotationUse jaXmlRecordedDate = jmgRecordedDate.annotate(javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.class);
		jaXmlRecordedDate.param("value", CalendarAdapter.class);
		JBlock jmgRecordedDateBlock = jmgRecordedDate.body();
		jmgRecordedDateBlock._return(jfRecordedDate);
		
		// setter
		JMethod jmsRecordedDate = jc.method(JMod.PUBLIC, void.class, "setRecordedDate");
		JVar jvarRecordedDate = jmsRecordedDate.param(java.util.Calendar.class, "date");
		JBlock jmsRecordedDateBlock = jmsRecordedDate.body();
		jmsRecordedDateBlock.assign(jfRecordedDate, jvarRecordedDate);
		
		// visit
		JFieldVar jfVisit = jc.field(JMod.PRIVATE , org.openhds.domain.model.Visit.class, "visit");
		jfVisit.annotate(org.openhds.domain.constraint.Searchable.class);
		jfVisit.annotate(javax.validation.constraints.NotNull.class);
		jfVisit.annotate(javax.persistence.ManyToOne.class);
		JAnnotationUse jaVisitDesc = jfVisit.annotate(org.openhds.domain.annotations.Description.class);
		jaVisitDesc.param("description", "The visit associated with the inmigration, identified by external id.");
		
		// getter
		JMethod jmgVisit = jc.method(JMod.PUBLIC, org.openhds.domain.model.Visit.class, "getVisit");
		JBlock jmgVisitBlock = jmgVisit.body();
		jmgVisitBlock._return(jfVisit);
		
		// setter
		JMethod jmsVisit = jc.method(JMod.PUBLIC, void.class, "setVisit");
		JVar jvarVisit = jmsVisit.param(org.openhds.domain.model.Visit.class, "vis");
		JBlock jmsVisitBlock = jmsVisit.body();
		jmsVisitBlock.assign(jfVisit, jvarVisit);
		
		// migType
		JFieldVar jfMigType = jc.field(JMod.PRIVATE , org.openhds.domain.model.MigrationType.class, "migType");	
		JClass jMigTypeClassRef = jCodeModel.ref(org.openhds.domain.model.MigrationType.class);		
		jfMigType.init(jMigTypeClassRef.staticRef("INTERNAL_INMIGRATION"));
	    JAnnotationUse jaMigType = jfMigType.annotate(javax.persistence.Enumerated.class);
	    jaMigType.param("value", EnumType.STRING);
		JAnnotationUse jaMigTypeDesc = jfMigType.annotate(org.openhds.domain.annotations.Description.class);
		jaMigTypeDesc.param("description", "The migration type.");
		
		// getter
		JMethod jmgMigType = jc.method(JMod.PUBLIC, org.openhds.domain.model.MigrationType.class, "getMigType");
		JBlock jmgMigTypeBlock = jmgMigType.body();
		jmgMigTypeBlock._return(jfMigType);
		
		// setter
		jmsMigType = jc.method(JMod.PUBLIC, void.class, "setMigType");
		JVar jvarMigType = jmsMigType.param(org.openhds.domain.model.MigrationType.class, "mig");
		JBlock jmsMigTypeBlock = jmsMigType.body();
		jmsMigTypeBlock.assign(jfMigType, jvarMigType);
		
		// unknownIndividual
		JFieldVar jfUnknownIndividual = jc.field(JMod.PRIVATE , java.lang.Boolean.class, "unknownIndividual");
		jfUnknownIndividual.init(JExpr.FALSE);
		JAnnotationUse jaUnknownIndividualDesc = jfUnknownIndividual.annotate(org.openhds.domain.annotations.Description.class);
		jaUnknownIndividualDesc.param("description", "Flag for indicating if the individual who is inmigrating is known or not.");
		
		// getter
		JMethod jmgUnknownIndividual = jc.method(JMod.PUBLIC, java.lang.Boolean.class, "isUnknownIndividual");
		JBlock jmgUnknownIndividualBlock = jmgUnknownIndividual.body();
		jmgUnknownIndividualBlock._return(jfUnknownIndividual);
		
		// setter
		JMethod jmsUnknownIndividual = jc.method(JMod.PUBLIC, void.class, "setUnknownIndividual");
		JVar jvarUnknownIndividual = jmsUnknownIndividual.param(java.lang.Boolean.class, "flag");
		JBlock jmsUnknownIndividualBlock = jmsUnknownIndividual.body();
		jmsUnknownIndividualBlock.assign(jfUnknownIndividual, jvarUnknownIndividual);
	}

	@Override
	public void buildClassAnnotations(JDefinedClass jc) {
		
		// create Description annotation
		JAnnotationUse jad = jc.annotate(org.openhds.domain.annotations.Description.class);
		jad.param("description", "An InMigration represents a migration into the study area. " +
		"It contains information about the Individual who is in-migrating to a particular " +
		"Residency. It also contains information about the origin, date, and reason the " +
		"Indiviudal is migrating as well as the Visit that is associated with the migration.");
				
		// create Entity annotation
		jc.annotate(javax.persistence.Entity.class);
		
		jc.annotate(org.openhds.domain.constraint.CheckInMigrationAfterDob.class);
		
		JAnnotationUse jat = jc.annotate(javax.persistence.Table.class);
		jat.param("name", "inmigration");
		
		JAnnotationUse jxmlRoot = jc.annotate(javax.xml.bind.annotation.XmlRootElement.class);
		jxmlRoot.param("name", "inmigration");
		
	}
}