/*
 * An XML document type.
 * Localname: indicatorGroupSet
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one indicatorGroupSet(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface IndicatorGroupSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndicatorGroupSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("indicatorgroupset5704doctype");
    
    /**
     * Gets the "indicatorGroupSet" element
     */
    org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet getIndicatorGroupSet();
    
    /**
     * Sets the "indicatorGroupSet" element
     */
    void setIndicatorGroupSet(org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet indicatorGroupSet);
    
    /**
     * Appends and returns a new empty "indicatorGroupSet" element
     */
    org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet addNewIndicatorGroupSet();
    
    /**
     * An XML indicatorGroupSet(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface IndicatorGroupSet extends org.dhis2.ns.schema.dxf2.IdentifiableObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndicatorGroupSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("indicatorgroupset9b02elemtype");
        
        /**
         * Gets the "Groups" element
         */
        org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups getGroups();
        
        /**
         * Sets the "Groups" element
         */
        void setGroups(org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups groups);
        
        /**
         * Appends and returns a new empty "Groups" element
         */
        org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups addNewGroups();
        
        /**
         * An XML Groups(@http://dhis2.org/ns/schema/dxf2).
         *
         * This is a complex type.
         */
        public interface Groups extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Groups.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("groups8792elemtype");
            
            /**
             * Gets array of all "indicatorGroup" elements
             */
            org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup[] getIndicatorGroupArray();
            
            /**
             * Gets ith "indicatorGroup" element
             */
            org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup getIndicatorGroupArray(int i);
            
            /**
             * Returns number of "indicatorGroup" element
             */
            int sizeOfIndicatorGroupArray();
            
            /**
             * Sets array of all "indicatorGroup" element
             */
            void setIndicatorGroupArray(org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup[] indicatorGroupArray);
            
            /**
             * Sets ith "indicatorGroup" element
             */
            void setIndicatorGroupArray(int i, org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup indicatorGroup);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "indicatorGroup" element
             */
            org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup insertNewIndicatorGroup(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "indicatorGroup" element
             */
            org.dhis2.ns.schema.dxf2.IndicatorGroupDocument.IndicatorGroup addNewIndicatorGroup();
            
            /**
             * Removes the ith "indicatorGroup" element
             */
            void removeIndicatorGroup(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups newInstance() {
                  return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet.Groups) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet newInstance() {
              return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument.IndicatorGroupSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.IndicatorGroupSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
