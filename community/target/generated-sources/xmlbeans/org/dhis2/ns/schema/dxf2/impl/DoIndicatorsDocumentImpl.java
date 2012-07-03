/*
 * An XML document type.
 * Localname: doIndicators
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DoIndicatorsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one doIndicators(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DoIndicatorsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DoIndicatorsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DoIndicatorsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOINDICATORS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "doIndicators");
    
    
    /**
     * Gets the "doIndicators" element
     */
    public org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators.Enum getDoIndicators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOINDICATORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "doIndicators" element
     */
    public org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators xgetDoIndicators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators target = null;
            target = (org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators)get_store().find_element_user(DOINDICATORS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "doIndicators" element
     */
    public void setDoIndicators(org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators.Enum doIndicators)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOINDICATORS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOINDICATORS$0);
            }
            target.setEnumValue(doIndicators);
        }
    }
    
    /**
     * Sets (as xml) the "doIndicators" element
     */
    public void xsetDoIndicators(org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators doIndicators)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators target = null;
            target = (org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators)get_store().find_element_user(DOINDICATORS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators)get_store().add_element_user(DOINDICATORS$0);
            }
            target.set(doIndicators);
        }
    }
    /**
     * An XML doIndicators(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.DoIndicatorsDocument$DoIndicators.
     */
    public static class DoIndicatorsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators
    {
        private static final long serialVersionUID = 1L;
        
        public DoIndicatorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DoIndicatorsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
