/*
 * An XML document type.
 * Localname: organisationUnitRelationship
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one organisationUnitRelationship(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class OrganisationUnitRelationshipDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationUnitRelationshipDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONUNITRELATIONSHIP$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnitRelationship");
    
    
    /**
     * Gets the "organisationUnitRelationship" element
     */
    public org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship getOrganisationUnitRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship)get_store().find_element_user(ORGANISATIONUNITRELATIONSHIP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "organisationUnitRelationship" element
     */
    public void setOrganisationUnitRelationship(org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship organisationUnitRelationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship)get_store().find_element_user(ORGANISATIONUNITRELATIONSHIP$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship)get_store().add_element_user(ORGANISATIONUNITRELATIONSHIP$0);
            }
            target.set(organisationUnitRelationship);
        }
    }
    
    /**
     * Appends and returns a new empty "organisationUnitRelationship" element
     */
    public org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship addNewOrganisationUnitRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship)get_store().add_element_user(ORGANISATIONUNITRELATIONSHIP$0);
            return target;
        }
    }
    /**
     * An XML organisationUnitRelationship(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class OrganisationUnitRelationshipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship
    {
        private static final long serialVersionUID = 1L;
        
        public OrganisationUnitRelationshipImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARENT$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "parent");
        private static final javax.xml.namespace.QName CHILD$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "child");
        
        
        /**
         * Gets the "parent" element
         */
        public java.math.BigInteger getParent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "parent" element
         */
        public org.apache.xmlbeans.XmlInteger xgetParent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PARENT$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "parent" element
         */
        public void setParent(java.math.BigInteger parent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARENT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARENT$0);
                }
                target.setBigIntegerValue(parent);
            }
        }
        
        /**
         * Sets (as xml) the "parent" element
         */
        public void xsetParent(org.apache.xmlbeans.XmlInteger parent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(PARENT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(PARENT$0);
                }
                target.set(parent);
            }
        }
        
        /**
         * Gets the "child" element
         */
        public java.math.BigInteger getChild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILD$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "child" element
         */
        public org.apache.xmlbeans.XmlInteger xgetChild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CHILD$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "child" element
         */
        public void setChild(java.math.BigInteger child)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHILD$2);
                }
                target.setBigIntegerValue(child);
            }
        }
        
        /**
         * Sets (as xml) the "child" element
         */
        public void xsetChild(org.apache.xmlbeans.XmlInteger child)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(CHILD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(CHILD$2);
                }
                target.set(child);
            }
        }
    }
}
