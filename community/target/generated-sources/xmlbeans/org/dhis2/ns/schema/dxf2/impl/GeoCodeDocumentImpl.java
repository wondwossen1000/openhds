/*
 * An XML document type.
 * Localname: geoCode
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.GeoCodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one geoCode(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class GeoCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.GeoCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeoCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOCODE$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "geoCode");
    
    
    /**
     * Gets the "geoCode" element
     */
    public java.lang.String getGeoCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "geoCode" element
     */
    public org.apache.xmlbeans.XmlString xgetGeoCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOCODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "geoCode" element
     */
    public void setGeoCode(java.lang.String geoCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GEOCODE$0);
            }
            target.setStringValue(geoCode);
        }
    }
    
    /**
     * Sets (as xml) the "geoCode" element
     */
    public void xsetGeoCode(org.apache.xmlbeans.XmlString geoCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GEOCODE$0);
            }
            target.set(geoCode);
        }
    }
}
