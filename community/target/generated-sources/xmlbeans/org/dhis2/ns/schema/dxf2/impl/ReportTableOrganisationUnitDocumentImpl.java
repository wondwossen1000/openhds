/*
 * An XML document type.
 * Localname: reportTableOrganisationUnit
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one reportTableOrganisationUnit(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ReportTableOrganisationUnitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportTableOrganisationUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTTABLEORGANISATIONUNIT$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableOrganisationUnit");
    
    
    /**
     * Gets the "reportTableOrganisationUnit" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit getReportTableOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit)get_store().find_element_user(REPORTTABLEORGANISATIONUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reportTableOrganisationUnit" element
     */
    public void setReportTableOrganisationUnit(org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit reportTableOrganisationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit)get_store().find_element_user(REPORTTABLEORGANISATIONUNIT$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit)get_store().add_element_user(REPORTTABLEORGANISATIONUNIT$0);
            }
            target.set(reportTableOrganisationUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "reportTableOrganisationUnit" element
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
     * An XML reportTableOrganisationUnit(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class ReportTableOrganisationUnitImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitDocument.ReportTableOrganisationUnit
    {
        private static final long serialVersionUID = 1L;
        
        public ReportTableOrganisationUnitImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPORTTABLE$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTable");
        private static final javax.xml.namespace.QName ORGANISATIONUNIT$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnit");
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
         * Gets the "organisationUnit" element
         */
        public java.math.BigInteger getOrganisationUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONUNIT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "organisationUnit" element
         */
        public org.apache.xmlbeans.XmlInteger xgetOrganisationUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ORGANISATIONUNIT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "organisationUnit" element
         */
        public void setOrganisationUnit(java.math.BigInteger organisationUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANISATIONUNIT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANISATIONUNIT$2);
                }
                target.setBigIntegerValue(organisationUnit);
            }
        }
        
        /**
         * Sets (as xml) the "organisationUnit" element
         */
        public void xsetOrganisationUnit(org.apache.xmlbeans.XmlInteger organisationUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(ORGANISATIONUNIT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(ORGANISATIONUNIT$2);
                }
                target.set(organisationUnit);
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
