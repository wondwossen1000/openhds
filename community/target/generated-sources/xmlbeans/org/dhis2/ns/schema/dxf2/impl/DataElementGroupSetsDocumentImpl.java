/*
 * An XML document type.
 * Localname: dataElementGroupSets
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dataElementGroupSets(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataElementGroupSetsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataElementGroupSetsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAELEMENTGROUPSETS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElementGroupSets");
    
    
    /**
     * Gets the "dataElementGroupSets" element
     */
    public org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets getDataElementGroupSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets)get_store().find_element_user(DATAELEMENTGROUPSETS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataElementGroupSets" element
     */
    public void setDataElementGroupSets(org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets dataElementGroupSets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets)get_store().find_element_user(DATAELEMENTGROUPSETS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets)get_store().add_element_user(DATAELEMENTGROUPSETS$0);
            }
            target.set(dataElementGroupSets);
        }
    }
    
    /**
     * Appends and returns a new empty "dataElementGroupSets" element
     */
    public org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets addNewDataElementGroupSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets)get_store().add_element_user(DATAELEMENTGROUPSETS$0);
            return target;
        }
    }
    /**
     * An XML dataElementGroupSets(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class DataElementGroupSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets
    {
        private static final long serialVersionUID = 1L;
        
        public DataElementGroupSetsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATAELEMENTGROUPSET$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElementGroupSet");
        
        
        /**
         * Gets array of all "dataElementGroupSet" elements
         */
        public org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet[] getDataElementGroupSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DATAELEMENTGROUPSET$0, targetList);
                org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet[] result = new org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dataElementGroupSet" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet getDataElementGroupSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet)get_store().find_element_user(DATAELEMENTGROUPSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dataElementGroupSet" element
         */
        public int sizeOfDataElementGroupSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATAELEMENTGROUPSET$0);
            }
        }
        
        /**
         * Sets array of all "dataElementGroupSet" element
         */
        public void setDataElementGroupSetArray(org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet[] dataElementGroupSetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dataElementGroupSetArray, DATAELEMENTGROUPSET$0);
            }
        }
        
        /**
         * Sets ith "dataElementGroupSet" element
         */
        public void setDataElementGroupSetArray(int i, org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet dataElementGroupSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet)get_store().find_element_user(DATAELEMENTGROUPSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dataElementGroupSet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dataElementGroupSet" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet insertNewDataElementGroupSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet)get_store().insert_element_user(DATAELEMENTGROUPSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dataElementGroupSet" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet addNewDataElementGroupSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet)get_store().add_element_user(DATAELEMENTGROUPSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "dataElementGroupSet" element
         */
        public void removeDataElementGroupSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATAELEMENTGROUPSET$0, i);
            }
        }
    }
}
