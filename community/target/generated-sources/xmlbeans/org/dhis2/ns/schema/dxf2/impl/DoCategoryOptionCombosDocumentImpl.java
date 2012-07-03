/*
 * An XML document type.
 * Localname: doCategoryOptionCombos
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one doCategoryOptionCombos(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DoCategoryOptionCombosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument
{
    private static final long serialVersionUID = 1L;
    
    public DoCategoryOptionCombosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCATEGORYOPTIONCOMBOS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "doCategoryOptionCombos");
    
    
    /**
     * Gets the "doCategoryOptionCombos" element
     */
    public org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos.Enum getDoCategoryOptionCombos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCATEGORYOPTIONCOMBOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "doCategoryOptionCombos" element
     */
    public org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos xgetDoCategoryOptionCombos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos target = null;
            target = (org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos)get_store().find_element_user(DOCATEGORYOPTIONCOMBOS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "doCategoryOptionCombos" element
     */
    public void setDoCategoryOptionCombos(org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos.Enum doCategoryOptionCombos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCATEGORYOPTIONCOMBOS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCATEGORYOPTIONCOMBOS$0);
            }
            target.setEnumValue(doCategoryOptionCombos);
        }
    }
    
    /**
     * Sets (as xml) the "doCategoryOptionCombos" element
     */
    public void xsetDoCategoryOptionCombos(org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos doCategoryOptionCombos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos target = null;
            target = (org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos)get_store().find_element_user(DOCATEGORYOPTIONCOMBOS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos)get_store().add_element_user(DOCATEGORYOPTIONCOMBOS$0);
            }
            target.set(doCategoryOptionCombos);
        }
    }
    /**
     * An XML doCategoryOptionCombos(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument$DoCategoryOptionCombos.
     */
    public static class DoCategoryOptionCombosImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos
    {
        private static final long serialVersionUID = 1L;
        
        public DoCategoryOptionCombosImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DoCategoryOptionCombosImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
