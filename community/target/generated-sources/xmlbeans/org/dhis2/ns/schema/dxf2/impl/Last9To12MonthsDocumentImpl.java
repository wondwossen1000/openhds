/*
 * An XML document type.
 * Localname: last9To12Months
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one last9To12Months(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class Last9To12MonthsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument
{
    private static final long serialVersionUID = 1L;
    
    public Last9To12MonthsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAST9TO12MONTHS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last9To12Months");
    
    
    /**
     * Gets the "last9To12Months" element
     */
    public org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months.Enum getLast9To12Months()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST9TO12MONTHS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "last9To12Months" element
     */
    public org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months xgetLast9To12Months()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months target = null;
            target = (org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months)get_store().find_element_user(LAST9TO12MONTHS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "last9To12Months" element
     */
    public void setLast9To12Months(org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months.Enum last9To12Months)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST9TO12MONTHS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST9TO12MONTHS$0);
            }
            target.setEnumValue(last9To12Months);
        }
    }
    
    /**
     * Sets (as xml) the "last9To12Months" element
     */
    public void xsetLast9To12Months(org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months last9To12Months)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months target = null;
            target = (org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months)get_store().find_element_user(LAST9TO12MONTHS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months)get_store().add_element_user(LAST9TO12MONTHS$0);
            }
            target.set(last9To12Months);
        }
    }
    /**
     * An XML last9To12Months(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument$Last9To12Months.
     */
    public static class Last9To12MonthsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months
    {
        private static final long serialVersionUID = 1L;
        
        public Last9To12MonthsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected Last9To12MonthsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
