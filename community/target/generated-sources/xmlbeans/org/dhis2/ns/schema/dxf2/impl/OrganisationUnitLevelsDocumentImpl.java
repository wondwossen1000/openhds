/*
 * An XML document type.
 * Localname: organisationUnitLevels
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one organisationUnitLevels(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class OrganisationUnitLevelsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationUnitLevelsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONUNITLEVELS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnitLevels");
    
    
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
     * An XML organisationUnitLevels(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class OrganisationUnitLevelsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels
    {
        private static final long serialVersionUID = 1L;
        
        public OrganisationUnitLevelsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANISATIONUNITLEVEL$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnitLevel");
        
        
        /**
         * Gets array of all "organisationUnitLevel" elements
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel[] getOrganisationUnitLevelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORGANISATIONUNITLEVEL$0, targetList);
                org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel[] result = new org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "organisationUnitLevel" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel getOrganisationUnitLevelArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel)get_store().find_element_user(ORGANISATIONUNITLEVEL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "organisationUnitLevel" element
         */
        public int sizeOfOrganisationUnitLevelArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONUNITLEVEL$0);
            }
        }
        
        /**
         * Sets array of all "organisationUnitLevel" element
         */
        public void setOrganisationUnitLevelArray(org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel[] organisationUnitLevelArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(organisationUnitLevelArray, ORGANISATIONUNITLEVEL$0);
            }
        }
        
        /**
         * Sets ith "organisationUnitLevel" element
         */
        public void setOrganisationUnitLevelArray(int i, org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel organisationUnitLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel)get_store().find_element_user(ORGANISATIONUNITLEVEL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(organisationUnitLevel);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "organisationUnitLevel" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel insertNewOrganisationUnitLevel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel)get_store().insert_element_user(ORGANISATIONUNITLEVEL$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "organisationUnitLevel" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel addNewOrganisationUnitLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel)get_store().add_element_user(ORGANISATIONUNITLEVEL$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "organisationUnitLevel" element
         */
        public void removeOrganisationUnitLevel(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONUNITLEVEL$0, i);
            }
        }
    }
}
