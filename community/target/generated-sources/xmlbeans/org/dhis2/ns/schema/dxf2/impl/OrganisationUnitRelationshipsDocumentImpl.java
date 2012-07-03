/*
 * An XML document type.
 * Localname: organisationUnitRelationships
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one organisationUnitRelationships(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class OrganisationUnitRelationshipsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationUnitRelationshipsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONUNITRELATIONSHIPS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnitRelationships");
    
    
    /**
     * Gets the "organisationUnitRelationships" element
     */
    public org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships getOrganisationUnitRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships)get_store().find_element_user(ORGANISATIONUNITRELATIONSHIPS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "organisationUnitRelationships" element
     */
    public void setOrganisationUnitRelationships(org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships organisationUnitRelationships)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships)get_store().find_element_user(ORGANISATIONUNITRELATIONSHIPS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships)get_store().add_element_user(ORGANISATIONUNITRELATIONSHIPS$0);
            }
            target.set(organisationUnitRelationships);
        }
    }
    
    /**
     * Appends and returns a new empty "organisationUnitRelationships" element
     */
    public org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships addNewOrganisationUnitRelationships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships)get_store().add_element_user(ORGANISATIONUNITRELATIONSHIPS$0);
            return target;
        }
    }
    /**
     * An XML organisationUnitRelationships(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class OrganisationUnitRelationshipsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships
    {
        private static final long serialVersionUID = 1L;
        
        public OrganisationUnitRelationshipsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANISATIONUNITRELATIONSHIP$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnitRelationship");
        
        
        /**
         * Gets array of all "organisationUnitRelationship" elements
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship[] getOrganisationUnitRelationshipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORGANISATIONUNITRELATIONSHIP$0, targetList);
                org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship[] result = new org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "organisationUnitRelationship" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship getOrganisationUnitRelationshipArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship)get_store().find_element_user(ORGANISATIONUNITRELATIONSHIP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "organisationUnitRelationship" element
         */
        public int sizeOfOrganisationUnitRelationshipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANISATIONUNITRELATIONSHIP$0);
            }
        }
        
        /**
         * Sets array of all "organisationUnitRelationship" element
         */
        public void setOrganisationUnitRelationshipArray(org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship[] organisationUnitRelationshipArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(organisationUnitRelationshipArray, ORGANISATIONUNITRELATIONSHIP$0);
            }
        }
        
        /**
         * Sets ith "organisationUnitRelationship" element
         */
        public void setOrganisationUnitRelationshipArray(int i, org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship organisationUnitRelationship)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship)get_store().find_element_user(ORGANISATIONUNITRELATIONSHIP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(organisationUnitRelationship);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "organisationUnitRelationship" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship insertNewOrganisationUnitRelationship(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipDocument.OrganisationUnitRelationship)get_store().insert_element_user(ORGANISATIONUNITRELATIONSHIP$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "organisationUnitRelationship" element
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
         * Removes the ith "organisationUnitRelationship" element
         */
        public void removeOrganisationUnitRelationship(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANISATIONUNITRELATIONSHIP$0, i);
            }
        }
    }
}
