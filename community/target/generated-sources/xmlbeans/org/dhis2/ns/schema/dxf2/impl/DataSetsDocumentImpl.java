/*
 * An XML document type.
 * Localname: dataSets
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataSetsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dataSets(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataSetsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataSetsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataSetsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASETS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataSets");
    
    
    /**
     * Gets the "dataSets" element
     */
    public org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets getDataSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets target = null;
            target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets)get_store().find_element_user(DATASETS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataSets" element
     */
    public void setDataSets(org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets dataSets)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets target = null;
            target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets)get_store().find_element_user(DATASETS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets)get_store().add_element_user(DATASETS$0);
            }
            target.set(dataSets);
        }
    }
    
    /**
     * Appends and returns a new empty "dataSets" element
     */
    public org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets addNewDataSets()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets target = null;
            target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets)get_store().add_element_user(DATASETS$0);
            return target;
        }
    }
    /**
     * An XML dataSets(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class DataSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets
    {
        private static final long serialVersionUID = 1L;
        
        public DataSetsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATASET$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataSet");
        
        
        /**
         * Gets array of all "dataSet" elements
         */
        public org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet[] getDataSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DATASET$0, targetList);
                org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet[] result = new org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dataSet" element
         */
        public org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet getDataSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet target = null;
                target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet)get_store().find_element_user(DATASET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dataSet" element
         */
        public int sizeOfDataSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATASET$0);
            }
        }
        
        /**
         * Sets array of all "dataSet" element
         */
        public void setDataSetArray(org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet[] dataSetArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dataSetArray, DATASET$0);
            }
        }
        
        /**
         * Sets ith "dataSet" element
         */
        public void setDataSetArray(int i, org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet dataSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet target = null;
                target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet)get_store().find_element_user(DATASET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dataSet);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dataSet" element
         */
        public org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet insertNewDataSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet target = null;
                target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet)get_store().insert_element_user(DATASET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dataSet" element
         */
        public org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet addNewDataSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet target = null;
                target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet)get_store().add_element_user(DATASET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "dataSet" element
         */
        public void removeDataSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATASET$0, i);
            }
        }
        /**
         * An XML dataSet(@http://dhis2.org/ns/schema/dxf2).
         *
         * This is a complex type.
         */
        public static class DataSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet
        {
            private static final long serialVersionUID = 1L;
            
            public DataSetImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ID$0 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "id");
            private static final javax.xml.namespace.QName NAME$2 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "name");
            private static final javax.xml.namespace.QName SHORTNAME$4 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "shortName");
            private static final javax.xml.namespace.QName CODE$6 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "code");
            private static final javax.xml.namespace.QName PERIODTYPE$8 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "periodType");
            private static final javax.xml.namespace.QName DATAELEMENTS$10 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElements");
            
            
            /**
             * Gets the "id" element
             */
            public int getId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "id" element
             */
            public org.dhis2.ns.schema.dxf2.DxfID xgetId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DxfID target = null;
                    target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_element_user(ID$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "id" element
             */
            public void setId(int id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                    }
                    target.setIntValue(id);
                }
            }
            
            /**
             * Sets (as xml) the "id" element
             */
            public void xsetId(org.dhis2.ns.schema.dxf2.DxfID id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DxfID target = null;
                    target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_element_user(ID$0, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().add_element_user(ID$0);
                    }
                    target.set(id);
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
             * Gets the "shortName" element
             */
            public java.lang.String getShortName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTNAME$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "shortName" element
             */
            public org.apache.xmlbeans.XmlString xgetShortName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHORTNAME$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "shortName" element
             */
            public void setShortName(java.lang.String shortName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHORTNAME$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHORTNAME$4);
                    }
                    target.setStringValue(shortName);
                }
            }
            
            /**
             * Sets (as xml) the "shortName" element
             */
            public void xsetShortName(org.apache.xmlbeans.XmlString shortName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHORTNAME$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHORTNAME$4);
                    }
                    target.set(shortName);
                }
            }
            
            /**
             * Gets the "code" element
             */
            public java.lang.String getCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "code" element
             */
            public org.apache.xmlbeans.XmlString xgetCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "code" element
             */
            public void setCode(java.lang.String code)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$6);
                    }
                    target.setStringValue(code);
                }
            }
            
            /**
             * Sets (as xml) the "code" element
             */
            public void xsetCode(org.apache.xmlbeans.XmlString code)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$6);
                    }
                    target.set(code);
                }
            }
            
            /**
             * Gets the "periodType" element
             */
            public java.lang.String getPeriodType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODTYPE$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "periodType" element
             */
            public org.apache.xmlbeans.XmlString xgetPeriodType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERIODTYPE$8, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "periodType" element
             */
            public void setPeriodType(java.lang.String periodType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODTYPE$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODTYPE$8);
                    }
                    target.setStringValue(periodType);
                }
            }
            
            /**
             * Sets (as xml) the "periodType" element
             */
            public void xsetPeriodType(org.apache.xmlbeans.XmlString periodType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERIODTYPE$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERIODTYPE$8);
                    }
                    target.set(periodType);
                }
            }
            
            /**
             * Gets the "dataElements" element
             */
            public org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements getDataElements()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements)get_store().find_element_user(DATAELEMENTS$10, 0);
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
            public void setDataElements(org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements dataElements)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements)get_store().find_element_user(DATAELEMENTS$10, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements)get_store().add_element_user(DATAELEMENTS$10);
                    }
                    target.set(dataElements);
                }
            }
            
            /**
             * Appends and returns a new empty "dataElements" element
             */
            public org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements addNewDataElements()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements)get_store().add_element_user(DATAELEMENTS$10);
                    return target;
                }
            }
            /**
             * An XML dataElements(@http://dhis2.org/ns/schema/dxf2).
             *
             * This is a complex type.
             */
            public static class DataElementsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements
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
}
