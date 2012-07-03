/*
 * An XML document type.
 * Localname: reportingMonth
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ReportingMonthDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one reportingMonth(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ReportingMonthDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportingMonthDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportingMonthDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTINGMONTH$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportingMonth");
    
    
    /**
     * Gets the "reportingMonth" element
     */
    public org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth.Enum getReportingMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGMONTH$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "reportingMonth" element
     */
    public org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth xgetReportingMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth)get_store().find_element_user(REPORTINGMONTH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "reportingMonth" element
     */
    public void setReportingMonth(org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth.Enum reportingMonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGMONTH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTINGMONTH$0);
            }
            target.setEnumValue(reportingMonth);
        }
    }
    
    /**
     * Sets (as xml) the "reportingMonth" element
     */
    public void xsetReportingMonth(org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth reportingMonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth)get_store().find_element_user(REPORTINGMONTH$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth)get_store().add_element_user(REPORTINGMONTH$0);
            }
            target.set(reportingMonth);
        }
    }
    /**
     * An XML reportingMonth(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.ReportingMonthDocument$ReportingMonth.
     */
    public static class ReportingMonthImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth
    {
        private static final long serialVersionUID = 1L;
        
        public ReportingMonthImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ReportingMonthImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
