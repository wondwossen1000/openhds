/*
 * An XML document type.
 * Localname: groupSets
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.GroupSetsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one groupSets(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class GroupSetsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.GroupSetsDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupSetsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPSETS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "groupSets");
    
    
    /**
     * Gets the "groupSets" element
     */
    public org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets getGroupSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets target = null;
            target = (org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets)get_store().find_element_user(GROUPSETS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "groupSets" element
     */
    public void setGroupSets(org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets groupSets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets target = null;
            target = (org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets)get_store().find_element_user(GROUPSETS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets)get_store().add_element_user(GROUPSETS$0);
            }
            target.set(groupSets);
        }
    }
    
    /**
     * Appends and returns a new empty "groupSets" element
     */
    public org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets addNewGroupSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets target = null;
            target = (org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets)get_store().add_element_user(GROUPSETS$0);
            return target;
        }
    }
    /**
     * An XML groupSets(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class GroupSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets
    {
        private static final long serialVersionUID = 1L;
        
        public GroupSetsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GROUPSET$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "groupSet");
        
        
        /**
         * Gets array of all "groupSet" elements
         */
        public org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet[] getGroupSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GROUPSET$0, targetList);
                org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet[] result = new org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "groupSet" element
         */
        public org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet getGroupSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet target = null;
                target = (org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet)get_store().find_element_user(GROUPSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "groupSet" element
         */
        public int sizeOfGroupSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GROUPSET$0);
            }
        }
        
        /**
         * Sets array of all "groupSet" element
         */
        public void setGroupSetArray(org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet[] groupSetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(groupSetArray, GROUPSET$0);
            }
        }
        
        /**
         * Sets ith "groupSet" element
         */
        public void setGroupSetArray(int i, org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet groupSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet target = null;
                target = (org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet)get_store().find_element_user(GROUPSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(groupSet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "groupSet" element
         */
        public org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet insertNewGroupSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet target = null;
                target = (org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet)get_store().insert_element_user(GROUPSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "groupSet" element
         */
        public org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet addNewGroupSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet target = null;
                target = (org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet)get_store().add_element_user(GROUPSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "groupSet" element
         */
        public void removeGroupSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GROUPSET$0, i);
            }
        }
    }
}
