/*
 * An XML document type.
 * Localname: mode
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ModeDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one mode(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ModeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ModeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ModeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODE$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "mode");
    
    
    /**
     * Gets the "mode" element
     */
    public java.lang.String getMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mode" element
     */
    public org.apache.xmlbeans.XmlString xgetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mode" element
     */
    public void setMode(java.lang.String mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODE$0);
            }
            target.setStringValue(mode);
        }
    }
    
    /**
     * Sets (as xml) the "mode" element
     */
    public void xsetMode(org.apache.xmlbeans.XmlString mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MODE$0);
            }
            target.set(mode);
        }
    }
}
