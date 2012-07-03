/*
 * An XML document type.
 * Localname: indicatorGroupSets
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one indicatorGroupSets(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface IndicatorGroupSetsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndicatorGroupSetsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("indicatorgroupsetsb025doctype");
    
    /**
     * Gets the "indicatorGroupSets" element
     */
    org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets getIndicatorGroupSets();
    
    /**
     * Sets the "indicatorGroupSets" element
     */
    void setIndicatorGroupSets(org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets indicatorGroupSets);
    
    /**
     * Appends and returns a new empty "indicatorGroupSets" element
     */
    org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets addNewIndicatorGroupSets();
    
    /**
     * An XML indicatorGroupSets(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface IndicatorGroupSets extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndicatorGroupSets.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("indicatorgroupsets7388elemtype");
        
        /**
         * Gets array of all "indicatorGroupSet" elements
         */
        org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet[] getIndicatorGroupSetArray();
        
        /**
         * Gets ith "indicatorGroupSet" element
         */
        org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet getIndicatorGroupSetArray(int i);
        
        /**
         * Returns number of "indicatorGroupSet" element
         */
        int sizeOfIndicatorGroupSetArray();
        
        /**
         * Sets array of all "indicatorGroupSet" element
         */
        void setIndicatorGroupSetArray(org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet[] indicatorGroupSetArray);
        
        /**
         * Sets ith "indicatorGroupSet" element
         */
        void setIndicatorGroupSetArray(int i, org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet indicatorGroupSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indicatorGroupSet" element
         */
        org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet insertNewIndicatorGroupSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indicatorGroupSet" element
         */
        org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet addNewIndicatorGroupSet();
        
        /**
         * Removes the ith "indicatorGroupSet" element
         */
        void removeIndicatorGroupSet(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets newInstance() {
              return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
