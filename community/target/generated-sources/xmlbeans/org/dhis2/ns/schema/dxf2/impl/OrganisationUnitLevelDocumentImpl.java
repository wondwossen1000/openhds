/*
 * An XML document type.
 * Localname: organisationUnitLevel
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one organisationUnitLevel(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class OrganisationUnitLevelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationUnitLevelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONUNITLEVEL$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnitLevel");
    
    
    /**
     * Gets the "organisationUnitLevel" element
     */
    public org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel getOrganisationUnitLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel)get_store().find_element_user(ORGANISATIONUNITLEVEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "organisationUnitLevel" element
     */
    public void setOrganisationUnitLevel(org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel organisationUnitLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel)get_store().find_element_user(ORGANISATIONUNITLEVEL$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel)get_store().add_element_user(ORGANISATIONUNITLEVEL$0);
            }
            target.set(organisationUnitLevel);
        }
    }
    
    /**
     * Appends and returns a new empty "organisationUnitLevel" element
     */
    public org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel addNewOrganisationUnitLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel)get_store().add_element_user(ORGANISATIONUNITLEVEL$0);
            return target;
        }
    }
    /**
     * An XML organisationUnitLevel(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class OrganisationUnitLevelImpl extends org.dhis2.ns.schema.dxf2.impl.IdentifiableObjectImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel
    {
        private static final long serialVersionUID = 1L;
        
        public OrganisationUnitLevelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "name");
        private static final javax.xml.namespace.QName LEVEL$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "level");
        
        
        /**
         * Gets first "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) first "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Gets array of all "name" elements
         */
        public java.lang.String[] getNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$0, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "name" element
         */
        public java.lang.String getNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "name" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NAME$0, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "name" element
         */
        public org.apache.xmlbeans.XmlString xgetNameArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "name" element
         */
        public int sizeOfNameArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAME$0);
            }
        }
        
        /**
         * Sets first "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) first "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Sets array of all "name" element
         */
        public void setNameArray(java.lang.String[] nameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$0);
            }
        }
        
        /**
         * Sets ith "name" element
         */
        public void setNameArray(int i, java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) array of all "name" element
         */
        public void xsetNameArray(org.apache.xmlbeans.XmlString[]nameArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(nameArray, NAME$0);
            }
        }
        
        /**
         * Sets (as xml) ith "name" element
         */
        public void xsetNameArray(int i, org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(name);
            }
        }
        
        /**
         * Inserts the value as the ith "name" element
         */
        public void insertName(int i, java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NAME$0, i);
                target.setStringValue(name);
            }
        }
        
        /**
         * Appends the value as the last "name" element
         */
        public void addName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                target.setStringValue(name);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        public org.apache.xmlbeans.XmlString insertNewName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(NAME$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        public org.apache.xmlbeans.XmlString addNewName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "name" element
         */
        public void removeName(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAME$0, i);
            }
        }
        
        /**
         * Gets the "level" element
         */
        public java.math.BigInteger getLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEVEL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "level" element
         */
        public org.apache.xmlbeans.XmlInteger xgetLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LEVEL$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "level" element
         */
        public void setLevel(java.math.BigInteger level)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEVEL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEVEL$2);
                }
                target.setBigIntegerValue(level);
            }
        }
        
        /**
         * Sets (as xml) the "level" element
         */
        public void xsetLevel(org.apache.xmlbeans.XmlInteger level)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(LEVEL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(LEVEL$2);
                }
                target.set(level);
            }
        }
    }
}
