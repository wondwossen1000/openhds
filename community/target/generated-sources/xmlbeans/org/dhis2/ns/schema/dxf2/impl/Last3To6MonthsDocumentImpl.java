/*
 * An XML document type.
 * Localname: last3To6Months
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one last3To6Months(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class Last3To6MonthsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument
{
    private static final long serialVersionUID = 1L;
    
    public Last3To6MonthsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAST3TO6MONTHS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last3To6Months");
    
    
    /**
     * Gets the "last3To6Months" element
     */
    public org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months.Enum getLast3To6Months()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST3TO6MONTHS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "last3To6Months" element
     */
    public org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months xgetLast3To6Months()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months target = null;
            target = (org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months)get_store().find_element_user(LAST3TO6MONTHS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "last3To6Months" element
     */
    public void setLast3To6Months(org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months.Enum last3To6Months)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST3TO6MONTHS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST3TO6MONTHS$0);
            }
            target.setEnumValue(last3To6Months);
        }
    }
    
    /**
     * Sets (as xml) the "last3To6Months" element
     */
    public void xsetLast3To6Months(org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months last3To6Months)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months target = null;
            target = (org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months)get_store().find_element_user(LAST3TO6MONTHS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months)get_store().add_element_user(LAST3TO6MONTHS$0);
            }
            target.set(last3To6Months);
        }
    }
    /**
     * An XML last3To6Months(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument$Last3To6Months.
     */
    public static class Last3To6MonthsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months
    {
        private static final long serialVersionUID = 1L;
        
        public Last3To6MonthsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected Last3To6MonthsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
