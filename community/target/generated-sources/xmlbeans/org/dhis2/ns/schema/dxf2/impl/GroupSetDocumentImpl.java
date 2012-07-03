/*
 * An XML document type.
 * Localname: groupSet
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.GroupSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one groupSet(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class GroupSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.GroupSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPSET$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "groupSet");
    
    
    /**
     * Gets the "groupSet" element
     */
    public org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet getGroupSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet target = null;
            target = (org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet)get_store().find_element_user(GROUPSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "groupSet" element
     */
    public void setGroupSet(org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet groupSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet target = null;
            target = (org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet)get_store().find_element_user(GROUPSET$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet)get_store().add_element_user(GROUPSET$0);
            }
            target.set(groupSet);
        }
    }
    
    /**
     * Appends and returns a new empty "groupSet" element
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
     * An XML groupSet(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class GroupSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.GroupSetDocument.GroupSet
    {
        private static final long serialVersionUID = 1L;
        
        public GroupSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "description");
        private static final javax.xml.namespace.QName COMPULSORY$4 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "compulsory");
        private static final javax.xml.namespace.QName EXCLUSIVE$6 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "exclusive");
        private static final javax.xml.namespace.QName GROUPS$8 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "groups");
        private static final javax.xml.namespace.QName ID$10 = 
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
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
                }
                target.set(description);
            }
        }
        
        /**
         * Gets the "compulsory" element
         */
        public org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory.Enum getCompulsory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPULSORY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "compulsory" element
         */
        public org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory xgetCompulsory()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory target = null;
                target = (org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory)get_store().find_element_user(COMPULSORY$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "compulsory" element
         */
        public void setCompulsory(org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory.Enum compulsory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPULSORY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPULSORY$4);
                }
                target.setEnumValue(compulsory);
            }
        }
        
        /**
         * Sets (as xml) the "compulsory" element
         */
        public void xsetCompulsory(org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory compulsory)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory target = null;
                target = (org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory)get_store().find_element_user(COMPULSORY$4, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory)get_store().add_element_user(COMPULSORY$4);
                }
                target.set(compulsory);
            }
        }
        
        /**
         * Gets the "exclusive" element
         */
        public org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive.Enum getExclusive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCLUSIVE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "exclusive" element
         */
        public org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive xgetExclusive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive target = null;
                target = (org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive)get_store().find_element_user(EXCLUSIVE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "exclusive" element
         */
        public void setExclusive(org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive.Enum exclusive)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCLUSIVE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCLUSIVE$6);
                }
                target.setEnumValue(exclusive);
            }
        }
        
        /**
         * Sets (as xml) the "exclusive" element
         */
        public void xsetExclusive(org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive exclusive)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive target = null;
                target = (org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive)get_store().find_element_user(EXCLUSIVE$6, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive)get_store().add_element_user(EXCLUSIVE$6);
                }
                target.set(exclusive);
            }
        }
        
        /**
         * Gets the "groups" element
         */
        public org.dhis2.ns.schema.dxf2.GroupsDocument.Groups getGroups()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.GroupsDocument.Groups target = null;
                target = (org.dhis2.ns.schema.dxf2.GroupsDocument.Groups)get_store().find_element_user(GROUPS$8, 0);
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
                target = (org.dhis2.ns.schema.dxf2.GroupsDocument.Groups)get_store().find_element_user(GROUPS$8, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.GroupsDocument.Groups)get_store().add_element_user(GROUPS$8);
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
                target = (org.dhis2.ns.schema.dxf2.GroupsDocument.Groups)get_store().add_element_user(GROUPS$8);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
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
                target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_attribute_user(ID$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
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
                target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_attribute_user(ID$10);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().add_attribute_user(ID$10);
                }
                target.set(id);
            }
        }
    }
}
