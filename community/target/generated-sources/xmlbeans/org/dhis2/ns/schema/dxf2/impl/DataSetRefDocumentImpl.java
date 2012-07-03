/*
 * An XML document type.
 * Localname: dataSetRef
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataSetRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dataSetRef(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataSetRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataSetRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataSetRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASETREF$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataSetRef");
    
    
    /**
     * Gets the "dataSetRef" element
     */
    public org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef getDataSetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef target = null;
            target = (org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef)get_store().find_element_user(DATASETREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataSetRef" element
     */
    public void setDataSetRef(org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef dataSetRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef target = null;
            target = (org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef)get_store().find_element_user(DATASETREF$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef)get_store().add_element_user(DATASETREF$0);
            }
            target.set(dataSetRef);
        }
    }
    
    /**
     * Appends and returns a new empty "dataSetRef" element
     */
    public org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef addNewDataSetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef target = null;
            target = (org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef)get_store().add_element_user(DATASETREF$0);
            return target;
        }
    }
    /**
     * An XML dataSetRef(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class DataSetRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef
    {
        private static final long serialVersionUID = 1L;
        
        public DataSetRefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REF$0 = 
            new javax.xml.namespace.QName("", "ref");
        
        
        /**
         * Gets the "ref" attribute
         */
        public int getRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "ref" attribute
         */
        public org.dhis2.ns.schema.dxf2.DxfIDRef xgetRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(REF$0);
                return target;
            }
        }
        
        /**
         * Sets the "ref" attribute
         */
        public void setRef(int ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$0);
                }
                target.setIntValue(ref);
            }
        }
        
        /**
         * Sets (as xml) the "ref" attribute
         */
        public void xsetRef(org.dhis2.ns.schema.dxf2.DxfIDRef ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(REF$0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().add_attribute_user(REF$0);
                }
                target.set(ref);
            }
        }
    }
}
