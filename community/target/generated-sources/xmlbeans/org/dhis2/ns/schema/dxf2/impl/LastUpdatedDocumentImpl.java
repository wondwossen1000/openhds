/*
 * An XML document type.
 * Localname: lastUpdated
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.LastUpdatedDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one lastUpdated(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class LastUpdatedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.LastUpdatedDocument
{
    private static final long serialVersionUID = 1L;
    
    public LastUpdatedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LASTUPDATED$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "lastUpdated");
    
    
    /**
     * Gets the "lastUpdated" element
     */
    public java.util.Calendar getLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastUpdated" element
     */
    public org.apache.xmlbeans.XmlDate xgetLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(LASTUPDATED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "lastUpdated" element
     */
    public void setLastUpdated(java.util.Calendar lastUpdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTUPDATED$0);
            }
            target.setCalendarValue(lastUpdated);
        }
    }
    
    /**
     * Sets (as xml) the "lastUpdated" element
     */
    public void xsetLastUpdated(org.apache.xmlbeans.XmlDate lastUpdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(LASTUPDATED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(LASTUPDATED$0);
            }
            target.set(lastUpdated);
        }
    }
}
