/*
 * An XML document type.
 * Localname: numerator
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.NumeratorDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one numerator(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class NumeratorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.NumeratorDocument
{
    private static final long serialVersionUID = 1L;
    
    public NumeratorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMERATOR$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "numerator");
    
    
    /**
     * Gets the "numerator" element
     */
    public java.lang.String getNumerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numerator" element
     */
    public org.apache.xmlbeans.XmlString xgetNumerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "numerator" element
     */
    public void setNumerator(java.lang.String numerator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERATOR$0);
            }
            target.setStringValue(numerator);
        }
    }
    
    /**
     * Sets (as xml) the "numerator" element
     */
    public void xsetNumerator(org.apache.xmlbeans.XmlString numerator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMERATOR$0);
            }
            target.set(numerator);
        }
    }
}
