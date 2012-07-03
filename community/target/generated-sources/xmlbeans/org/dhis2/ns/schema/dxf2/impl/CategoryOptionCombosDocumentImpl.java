/*
 * An XML document type.
 * Localname: categoryOptionCombos
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one categoryOptionCombos(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class CategoryOptionCombosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryOptionCombosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYOPTIONCOMBOS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryOptionCombos");
    
    
    /**
     * Gets the "categoryOptionCombos" element
     */
    public org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos getCategoryOptionCombos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos)get_store().find_element_user(CATEGORYOPTIONCOMBOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "categoryOptionCombos" element
     */
    public void setCategoryOptionCombos(org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos categoryOptionCombos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos)get_store().find_element_user(CATEGORYOPTIONCOMBOS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos)get_store().add_element_user(CATEGORYOPTIONCOMBOS$0);
            }
            target.set(categoryOptionCombos);
        }
    }
    
    /**
     * Appends and returns a new empty "categoryOptionCombos" element
     */
    public org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos addNewCategoryOptionCombos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos)get_store().add_element_user(CATEGORYOPTIONCOMBOS$0);
            return target;
        }
    }
    /**
     * An XML categoryOptionCombos(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class CategoryOptionCombosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos
    {
        private static final long serialVersionUID = 1L;
        
        public CategoryOptionCombosImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORYOPTIONCOMBO$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryOptionCombo");
        
        
        /**
         * Gets array of all "categoryOptionCombo" elements
         */
        public org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo[] getCategoryOptionComboArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CATEGORYOPTIONCOMBO$0, targetList);
                org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo[] result = new org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "categoryOptionCombo" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo getCategoryOptionComboArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo)get_store().find_element_user(CATEGORYOPTIONCOMBO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "categoryOptionCombo" element
         */
        public int sizeOfCategoryOptionComboArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATEGORYOPTIONCOMBO$0);
            }
        }
        
        /**
         * Sets array of all "categoryOptionCombo" element
         */
        public void setCategoryOptionComboArray(org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo[] categoryOptionComboArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(categoryOptionComboArray, CATEGORYOPTIONCOMBO$0);
            }
        }
        
        /**
         * Sets ith "categoryOptionCombo" element
         */
        public void setCategoryOptionComboArray(int i, org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo categoryOptionCombo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo)get_store().find_element_user(CATEGORYOPTIONCOMBO$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(categoryOptionCombo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "categoryOptionCombo" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo insertNewCategoryOptionCombo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo)get_store().insert_element_user(CATEGORYOPTIONCOMBO$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "categoryOptionCombo" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo addNewCategoryOptionCombo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo)get_store().add_element_user(CATEGORYOPTIONCOMBO$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "categoryOptionCombo" element
         */
        public void removeCategoryOptionCombo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATEGORYOPTIONCOMBO$0, i);
            }
        }
    }
}
