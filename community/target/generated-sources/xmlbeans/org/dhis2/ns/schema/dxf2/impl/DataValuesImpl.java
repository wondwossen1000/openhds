/*
 * XML Type:  dataValues
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataValues
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * An XML dataValues(@http://dhis2.org/ns/schema/dxf2).
 *
 * This is a complex type.
 */
public class DataValuesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataValues
{
    private static final long serialVersionUID = 1L;
    
    public DataValuesImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAVALUE$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataValue");
    
    
    /**
     * Gets array of all "dataValue" elements
     */
    public org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue[] getDataValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAVALUE$0, targetList);
            org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue[] result = new org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataValue" element
     */
    public org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue getDataValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue target = null;
            target = (org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue)get_store().find_element_user(DATAVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataValue" element
     */
    public int sizeOfDataValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAVALUE$0);
        }
    }
    
    /**
     * Sets array of all "dataValue" element
     */
    public void setDataValueArray(org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue[] dataValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataValueArray, DATAVALUE$0);
        }
    }
    
    /**
     * Sets ith "dataValue" element
     */
    public void setDataValueArray(int i, org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue dataValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue target = null;
            target = (org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue)get_store().find_element_user(DATAVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataValue" element
     */
    public org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue insertNewDataValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue target = null;
            target = (org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue)get_store().insert_element_user(DATAVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataValue" element
     */
    public org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue addNewDataValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue target = null;
            target = (org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue)get_store().add_element_user(DATAVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataValue" element
     */
    public void removeDataValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAVALUE$0, i);
        }
    }
}
