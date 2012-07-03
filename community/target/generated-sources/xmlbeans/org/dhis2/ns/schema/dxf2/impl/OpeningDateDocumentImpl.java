/*
 * An XML document type.
 * Localname: openingDate
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OpeningDateDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one openingDate(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class OpeningDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OpeningDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public OpeningDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPENINGDATE$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "openingDate");
    
    
    /**
     * Gets the "openingDate" element
     */
    public java.util.Calendar getOpeningDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENINGDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "openingDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetOpeningDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(OPENINGDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "openingDate" element
     */
    public void setOpeningDate(java.util.Calendar openingDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENINGDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPENINGDATE$0);
            }
            target.setCalendarValue(openingDate);
        }
    }
    
    /**
     * Sets (as xml) the "openingDate" element
     */
    public void xsetOpeningDate(org.apache.xmlbeans.XmlDate openingDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(OPENINGDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(OPENINGDATE$0);
            }
            target.set(openingDate);
        }
    }
}
