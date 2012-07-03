/*
 * An XML document type.
 * Localname: groupRef
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.GroupRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one groupRef(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class GroupRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.GroupRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GroupRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUPREF$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "groupRef");
    
    
    /**
     * Gets the "groupRef" element
     */
    public org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef getGroupRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef target = null;
            target = (org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef)get_store().find_element_user(GROUPREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "groupRef" element
     */
    public void setGroupRef(org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef groupRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef target = null;
            target = (org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef)get_store().find_element_user(GROUPREF$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef)get_store().add_element_user(GROUPREF$0);
            }
            target.set(groupRef);
        }
    }
    
    /**
     * Appends and returns a new empty "groupRef" element
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
     * An XML groupRef(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class GroupRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.GroupRefDocument.GroupRef
    {
        private static final long serialVersionUID = 1L;
        
        public GroupRefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REF$0 = 
            new javax.xml.namespace.QName("", "ref");
        
        
        /**
         * Gets the "ref" attribute
         */
        public int getRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "ref" attribute
         */
        public org.dhis2.ns.schema.dxf2.DxfIDRef xgetRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(REF$0);
                return target;
            }
        }
        
        /**
         * Sets the "ref" attribute
         */
        public void setRef(int ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REF$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REF$0);
                }
                target.setIntValue(ref);
            }
        }
        
        /**
         * Sets (as xml) the "ref" attribute
         */
        public void xsetRef(org.dhis2.ns.schema.dxf2.DxfIDRef ref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(REF$0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().add_attribute_user(REF$0);
                }
                target.set(ref);
            }
        }
    }
}
