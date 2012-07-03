/*
 * An XML document type.
 * Localname: indicatorGroupSets
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one indicatorGroupSets(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class IndicatorGroupSetsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndicatorGroupSetsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDICATORGROUPSETS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicatorGroupSets");
    
    
    /**
     * Gets the "indicatorGroupSets" element
     */
    public org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets getIndicatorGroupSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets)get_store().find_element_user(INDICATORGROUPSETS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indicatorGroupSets" element
     */
    public void setIndicatorGroupSets(org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets indicatorGroupSets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets)get_store().find_element_user(INDICATORGROUPSETS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets)get_store().add_element_user(INDICATORGROUPSETS$0);
            }
            target.set(indicatorGroupSets);
        }
    }
    
    /**
     * Appends and returns a new empty "indicatorGroupSets" element
     */
    public org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets addNewIndicatorGroupSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets)get_store().add_element_user(INDICATORGROUPSETS$0);
            return target;
        }
    }
    /**
     * An XML indicatorGroupSets(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class IndicatorGroupSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets
    {
        private static final long serialVersionUID = 1L;
        
        public IndicatorGroupSetsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDICATORGROUPSET$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicatorGroupSet");
        
        
        /**
         * Gets array of all "indicatorGroupSet" elements
         */
        public org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet[] getIndicatorGroupSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INDICATORGROUPSET$0, targetList);
                org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet[] result = new org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indicatorGroupSet" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet getIndicatorGroupSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet)get_store().find_element_user(INDICATORGROUPSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indicatorGroupSet" element
         */
        public int sizeOfIndicatorGroupSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDICATORGROUPSET$0);
            }
        }
        
        /**
         * Sets array of all "indicatorGroupSet" element
         */
        public void setIndicatorGroupSetArray(org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet[] indicatorGroupSetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(indicatorGroupSetArray, INDICATORGROUPSET$0);
            }
        }
        
        /**
         * Sets ith "indicatorGroupSet" element
         */
        public void setIndicatorGroupSetArray(int i, org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet indicatorGroupSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet)get_store().find_element_user(INDICATORGROUPSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(indicatorGroupSet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indicatorGroupSet" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet insertNewIndicatorGroupSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet)get_store().insert_element_user(INDICATORGROUPSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indicatorGroupSet" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet addNewIndicatorGroupSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet)get_store().add_element_user(INDICATORGROUPSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "indicatorGroupSet" element
         */
        public void removeIndicatorGroupSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDICATORGROUPSET$0, i);
            }
        }
    }
}
