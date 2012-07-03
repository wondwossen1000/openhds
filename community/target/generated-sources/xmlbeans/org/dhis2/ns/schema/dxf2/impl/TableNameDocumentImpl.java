/*
 * An XML document type.
 * Localname: tableName
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.TableNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one tableName(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class TableNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.TableNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public TableNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLENAME$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "tableName");
    
    
    /**
     * Gets the "tableName" element
     */
    public java.lang.String getTableName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TABLENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tableName" element
     */
    public org.apache.xmlbeans.XmlString xgetTableName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TABLENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tableName" element
     */
    public void setTableName(java.lang.String tableName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TABLENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TABLENAME$0);
            }
            target.setStringValue(tableName);
        }
    }
    
    /**
     * Sets (as xml) the "tableName" element
     */
    public void xsetTableName(org.apache.xmlbeans.XmlString tableName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TABLENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TABLENAME$0);
            }
            target.set(tableName);
        }
    }
}
