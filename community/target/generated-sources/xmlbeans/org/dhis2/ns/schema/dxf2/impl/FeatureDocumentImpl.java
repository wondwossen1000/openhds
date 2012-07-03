/*
 * An XML document type.
 * Localname: feature
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.FeatureDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one feature(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class FeatureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.FeatureDocument
{
    private static final long serialVersionUID = 1L;
    
    public FeatureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATURE$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "feature");
    
    
    /**
     * Gets the "feature" element
     */
    public java.lang.String getFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "feature" element
     */
    public org.apache.xmlbeans.XmlString xgetFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FEATURE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "feature" element
     */
    public void setFeature(java.lang.String feature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEATURE$0);
            }
            target.setStringValue(feature);
        }
    }
    
    /**
     * Sets (as xml) the "feature" element
     */
    public void xsetFeature(org.apache.xmlbeans.XmlString feature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FEATURE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FEATURE$0);
            }
            target.set(feature);
        }
    }
}
