/*
 * An XML document type.
 * Localname: last9Months
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.Last9MonthsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one last9Months(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class Last9MonthsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.Last9MonthsDocument
{
    private static final long serialVersionUID = 1L;
    
    public Last9MonthsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAST9MONTHS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last9Months");
    
    
    /**
     * Gets the "last9Months" element
     */
    public org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months.Enum getLast9Months()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST9MONTHS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "last9Months" element
     */
    public org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months xgetLast9Months()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months target = null;
            target = (org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months)get_store().find_element_user(LAST9MONTHS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "last9Months" element
     */
    public void setLast9Months(org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months.Enum last9Months)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST9MONTHS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST9MONTHS$0);
            }
            target.setEnumValue(last9Months);
        }
    }
    
    /**
     * Sets (as xml) the "last9Months" element
     */
    public void xsetLast9Months(org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months last9Months)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months target = null;
            target = (org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months)get_store().find_element_user(LAST9MONTHS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months)get_store().add_element_user(LAST9MONTHS$0);
            }
            target.set(last9Months);
        }
    }
    /**
     * An XML last9Months(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.Last9MonthsDocument$Last9Months.
     */
    public static class Last9MonthsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months
    {
        private static final long serialVersionUID = 1L;
        
        public Last9MonthsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected Last9MonthsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
