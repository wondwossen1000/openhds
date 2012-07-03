/*
 * An XML document type.
 * Localname: reportTables
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.ReportTablesDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one reportTables(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class ReportTablesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTablesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReportTablesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPORTTABLES$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTables");
    
    
    /**
     * Gets the "reportTables" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables getReportTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables)get_store().find_element_user(REPORTTABLES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "reportTables" element
     */
    public void setReportTables(org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables reportTables)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables)get_store().find_element_user(REPORTTABLES$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables)get_store().add_element_user(REPORTTABLES$0);
            }
            target.set(reportTables);
        }
    }
    
    /**
     * Appends and returns a new empty "reportTables" element
     */
    public org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables addNewReportTables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables target = null;
            target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables)get_store().add_element_user(REPORTTABLES$0);
            return target;
        }
    }
    /**
     * An XML reportTables(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class ReportTablesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables
    {
        private static final long serialVersionUID = 1L;
        
        public ReportTablesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPORTTABLE$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTable");
        
        
        /**
         * Gets array of all "reportTable" elements
         */
        public org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable[] getReportTableArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REPORTTABLE$0, targetList);
                org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable[] result = new org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "reportTable" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable getReportTableArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable)get_store().find_element_user(REPORTTABLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "reportTable" element
         */
        public int sizeOfReportTableArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORTTABLE$0);
            }
        }
        
        /**
         * Sets array of all "reportTable" element
         */
        public void setReportTableArray(org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable[] reportTableArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(reportTableArray, REPORTTABLE$0);
            }
        }
        
        /**
         * Sets ith "reportTable" element
         */
        public void setReportTableArray(int i, org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable reportTable)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable)get_store().find_element_user(REPORTTABLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(reportTable);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "reportTable" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable insertNewReportTable(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable)get_store().insert_element_user(REPORTTABLE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "reportTable" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable addNewReportTable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable)get_store().add_element_user(REPORTTABLE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "reportTable" element
         */
        public void removeReportTable(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORTTABLE$0, i);
            }
        }
        /**
         * An XML reportTable(@http://dhis2.org/ns/schema/dxf2).
         *
         * This is a complex type.
         */
        public static class ReportTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable
        {
            private static final long serialVersionUID = 1L;
            
            public ReportTableImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NAME$0 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "name");
            private static final javax.xml.namespace.QName TABLENAME$2 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "tableName");
            private static final javax.xml.namespace.QName EXISTINGTABLENAME$4 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "existingTableName");
            private static final javax.xml.namespace.QName MODE$6 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "mode");
            private static final javax.xml.namespace.QName REGRESSION$8 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "regression");
            private static final javax.xml.namespace.QName DOINDICATORS$10 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "doIndicators");
            private static final javax.xml.namespace.QName DOCATEGORYOPTIONCOMBOS$12 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "doCategoryOptionCombos");
            private static final javax.xml.namespace.QName DOPERIODS$14 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "doPeriods");
            private static final javax.xml.namespace.QName DOORGANISATIONUNITS$16 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "doOrganisationUnits");
            private static final javax.xml.namespace.QName REPORTINGMONTH$18 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportingMonth");
            private static final javax.xml.namespace.QName LAST3MONTHS$20 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last3Months");
            private static final javax.xml.namespace.QName LAST6MONTHS$22 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last6Months");
            private static final javax.xml.namespace.QName LAST9MONTHS$24 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last9Months");
            private static final javax.xml.namespace.QName LAST12MONTHS$26 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last12Months");
            private static final javax.xml.namespace.QName SOFARTHISYEAR$28 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "soFarThisYear");
            private static final javax.xml.namespace.QName SOFARTHISFINANCIALYEAR$30 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "soFarThisFinancialYear");
            private static final javax.xml.namespace.QName LAST3TO6MONTHS$32 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last3To6Months");
            private static final javax.xml.namespace.QName LAST6TO9MONTHS$34 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last6To9Months");
            private static final javax.xml.namespace.QName LAST9TO12MONTHS$36 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last9To12Months");
            private static final javax.xml.namespace.QName LAST12INDIVIDUALMONTHS$38 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "last12IndividualMonths");
            private static final javax.xml.namespace.QName INDIVIDUALMONTHSTHISYEAR$40 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "individualMonthsThisYear");
            private static final javax.xml.namespace.QName INDIVIDUALQUARTERSTHISYEAR$42 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "individualQuartersThisYear");
            private static final javax.xml.namespace.QName PARAMREPORTINGMONTH$44 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "paramReportingMonth");
            private static final javax.xml.namespace.QName PARAMPARENTORGANISATIONUNIT$46 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "paramParentOrganisationUnit");
            private static final javax.xml.namespace.QName PARAMORGANISATIONUNIT$48 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "paramOrganisationUnit");
            private static final javax.xml.namespace.QName DATAELEMENTS$50 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElements");
            private static final javax.xml.namespace.QName ID$52 = 
                new javax.xml.namespace.QName("", "id");
            
            
            /**
             * Gets the "name" element
             */
            public java.lang.String getName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "name" element
             */
            public org.apache.xmlbeans.XmlString xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "name" element
             */
            public void setName(java.lang.String name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                    }
                    target.setStringValue(name);
                }
            }
            
            /**
             * Sets (as xml) the "name" element
             */
            public void xsetName(org.apache.xmlbeans.XmlString name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                    }
                    target.set(name);
                }
            }
            
            /**
             * Gets the "tableName" element
             */
            public java.lang.String getTableName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TABLENAME$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "tableName" element
             */
            public org.apache.xmlbeans.XmlString xgetTableName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TABLENAME$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "tableName" element
             */
            public void setTableName(java.lang.String tableName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TABLENAME$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TABLENAME$2);
                    }
                    target.setStringValue(tableName);
                }
            }
            
            /**
             * Sets (as xml) the "tableName" element
             */
            public void xsetTableName(org.apache.xmlbeans.XmlString tableName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TABLENAME$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TABLENAME$2);
                    }
                    target.set(tableName);
                }
            }
            
            /**
             * Gets the "existingTableName" element
             */
            public java.lang.String getExistingTableName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTINGTABLENAME$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "existingTableName" element
             */
            public org.apache.xmlbeans.XmlString xgetExistingTableName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXISTINGTABLENAME$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "existingTableName" element
             */
            public void setExistingTableName(java.lang.String existingTableName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTINGTABLENAME$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXISTINGTABLENAME$4);
                    }
                    target.setStringValue(existingTableName);
                }
            }
            
            /**
             * Sets (as xml) the "existingTableName" element
             */
            public void xsetExistingTableName(org.apache.xmlbeans.XmlString existingTableName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXISTINGTABLENAME$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXISTINGTABLENAME$4);
                    }
                    target.set(existingTableName);
                }
            }
            
            /**
             * Gets the "mode" element
             */
            public java.lang.String getMode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODE$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "mode" element
             */
            public org.apache.xmlbeans.XmlString xgetMode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODE$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "mode" element
             */
            public void setMode(java.lang.String mode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODE$6);
                    }
                    target.setStringValue(mode);
                }
            }
            
            /**
             * Sets (as xml) the "mode" element
             */
            public void xsetMode(org.apache.xmlbeans.XmlString mode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MODE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MODE$6);
                    }
                    target.set(mode);
                }
            }
            
            /**
             * Gets the "regression" element
             */
            public org.dhis2.ns.schema.dxf2.RegressionDocument.Regression.Enum getRegression()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGRESSION$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.RegressionDocument.Regression.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "regression" element
             */
            public org.dhis2.ns.schema.dxf2.RegressionDocument.Regression xgetRegression()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.RegressionDocument.Regression target = null;
                    target = (org.dhis2.ns.schema.dxf2.RegressionDocument.Regression)get_store().find_element_user(REGRESSION$8, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "regression" element
             */
            public void setRegression(org.dhis2.ns.schema.dxf2.RegressionDocument.Regression.Enum regression)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGRESSION$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGRESSION$8);
                    }
                    target.setEnumValue(regression);
                }
            }
            
            /**
             * Sets (as xml) the "regression" element
             */
            public void xsetRegression(org.dhis2.ns.schema.dxf2.RegressionDocument.Regression regression)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.RegressionDocument.Regression target = null;
                    target = (org.dhis2.ns.schema.dxf2.RegressionDocument.Regression)get_store().find_element_user(REGRESSION$8, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.RegressionDocument.Regression)get_store().add_element_user(REGRESSION$8);
                    }
                    target.set(regression);
                }
            }
            
            /**
             * Gets the "doIndicators" element
             */
            public org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators.Enum getDoIndicators()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOINDICATORS$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "doIndicators" element
             */
            public org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators xgetDoIndicators()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators target = null;
                    target = (org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators)get_store().find_element_user(DOINDICATORS$10, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "doIndicators" element
             */
            public void setDoIndicators(org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators.Enum doIndicators)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOINDICATORS$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOINDICATORS$10);
                    }
                    target.setEnumValue(doIndicators);
                }
            }
            
            /**
             * Sets (as xml) the "doIndicators" element
             */
            public void xsetDoIndicators(org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators doIndicators)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators target = null;
                    target = (org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators)get_store().find_element_user(DOINDICATORS$10, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.DoIndicatorsDocument.DoIndicators)get_store().add_element_user(DOINDICATORS$10);
                    }
                    target.set(doIndicators);
                }
            }
            
            /**
             * Gets the "doCategoryOptionCombos" element
             */
            public org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos.Enum getDoCategoryOptionCombos()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCATEGORYOPTIONCOMBOS$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "doCategoryOptionCombos" element
             */
            public org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos xgetDoCategoryOptionCombos()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos target = null;
                    target = (org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos)get_store().find_element_user(DOCATEGORYOPTIONCOMBOS$12, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "doCategoryOptionCombos" element
             */
            public void setDoCategoryOptionCombos(org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos.Enum doCategoryOptionCombos)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCATEGORYOPTIONCOMBOS$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCATEGORYOPTIONCOMBOS$12);
                    }
                    target.setEnumValue(doCategoryOptionCombos);
                }
            }
            
            /**
             * Sets (as xml) the "doCategoryOptionCombos" element
             */
            public void xsetDoCategoryOptionCombos(org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos doCategoryOptionCombos)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos target = null;
                    target = (org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos)get_store().find_element_user(DOCATEGORYOPTIONCOMBOS$12, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.DoCategoryOptionCombosDocument.DoCategoryOptionCombos)get_store().add_element_user(DOCATEGORYOPTIONCOMBOS$12);
                    }
                    target.set(doCategoryOptionCombos);
                }
            }
            
            /**
             * Gets the "doPeriods" element
             */
            public org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods.Enum getDoPeriods()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOPERIODS$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "doPeriods" element
             */
            public org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods xgetDoPeriods()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods target = null;
                    target = (org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods)get_store().find_element_user(DOPERIODS$14, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "doPeriods" element
             */
            public void setDoPeriods(org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods.Enum doPeriods)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOPERIODS$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOPERIODS$14);
                    }
                    target.setEnumValue(doPeriods);
                }
            }
            
            /**
             * Sets (as xml) the "doPeriods" element
             */
            public void xsetDoPeriods(org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods doPeriods)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods target = null;
                    target = (org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods)get_store().find_element_user(DOPERIODS$14, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.DoPeriodsDocument.DoPeriods)get_store().add_element_user(DOPERIODS$14);
                    }
                    target.set(doPeriods);
                }
            }
            
            /**
             * Gets the "doOrganisationUnits" element
             */
            public org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits.Enum getDoOrganisationUnits()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOORGANISATIONUNITS$16, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "doOrganisationUnits" element
             */
            public org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits xgetDoOrganisationUnits()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits target = null;
                    target = (org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits)get_store().find_element_user(DOORGANISATIONUNITS$16, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "doOrganisationUnits" element
             */
            public void setDoOrganisationUnits(org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits.Enum doOrganisationUnits)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOORGANISATIONUNITS$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOORGANISATIONUNITS$16);
                    }
                    target.setEnumValue(doOrganisationUnits);
                }
            }
            
            /**
             * Sets (as xml) the "doOrganisationUnits" element
             */
            public void xsetDoOrganisationUnits(org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits doOrganisationUnits)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits target = null;
                    target = (org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits)get_store().find_element_user(DOORGANISATIONUNITS$16, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.DoOrganisationUnitsDocument.DoOrganisationUnits)get_store().add_element_user(DOORGANISATIONUNITS$16);
                    }
                    target.set(doOrganisationUnits);
                }
            }
            
            /**
             * Gets the "reportingMonth" element
             */
            public org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth.Enum getReportingMonth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGMONTH$18, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "reportingMonth" element
             */
            public org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth xgetReportingMonth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth target = null;
                    target = (org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth)get_store().find_element_user(REPORTINGMONTH$18, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "reportingMonth" element
             */
            public void setReportingMonth(org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth.Enum reportingMonth)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGMONTH$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTINGMONTH$18);
                    }
                    target.setEnumValue(reportingMonth);
                }
            }
            
            /**
             * Sets (as xml) the "reportingMonth" element
             */
            public void xsetReportingMonth(org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth reportingMonth)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth target = null;
                    target = (org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth)get_store().find_element_user(REPORTINGMONTH$18, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.ReportingMonthDocument.ReportingMonth)get_store().add_element_user(REPORTINGMONTH$18);
                    }
                    target.set(reportingMonth);
                }
            }
            
            /**
             * Gets the "last3Months" element
             */
            public org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months.Enum getLast3Months()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST3MONTHS$20, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "last3Months" element
             */
            public org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months xgetLast3Months()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months)get_store().find_element_user(LAST3MONTHS$20, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "last3Months" element
             */
            public void setLast3Months(org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months.Enum last3Months)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST3MONTHS$20, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST3MONTHS$20);
                    }
                    target.setEnumValue(last3Months);
                }
            }
            
            /**
             * Sets (as xml) the "last3Months" element
             */
            public void xsetLast3Months(org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months last3Months)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months)get_store().find_element_user(LAST3MONTHS$20, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.Last3MonthsDocument.Last3Months)get_store().add_element_user(LAST3MONTHS$20);
                    }
                    target.set(last3Months);
                }
            }
            
            /**
             * Gets the "last6Months" element
             */
            public org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months.Enum getLast6Months()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST6MONTHS$22, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "last6Months" element
             */
            public org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months xgetLast6Months()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months)get_store().find_element_user(LAST6MONTHS$22, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "last6Months" element
             */
            public void setLast6Months(org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months.Enum last6Months)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST6MONTHS$22, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST6MONTHS$22);
                    }
                    target.setEnumValue(last6Months);
                }
            }
            
            /**
             * Sets (as xml) the "last6Months" element
             */
            public void xsetLast6Months(org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months last6Months)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months)get_store().find_element_user(LAST6MONTHS$22, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.Last6MonthsDocument.Last6Months)get_store().add_element_user(LAST6MONTHS$22);
                    }
                    target.set(last6Months);
                }
            }
            
            /**
             * Gets the "last9Months" element
             */
            public org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months.Enum getLast9Months()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST9MONTHS$24, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "last9Months" element
             */
            public org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months xgetLast9Months()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months)get_store().find_element_user(LAST9MONTHS$24, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "last9Months" element
             */
            public void setLast9Months(org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months.Enum last9Months)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST9MONTHS$24, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST9MONTHS$24);
                    }
                    target.setEnumValue(last9Months);
                }
            }
            
            /**
             * Sets (as xml) the "last9Months" element
             */
            public void xsetLast9Months(org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months last9Months)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months)get_store().find_element_user(LAST9MONTHS$24, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.Last9MonthsDocument.Last9Months)get_store().add_element_user(LAST9MONTHS$24);
                    }
                    target.set(last9Months);
                }
            }
            
            /**
             * Gets the "last12Months" element
             */
            public org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months.Enum getLast12Months()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST12MONTHS$26, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "last12Months" element
             */
            public org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months xgetLast12Months()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months)get_store().find_element_user(LAST12MONTHS$26, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "last12Months" element
             */
            public void setLast12Months(org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months.Enum last12Months)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST12MONTHS$26, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST12MONTHS$26);
                    }
                    target.setEnumValue(last12Months);
                }
            }
            
            /**
             * Sets (as xml) the "last12Months" element
             */
            public void xsetLast12Months(org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months last12Months)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months)get_store().find_element_user(LAST12MONTHS$26, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.Last12MonthsDocument.Last12Months)get_store().add_element_user(LAST12MONTHS$26);
                    }
                    target.set(last12Months);
                }
            }
            
            /**
             * Gets the "soFarThisYear" element
             */
            public org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear.Enum getSoFarThisYear()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFARTHISYEAR$28, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "soFarThisYear" element
             */
            public org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear xgetSoFarThisYear()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear target = null;
                    target = (org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear)get_store().find_element_user(SOFARTHISYEAR$28, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "soFarThisYear" element
             */
            public void setSoFarThisYear(org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear.Enum soFarThisYear)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFARTHISYEAR$28, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOFARTHISYEAR$28);
                    }
                    target.setEnumValue(soFarThisYear);
                }
            }
            
            /**
             * Sets (as xml) the "soFarThisYear" element
             */
            public void xsetSoFarThisYear(org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear soFarThisYear)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear target = null;
                    target = (org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear)get_store().find_element_user(SOFARTHISYEAR$28, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.SoFarThisYearDocument.SoFarThisYear)get_store().add_element_user(SOFARTHISYEAR$28);
                    }
                    target.set(soFarThisYear);
                }
            }
            
            /**
             * Gets the "soFarThisFinancialYear" element
             */
            public org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear.Enum getSoFarThisFinancialYear()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFARTHISFINANCIALYEAR$30, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "soFarThisFinancialYear" element
             */
            public org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear xgetSoFarThisFinancialYear()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear target = null;
                    target = (org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear)get_store().find_element_user(SOFARTHISFINANCIALYEAR$30, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "soFarThisFinancialYear" element
             */
            public void setSoFarThisFinancialYear(org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear.Enum soFarThisFinancialYear)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFARTHISFINANCIALYEAR$30, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOFARTHISFINANCIALYEAR$30);
                    }
                    target.setEnumValue(soFarThisFinancialYear);
                }
            }
            
            /**
             * Sets (as xml) the "soFarThisFinancialYear" element
             */
            public void xsetSoFarThisFinancialYear(org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear soFarThisFinancialYear)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear target = null;
                    target = (org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear)get_store().find_element_user(SOFARTHISFINANCIALYEAR$30, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.SoFarThisFinancialYearDocument.SoFarThisFinancialYear)get_store().add_element_user(SOFARTHISFINANCIALYEAR$30);
                    }
                    target.set(soFarThisFinancialYear);
                }
            }
            
            /**
             * Gets the "last3To6Months" element
             */
            public org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months.Enum getLast3To6Months()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST3TO6MONTHS$32, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "last3To6Months" element
             */
            public org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months xgetLast3To6Months()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months)get_store().find_element_user(LAST3TO6MONTHS$32, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "last3To6Months" element
             */
            public void setLast3To6Months(org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months.Enum last3To6Months)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST3TO6MONTHS$32, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST3TO6MONTHS$32);
                    }
                    target.setEnumValue(last3To6Months);
                }
            }
            
            /**
             * Sets (as xml) the "last3To6Months" element
             */
            public void xsetLast3To6Months(org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months last3To6Months)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months)get_store().find_element_user(LAST3TO6MONTHS$32, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.Last3To6MonthsDocument.Last3To6Months)get_store().add_element_user(LAST3TO6MONTHS$32);
                    }
                    target.set(last3To6Months);
                }
            }
            
            /**
             * Gets the "last6To9Months" element
             */
            public org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months.Enum getLast6To9Months()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST6TO9MONTHS$34, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "last6To9Months" element
             */
            public org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months xgetLast6To9Months()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months)get_store().find_element_user(LAST6TO9MONTHS$34, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "last6To9Months" element
             */
            public void setLast6To9Months(org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months.Enum last6To9Months)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST6TO9MONTHS$34, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST6TO9MONTHS$34);
                    }
                    target.setEnumValue(last6To9Months);
                }
            }
            
            /**
             * Sets (as xml) the "last6To9Months" element
             */
            public void xsetLast6To9Months(org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months last6To9Months)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months)get_store().find_element_user(LAST6TO9MONTHS$34, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.Last6To9MonthsDocument.Last6To9Months)get_store().add_element_user(LAST6TO9MONTHS$34);
                    }
                    target.set(last6To9Months);
                }
            }
            
            /**
             * Gets the "last9To12Months" element
             */
            public org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months.Enum getLast9To12Months()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST9TO12MONTHS$36, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "last9To12Months" element
             */
            public org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months xgetLast9To12Months()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months)get_store().find_element_user(LAST9TO12MONTHS$36, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "last9To12Months" element
             */
            public void setLast9To12Months(org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months.Enum last9To12Months)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST9TO12MONTHS$36, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST9TO12MONTHS$36);
                    }
                    target.setEnumValue(last9To12Months);
                }
            }
            
            /**
             * Sets (as xml) the "last9To12Months" element
             */
            public void xsetLast9To12Months(org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months last9To12Months)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months)get_store().find_element_user(LAST9TO12MONTHS$36, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.Last9To12MonthsDocument.Last9To12Months)get_store().add_element_user(LAST9TO12MONTHS$36);
                    }
                    target.set(last9To12Months);
                }
            }
            
            /**
             * Gets the "last12IndividualMonths" element
             */
            public org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths.Enum getLast12IndividualMonths()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST12INDIVIDUALMONTHS$38, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "last12IndividualMonths" element
             */
            public org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths xgetLast12IndividualMonths()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths)get_store().find_element_user(LAST12INDIVIDUALMONTHS$38, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "last12IndividualMonths" element
             */
            public void setLast12IndividualMonths(org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths.Enum last12IndividualMonths)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAST12INDIVIDUALMONTHS$38, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAST12INDIVIDUALMONTHS$38);
                    }
                    target.setEnumValue(last12IndividualMonths);
                }
            }
            
            /**
             * Sets (as xml) the "last12IndividualMonths" element
             */
            public void xsetLast12IndividualMonths(org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths last12IndividualMonths)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths target = null;
                    target = (org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths)get_store().find_element_user(LAST12INDIVIDUALMONTHS$38, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.Last12IndividualMonthsDocument.Last12IndividualMonths)get_store().add_element_user(LAST12INDIVIDUALMONTHS$38);
                    }
                    target.set(last12IndividualMonths);
                }
            }
            
            /**
             * Gets the "individualMonthsThisYear" element
             */
            public org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear.Enum getIndividualMonthsThisYear()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIVIDUALMONTHSTHISYEAR$40, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "individualMonthsThisYear" element
             */
            public org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear xgetIndividualMonthsThisYear()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear target = null;
                    target = (org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear)get_store().find_element_user(INDIVIDUALMONTHSTHISYEAR$40, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "individualMonthsThisYear" element
             */
            public void setIndividualMonthsThisYear(org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear.Enum individualMonthsThisYear)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIVIDUALMONTHSTHISYEAR$40, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDIVIDUALMONTHSTHISYEAR$40);
                    }
                    target.setEnumValue(individualMonthsThisYear);
                }
            }
            
            /**
             * Sets (as xml) the "individualMonthsThisYear" element
             */
            public void xsetIndividualMonthsThisYear(org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear individualMonthsThisYear)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear target = null;
                    target = (org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear)get_store().find_element_user(INDIVIDUALMONTHSTHISYEAR$40, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.IndividualMonthsThisYearDocument.IndividualMonthsThisYear)get_store().add_element_user(INDIVIDUALMONTHSTHISYEAR$40);
                    }
                    target.set(individualMonthsThisYear);
                }
            }
            
            /**
             * Gets the "individualQuartersThisYear" element
             */
            public org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear.Enum getIndividualQuartersThisYear()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIVIDUALQUARTERSTHISYEAR$42, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "individualQuartersThisYear" element
             */
            public org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear xgetIndividualQuartersThisYear()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear target = null;
                    target = (org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear)get_store().find_element_user(INDIVIDUALQUARTERSTHISYEAR$42, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "individualQuartersThisYear" element
             */
            public void setIndividualQuartersThisYear(org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear.Enum individualQuartersThisYear)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIVIDUALQUARTERSTHISYEAR$42, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDIVIDUALQUARTERSTHISYEAR$42);
                    }
                    target.setEnumValue(individualQuartersThisYear);
                }
            }
            
            /**
             * Sets (as xml) the "individualQuartersThisYear" element
             */
            public void xsetIndividualQuartersThisYear(org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear individualQuartersThisYear)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear target = null;
                    target = (org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear)get_store().find_element_user(INDIVIDUALQUARTERSTHISYEAR$42, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.IndividualQuartersThisYearDocument.IndividualQuartersThisYear)get_store().add_element_user(INDIVIDUALQUARTERSTHISYEAR$42);
                    }
                    target.set(individualQuartersThisYear);
                }
            }
            
            /**
             * Gets the "paramReportingMonth" element
             */
            public org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth.Enum getParamReportingMonth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMREPORTINGMONTH$44, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "paramReportingMonth" element
             */
            public org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth xgetParamReportingMonth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth target = null;
                    target = (org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth)get_store().find_element_user(PARAMREPORTINGMONTH$44, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "paramReportingMonth" element
             */
            public void setParamReportingMonth(org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth.Enum paramReportingMonth)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMREPORTINGMONTH$44, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMREPORTINGMONTH$44);
                    }
                    target.setEnumValue(paramReportingMonth);
                }
            }
            
            /**
             * Sets (as xml) the "paramReportingMonth" element
             */
            public void xsetParamReportingMonth(org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth paramReportingMonth)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth target = null;
                    target = (org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth)get_store().find_element_user(PARAMREPORTINGMONTH$44, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.ParamReportingMonthDocument.ParamReportingMonth)get_store().add_element_user(PARAMREPORTINGMONTH$44);
                    }
                    target.set(paramReportingMonth);
                }
            }
            
            /**
             * Gets the "paramParentOrganisationUnit" element
             */
            public org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit.Enum getParamParentOrganisationUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMPARENTORGANISATIONUNIT$46, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "paramParentOrganisationUnit" element
             */
            public org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit xgetParamParentOrganisationUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit target = null;
                    target = (org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit)get_store().find_element_user(PARAMPARENTORGANISATIONUNIT$46, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "paramParentOrganisationUnit" element
             */
            public void setParamParentOrganisationUnit(org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit.Enum paramParentOrganisationUnit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMPARENTORGANISATIONUNIT$46, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMPARENTORGANISATIONUNIT$46);
                    }
                    target.setEnumValue(paramParentOrganisationUnit);
                }
            }
            
            /**
             * Sets (as xml) the "paramParentOrganisationUnit" element
             */
            public void xsetParamParentOrganisationUnit(org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit paramParentOrganisationUnit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit target = null;
                    target = (org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit)get_store().find_element_user(PARAMPARENTORGANISATIONUNIT$46, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.ParamParentOrganisationUnitDocument.ParamParentOrganisationUnit)get_store().add_element_user(PARAMPARENTORGANISATIONUNIT$46);
                    }
                    target.set(paramParentOrganisationUnit);
                }
            }
            
            /**
             * Gets the "paramOrganisationUnit" element
             */
            public org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit.Enum getParamOrganisationUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMORGANISATIONUNIT$48, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "paramOrganisationUnit" element
             */
            public org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit xgetParamOrganisationUnit()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit target = null;
                    target = (org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit)get_store().find_element_user(PARAMORGANISATIONUNIT$48, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "paramOrganisationUnit" element
             */
            public void setParamOrganisationUnit(org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit.Enum paramOrganisationUnit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMORGANISATIONUNIT$48, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMORGANISATIONUNIT$48);
                    }
                    target.setEnumValue(paramOrganisationUnit);
                }
            }
            
            /**
             * Sets (as xml) the "paramOrganisationUnit" element
             */
            public void xsetParamOrganisationUnit(org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit paramOrganisationUnit)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit target = null;
                    target = (org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit)get_store().find_element_user(PARAMORGANISATIONUNIT$48, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.ParamOrganisationUnitDocument.ParamOrganisationUnit)get_store().add_element_user(PARAMORGANISATIONUNIT$48);
                    }
                    target.set(paramOrganisationUnit);
                }
            }
            
            /**
             * Gets the "dataElements" element
             */
            public org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements getDataElements()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements target = null;
                    target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements)get_store().find_element_user(DATAELEMENTS$50, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "dataElements" element
             */
            public void setDataElements(org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements dataElements)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements target = null;
                    target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements)get_store().find_element_user(DATAELEMENTS$50, 0);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements)get_store().add_element_user(DATAELEMENTS$50);
                    }
                    target.set(dataElements);
                }
            }
            
            /**
             * Appends and returns a new empty "dataElements" element
             */
            public org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements addNewDataElements()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements target = null;
                    target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements)get_store().add_element_user(DATAELEMENTS$50);
                    return target;
                }
            }
            
            /**
             * Gets the "id" attribute
             */
            public int getId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$52);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "id" attribute
             */
            public org.dhis2.ns.schema.dxf2.DxfID xgetId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DxfID target = null;
                    target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_attribute_user(ID$52);
                    return target;
                }
            }
            
            /**
             * Sets the "id" attribute
             */
            public void setId(int id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$52);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$52);
                    }
                    target.setIntValue(id);
                }
            }
            
            /**
             * Sets (as xml) the "id" attribute
             */
            public void xsetId(org.dhis2.ns.schema.dxf2.DxfID id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DxfID target = null;
                    target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_attribute_user(ID$52);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().add_attribute_user(ID$52);
                    }
                    target.set(id);
                }
            }
            /**
             * An XML dataElements(@http://dhis2.org/ns/schema/dxf2).
             *
             * This is a complex type.
             */
            public static class DataElementsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements
            {
                private static final long serialVersionUID = 1L;
                
                public DataElementsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DATAELEMENT$0 = 
                    new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElement");
                
                
                /**
                 * Gets array of all "dataElement" elements
                 */
                public org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement[] getDataElementArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(DATAELEMENT$0, targetList);
                      org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement[] result = new org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "dataElement" element
                 */
                public org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement getDataElementArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement target = null;
                      target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement)get_store().find_element_user(DATAELEMENT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "dataElement" element
                 */
                public int sizeOfDataElementArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DATAELEMENT$0);
                    }
                }
                
                /**
                 * Sets array of all "dataElement" element
                 */
                public void setDataElementArray(org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement[] dataElementArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(dataElementArray, DATAELEMENT$0);
                    }
                }
                
                /**
                 * Sets ith "dataElement" element
                 */
                public void setDataElementArray(int i, org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement dataElement)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement target = null;
                      target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement)get_store().find_element_user(DATAELEMENT$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(dataElement);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "dataElement" element
                 */
                public org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement insertNewDataElement(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement target = null;
                      target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement)get_store().insert_element_user(DATAELEMENT$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "dataElement" element
                 */
                public org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement addNewDataElement()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement target = null;
                      target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement)get_store().add_element_user(DATAELEMENT$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "dataElement" element
                 */
                public void removeDataElement(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DATAELEMENT$0, i);
                    }
                }
                /**
                 * An XML dataElement(@http://dhis2.org/ns/schema/dxf2).
                 *
                 * This is a complex type.
                 */
                public static class DataElementImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables.ReportTable.DataElements.DataElement
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DataElementImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName ID$0 = 
                      new javax.xml.namespace.QName("", "id");
                    
                    
                    /**
                     * Gets the "id" attribute
                     */
                    public int getId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "id" attribute
                     */
                    public org.dhis2.ns.schema.dxf2.DxfID xgetId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.dhis2.ns.schema.dxf2.DxfID target = null;
                        target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_attribute_user(ID$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "id" attribute
                     */
                    public void setId(int id)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
                        }
                        target.setIntValue(id);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "id" attribute
                     */
                    public void xsetId(org.dhis2.ns.schema.dxf2.DxfID id)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.dhis2.ns.schema.dxf2.DxfID target = null;
                        target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_attribute_user(ID$0);
                        if (target == null)
                        {
                          target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().add_attribute_user(ID$0);
                        }
                        target.set(id);
                      }
                    }
                }
            }
        }
    }
}
