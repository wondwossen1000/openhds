/*
 * An XML document type.
 * Localname: shortName
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ShortNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one shortName(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ShortNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ShortNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShortNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHORTNAME$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "shortName");
    
    
    /**
     * Gets the "shortName" element
     */
    public java.lang.String getShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "shortName" element
     */
    public org.apache.xmlbeans.XmlString xgetShortName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHORTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "shortName" element
     */
    public void setShortName(java.lang.String shortName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHORTNAME$0);
            }
            target.setStringValue(shortName);
        }
    }
    
    /**
     * Sets (as xml) the "shortName" element
     */
    public void xsetShortName(org.apache.xmlbeans.XmlString shortName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHORTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHORTNAME$0);
            }
            target.set(shortName);
        }
    }
}
