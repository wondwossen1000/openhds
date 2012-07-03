/*
 * An XML document type.
 * Localname: dataElement
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dataElement(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAELEMENT$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElement");
    
    
    /**
     * Gets the "dataElement" element
     */
    public org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement getDataElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement)get_store().find_element_user(DATAELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataElement" element
     */
    public void setDataElement(org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement dataElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement)get_store().find_element_user(DATAELEMENT$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement)get_store().add_element_user(DATAELEMENT$0);
            }
            target.set(dataElement);
        }
    }
    
    /**
     * Appends and returns a new empty "dataElement" element
     */
    public org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement addNewDataElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement)get_store().add_element_user(DATAELEMENT$0);
            return target;
        }
    }
    /**
     * An XML dataElement(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class DataElementImpl extends org.dhis2.ns.schema.dxf2.impl.IdentifiableObjectImpl implements org.dhis2.ns.schema.dxf2.DataElementDocument.DataElement
    {
        private static final long serialVersionUID = 1L;
        
        public DataElementImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ACTIVE$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "active");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "type");
        private static final javax.xml.namespace.QName AGGREGATIONOPERATOR$4 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "aggregationOperator");
        private static final javax.xml.namespace.QName CATEGORYCOMBO$6 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryCombo");
        private static final javax.xml.namespace.QName LASTUPDATED$8 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "lastUpdated");
        
        
        /**
         * Gets the "active" element
         */
        public java.lang.String getActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "active" element
         */
        public org.apache.xmlbeans.XmlString xgetActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "active" element
         */
        public void setActive(java.lang.String active)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVE$0);
                }
                target.setStringValue(active);
            }
        }
        
        /**
         * Sets (as xml) the "active" element
         */
        public void xsetActive(org.apache.xmlbeans.XmlString active)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACTIVE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACTIVE$0);
                }
                target.set(active);
            }
        }
        
        /**
         * Gets the "type" element
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" element
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$2);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" element
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$2);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "aggregationOperator" element
         */
        public java.lang.String getAggregationOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGGREGATIONOPERATOR$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "aggregationOperator" element
         */
        public org.apache.xmlbeans.XmlString xgetAggregationOperator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGGREGATIONOPERATOR$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "aggregationOperator" element
         */
        public void setAggregationOperator(java.lang.String aggregationOperator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGGREGATIONOPERATOR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGGREGATIONOPERATOR$4);
                }
                target.setStringValue(aggregationOperator);
            }
        }
        
        /**
         * Sets (as xml) the "aggregationOperator" element
         */
        public void xsetAggregationOperator(org.apache.xmlbeans.XmlString aggregationOperator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AGGREGATIONOPERATOR$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AGGREGATIONOPERATOR$4);
                }
                target.set(aggregationOperator);
            }
        }
        
        /**
         * Gets the "categoryCombo" element
         */
        public int getCategoryCombo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYCOMBO$6, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "categoryCombo" element
         */
        public org.dhis2.ns.schema.dxf2.DxfIDRef xgetCategoryCombo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_element_user(CATEGORYCOMBO$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "categoryCombo" element
         */
        public void setCategoryCombo(int categoryCombo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYCOMBO$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYCOMBO$6);
                }
                target.setIntValue(categoryCombo);
            }
        }
        
        /**
         * Sets (as xml) the "categoryCombo" element
         */
        public void xsetCategoryCombo(org.dhis2.ns.schema.dxf2.DxfIDRef categoryCombo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_element_user(CATEGORYCOMBO$6, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().add_element_user(CATEGORYCOMBO$6);
                }
                target.set(categoryCombo);
            }
        }
        
        /**
         * Gets the "lastUpdated" element
         */
        public java.util.Calendar getLastUpdated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATED$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "lastUpdated" element
         */
        public org.apache.xmlbeans.XmlDate xgetLastUpdated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(LASTUPDATED$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "lastUpdated" element
         */
        public boolean isSetLastUpdated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LASTUPDATED$8) != 0;
            }
        }
        
        /**
         * Sets the "lastUpdated" element
         */
        public void setLastUpdated(java.util.Calendar lastUpdated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATED$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTUPDATED$8);
                }
                target.setCalendarValue(lastUpdated);
            }
        }
        
        /**
         * Sets (as xml) the "lastUpdated" element
         */
        public void xsetLastUpdated(org.apache.xmlbeans.XmlDate lastUpdated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(LASTUPDATED$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(LASTUPDATED$8);
                }
                target.set(lastUpdated);
            }
        }
        
        /**
         * Unsets the "lastUpdated" element
         */
        public void unsetLastUpdated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LASTUPDATED$8, 0);
            }
        }
    }
}
