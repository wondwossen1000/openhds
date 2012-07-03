/*
 * An XML document type.
 * Localname: categoryOption
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CategoryOptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one categoryOption(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class CategoryOptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CategoryOptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryOptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYOPTION$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryOption");
    
    
    /**
     * Gets the "categoryOption" element
     */
    public org.dhis2.ns.schema.dxf2.IdentifiableObject getCategoryOption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IdentifiableObject target = null;
            target = (org.dhis2.ns.schema.dxf2.IdentifiableObject)get_store().find_element_user(CATEGORYOPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "categoryOption" element
     */
    public void setCategoryOption(org.dhis2.ns.schema.dxf2.IdentifiableObject categoryOption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IdentifiableObject target = null;
            target = (org.dhis2.ns.schema.dxf2.IdentifiableObject)get_store().find_element_user(CATEGORYOPTION$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.IdentifiableObject)get_store().add_element_user(CATEGORYOPTION$0);
            }
            target.set(categoryOption);
        }
    }
    
    /**
     * Appends and returns a new empty "categoryOption" element
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
}
