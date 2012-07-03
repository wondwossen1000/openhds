/*
 * An XML document type.
 * Localname: last12IndividualMonths
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one last12IndividualMonths(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class Last12IndividualMonthsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument
{
    private static final long serialVersionUID = 1L;
    
    public Last12IndividualMonthsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAST12INDIVIDUALMONTHS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last12IndividualMonths");
    
    
    /**
     * Gets the "last12IndividualMonths" element
     */
    public org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths.Enum getLast12IndividualMonths()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST12INDIVIDUALMONTHS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "last12IndividualMonths" element
     */
    public org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths xgetLast12IndividualMonths()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths target = null;
            target = (org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths)get_store().find_element_user(LAST12INDIVIDUALMONTHS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "last12IndividualMonths" element
     */
    public void setLast12IndividualMonths(org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths.Enum last12IndividualMonths)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST12INDIVIDUALMONTHS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST12INDIVIDUALMONTHS$0);
            }
            target.setEnumValue(last12IndividualMonths);
        }
    }
    
    /**
     * Sets (as xml) the "last12IndividualMonths" element
     */
    public void xsetLast12IndividualMonths(org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths last12IndividualMonths)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths target = null;
            target = (org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths)get_store().find_element_user(LAST12INDIVIDUALMONTHS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths)get_store().add_element_user(LAST12INDIVIDUALMONTHS$0);
            }
            target.set(last12IndividualMonths);
        }
    }
    /**
     * An XML last12IndividualMonths(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument$Last12IndividualMonths.
     */
    public static class Last12IndividualMonthsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths
    {
        private static final long serialVersionUID = 1L;
        
        public Last12IndividualMonthsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected Last12IndividualMonthsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
