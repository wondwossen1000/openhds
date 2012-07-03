/*
 * An XML document type.
 * Localname: dataElementRef
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataElementRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dataElementRef(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataElementRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataElementRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataElementRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAELEMENTREF$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElementRef");
    
    
    /**
     * Gets the "dataElementRef" element
     */
    public org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef getDataElementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef)get_store().find_element_user(DATAELEMENTREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataElementRef" element
     */
    public void setDataElementRef(org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef dataElementRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef)get_store().find_element_user(DATAELEMENTREF$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef)get_store().add_element_user(DATAELEMENTREF$0);
            }
            target.set(dataElementRef);
        }
    }
    
    /**
     * Appends and returns a new empty "dataElementRef" element
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
     * An XML dataElementRef(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class DataElementRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef
    {
        private static final long serialVersionUID = 1L;
        
        public DataElementRefImpl(org.apache.xmlbeans.SchemaType sType)
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
