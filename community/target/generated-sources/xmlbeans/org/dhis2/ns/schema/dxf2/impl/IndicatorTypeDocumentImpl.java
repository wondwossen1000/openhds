/*
 * An XML document type.
 * Localname: indicatorType
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.IndicatorTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one indicatorType(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class IndicatorTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndicatorTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndicatorTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDICATORTYPE$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicatorType");
    
    
    /**
     * Gets the "indicatorType" element
     */
    public org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType getIndicatorType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType)get_store().find_element_user(INDICATORTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indicatorType" element
     */
    public void setIndicatorType(org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType indicatorType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType)get_store().find_element_user(INDICATORTYPE$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType)get_store().add_element_user(INDICATORTYPE$0);
            }
            target.set(indicatorType);
        }
    }
    
    /**
     * Appends and returns a new empty "indicatorType" element
     */
    public org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType addNewIndicatorType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType)get_store().add_element_user(INDICATORTYPE$0);
            return target;
        }
    }
    /**
     * An XML indicatorType(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class IndicatorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType
    {
        private static final long serialVersionUID = 1L;
        
        public IndicatorTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "name");
        private static final javax.xml.namespace.QName FACTOR$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "factor");
        private static final javax.xml.namespace.QName ID$4 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "factor" element
         */
        public java.math.BigInteger getFactor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACTOR$2, 0);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FACTOR$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACTOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FACTOR$2);
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
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(FACTOR$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(FACTOR$2);
                }
                target.set(factor);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public int getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.dhis2.ns.schema.dxf2.DxfID xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfID target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_attribute_user(ID$4);
                return target;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(int id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
                }
                target.setIntValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.dhis2.ns.schema.dxf2.DxfID id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfID target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().add_attribute_user(ID$4);
                }
                target.set(id);
            }
        }
    }
}
