/*
 * An XML document type.
 * Localname: numeratorDescription
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.NumeratorDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one numeratorDescription(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class NumeratorDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.NumeratorDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public NumeratorDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMERATORDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "numeratorDescription");
    
    
    /**
     * Gets the "numeratorDescription" element
     */
    public java.lang.String getNumeratorDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERATORDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numeratorDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetNumeratorDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERATORDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "numeratorDescription" element
     */
    public void setNumeratorDescription(java.lang.String numeratorDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERATORDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERATORDESCRIPTION$0);
            }
            target.setStringValue(numeratorDescription);
        }
    }
    
    /**
     * Sets (as xml) the "numeratorDescription" element
     */
    public void xsetNumeratorDescription(org.apache.xmlbeans.XmlString numeratorDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERATORDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMERATORDESCRIPTION$0);
            }
            target.set(numeratorDescription);
        }
    }
}
