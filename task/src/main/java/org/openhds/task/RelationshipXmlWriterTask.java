package org.openhds.task;

import java.util.List;

import org.openhds.controller.service.RelationshipService;
import org.openhds.domain.model.Relationship;
import org.openhds.domain.util.CalendarUtil;
import org.openhds.domain.util.ShallowCopier;
import org.openhds.task.service.AsyncTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("relationshipXmlWriter")
public class RelationshipXmlWriterTask extends XmlWriterTemplate<Relationship> {

    private RelationshipService relationshipService;

    @Autowired
    public RelationshipXmlWriterTask(AsyncTaskService asyncTaskService, CalendarUtil calendarUtil,
            RelationshipService relationshipService) {
        super(asyncTaskService, calendarUtil, AsyncTaskService.RELATIONSHIP_TASK_NAME);
        this.relationshipService = relationshipService;
    }

    @Override
    protected Relationship makeCopyOf(Relationship original) {
        return ShallowCopier.copyRelationship(original);
    }

    @Override
    protected List<Relationship> getEntitiesInRange(TaskContext taskContext,int i, int pageSize) {
        return relationshipService.getAllRelationshipInRange(i, pageSize);
    }

    @Override
    protected Class<?> getBoundClass() {
        return Relationship.class;
    }

    @Override
    protected String getStartElementName() {
        return "relationships";
    }

    @Override
    protected int getTotalEntityCount(TaskContext taskContext) {
        return (int) relationshipService.getTotalRelationshipCount();
    }

}
