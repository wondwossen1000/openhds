/*
 * An XML document type.
 * Localname: last12Months
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.Last12MonthsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one last12Months(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class Last12MonthsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.Last12MonthsDocument
{
    private static final long serialVersionUID = 1L;
    
    public Last12MonthsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAST12MONTHS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last12Months");
    
    
    /**
     * Gets the "last12Months" element
     */
    public org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months.Enum getLast12Months()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST12MONTHS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "last12Months" element
     */
    public org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months xgetLast12Months()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months target = null;
            target = (org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months)get_store().find_element_user(LAST12MONTHS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "last12Months" element
     */
    public void setLast12Months(org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months.Enum last12Months)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST12MONTHS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST12MONTHS$0);
            }
            target.setEnumValue(last12Months);
        }
    }
    
    /**
     * Sets (as xml) the "last12Months" element
     */
    public void xsetLast12Months(org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months last12Months)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months target = null;
            target = (org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months)get_store().find_element_user(LAST12MONTHS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months)get_store().add_element_user(LAST12MONTHS$0);
            }
            target.set(last12Months);
        }
    }
    /**
     * An XML last12Months(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.Last12MonthsDocument$Last12Months.
     */
    public static class Last12MonthsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months
    {
        private static final long serialVersionUID = 1L;
        
        public Last12MonthsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected Last12MonthsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
