/*
 * An XML document type.
 * Localname: categoryOptionRef
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CategoryOptionRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one categoryOptionRef(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class CategoryOptionRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryOptionRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryOptionRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYOPTIONREF$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryOptionRef");
    
    
    /**
     * Gets the "categoryOptionRef" element
     */
    public org.dhis2.ns.schema.dxf2.CategoryOptionRefDocument.CategoryOptionRef getCategoryOptionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryOptionRefDocument.CategoryOptionRef target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryOptionRefDocument.CategoryOptionRef)get_store().find_element_user(CATEGORYOPTIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "categoryOptionRef" element
     */
    public void setCategoryOptionRef(org.dhis2.ns.schema.dxf2.CategoryOptionRefDocument.CategoryOptionRef categoryOptionRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryOptionRefDocument.CategoryOptionRef target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryOptionRefDocument.CategoryOptionRef)get_store().find_element_user(CATEGORYOPTIONREF$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionRefDocument.CategoryOptionRef)get_store().add_element_user(CATEGORYOPTIONREF$0);
            }
            target.set(categoryOptionRef);
        }
    }
    
    /**
     * Appends and returns a new empty "categoryOptionRef" element
     */
    public org.dhis2.ns.schema.dxf2.CategoryOptionRefDocument.CategoryOptionRef addNewCategoryOptionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryOptionRefDocument.CategoryOptionRef target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryOptionRefDocument.CategoryOptionRef)get_store().add_element_user(CATEGORYOPTIONREF$0);
            return target;
        }
    }
    /**
     * An XML categoryOptionRef(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class CategoryOptionRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryOptionRefDocument.CategoryOptionRef
    {
        private static final long serialVersionUID = 1L;
        
        public CategoryOptionRefImpl(org.apache.xmlbeans.SchemaType sType)
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
