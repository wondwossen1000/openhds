/*
 * An XML document type.
 * Localname: completeDataSetRegistrationPeriod
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one completeDataSetRegistrationPeriod(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface CompleteDataSetRegistrationPeriodDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompleteDataSetRegistrationPeriodDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("completedatasetregistrationperioddf8bdoctype");
    
    /**
     * Gets the "completeDataSetRegistrationPeriod" element
     */
    org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod getCompleteDataSetRegistrationPeriod();
    
    /**
     * Sets the "completeDataSetRegistrationPeriod" element
     */
    void setCompleteDataSetRegistrationPeriod(org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod completeDataSetRegistrationPeriod);
    
    /**
     * Appends and returns a new empty "completeDataSetRegistrationPeriod" element
     */
    org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod addNewCompleteDataSetRegistrationPeriod();
    
    /**
     * An XML completeDataSetRegistrationPeriod(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface CompleteDataSetRegistrationPeriod extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompleteDataSetRegistrationPeriod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("completedatasetregistrationperiodd690elemtype");
        
        /**
         * Gets the "periodRef" attribute
         */
        int getPeriodRef();
        
        /**
         * Gets (as xml) the "periodRef" attribute
         */
        org.dhis2.ns.schema.dxf2.DxfIDRef xgetPeriodRef();
        
        /**
         * Sets the "periodRef" attribute
         */
        void setPeriodRef(int periodRef);
        
        /**
         * Sets (as xml) the "periodRef" attribute
         */
        void xsetPeriodRef(org.dhis2.ns.schema.dxf2.DxfIDRef periodRef);
        
        /**
         * Gets the "sortOrder" attribute
         */
        java.math.BigInteger getSortOrder();
        
        /**
         * Gets (as xml) the "sortOrder" attribute
         */
        org.apache.xmlbeans.XmlInteger xgetSortOrder();
        
        /**
         * Sets the "sortOrder" attribute
         */
        void setSortOrder(java.math.BigInteger sortOrder);
        
        /**
         * Sets (as xml) the "sortOrder" attribute
         */
        void xsetSortOrder(org.apache.xmlbeans.XmlInteger sortOrder);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod newInstance() {
              return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
