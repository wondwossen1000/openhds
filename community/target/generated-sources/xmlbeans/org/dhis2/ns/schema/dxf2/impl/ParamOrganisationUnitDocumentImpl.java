/*
 * An XML document type.
 * Localname: paramOrganisationUnit
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one paramOrganisationUnit(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ParamOrganisationUnitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParamOrganisationUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMORGANISATIONUNIT$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "paramOrganisationUnit");
    
    
    /**
     * Gets the "paramOrganisationUnit" element
     */
    public org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit.Enum getParamOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMORGANISATIONUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "paramOrganisationUnit" element
     */
    public org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit xgetParamOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit target = null;
            target = (org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit)get_store().find_element_user(PARAMORGANISATIONUNIT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "paramOrganisationUnit" element
     */
    public void setParamOrganisationUnit(org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit.Enum paramOrganisationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMORGANISATIONUNIT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMORGANISATIONUNIT$0);
            }
            target.setEnumValue(paramOrganisationUnit);
        }
    }
    
    /**
     * Sets (as xml) the "paramOrganisationUnit" element
     */
    public void xsetParamOrganisationUnit(org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit paramOrganisationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit target = null;
            target = (org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit)get_store().find_element_user(PARAMORGANISATIONUNIT$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit)get_store().add_element_user(PARAMORGANISATIONUNIT$0);
            }
            target.set(paramOrganisationUnit);
        }
    }
    /**
     * An XML paramOrganisationUnit(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument$ParamOrganisationUnit.
     */
    public static class ParamOrganisationUnitImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit
    {
        private static final long serialVersionUID = 1L;
        
        public ParamOrganisationUnitImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ParamOrganisationUnitImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
