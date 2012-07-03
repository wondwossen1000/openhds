/*
 * An XML document type.
 * Localname: reportTableDataElement
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ReportTableDataElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one reportTableDataElement(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ReportTableDataElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableDataElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportTableDataElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTTABLEDATAELEMENT$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableDataElement");
    
    
    /**
     * Gets the "reportTableDataElement" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableDataElementDocument.ReportTableDataElement getReportTableDataElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableDataElementDocument.ReportTableDataElement target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableDataElementDocument.ReportTableDataElement)get_store().find_element_user(REPORTTABLEDATAELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reportTableDataElement" element
     */
    public void setReportTableDataElement(org.dhis2.ns.schema.dxf2.ReportTableDataElementDocument.ReportTableDataElement reportTableDataElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableDataElementDocument.ReportTableDataElement target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableDataElementDocument.ReportTableDataElement)get_store().find_element_user(REPORTTABLEDATAELEMENT$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ReportTableDataElementDocument.ReportTableDataElement)get_store().add_element_user(REPORTTABLEDATAELEMENT$0);
            }
            target.set(reportTableDataElement);
        }
    }
    
    /**
     * Appends and returns a new empty "reportTableDataElement" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableDataElementDocument.ReportTableDataElement addNewReportTableDataElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableDataElementDocument.ReportTableDataElement target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableDataElementDocument.ReportTableDataElement)get_store().add_element_user(REPORTTABLEDATAELEMENT$0);
            return target;
        }
    }
    /**
     * An XML reportTableDataElement(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class ReportTableDataElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableDataElementDocument.ReportTableDataElement
    {
        private static final long serialVersionUID = 1L;
        
        public ReportTableDataElementImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPORTTABLEREF$0 = 
            new javax.xml.namespace.QName("", "reportTableRef");
        private static final javax.xml.namespace.QName DATAELEMENTREF$2 = 
            new javax.xml.namespace.QName("", "dataElementRef");
        private static final javax.xml.namespace.QName SORTORDER$4 = 
            new javax.xml.namespace.QName("", "sortOrder");
        
        
        /**
         * Gets the "reportTableRef" attribute
         */
        public int getReportTableRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTTABLEREF$0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "reportTableRef" attribute
         */
        public org.dhis2.ns.schema.dxf2.DxfIDRef xgetReportTableRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(REPORTTABLEREF$0);
                return target;
            }
        }
        
        /**
         * Sets the "reportTableRef" attribute
         */
        public void setReportTableRef(int reportTableRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPORTTABLEREF$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPORTTABLEREF$0);
                }
                target.setIntValue(reportTableRef);
            }
        }
        
        /**
         * Sets (as xml) the "reportTableRef" attribute
         */
        public void xsetReportTableRef(org.dhis2.ns.schema.dxf2.DxfIDRef reportTableRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(REPORTTABLEREF$0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().add_attribute_user(REPORTTABLEREF$0);
                }
                target.set(reportTableRef);
            }
        }
        
        /**
         * Gets the "dataElementRef" attribute
         */
        public int getDataElementRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAELEMENTREF$2);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "dataElementRef" attribute
         */
        public org.dhis2.ns.schema.dxf2.DxfIDRef xgetDataElementRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(DATAELEMENTREF$2);
                return target;
            }
        }
        
        /**
         * Sets the "dataElementRef" attribute
         */
        public void setDataElementRef(int dataElementRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAELEMENTREF$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAELEMENTREF$2);
                }
                target.setIntValue(dataElementRef);
            }
        }
        
        /**
         * Sets (as xml) the "dataElementRef" attribute
         */
        public void xsetDataElementRef(org.dhis2.ns.schema.dxf2.DxfIDRef dataElementRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(DATAELEMENTREF$2);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().add_attribute_user(DATAELEMENTREF$2);
                }
                target.set(dataElementRef);
            }
        }
        
        /**
         * Gets the "sortOrder" attribute
         */
        public java.math.BigInteger getSortOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$4);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "sortOrder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$4);
                return target;
            }
        }
        
        /**
         * Sets the "sortOrder" attribute
         */
        public void setSortOrder(java.math.BigInteger sortOrder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$4);
                }
                target.setBigIntegerValue(sortOrder);
            }
        }
        
        /**
         * Sets (as xml) the "sortOrder" attribute
         */
        public void xsetSortOrder(org.apache.xmlbeans.XmlInteger sortOrder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$4);
                }
                target.set(sortOrder);
            }
        }
    }
}
