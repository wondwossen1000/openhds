/*
 * An XML document type.
 * Localname: dataDictionary
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataDictionaryDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one dataDictionary(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface DataDictionaryDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataDictionaryDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("datadictionary8264doctype");
    
    /**
     * Gets the "dataDictionary" element
     */
    org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary getDataDictionary();
    
    /**
     * Sets the "dataDictionary" element
     */
    void setDataDictionary(org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary dataDictionary);
    
    /**
     * Appends and returns a new empty "dataDictionary" element
     */
    org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary addNewDataDictionary();
    
    /**
     * An XML dataDictionary(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface DataDictionary extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataDictionary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("datadictionary6b68elemtype");
        
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
         * Gets the "description" element
         */
        java.lang.String getDescription();
        
        /**
         * Gets (as xml) the "description" element
         */
        org.apache.xmlbeans.XmlString xgetDescription();
        
        /**
         * Sets the "description" element
         */
        void setDescription(java.lang.String description);
        
        /**
         * Sets (as xml) the "description" element
         */
        void xsetDescription(org.apache.xmlbeans.XmlString description);
        
        /**
         * Gets the "region" element
         */
        java.lang.String getRegion();
        
        /**
         * Gets (as xml) the "region" element
         */
        org.apache.xmlbeans.XmlString xgetRegion();
        
        /**
         * Sets the "region" element
         */
        void setRegion(java.lang.String region);
        
        /**
         * Sets (as xml) the "region" element
         */
        void xsetRegion(org.apache.xmlbeans.XmlString region);
        
        /**
         * Gets the "dataElements" element
         */
        org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements getDataElements();
        
        /**
         * Sets the "dataElements" element
         */
        void setDataElements(org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements dataElements);
        
        /**
         * Appends and returns a new empty "dataElements" element
         */
        org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements addNewDataElements();
        
        /**
         * Gets the "id" attribute
         */
        int getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.dhis2.ns.schema.dxf2.DxfID xgetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(int id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.dhis2.ns.schema.dxf2.DxfID id);
        
        /**
         * An XML dataElements(@http://dhis2.org/ns/schema/dxf2).
         *
         * This is a complex type.
         */
        public interface DataElements extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataElements.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("dataelements4f85elemtype");
            
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
                public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements newInstance() {
                  return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary.DataElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary newInstance() {
              return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument.DataDictionary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.DataDictionaryDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.DataDictionaryDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
