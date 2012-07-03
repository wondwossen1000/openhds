/*
 * An XML document type.
 * Localname: reportTableCategoryOptionCombos
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one reportTableCategoryOptionCombos(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ReportTableCategoryOptionCombosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportTableCategoryOptionCombosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTTABLECATEGORYOPTIONCOMBOS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableCategoryOptionCombos");
    
    
    /**
     * Gets the "reportTableCategoryOptionCombos" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos getReportTableCategoryOptionCombos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos)get_store().find_element_user(REPORTTABLECATEGORYOPTIONCOMBOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reportTableCategoryOptionCombos" element
     */
    public void setReportTableCategoryOptionCombos(org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos reportTableCategoryOptionCombos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos)get_store().find_element_user(REPORTTABLECATEGORYOPTIONCOMBOS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos)get_store().add_element_user(REPORTTABLECATEGORYOPTIONCOMBOS$0);
            }
            target.set(reportTableCategoryOptionCombos);
        }
    }
    
    /**
     * Appends and returns a new empty "reportTableCategoryOptionCombos" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos addNewReportTableCategoryOptionCombos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos)get_store().add_element_user(REPORTTABLECATEGORYOPTIONCOMBOS$0);
            return target;
        }
    }
    /**
     * An XML reportTableCategoryOptionCombos(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class ReportTableCategoryOptionCombosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos
    {
        private static final long serialVersionUID = 1L;
        
        public ReportTableCategoryOptionCombosImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TODO$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "TODO");
        
        
        /**
         * Gets the "TODO" element
         */
        public java.math.BigInteger getTODO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "TODO" element
         */
        public org.apache.xmlbeans.XmlInteger xgetTODO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TODO$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "TODO" element
         */
        public boolean isSetTODO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TODO$0) != 0;
            }
        }
        
        /**
         * Sets the "TODO" element
         */
        public void setTODO(java.math.BigInteger todo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TODO$0);
                }
                target.setBigIntegerValue(todo);
            }
        }
        
        /**
         * Sets (as xml) the "TODO" element
         */
        public void xsetTODO(org.apache.xmlbeans.XmlInteger todo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TODO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TODO$0);
                }
                target.set(todo);
            }
        }
        
        /**
         * Unsets the "TODO" element
         */
        public void unsetTODO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TODO$0, 0);
            }
        }
    }
}
