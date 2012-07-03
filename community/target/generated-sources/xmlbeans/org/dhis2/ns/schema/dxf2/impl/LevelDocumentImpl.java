/*
 * An XML document type.
 * Localname: level
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.LevelDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one level(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class LevelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.LevelDocument
{
    private static final long serialVersionUID = 1L;
    
    public LevelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEVEL$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "level");
    
    
    /**
     * Gets the "level" element
     */
    public java.math.BigInteger getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEVEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "level" element
     */
    public org.apache.xmlbeans.XmlInteger xgetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LEVEL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "level" element
     */
    public void setLevel(java.math.BigInteger level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEVEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEVEL$0);
            }
            target.setBigIntegerValue(level);
        }
    }
    
    /**
     * Sets (as xml) the "level" element
     */
    public void xsetLevel(org.apache.xmlbeans.XmlInteger level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LEVEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(LEVEL$0);
            }
            target.set(level);
        }
    }
}
