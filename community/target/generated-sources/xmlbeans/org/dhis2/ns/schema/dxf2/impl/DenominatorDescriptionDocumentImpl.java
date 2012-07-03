/*
 * An XML document type.
 * Localname: denominatorDescription
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DenominatorDescriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one denominatorDescription(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DenominatorDescriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DenominatorDescriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DenominatorDescriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DENOMINATORDESCRIPTION$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "denominatorDescription");
    
    
    /**
     * Gets the "denominatorDescription" element
     */
    public java.lang.String getDenominatorDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINATORDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "denominatorDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetDenominatorDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENOMINATORDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "denominatorDescription" element
     */
    public void setDenominatorDescription(java.lang.String denominatorDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINATORDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DENOMINATORDESCRIPTION$0);
            }
            target.setStringValue(denominatorDescription);
        }
    }
    
    /**
     * Sets (as xml) the "denominatorDescription" element
     */
    public void xsetDenominatorDescription(org.apache.xmlbeans.XmlString denominatorDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENOMINATORDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DENOMINATORDESCRIPTION$0);
            }
            target.set(denominatorDescription);
        }
    }
}
