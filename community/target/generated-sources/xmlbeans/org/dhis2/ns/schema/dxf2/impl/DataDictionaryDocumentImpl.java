/*
 * An XML document type.
 * Localname: dataDictionary
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataDictionaryDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dataDictionary(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataDictionaryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataDictionaryDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataDictionaryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATADICTIONARY$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataDictionary");
    
    
    /**
     * Gets the "dataDictionary" element
     */
    public org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary getDataDictionary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary target = null;
            target = (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary)get_store().find_element_user(DATADICTIONARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataDictionary" element
     */
    public void setDataDictionary(org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary dataDictionary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary target = null;
            target = (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary)get_store().find_element_user(DATADICTIONARY$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary)get_store().add_element_user(DATADICTIONARY$0);
            }
            target.set(dataDictionary);
        }
    }
    
    /**
     * Appends and returns a new empty "dataDictionary" element
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
     * An XML dataDictionary(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class DataDictionaryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary
    {
        private static final long serialVersionUID = 1L;
        
        public DataDictionaryImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "description");
        private static final javax.xml.namespace.QName REGION$4 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "region");
        private static final javax.xml.namespace.QName DATAELEMENTS$6 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElements");
        private static final javax.xml.namespace.QName ID$8 = 
            new javax.xml.namespace.QName("", "id");
        
        
        /**
         * Gets the "name" element
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
         * Gets (as xml) the "name" element
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
         * Sets the "name" element
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
         * Sets (as xml) the "name" element
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
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
                }
                target.set(description);
            }
        }
        
        /**
         * Gets the "region" element
         */
        public java.lang.String getRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "region" element
         */
        public org.apache.xmlbeans.XmlString xgetRegion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "region" element
         */
        public void setRegion(java.lang.String region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGION$4);
                }
                target.setStringValue(region);
            }
        }
        
        /**
         * Sets (as xml) the "region" element
         */
        public void xsetRegion(org.apache.xmlbeans.XmlString region)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REGION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REGION$4);
                }
                target.set(region);
            }
        }
        
        /**
         * Gets the "dataElements" element
         */
        public org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements getDataElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements target = null;
                target = (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements)get_store().find_element_user(DATAELEMENTS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "dataElements" element
         */
        public void setDataElements(org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements dataElements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements target = null;
                target = (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements)get_store().find_element_user(DATAELEMENTS$6, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements)get_store().add_element_user(DATAELEMENTS$6);
                }
                target.set(dataElements);
            }
        }
        
        /**
         * Appends and returns a new empty "dataElements" element
         */
        public org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements addNewDataElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements target = null;
                target = (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements)get_store().add_element_user(DATAELEMENTS$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
                target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_attribute_user(ID$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
                target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().add_attribute_user(ID$8);
                }
                target.set(id);
            }
        }
        /**
         * An XML dataElements(@http://dhis2.org/ns/schema/dxf2).
         *
         * This is a complex type.
         */
        public static class DataElementsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements
        {
            private static final long serialVersionUID = 1L;
            
            public DataElementsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATAELEMENTREF$0 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElementRef");
            
            
            /**
             * Gets array of all "dataElementRef" elements
             */
            public org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef[] getDataElementRefArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DATAELEMENTREF$0, targetList);
                    org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef[] result = new org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "dataElementRef" element
             */
            public org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef getDataElementRefArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef)get_store().find_element_user(DATAELEMENTREF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "dataElementRef" element
             */
            public int sizeOfDataElementRefArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DATAELEMENTREF$0);
                }
            }
            
            /**
             * Sets array of all "dataElementRef" element
             */
            public void setDataElementRefArray(org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef[] dataElementRefArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(dataElementRefArray, DATAELEMENTREF$0);
                }
            }
            
            /**
             * Sets ith "dataElementRef" element
             */
            public void setDataElementRefArray(int i, org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef dataElementRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef)get_store().find_element_user(DATAELEMENTREF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(dataElementRef);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "dataElementRef" element
             */
            public org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef insertNewDataElementRef(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef)get_store().insert_element_user(DATAELEMENTREF$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "dataElementRef" element
             */
            public org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef addNewDataElementRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef)get_store().add_element_user(DATAELEMENTREF$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "dataElementRef" element
             */
            public void removeDataElementRef(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DATAELEMENTREF$0, i);
                }
            }
        }
    }
}
