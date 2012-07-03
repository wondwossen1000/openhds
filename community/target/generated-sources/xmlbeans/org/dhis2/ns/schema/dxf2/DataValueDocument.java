/*
 * An XML document type.
 * Localname: dataValue
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one dataValue(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface DataValueDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataValueDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("datavalue5959doctype");
    
    /**
     * Gets the "dataValue" element
     */
    org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue getDataValue();
    
    /**
     * Sets the "dataValue" element
     */
    void setDataValue(org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue dataValue);
    
    /**
     * Appends and returns a new empty "dataValue" element
     */
    org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue addNewDataValue();
    
    /**
     * An XML dataValue(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface DataValue extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataValue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("datavalue772celemtype");
        
        /**
         * Gets the "dataElement" attribute
         */
        int getDataElement();
        
        /**
         * Gets (as xml) the "dataElement" attribute
         */
        org.dhis2.ns.schema.dxf2.DxfIDRef xgetDataElement();
        
        /**
         * Sets the "dataElement" attribute
         */
        void setDataElement(int dataElement);
        
        /**
         * Sets (as xml) the "dataElement" attribute
         */
        void xsetDataElement(org.dhis2.ns.schema.dxf2.DxfIDRef dataElement);
        
        /**
         * Gets the "period" attribute
         */
        int getPeriod();
        
        /**
         * Gets (as xml) the "period" attribute
         */
        org.dhis2.ns.schema.dxf2.DxfIDRef xgetPeriod();
        
        /**
         * Sets the "period" attribute
         */
        void setPeriod(int period);
        
        /**
         * Sets (as xml) the "period" attribute
         */
        void xsetPeriod(org.dhis2.ns.schema.dxf2.DxfIDRef period);
        
        /**
         * Gets the "source" attribute
         */
        int getSource();
        
        /**
         * Gets (as xml) the "source" attribute
         */
        org.dhis2.ns.schema.dxf2.DxfIDRef xgetSource();
        
        /**
         * Sets the "source" attribute
         */
        void setSource(int source);
        
        /**
         * Sets (as xml) the "source" attribute
         */
        void xsetSource(org.dhis2.ns.schema.dxf2.DxfIDRef source);
        
        /**
         * Gets the "value" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(org.apache.xmlbeans.XmlAnySimpleType value);
        
        /**
         * Appends and returns a new empty "value" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewValue();
        
        /**
         * Gets the "storedBy" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getStoredBy();
        
        /**
         * True if has "storedBy" attribute
         */
        boolean isSetStoredBy();
        
        /**
         * Sets the "storedBy" attribute
         */
        void setStoredBy(org.apache.xmlbeans.XmlAnySimpleType storedBy);
        
        /**
         * Appends and returns a new empty "storedBy" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewStoredBy();
        
        /**
         * Unsets the "storedBy" attribute
         */
        void unsetStoredBy();
        
        /**
         * Gets the "timeStamp" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getTimeStamp();
        
        /**
         * True if has "timeStamp" attribute
         */
        boolean isSetTimeStamp();
        
        /**
         * Sets the "timeStamp" attribute
         */
        void setTimeStamp(org.apache.xmlbeans.XmlAnySimpleType timeStamp);
        
        /**
         * Appends and returns a new empty "timeStamp" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewTimeStamp();
        
        /**
         * Unsets the "timeStamp" attribute
         */
        void unsetTimeStamp();
        
        /**
         * Gets the "comment" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType getComment();
        
        /**
         * True if has "comment" attribute
         */
        boolean isSetComment();
        
        /**
         * Sets the "comment" attribute
         */
        void setComment(org.apache.xmlbeans.XmlAnySimpleType comment);
        
        /**
         * Appends and returns a new empty "comment" attribute
         */
        org.apache.xmlbeans.XmlAnySimpleType addNewComment();
        
        /**
         * Unsets the "comment" attribute
         */
        void unsetComment();
        
        /**
         * Gets the "categoryOptionCombo" attribute
         */
        int getCategoryOptionCombo();
        
        /**
         * Gets (as xml) the "categoryOptionCombo" attribute
         */
        org.dhis2.ns.schema.dxf2.DxfIDRef xgetCategoryOptionCombo();
        
        /**
         * Sets the "categoryOptionCombo" attribute
         */
        void setCategoryOptionCombo(int categoryOptionCombo);
        
        /**
         * Sets (as xml) the "categoryOptionCombo" attribute
         */
        void xsetCategoryOptionCombo(org.dhis2.ns.schema.dxf2.DxfIDRef categoryOptionCombo);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue newInstance() {
              return (org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.DataValueDocument.DataValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.DataValueDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataValueDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.DataValueDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.DataValueDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
