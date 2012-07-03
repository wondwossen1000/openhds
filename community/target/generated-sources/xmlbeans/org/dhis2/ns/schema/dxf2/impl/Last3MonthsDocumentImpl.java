/*
 * An XML document type.
 * Localname: last3Months
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.Last3MonthsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one last3Months(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class Last3MonthsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.Last3MonthsDocument
{
    private static final long serialVersionUID = 1L;
    
    public Last3MonthsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAST3MONTHS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last3Months");
    
    
    /**
     * Gets the "last3Months" element
     */
    public org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months.Enum getLast3Months()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST3MONTHS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "last3Months" element
     */
    public org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months xgetLast3Months()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months target = null;
            target = (org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months)get_store().find_element_user(LAST3MONTHS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "last3Months" element
     */
    public void setLast3Months(org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months.Enum last3Months)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST3MONTHS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST3MONTHS$0);
            }
            target.setEnumValue(last3Months);
        }
    }
    
    /**
     * Sets (as xml) the "last3Months" element
     */
    public void xsetLast3Months(org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months last3Months)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months target = null;
            target = (org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months)get_store().find_element_user(LAST3MONTHS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months)get_store().add_element_user(LAST3MONTHS$0);
            }
            target.set(last3Months);
        }
    }
    /**
     * An XML last3Months(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.Last3MonthsDocument$Last3Months.
     */
    public static class Last3MonthsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months
    {
        private static final long serialVersionUID = 1L;
        
        public Last3MonthsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected Last3MonthsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
