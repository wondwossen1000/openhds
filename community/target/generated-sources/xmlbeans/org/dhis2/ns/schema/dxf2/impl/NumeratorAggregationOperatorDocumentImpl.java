/*
 * An XML document type.
 * Localname: numeratorAggregationOperator
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.NumeratorAggregationOperatorDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one numeratorAggregationOperator(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class NumeratorAggregationOperatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.NumeratorAggregationOperatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public NumeratorAggregationOperatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMERATORAGGREGATIONOPERATOR$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "numeratorAggregationOperator");
    
    
    /**
     * Gets the "numeratorAggregationOperator" element
     */
    public java.lang.String getNumeratorAggregationOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERATORAGGREGATIONOPERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numeratorAggregationOperator" element
     */
    public org.apache.xmlbeans.XmlString xgetNumeratorAggregationOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERATORAGGREGATIONOPERATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "numeratorAggregationOperator" element
     */
    public void setNumeratorAggregationOperator(java.lang.String numeratorAggregationOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERATORAGGREGATIONOPERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERATORAGGREGATIONOPERATOR$0);
            }
            target.setStringValue(numeratorAggregationOperator);
        }
    }
    
    /**
     * Sets (as xml) the "numeratorAggregationOperator" element
     */
    public void xsetNumeratorAggregationOperator(org.apache.xmlbeans.XmlString numeratorAggregationOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERATORAGGREGATIONOPERATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMERATORAGGREGATIONOPERATOR$0);
            }
            target.set(numeratorAggregationOperator);
        }
    }
}
