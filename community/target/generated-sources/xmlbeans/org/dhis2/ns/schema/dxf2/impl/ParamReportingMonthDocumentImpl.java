/*
 * An XML document type.
 * Localname: paramReportingMonth
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one paramReportingMonth(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ParamReportingMonthDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParamReportingMonthDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMREPORTINGMONTH$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "paramReportingMonth");
    
    
    /**
     * Gets the "paramReportingMonth" element
     */
    public org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth.Enum getParamReportingMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMREPORTINGMONTH$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "paramReportingMonth" element
     */
    public org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth xgetParamReportingMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth target = null;
            target = (org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth)get_store().find_element_user(PARAMREPORTINGMONTH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "paramReportingMonth" element
     */
    public void setParamReportingMonth(org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth.Enum paramReportingMonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMREPORTINGMONTH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMREPORTINGMONTH$0);
            }
            target.setEnumValue(paramReportingMonth);
        }
    }
    
    /**
     * Sets (as xml) the "paramReportingMonth" element
     */
    public void xsetParamReportingMonth(org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth paramReportingMonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth target = null;
            target = (org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth)get_store().find_element_user(PARAMREPORTINGMONTH$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth)get_store().add_element_user(PARAMREPORTINGMONTH$0);
            }
            target.set(paramReportingMonth);
        }
    }
    /**
     * An XML paramReportingMonth(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument$ParamReportingMonth.
     */
    public static class ParamReportingMonthImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth
    {
        private static final long serialVersionUID = 1L;
        
        public ParamReportingMonthImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ParamReportingMonthImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
