/*
 * An XML document type.
 * Localname: reportTableIndicator
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one reportTableIndicator(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ReportTableIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportTableIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTTABLEINDICATOR$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableIndicator");
    
    
    /**
     * Gets the "reportTableIndicator" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator getReportTableIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator)get_store().find_element_user(REPORTTABLEINDICATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reportTableIndicator" element
     */
    public void setReportTableIndicator(org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator reportTableIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator)get_store().find_element_user(REPORTTABLEINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator)get_store().add_element_user(REPORTTABLEINDICATOR$0);
            }
            target.set(reportTableIndicator);
        }
    }
    
    /**
     * Appends and returns a new empty "reportTableIndicator" element
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
     * An XML reportTableIndicator(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class ReportTableIndicatorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator
    {
        private static final long serialVersionUID = 1L;
        
        public ReportTableIndicatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPORTTABLE$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTable");
        private static final javax.xml.namespace.QName INDICATOR$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicator");
        private static final javax.xml.namespace.QName SORTORDER$4 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "sortOrder");
        
        
        /**
         * Gets the "reportTable" element
         */
        public java.math.BigInteger getReportTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTTABLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "reportTable" element
         */
        public org.apache.xmlbeans.XmlInteger xgetReportTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(REPORTTABLE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "reportTable" element
         */
        public void setReportTable(java.math.BigInteger reportTable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTTABLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTTABLE$0);
                }
                target.setBigIntegerValue(reportTable);
            }
        }
        
        /**
         * Sets (as xml) the "reportTable" element
         */
        public void xsetReportTable(org.apache.xmlbeans.XmlInteger reportTable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(REPORTTABLE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(REPORTTABLE$0);
                }
                target.set(reportTable);
            }
        }
        
        /**
         * Gets the "indicator" element
         */
        public java.math.BigInteger getIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDICATOR$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "indicator" element
         */
        public org.apache.xmlbeans.XmlInteger xgetIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INDICATOR$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "indicator" element
         */
        public void setIndicator(java.math.BigInteger indicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDICATOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDICATOR$2);
                }
                target.setBigIntegerValue(indicator);
            }
        }
        
        /**
         * Sets (as xml) the "indicator" element
         */
        public void xsetIndicator(org.apache.xmlbeans.XmlInteger indicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(INDICATOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(INDICATOR$2);
                }
                target.set(indicator);
            }
        }
        
        /**
         * Gets the "sortOrder" element
         */
        public java.math.BigInteger getSortOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SORTORDER$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "sortOrder" element
         */
        public org.apache.xmlbeans.XmlInteger xgetSortOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SORTORDER$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sortOrder" element
         */
        public void setSortOrder(java.math.BigInteger sortOrder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SORTORDER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SORTORDER$4);
                }
                target.setBigIntegerValue(sortOrder);
            }
        }
        
        /**
         * Sets (as xml) the "sortOrder" element
         */
        public void xsetSortOrder(org.apache.xmlbeans.XmlInteger sortOrder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SORTORDER$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SORTORDER$4);
                }
                target.set(sortOrder);
            }
        }
    }
}
