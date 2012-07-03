/*
 * An XML document type.
 * Localname: reportTableIndicators
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one reportTableIndicators(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ReportTableIndicatorsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportTableIndicatorsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTTABLEINDICATORS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableIndicators");
    
    
    /**
     * Gets the "reportTableIndicators" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators getReportTableIndicators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators)get_store().find_element_user(REPORTTABLEINDICATORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reportTableIndicators" element
     */
    public void setReportTableIndicators(org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators reportTableIndicators)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators)get_store().find_element_user(REPORTTABLEINDICATORS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators)get_store().add_element_user(REPORTTABLEINDICATORS$0);
            }
            target.set(reportTableIndicators);
        }
    }
    
    /**
     * Appends and returns a new empty "reportTableIndicators" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators addNewReportTableIndicators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators)get_store().add_element_user(REPORTTABLEINDICATORS$0);
            return target;
        }
    }
    /**
     * An XML reportTableIndicators(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class ReportTableIndicatorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators
    {
        private static final long serialVersionUID = 1L;
        
        public ReportTableIndicatorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPORTTABLEINDICATOR$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableIndicator");
        
        
        /**
         * Gets array of all "reportTableIndicator" elements
         */
        public org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator[] getReportTableIndicatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPORTTABLEINDICATOR$0, targetList);
                org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator[] result = new org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "reportTableIndicator" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator getReportTableIndicatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator)get_store().find_element_user(REPORTTABLEINDICATOR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "reportTableIndicator" element
         */
        public int sizeOfReportTableIndicatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORTTABLEINDICATOR$0);
            }
        }
        
        /**
         * Sets array of all "reportTableIndicator" element
         */
        public void setReportTableIndicatorArray(org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator[] reportTableIndicatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(reportTableIndicatorArray, REPORTTABLEINDICATOR$0);
            }
        }
        
        /**
         * Sets ith "reportTableIndicator" element
         */
        public void setReportTableIndicatorArray(int i, org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator reportTableIndicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator)get_store().find_element_user(REPORTTABLEINDICATOR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(reportTableIndicator);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "reportTableIndicator" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator insertNewReportTableIndicator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator)get_store().insert_element_user(REPORTTABLEINDICATOR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "reportTableIndicator" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator addNewReportTableIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator)get_store().add_element_user(REPORTTABLEINDICATOR$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "reportTableIndicator" element
         */
        public void removeReportTableIndicator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORTTABLEINDICATOR$0, i);
            }
        }
    }
}
