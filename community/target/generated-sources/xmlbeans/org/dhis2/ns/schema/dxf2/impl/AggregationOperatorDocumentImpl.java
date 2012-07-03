/*
 * An XML document type.
 * Localname: aggregationOperator
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.AggregationOperatorDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one aggregationOperator(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class AggregationOperatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.AggregationOperatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public AggregationOperatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGGREGATIONOPERATOR$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "aggregationOperator");
    
    
    /**
     * Gets the "aggregationOperator" element
     */
    public java.lang.String getAggregationOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGGREGATIONOPERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "aggregationOperator" element
     */
    public org.apache.xmlbeans.XmlString xgetAggregationOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGGREGATIONOPERATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "aggregationOperator" element
     */
    public void setAggregationOperator(java.lang.String aggregationOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGGREGATIONOPERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGGREGATIONOPERATOR$0);
            }
            target.setStringValue(aggregationOperator);
        }
    }
    
    /**
     * Sets (as xml) the "aggregationOperator" element
     */
    public void xsetAggregationOperator(org.apache.xmlbeans.XmlString aggregationOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGGREGATIONOPERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGGREGATIONOPERATOR$0);
            }
            target.set(aggregationOperator);
        }
    }
}
