/*
 * An XML document type.
 * Localname: last6Months
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.Last6MonthsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one last6Months(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class Last6MonthsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.Last6MonthsDocument
{
    private static final long serialVersionUID = 1L;
    
    public Last6MonthsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAST6MONTHS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last6Months");
    
    
    /**
     * Gets the "last6Months" element
     */
    public org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months.Enum getLast6Months()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST6MONTHS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "last6Months" element
     */
    public org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months xgetLast6Months()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months target = null;
            target = (org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months)get_store().find_element_user(LAST6MONTHS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "last6Months" element
     */
    public void setLast6Months(org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months.Enum last6Months)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST6MONTHS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST6MONTHS$0);
            }
            target.setEnumValue(last6Months);
        }
    }
    
    /**
     * Sets (as xml) the "last6Months" element
     */
    public void xsetLast6Months(org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months last6Months)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months target = null;
            target = (org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months)get_store().find_element_user(LAST6MONTHS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months)get_store().add_element_user(LAST6MONTHS$0);
            }
            target.set(last6Months);
        }
    }
    /**
     * An XML last6Months(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.Last6MonthsDocument$Last6Months.
     */
    public static class Last6MonthsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months
    {
        private static final long serialVersionUID = 1L;
        
        public Last6MonthsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected Last6MonthsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
