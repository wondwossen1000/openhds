/*
 * An XML document type.
 * Localname: indicatorTypes
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.IndicatorTypesDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one indicatorTypes(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class IndicatorTypesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndicatorTypesDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndicatorTypesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDICATORTYPES$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicatorTypes");
    
    
    /**
     * Gets the "indicatorTypes" element
     */
    public org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes getIndicatorTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes)get_store().find_element_user(INDICATORTYPES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indicatorTypes" element
     */
    public void setIndicatorTypes(org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes indicatorTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes)get_store().find_element_user(INDICATORTYPES$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes)get_store().add_element_user(INDICATORTYPES$0);
            }
            target.set(indicatorTypes);
        }
    }
    
    /**
     * Appends and returns a new empty "indicatorTypes" element
     */
    public org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes addNewIndicatorTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes)get_store().add_element_user(INDICATORTYPES$0);
            return target;
        }
    }
    /**
     * An XML indicatorTypes(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class IndicatorTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes
    {
        private static final long serialVersionUID = 1L;
        
        public IndicatorTypesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDICATORTYPE$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicatorType");
        
        
        /**
         * Gets array of all "indicatorType" elements
         */
        public org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType[] getIndicatorTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INDICATORTYPE$0, targetList);
                org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType[] result = new org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indicatorType" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType getIndicatorTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType)get_store().find_element_user(INDICATORTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indicatorType" element
         */
        public int sizeOfIndicatorTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDICATORTYPE$0);
            }
        }
        
        /**
         * Sets array of all "indicatorType" element
         */
        public void setIndicatorTypeArray(org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType[] indicatorTypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(indicatorTypeArray, INDICATORTYPE$0);
            }
        }
        
        /**
         * Sets ith "indicatorType" element
         */
        public void setIndicatorTypeArray(int i, org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType indicatorType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType)get_store().find_element_user(INDICATORTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(indicatorType);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indicatorType" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType insertNewIndicatorType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorTypeDocument.IndicatorType)get_store().insert_element_user(INDICATORTYPE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indicatorType" element
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
         * Removes the ith "indicatorType" element
         */
        public void removeIndicatorType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDICATORTYPE$0, i);
            }
        }
    }
}
