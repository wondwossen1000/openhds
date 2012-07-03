/*
 * An XML document type.
 * Localname: individualMonthsThisYear
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one individualMonthsThisYear(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class IndividualMonthsThisYearDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndividualMonthsThisYearDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDIVIDUALMONTHSTHISYEAR$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "individualMonthsThisYear");
    
    
    /**
     * Gets the "individualMonthsThisYear" element
     */
    public org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear.Enum getIndividualMonthsThisYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIVIDUALMONTHSTHISYEAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "individualMonthsThisYear" element
     */
    public org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear xgetIndividualMonthsThisYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear target = null;
            target = (org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear)get_store().find_element_user(INDIVIDUALMONTHSTHISYEAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "individualMonthsThisYear" element
     */
    public void setIndividualMonthsThisYear(org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear.Enum individualMonthsThisYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIVIDUALMONTHSTHISYEAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDIVIDUALMONTHSTHISYEAR$0);
            }
            target.setEnumValue(individualMonthsThisYear);
        }
    }
    
    /**
     * Sets (as xml) the "individualMonthsThisYear" element
     */
    public void xsetIndividualMonthsThisYear(org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear individualMonthsThisYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear target = null;
            target = (org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear)get_store().find_element_user(INDIVIDUALMONTHSTHISYEAR$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear)get_store().add_element_user(INDIVIDUALMONTHSTHISYEAR$0);
            }
            target.set(individualMonthsThisYear);
        }
    }
    /**
     * An XML individualMonthsThisYear(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument$IndividualMonthsThisYear.
     */
    public static class IndividualMonthsThisYearImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear
    {
        private static final long serialVersionUID = 1L;
        
        public IndividualMonthsThisYearImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected IndividualMonthsThisYearImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
