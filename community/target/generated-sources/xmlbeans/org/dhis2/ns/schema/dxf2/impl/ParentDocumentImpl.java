/*
 * An XML document type.
 * Localname: parent
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ParentDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one parent(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ParentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ParentDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARENT$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "parent");
    
    
    /**
     * Gets the "parent" element
     */
    public java.math.BigInteger getParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "parent" element
     */
    public org.apache.xmlbeans.XmlInteger xgetParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PARENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "parent" element
     */
    public void setParent(java.math.BigInteger parent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENT$0);
            }
            target.setBigIntegerValue(parent);
        }
    }
    
    /**
     * Sets (as xml) the "parent" element
     */
    public void xsetParent(org.apache.xmlbeans.XmlInteger parent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PARENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PARENT$0);
            }
            target.set(parent);
        }
    }
}
