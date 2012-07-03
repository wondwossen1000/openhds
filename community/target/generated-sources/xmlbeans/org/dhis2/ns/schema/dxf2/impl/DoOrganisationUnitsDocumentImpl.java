/*
 * An XML document type.
 * Localname: doOrganisationUnits
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one doOrganisationUnits(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DoOrganisationUnitsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DoOrganisationUnitsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOORGANISATIONUNITS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "doOrganisationUnits");
    
    
    /**
     * Gets the "doOrganisationUnits" element
     */
    public org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits.Enum getDoOrganisationUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOORGANISATIONUNITS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "doOrganisationUnits" element
     */
    public org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits xgetDoOrganisationUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits target = null;
            target = (org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits)get_store().find_element_user(DOORGANISATIONUNITS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "doOrganisationUnits" element
     */
    public void setDoOrganisationUnits(org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits.Enum doOrganisationUnits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOORGANISATIONUNITS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOORGANISATIONUNITS$0);
            }
            target.setEnumValue(doOrganisationUnits);
        }
    }
    
    /**
     * Sets (as xml) the "doOrganisationUnits" element
     */
    public void xsetDoOrganisationUnits(org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits doOrganisationUnits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits target = null;
            target = (org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits)get_store().find_element_user(DOORGANISATIONUNITS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits)get_store().add_element_user(DOORGANISATIONUNITS$0);
            }
            target.set(doOrganisationUnits);
        }
    }
    /**
     * An XML doOrganisationUnits(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is an atomic type that is a restriction of org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument$DoOrganisationUnits.
     */
    public static class DoOrganisationUnitsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits
    {
        private static final long serialVersionUID = 1L;
        
        public DoOrganisationUnitsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DoOrganisationUnitsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
