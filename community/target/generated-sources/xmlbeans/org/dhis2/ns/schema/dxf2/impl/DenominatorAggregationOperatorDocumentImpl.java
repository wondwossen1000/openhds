/*
 * An XML document type.
 * Localname: denominatorAggregationOperator
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DenominatorAggregationOperatorDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one denominatorAggregationOperator(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DenominatorAggregationOperatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DenominatorAggregationOperatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public DenominatorAggregationOperatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DENOMINATORAGGREGATIONOPERATOR$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "denominatorAggregationOperator");
    
    
    /**
     * Gets the "denominatorAggregationOperator" element
     */
    public java.lang.String getDenominatorAggregationOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINATORAGGREGATIONOPERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "denominatorAggregationOperator" element
     */
    public org.apache.xmlbeans.XmlString xgetDenominatorAggregationOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENOMINATORAGGREGATIONOPERATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "denominatorAggregationOperator" element
     */
    public void setDenominatorAggregationOperator(java.lang.String denominatorAggregationOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINATORAGGREGATIONOPERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DENOMINATORAGGREGATIONOPERATOR$0);
            }
            target.setStringValue(denominatorAggregationOperator);
        }
    }
    
    /**
     * Sets (as xml) the "denominatorAggregationOperator" element
     */
    public void xsetDenominatorAggregationOperator(org.apache.xmlbeans.XmlString denominatorAggregationOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENOMINATORAGGREGATIONOPERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DENOMINATORAGGREGATIONOPERATOR$0);
            }
            target.set(denominatorAggregationOperator);
        }
    }
}
