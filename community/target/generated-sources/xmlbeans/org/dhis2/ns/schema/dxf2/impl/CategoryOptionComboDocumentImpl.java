/*
 * An XML document type.
 * Localname: categoryOptionCombo
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one categoryOptionCombo(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class CategoryOptionComboDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryOptionComboDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYOPTIONCOMBO$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryOptionCombo");
    
    
    /**
     * Gets the "categoryOptionCombo" element
     */
    public org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo getCategoryOptionCombo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo)get_store().find_element_user(CATEGORYOPTIONCOMBO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "categoryOptionCombo" element
     */
    public void setCategoryOptionCombo(org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo categoryOptionCombo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo)get_store().find_element_user(CATEGORYOPTIONCOMBO$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo)get_store().add_element_user(CATEGORYOPTIONCOMBO$0);
            }
            target.set(categoryOptionCombo);
        }
    }
    
    /**
     * Appends and returns a new empty "categoryOptionCombo" element
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
     * An XML categoryOptionCombo(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class CategoryOptionComboImpl extends org.dhis2.ns.schema.dxf2.impl.IdentifiableObjectImpl implements org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo
    {
        private static final long serialVersionUID = 1L;
        
        public CategoryOptionComboImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORYCOMBO$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryCombo");
        private static final javax.xml.namespace.QName CATEGORYOPTIONS$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryOptions");
        private static final javax.xml.namespace.QName CATEGORYCOMBOREF$4 = 
            new javax.xml.namespace.QName("", "categoryComboRef");
        
        
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
        
        /**
         * Gets array of all "categoryOptions" elements
         */
        public org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions[] getCategoryOptionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CATEGORYOPTIONS$2, targetList);
                org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions[] result = new org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "categoryOptions" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions getCategoryOptionsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions)get_store().find_element_user(CATEGORYOPTIONS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "categoryOptions" element
         */
        public int sizeOfCategoryOptionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATEGORYOPTIONS$2);
            }
        }
        
        /**
         * Sets array of all "categoryOptions" element
         */
        public void setCategoryOptionsArray(org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions[] categoryOptionsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(categoryOptionsArray, CATEGORYOPTIONS$2);
            }
        }
        
        /**
         * Sets ith "categoryOptions" element
         */
        public void setCategoryOptionsArray(int i, org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions categoryOptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions)get_store().find_element_user(CATEGORYOPTIONS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(categoryOptions);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "categoryOptions" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions insertNewCategoryOptions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions)get_store().insert_element_user(CATEGORYOPTIONS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "categoryOptions" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions addNewCategoryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions)get_store().add_element_user(CATEGORYOPTIONS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "categoryOptions" element
         */
        public void removeCategoryOptions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATEGORYOPTIONS$2, i);
            }
        }
        
        /**
         * Gets the "categoryComboRef" attribute
         */
        public int getCategoryComboRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORYCOMBOREF$4);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "categoryComboRef" attribute
         */
        public org.dhis2.ns.schema.dxf2.DxfIDRef xgetCategoryComboRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(CATEGORYCOMBOREF$4);
                return target;
            }
        }
        
        /**
         * Sets the "categoryComboRef" attribute
         */
        public void setCategoryComboRef(int categoryComboRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATEGORYCOMBOREF$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATEGORYCOMBOREF$4);
                }
                target.setIntValue(categoryComboRef);
            }
        }
        
        /**
         * Sets (as xml) the "categoryComboRef" attribute
         */
        public void xsetCategoryComboRef(org.dhis2.ns.schema.dxf2.DxfIDRef categoryComboRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(CATEGORYCOMBOREF$4);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().add_attribute_user(CATEGORYCOMBOREF$4);
                }
                target.set(categoryComboRef);
            }
        }
    }
}
