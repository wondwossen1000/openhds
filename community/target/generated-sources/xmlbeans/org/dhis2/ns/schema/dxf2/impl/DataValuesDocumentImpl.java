/*
 * An XML document type.
 * Localname: dataValues
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataValuesDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dataValues(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataValuesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataValuesDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataValuesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAVALUES$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataValues");
    
    
    /**
     * Gets the "dataValues" element
     */
    public org.dhis2.ns.schema.dxf2.DataValues getDataValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataValues target = null;
            target = (org.dhis2.ns.schema.dxf2.DataValues)get_store().find_element_user(DATAVALUES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataValues" element
     */
    public void setDataValues(org.dhis2.ns.schema.dxf2.DataValues dataValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataValues target = null;
            target = (org.dhis2.ns.schema.dxf2.DataValues)get_store().find_element_user(DATAVALUES$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataValues)get_store().add_element_user(DATAVALUES$0);
            }
            target.set(dataValues);
        }
    }
    
    /**
     * Appends and returns a new empty "dataValues" element
     */
    public org.dhis2.ns.schema.dxf2.DataValues addNewDataValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataValues target = null;
            target = (org.dhis2.ns.schema.dxf2.DataValues)get_store().add_element_user(DATAVALUES$0);
            return target;
        }
    }
}
