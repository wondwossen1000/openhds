/*
 * An XML document type.
 * Localname: regression
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.RegressionDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one regression(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class RegressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.RegressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGRESSION$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "regression");
    
    
    /**
     * Gets the "regression" element
     */
    public org.dhis2.ns.schema.dxf2.RegressionDocument.Regression.Enum getRegression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.RegressionDocument.Regression.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "regression" element
     */
    public org.dhis2.ns.schema.dxf2.RegressionDocument.Regression xgetRegression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.RegressionDocument.Regression target = null;
            target = (org.dhis2.ns.schema.dxf2.RegressionDocument.Regression)get_store().find_element_user(REGRESSION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "regression" element
     */
    public void setRegression(org.dhis2.ns.schema.dxf2.RegressionDocument.Regression.Enum regression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGRESSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGRESSION$0);
            }
            target.setEnumValue(regression);
        }
    }
    
    /**
     * Sets (as xml) the "regression" element
     */
    public void xsetRegression(org.dhis2.ns.schema.dxf2.RegressionDocument.Regression regression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.RegressionDocument.Regression target = null;
            target = (org.dhis2.ns.schema.dxf2.RegressionDocument.Regression)get_store().find_element_user(REGRESSION$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.RegressionDocument.Regression)get_store().add_element_user(REGRESSION$0);
            }
            target.set(regression);
        }
    }
    /**
     * An XML regression(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.RegressionDocument$Regression.
     */
    public static class RegressionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.RegressionDocument.Regression
    {
        private static final long serialVersionUID = 1L;
        
        public RegressionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected RegressionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
