/*
 * An XML document type.
 * Localname: organisationUnitLevels
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one organisationUnitLevels(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface OrganisationUnitLevelsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganisationUnitLevelsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("organisationunitlevels1211doctype");
    
    /**
     * Gets the "organisationUnitLevels" element
     */
    org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels getOrganisationUnitLevels();
    
    /**
     * Sets the "organisationUnitLevels" element
     */
    void setOrganisationUnitLevels(org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels organisationUnitLevels);
    
    /**
     * Appends and returns a new empty "organisationUnitLevels" element
     */
    org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels addNewOrganisationUnitLevels();
    
    /**
     * An XML organisationUnitLevels(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface OrganisationUnitLevels extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganisationUnitLevels.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("organisationunitlevelsa308elemtype");
        
        /**
         * Gets array of all "organisationUnitLevel" elements
         */
        org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel[] getOrganisationUnitLevelArray();
        
        /**
         * Gets ith "organisationUnitLevel" element
         */
        org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel getOrganisationUnitLevelArray(int i);
        
        /**
         * Returns number of "organisationUnitLevel" element
         */
        int sizeOfOrganisationUnitLevelArray();
        
        /**
         * Sets array of all "organisationUnitLevel" element
         */
        void setOrganisationUnitLevelArray(org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel[] organisationUnitLevelArray);
        
        /**
         * Sets ith "organisationUnitLevel" element
         */
        void setOrganisationUnitLevelArray(int i, org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel organisationUnitLevel);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "organisationUnitLevel" element
         */
        org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel insertNewOrganisationUnitLevel(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "organisationUnitLevel" element
         */
        org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel addNewOrganisationUnitLevel();
        
        /**
         * Removes the ith "organisationUnitLevel" element
         */
        void removeOrganisationUnitLevel(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels newInstance() {
              return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
