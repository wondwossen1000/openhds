/*
 * An XML document type.
 * Localname: indicators
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.IndicatorsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one indicators(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface IndicatorsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndicatorsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("indicators0b48doctype");
    
    /**
     * Gets the "indicators" element
     */
    org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators getIndicators();
    
    /**
     * Sets the "indicators" element
     */
    void setIndicators(org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators indicators);
    
    /**
     * Appends and returns a new empty "indicators" element
     */
    org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators addNewIndicators();
    
    /**
     * An XML indicators(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface Indicators extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Indicators.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("indicators8868elemtype");
        
        /**
         * Gets array of all "indicator" elements
         */
        org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator[] getIndicatorArray();
        
        /**
         * Gets ith "indicator" element
         */
        org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator getIndicatorArray(int i);
        
        /**
         * Returns number of "indicator" element
         */
        int sizeOfIndicatorArray();
        
        /**
         * Sets array of all "indicator" element
         */
        void setIndicatorArray(org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator[] indicatorArray);
        
        /**
         * Sets ith "indicator" element
         */
        void setIndicatorArray(int i, org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator indicator);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indicator" element
         */
        org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator insertNewIndicator(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indicator" element
         */
        org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator addNewIndicator();
        
        /**
         * Removes the ith "indicator" element
         */
        void removeIndicator(int i);
        
        /**
         * An XML indicator(@http://dhis2.org/ns/schema/dxf2).
         *
         * This is a complex type.
         */
        public interface Indicator extends org.dhis2.ns.schema.dxf2.IdentifiableObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Indicator.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("indicatorc923elemtype");
            
            /**
             * Gets the "annualized" element
             */
            java.lang.String getAnnualized();
            
            /**
             * Gets (as xml) the "annualized" element
             */
            org.apache.xmlbeans.XmlString xgetAnnualized();
            
            /**
             * Sets the "annualized" element
             */
            void setAnnualized(java.lang.String annualized);
            
            /**
             * Sets (as xml) the "annualized" element
             */
            void xsetAnnualized(org.apache.xmlbeans.XmlString annualized);
            
            /**
             * Gets the "numerator" element
             */
            java.lang.String getNumerator();
            
            /**
             * Gets (as xml) the "numerator" element
             */
            org.apache.xmlbeans.XmlString xgetNumerator();
            
            /**
             * Sets the "numerator" element
             */
            void setNumerator(java.lang.String numerator);
            
            /**
             * Sets (as xml) the "numerator" element
             */
            void xsetNumerator(org.apache.xmlbeans.XmlString numerator);
            
            /**
             * Gets the "numeratorDescription" element
             */
            java.lang.String getNumeratorDescription();
            
            /**
             * Gets (as xml) the "numeratorDescription" element
             */
            org.apache.xmlbeans.XmlString xgetNumeratorDescription();
            
            /**
             * Sets the "numeratorDescription" element
             */
            void setNumeratorDescription(java.lang.String numeratorDescription);
            
            /**
             * Sets (as xml) the "numeratorDescription" element
             */
            void xsetNumeratorDescription(org.apache.xmlbeans.XmlString numeratorDescription);
            
            /**
             * Gets the "numeratorAggregationOperator" element
             */
            java.lang.String getNumeratorAggregationOperator();
            
            /**
             * Gets (as xml) the "numeratorAggregationOperator" element
             */
            org.apache.xmlbeans.XmlString xgetNumeratorAggregationOperator();
            
            /**
             * Sets the "numeratorAggregationOperator" element
             */
            void setNumeratorAggregationOperator(java.lang.String numeratorAggregationOperator);
            
            /**
             * Sets (as xml) the "numeratorAggregationOperator" element
             */
            void xsetNumeratorAggregationOperator(org.apache.xmlbeans.XmlString numeratorAggregationOperator);
            
            /**
             * Gets the "denominator" element
             */
            java.lang.String getDenominator();
            
            /**
             * Gets (as xml) the "denominator" element
             */
            org.apache.xmlbeans.XmlString xgetDenominator();
            
            /**
             * Sets the "denominator" element
             */
            void setDenominator(java.lang.String denominator);
            
            /**
             * Sets (as xml) the "denominator" element
             */
            void xsetDenominator(org.apache.xmlbeans.XmlString denominator);
            
            /**
             * Gets the "denominatorDescription" element
             */
            java.lang.String getDenominatorDescription();
            
            /**
             * Gets (as xml) the "denominatorDescription" element
             */
            org.apache.xmlbeans.XmlString xgetDenominatorDescription();
            
            /**
             * Sets the "denominatorDescription" element
             */
            void setDenominatorDescription(java.lang.String denominatorDescription);
            
            /**
             * Sets (as xml) the "denominatorDescription" element
             */
            void xsetDenominatorDescription(org.apache.xmlbeans.XmlString denominatorDescription);
            
            /**
             * Gets the "denominatorAggregationOperator" element
             */
            java.lang.String getDenominatorAggregationOperator();
            
            /**
             * Gets (as xml) the "denominatorAggregationOperator" element
             */
            org.apache.xmlbeans.XmlString xgetDenominatorAggregationOperator();
            
            /**
             * Sets the "denominatorAggregationOperator" element
             */
            void setDenominatorAggregationOperator(java.lang.String denominatorAggregationOperator);
            
            /**
             * Sets (as xml) the "denominatorAggregationOperator" element
             */
            void xsetDenominatorAggregationOperator(org.apache.xmlbeans.XmlString denominatorAggregationOperator);
            
            /**
             * Gets the "indicatorTypeRef" attribute
             */
            int getIndicatorTypeRef();
            
            /**
             * Gets (as xml) the "indicatorTypeRef" attribute
             */
            org.dhis2.ns.schema.dxf2.DxfIDRef xgetIndicatorTypeRef();
            
            /**
             * Sets the "indicatorTypeRef" attribute
             */
            void setIndicatorTypeRef(int indicatorTypeRef);
            
            /**
             * Sets (as xml) the "indicatorTypeRef" attribute
             */
            void xsetIndicatorTypeRef(org.dhis2.ns.schema.dxf2.DxfIDRef indicatorTypeRef);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator newInstance() {
                  return (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators newInstance() {
              return (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.IndicatorsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.IndicatorsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
