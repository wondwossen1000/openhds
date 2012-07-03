/*
 * An XML document type.
 * Localname: uuid
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.UuidDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one uuid(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class UuidDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.UuidDocument
{
    private static final long serialVersionUID = 1L;
    
    public UuidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UUID$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "uuid");
    
    
    /**
     * Gets the "uuid" element
     */
    public java.lang.String getUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UUID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "uuid" element
     */
    public org.apache.xmlbeans.XmlString xgetUuid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UUID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "uuid" element
     */
    public void setUuid(java.lang.String uuid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UUID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UUID$0);
            }
            target.setStringValue(uuid);
        }
    }
    
    /**
     * Sets (as xml) the "uuid" element
     */
    public void xsetUuid(org.apache.xmlbeans.XmlString uuid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UUID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UUID$0);
            }
            target.set(uuid);
        }
    }
}
