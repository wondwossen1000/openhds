/*
 * An XML document type.
 * Localname: denominator
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DenominatorDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one denominator(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DenominatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DenominatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public DenominatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DENOMINATOR$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "denominator");
    
    
    /**
     * Gets the "denominator" element
     */
    public java.lang.String getDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "denominator" element
     */
    public org.apache.xmlbeans.XmlString xgetDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENOMINATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "denominator" element
     */
    public void setDenominator(java.lang.String denominator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DENOMINATOR$0);
            }
            target.setStringValue(denominator);
        }
    }
    
    /**
     * Sets (as xml) the "denominator" element
     */
    public void xsetDenominator(org.apache.xmlbeans.XmlString denominator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENOMINATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DENOMINATOR$0);
            }
            target.set(denominator);
        }
    }
}
