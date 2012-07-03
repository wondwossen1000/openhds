/*
 * An XML document type.
 * Localname: metadata
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.MetadataDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one metadata(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class MetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.MetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATA$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "metadata");
    
    
    /**
     * Gets the "metadata" element
     */
    public org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata getMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata target = null;
            target = (org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata)get_store().find_element_user(METADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "metadata" element
     */
    public void setMetadata(org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata metadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata target = null;
            target = (org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata)get_store().find_element_user(METADATA$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata)get_store().add_element_user(METADATA$0);
            }
            target.set(metadata);
        }
    }
    
    /**
     * Appends and returns a new empty "metadata" element
     */
    public org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata addNewMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata target = null;
            target = (org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata)get_store().add_element_user(METADATA$0);
            return target;
        }
    }
    /**
     * An XML metadata(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class MetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata
    {
        private static final long serialVersionUID = 1L;
        
        public MetadataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CATEGORIES$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categories");
        private static final javax.xml.namespace.QName CATEGORYCOMBOS$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryCombos");
        private static final javax.xml.namespace.QName CATEGORYOPTIONS$4 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryOptions");
        private static final javax.xml.namespace.QName CATEGORYOPTIONCOMBOS$6 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "categoryOptionCombos");
        private static final javax.xml.namespace.QName DATAELEMENTS$8 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElements");
        private static final javax.xml.namespace.QName INDICATORTYPES$10 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicatorTypes");
        private static final javax.xml.namespace.QName INDICATORS$12 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicators");
        private static final javax.xml.namespace.QName DATAELEMENTGROUPSETS$14 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataElementGroupSets");
        private static final javax.xml.namespace.QName INDICATORGROUPSETS$16 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicatorGroupSets");
        private static final javax.xml.namespace.QName DATASETS$18 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataSets");
        private static final javax.xml.namespace.QName DATASETMEMBERS$20 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataSetMembers");
        private static final javax.xml.namespace.QName DATADICTIONARYDEFINITION$22 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "DataDictionaryDefinition");
        private static final org.apache.xmlbeans.QNameSet DATADICTIONARYDEFINITION$23 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "DataDictionaryDefinition"),
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataDictionaries"),
        });
        private static final javax.xml.namespace.QName ORGUNITSTRUCTURE$24 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "orgUnitStructure");
        private static final javax.xml.namespace.QName PERIODS$26 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "periods");
        private static final javax.xml.namespace.QName REPORTTABLES$28 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTables");
        private static final javax.xml.namespace.QName REPORTTABLEDATAELEMENTS$30 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableDataElements");
        private static final javax.xml.namespace.QName REPORTTABLECATEGORYOPTIONCOMBOS$32 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableCategoryOptionCombos");
        private static final javax.xml.namespace.QName REPORTTABLEINDICATORS$34 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableIndicators");
        private static final javax.xml.namespace.QName REPORTTABLEDATASETS$36 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableDataSets");
        private static final javax.xml.namespace.QName REPORTTABLEPERIODS$38 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTablePeriods");
        private static final javax.xml.namespace.QName REPORTTABLEORGANISATIONUNITS$40 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "reportTableOrganisationUnits");
        private static final javax.xml.namespace.QName COMPLETEDATASETREGISTRATIONS$42 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "completeDataSetRegistrations");
        
        
        /**
         * Gets the "categories" element
         */
        public org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories getCategories()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories)get_store().find_element_user(CATEGORIES$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "categories" element
         */
        public boolean isSetCategories()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATEGORIES$0) != 0;
            }
        }
        
        /**
         * Sets the "categories" element
         */
        public void setCategories(org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories categories)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories)get_store().find_element_user(CATEGORIES$0, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories)get_store().add_element_user(CATEGORIES$0);
                }
                target.set(categories);
            }
        }
        
        /**
         * Appends and returns a new empty "categories" element
         */
        public org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories addNewCategories()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoriesDocument.Categories)get_store().add_element_user(CATEGORIES$0);
                return target;
            }
        }
        
        /**
         * Unsets the "categories" element
         */
        public void unsetCategories()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATEGORIES$0, 0);
            }
        }
        
        /**
         * Gets the "categoryCombos" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos getCategoryCombos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos)get_store().find_element_user(CATEGORYCOMBOS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "categoryCombos" element
         */
        public boolean isSetCategoryCombos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATEGORYCOMBOS$2) != 0;
            }
        }
        
        /**
         * Sets the "categoryCombos" element
         */
        public void setCategoryCombos(org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos categoryCombos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos)get_store().find_element_user(CATEGORYCOMBOS$2, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos)get_store().add_element_user(CATEGORYCOMBOS$2);
                }
                target.set(categoryCombos);
            }
        }
        
        /**
         * Appends and returns a new empty "categoryCombos" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos addNewCategoryCombos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryCombosDocument.CategoryCombos)get_store().add_element_user(CATEGORYCOMBOS$2);
                return target;
            }
        }
        
        /**
         * Unsets the "categoryCombos" element
         */
        public void unsetCategoryCombos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATEGORYCOMBOS$2, 0);
            }
        }
        
        /**
         * Gets the "categoryOptions" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions getCategoryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions)get_store().find_element_user(CATEGORYOPTIONS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "categoryOptions" element
         */
        public boolean isSetCategoryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATEGORYOPTIONS$4) != 0;
            }
        }
        
        /**
         * Sets the "categoryOptions" element
         */
        public void setCategoryOptions(org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions categoryOptions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions)get_store().find_element_user(CATEGORYOPTIONS$4, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions)get_store().add_element_user(CATEGORYOPTIONS$4);
                }
                target.set(categoryOptions);
            }
        }
        
        /**
         * Appends and returns a new empty "categoryOptions" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions addNewCategoryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionsDocument.CategoryOptions)get_store().add_element_user(CATEGORYOPTIONS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "categoryOptions" element
         */
        public void unsetCategoryOptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATEGORYOPTIONS$4, 0);
            }
        }
        
        /**
         * Gets the "categoryOptionCombos" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos getCategoryOptionCombos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos)get_store().find_element_user(CATEGORYOPTIONCOMBOS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "categoryOptionCombos" element
         */
        public boolean isSetCategoryOptionCombos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CATEGORYOPTIONCOMBOS$6) != 0;
            }
        }
        
        /**
         * Sets the "categoryOptionCombos" element
         */
        public void setCategoryOptionCombos(org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos categoryOptionCombos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos)get_store().find_element_user(CATEGORYOPTIONCOMBOS$6, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos)get_store().add_element_user(CATEGORYOPTIONCOMBOS$6);
                }
                target.set(categoryOptionCombos);
            }
        }
        
        /**
         * Appends and returns a new empty "categoryOptionCombos" element
         */
        public org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos addNewCategoryOptionCombos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos target = null;
                target = (org.dhis2.ns.schema.dxf2.CategoryOptionCombosDocument.CategoryOptionCombos)get_store().add_element_user(CATEGORYOPTIONCOMBOS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "categoryOptionCombos" element
         */
        public void unsetCategoryOptionCombos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CATEGORYOPTIONCOMBOS$6, 0);
            }
        }
        
        /**
         * Gets the "dataElements" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements getDataElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements)get_store().find_element_user(DATAELEMENTS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dataElements" element
         */
        public boolean isSetDataElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATAELEMENTS$8) != 0;
            }
        }
        
        /**
         * Sets the "dataElements" element
         */
        public void setDataElements(org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements dataElements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements)get_store().find_element_user(DATAELEMENTS$8, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements)get_store().add_element_user(DATAELEMENTS$8);
                }
                target.set(dataElements);
            }
        }
        
        /**
         * Appends and returns a new empty "dataElements" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements addNewDataElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementsDocument.DataElements)get_store().add_element_user(DATAELEMENTS$8);
                return target;
            }
        }
        
        /**
         * Unsets the "dataElements" element
         */
        public void unsetDataElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATAELEMENTS$8, 0);
            }
        }
        
        /**
         * Gets the "indicatorTypes" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes getIndicatorTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes)get_store().find_element_user(INDICATORTYPES$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "indicatorTypes" element
         */
        public boolean isSetIndicatorTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDICATORTYPES$10) != 0;
            }
        }
        
        /**
         * Sets the "indicatorTypes" element
         */
        public void setIndicatorTypes(org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes indicatorTypes)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes)get_store().find_element_user(INDICATORTYPES$10, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes)get_store().add_element_user(INDICATORTYPES$10);
                }
                target.set(indicatorTypes);
            }
        }
        
        /**
         * Appends and returns a new empty "indicatorTypes" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes addNewIndicatorTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorTypesDocument.IndicatorTypes)get_store().add_element_user(INDICATORTYPES$10);
                return target;
            }
        }
        
        /**
         * Unsets the "indicatorTypes" element
         */
        public void unsetIndicatorTypes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDICATORTYPES$10, 0);
            }
        }
        
        /**
         * Gets the "indicators" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators getIndicators()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators)get_store().find_element_user(INDICATORS$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "indicators" element
         */
        public boolean isSetIndicators()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDICATORS$12) != 0;
            }
        }
        
        /**
         * Sets the "indicators" element
         */
        public void setIndicators(org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators indicators)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators)get_store().find_element_user(INDICATORS$12, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators)get_store().add_element_user(INDICATORS$12);
                }
                target.set(indicators);
            }
        }
        
        /**
         * Appends and returns a new empty "indicators" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators addNewIndicators()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators)get_store().add_element_user(INDICATORS$12);
                return target;
            }
        }
        
        /**
         * Unsets the "indicators" element
         */
        public void unsetIndicators()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDICATORS$12, 0);
            }
        }
        
        /**
         * Gets the "dataElementGroupSets" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets getDataElementGroupSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets)get_store().find_element_user(DATAELEMENTGROUPSETS$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dataElementGroupSets" element
         */
        public boolean isSetDataElementGroupSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATAELEMENTGROUPSETS$14) != 0;
            }
        }
        
        /**
         * Sets the "dataElementGroupSets" element
         */
        public void setDataElementGroupSets(org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets dataElementGroupSets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets)get_store().find_element_user(DATAELEMENTGROUPSETS$14, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets)get_store().add_element_user(DATAELEMENTGROUPSETS$14);
                }
                target.set(dataElementGroupSets);
            }
        }
        
        /**
         * Appends and returns a new empty "dataElementGroupSets" element
         */
        public org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets addNewDataElementGroupSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets target = null;
                target = (org.dhis2.ns.schema.dxf2.DataElementGroupSetsDocument.DataElementGroupSets)get_store().add_element_user(DATAELEMENTGROUPSETS$14);
                return target;
            }
        }
        
        /**
         * Unsets the "dataElementGroupSets" element
         */
        public void unsetDataElementGroupSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATAELEMENTGROUPSETS$14, 0);
            }
        }
        
        /**
         * Gets the "indicatorGroupSets" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets getIndicatorGroupSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets)get_store().find_element_user(INDICATORGROUPSETS$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "indicatorGroupSets" element
         */
        public boolean isSetIndicatorGroupSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDICATORGROUPSETS$16) != 0;
            }
        }
        
        /**
         * Sets the "indicatorGroupSets" element
         */
        public void setIndicatorGroupSets(org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets indicatorGroupSets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets)get_store().find_element_user(INDICATORGROUPSETS$16, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets)get_store().add_element_user(INDICATORGROUPSETS$16);
                }
                target.set(indicatorGroupSets);
            }
        }
        
        /**
         * Appends and returns a new empty "indicatorGroupSets" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets addNewIndicatorGroupSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorGroupSetsDocument.IndicatorGroupSets)get_store().add_element_user(INDICATORGROUPSETS$16);
                return target;
            }
        }
        
        /**
         * Unsets the "indicatorGroupSets" element
         */
        public void unsetIndicatorGroupSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDICATORGROUPSETS$16, 0);
            }
        }
        
        /**
         * Gets the "dataSets" element
         */
        public org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets getDataSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets target = null;
                target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets)get_store().find_element_user(DATASETS$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dataSets" element
         */
        public boolean isSetDataSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATASETS$18) != 0;
            }
        }
        
        /**
         * Sets the "dataSets" element
         */
        public void setDataSets(org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets dataSets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets target = null;
                target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets)get_store().find_element_user(DATASETS$18, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets)get_store().add_element_user(DATASETS$18);
                }
                target.set(dataSets);
            }
        }
        
        /**
         * Appends and returns a new empty "dataSets" element
         */
        public org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets addNewDataSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets target = null;
                target = (org.dhis2.ns.schema.dxf2.DataSetsDocument.DataSets)get_store().add_element_user(DATASETS$18);
                return target;
            }
        }
        
        /**
         * Unsets the "dataSets" element
         */
        public void unsetDataSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATASETS$18, 0);
            }
        }
        
        /**
         * Gets the "dataSetMembers" element
         */
        public org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers getDataSetMembers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers target = null;
                target = (org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers)get_store().find_element_user(DATASETMEMBERS$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dataSetMembers" element
         */
        public boolean isSetDataSetMembers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATASETMEMBERS$20) != 0;
            }
        }
        
        /**
         * Sets the "dataSetMembers" element
         */
        public void setDataSetMembers(org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers dataSetMembers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers target = null;
                target = (org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers)get_store().find_element_user(DATASETMEMBERS$20, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers)get_store().add_element_user(DATASETMEMBERS$20);
                }
                target.set(dataSetMembers);
            }
        }
        
        /**
         * Appends and returns a new empty "dataSetMembers" element
         */
        public org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers addNewDataSetMembers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers target = null;
                target = (org.dhis2.ns.schema.dxf2.DataSetMembersDocument.DataSetMembers)get_store().add_element_user(DATASETMEMBERS$20);
                return target;
            }
        }
        
        /**
         * Unsets the "dataSetMembers" element
         */
        public void unsetDataSetMembers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATASETMEMBERS$20, 0);
            }
        }
        
        /**
         * Gets the "DataDictionaryDefinition" element
         */
        public org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition getDataDictionaryDefinition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition target = null;
                target = (org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition)get_store().find_element_user(DATADICTIONARYDEFINITION$23, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "DataDictionaryDefinition" element
         */
        public boolean isSetDataDictionaryDefinition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATADICTIONARYDEFINITION$23) != 0;
            }
        }
        
        /**
         * Sets the "DataDictionaryDefinition" element
         */
        public void setDataDictionaryDefinition(org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition dataDictionaryDefinition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition target = null;
                target = (org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition)get_store().find_element_user(DATADICTIONARYDEFINITION$23, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition)get_store().add_element_user(DATADICTIONARYDEFINITION$22);
                }
                target.set(dataDictionaryDefinition);
            }
        }
        
        /**
         * Appends and returns a new empty "DataDictionaryDefinition" element
         */
        public org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition addNewDataDictionaryDefinition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition target = null;
                target = (org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition)get_store().add_element_user(DATADICTIONARYDEFINITION$22);
                return target;
            }
        }
        
        /**
         * Unsets the "DataDictionaryDefinition" element
         */
        public void unsetDataDictionaryDefinition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATADICTIONARYDEFINITION$23, 0);
            }
        }
        
        /**
         * Gets the "orgUnitStructure" element
         */
        public org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure getOrgUnitStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure target = null;
                target = (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure)get_store().find_element_user(ORGUNITSTRUCTURE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "orgUnitStructure" element
         */
        public boolean isSetOrgUnitStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGUNITSTRUCTURE$24) != 0;
            }
        }
        
        /**
         * Sets the "orgUnitStructure" element
         */
        public void setOrgUnitStructure(org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure orgUnitStructure)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure target = null;
                target = (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure)get_store().find_element_user(ORGUNITSTRUCTURE$24, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure)get_store().add_element_user(ORGUNITSTRUCTURE$24);
                }
                target.set(orgUnitStructure);
            }
        }
        
        /**
         * Appends and returns a new empty "orgUnitStructure" element
         */
        public org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure addNewOrgUnitStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure target = null;
                target = (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure)get_store().add_element_user(ORGUNITSTRUCTURE$24);
                return target;
            }
        }
        
        /**
         * Unsets the "orgUnitStructure" element
         */
        public void unsetOrgUnitStructure()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGUNITSTRUCTURE$24, 0);
            }
        }
        
        /**
         * Gets the "periods" element
         */
        public org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods getPeriods()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods target = null;
                target = (org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods)get_store().find_element_user(PERIODS$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "periods" element
         */
        public boolean isSetPeriods()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERIODS$26) != 0;
            }
        }
        
        /**
         * Sets the "periods" element
         */
        public void setPeriods(org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods periods)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods target = null;
                target = (org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods)get_store().find_element_user(PERIODS$26, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods)get_store().add_element_user(PERIODS$26);
                }
                target.set(periods);
            }
        }
        
        /**
         * Appends and returns a new empty "periods" element
         */
        public org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods addNewPeriods()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods target = null;
                target = (org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods)get_store().add_element_user(PERIODS$26);
                return target;
            }
        }
        
        /**
         * Unsets the "periods" element
         */
        public void unsetPeriods()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERIODS$26, 0);
            }
        }
        
        /**
         * Gets the "reportTables" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables getReportTables()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables)get_store().find_element_user(REPORTTABLES$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "reportTables" element
         */
        public boolean isSetReportTables()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORTTABLES$28) != 0;
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
                target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables)get_store().find_element_user(REPORTTABLES$28, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables)get_store().add_element_user(REPORTTABLES$28);
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
                target = (org.dhis2.ns.schema.dxf2.ReportTablesDocument.ReportTables)get_store().add_element_user(REPORTTABLES$28);
                return target;
            }
        }
        
        /**
         * Unsets the "reportTables" element
         */
        public void unsetReportTables()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORTTABLES$28, 0);
            }
        }
        
        /**
         * Gets the "reportTableDataElements" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements getReportTableDataElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements)get_store().find_element_user(REPORTTABLEDATAELEMENTS$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "reportTableDataElements" element
         */
        public boolean isSetReportTableDataElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORTTABLEDATAELEMENTS$30) != 0;
            }
        }
        
        /**
         * Sets the "reportTableDataElements" element
         */
        public void setReportTableDataElements(org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements reportTableDataElements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements)get_store().find_element_user(REPORTTABLEDATAELEMENTS$30, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements)get_store().add_element_user(REPORTTABLEDATAELEMENTS$30);
                }
                target.set(reportTableDataElements);
            }
        }
        
        /**
         * Appends and returns a new empty "reportTableDataElements" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements addNewReportTableDataElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableDataElementsDocument.ReportTableDataElements)get_store().add_element_user(REPORTTABLEDATAELEMENTS$30);
                return target;
            }
        }
        
        /**
         * Unsets the "reportTableDataElements" element
         */
        public void unsetReportTableDataElements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORTTABLEDATAELEMENTS$30, 0);
            }
        }
        
        /**
         * Gets the "reportTableCategoryOptionCombos" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos getReportTableCategoryOptionCombos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos)get_store().find_element_user(REPORTTABLECATEGORYOPTIONCOMBOS$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "reportTableCategoryOptionCombos" element
         */
        public boolean isSetReportTableCategoryOptionCombos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORTTABLECATEGORYOPTIONCOMBOS$32) != 0;
            }
        }
        
        /**
         * Sets the "reportTableCategoryOptionCombos" element
         */
        public void setReportTableCategoryOptionCombos(org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos reportTableCategoryOptionCombos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos)get_store().find_element_user(REPORTTABLECATEGORYOPTIONCOMBOS$32, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos)get_store().add_element_user(REPORTTABLECATEGORYOPTIONCOMBOS$32);
                }
                target.set(reportTableCategoryOptionCombos);
            }
        }
        
        /**
         * Appends and returns a new empty "reportTableCategoryOptionCombos" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos addNewReportTableCategoryOptionCombos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableCategoryOptionCombosDocument.ReportTableCategoryOptionCombos)get_store().add_element_user(REPORTTABLECATEGORYOPTIONCOMBOS$32);
                return target;
            }
        }
        
        /**
         * Unsets the "reportTableCategoryOptionCombos" element
         */
        public void unsetReportTableCategoryOptionCombos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORTTABLECATEGORYOPTIONCOMBOS$32, 0);
            }
        }
        
        /**
         * Gets the "reportTableIndicators" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators getReportTableIndicators()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators)get_store().find_element_user(REPORTTABLEINDICATORS$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "reportTableIndicators" element
         */
        public boolean isSetReportTableIndicators()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORTTABLEINDICATORS$34) != 0;
            }
        }
        
        /**
         * Sets the "reportTableIndicators" element
         */
        public void setReportTableIndicators(org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators reportTableIndicators)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators)get_store().find_element_user(REPORTTABLEINDICATORS$34, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators)get_store().add_element_user(REPORTTABLEINDICATORS$34);
                }
                target.set(reportTableIndicators);
            }
        }
        
        /**
         * Appends and returns a new empty "reportTableIndicators" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators addNewReportTableIndicators()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableIndicatorsDocument.ReportTableIndicators)get_store().add_element_user(REPORTTABLEINDICATORS$34);
                return target;
            }
        }
        
        /**
         * Unsets the "reportTableIndicators" element
         */
        public void unsetReportTableIndicators()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORTTABLEINDICATORS$34, 0);
            }
        }
        
        /**
         * Gets the "reportTableDataSets" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets getReportTableDataSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets)get_store().find_element_user(REPORTTABLEDATASETS$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "reportTableDataSets" element
         */
        public boolean isSetReportTableDataSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORTTABLEDATASETS$36) != 0;
            }
        }
        
        /**
         * Sets the "reportTableDataSets" element
         */
        public void setReportTableDataSets(org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets reportTableDataSets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets)get_store().find_element_user(REPORTTABLEDATASETS$36, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets)get_store().add_element_user(REPORTTABLEDATASETS$36);
                }
                target.set(reportTableDataSets);
            }
        }
        
        /**
         * Appends and returns a new empty "reportTableDataSets" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets addNewReportTableDataSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableDataSetsDocument.ReportTableDataSets)get_store().add_element_user(REPORTTABLEDATASETS$36);
                return target;
            }
        }
        
        /**
         * Unsets the "reportTableDataSets" element
         */
        public void unsetReportTableDataSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORTTABLEDATASETS$36, 0);
            }
        }
        
        /**
         * Gets the "reportTablePeriods" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods getReportTablePeriods()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods)get_store().find_element_user(REPORTTABLEPERIODS$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "reportTablePeriods" element
         */
        public boolean isSetReportTablePeriods()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORTTABLEPERIODS$38) != 0;
            }
        }
        
        /**
         * Sets the "reportTablePeriods" element
         */
        public void setReportTablePeriods(org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods reportTablePeriods)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods)get_store().find_element_user(REPORTTABLEPERIODS$38, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods)get_store().add_element_user(REPORTTABLEPERIODS$38);
                }
                target.set(reportTablePeriods);
            }
        }
        
        /**
         * Appends and returns a new empty "reportTablePeriods" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods addNewReportTablePeriods()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTablePeriodsDocument.ReportTablePeriods)get_store().add_element_user(REPORTTABLEPERIODS$38);
                return target;
            }
        }
        
        /**
         * Unsets the "reportTablePeriods" element
         */
        public void unsetReportTablePeriods()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORTTABLEPERIODS$38, 0);
            }
        }
        
        /**
         * Gets the "reportTableOrganisationUnits" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits getReportTableOrganisationUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits)get_store().find_element_user(REPORTTABLEORGANISATIONUNITS$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "reportTableOrganisationUnits" element
         */
        public boolean isSetReportTableOrganisationUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPORTTABLEORGANISATIONUNITS$40) != 0;
            }
        }
        
        /**
         * Sets the "reportTableOrganisationUnits" element
         */
        public void setReportTableOrganisationUnits(org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits reportTableOrganisationUnits)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits)get_store().find_element_user(REPORTTABLEORGANISATIONUNITS$40, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits)get_store().add_element_user(REPORTTABLEORGANISATIONUNITS$40);
                }
                target.set(reportTableOrganisationUnits);
            }
        }
        
        /**
         * Appends and returns a new empty "reportTableOrganisationUnits" element
         */
        public org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits addNewReportTableOrganisationUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits target = null;
                target = (org.dhis2.ns.schema.dxf2.ReportTableOrganisationUnitsDocument.ReportTableOrganisationUnits)get_store().add_element_user(REPORTTABLEORGANISATIONUNITS$40);
                return target;
            }
        }
        
        /**
         * Unsets the "reportTableOrganisationUnits" element
         */
        public void unsetReportTableOrganisationUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPORTTABLEORGANISATIONUNITS$40, 0);
            }
        }
        
        /**
         * Gets the "completeDataSetRegistrations" element
         */
        public org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations getCompleteDataSetRegistrations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations target = null;
                target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations)get_store().find_element_user(COMPLETEDATASETREGISTRATIONS$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "completeDataSetRegistrations" element
         */
        public boolean isSetCompleteDataSetRegistrations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPLETEDATASETREGISTRATIONS$42) != 0;
            }
        }
        
        /**
         * Sets the "completeDataSetRegistrations" element
         */
        public void setCompleteDataSetRegistrations(org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations completeDataSetRegistrations)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations target = null;
                target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations)get_store().find_element_user(COMPLETEDATASETREGISTRATIONS$42, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations)get_store().add_element_user(COMPLETEDATASETREGISTRATIONS$42);
                }
                target.set(completeDataSetRegistrations);
            }
        }
        
        /**
         * Appends and returns a new empty "completeDataSetRegistrations" element
         */
        public org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations addNewCompleteDataSetRegistrations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations target = null;
                target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations)get_store().add_element_user(COMPLETEDATASETREGISTRATIONS$42);
                return target;
            }
        }
        
        /**
         * Unsets the "completeDataSetRegistrations" element
         */
        public void unsetCompleteDataSetRegistrations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPLETEDATASETREGISTRATIONS$42, 0);
            }
        }
    }
}
