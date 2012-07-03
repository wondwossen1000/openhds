/*
 * An XML document type.
 * Localname: alternativeName
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.AlternativeNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one alternativeName(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class AlternativeNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.AlternativeNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public AlternativeNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTERNATIVENAME$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "alternativeName");
    
    
    /**
     * Gets the "alternativeName" element
     */
    public java.lang.String getAlternativeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERNATIVENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "alternativeName" element
     */
    public org.apache.xmlbeans.XmlString xgetAlternativeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTERNATIVENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "alternativeName" element
     */
    public void setAlternativeName(java.lang.String alternativeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERNATIVENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTERNATIVENAME$0);
            }
            target.setStringValue(alternativeName);
        }
    }
    
    /**
     * Sets (as xml) the "alternativeName" element
     */
    public void xsetAlternativeName(org.apache.xmlbeans.XmlString alternativeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTERNATIVENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALTERNATIVENAME$0);
            }
            target.set(alternativeName);
        }
    }
}
