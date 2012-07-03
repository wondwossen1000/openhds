/*
 * An XML document type.
 * Localname: id
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.IdDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one id(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class IdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IdDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "id");
    
    
    /**
     * Gets the "id" element
     */
    public int getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.dhis2.ns.schema.dxf2.DxfID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DxfID target = null;
            target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(int id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setIntValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.dhis2.ns.schema.dxf2.DxfID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DxfID target = null;
            target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
}
