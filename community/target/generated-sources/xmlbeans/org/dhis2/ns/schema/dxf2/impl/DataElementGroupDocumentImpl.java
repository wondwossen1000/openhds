/*
 * An XML document type.
 * Localname: dataElementGroup
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataElementGroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dataElementGroup(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataElementGroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataElementGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataElementGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAELEMENTGROUP$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElementGroup");
    
    
    /**
     * Gets the "dataElementGroup" element
     */
    public org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup getDataElementGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup)get_store().find_element_user(DATAELEMENTGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataElementGroup" element
     */
    public void setDataElementGroup(org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup dataElementGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup)get_store().find_element_user(DATAELEMENTGROUP$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup)get_store().add_element_user(DATAELEMENTGROUP$0);
            }
            target.set(dataElementGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "dataElementGroup" element
     */
    public org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup addNewDataElementGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup)get_store().add_element_user(DATAELEMENTGROUP$0);
            return target;
        }
    }
    /**
     * An XML dataElementGroup(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class DataElementGroupImpl extends org.dhis2.ns.schema.dxf2.impl.IdentifiableObjectImpl implements org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup
    {
        private static final long serialVersionUID = 1L;
        
        public DataElementGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATAELEMENTREF$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElementRef");
        
        
        /**
         * Gets array of all "dataElementRef" elements
         */
        public org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef[] getDataElementRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DATAELEMENTREF$0, targetList);
                org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef[] result = new org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dataElementRef" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef getDataElementRefArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef)get_store().find_element_user(DATAELEMENTREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dataElementRef" element
         */
        public int sizeOfDataElementRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATAELEMENTREF$0);
            }
        }
        
        /**
         * Sets array of all "dataElementRef" element
         */
        public void setDataElementRefArray(org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef[] dataElementRefArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dataElementRefArray, DATAELEMENTREF$0);
            }
        }
        
        /**
         * Sets ith "dataElementRef" element
         */
        public void setDataElementRefArray(int i, org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef dataElementRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef)get_store().find_element_user(DATAELEMENTREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dataElementRef);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dataElementRef" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef insertNewDataElementRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef)get_store().insert_element_user(DATAELEMENTREF$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dataElementRef" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef addNewDataElementRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef)get_store().add_element_user(DATAELEMENTREF$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "dataElementRef" element
         */
        public void removeDataElementRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATAELEMENTREF$0, i);
            }
        }
    }
}
