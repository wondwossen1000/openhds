/*
 * An XML document type.
 * Localname: reportTableOrganisationUnits
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one reportTableOrganisationUnits(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ReportTableOrganisationUnitsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportTableOrganisationUnitsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTTABLEORGANISATIONUNITS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableOrganisationUnits");
    
    
    /**
     * Gets the "reportTableOrganisationUnits" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits getReportTableOrganisationUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits)get_store().find_element_user(REPORTTABLEORGANISATIONUNITS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reportTableOrganisationUnits" element
     */
    public void setReportTableOrganisationUnits(org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits reportTableOrganisationUnits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits)get_store().find_element_user(REPORTTABLEORGANISATIONUNITS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits)get_store().add_element_user(REPORTTABLEORGANISATIONUNITS$0);
            }
            target.set(reportTableOrganisationUnits);
        }
    }
    
    /**
     * Appends and returns a new empty "reportTableOrganisationUnits" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits addNewReportTableOrganisationUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits)get_store().add_element_user(REPORTTABLEORGANISATIONUNITS$0);
            return target;
        }
    }
    /**
     * An XML reportTableOrganisationUnits(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class ReportTableOrganisationUnitsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits
    {
        private static final long serialVersionUID = 1L;
        
        public ReportTableOrganisationUnitsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPORTTABLEORGANISATIONUNIT$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableOrganisationUnit");
        
        
        /**
         * Gets array of all "reportTableOrganisationUnit" elements
         */
        public org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit[] getReportTableOrganisationUnitArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPORTTABLEORGANISATIONUNIT$0, targetList);
                org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit[] result = new org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "reportTableOrganisationUnit" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit getReportTableOrganisationUnitArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit)get_store().find_element_user(REPORTTABLEORGANISATIONUNIT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "reportTableOrganisationUnit" element
         */
        public int sizeOfReportTableOrganisationUnitArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORTTABLEORGANISATIONUNIT$0);
            }
        }
        
        /**
         * Sets array of all "reportTableOrganisationUnit" element
         */
        public void setReportTableOrganisationUnitArray(org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit[] reportTableOrganisationUnitArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(reportTableOrganisationUnitArray, REPORTTABLEORGANISATIONUNIT$0);
            }
        }
        
        /**
         * Sets ith "reportTableOrganisationUnit" element
         */
        public void setReportTableOrganisationUnitArray(int i, org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit reportTableOrganisationUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit)get_store().find_element_user(REPORTTABLEORGANISATIONUNIT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(reportTableOrganisationUnit);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "reportTableOrganisationUnit" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit insertNewReportTableOrganisationUnit(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit)get_store().insert_element_user(REPORTTABLEORGANISATIONUNIT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "reportTableOrganisationUnit" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit addNewReportTableOrganisationUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit)get_store().add_element_user(REPORTTABLEORGANISATIONUNIT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "reportTableOrganisationUnit" element
         */
        public void removeReportTableOrganisationUnit(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORTTABLEORGANISATIONUNIT$0, i);
            }
        }
    }
}
