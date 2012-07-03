/*
 * An XML document type.
 * Localname: individualQuartersThisYear
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one individualQuartersThisYear(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class IndividualQuartersThisYearDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndividualQuartersThisYearDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDIVIDUALQUARTERSTHISYEAR$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "individualQuartersThisYear");
    
    
    /**
     * Gets the "individualQuartersThisYear" element
     */
    public org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear.Enum getIndividualQuartersThisYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIVIDUALQUARTERSTHISYEAR$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "individualQuartersThisYear" element
     */
    public org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear xgetIndividualQuartersThisYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear target = null;
            target = (org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear)get_store().find_element_user(INDIVIDUALQUARTERSTHISYEAR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "individualQuartersThisYear" element
     */
    public void setIndividualQuartersThisYear(org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear.Enum individualQuartersThisYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIVIDUALQUARTERSTHISYEAR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDIVIDUALQUARTERSTHISYEAR$0);
            }
            target.setEnumValue(individualQuartersThisYear);
        }
    }
    
    /**
     * Sets (as xml) the "individualQuartersThisYear" element
     */
    public void xsetIndividualQuartersThisYear(org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear individualQuartersThisYear)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear target = null;
            target = (org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear)get_store().find_element_user(INDIVIDUALQUARTERSTHISYEAR$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear)get_store().add_element_user(INDIVIDUALQUARTERSTHISYEAR$0);
            }
            target.set(individualQuartersThisYear);
        }
    }
    /**
     * An XML individualQuartersThisYear(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument$IndividualQuartersThisYear.
     */
    public static class IndividualQuartersThisYearImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear
    {
        private static final long serialVersionUID = 1L;
        
        public IndividualQuartersThisYearImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected IndividualQuartersThisYearImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
