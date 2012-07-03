/*
 * An XML document type.
 * Localname: orgUnitStructure
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one orgUnitStructure(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class OrgUnitStructureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrgUnitStructureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGUNITSTRUCTURE$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "orgUnitStructure");
    
    
    /**
     * Gets the "orgUnitStructure" element
     */
    public org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure getOrgUnitStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure target = null;
            target = (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure)get_store().find_element_user(ORGUNITSTRUCTURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "orgUnitStructure" element
     */
    public void setOrgUnitStructure(org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure orgUnitStructure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure target = null;
            target = (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure)get_store().find_element_user(ORGUNITSTRUCTURE$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure)get_store().add_element_user(ORGUNITSTRUCTURE$0);
            }
            target.set(orgUnitStructure);
        }
    }
    
    /**
     * Appends and returns a new empty "orgUnitStructure" element
     */
    public org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure addNewOrgUnitStructure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure target = null;
            target = (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure)get_store().add_element_user(ORGUNITSTRUCTURE$0);
            return target;
        }
    }
    /**
     * An XML orgUnitStructure(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class OrgUnitStructureImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure
    {
        private static final long serialVersionUID = 1L;
        
        public OrgUnitStructureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANISATIONUNITLEVELS$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnitLevels");
        private static final javax.xml.namespace.QName ORGANISATIONUNITS$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnits");
        private static final javax.xml.namespace.QName ORGANISATIONUNITRELATIONSHIPS$4 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnitRelationships");
        private static final javax.xml.namespace.QName ORGANISATIONUNITGROUPS$6 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnitGroups");
        private static final javax.xml.namespace.QName GROUPSETS$8 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "groupSets");
        
        
        /**
         * Gets the "organisationUnitLevels" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels getOrganisationUnitLevels()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels)get_store().find_element_user(ORGANISATIONUNITLEVELS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "organisationUnitLevels" element
         */
        public void setOrganisationUnitLevels(org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels organisationUnitLevels)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels)get_store().find_element_user(ORGANISATIONUNITLEVELS$0, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels)get_store().add_element_user(ORGANISATIONUNITLEVELS$0);
                }
                target.set(organisationUnitLevels);
            }
        }
        
        /**
         * Appends and returns a new empty "organisationUnitLevels" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels addNewOrganisationUnitLevels()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels)get_store().add_element_user(ORGANISATIONUNITLEVELS$0);
                return target;
            }
        }
        
        /**
         * Gets the "organisationUnits" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits getOrganisationUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits)get_store().find_element_user(ORGANISATIONUNITS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "organisationUnits" element
         */
        public void setOrganisationUnits(org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits organisationUnits)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits)get_store().find_element_user(ORGANISATIONUNITS$2, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits)get_store().add_element_user(ORGANISATIONUNITS$2);
                }
                target.set(organisationUnits);
            }
        }
        
        /**
         * Appends and returns a new empty "organisationUnits" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits addNewOrganisationUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits)get_store().add_element_user(ORGANISATIONUNITS$2);
                return target;
            }
        }
        
        /**
         * Gets the "organisationUnitRelationships" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships getOrganisationUnitRelationships()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships)get_store().find_element_user(ORGANISATIONUNITRELATIONSHIPS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "organisationUnitRelationships" element
         */
        public void setOrganisationUnitRelationships(org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships organisationUnitRelationships)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships)get_store().find_element_user(ORGANISATIONUNITRELATIONSHIPS$4, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships)get_store().add_element_user(ORGANISATIONUNITRELATIONSHIPS$4);
                }
                target.set(organisationUnitRelationships);
            }
        }
        
        /**
         * Appends and returns a new empty "organisationUnitRelationships" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships addNewOrganisationUnitRelationships()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships)get_store().add_element_user(ORGANISATIONUNITRELATIONSHIPS$4);
                return target;
            }
        }
        
        /**
         * Gets the "organisationUnitGroups" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups getOrganisationUnitGroups()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups)get_store().find_element_user(ORGANISATIONUNITGROUPS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "organisationUnitGroups" element
         */
        public void setOrganisationUnitGroups(org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups organisationUnitGroups)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups)get_store().find_element_user(ORGANISATIONUNITGROUPS$6, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups)get_store().add_element_user(ORGANISATIONUNITGROUPS$6);
                }
                target.set(organisationUnitGroups);
            }
        }
        
        /**
         * Appends and returns a new empty "organisationUnitGroups" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups addNewOrganisationUnitGroups()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups)get_store().add_element_user(ORGANISATIONUNITGROUPS$6);
                return target;
            }
        }
        
        /**
         * Gets the "groupSets" element
         */
        public org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets getGroupSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets target = null;
                target = (org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets)get_store().find_element_user(GROUPSETS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "groupSets" element
         */
        public void setGroupSets(org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets groupSets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets target = null;
                target = (org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets)get_store().find_element_user(GROUPSETS$8, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets)get_store().add_element_user(GROUPSETS$8);
                }
                target.set(groupSets);
            }
        }
        
        /**
         * Appends and returns a new empty "groupSets" element
         */
        public org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets addNewGroupSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets target = null;
                target = (org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets)get_store().add_element_user(GROUPSETS$8);
                return target;
            }
        }
    }
}
