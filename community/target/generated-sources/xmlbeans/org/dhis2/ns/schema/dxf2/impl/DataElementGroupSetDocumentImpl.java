/*
 * An XML document type.
 * Localname: dataElementGroupSet
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dataElementGroupSet(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataElementGroupSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataElementGroupSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAELEMENTGROUPSET$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElementGroupSet");
    
    
    /**
     * Gets the "dataElementGroupSet" element
     */
    public org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet getDataElementGroupSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet)get_store().find_element_user(DATAELEMENTGROUPSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataElementGroupSet" element
     */
    public void setDataElementGroupSet(org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet dataElementGroupSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet)get_store().find_element_user(DATAELEMENTGROUPSET$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet)get_store().add_element_user(DATAELEMENTGROUPSET$0);
            }
            target.set(dataElementGroupSet);
        }
    }
    
    /**
     * Appends and returns a new empty "dataElementGroupSet" element
     */
    public org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet addNewDataElementGroupSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet target = null;
            target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet)get_store().add_element_user(DATAELEMENTGROUPSET$0);
            return target;
        }
    }
    /**
     * An XML dataElementGroupSet(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class DataElementGroupSetImpl extends org.dhis2.ns.schema.dxf2.impl.IdentifiableObjectImpl implements org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet
    {
        private static final long serialVersionUID = 1L;
        
        public DataElementGroupSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GROUPS$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "Groups");
        
        
        /**
         * Gets the "Groups" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet.Groups getGroups()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet.Groups target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet.Groups)get_store().find_element_user(GROUPS$0, 0);
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
        public void setGroups(org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet.Groups groups)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet.Groups target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet.Groups)get_store().find_element_user(GROUPS$0, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet.Groups)get_store().add_element_user(GROUPS$0);
                }
                target.set(groups);
            }
        }
        
        /**
         * Appends and returns a new empty "Groups" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet.Groups addNewGroups()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet.Groups target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet.Groups)get_store().add_element_user(GROUPS$0);
                return target;
            }
        }
        /**
         * An XML Groups(@http://dhis2.org/ns/schema/dxf2).
         *
         * This is a complex type.
         */
        public static class GroupsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataElementGroupSetDocument.DataElementGroupSet.Groups
        {
            private static final long serialVersionUID = 1L;
            
            public GroupsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATAELEMENTGROUP$0 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElementGroup");
            
            
            /**
             * Gets array of all "dataElementGroup" elements
             */
            public org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup[] getDataElementGroupArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DATAELEMENTGROUP$0, targetList);
                    org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup[] result = new org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "dataElementGroup" element
             */
            public org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup getDataElementGroupArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup)get_store().find_element_user(DATAELEMENTGROUP$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "dataElementGroup" element
             */
            public int sizeOfDataElementGroupArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DATAELEMENTGROUP$0);
                }
            }
            
            /**
             * Sets array of all "dataElementGroup" element
             */
            public void setDataElementGroupArray(org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup[] dataElementGroupArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(dataElementGroupArray, DATAELEMENTGROUP$0);
                }
            }
            
            /**
             * Sets ith "dataElementGroup" element
             */
            public void setDataElementGroupArray(int i, org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup dataElementGroup)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup)get_store().find_element_user(DATAELEMENTGROUP$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(dataElementGroup);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "dataElementGroup" element
             */
            public org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup insertNewDataElementGroup(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup)get_store().insert_element_user(DATAELEMENTGROUP$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "dataElementGroup" element
             */
            public org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup addNewDataElementGroup()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataElementGroupDocument.DataElementGroup)get_store().add_element_user(DATAELEMENTGROUP$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "dataElementGroup" element
             */
            public void removeDataElementGroup(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DATAELEMENTGROUP$0, i);
                }
            }
        }
    }
}
