/*
 * An XML document type.
 * Localname: dataSetMember
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataSetMemberDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dataSetMember(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataSetMemberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataSetMemberDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataSetMemberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASETMEMBER$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataSetMember");
    
    
    /**
     * Gets the "dataSetMember" element
     */
    public org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember getDataSetMember()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember target = null;
            target = (org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember)get_store().find_element_user(DATASETMEMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataSetMember" element
     */
    public void setDataSetMember(org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember dataSetMember)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember target = null;
            target = (org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember)get_store().find_element_user(DATASETMEMBER$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember)get_store().add_element_user(DATASETMEMBER$0);
            }
            target.set(dataSetMember);
        }
    }
    
    /**
     * Appends and returns a new empty "dataSetMember" element
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
     * An XML dataSetMember(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class DataSetMemberImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataSetMemberDocument.DataSetMember
    {
        private static final long serialVersionUID = 1L;
        
        public DataSetMemberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATASET$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataSet");
        private static final javax.xml.namespace.QName DATAELEMENT$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElement");
        
        
        /**
         * Gets the "dataSet" element
         */
        public int getDataSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASET$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "dataSet" element
         */
        public org.apache.xmlbeans.XmlInt xgetDataSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATASET$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dataSet" element
         */
        public void setDataSet(int dataSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASET$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASET$0);
                }
                target.setIntValue(dataSet);
            }
        }
        
        /**
         * Sets (as xml) the "dataSet" element
         */
        public void xsetDataSet(org.apache.xmlbeans.XmlInt dataSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATASET$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATASET$0);
                }
                target.set(dataSet);
            }
        }
        
        /**
         * Gets the "dataElement" element
         */
        public int getDataElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAELEMENT$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "dataElement" element
         */
        public org.apache.xmlbeans.XmlInt xgetDataElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAELEMENT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dataElement" element
         */
        public void setDataElement(int dataElement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAELEMENT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAELEMENT$2);
                }
                target.setIntValue(dataElement);
            }
        }
        
        /**
         * Sets (as xml) the "dataElement" element
         */
        public void xsetDataElement(org.apache.xmlbeans.XmlInt dataElement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DATAELEMENT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DATAELEMENT$2);
                }
                target.set(dataElement);
            }
        }
    }
}
