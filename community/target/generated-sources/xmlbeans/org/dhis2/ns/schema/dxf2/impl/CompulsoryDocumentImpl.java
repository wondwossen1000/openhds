/*
 * An XML document type.
 * Localname: compulsory
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CompulsoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one compulsory(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class CompulsoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CompulsoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompulsoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPULSORY$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "compulsory");
    
    
    /**
     * Gets the "compulsory" element
     */
    public org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory.Enum getCompulsory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPULSORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "compulsory" element
     */
    public org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory xgetCompulsory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory target = null;
            target = (org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory)get_store().find_element_user(COMPULSORY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "compulsory" element
     */
    public void setCompulsory(org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory.Enum compulsory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPULSORY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPULSORY$0);
            }
            target.setEnumValue(compulsory);
        }
    }
    
    /**
     * Sets (as xml) the "compulsory" element
     */
    public void xsetCompulsory(org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory compulsory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory target = null;
            target = (org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory)get_store().find_element_user(COMPULSORY$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory)get_store().add_element_user(COMPULSORY$0);
            }
            target.set(compulsory);
        }
    }
    /**
     * An XML compulsory(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.CompulsoryDocument$Compulsory.
     */
    public static class CompulsoryImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.CompulsoryDocument.Compulsory
    {
        private static final long serialVersionUID = 1L;
        
        public CompulsoryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CompulsoryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
