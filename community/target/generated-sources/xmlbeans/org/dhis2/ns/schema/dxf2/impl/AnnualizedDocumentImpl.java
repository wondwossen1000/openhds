/*
 * An XML document type.
 * Localname: annualized
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.AnnualizedDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one annualized(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class AnnualizedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.AnnualizedDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnnualizedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNUALIZED$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "annualized");
    
    
    /**
     * Gets the "annualized" element
     */
    public java.lang.String getAnnualized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANNUALIZED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "annualized" element
     */
    public org.apache.xmlbeans.XmlString xgetAnnualized()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANNUALIZED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "annualized" element
     */
    public void setAnnualized(java.lang.String annualized)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANNUALIZED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANNUALIZED$0);
            }
            target.setStringValue(annualized);
        }
    }
    
    /**
     * Sets (as xml) the "annualized" element
     */
    public void xsetAnnualized(org.apache.xmlbeans.XmlString annualized)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANNUALIZED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANNUALIZED$0);
            }
            target.set(annualized);
        }
    }
}
