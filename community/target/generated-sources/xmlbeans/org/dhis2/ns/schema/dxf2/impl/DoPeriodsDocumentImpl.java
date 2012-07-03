/*
 * An XML document type.
 * Localname: doPeriods
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DoPeriodsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one doPeriods(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DoPeriodsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DoPeriodsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DoPeriodsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOPERIODS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "doPeriods");
    
    
    /**
     * Gets the "doPeriods" element
     */
    public org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods.Enum getDoPeriods()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOPERIODS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "doPeriods" element
     */
    public org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods xgetDoPeriods()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods target = null;
            target = (org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods)get_store().find_element_user(DOPERIODS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "doPeriods" element
     */
    public void setDoPeriods(org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods.Enum doPeriods)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOPERIODS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOPERIODS$0);
            }
            target.setEnumValue(doPeriods);
        }
    }
    
    /**
     * Sets (as xml) the "doPeriods" element
     */
    public void xsetDoPeriods(org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods doPeriods)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods target = null;
            target = (org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods)get_store().find_element_user(DOPERIODS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods)get_store().add_element_user(DOPERIODS$0);
            }
            target.set(doPeriods);
        }
    }
    /**
     * An XML doPeriods(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.DoPeriodsDocument$DoPeriods.
     */
    public static class DoPeriodsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods
    {
        private static final long serialVersionUID = 1L;
        
        public DoPeriodsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DoPeriodsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
