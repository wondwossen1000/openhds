/*
 * An XML document type.
 * Localname: last6To9Months
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one last6To9Months(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class Last6To9MonthsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument
{
    private static final long serialVersionUID = 1L;
    
    public Last6To9MonthsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAST6TO9MONTHS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last6To9Months");
    
    
    /**
     * Gets the "last6To9Months" element
     */
    public org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months.Enum getLast6To9Months()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST6TO9MONTHS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "last6To9Months" element
     */
    public org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months xgetLast6To9Months()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months target = null;
            target = (org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months)get_store().find_element_user(LAST6TO9MONTHS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "last6To9Months" element
     */
    public void setLast6To9Months(org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months.Enum last6To9Months)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST6TO9MONTHS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST6TO9MONTHS$0);
            }
            target.setEnumValue(last6To9Months);
        }
    }
    
    /**
     * Sets (as xml) the "last6To9Months" element
     */
    public void xsetLast6To9Months(org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months last6To9Months)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months target = null;
            target = (org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months)get_store().find_element_user(LAST6TO9MONTHS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months)get_store().add_element_user(LAST6TO9MONTHS$0);
            }
            target.set(last6To9Months);
        }
    }
    /**
     * An XML last6To9Months(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument$Last6To9Months.
     */
    public static class Last6To9MonthsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months
    {
        private static final long serialVersionUID = 1L;
        
        public Last6To9MonthsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected Last6To9MonthsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
