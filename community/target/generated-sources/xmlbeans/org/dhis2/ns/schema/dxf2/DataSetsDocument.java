/*
 * An XML document type.
 * Localname: dataSets
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataSetsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one dataSets(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface DataSetsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataSetsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("datasets345fdoctype");
    
    /**
     * Gets the "dataSets" element
     */
    org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets getDataSets();
    
    /**
     * Sets the "dataSets" element
     */
    void setDataSets(org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets dataSets);
    
    /**
     * Appends and returns a new empty "dataSets" element
     */
    org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets addNewDataSets();
    
    /**
     * An XML dataSets(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface DataSets extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataSets.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("datasetse848elemtype");
        
        /**
         * Gets array of all "dataSet" elements
         */
        org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet[] getDataSetArray();
        
        /**
         * Gets ith "dataSet" element
         */
        org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet getDataSetArray(int i);
        
        /**
         * Returns number of "dataSet" element
         */
        int sizeOfDataSetArray();
        
        /**
         * Sets array of all "dataSet" element
         */
        void setDataSetArray(org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet[] dataSetArray);
        
        /**
         * Sets ith "dataSet" element
         */
        void setDataSetArray(int i, org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet dataSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dataSet" element
         */
        org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet insertNewDataSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dataSet" element
         */
        org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet addNewDataSet();
        
        /**
         * Removes the ith "dataSet" element
         */
        void removeDataSet(int i);
        
        /**
         * An XML dataSet(@http://dhis2.org/ns/schema/dxf2).
         *
         * This is a complex type.
         */
        public interface DataSet extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("dataset060celemtype");
            
            /**
             * Gets the "id" element
             */
            int getId();
            
            /**
             * Gets (as xml) the "id" element
             */
            org.dhis2.ns.schema.dxf2.DxfID xgetId();
            
            /**
             * Sets the "id" element
             */
            void setId(int id);
            
            /**
             * Sets (as xml) the "id" element
             */
            void xsetId(org.dhis2.ns.schema.dxf2.DxfID id);
            
            /**
             * Gets the "name" element
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "name" element
             */
            org.apache.xmlbeans.XmlString xgetName();
            
            /**
             * Sets the "name" element
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "name" element
             */
            void xsetName(org.apache.xmlbeans.XmlString name);
            
            /**
             * Gets the "shortName" element
             */
            java.lang.String getShortName();
            
            /**
             * Gets (as xml) the "shortName" element
             */
            org.apache.xmlbeans.XmlString xgetShortName();
            
            /**
             * Sets the "shortName" element
             */
            void setShortName(java.lang.String shortName);
            
            /**
             * Sets (as xml) the "shortName" element
             */
            void xsetShortName(org.apache.xmlbeans.XmlString shortName);
            
            /**
             * Gets the "code" element
             */
            java.lang.String getCode();
            
            /**
             * Gets (as xml) the "code" element
             */
            org.apache.xmlbeans.XmlString xgetCode();
            
            /**
             * Sets the "code" element
             */
            void setCode(java.lang.String code);
            
            /**
             * Sets (as xml) the "code" element
             */
            void xsetCode(org.apache.xmlbeans.XmlString code);
            
            /**
             * Gets the "periodType" element
             */
            java.lang.String getPeriodType();
            
            /**
             * Gets (as xml) the "periodType" element
             */
            org.apache.xmlbeans.XmlString xgetPeriodType();
            
            /**
             * Sets the "periodType" element
             */
            void setPeriodType(java.lang.String periodType);
            
            /**
             * Sets (as xml) the "periodType" element
             */
            void xsetPeriodType(org.apache.xmlbeans.XmlString periodType);
            
            /**
             * Gets the "dataElements" element
             */
            org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements getDataElements();
            
            /**
             * Sets the "dataElements" element
             */
            void setDataElements(org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements dataElements);
            
            /**
             * Appends and returns a new empty "dataElements" element
             */
            org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements addNewDataElements();
            
            /**
             * An XML dataElements(@http://dhis2.org/ns/schema/dxf2).
             *
             * This is a complex type.
             */
            public interface DataElements extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataElements.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("dataelements4d69elemtype");
                
                /**
                 * Gets array of all "dataElementRef" elements
                 */
                org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef[] getDataElementRefArray();
                
                /**
                 * Gets ith "dataElementRef" element
                 */
                org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef getDataElementRefArray(int i);
                
                /**
                 * Returns number of "dataElementRef" element
                 */
                int sizeOfDataElementRefArray();
                
                /**
                 * Sets array of all "dataElementRef" element
                 */
                void setDataElementRefArray(org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef[] dataElementRefArray);
                
                /**
                 * Sets ith "dataElementRef" element
                 */
                void setDataElementRefArray(int i, org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef dataElementRef);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "dataElementRef" element
                 */
                org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef insertNewDataElementRef(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "dataElementRef" element
                 */
                org.dhis2.ns.schema.dxf2.DataElementRefDocument.DataElementRef addNewDataElementRef();
                
                /**
                 * Removes the ith "dataElementRef" element
                 */
                void removeDataElementRef(int i);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements newInstance() {
                      return (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet.DataElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet newInstance() {
                  return (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets.DataSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets newInstance() {
              return (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.DataSetsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.DataSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
