/*
 * An XML document type.
 * Localname: category
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CategoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one category(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class CategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "category");
    
    
    /**
     * Gets the "category" element
     */
    public org.dhis2.ns.schema.dxf2.CategoryDocument.Category getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryDocument.Category target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryDocument.Category)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "category" element
     */
    public void setCategory(org.dhis2.ns.schema.dxf2.CategoryDocument.Category category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryDocument.Category target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryDocument.Category)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.CategoryDocument.Category)get_store().add_element_user(CATEGORY$0);
            }
            target.set(category);
        }
    }
    
    /**
     * Appends and returns a new empty "category" element
     */
    public org.dhis2.ns.schema.dxf2.CategoryDocument.Category addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryDocument.Category target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryDocument.Category)get_store().add_element_user(CATEGORY$0);
            return target;
        }
    }
    /**
     * An XML category(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class CategoryImpl extends org.dhis2.ns.schema.dxf2.impl.IdentifiableObjectImpl implements org.dhis2.ns.schema.dxf2.CategoryDocument.Category
    {
        private static final long serialVersionUID = 1L;
        
        public CategoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORYOPTIONS$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryOptions");
        
        
        /**
         * Gets the "categoryOptions" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions getCategoryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions)get_store().find_element_user(CATEGORYOPTIONS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "categoryOptions" element
         */
        public void setCategoryOptions(org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions categoryOptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions)get_store().find_element_user(CATEGORYOPTIONS$0, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions)get_store().add_element_user(CATEGORYOPTIONS$0);
                }
                target.set(categoryOptions);
            }
        }
        
        /**
         * Appends and returns a new empty "categoryOptions" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions addNewCategoryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions)get_store().add_element_user(CATEGORYOPTIONS$0);
                return target;
            }
        }
    }
}
