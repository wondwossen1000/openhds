/*
 * An XML document type.
 * Localname: endDate
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.EndDateDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one endDate(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class EndDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.EndDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDDATE$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "endDate");
    
    
    /**
     * Gets the "endDate" element
     */
    public java.lang.String getEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "endDate" element
     */
    public org.apache.xmlbeans.XmlString xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "endDate" element
     */
    public void setEndDate(java.lang.String endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$0);
            }
            target.setStringValue(endDate);
        }
    }
    
    /**
     * Sets (as xml) the "endDate" element
     */
    public void xsetEndDate(org.apache.xmlbeans.XmlString endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDDATE$0);
            }
            target.set(endDate);
        }
    }
}
