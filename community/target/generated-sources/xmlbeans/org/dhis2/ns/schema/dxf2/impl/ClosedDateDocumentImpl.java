/*
 * An XML document type.
 * Localname: closedDate
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ClosedDateDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one closedDate(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ClosedDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ClosedDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClosedDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEDDATE$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "closedDate");
    
    
    /**
     * Gets the "closedDate" element
     */
    public java.util.Calendar getClosedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSEDDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "closedDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetClosedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(CLOSEDDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "closedDate" element
     */
    public void setClosedDate(java.util.Calendar closedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSEDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSEDDATE$0);
            }
            target.setCalendarValue(closedDate);
        }
    }
    
    /**
     * Sets (as xml) the "closedDate" element
     */
    public void xsetClosedDate(org.apache.xmlbeans.XmlDate closedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(CLOSEDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(CLOSEDDATE$0);
            }
            target.set(closedDate);
        }
    }
}
