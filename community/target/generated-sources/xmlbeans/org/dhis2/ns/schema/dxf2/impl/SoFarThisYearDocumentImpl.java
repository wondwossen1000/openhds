/*
 * An XML document type.
 * Localname: soFarThisYear
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.SoFarThisYearDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one soFarThisYear(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class SoFarThisYearDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.SoFarThisYearDocument
{
    private static final long serialVersionUID = 1L;
    
    public SoFarThisYearDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOFARTHISYEAR$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "soFarThisYear");
    
    
    /**
     * Gets the "soFarThisYear" element
     */
    public org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear.Enum getSoFarThisYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFARTHISYEAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "soFarThisYear" element
     */
    public org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear xgetSoFarThisYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear target = null;
            target = (org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear)get_store().find_element_user(SOFARTHISYEAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "soFarThisYear" element
     */
    public void setSoFarThisYear(org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear.Enum soFarThisYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFARTHISYEAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOFARTHISYEAR$0);
            }
            target.setEnumValue(soFarThisYear);
        }
    }
    
    /**
     * Sets (as xml) the "soFarThisYear" element
     */
    public void xsetSoFarThisYear(org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear soFarThisYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear target = null;
            target = (org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear)get_store().find_element_user(SOFARTHISYEAR$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear)get_store().add_element_user(SOFARTHISYEAR$0);
            }
            target.set(soFarThisYear);
        }
    }
    /**
     * An XML soFarThisYear(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.SoFarThisYearDocument$SoFarThisYear.
     */
    public static class SoFarThisYearImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear
    {
        private static final long serialVersionUID = 1L;
        
        public SoFarThisYearImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SoFarThisYearImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
