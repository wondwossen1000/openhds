/*
 * An XML document type.
 * Localname: categoryOptions
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CategoryOptionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one categoryOptions(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class CategoryOptionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryOptionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryOptionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML categoryOptions(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class CategoryOptionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions
    {
        private static final long serialVersionUID = 1L;
        
        public CategoryOptionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORYOPTION$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryOption");
        
        
        /**
         * Gets array of all "categoryOption" elements
         */
        public org.dhis2.ns.schema.dxf2.IdentifiableObject[] getCategoryOptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CATEGORYOPTION$0, targetList);
                org.dhis2.ns.schema.dxf2.IdentifiableObject[] result = new org.dhis2.ns.schema.dxf2.IdentifiableObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "categoryOption" element
         */
        public org.dhis2.ns.schema.dxf2.IdentifiableObject getCategoryOptionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IdentifiableObject target = null;
                target = (org.dhis2.ns.schema.dxf2.IdentifiableObject)get_store().find_element_user(CATEGORYOPTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "categoryOption" element
         */
        public int sizeOfCategoryOptionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATEGORYOPTION$0);
            }
        }
        
        /**
         * Sets array of all "categoryOption" element
         */
        public void setCategoryOptionArray(org.dhis2.ns.schema.dxf2.IdentifiableObject[] categoryOptionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(categoryOptionArray, CATEGORYOPTION$0);
            }
        }
        
        /**
         * Sets ith "categoryOption" element
         */
        public void setCategoryOptionArray(int i, org.dhis2.ns.schema.dxf2.IdentifiableObject categoryOption)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IdentifiableObject target = null;
                target = (org.dhis2.ns.schema.dxf2.IdentifiableObject)get_store().find_element_user(CATEGORYOPTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(categoryOption);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "categoryOption" element
         */
        public org.dhis2.ns.schema.dxf2.IdentifiableObject insertNewCategoryOption(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IdentifiableObject target = null;
                target = (org.dhis2.ns.schema.dxf2.IdentifiableObject)get_store().insert_element_user(CATEGORYOPTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "categoryOption" element
         */
        public org.dhis2.ns.schema.dxf2.IdentifiableObject addNewCategoryOption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IdentifiableObject target = null;
                target = (org.dhis2.ns.schema.dxf2.IdentifiableObject)get_store().add_element_user(CATEGORYOPTION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "categoryOption" element
         */
        public void removeCategoryOption(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATEGORYOPTION$0, i);
            }
        }
    }
}
