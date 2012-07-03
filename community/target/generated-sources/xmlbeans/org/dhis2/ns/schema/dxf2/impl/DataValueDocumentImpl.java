/*
 * An XML document type.
 * Localname: dataValue
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dataValue(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAVALUE$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataValue");
    
    
    /**
     * Gets the "dataValue" element
     */
    public org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue getDataValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue target = null;
            target = (org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue)get_store().find_element_user(DATAVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataValue" element
     */
    public void setDataValue(org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue dataValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue target = null;
            target = (org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue)get_store().find_element_user(DATAVALUE$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue)get_store().add_element_user(DATAVALUE$0);
            }
            target.set(dataValue);
        }
    }
    
    /**
     * Appends and returns a new empty "dataValue" element
     */
    public org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue addNewDataValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue target = null;
            target = (org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue)get_store().add_element_user(DATAVALUE$0);
            return target;
        }
    }
    /**
     * An XML dataValue(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class DataValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue
    {
        private static final long serialVersionUID = 1L;
        
        public DataValueImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATAELEMENT$0 = 
            new javax.xml.namespace.QName("", "dataElement");
        private static final javax.xml.namespace.QName PERIOD$2 = 
            new javax.xml.namespace.QName("", "period");
        private static final javax.xml.namespace.QName SOURCE$4 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName VALUE$6 = 
            new javax.xml.namespace.QName("", "value");
        private static final javax.xml.namespace.QName STOREDBY$8 = 
            new javax.xml.namespace.QName("", "storedBy");
        private static final javax.xml.namespace.QName TIMESTAMP$10 = 
            new javax.xml.namespace.QName("", "timeStamp");
        private static final javax.xml.namespace.QName COMMENT$12 = 
            new javax.xml.namespace.QName("", "comment");
        private static final javax.xml.namespace.QName CATEGORYOPTIONCOMBO$14 = 
            new javax.xml.namespace.QName("", "categoryOptionCombo");
        
        
        /**
         * Gets the "dataElement" attribute
         */
        public int getDataElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAELEMENT$0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "dataElement" attribute
         */
        public org.dhis2.ns.schema.dxf2.DxfIDRef xgetDataElement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(DATAELEMENT$0);
                return target;
            }
        }
        
        /**
         * Sets the "dataElement" attribute
         */
        public void setDataElement(int dataElement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAELEMENT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAELEMENT$0);
                }
                target.setIntValue(dataElement);
            }
        }
        
        /**
         * Sets (as xml) the "dataElement" attribute
         */
        public void xsetDataElement(org.dhis2.ns.schema.dxf2.DxfIDRef dataElement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(DATAELEMENT$0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().add_attribute_user(DATAELEMENT$0);
                }
                target.set(dataElement);
            }
        }
        
        /**
         * Gets the "period" attribute
         */
        public int getPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIOD$2);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "period" attribute
         */
        public org.dhis2.ns.schema.dxf2.DxfIDRef xgetPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(PERIOD$2);
                return target;
            }
        }
        
        /**
         * Sets the "period" attribute
         */
        public void setPeriod(int period)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIOD$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERIOD$2);
                }
                target.setIntValue(period);
            }
        }
        
        /**
         * Sets (as xml) the "period" attribute
         */
        public void xsetPeriod(org.dhis2.ns.schema.dxf2.DxfIDRef period)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(PERIOD$2);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().add_attribute_user(PERIOD$2);
                }
                target.set(period);
            }
        }
        
        /**
         * Gets the "source" attribute
         */
        public int getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$4);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "source" attribute
         */
        public org.dhis2.ns.schema.dxf2.DxfIDRef xgetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(SOURCE$4);
                return target;
            }
        }
        
        /**
         * Sets the "source" attribute
         */
        public void setSource(int source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$4);
                }
                target.setIntValue(source);
            }
        }
        
        /**
         * Sets (as xml) the "source" attribute
         */
        public void xsetSource(org.dhis2.ns.schema.dxf2.DxfIDRef source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(SOURCE$4);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().add_attribute_user(SOURCE$4);
                }
                target.set(source);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VALUE$6);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(org.apache.xmlbeans.XmlAnySimpleType value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VALUE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VALUE$6);
                }
                target.set(value);
            }
        }
        
        /**
         * Appends and returns a new empty "value" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VALUE$6);
                return target;
            }
        }
        
        /**
         * Gets the "storedBy" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getStoredBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(STOREDBY$8);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "storedBy" attribute
         */
        public boolean isSetStoredBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(STOREDBY$8) != null;
            }
        }
        
        /**
         * Sets the "storedBy" attribute
         */
        public void setStoredBy(org.apache.xmlbeans.XmlAnySimpleType storedBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(STOREDBY$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(STOREDBY$8);
                }
                target.set(storedBy);
            }
        }
        
        /**
         * Appends and returns a new empty "storedBy" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewStoredBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(STOREDBY$8);
                return target;
            }
        }
        
        /**
         * Unsets the "storedBy" attribute
         */
        public void unsetStoredBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(STOREDBY$8);
            }
        }
        
        /**
         * Gets the "timeStamp" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(TIMESTAMP$10);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "timeStamp" attribute
         */
        public boolean isSetTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TIMESTAMP$10) != null;
            }
        }
        
        /**
         * Sets the "timeStamp" attribute
         */
        public void setTimeStamp(org.apache.xmlbeans.XmlAnySimpleType timeStamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(TIMESTAMP$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(TIMESTAMP$10);
                }
                target.set(timeStamp);
            }
        }
        
        /**
         * Appends and returns a new empty "timeStamp" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(TIMESTAMP$10);
                return target;
            }
        }
        
        /**
         * Unsets the "timeStamp" attribute
         */
        public void unsetTimeStamp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TIMESTAMP$10);
            }
        }
        
        /**
         * Gets the "comment" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(COMMENT$12);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "comment" attribute
         */
        public boolean isSetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(COMMENT$12) != null;
            }
        }
        
        /**
         * Sets the "comment" attribute
         */
        public void setComment(org.apache.xmlbeans.XmlAnySimpleType comment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(COMMENT$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(COMMENT$12);
                }
                target.set(comment);
            }
        }
        
        /**
         * Appends and returns a new empty "comment" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(COMMENT$12);
                return target;
            }
        }
        
        /**
         * Unsets the "comment" attribute
         */
        public void unsetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(COMMENT$12);
            }
        }
        
        /**
         * Gets the "categoryOptionCombo" attribute
         */
        public int getCategoryOptionCombo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORYOPTIONCOMBO$14);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "categoryOptionCombo" attribute
         */
        public org.dhis2.ns.schema.dxf2.DxfIDRef xgetCategoryOptionCombo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(CATEGORYOPTIONCOMBO$14);
                return target;
            }
        }
        
        /**
         * Sets the "categoryOptionCombo" attribute
         */
        public void setCategoryOptionCombo(int categoryOptionCombo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORYOPTIONCOMBO$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORYOPTIONCOMBO$14);
                }
                target.setIntValue(categoryOptionCombo);
            }
        }
        
        /**
         * Sets (as xml) the "categoryOptionCombo" attribute
         */
        public void xsetCategoryOptionCombo(org.dhis2.ns.schema.dxf2.DxfIDRef categoryOptionCombo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(CATEGORYOPTIONCOMBO$14);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().add_attribute_user(CATEGORYOPTIONCOMBO$14);
                }
                target.set(categoryOptionCombo);
            }
        }
    }
}
