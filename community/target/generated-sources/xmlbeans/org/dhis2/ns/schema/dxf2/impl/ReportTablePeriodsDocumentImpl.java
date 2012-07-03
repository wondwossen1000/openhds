/*
 * An XML document type.
 * Localname: reportTablePeriods
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one reportTablePeriods(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ReportTablePeriodsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportTablePeriodsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTTABLEPERIODS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTablePeriods");
    
    
    /**
     * Gets the "reportTablePeriods" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods getReportTablePeriods()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods)get_store().find_element_user(REPORTTABLEPERIODS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reportTablePeriods" element
     */
    public void setReportTablePeriods(org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods reportTablePeriods)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods)get_store().find_element_user(REPORTTABLEPERIODS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods)get_store().add_element_user(REPORTTABLEPERIODS$0);
            }
            target.set(reportTablePeriods);
        }
    }
    
    /**
     * Appends and returns a new empty "reportTablePeriods" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods addNewReportTablePeriods()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods)get_store().add_element_user(REPORTTABLEPERIODS$0);
            return target;
        }
    }
    /**
     * An XML reportTablePeriods(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class ReportTablePeriodsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods
    {
        private static final long serialVersionUID = 1L;
        
        public ReportTablePeriodsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPORTTABLEPERIOD$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "ReportTablePeriod");
        
        
        /**
         * Gets array of all "ReportTablePeriod" elements
         */
        public org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod[] getReportTablePeriodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPORTTABLEPERIOD$0, targetList);
                org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod[] result = new org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ReportTablePeriod" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod getReportTablePeriodArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod)get_store().find_element_user(REPORTTABLEPERIOD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ReportTablePeriod" element
         */
        public int sizeOfReportTablePeriodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORTTABLEPERIOD$0);
            }
        }
        
        /**
         * Sets array of all "ReportTablePeriod" element
         */
        public void setReportTablePeriodArray(org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod[] reportTablePeriodArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(reportTablePeriodArray, REPORTTABLEPERIOD$0);
            }
        }
        
        /**
         * Sets ith "ReportTablePeriod" element
         */
        public void setReportTablePeriodArray(int i, org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod reportTablePeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod)get_store().find_element_user(REPORTTABLEPERIOD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(reportTablePeriod);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ReportTablePeriod" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod insertNewReportTablePeriod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod)get_store().insert_element_user(REPORTTABLEPERIOD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ReportTablePeriod" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod addNewReportTablePeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTablePeriodDocument.ReportTablePeriod)get_store().add_element_user(REPORTTABLEPERIOD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ReportTablePeriod" element
         */
        public void removeReportTablePeriod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORTTABLEPERIOD$0, i);
            }
        }
    }
}
