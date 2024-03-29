
package org.openhds.domain.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.openhds.domain.annotations.Description;
import org.openhds.domain.constraint.CheckEntityNotVoided;
import org.openhds.domain.constraint.CheckIndividualNotUnknown;
import org.openhds.domain.constraint.Searchable;


/**
 * Generated by JCodeModel
 * 
 */
@Description(description = "An OutMigration represents a migration out of the study area.It contains information about the Individual who is out-migrating to a particularResidency. It also contains information about the destination, date, and reason theIndividual is migrating as well as the Visit associated with the migration.")
@Entity
@Table(name = "outmigration")
@XmlRootElement(name = "outmigration")
public class OutMigration
    extends AuditableCollectedEntity
    implements Serializable
{

    public final static long serialVersionUID = 6736599408170070468L;
    @NotNull
    @Searchable
    @CheckEntityNotVoided
    @ManyToOne(cascade = {
        CascadeType.MERGE,
        CascadeType.PERSIST
    }, targetEntity = org.openhds.domain.model.Individual.class)
    @CheckIndividualNotUnknown
    @Description(description = "Individual who is outmigrating, identified by external id.")
    private Individual individual;
    @OneToOne(cascade = {
        CascadeType.MERGE,
        CascadeType.PERSIST
    }, targetEntity = org.openhds.domain.model.Residency.class)
    @NotNull
    @Description(description = "The residency the individual is outmigrating to.")
    private Residency residency;
    @Searchable
    @Description(description = "Destination of the outmigration.")
    private String destination;
    @Searchable
    @Description(description = "Reason for outmigrating.")
    private String reason;
    @Searchable
    @NotNull
    @ManyToOne(cascade = {
        CascadeType.MERGE,
        CascadeType.PERSIST
    }, targetEntity = org.openhds.domain.model.Visit.class)
    @Description(description = "The visit associated with the outmigration, identified by external id.")
    private Visit visit;
    @NotNull
    @Temporal(TemporalType.DATE)
    @Past(message = "The date of the migration must be in the past")
    @Description(description = "Recorded date of the inmigration.")
    private Calendar recordedDate;

    public Individual getIndividual() {
        return individual;
    }

    public void setIndividual(Individual indiv) {
        individual = indiv;
    }

    public Residency getResidency() {
        return residency;
    }

    public void setResidency(Residency res) {
        residency = res;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String name) {
        destination = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String name) {
        reason = name;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit vis) {
        visit = vis;
    }

    @XmlJavaTypeAdapter(org.openhds.domain.util.CalendarAdapter.class)
    public Calendar getRecordedDate() {
        return recordedDate;
    }

    public void setRecordedDate(Calendar date) {
        recordedDate = date;
    }

}
