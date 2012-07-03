/*
 * An XML document type.
 * Localname: categoryRef
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CategoryRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one categoryRef(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class CategoryRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYREF$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryRef");
    
    
    /**
     * Gets the "categoryRef" element
     */
    public org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef getCategoryRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef)get_store().find_element_user(CATEGORYREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "categoryRef" element
     */
    public void setCategoryRef(org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef categoryRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef)get_store().find_element_user(CATEGORYREF$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef)get_store().add_element_user(CATEGORYREF$0);
            }
            target.set(categoryRef);
        }
    }
    
    /**
     * Appends and returns a new empty "categoryRef" element
     */
    public org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef addNewCategoryRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef)get_store().add_element_user(CATEGORYREF$0);
            return target;
        }
    }
    /**
     * An XML categoryRef(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class CategoryRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef
    {
        private static final long serialVersionUID = 1L;
        
        public CategoryRefImpl(org.apache.xmlbeans.SchemaType sType)
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
