/*
 * An XML document type.
 * Localname: organisationUnitLevel
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one organisationUnitLevel(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface OrganisationUnitLevelDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganisationUnitLevelDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("organisationunitlevel0798doctype");
    
    /**
     * Gets the "organisationUnitLevel" element
     */
    org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel getOrganisationUnitLevel();
    
    /**
     * Sets the "organisationUnitLevel" element
     */
    void setOrganisationUnitLevel(org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel organisationUnitLevel);
    
    /**
     * Appends and returns a new empty "organisationUnitLevel" element
     */
    org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel addNewOrganisationUnitLevel();
    
    /**
     * An XML organisationUnitLevel(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface OrganisationUnitLevel extends org.dhis2.ns.schema.dxf2.IdentifiableObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganisationUnitLevel.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("organisationunitlevel08aaelemtype");
        
        /**
         * Gets first "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) first "name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Gets array of all "name" elements
         */
        java.lang.String[] getNameArray();
        
        /**
         * Gets ith "name" element
         */
        java.lang.String getNameArray(int i);
        
        /**
         * Gets (as xml) array of all "name" elements
         */
        org.apache.xmlbeans.XmlString[] xgetNameArray();
        
        /**
         * Gets (as xml) ith "name" element
         */
        org.apache.xmlbeans.XmlString xgetNameArray(int i);
        
        /**
         * Returns number of "name" element
         */
        int sizeOfNameArray();
        
        /**
         * Sets first "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) first "name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Sets array of all "name" element
         */
        void setNameArray(java.lang.String[] nameArray);
        
        /**
         * Sets ith "name" element
         */
        void setNameArray(int i, java.lang.String name);
        
        /**
         * Sets (as xml) array of all "name" element
         */
        void xsetNameArray(org.apache.xmlbeans.XmlString[] nameArray);
        
        /**
         * Sets (as xml) ith "name" element
         */
        void xsetNameArray(int i, org.apache.xmlbeans.XmlString name);
        
        /**
         * Inserts the value as the ith "name" element
         */
        void insertName(int i, java.lang.String name);
        
        /**
         * Appends the value as the last "name" element
         */
        void addName(java.lang.String name);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        org.apache.xmlbeans.XmlString insertNewName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        org.apache.xmlbeans.XmlString addNewName();
        
        /**
         * Removes the ith "name" element
         */
        void removeName(int i);
        
        /**
         * Gets the "level" element
         */
        java.math.BigInteger getLevel();
        
        /**
         * Gets (as xml) the "level" element
         */
        org.apache.xmlbeans.XmlInteger xgetLevel();
        
        /**
         * Sets the "level" element
         */
        void setLevel(java.math.BigInteger level);
        
        /**
         * Sets (as xml) the "level" element
         */
        void xsetLevel(org.apache.xmlbeans.XmlInteger level);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel newInstance() {
              return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument.OrganisationUnitLevel) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitLevelDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
