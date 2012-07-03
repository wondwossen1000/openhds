/*
 * An XML document type.
 * Localname: categoryCombo
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CategoryComboDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one categoryCombo(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class CategoryComboDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryComboDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryComboDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYCOMBO$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryCombo");
    
    
    /**
     * Gets the "categoryCombo" element
     */
    public org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo getCategoryCombo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo)get_store().find_element_user(CATEGORYCOMBO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "categoryCombo" element
     */
    public void setCategoryCombo(org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo categoryCombo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo target = null;
            target = (org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo)get_store().find_element_user(CATEGORYCOMBO$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo)get_store().add_element_user(CATEGORYCOMBO$0);
            }
            target.set(categoryCombo);
        }
    }
    
    /**
     * Appends and returns a new empty "categoryCombo" element
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
     * An XML categoryCombo(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class CategoryComboImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo
    {
        private static final long serialVersionUID = 1L;
        
        public CategoryComboImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "id");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "name");
        private static final javax.xml.namespace.QName CATEGORYREFS$4 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryRefs");
        
        
        /**
         * Gets the "id" element
         */
        public int getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public org.dhis2.ns.schema.dxf2.DxfID xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfID target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_element_user(ID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(int id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                }
                target.setIntValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(org.dhis2.ns.schema.dxf2.DxfID id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfID target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "categoryRefs" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs getCategoryRefs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs)get_store().find_element_user(CATEGORYREFS$4, 0);
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
                target = (org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs)get_store().find_element_user(CATEGORYREFS$4, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs)get_store().add_element_user(CATEGORYREFS$4);
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
                target = (org.dhis2.ns.schema.dxf2.CategoryRefsDocument.CategoryRefs)get_store().add_element_user(CATEGORYREFS$4);
                return target;
            }
        }
    }
}
