/*
 * An XML document type.
 * Localname: sortOrder
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.SortOrderDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one sortOrder(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class SortOrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.SortOrderDocument
{
    private static final long serialVersionUID = 1L;
    
    public SortOrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SORTORDER$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "sortOrder");
    
    
    /**
     * Gets the "sortOrder" element
     */
    public java.math.BigInteger getSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SORTORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "sortOrder" element
     */
    public org.apache.xmlbeans.XmlInteger xgetSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SORTORDER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sortOrder" element
     */
    public void setSortOrder(java.math.BigInteger sortOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SORTORDER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SORTORDER$0);
            }
            target.setBigIntegerValue(sortOrder);
        }
    }
    
    /**
     * Sets (as xml) the "sortOrder" element
     */
    public void xsetSortOrder(org.apache.xmlbeans.XmlInteger sortOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SORTORDER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SORTORDER$0);
            }
            target.set(sortOrder);
        }
    }
}
