/*
 * An XML document type.
 * Localname: polygonCoordinates
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.PolygonCoordinatesDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one polygonCoordinates(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class PolygonCoordinatesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.PolygonCoordinatesDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolygonCoordinatesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGONCOORDINATES$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "polygonCoordinates");
    
    
    /**
     * Gets the "polygonCoordinates" element
     */
    public java.lang.String getPolygonCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLYGONCOORDINATES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "polygonCoordinates" element
     */
    public org.apache.xmlbeans.XmlString xgetPolygonCoordinates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLYGONCOORDINATES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "polygonCoordinates" element
     */
    public void setPolygonCoordinates(java.lang.String polygonCoordinates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLYGONCOORDINATES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLYGONCOORDINATES$0);
            }
            target.setStringValue(polygonCoordinates);
        }
    }
    
    /**
     * Sets (as xml) the "polygonCoordinates" element
     */
    public void xsetPolygonCoordinates(org.apache.xmlbeans.XmlString polygonCoordinates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLYGONCOORDINATES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POLYGONCOORDINATES$0);
            }
            target.set(polygonCoordinates);
        }
    }
}
