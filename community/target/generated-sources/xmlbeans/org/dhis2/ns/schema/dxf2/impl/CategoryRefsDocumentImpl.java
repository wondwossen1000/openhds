/*
 * An XML document type.
 * Localname: categoryRefs
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CategoryRefsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one categoryRefs(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class CategoryRefsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryRefsDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryRefsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYREFS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryRefs");
    
    
    /**
     * Gets the "categoryRefs" element
     */
    public org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs getCategoryRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs)get_store().find_element_user(CATEGORYREFS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "categoryRefs" element
     */
    public void setCategoryRefs(org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs categoryRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs)get_store().find_element_user(CATEGORYREFS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs)get_store().add_element_user(CATEGORYREFS$0);
            }
            target.set(categoryRefs);
        }
    }
    
    /**
     * Appends and returns a new empty "categoryRefs" element
     */
    public org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs addNewCategoryRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs)get_store().add_element_user(CATEGORYREFS$0);
            return target;
        }
    }
    /**
     * An XML categoryRefs(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class CategoryRefsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs
    {
        private static final long serialVersionUID = 1L;
        
        public CategoryRefsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORYREF$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryRef");
        
        
        /**
         * Gets array of all "categoryRef" elements
         */
        public org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef[] getCategoryRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CATEGORYREF$0, targetList);
                org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef[] result = new org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "categoryRef" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef getCategoryRefArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef)get_store().find_element_user(CATEGORYREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "categoryRef" element
         */
        public int sizeOfCategoryRefArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATEGORYREF$0);
            }
        }
        
        /**
         * Sets array of all "categoryRef" element
         */
        public void setCategoryRefArray(org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef[] categoryRefArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(categoryRefArray, CATEGORYREF$0);
            }
        }
        
        /**
         * Sets ith "categoryRef" element
         */
        public void setCategoryRefArray(int i, org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef categoryRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef)get_store().find_element_user(CATEGORYREF$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(categoryRef);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "categoryRef" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef insertNewCategoryRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryRefDocument.CategoryRef)get_store().insert_element_user(CATEGORYREF$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "categoryRef" element
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
         * Removes the ith "categoryRef" element
         */
        public void removeCategoryRef(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATEGORYREF$0, i);
            }
        }
    }
}
