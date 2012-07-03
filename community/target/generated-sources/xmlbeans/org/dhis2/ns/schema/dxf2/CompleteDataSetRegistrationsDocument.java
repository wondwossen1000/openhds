/*
 * An XML document type.
 * Localname: completeDataSetRegistrations
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one completeDataSetRegistrations(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface CompleteDataSetRegistrationsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompleteDataSetRegistrationsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("completedatasetregistrations6effdoctype");
    
    /**
     * Gets the "completeDataSetRegistrations" element
     */
    org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations getCompleteDataSetRegistrations();
    
    /**
     * Sets the "completeDataSetRegistrations" element
     */
    void setCompleteDataSetRegistrations(org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations completeDataSetRegistrations);
    
    /**
     * Appends and returns a new empty "completeDataSetRegistrations" element
     */
    org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations addNewCompleteDataSetRegistrations();
    
    /**
     * An XML completeDataSetRegistrations(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface CompleteDataSetRegistrations extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CompleteDataSetRegistrations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("completedatasetregistrationsfb48elemtype");
        
        /**
         * Gets array of all "completeDataSetRegistrationPeriod" elements
         */
        org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod[] getCompleteDataSetRegistrationPeriodArray();
        
        /**
         * Gets ith "completeDataSetRegistrationPeriod" element
         */
        org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod getCompleteDataSetRegistrationPeriodArray(int i);
        
        /**
         * Returns number of "completeDataSetRegistrationPeriod" element
         */
        int sizeOfCompleteDataSetRegistrationPeriodArray();
        
        /**
         * Sets array of all "completeDataSetRegistrationPeriod" element
         */
        void setCompleteDataSetRegistrationPeriodArray(org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod[] completeDataSetRegistrationPeriodArray);
        
        /**
         * Sets ith "completeDataSetRegistrationPeriod" element
         */
        void setCompleteDataSetRegistrationPeriodArray(int i, org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod completeDataSetRegistrationPeriod);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "completeDataSetRegistrationPeriod" element
         */
        org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod insertNewCompleteDataSetRegistrationPeriod(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "completeDataSetRegistrationPeriod" element
         */
        org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod addNewCompleteDataSetRegistrationPeriod();
        
        /**
         * Removes the ith "completeDataSetRegistrationPeriod" element
         */
        void removeCompleteDataSetRegistrationPeriod(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations newInstance() {
              return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
