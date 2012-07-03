/*
 * An XML document type.
 * Localname: reportTableDataSet
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one reportTableDataSet(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ReportTableDataSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportTableDataSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTTABLEDATASET$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableDataSet");
    
    
    /**
     * Gets the "reportTableDataSet" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet getReportTableDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet)get_store().find_element_user(REPORTTABLEDATASET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reportTableDataSet" element
     */
    public void setReportTableDataSet(org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet reportTableDataSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet)get_store().find_element_user(REPORTTABLEDATASET$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet)get_store().add_element_user(REPORTTABLEDATASET$0);
            }
            target.set(reportTableDataSet);
        }
    }
    
    /**
     * Appends and returns a new empty "reportTableDataSet" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet addNewReportTableDataSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet)get_store().add_element_user(REPORTTABLEDATASET$0);
            return target;
        }
    }
    /**
     * An XML reportTableDataSet(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class ReportTableDataSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet
    {
        private static final long serialVersionUID = 1L;
        
        public ReportTableDataSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPORTTABLE$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTable");
        private static final javax.xml.namespace.QName DATASET$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataSet");
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
         * Gets the "dataSet" element
         */
        public java.math.BigInteger getDataSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASET$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "dataSet" element
         */
        public org.apache.xmlbeans.XmlInteger xgetDataSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DATASET$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dataSet" element
         */
        public void setDataSet(java.math.BigInteger dataSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASET$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASET$2);
                }
                target.setBigIntegerValue(dataSet);
            }
        }
        
        /**
         * Sets (as xml) the "dataSet" element
         */
        public void xsetDataSet(org.apache.xmlbeans.XmlInteger dataSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(DATASET$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(DATASET$2);
                }
                target.set(dataSet);
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
