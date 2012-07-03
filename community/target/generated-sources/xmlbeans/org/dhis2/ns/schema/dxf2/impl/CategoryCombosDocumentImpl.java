/*
 * An XML document type.
 * Localname: categoryCombos
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CategoryCombosDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one categoryCombos(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class CategoryCombosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryCombosDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryCombosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYCOMBOS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryCombos");
    
    
    /**
     * Gets the "categoryCombos" element
     */
    public org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos getCategoryCombos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos)get_store().find_element_user(CATEGORYCOMBOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "categoryCombos" element
     */
    public void setCategoryCombos(org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos categoryCombos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos)get_store().find_element_user(CATEGORYCOMBOS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos)get_store().add_element_user(CATEGORYCOMBOS$0);
            }
            target.set(categoryCombos);
        }
    }
    
    /**
     * Appends and returns a new empty "categoryCombos" element
     */
    public org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos addNewCategoryCombos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos)get_store().add_element_user(CATEGORYCOMBOS$0);
            return target;
        }
    }
    /**
     * An XML categoryCombos(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class CategoryCombosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos
    {
        private static final long serialVersionUID = 1L;
        
        public CategoryCombosImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORYCOMBO$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryCombo");
        
        
        /**
         * Gets array of all "categoryCombo" elements
         */
        public org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo[] getCategoryComboArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CATEGORYCOMBO$0, targetList);
                org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo[] result = new org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "categoryCombo" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo getCategoryComboArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo)get_store().find_element_user(CATEGORYCOMBO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "categoryCombo" element
         */
        public int sizeOfCategoryComboArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATEGORYCOMBO$0);
            }
        }
        
        /**
         * Sets array of all "categoryCombo" element
         */
        public void setCategoryComboArray(org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo[] categoryComboArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(categoryComboArray, CATEGORYCOMBO$0);
            }
        }
        
        /**
         * Sets ith "categoryCombo" element
         */
        public void setCategoryComboArray(int i, org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo categoryCombo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo)get_store().find_element_user(CATEGORYCOMBO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(categoryCombo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "categoryCombo" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo insertNewCategoryCombo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo)get_store().insert_element_user(CATEGORYCOMBO$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "categoryCombo" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo addNewCategoryCombo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo)get_store().add_element_user(CATEGORYCOMBO$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "categoryCombo" element
         */
        public void removeCategoryCombo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATEGORYCOMBO$0, i);
            }
        }
    }
}
