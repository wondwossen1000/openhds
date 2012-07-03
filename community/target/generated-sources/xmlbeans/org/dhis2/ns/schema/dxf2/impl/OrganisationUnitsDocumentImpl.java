/*
 * An XML document type.
 * Localname: organisationUnits
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one organisationUnits(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class OrganisationUnitsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationUnitsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONUNITS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnits");
    
    
    /**
     * Gets the "organisationUnits" element
     */
    public org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits getOrganisationUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits)get_store().find_element_user(ORGANISATIONUNITS$0, 0);
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
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits)get_store().find_element_user(ORGANISATIONUNITS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits)get_store().add_element_user(ORGANISATIONUNITS$0);
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
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits)get_store().add_element_user(ORGANISATIONUNITS$0);
            return target;
        }
    }
    /**
     * An XML organisationUnits(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class OrganisationUnitsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits
    {
        private static final long serialVersionUID = 1L;
        
        public OrganisationUnitsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANISATIONUNIT$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnit");
        
        
        /**
         * Gets array of all "organisationUnit" elements
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit[] getOrganisationUnitArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORGANISATIONUNIT$0, targetList);
                org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit[] result = new org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "organisationUnit" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit getOrganisationUnitArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit)get_store().find_element_user(ORGANISATIONUNIT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "organisationUnit" element
         */
        public int sizeOfOrganisationUnitArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONUNIT$0);
            }
        }
        
        /**
         * Sets array of all "organisationUnit" element
         */
        public void setOrganisationUnitArray(org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit[] organisationUnitArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(organisationUnitArray, ORGANISATIONUNIT$0);
            }
        }
        
        /**
         * Sets ith "organisationUnit" element
         */
        public void setOrganisationUnitArray(int i, org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit organisationUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit)get_store().find_element_user(ORGANISATIONUNIT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(organisationUnit);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "organisationUnit" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit insertNewOrganisationUnit(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit)get_store().insert_element_user(ORGANISATIONUNIT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "organisationUnit" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit addNewOrganisationUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit)get_store().add_element_user(ORGANISATIONUNIT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "organisationUnit" element
         */
        public void removeOrganisationUnit(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONUNIT$0, i);
            }
        }
    }
}
