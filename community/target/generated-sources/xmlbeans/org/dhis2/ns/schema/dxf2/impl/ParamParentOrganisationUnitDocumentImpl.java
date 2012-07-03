/*
 * An XML document type.
 * Localname: paramParentOrganisationUnit
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one paramParentOrganisationUnit(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ParamParentOrganisationUnitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParamParentOrganisationUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMPARENTORGANISATIONUNIT$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "paramParentOrganisationUnit");
    
    
    /**
     * Gets the "paramParentOrganisationUnit" element
     */
    public org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit.Enum getParamParentOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMPARENTORGANISATIONUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "paramParentOrganisationUnit" element
     */
    public org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit xgetParamParentOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit target = null;
            target = (org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit)get_store().find_element_user(PARAMPARENTORGANISATIONUNIT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "paramParentOrganisationUnit" element
     */
    public void setParamParentOrganisationUnit(org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit.Enum paramParentOrganisationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMPARENTORGANISATIONUNIT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMPARENTORGANISATIONUNIT$0);
            }
            target.setEnumValue(paramParentOrganisationUnit);
        }
    }
    
    /**
     * Sets (as xml) the "paramParentOrganisationUnit" element
     */
    public void xsetParamParentOrganisationUnit(org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit paramParentOrganisationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit target = null;
            target = (org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit)get_store().find_element_user(PARAMPARENTORGANISATIONUNIT$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit)get_store().add_element_user(PARAMPARENTORGANISATIONUNIT$0);
            }
            target.set(paramParentOrganisationUnit);
        }
    }
    /**
     * An XML paramParentOrganisationUnit(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument$ParamParentOrganisationUnit.
     */
    public static class ParamParentOrganisationUnitImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit
    {
        private static final long serialVersionUID = 1L;
        
        public ParamParentOrganisationUnitImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ParamParentOrganisationUnitImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
