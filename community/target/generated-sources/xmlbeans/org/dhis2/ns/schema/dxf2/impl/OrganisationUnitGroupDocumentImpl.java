/*
 * An XML document type.
 * Localname: organisationUnitGroup
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one organisationUnitGroup(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class OrganisationUnitGroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationUnitGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONUNITGROUP$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnitGroup");
    
    
    /**
     * Gets the "organisationUnitGroup" element
     */
    public org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup getOrganisationUnitGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup)get_store().find_element_user(ORGANISATIONUNITGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "organisationUnitGroup" element
     */
    public void setOrganisationUnitGroup(org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup organisationUnitGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup)get_store().find_element_user(ORGANISATIONUNITGROUP$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup)get_store().add_element_user(ORGANISATIONUNITGROUP$0);
            }
            target.set(organisationUnitGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "organisationUnitGroup" element
     */
    public org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup addNewOrganisationUnitGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup)get_store().add_element_user(ORGANISATIONUNITGROUP$0);
            return target;
        }
    }
    /**
     * An XML organisationUnitGroup(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class OrganisationUnitGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitGroupDocument.OrganisationUnitGroup
    {
        private static final long serialVersionUID = 1L;
        
        public OrganisationUnitGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UUID$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "uuid");
        private static final javax.xml.namespace.QName NAME$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "name");
        private static final javax.xml.namespace.QName ORGUNITS$4 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "orgUnits");
        private static final javax.xml.namespace.QName ID$6 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "uuid" element
         */
        public java.lang.String getUuid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UUID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "uuid" element
         */
        public org.apache.xmlbeans.XmlString xgetUuid()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UUID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "uuid" element
         */
        public void setUuid(java.lang.String uuid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UUID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UUID$0);
                }
                target.setStringValue(uuid);
            }
        }
        
        /**
         * Sets (as xml) the "uuid" element
         */
        public void xsetUuid(org.apache.xmlbeans.XmlString uuid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(UUID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(UUID$0);
                }
                target.set(uuid);
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
         * Gets the "orgUnits" element
         */
        public org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits getOrgUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits target = null;
                target = (org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits)get_store().find_element_user(ORGUNITS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "orgUnits" element
         */
        public void setOrgUnits(org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits orgUnits)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits target = null;
                target = (org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits)get_store().find_element_user(ORGUNITS$4, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits)get_store().add_element_user(ORGUNITS$4);
                }
                target.set(orgUnits);
            }
        }
        
        /**
         * Appends and returns a new empty "orgUnits" element
         */
        public org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits addNewOrgUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits target = null;
                target = (org.dhis2.ns.schema.dxf2.OrgUnitsDocument.OrgUnits)get_store().add_element_user(ORGUNITS$4);
                return target;
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public int getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.dhis2.ns.schema.dxf2.DxfID xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfID target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_attribute_user(ID$6);
                return target;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(int id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
                }
                target.setIntValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.dhis2.ns.schema.dxf2.DxfID id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfID target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_attribute_user(ID$6);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().add_attribute_user(ID$6);
                }
                target.set(id);
            }
        }
    }
}
