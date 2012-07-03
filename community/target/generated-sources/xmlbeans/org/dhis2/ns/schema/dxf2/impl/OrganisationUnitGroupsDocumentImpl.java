/*
 * An XML document type.
 * Localname: organisationUnitGroups
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one organisationUnitGroups(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class OrganisationUnitGroupsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationUnitGroupsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONUNITGROUPS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnitGroups");
    
    
    /**
     * Gets the "organisationUnitGroups" element
     */
    public org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups getOrganisationUnitGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups)get_store().find_element_user(ORGANISATIONUNITGROUPS$0, 0);
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
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups)get_store().find_element_user(ORGANISATIONUNITGROUPS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups)get_store().add_element_user(ORGANISATIONUNITGROUPS$0);
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
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups)get_store().add_element_user(ORGANISATIONUNITGROUPS$0);
            return target;
        }
    }
    /**
     * An XML organisationUnitGroups(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class OrganisationUnitGroupsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups
    {
        private static final long serialVersionUID = 1L;
        
        public OrganisationUnitGroupsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANISATIONUNITGROUP$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnitGroup");
        
        
        /**
         * Gets array of all "organisationUnitGroup" elements
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup[] getOrganisationUnitGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORGANISATIONUNITGROUP$0, targetList);
                org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup[] result = new org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "organisationUnitGroup" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup getOrganisationUnitGroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup)get_store().find_element_user(ORGANISATIONUNITGROUP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "organisationUnitGroup" element
         */
        public int sizeOfOrganisationUnitGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONUNITGROUP$0);
            }
        }
        
        /**
         * Sets array of all "organisationUnitGroup" element
         */
        public void setOrganisationUnitGroupArray(org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup[] organisationUnitGroupArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(organisationUnitGroupArray, ORGANISATIONUNITGROUP$0);
            }
        }
        
        /**
         * Sets ith "organisationUnitGroup" element
         */
        public void setOrganisationUnitGroupArray(int i, org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup organisationUnitGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup)get_store().find_element_user(ORGANISATIONUNITGROUP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(organisationUnitGroup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "organisationUnitGroup" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup insertNewOrganisationUnitGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup)get_store().insert_element_user(ORGANISATIONUNITGROUP$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "organisationUnitGroup" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup addNewOrganisationUnitGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup)get_store().add_element_user(ORGANISATIONUNITGROUP$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "organisationUnitGroup" element
         */
        public void removeOrganisationUnitGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONUNITGROUP$0, i);
            }
        }
    }
}
