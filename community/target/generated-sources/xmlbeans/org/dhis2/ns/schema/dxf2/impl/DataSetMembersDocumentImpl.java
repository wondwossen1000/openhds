/*
 * An XML document type.
 * Localname: dataSetMembers
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataSetMembersDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dataSetMembers(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataSetMembersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataSetMembersDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataSetMembersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASETMEMBERS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataSetMembers");
    
    
    /**
     * Gets the "dataSetMembers" element
     */
    public org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers getDataSetMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers target = null;
            target = (org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers)get_store().find_element_user(DATASETMEMBERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataSetMembers" element
     */
    public void setDataSetMembers(org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers dataSetMembers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers target = null;
            target = (org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers)get_store().find_element_user(DATASETMEMBERS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers)get_store().add_element_user(DATASETMEMBERS$0);
            }
            target.set(dataSetMembers);
        }
    }
    
    /**
     * Appends and returns a new empty "dataSetMembers" element
     */
    public org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers addNewDataSetMembers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers target = null;
            target = (org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers)get_store().add_element_user(DATASETMEMBERS$0);
            return target;
        }
    }
    /**
     * An XML dataSetMembers(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class DataSetMembersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers
    {
        private static final long serialVersionUID = 1L;
        
        public DataSetMembersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATASETMEMBER$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataSetMember");
        
        
        /**
         * Gets array of all "dataSetMember" elements
         */
        public org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember[] getDataSetMemberArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DATASETMEMBER$0, targetList);
                org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember[] result = new org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dataSetMember" element
         */
        public org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember getDataSetMemberArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember target = null;
                target = (org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember)get_store().find_element_user(DATASETMEMBER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dataSetMember" element
         */
        public int sizeOfDataSetMemberArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATASETMEMBER$0);
            }
        }
        
        /**
         * Sets array of all "dataSetMember" element
         */
        public void setDataSetMemberArray(org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember[] dataSetMemberArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dataSetMemberArray, DATASETMEMBER$0);
            }
        }
        
        /**
         * Sets ith "dataSetMember" element
         */
        public void setDataSetMemberArray(int i, org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember dataSetMember)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember target = null;
                target = (org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember)get_store().find_element_user(DATASETMEMBER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dataSetMember);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dataSetMember" element
         */
        public org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember insertNewDataSetMember(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember target = null;
                target = (org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember)get_store().insert_element_user(DATASETMEMBER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dataSetMember" element
         */
        public org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember addNewDataSetMember()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember target = null;
                target = (org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember)get_store().add_element_user(DATASETMEMBER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "dataSetMember" element
         */
        public void removeDataSetMember(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATASETMEMBER$0, i);
            }
        }
    }
}
