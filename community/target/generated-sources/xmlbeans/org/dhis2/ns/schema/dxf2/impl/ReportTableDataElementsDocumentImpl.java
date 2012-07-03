/*
 * An XML document type.
 * Localname: reportTableDataElements
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one reportTableDataElements(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ReportTableDataElementsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportTableDataElementsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTTABLEDATAELEMENTS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableDataElements");
    
    
    /**
     * Gets the "reportTableDataElements" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements getReportTableDataElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements)get_store().find_element_user(REPORTTABLEDATAELEMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reportTableDataElements" element
     */
    public void setReportTableDataElements(org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements reportTableDataElements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements)get_store().find_element_user(REPORTTABLEDATAELEMENTS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements)get_store().add_element_user(REPORTTABLEDATAELEMENTS$0);
            }
            target.set(reportTableDataElements);
        }
    }
    
    /**
     * Appends and returns a new empty "reportTableDataElements" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements addNewReportTableDataElements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements)get_store().add_element_user(REPORTTABLEDATAELEMENTS$0);
            return target;
        }
    }
    /**
     * An XML reportTableDataElements(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class ReportTableDataElementsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements
    {
        private static final long serialVersionUID = 1L;
        
        public ReportTableDataElementsImpl(org.apache.xmlbeans.SchemaType sType)
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
    }
}
