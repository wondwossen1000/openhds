/*
 * An XML document type.
 * Localname: indicatorRef
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.IndicatorRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one indicatorRef(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class IndicatorRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndicatorRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndicatorRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDICATORREF$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicatorRef");
    
    
    /**
     * Gets the "indicatorRef" element
     */
    public org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef getIndicatorRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef)get_store().find_element_user(INDICATORREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indicatorRef" element
     */
    public void setIndicatorRef(org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef indicatorRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef)get_store().find_element_user(INDICATORREF$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef)get_store().add_element_user(INDICATORREF$0);
            }
            target.set(indicatorRef);
        }
    }
    
    /**
     * Appends and returns a new empty "indicatorRef" element
     */
    public org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef addNewIndicatorRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef)get_store().add_element_user(INDICATORREF$0);
            return target;
        }
    }
    /**
     * An XML indicatorRef(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class IndicatorRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef
    {
        private static final long serialVersionUID = 1L;
        
        public IndicatorRefImpl(org.apache.xmlbeans.SchemaType sType)
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
