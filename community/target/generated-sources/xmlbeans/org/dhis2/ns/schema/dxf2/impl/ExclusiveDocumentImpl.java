/*
 * An XML document type.
 * Localname: exclusive
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ExclusiveDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one exclusive(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ExclusiveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ExclusiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExclusiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCLUSIVE$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "exclusive");
    
    
    /**
     * Gets the "exclusive" element
     */
    public org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive.Enum getExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCLUSIVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "exclusive" element
     */
    public org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive xgetExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive target = null;
            target = (org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive)get_store().find_element_user(EXCLUSIVE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "exclusive" element
     */
    public void setExclusive(org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive.Enum exclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCLUSIVE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCLUSIVE$0);
            }
            target.setEnumValue(exclusive);
        }
    }
    
    /**
     * Sets (as xml) the "exclusive" element
     */
    public void xsetExclusive(org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive exclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive target = null;
            target = (org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive)get_store().find_element_user(EXCLUSIVE$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive)get_store().add_element_user(EXCLUSIVE$0);
            }
            target.set(exclusive);
        }
    }
    /**
     * An XML exclusive(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.ExclusiveDocument$Exclusive.
     */
    public static class ExclusiveImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.ExclusiveDocument.Exclusive
    {
        private static final long serialVersionUID = 1L;
        
        public ExclusiveImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ExclusiveImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
