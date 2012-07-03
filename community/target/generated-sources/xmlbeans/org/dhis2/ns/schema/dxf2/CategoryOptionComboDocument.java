/*
 * An XML document type.
 * Localname: categoryOptionCombo
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one categoryOptionCombo(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface CategoryOptionComboDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CategoryOptionComboDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("categoryoptioncombo32eddoctype");
    
    /**
     * Gets the "categoryOptionCombo" element
     */
    org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo getCategoryOptionCombo();
    
    /**
     * Sets the "categoryOptionCombo" element
     */
    void setCategoryOptionCombo(org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo categoryOptionCombo);
    
    /**
     * Appends and returns a new empty "categoryOptionCombo" element
     */
    org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo addNewCategoryOptionCombo();
    
    /**
     * An XML categoryOptionCombo(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface CategoryOptionCombo extends org.dhis2.ns.schema.dxf2.IdentifiableObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CategoryOptionCombo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("categoryoptioncomboca54elemtype");
        
        /**
         * Gets array of all "categoryCombo" elements
         */
        org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo[] getCategoryComboArray();
        
        /**
         * Gets ith "categoryCombo" element
         */
        org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo getCategoryComboArray(int i);
        
        /**
         * Returns number of "categoryCombo" element
         */
        int sizeOfCategoryComboArray();
        
        /**
         * Sets array of all "categoryCombo" element
         */
        void setCategoryComboArray(org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo[] categoryComboArray);
        
        /**
         * Sets ith "categoryCombo" element
         */
        void setCategoryComboArray(int i, org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo categoryCombo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "categoryCombo" element
         */
        org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo insertNewCategoryCombo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "categoryCombo" element
         */
        org.dhis2.ns.schema.dxf2.CategoryComboDocument.CategoryCombo addNewCategoryCombo();
        
        /**
         * Removes the ith "categoryCombo" element
         */
        void removeCategoryCombo(int i);
        
        /**
         * Gets array of all "categoryOptions" elements
         */
        org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions[] getCategoryOptionsArray();
        
        /**
         * Gets ith "categoryOptions" element
         */
        org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions getCategoryOptionsArray(int i);
        
        /**
         * Returns number of "categoryOptions" element
         */
        int sizeOfCategoryOptionsArray();
        
        /**
         * Sets array of all "categoryOptions" element
         */
        void setCategoryOptionsArray(org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions[] categoryOptionsArray);
        
        /**
         * Sets ith "categoryOptions" element
         */
        void setCategoryOptionsArray(int i, org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions categoryOptions);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "categoryOptions" element
         */
        org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions insertNewCategoryOptions(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "categoryOptions" element
         */
        org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions addNewCategoryOptions();
        
        /**
         * Removes the ith "categoryOptions" element
         */
        void removeCategoryOptions(int i);
        
        /**
         * Gets the "categoryComboRef" attribute
         */
        int getCategoryComboRef();
        
        /**
         * Gets (as xml) the "categoryComboRef" attribute
         */
        org.dhis2.ns.schema.dxf2.DxfIDRef xgetCategoryComboRef();
        
        /**
         * Sets the "categoryComboRef" attribute
         */
        void setCategoryComboRef(int categoryComboRef);
        
        /**
         * Sets (as xml) the "categoryComboRef" attribute
         */
        void xsetCategoryComboRef(org.dhis2.ns.schema.dxf2.DxfIDRef categoryComboRef);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo newInstance() {
              return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument.CategoryOptionCombo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.CategoryOptionComboDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
