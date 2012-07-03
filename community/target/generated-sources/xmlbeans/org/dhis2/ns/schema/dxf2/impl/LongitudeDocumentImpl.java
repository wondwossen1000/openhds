/*
 * An XML document type.
 * Localname: longitude
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.LongitudeDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one longitude(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class LongitudeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.LongitudeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LongitudeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LONGITUDE$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "longitude");
    
    
    /**
     * Gets the "longitude" element
     */
    public java.lang.String getLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "longitude" element
     */
    public org.apache.xmlbeans.XmlString xgetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LONGITUDE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "longitude" element
     */
    public void setLongitude(java.lang.String longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$0);
            }
            target.setStringValue(longitude);
        }
    }
    
    /**
     * Sets (as xml) the "longitude" element
     */
    public void xsetLongitude(org.apache.xmlbeans.XmlString longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LONGITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LONGITUDE$0);
            }
            target.set(longitude);
        }
    }
}
