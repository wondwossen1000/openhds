/*
 * An XML document type.
 * Localname: child
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ChildDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one child(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ChildDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ChildDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChildDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHILD$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "child");
    
    
    /**
     * Gets the "child" element
     */
    public java.math.BigInteger getChild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "child" element
     */
    public org.apache.xmlbeans.XmlInteger xgetChild()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CHILD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "child" element
     */
    public void setChild(java.math.BigInteger child)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHILD$0);
            }
            target.setBigIntegerValue(child);
        }
    }
    
    /**
     * Sets (as xml) the "child" element
     */
    public void xsetChild(org.apache.xmlbeans.XmlInteger child)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CHILD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CHILD$0);
            }
            target.set(child);
        }
    }
}
