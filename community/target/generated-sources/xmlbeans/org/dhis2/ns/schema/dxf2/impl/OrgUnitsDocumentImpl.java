/*
 * An XML document type.
 * Localname: orgUnits
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrgUnitsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one orgUnits(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class OrgUnitsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrgUnitsDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrgUnitsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGUNITS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "orgUnits");
    
    
    /**
     * Gets the "orgUnits" element
     */
    public org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits getOrgUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits target = null;
            target = (org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits)get_store().find_element_user(ORGUNITS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "orgUnits" element
     */
    public void setOrgUnits(org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits orgUnits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits target = null;
            target = (org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits)get_store().find_element_user(ORGUNITS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits)get_store().add_element_user(ORGUNITS$0);
            }
            target.set(orgUnits);
        }
    }
    
    /**
     * Appends and returns a new empty "orgUnits" element
     */
    public org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits addNewOrgUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits target = null;
            target = (org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits)get_store().add_element_user(ORGUNITS$0);
            return target;
        }
    }
    /**
     * An XML orgUnits(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class OrgUnitsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits
    {
        private static final long serialVersionUID = 1L;
        
        public OrgUnitsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGUNITREF$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "orgUnitRef");
        
        
        /**
         * Gets array of all "orgUnitRef" elements
         */
        public org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef[] getOrgUnitRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORGUNITREF$0, targetList);
                org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef[] result = new org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "orgUnitRef" element
         */
        public org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef getOrgUnitRefArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef target = null;
                target = (org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef)get_store().find_element_user(ORGUNITREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "orgUnitRef" element
         */
        public int sizeOfOrgUnitRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGUNITREF$0);
            }
        }
        
        /**
         * Sets array of all "orgUnitRef" element
         */
        public void setOrgUnitRefArray(org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef[] orgUnitRefArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(orgUnitRefArray, ORGUNITREF$0);
            }
        }
        
        /**
         * Sets ith "orgUnitRef" element
         */
        public void setOrgUnitRefArray(int i, org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef orgUnitRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef target = null;
                target = (org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef)get_store().find_element_user(ORGUNITREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(orgUnitRef);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "orgUnitRef" element
         */
        public org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef insertNewOrgUnitRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef target = null;
                target = (org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef)get_store().insert_element_user(ORGUNITREF$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "orgUnitRef" element
         */
        public org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef addNewOrgUnitRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef target = null;
                target = (org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef)get_store().add_element_user(ORGUNITREF$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "orgUnitRef" element
         */
        public void removeOrgUnitRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGUNITREF$0, i);
            }
        }
    }
}
