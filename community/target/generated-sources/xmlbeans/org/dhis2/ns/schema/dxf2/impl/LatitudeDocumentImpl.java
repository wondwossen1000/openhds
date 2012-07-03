/*
 * An XML document type.
 * Localname: latitude
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.LatitudeDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one latitude(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class LatitudeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.LatitudeDocument
{
    private static final long serialVersionUID = 1L;
    
    public LatitudeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATITUDE$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "latitude");
    
    
    /**
     * Gets the "latitude" element
     */
    public java.lang.String getLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "latitude" element
     */
    public org.apache.xmlbeans.XmlString xgetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATITUDE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "latitude" element
     */
    public void setLatitude(java.lang.String latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$0);
            }
            target.setStringValue(latitude);
        }
    }
    
    /**
     * Sets (as xml) the "latitude" element
     */
    public void xsetLatitude(org.apache.xmlbeans.XmlString latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATITUDE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LATITUDE$0);
            }
            target.set(latitude);
        }
    }
}
