/*
 * An XML document type.
 * Localname: categories
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CategoriesDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one categories(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class CategoriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoriesDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoriesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORIES$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categories");
    
    
    /**
     * Gets the "categories" element
     */
    public org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories getCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories)get_store().find_element_user(CATEGORIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "categories" element
     */
    public void setCategories(org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories categories)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories)get_store().find_element_user(CATEGORIES$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories)get_store().add_element_user(CATEGORIES$0);
            }
            target.set(categories);
        }
    }
    
    /**
     * Appends and returns a new empty "categories" element
     */
    public org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories addNewCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories)get_store().add_element_user(CATEGORIES$0);
            return target;
        }
    }
    /**
     * An XML categories(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class CategoriesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories
    {
        private static final long serialVersionUID = 1L;
        
        public CategoriesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORY$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "category");
        
        
        /**
         * Gets array of all "category" elements
         */
        public org.dhis2.ns.schema.dxf2.CategoryDocument.Category[] getCategoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CATEGORY$0, targetList);
                org.dhis2.ns.schema.dxf2.CategoryDocument.Category[] result = new org.dhis2.ns.schema.dxf2.CategoryDocument.Category[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "category" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryDocument.Category getCategoryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryDocument.Category target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryDocument.Category)get_store().find_element_user(CATEGORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "category" element
         */
        public int sizeOfCategoryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATEGORY$0);
            }
        }
        
        /**
         * Sets array of all "category" element
         */
        public void setCategoryArray(org.dhis2.ns.schema.dxf2.CategoryDocument.Category[] categoryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(categoryArray, CATEGORY$0);
            }
        }
        
        /**
         * Sets ith "category" element
         */
        public void setCategoryArray(int i, org.dhis2.ns.schema.dxf2.CategoryDocument.Category category)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryDocument.Category target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryDocument.Category)get_store().find_element_user(CATEGORY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(category);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "category" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryDocument.Category insertNewCategory(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryDocument.Category target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryDocument.Category)get_store().insert_element_user(CATEGORY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "category" element
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
         * Removes the ith "category" element
         */
        public void removeCategory(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATEGORY$0, i);
            }
        }
    }
}
