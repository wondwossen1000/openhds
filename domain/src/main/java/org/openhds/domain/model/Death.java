
package org.openhds.domain.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.openhds.domain.annotations.Description;
import org.openhds.domain.constraint.CheckDeathDateGreaterThanBirthDate;
import org.openhds.domain.constraint.CheckEntityNotVoided;
import org.openhds.domain.constraint.CheckFieldNotBlank;
import org.openhds.domain.constraint.CheckIndividualNotUnknown;
import org.openhds.domain.constraint.Searchable;


/**
 * Generated by JCodeModel
 * 
 */
@Description(description = "A Death represents the final event than an Individual can have within the system. It consists of the Individual who has passed on, the Visit associated with the Death, as well as descriptive information about the occurrence, cause, and date of the death. If the Individual had any Residencies, Relationships, or Memberships then they will become closed.")
@CheckDeathDateGreaterThanBirthDate
@Entity
@Table(name = "death")
@XmlRootElement(name = "death")
public class Death
    extends AuditableCollectedEntity
    implements Serializable
{

    public final static long serialVersionUID = -6644256636909420061L;
    @Searchable
    @CheckEntityNotVoided
    @CheckIndividualNotUnknown
    @ManyToOne(cascade = {
        CascadeType.MERGE,
        CascadeType.PERSIST
    })
    @Description(description = "Individual who has died, identified by external id.")
    private Individual individual;
    @CheckFieldNotBlank
    @Searchable
    @Description(description = "Place where the death occurred.")
    private String deathPlace;
    @CheckFieldNotBlank
    @Searchable
    @Description(description = "Cause of the death.")
    private String deathCause;
    @NotNull(message = "You must provide a Death date")
    @Past(message = "Death date should be in the past")
    @Temporal(TemporalType.DATE)
    @Description(description = "Date of the Death.")
    private Calendar deathDate;
    @Searchable
    @ManyToOne(cascade = {
        CascadeType.MERGE,
        CascadeType.PERSIST
    })
    @Description(description = "Visit associated with the death, identified by external id.")
    private Visit visitDeath;
    @Description(description = "Age of death in number of data.")
    private Long ageAtDeath;

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual indiv) {
        individual = indiv;
    }

    public String getDeathPlace() {
        return deathPlace;
    }

    public void setDeathPlace(String place) {
        deathPlace = place;
    }

    public String getDeathCause() {
        return deathCause;
    }

    public void setDeathCause(String cause) {
        deathCause = cause;
    }

    @XmlJavaTypeAdapter(org.openhds.domain.util.CalendarAdapter.class)
    public Calendar getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Calendar date) {
        deathDate = date;
    }

    public Visit getVisitDeath() {
        return visitDeath;
    }

    public void setVisitDeath(Visit visit) {
        visitDeath = visit;
    }

    public Long getAgeAtDeath() {
        return ageAtDeath;
    }

    public void setAgeAtDeath(Long age) {
        ageAtDeath = age;
    }

}
