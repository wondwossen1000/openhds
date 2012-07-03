/*
 * An XML document type.
 * Localname: DataDictionaryDefinition
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one DataDictionaryDefinition(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataDictionaryDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataDictionaryDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATADICTIONARYDEFINITION$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "DataDictionaryDefinition");
    private static final org.apache.xmlbeans.QNameSet DATADICTIONARYDEFINITION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "DataDictionaryDefinition"),
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataDictionaries"),
    });
    
    
    /**
     * Gets the "DataDictionaryDefinition" element
     */
    public org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition getDataDictionaryDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition target = null;
            target = (org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition)get_store().find_element_user(DATADICTIONARYDEFINITION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataDictionaryDefinition" element
     */
    public void setDataDictionaryDefinition(org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition dataDictionaryDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition target = null;
            target = (org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition)get_store().find_element_user(DATADICTIONARYDEFINITION$1, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition)get_store().add_element_user(DATADICTIONARYDEFINITION$0);
            }
            target.set(dataDictionaryDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "DataDictionaryDefinition" element
     */
    public org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition addNewDataDictionaryDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition target = null;
            target = (org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition)get_store().add_element_user(DATADICTIONARYDEFINITION$0);
            return target;
        }
    }
    /**
     * An XML DataDictionaryDefinition(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class DataDictionaryDefinitionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition
    {
        private static final long serialVersionUID = 1L;
        
        public DataDictionaryDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATADICTIONARY$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataDictionary");
        
        
        /**
         * Gets array of all "dataDictionary" elements
         */
        public org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary[] getDataDictionaryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DATADICTIONARY$0, targetList);
                org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary[] result = new org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dataDictionary" element
         */
        public org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary getDataDictionaryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary target = null;
                target = (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary)get_store().find_element_user(DATADICTIONARY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dataDictionary" element
         */
        public int sizeOfDataDictionaryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATADICTIONARY$0);
            }
        }
        
        /**
         * Sets array of all "dataDictionary" element
         */
        public void setDataDictionaryArray(org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary[] dataDictionaryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dataDictionaryArray, DATADICTIONARY$0);
            }
        }
        
        /**
         * Sets ith "dataDictionary" element
         */
        public void setDataDictionaryArray(int i, org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary dataDictionary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary target = null;
                target = (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary)get_store().find_element_user(DATADICTIONARY$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dataDictionary);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dataDictionary" element
         */
        public org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary insertNewDataDictionary(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary target = null;
                target = (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary)get_store().insert_element_user(DATADICTIONARY$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dataDictionary" element
         */
        public org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary addNewDataDictionary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary target = null;
                target = (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary)get_store().add_element_user(DATADICTIONARY$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "dataDictionary" element
         */
        public void removeDataDictionary(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATADICTIONARY$0, i);
            }
        }
    }
}
