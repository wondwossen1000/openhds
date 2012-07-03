/*
 * An XML document type.
 * Localname: groups
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.GroupsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one groups(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class GroupsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.GroupsDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "groups");
    
    
    /**
     * Gets the "groups" element
     */
    public org.dhis2.ns.schema.dxf2.GroupsDocument.Groups getGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.GroupsDocument.Groups target = null;
            target = (org.dhis2.ns.schema.dxf2.GroupsDocument.Groups)get_store().find_element_user(GROUPS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "groups" element
     */
    public void setGroups(org.dhis2.ns.schema.dxf2.GroupsDocument.Groups groups)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.GroupsDocument.Groups target = null;
            target = (org.dhis2.ns.schema.dxf2.GroupsDocument.Groups)get_store().find_element_user(GROUPS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.GroupsDocument.Groups)get_store().add_element_user(GROUPS$0);
            }
            target.set(groups);
        }
    }
    
    /**
     * Appends and returns a new empty "groups" element
     */
    public org.dhis2.ns.schema.dxf2.GroupsDocument.Groups addNewGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.GroupsDocument.Groups target = null;
            target = (org.dhis2.ns.schema.dxf2.GroupsDocument.Groups)get_store().add_element_user(GROUPS$0);
            return target;
        }
    }
    /**
     * An XML groups(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class GroupsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.GroupsDocument.Groups
    {
        private static final long serialVersionUID = 1L;
        
        public GroupsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GROUPREF$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "groupRef");
        
        
        /**
         * Gets array of all "groupRef" elements
         */
        public org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef[] getGroupRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GROUPREF$0, targetList);
                org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef[] result = new org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "groupRef" element
         */
        public org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef getGroupRefArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef target = null;
                target = (org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef)get_store().find_element_user(GROUPREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "groupRef" element
         */
        public int sizeOfGroupRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GROUPREF$0);
            }
        }
        
        /**
         * Sets array of all "groupRef" element
         */
        public void setGroupRefArray(org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef[] groupRefArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(groupRefArray, GROUPREF$0);
            }
        }
        
        /**
         * Sets ith "groupRef" element
         */
        public void setGroupRefArray(int i, org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef groupRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef target = null;
                target = (org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef)get_store().find_element_user(GROUPREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(groupRef);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "groupRef" element
         */
        public org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef insertNewGroupRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef target = null;
                target = (org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef)get_store().insert_element_user(GROUPREF$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "groupRef" element
         */
        public org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef addNewGroupRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef target = null;
                target = (org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef)get_store().add_element_user(GROUPREF$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "groupRef" element
         */
        public void removeGroupRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GROUPREF$0, i);
            }
        }
    }
}
