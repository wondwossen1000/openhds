/*
 * An XML document type.
 * Localname: soFarThisFinancialYear
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one soFarThisFinancialYear(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class SoFarThisFinancialYearDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument
{
    private static final long serialVersionUID = 1L;
    
    public SoFarThisFinancialYearDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOFARTHISFINANCIALYEAR$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "soFarThisFinancialYear");
    
    
    /**
     * Gets the "soFarThisFinancialYear" element
     */
    public org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear.Enum getSoFarThisFinancialYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFARTHISFINANCIALYEAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "soFarThisFinancialYear" element
     */
    public org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear xgetSoFarThisFinancialYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear target = null;
            target = (org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear)get_store().find_element_user(SOFARTHISFINANCIALYEAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "soFarThisFinancialYear" element
     */
    public void setSoFarThisFinancialYear(org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear.Enum soFarThisFinancialYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFARTHISFINANCIALYEAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOFARTHISFINANCIALYEAR$0);
            }
            target.setEnumValue(soFarThisFinancialYear);
        }
    }
    
    /**
     * Sets (as xml) the "soFarThisFinancialYear" element
     */
    public void xsetSoFarThisFinancialYear(org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear soFarThisFinancialYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear target = null;
            target = (org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear)get_store().find_element_user(SOFARTHISFINANCIALYEAR$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear)get_store().add_element_user(SOFARTHISFINANCIALYEAR$0);
            }
            target.set(soFarThisFinancialYear);
        }
    }
    /**
     * An XML soFarThisFinancialYear(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument$SoFarThisFinancialYear.
     */
    public static class SoFarThisFinancialYearImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear
    {
        private static final long serialVersionUID = 1L;
        
        public SoFarThisFinancialYearImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SoFarThisFinancialYearImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
