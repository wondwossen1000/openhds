/*
 * An XML document type.
 * Localname: reportTableIndicator
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one reportTableIndicator(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface ReportTableIndicatorDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportTableIndicatorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("reporttableindicator8ff9doctype");
    
    /**
     * Gets the "reportTableIndicator" element
     */
    org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator getReportTableIndicator();
    
    /**
     * Sets the "reportTableIndicator" element
     */
    void setReportTableIndicator(org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator reportTableIndicator);
    
    /**
     * Appends and returns a new empty "reportTableIndicator" element
     */
    org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator addNewReportTableIndicator();
    
    /**
     * An XML reportTableIndicator(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface ReportTableIndicator extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportTableIndicator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("reporttableindicatorec08elemtype");
        
        /**
         * Gets the "reportTable" element
         */
        java.math.BigInteger getReportTable();
        
        /**
         * Gets (as xml) the "reportTable" element
         */
        org.apache.xmlbeans.XmlInteger xgetReportTable();
        
        /**
         * Sets the "reportTable" element
         */
        void setReportTable(java.math.BigInteger reportTable);
        
        /**
         * Sets (as xml) the "reportTable" element
         */
        void xsetReportTable(org.apache.xmlbeans.XmlInteger reportTable);
        
        /**
         * Gets the "indicator" element
         */
        java.math.BigInteger getIndicator();
        
        /**
         * Gets (as xml) the "indicator" element
         */
        org.apache.xmlbeans.XmlInteger xgetIndicator();
        
        /**
         * Sets the "indicator" element
         */
        void setIndicator(java.math.BigInteger indicator);
        
        /**
         * Sets (as xml) the "indicator" element
         */
        void xsetIndicator(org.apache.xmlbeans.XmlInteger indicator);
        
        /**
         * Gets the "sortOrder" element
         */
        java.math.BigInteger getSortOrder();
        
        /**
         * Gets (as xml) the "sortOrder" element
         */
        org.apache.xmlbeans.XmlInteger xgetSortOrder();
        
        /**
         * Sets the "sortOrder" element
         */
        void setSortOrder(java.math.BigInteger sortOrder);
        
        /**
         * Sets (as xml) the "sortOrder" element
         */
        void xsetSortOrder(org.apache.xmlbeans.XmlInteger sortOrder);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator newInstance() {
              return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument.ReportTableIndicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.ReportTableIndicatorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
