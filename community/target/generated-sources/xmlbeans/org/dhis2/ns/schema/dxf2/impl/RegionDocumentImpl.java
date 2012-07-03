/*
 * An XML document type.
 * Localname: region
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.RegionDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one region(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class RegionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.RegionDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGION$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "region");
    
    
    /**
     * Gets the "region" element
     */
    public java.lang.String getRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "region" element
     */
    public org.apache.xmlbeans.XmlString xgetRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "region" element
     */
    public void setRegion(java.lang.String region)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGION$0);
            }
            target.setStringValue(region);
        }
    }
    
    /**
     * Sets (as xml) the "region" element
     */
    public void xsetRegion(org.apache.xmlbeans.XmlString region)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGION$0);
            }
            target.set(region);
        }
    }
}
