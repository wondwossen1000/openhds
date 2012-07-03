/*
 * An XML document type.
 * Localname: indicatorGroupSet
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one indicatorGroupSet(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class IndicatorGroupSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndicatorGroupSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDICATORGROUPSET$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicatorGroupSet");
    
    
    /**
     * Gets the "indicatorGroupSet" element
     */
    public org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet getIndicatorGroupSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet)get_store().find_element_user(INDICATORGROUPSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indicatorGroupSet" element
     */
    public void setIndicatorGroupSet(org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet indicatorGroupSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet)get_store().find_element_user(INDICATORGROUPSET$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet)get_store().add_element_user(INDICATORGROUPSET$0);
            }
            target.set(indicatorGroupSet);
        }
    }
    
    /**
     * Appends and returns a new empty "indicatorGroupSet" element
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
     * An XML indicatorGroupSet(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class IndicatorGroupSetImpl extends org.dhis2.ns.schema.dxf2.impl.IdentifiableObjectImpl implements org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet
    {
        private static final long serialVersionUID = 1L;
        
        public IndicatorGroupSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GROUPS$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "Groups");
        
        
        /**
         * Gets the "Groups" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups getGroups()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups)get_store().find_element_user(GROUPS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Groups" element
         */
        public void setGroups(org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups groups)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups)get_store().find_element_user(GROUPS$0, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups)get_store().add_element_user(GROUPS$0);
                }
                target.set(groups);
            }
        }
        
        /**
         * Appends and returns a new empty "Groups" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups addNewGroups()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups)get_store().add_element_user(GROUPS$0);
                return target;
            }
        }
        /**
         * An XML Groups(@http://dhis2.org/ns/schema/dxf2).
         *
         * This is a complex type.
         */
        public static class GroupsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups
        {
            private static final long serialVersionUID = 1L;
            
            public GroupsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INDICATORGROUP$0 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicatorGroup");
            
            
            /**
             * Gets array of all "indicatorGroup" elements
             */
            public org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup[] getIndicatorGroupArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(INDICATORGROUP$0, targetList);
                    org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup[] result = new org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "indicatorGroup" element
             */
            public org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup getIndicatorGroupArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup target = null;
                    target = (org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup)get_store().find_element_user(INDICATORGROUP$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "indicatorGroup" element
             */
            public int sizeOfIndicatorGroupArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INDICATORGROUP$0);
                }
            }
            
            /**
             * Sets array of all "indicatorGroup" element
             */
            public void setIndicatorGroupArray(org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup[] indicatorGroupArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(indicatorGroupArray, INDICATORGROUP$0);
                }
            }
            
            /**
             * Sets ith "indicatorGroup" element
             */
            public void setIndicatorGroupArray(int i, org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup indicatorGroup)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup target = null;
                    target = (org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup)get_store().find_element_user(INDICATORGROUP$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(indicatorGroup);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "indicatorGroup" element
             */
            public org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup insertNewIndicatorGroup(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup target = null;
                    target = (org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup)get_store().insert_element_user(INDICATORGROUP$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "indicatorGroup" element
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
             * Removes the ith "indicatorGroup" element
             */
            public void removeIndicatorGroup(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INDICATORGROUP$0, i);
                }
            }
        }
    }
}
