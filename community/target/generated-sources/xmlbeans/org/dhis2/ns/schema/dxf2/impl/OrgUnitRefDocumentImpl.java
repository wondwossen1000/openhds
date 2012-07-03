/*
 * An XML document type.
 * Localname: orgUnitRef
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrgUnitRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one orgUnitRef(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class OrgUnitRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrgUnitRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrgUnitRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGUNITREF$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "orgUnitRef");
    
    
    /**
     * Gets the "orgUnitRef" element
     */
    public org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef getOrgUnitRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef target = null;
            target = (org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef)get_store().find_element_user(ORGUNITREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "orgUnitRef" element
     */
    public void setOrgUnitRef(org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef orgUnitRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef target = null;
            target = (org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef)get_store().find_element_user(ORGUNITREF$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef)get_store().add_element_user(ORGUNITREF$0);
            }
            target.set(orgUnitRef);
        }
    }
    
    /**
     * Appends and returns a new empty "orgUnitRef" element
     */
    public org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef addNewOrgUnitRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef target = null;
            target = (org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef)get_store().add_element_user(ORGUNITREF$0);
            return target;
        }
    }
    /**
     * An XML orgUnitRef(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class OrgUnitRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrgUnitRefDocument.OrgUnitRef
    {
        private static final long serialVersionUID = 1L;
        
        public OrgUnitRefImpl(org.apache.xmlbeans.SchemaType sType)
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
