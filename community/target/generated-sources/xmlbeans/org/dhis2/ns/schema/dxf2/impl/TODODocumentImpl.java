/*
 * An XML document type.
 * Localname: TODO
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.TODODocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one TODO(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class TODODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.TODODocument
{
    private static final long serialVersionUID = 1L;
    
    public TODODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TODO$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "TODO");
    
    
    /**
     * Gets the "TODO" element
     */
    public java.math.BigInteger getTODO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "TODO" element
     */
    public org.apache.xmlbeans.XmlInteger xgetTODO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TODO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TODO" element
     */
    public void setTODO(java.math.BigInteger todo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TODO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TODO$0);
            }
            target.setBigIntegerValue(todo);
        }
    }
    
    /**
     * Sets (as xml) the "TODO" element
     */
    public void xsetTODO(org.apache.xmlbeans.XmlInteger todo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TODO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TODO$0);
            }
            target.set(todo);
        }
    }
}
