/*
 * An XML document type.
 * Localname: dataSetRef
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataSetRefDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one dataSetRef(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface DataSetRefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataSetRefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("datasetref701fdoctype");
    
    /**
     * Gets the "dataSetRef" element
     */
    org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef getDataSetRef();
    
    /**
     * Sets the "dataSetRef" element
     */
    void setDataSetRef(org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef dataSetRef);
    
    /**
     * Appends and returns a new empty "dataSetRef" element
     */
    org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef addNewDataSetRef();
    
    /**
     * An XML dataSetRef(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface DataSetRef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataSetRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("datasetref5dc8elemtype");
        
        /**
         * Gets the "ref" attribute
         */
        int getRef();
        
        /**
         * Gets (as xml) the "ref" attribute
         */
        org.dhis2.ns.schema.dxf2.DxfIDRef xgetRef();
        
        /**
         * Sets the "ref" attribute
         */
        void setRef(int ref);
        
        /**
         * Sets (as xml) the "ref" attribute
         */
        void xsetRef(org.dhis2.ns.schema.dxf2.DxfIDRef ref);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef newInstance() {
              return (org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.DataSetRefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.DataSetRefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
