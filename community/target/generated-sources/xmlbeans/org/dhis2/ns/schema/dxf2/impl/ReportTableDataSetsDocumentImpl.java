/*
 * An XML document type.
 * Localname: reportTableDataSets
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one reportTableDataSets(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ReportTableDataSetsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportTableDataSetsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTTABLEDATASETS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableDataSets");
    
    
    /**
     * Gets the "reportTableDataSets" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets getReportTableDataSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets)get_store().find_element_user(REPORTTABLEDATASETS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reportTableDataSets" element
     */
    public void setReportTableDataSets(org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets reportTableDataSets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets)get_store().find_element_user(REPORTTABLEDATASETS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets)get_store().add_element_user(REPORTTABLEDATASETS$0);
            }
            target.set(reportTableDataSets);
        }
    }
    
    /**
     * Appends and returns a new empty "reportTableDataSets" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets addNewReportTableDataSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets)get_store().add_element_user(REPORTTABLEDATASETS$0);
            return target;
        }
    }
    /**
     * An XML reportTableDataSets(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class ReportTableDataSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets
    {
        private static final long serialVersionUID = 1L;
        
        public ReportTableDataSetsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPORTTABLEDATASET$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableDataSet");
        
        
        /**
         * Gets array of all "reportTableDataSet" elements
         */
        public org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet[] getReportTableDataSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPORTTABLEDATASET$0, targetList);
                org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet[] result = new org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "reportTableDataSet" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet getReportTableDataSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet)get_store().find_element_user(REPORTTABLEDATASET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "reportTableDataSet" element
         */
        public int sizeOfReportTableDataSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORTTABLEDATASET$0);
            }
        }
        
        /**
         * Sets array of all "reportTableDataSet" element
         */
        public void setReportTableDataSetArray(org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet[] reportTableDataSetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(reportTableDataSetArray, REPORTTABLEDATASET$0);
            }
        }
        
        /**
         * Sets ith "reportTableDataSet" element
         */
        public void setReportTableDataSetArray(int i, org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet reportTableDataSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet)get_store().find_element_user(REPORTTABLEDATASET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(reportTableDataSet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "reportTableDataSet" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet insertNewReportTableDataSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetDocument.ReportTableDataSet)get_store().insert_element_user(REPORTTABLEDATASET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "reportTableDataSet" element
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
         * Removes the ith "reportTableDataSet" element
         */
        public void removeReportTableDataSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORTTABLEDATASET$0, i);
            }
        }
    }
}
