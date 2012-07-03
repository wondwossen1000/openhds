/*
 * An XML document type.
 * Localname: reportTables
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ReportTablesDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one reportTables(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface ReportTablesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportTablesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("reporttables517ddoctype");
    
    /**
     * Gets the "reportTables" element
     */
    org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables getReportTables();
    
    /**
     * Sets the "reportTables" element
     */
    void setReportTables(org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables reportTables);
    
    /**
     * Appends and returns a new empty "reportTables" element
     */
    org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables addNewReportTables();
    
    /**
     * An XML reportTables(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface ReportTables extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportTables.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("reporttablesc388elemtype");
        
        /**
         * Gets array of all "reportTable" elements
         */
        org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable[] getReportTableArray();
        
        /**
         * Gets ith "reportTable" element
         */
        org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable getReportTableArray(int i);
        
        /**
         * Returns number of "reportTable" element
         */
        int sizeOfReportTableArray();
        
        /**
         * Sets array of all "reportTable" element
         */
        void setReportTableArray(org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable[] reportTableArray);
        
        /**
         * Sets ith "reportTable" element
         */
        void setReportTableArray(int i, org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable reportTable);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "reportTable" element
         */
        org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable insertNewReportTable(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "reportTable" element
         */
        org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable addNewReportTable();
        
        /**
         * Removes the ith "reportTable" element
         */
        void removeReportTable(int i);
        
        /**
         * An XML reportTable(@http://dhis2.org/ns/schema/dxf2).
         *
         * This is a complex type.
         */
        public interface ReportTable extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportTable.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("reporttable746eelemtype");
            
            /**
             * Gets the "name" element
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "name" element
             */
            org.apache.xmlbeans.XmlString xgetName();
            
            /**
             * Sets the "name" element
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "name" element
             */
            void xsetName(org.apache.xmlbeans.XmlString name);
            
            /**
             * Gets the "tableName" element
             */
            java.lang.String getTableName();
            
            /**
             * Gets (as xml) the "tableName" element
             */
            org.apache.xmlbeans.XmlString xgetTableName();
            
            /**
             * Sets the "tableName" element
             */
            void setTableName(java.lang.String tableName);
            
            /**
             * Sets (as xml) the "tableName" element
             */
            void xsetTableName(org.apache.xmlbeans.XmlString tableName);
            
            /**
             * Gets the "existingTableName" element
             */
            java.lang.String getExistingTableName();
            
            /**
             * Gets (as xml) the "existingTableName" element
             */
            org.apache.xmlbeans.XmlString xgetExistingTableName();
            
            /**
             * Sets the "existingTableName" element
             */
            void setExistingTableName(java.lang.String existingTableName);
            
            /**
             * Sets (as xml) the "existingTableName" element
             */
            void xsetExistingTableName(org.apache.xmlbeans.XmlString existingTableName);
            
            /**
             * Gets the "mode" element
             */
            java.lang.String getMode();
            
            /**
             * Gets (as xml) the "mode" element
             */
            org.apache.xmlbeans.XmlString xgetMode();
            
            /**
             * Sets the "mode" element
             */
            void setMode(java.lang.String mode);
            
            /**
             * Sets (as xml) the "mode" element
             */
            void xsetMode(org.apache.xmlbeans.XmlString mode);
            
            /**
             * Gets the "regression" element
             */
            org.dhis2.ns.schema.dxf2.RegressionDocument.Regression.Enum getRegression();
            
            /**
             * Gets (as xml) the "regression" element
             */
            org.dhis2.ns.schema.dxf2.RegressionDocument.Regression xgetRegression();
            
            /**
             * Sets the "regression" element
             */
            void setRegression(org.dhis2.ns.schema.dxf2.RegressionDocument.Regression.Enum regression);
            
            /**
             * Sets (as xml) the "regression" element
             */
            void xsetRegression(org.dhis2.ns.schema.dxf2.RegressionDocument.Regression regression);
            
            /**
             * Gets the "doIndicators" element
             */
            org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators.Enum getDoIndicators();
            
            /**
             * Gets (as xml) the "doIndicators" element
             */
            org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators xgetDoIndicators();
            
            /**
             * Sets the "doIndicators" element
             */
            void setDoIndicators(org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators.Enum doIndicators);
            
            /**
             * Sets (as xml) the "doIndicators" element
             */
            void xsetDoIndicators(org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators doIndicators);
            
            /**
             * Gets the "doCategoryOptionCombos" element
             */
            org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos.Enum getDoCategoryOptionCombos();
            
            /**
             * Gets (as xml) the "doCategoryOptionCombos" element
             */
            org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos xgetDoCategoryOptionCombos();
            
            /**
             * Sets the "doCategoryOptionCombos" element
             */
            void setDoCategoryOptionCombos(org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos.Enum doCategoryOptionCombos);
            
            /**
             * Sets (as xml) the "doCategoryOptionCombos" element
             */
            void xsetDoCategoryOptionCombos(org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos doCategoryOptionCombos);
            
            /**
             * Gets the "doPeriods" element
             */
            org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods.Enum getDoPeriods();
            
            /**
             * Gets (as xml) the "doPeriods" element
             */
            org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods xgetDoPeriods();
            
            /**
             * Sets the "doPeriods" element
             */
            void setDoPeriods(org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods.Enum doPeriods);
            
            /**
             * Sets (as xml) the "doPeriods" element
             */
            void xsetDoPeriods(org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods doPeriods);
            
            /**
             * Gets the "doOrganisationUnits" element
             */
            org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits.Enum getDoOrganisationUnits();
            
            /**
             * Gets (as xml) the "doOrganisationUnits" element
             */
            org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits xgetDoOrganisationUnits();
            
            /**
             * Sets the "doOrganisationUnits" element
             */
            void setDoOrganisationUnits(org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits.Enum doOrganisationUnits);
            
            /**
             * Sets (as xml) the "doOrganisationUnits" element
             */
            void xsetDoOrganisationUnits(org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits doOrganisationUnits);
            
            /**
             * Gets the "reportingMonth" element
             */
            org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth.Enum getReportingMonth();
            
            /**
             * Gets (as xml) the "reportingMonth" element
             */
            org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth xgetReportingMonth();
            
            /**
             * Sets the "reportingMonth" element
             */
            void setReportingMonth(org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth.Enum reportingMonth);
            
            /**
             * Sets (as xml) the "reportingMonth" element
             */
            void xsetReportingMonth(org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth reportingMonth);
            
            /**
             * Gets the "last3Months" element
             */
            org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months.Enum getLast3Months();
            
            /**
             * Gets (as xml) the "last3Months" element
             */
            org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months xgetLast3Months();
            
            /**
             * Sets the "last3Months" element
             */
            void setLast3Months(org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months.Enum last3Months);
            
            /**
             * Sets (as xml) the "last3Months" element
             */
            void xsetLast3Months(org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months last3Months);
            
            /**
             * Gets the "last6Months" element
             */
            org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months.Enum getLast6Months();
            
            /**
             * Gets (as xml) the "last6Months" element
             */
            org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months xgetLast6Months();
            
            /**
             * Sets the "last6Months" element
             */
            void setLast6Months(org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months.Enum last6Months);
            
            /**
             * Sets (as xml) the "last6Months" element
             */
            void xsetLast6Months(org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months last6Months);
            
            /**
             * Gets the "last9Months" element
             */
            org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months.Enum getLast9Months();
            
            /**
             * Gets (as xml) the "last9Months" element
             */
            org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months xgetLast9Months();
            
            /**
             * Sets the "last9Months" element
             */
            void setLast9Months(org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months.Enum last9Months);
            
            /**
             * Sets (as xml) the "last9Months" element
             */
            void xsetLast9Months(org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months last9Months);
            
            /**
             * Gets the "last12Months" element
             */
            org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months.Enum getLast12Months();
            
            /**
             * Gets (as xml) the "last12Months" element
             */
            org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months xgetLast12Months();
            
            /**
             * Sets the "last12Months" element
             */
            void setLast12Months(org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months.Enum last12Months);
            
            /**
             * Sets (as xml) the "last12Months" element
             */
            void xsetLast12Months(org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months last12Months);
            
            /**
             * Gets the "soFarThisYear" element
             */
            org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear.Enum getSoFarThisYear();
            
            /**
             * Gets (as xml) the "soFarThisYear" element
             */
            org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear xgetSoFarThisYear();
            
            /**
             * Sets the "soFarThisYear" element
             */
            void setSoFarThisYear(org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear.Enum soFarThisYear);
            
            /**
             * Sets (as xml) the "soFarThisYear" element
             */
            void xsetSoFarThisYear(org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear soFarThisYear);
            
            /**
             * Gets the "soFarThisFinancialYear" element
             */
            org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear.Enum getSoFarThisFinancialYear();
            
            /**
             * Gets (as xml) the "soFarThisFinancialYear" element
             */
            org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear xgetSoFarThisFinancialYear();
            
            /**
             * Sets the "soFarThisFinancialYear" element
             */
            void setSoFarThisFinancialYear(org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear.Enum soFarThisFinancialYear);
            
            /**
             * Sets (as xml) the "soFarThisFinancialYear" element
             */
            void xsetSoFarThisFinancialYear(org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear soFarThisFinancialYear);
            
            /**
             * Gets the "last3To6Months" element
             */
            org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months.Enum getLast3To6Months();
            
            /**
             * Gets (as xml) the "last3To6Months" element
             */
            org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months xgetLast3To6Months();
            
            /**
             * Sets the "last3To6Months" element
             */
            void setLast3To6Months(org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months.Enum last3To6Months);
            
            /**
             * Sets (as xml) the "last3To6Months" element
             */
            void xsetLast3To6Months(org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months last3To6Months);
            
            /**
             * Gets the "last6To9Months" element
             */
            org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months.Enum getLast6To9Months();
            
            /**
             * Gets (as xml) the "last6To9Months" element
             */
            org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months xgetLast6To9Months();
            
            /**
             * Sets the "last6To9Months" element
             */
            void setLast6To9Months(org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months.Enum last6To9Months);
            
            /**
             * Sets (as xml) the "last6To9Months" element
             */
            void xsetLast6To9Months(org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months last6To9Months);
            
            /**
             * Gets the "last9To12Months" element
             */
            org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months.Enum getLast9To12Months();
            
            /**
             * Gets (as xml) the "last9To12Months" element
             */
            org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months xgetLast9To12Months();
            
            /**
             * Sets the "last9To12Months" element
             */
            void setLast9To12Months(org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months.Enum last9To12Months);
            
            /**
             * Sets (as xml) the "last9To12Months" element
             */
            void xsetLast9To12Months(org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months last9To12Months);
            
            /**
             * Gets the "last12IndividualMonths" element
             */
            org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths.Enum getLast12IndividualMonths();
            
            /**
             * Gets (as xml) the "last12IndividualMonths" element
             */
            org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths xgetLast12IndividualMonths();
            
            /**
             * Sets the "last12IndividualMonths" element
             */
            void setLast12IndividualMonths(org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths.Enum last12IndividualMonths);
            
            /**
             * Sets (as xml) the "last12IndividualMonths" element
             */
            void xsetLast12IndividualMonths(org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths last12IndividualMonths);
            
            /**
             * Gets the "individualMonthsThisYear" element
             */
            org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear.Enum getIndividualMonthsThisYear();
            
            /**
             * Gets (as xml) the "individualMonthsThisYear" element
             */
            org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear xgetIndividualMonthsThisYear();
            
            /**
             * Sets the "individualMonthsThisYear" element
             */
            void setIndividualMonthsThisYear(org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear.Enum individualMonthsThisYear);
            
            /**
             * Sets (as xml) the "individualMonthsThisYear" element
             */
            void xsetIndividualMonthsThisYear(org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear individualMonthsThisYear);
            
            /**
             * Gets the "individualQuartersThisYear" element
             */
            org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear.Enum getIndividualQuartersThisYear();
            
            /**
             * Gets (as xml) the "individualQuartersThisYear" element
             */
            org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear xgetIndividualQuartersThisYear();
            
            /**
             * Sets the "individualQuartersThisYear" element
             */
            void setIndividualQuartersThisYear(org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear.Enum individualQuartersThisYear);
            
            /**
             * Sets (as xml) the "individualQuartersThisYear" element
             */
            void xsetIndividualQuartersThisYear(org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear individualQuartersThisYear);
            
            /**
             * Gets the "paramReportingMonth" element
             */
            org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth.Enum getParamReportingMonth();
            
            /**
             * Gets (as xml) the "paramReportingMonth" element
             */
            org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth xgetParamReportingMonth();
            
            /**
             * Sets the "paramReportingMonth" element
             */
            void setParamReportingMonth(org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth.Enum paramReportingMonth);
            
            /**
             * Sets (as xml) the "paramReportingMonth" element
             */
            void xsetParamReportingMonth(org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth paramReportingMonth);
            
            /**
             * Gets the "paramParentOrganisationUnit" element
             */
            org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit.Enum getParamParentOrganisationUnit();
            
            /**
             * Gets (as xml) the "paramParentOrganisationUnit" element
             */
            org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit xgetParamParentOrganisationUnit();
            
            /**
             * Sets the "paramParentOrganisationUnit" element
             */
            void setParamParentOrganisationUnit(org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit.Enum paramParentOrganisationUnit);
            
            /**
             * Sets (as xml) the "paramParentOrganisationUnit" element
             */
            void xsetParamParentOrganisationUnit(org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit paramParentOrganisationUnit);
            
            /**
             * Gets the "paramOrganisationUnit" element
             */
            org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit.Enum getParamOrganisationUnit();
            
            /**
             * Gets (as xml) the "paramOrganisationUnit" element
             */
            org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit xgetParamOrganisationUnit();
            
            /**
             * Sets the "paramOrganisationUnit" element
             */
            void setParamOrganisationUnit(org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit.Enum paramOrganisationUnit);
            
            /**
             * Sets (as xml) the "paramOrganisationUnit" element
             */
            void xsetParamOrganisationUnit(org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit paramOrganisationUnit);
            
            /**
             * Gets the "dataElements" element
             */
            org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements getDataElements();
            
            /**
             * Sets the "dataElements" element
             */
            void setDataElements(org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements dataElements);
            
            /**
             * Appends and returns a new empty "dataElements" element
             */
            org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements addNewDataElements();
            
            /**
             * Gets the "id" attribute
             */
            int getId();
            
            /**
             * Gets (as xml) the "id" attribute
             */
            org.dhis2.ns.schema.dxf2.DxfID xgetId();
            
            /**
             * Sets the "id" attribute
             */
            void setId(int id);
            
            /**
             * Sets (as xml) the "id" attribute
             */
            void xsetId(org.dhis2.ns.schema.dxf2.DxfID id);
            
            /**
             * An XML dataElements(@http://dhis2.org/ns/schema/dxf2).
             *
             * This is a complex type.
             */
            public interface DataElements extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataElements.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("dataelements984belemtype");
                
                /**
                 * Gets array of all "dataElement" elements
                 */
                org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement[] getDataElementArray();
                
                /**
                 * Gets ith "dataElement" element
                 */
                org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement getDataElementArray(int i);
                
                /**
                 * Returns number of "dataElement" element
                 */
                int sizeOfDataElementArray();
                
                /**
                 * Sets array of all "dataElement" element
                 */
                void setDataElementArray(org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement[] dataElementArray);
                
                /**
                 * Sets ith "dataElement" element
                 */
                void setDataElementArray(int i, org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement dataElement);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "dataElement" element
                 */
                org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement insertNewDataElement(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "dataElement" element
                 */
                org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement addNewDataElement();
                
                /**
                 * Removes the ith "dataElement" element
                 */
                void removeDataElement(int i);
                
                /**
                 * An XML dataElement(@http://dhis2.org/ns/schema/dxf2).
                 *
                 * This is a complex type.
                 */
                public interface DataElement extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("dataelemente12delemtype");
                    
                    /**
                     * Gets the "id" attribute
                     */
                    int getId();
                    
                    /**
                     * Gets (as xml) the "id" attribute
                     */
                    org.dhis2.ns.schema.dxf2.DxfID xgetId();
                    
                    /**
                     * Sets the "id" attribute
                     */
                    void setId(int id);
                    
                    /**
                     * Sets (as xml) the "id" attribute
                     */
                    void xsetId(org.dhis2.ns.schema.dxf2.DxfID id);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement newInstance() {
                        return (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements newInstance() {
                      return (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable newInstance() {
                  return (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables newInstance() {
              return (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.ReportTablesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.ReportTablesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
