/*
 * An XML document type.
 * Localname: indicatorGroup
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.IndicatorGroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one indicatorGroup(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class IndicatorGroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndicatorGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndicatorGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDICATORGROUP$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicatorGroup");
    
    
    /**
     * Gets the "indicatorGroup" element
     */
    public org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup getIndicatorGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup)get_store().find_element_user(INDICATORGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indicatorGroup" element
     */
    public void setIndicatorGroup(org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup indicatorGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup)get_store().find_element_user(INDICATORGROUP$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup)get_store().add_element_user(INDICATORGROUP$0);
            }
            target.set(indicatorGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "indicatorGroup" element
     */
    public org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup addNewIndicatorGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup)get_store().add_element_user(INDICATORGROUP$0);
            return target;
        }
    }
    /**
     * An XML indicatorGroup(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class IndicatorGroupImpl extends org.dhis2.ns.schema.dxf2.impl.IdentifiableObjectImpl implements org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup
    {
        private static final long serialVersionUID = 1L;
        
        public IndicatorGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDICATORREF$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicatorRef");
        
        
        /**
         * Gets array of all "indicatorRef" elements
         */
        public org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef[] getIndicatorRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INDICATORREF$0, targetList);
                org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef[] result = new org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indicatorRef" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef getIndicatorRefArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef)get_store().find_element_user(INDICATORREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indicatorRef" element
         */
        public int sizeOfIndicatorRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDICATORREF$0);
            }
        }
        
        /**
         * Sets array of all "indicatorRef" element
         */
        public void setIndicatorRefArray(org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef[] indicatorRefArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(indicatorRefArray, INDICATORREF$0);
            }
        }
        
        /**
         * Sets ith "indicatorRef" element
         */
        public void setIndicatorRefArray(int i, org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef indicatorRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef)get_store().find_element_user(INDICATORREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(indicatorRef);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indicatorRef" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef insertNewIndicatorRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef)get_store().insert_element_user(INDICATORREF$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indicatorRef" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef addNewIndicatorRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorRefDocument.IndicatorRef)get_store().add_element_user(INDICATORREF$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "indicatorRef" element
         */
        public void removeIndicatorRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDICATORREF$0, i);
            }
        }
    }
}
