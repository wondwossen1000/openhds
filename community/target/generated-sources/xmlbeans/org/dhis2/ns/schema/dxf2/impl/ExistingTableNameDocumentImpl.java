/*
 * An XML document type.
 * Localname: existingTableName
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ExistingTableNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one existingTableName(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ExistingTableNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ExistingTableNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExistingTableNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXISTINGTABLENAME$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "existingTableName");
    
    
    /**
     * Gets the "existingTableName" element
     */
    public java.lang.String getExistingTableName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTINGTABLENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "existingTableName" element
     */
    public org.apache.xmlbeans.XmlString xgetExistingTableName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXISTINGTABLENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "existingTableName" element
     */
    public void setExistingTableName(java.lang.String existingTableName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTINGTABLENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXISTINGTABLENAME$0);
            }
            target.setStringValue(existingTableName);
        }
    }
    
    /**
     * Sets (as xml) the "existingTableName" element
     */
    public void xsetExistingTableName(org.apache.xmlbeans.XmlString existingTableName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXISTINGTABLENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXISTINGTABLENAME$0);
            }
            target.set(existingTableName);
        }
    }
}
