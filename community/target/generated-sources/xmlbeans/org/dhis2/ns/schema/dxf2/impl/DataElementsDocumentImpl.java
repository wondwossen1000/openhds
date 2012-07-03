/*
 * An XML document type.
 * Localname: dataElements
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataElementsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dataElements(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataElementsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataElementsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataElementsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAELEMENTS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElements");
    
    
    /**
     * Gets the "dataElements" element
     */
    public org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements getDataElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements)get_store().find_element_user(DATAELEMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataElements" element
     */
    public void setDataElements(org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements dataElements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements)get_store().find_element_user(DATAELEMENTS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements)get_store().add_element_user(DATAELEMENTS$0);
            }
            target.set(dataElements);
        }
    }
    
    /**
     * Appends and returns a new empty "dataElements" element
     */
    public org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements addNewDataElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements)get_store().add_element_user(DATAELEMENTS$0);
            return target;
        }
    }
    /**
     * An XML dataElements(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class DataElementsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements
    {
        private static final long serialVersionUID = 1L;
        
        public DataElementsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATAELEMENT$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElement");
        
        
        /**
         * Gets array of all "dataElement" elements
         */
        public org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement[] getDataElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DATAELEMENT$0, targetList);
                org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement[] result = new org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dataElement" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement getDataElementArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement)get_store().find_element_user(DATAELEMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dataElement" element
         */
        public int sizeOfDataElementArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATAELEMENT$0);
            }
        }
        
        /**
         * Sets array of all "dataElement" element
         */
        public void setDataElementArray(org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement[] dataElementArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dataElementArray, DATAELEMENT$0);
            }
        }
        
        /**
         * Sets ith "dataElement" element
         */
        public void setDataElementArray(int i, org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement dataElement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement)get_store().find_element_user(DATAELEMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dataElement);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dataElement" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement insertNewDataElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement)get_store().insert_element_user(DATAELEMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dataElement" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement addNewDataElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement)get_store().add_element_user(DATAELEMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "dataElement" element
         */
        public void removeDataElement(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATAELEMENT$0, i);
            }
        }
    }
}
