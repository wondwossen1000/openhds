/*
 * An XML document type.
 * Localname: metadata
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.MetadataDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one metadata(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface MetadataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MetadataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("metadata1073doctype");
    
    /**
     * Gets the "metadata" element
     */
    org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata getMetadata();
    
    /**
     * Sets the "metadata" element
     */
    void setMetadata(org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata metadata);
    
    /**
     * Appends and returns a new empty "metadata" element
     */
    org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata addNewMetadata();
    
    /**
     * An XML metadata(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface Metadata extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Metadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("metadata53c8elemtype");
        
        /**
         * Gets the "categories" element
         */
        org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories getCategories();
        
        /**
         * True if has "categories" element
         */
        boolean isSetCategories();
        
        /**
         * Sets the "categories" element
         */
        void setCategories(org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories categories);
        
        /**
         * Appends and returns a new empty "categories" element
         */
        org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories addNewCategories();
        
        /**
         * Unsets the "categories" element
         */
        void unsetCategories();
        
        /**
         * Gets the "categoryCombos" element
         */
        org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos getCategoryCombos();
        
        /**
         * True if has "categoryCombos" element
         */
        boolean isSetCategoryCombos();
        
        /**
         * Sets the "categoryCombos" element
         */
        void setCategoryCombos(org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos categoryCombos);
        
        /**
         * Appends and returns a new empty "categoryCombos" element
         */
        org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos addNewCategoryCombos();
        
        /**
         * Unsets the "categoryCombos" element
         */
        void unsetCategoryCombos();
        
        /**
         * Gets the "categoryOptions" element
         */
        org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions getCategoryOptions();
        
        /**
         * True if has "categoryOptions" element
         */
        boolean isSetCategoryOptions();
        
        /**
         * Sets the "categoryOptions" element
         */
        void setCategoryOptions(org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions categoryOptions);
        
        /**
         * Appends and returns a new empty "categoryOptions" element
         */
        org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions addNewCategoryOptions();
        
        /**
         * Unsets the "categoryOptions" element
         */
        void unsetCategoryOptions();
        
        /**
         * Gets the "categoryOptionCombos" element
         */
        org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos getCategoryOptionCombos();
        
        /**
         * True if has "categoryOptionCombos" element
         */
        boolean isSetCategoryOptionCombos();
        
        /**
         * Sets the "categoryOptionCombos" element
         */
        void setCategoryOptionCombos(org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos categoryOptionCombos);
        
        /**
         * Appends and returns a new empty "categoryOptionCombos" element
         */
        org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos addNewCategoryOptionCombos();
        
        /**
         * Unsets the "categoryOptionCombos" element
         */
        void unsetCategoryOptionCombos();
        
        /**
         * Gets the "dataElements" element
         */
        org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements getDataElements();
        
        /**
         * True if has "dataElements" element
         */
        boolean isSetDataElements();
        
        /**
         * Sets the "dataElements" element
         */
        void setDataElements(org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements dataElements);
        
        /**
         * Appends and returns a new empty "dataElements" element
         */
        org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements addNewDataElements();
        
        /**
         * Unsets the "dataElements" element
         */
        void unsetDataElements();
        
        /**
         * Gets the "indicatorTypes" element
         */
        org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes getIndicatorTypes();
        
        /**
         * True if has "indicatorTypes" element
         */
        boolean isSetIndicatorTypes();
        
        /**
         * Sets the "indicatorTypes" element
         */
        void setIndicatorTypes(org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes indicatorTypes);
        
        /**
         * Appends and returns a new empty "indicatorTypes" element
         */
        org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes addNewIndicatorTypes();
        
        /**
         * Unsets the "indicatorTypes" element
         */
        void unsetIndicatorTypes();
        
        /**
         * Gets the "indicators" element
         */
        org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators getIndicators();
        
        /**
         * True if has "indicators" element
         */
        boolean isSetIndicators();
        
        /**
         * Sets the "indicators" element
         */
        void setIndicators(org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators indicators);
        
        /**
         * Appends and returns a new empty "indicators" element
         */
        org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators addNewIndicators();
        
        /**
         * Unsets the "indicators" element
         */
        void unsetIndicators();
        
        /**
         * Gets the "dataElementGroupSets" element
         */
        org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets getDataElementGroupSets();
        
        /**
         * True if has "dataElementGroupSets" element
         */
        boolean isSetDataElementGroupSets();
        
        /**
         * Sets the "dataElementGroupSets" element
         */
        void setDataElementGroupSets(org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets dataElementGroupSets);
        
        /**
         * Appends and returns a new empty "dataElementGroupSets" element
         */
        org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets addNewDataElementGroupSets();
        
        /**
         * Unsets the "dataElementGroupSets" element
         */
        void unsetDataElementGroupSets();
        
        /**
         * Gets the "indicatorGroupSets" element
         */
        org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets getIndicatorGroupSets();
        
        /**
         * True if has "indicatorGroupSets" element
         */
        boolean isSetIndicatorGroupSets();
        
        /**
         * Sets the "indicatorGroupSets" element
         */
        void setIndicatorGroupSets(org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets indicatorGroupSets);
        
        /**
         * Appends and returns a new empty "indicatorGroupSets" element
         */
        org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets addNewIndicatorGroupSets();
        
        /**
         * Unsets the "indicatorGroupSets" element
         */
        void unsetIndicatorGroupSets();
        
        /**
         * Gets the "dataSets" element
         */
        org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets getDataSets();
        
        /**
         * True if has "dataSets" element
         */
        boolean isSetDataSets();
        
        /**
         * Sets the "dataSets" element
         */
        void setDataSets(org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets dataSets);
        
        /**
         * Appends and returns a new empty "dataSets" element
         */
        org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets addNewDataSets();
        
        /**
         * Unsets the "dataSets" element
         */
        void unsetDataSets();
        
        /**
         * Gets the "dataSetMembers" element
         */
        org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers getDataSetMembers();
        
        /**
         * True if has "dataSetMembers" element
         */
        boolean isSetDataSetMembers();
        
        /**
         * Sets the "dataSetMembers" element
         */
        void setDataSetMembers(org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers dataSetMembers);
        
        /**
         * Appends and returns a new empty "dataSetMembers" element
         */
        org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers addNewDataSetMembers();
        
        /**
         * Unsets the "dataSetMembers" element
         */
        void unsetDataSetMembers();
        
        /**
         * Gets the "DataDictionaryDefinition" element
         */
        org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition getDataDictionaryDefinition();
        
        /**
         * True if has "DataDictionaryDefinition" element
         */
        boolean isSetDataDictionaryDefinition();
        
        /**
         * Sets the "DataDictionaryDefinition" element
         */
        void setDataDictionaryDefinition(org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition dataDictionaryDefinition);
        
        /**
         * Appends and returns a new empty "DataDictionaryDefinition" element
         */
        org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition addNewDataDictionaryDefinition();
        
        /**
         * Unsets the "DataDictionaryDefinition" element
         */
        void unsetDataDictionaryDefinition();
        
        /**
         * Gets the "orgUnitStructure" element
         */
        org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure getOrgUnitStructure();
        
        /**
         * True if has "orgUnitStructure" element
         */
        boolean isSetOrgUnitStructure();
        
        /**
         * Sets the "orgUnitStructure" element
         */
        void setOrgUnitStructure(org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure orgUnitStructure);
        
        /**
         * Appends and returns a new empty "orgUnitStructure" element
         */
        org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure addNewOrgUnitStructure();
        
        /**
         * Unsets the "orgUnitStructure" element
         */
        void unsetOrgUnitStructure();
        
        /**
         * Gets the "periods" element
         */
        org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods getPeriods();
        
        /**
         * True if has "periods" element
         */
        boolean isSetPeriods();
        
        /**
         * Sets the "periods" element
         */
        void setPeriods(org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods periods);
        
        /**
         * Appends and returns a new empty "periods" element
         */
        org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods addNewPeriods();
        
        /**
         * Unsets the "periods" element
         */
        void unsetPeriods();
        
        /**
         * Gets the "reportTables" element
         */
        org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables getReportTables();
        
        /**
         * True if has "reportTables" element
         */
        boolean isSetReportTables();
        
        /**
         * Sets the "reportTables" element
         */
        void setReportTables(org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables reportTables);
        
        /**
         * Appends and returns a new empty "reportTables" element
         */
        org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables addNewReportTables();
        
        /**
         * Unsets the "reportTables" element
         */
        void unsetReportTables();
        
        /**
         * Gets the "reportTableDataElements" element
         */
        org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements getReportTableDataElements();
        
        /**
         * True if has "reportTableDataElements" element
         */
        boolean isSetReportTableDataElements();
        
        /**
         * Sets the "reportTableDataElements" element
         */
        void setReportTableDataElements(org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements reportTableDataElements);
        
        /**
         * Appends and returns a new empty "reportTableDataElements" element
         */
        org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements addNewReportTableDataElements();
        
        /**
         * Unsets the "reportTableDataElements" element
         */
        void unsetReportTableDataElements();
        
        /**
         * Gets the "reportTableCategoryOptionCombos" element
         */
        org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos getReportTableCategoryOptionCombos();
        
        /**
         * True if has "reportTableCategoryOptionCombos" element
         */
        boolean isSetReportTableCategoryOptionCombos();
        
        /**
         * Sets the "reportTableCategoryOptionCombos" element
         */
        void setReportTableCategoryOptionCombos(org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos reportTableCategoryOptionCombos);
        
        /**
         * Appends and returns a new empty "reportTableCategoryOptionCombos" element
         */
        org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos addNewReportTableCategoryOptionCombos();
        
        /**
         * Unsets the "reportTableCategoryOptionCombos" element
         */
        void unsetReportTableCategoryOptionCombos();
        
        /**
         * Gets the "reportTableIndicators" element
         */
        org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators getReportTableIndicators();
        
        /**
         * True if has "reportTableIndicators" element
         */
        boolean isSetReportTableIndicators();
        
        /**
         * Sets the "reportTableIndicators" element
         */
        void setReportTableIndicators(org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators reportTableIndicators);
        
        /**
         * Appends and returns a new empty "reportTableIndicators" element
         */
        org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators addNewReportTableIndicators();
        
        /**
         * Unsets the "reportTableIndicators" element
         */
        void unsetReportTableIndicators();
        
        /**
         * Gets the "reportTableDataSets" element
         */
        org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets getReportTableDataSets();
        
        /**
         * True if has "reportTableDataSets" element
         */
        boolean isSetReportTableDataSets();
        
        /**
         * Sets the "reportTableDataSets" element
         */
        void setReportTableDataSets(org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets reportTableDataSets);
        
        /**
         * Appends and returns a new empty "reportTableDataSets" element
         */
        org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets addNewReportTableDataSets();
        
        /**
         * Unsets the "reportTableDataSets" element
         */
        void unsetReportTableDataSets();
        
        /**
         * Gets the "reportTablePeriods" element
         */
        org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods getReportTablePeriods();
        
        /**
         * True if has "reportTablePeriods" element
         */
        boolean isSetReportTablePeriods();
        
        /**
         * Sets the "reportTablePeriods" element
         */
        void setReportTablePeriods(org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods reportTablePeriods);
        
        /**
         * Appends and returns a new empty "reportTablePeriods" element
         */
        org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods addNewReportTablePeriods();
        
        /**
         * Unsets the "reportTablePeriods" element
         */
        void unsetReportTablePeriods();
        
        /**
         * Gets the "reportTableOrganisationUnits" element
         */
        org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits getReportTableOrganisationUnits();
        
        /**
         * True if has "reportTableOrganisationUnits" element
         */
        boolean isSetReportTableOrganisationUnits();
        
        /**
         * Sets the "reportTableOrganisationUnits" element
         */
        void setReportTableOrganisationUnits(org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits reportTableOrganisationUnits);
        
        /**
         * Appends and returns a new empty "reportTableOrganisationUnits" element
         */
        org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits addNewReportTableOrganisationUnits();
        
        /**
         * Unsets the "reportTableOrganisationUnits" element
         */
        void unsetReportTableOrganisationUnits();
        
        /**
         * Gets the "completeDataSetRegistrations" element
         */
        org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations getCompleteDataSetRegistrations();
        
        /**
         * True if has "completeDataSetRegistrations" element
         */
        boolean isSetCompleteDataSetRegistrations();
        
        /**
         * Sets the "completeDataSetRegistrations" element
         */
        void setCompleteDataSetRegistrations(org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations completeDataSetRegistrations);
        
        /**
         * Appends and returns a new empty "completeDataSetRegistrations" element
         */
        org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations addNewCompleteDataSetRegistrations();
        
        /**
         * Unsets the "completeDataSetRegistrations" element
         */
        void unsetCompleteDataSetRegistrations();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata newInstance() {
              return (org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.MetadataDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.MetadataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.MetadataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.MetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
