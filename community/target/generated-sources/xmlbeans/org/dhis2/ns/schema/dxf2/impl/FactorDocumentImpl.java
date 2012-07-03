/*
 * An XML document type.
 * Localname: factor
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.FactorDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one factor(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class FactorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.FactorDocument
{
    private static final long serialVersionUID = 1L;
    
    public FactorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FACTOR$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "factor");
    
    
    /**
     * Gets the "factor" element
     */
    public java.math.BigInteger getFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "factor" element
     */
    public org.apache.xmlbeans.XmlInteger xgetFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FACTOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "factor" element
     */
    public void setFactor(java.math.BigInteger factor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FACTOR$0);
            }
            target.setBigIntegerValue(factor);
        }
    }
    
    /**
     * Sets (as xml) the "factor" element
     */
    public void xsetFactor(org.apache.xmlbeans.XmlInteger factor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FACTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FACTOR$0);
            }
            target.set(factor);
        }
    }
}
