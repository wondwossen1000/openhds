/*
 * An XML document type.
 * Localname: organisationUnit
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrganisationUnitDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one organisationUnit(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface OrganisationUnitDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganisationUnitDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("organisationunit61c2doctype");
    
    /**
     * Gets the "organisationUnit" element
     */
    org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit getOrganisationUnit();
    
    /**
     * Sets the "organisationUnit" element
     */
    void setOrganisationUnit(org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit organisationUnit);
    
    /**
     * Appends and returns a new empty "organisationUnit" element
     */
    org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit addNewOrganisationUnit();
    
    /**
     * An XML organisationUnit(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface OrganisationUnit extends org.dhis2.ns.schema.dxf2.IdentifiableObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganisationUnit.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("organisationunita568elemtype");
        
        /**
         * Gets the "dataSets" element
         */
        org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets getDataSets();
        
        /**
         * True if has "dataSets" element
         */
        boolean isSetDataSets();
        
        /**
         * Sets the "dataSets" element
         */
        void setDataSets(org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets dataSets);
        
        /**
         * Appends and returns a new empty "dataSets" element
         */
        org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets addNewDataSets();
        
        /**
         * Unsets the "dataSets" element
         */
        void unsetDataSets();
        
        /**
         * Gets the "openingDate" element
         */
        java.util.Calendar getOpeningDate();
        
        /**
         * Gets (as xml) the "openingDate" element
         */
        org.apache.xmlbeans.XmlDate xgetOpeningDate();
        
        /**
         * True if has "openingDate" element
         */
        boolean isSetOpeningDate();
        
        /**
         * Sets the "openingDate" element
         */
        void setOpeningDate(java.util.Calendar openingDate);
        
        /**
         * Sets (as xml) the "openingDate" element
         */
        void xsetOpeningDate(org.apache.xmlbeans.XmlDate openingDate);
        
        /**
         * Unsets the "openingDate" element
         */
        void unsetOpeningDate();
        
        /**
         * Gets the "closedDate" element
         */
        java.util.Calendar getClosedDate();
        
        /**
         * Gets (as xml) the "closedDate" element
         */
        org.apache.xmlbeans.XmlDate xgetClosedDate();
        
        /**
         * True if has "closedDate" element
         */
        boolean isSetClosedDate();
        
        /**
         * Sets the "closedDate" element
         */
        void setClosedDate(java.util.Calendar closedDate);
        
        /**
         * Sets (as xml) the "closedDate" element
         */
        void xsetClosedDate(org.apache.xmlbeans.XmlDate closedDate);
        
        /**
         * Unsets the "closedDate" element
         */
        void unsetClosedDate();
        
        /**
         * Gets the "active" element
         */
        boolean getActive();
        
        /**
         * Gets (as xml) the "active" element
         */
        org.apache.xmlbeans.XmlBoolean xgetActive();
        
        /**
         * True if has "active" element
         */
        boolean isSetActive();
        
        /**
         * Sets the "active" element
         */
        void setActive(boolean active);
        
        /**
         * Sets (as xml) the "active" element
         */
        void xsetActive(org.apache.xmlbeans.XmlBoolean active);
        
        /**
         * Unsets the "active" element
         */
        void unsetActive();
        
        /**
         * Gets the "comment" element
         */
        java.lang.String getComment();
        
        /**
         * Gets (as xml) the "comment" element
         */
        org.apache.xmlbeans.XmlString xgetComment();
        
        /**
         * True if has "comment" element
         */
        boolean isSetComment();
        
        /**
         * Sets the "comment" element
         */
        void setComment(java.lang.String comment);
        
        /**
         * Sets (as xml) the "comment" element
         */
        void xsetComment(org.apache.xmlbeans.XmlString comment);
        
        /**
         * Unsets the "comment" element
         */
        void unsetComment();
        
        /**
         * Gets the "geoCode" element
         */
        java.lang.String getGeoCode();
        
        /**
         * Gets (as xml) the "geoCode" element
         */
        org.apache.xmlbeans.XmlString xgetGeoCode();
        
        /**
         * True if has "geoCode" element
         */
        boolean isSetGeoCode();
        
        /**
         * Sets the "geoCode" element
         */
        void setGeoCode(java.lang.String geoCode);
        
        /**
         * Sets (as xml) the "geoCode" element
         */
        void xsetGeoCode(org.apache.xmlbeans.XmlString geoCode);
        
        /**
         * Unsets the "geoCode" element
         */
        void unsetGeoCode();
        
        /**
         * Gets the "polygonCoordinates" element
         */
        java.lang.String getPolygonCoordinates();
        
        /**
         * Gets (as xml) the "polygonCoordinates" element
         */
        org.apache.xmlbeans.XmlString xgetPolygonCoordinates();
        
        /**
         * True if has "polygonCoordinates" element
         */
        boolean isSetPolygonCoordinates();
        
        /**
         * Sets the "polygonCoordinates" element
         */
        void setPolygonCoordinates(java.lang.String polygonCoordinates);
        
        /**
         * Sets (as xml) the "polygonCoordinates" element
         */
        void xsetPolygonCoordinates(org.apache.xmlbeans.XmlString polygonCoordinates);
        
        /**
         * Unsets the "polygonCoordinates" element
         */
        void unsetPolygonCoordinates();
        
        /**
         * Gets the "latitude" element
         */
        java.lang.String getLatitude();
        
        /**
         * Gets (as xml) the "latitude" element
         */
        org.apache.xmlbeans.XmlString xgetLatitude();
        
        /**
         * True if has "latitude" element
         */
        boolean isSetLatitude();
        
        /**
         * Sets the "latitude" element
         */
        void setLatitude(java.lang.String latitude);
        
        /**
         * Sets (as xml) the "latitude" element
         */
        void xsetLatitude(org.apache.xmlbeans.XmlString latitude);
        
        /**
         * Unsets the "latitude" element
         */
        void unsetLatitude();
        
        /**
         * Gets the "longitude" element
         */
        java.lang.String getLongitude();
        
        /**
         * Gets (as xml) the "longitude" element
         */
        org.apache.xmlbeans.XmlString xgetLongitude();
        
        /**
         * True if has "longitude" element
         */
        boolean isSetLongitude();
        
        /**
         * Sets the "longitude" element
         */
        void setLongitude(java.lang.String longitude);
        
        /**
         * Sets (as xml) the "longitude" element
         */
        void xsetLongitude(org.apache.xmlbeans.XmlString longitude);
        
        /**
         * Unsets the "longitude" element
         */
        void unsetLongitude();
        
        /**
         * Gets the "url" element
         */
        java.lang.String getUrl();
        
        /**
         * Gets (as xml) the "url" element
         */
        org.apache.xmlbeans.XmlString xgetUrl();
        
        /**
         * True if has "url" element
         */
        boolean isSetUrl();
        
        /**
         * Sets the "url" element
         */
        void setUrl(java.lang.String url);
        
        /**
         * Sets (as xml) the "url" element
         */
        void xsetUrl(org.apache.xmlbeans.XmlString url);
        
        /**
         * Unsets the "url" element
         */
        void unsetUrl();
        
        /**
         * Gets the "lastUpdated" element
         */
        java.util.Calendar getLastUpdated();
        
        /**
         * Gets (as xml) the "lastUpdated" element
         */
        org.apache.xmlbeans.XmlDate xgetLastUpdated();
        
        /**
         * True if has "lastUpdated" element
         */
        boolean isSetLastUpdated();
        
        /**
         * Sets the "lastUpdated" element
         */
        void setLastUpdated(java.util.Calendar lastUpdated);
        
        /**
         * Sets (as xml) the "lastUpdated" element
         */
        void xsetLastUpdated(org.apache.xmlbeans.XmlDate lastUpdated);
        
        /**
         * Unsets the "lastUpdated" element
         */
        void unsetLastUpdated();
        
        /**
         * Gets the "feature" element
         */
        java.lang.String getFeature();
        
        /**
         * Gets (as xml) the "feature" element
         */
        org.apache.xmlbeans.XmlString xgetFeature();
        
        /**
         * True if has "feature" element
         */
        boolean isSetFeature();
        
        /**
         * Sets the "feature" element
         */
        void setFeature(java.lang.String feature);
        
        /**
         * Sets (as xml) the "feature" element
         */
        void xsetFeature(org.apache.xmlbeans.XmlString feature);
        
        /**
         * Unsets the "feature" element
         */
        void unsetFeature();
        
        /**
         * Gets the "children" element
         */
        org.dhis2.ns.schema.dxf2.ChildrenDocument.Children getChildren();
        
        /**
         * Sets the "children" element
         */
        void setChildren(org.dhis2.ns.schema.dxf2.ChildrenDocument.Children children);
        
        /**
         * Appends and returns a new empty "children" element
         */
        org.dhis2.ns.schema.dxf2.ChildrenDocument.Children addNewChildren();
        
        /**
         * An XML dataSets(@http://dhis2.org/ns/schema/dxf2).
         *
         * This is a complex type.
         */
        public interface DataSets extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataSets.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("datasetsc7dfelemtype");
            
            /**
             * Gets array of all "dataSetRef" elements
             */
            org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef[] getDataSetRefArray();
            
            /**
             * Gets ith "dataSetRef" element
             */
            org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef getDataSetRefArray(int i);
            
            /**
             * Returns number of "dataSetRef" element
             */
            int sizeOfDataSetRefArray();
            
            /**
             * Sets array of all "dataSetRef" element
             */
            void setDataSetRefArray(org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef[] dataSetRefArray);
            
            /**
             * Sets ith "dataSetRef" element
             */
            void setDataSetRefArray(int i, org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef dataSetRef);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "dataSetRef" element
             */
            org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef insertNewDataSetRef(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "dataSetRef" element
             */
            org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef addNewDataSetRef();
            
            /**
             * Removes the ith "dataSetRef" element
             */
            void removeDataSetRef(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets newInstance() {
                  return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit newInstance() {
              return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.OrganisationUnitDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
