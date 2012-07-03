/*
 * An XML document type.
 * Localname: periodType
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.PeriodTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one periodType(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class PeriodTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.PeriodTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public PeriodTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERIODTYPE$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "periodType");
    
    
    /**
     * Gets the "periodType" element
     */
    public java.lang.String getPeriodType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "periodType" element
     */
    public org.apache.xmlbeans.XmlString xgetPeriodType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERIODTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "periodType" element
     */
    public void setPeriodType(java.lang.String periodType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODTYPE$0);
            }
            target.setStringValue(periodType);
        }
    }
    
    /**
     * Sets (as xml) the "periodType" element
     */
    public void xsetPeriodType(org.apache.xmlbeans.XmlString periodType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERIODTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERIODTYPE$0);
            }
            target.set(periodType);
        }
    }
}
