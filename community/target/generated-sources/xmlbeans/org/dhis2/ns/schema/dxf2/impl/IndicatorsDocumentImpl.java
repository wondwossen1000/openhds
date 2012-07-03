/*
 * An XML document type.
 * Localname: indicators
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.IndicatorsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one indicators(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class IndicatorsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndicatorsDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndicatorsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDICATORS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicators");
    
    
    /**
     * Gets the "indicators" element
     */
    public org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators getIndicators()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators target = null;
            target = (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators)get_store().find_element_user(INDICATORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators)get_store().find_element_user(INDICATORS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators)get_store().add_element_user(INDICATORS$0);
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
            target = (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators)get_store().add_element_user(INDICATORS$0);
            return target;
        }
    }
    /**
     * An XML indicators(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class IndicatorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators
    {
        private static final long serialVersionUID = 1L;
        
        public IndicatorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDICATOR$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "indicator");
        
        
        /**
         * Gets array of all "indicator" elements
         */
        public org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator[] getIndicatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INDICATOR$0, targetList);
                org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator[] result = new org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indicator" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator getIndicatorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator)get_store().find_element_user(INDICATOR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indicator" element
         */
        public int sizeOfIndicatorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDICATOR$0);
            }
        }
        
        /**
         * Sets array of all "indicator" element
         */
        public void setIndicatorArray(org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator[] indicatorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(indicatorArray, INDICATOR$0);
            }
        }
        
        /**
         * Sets ith "indicator" element
         */
        public void setIndicatorArray(int i, org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator indicator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator)get_store().find_element_user(INDICATOR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(indicator);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indicator" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator insertNewIndicator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator)get_store().insert_element_user(INDICATOR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indicator" element
         */
        public org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator addNewIndicator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator target = null;
                target = (org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator)get_store().add_element_user(INDICATOR$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "indicator" element
         */
        public void removeIndicator(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDICATOR$0, i);
            }
        }
        /**
         * An XML indicator(@http://dhis2.org/ns/schema/dxf2).
         *
         * This is a complex type.
         */
        public static class IndicatorImpl extends org.dhis2.ns.schema.dxf2.impl.IdentifiableObjectImpl implements org.dhis2.ns.schema.dxf2.IndicatorsDocument.Indicators.Indicator
        {
            private static final long serialVersionUID = 1L;
            
            public IndicatorImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ANNUALIZED$0 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "annualized");
            private static final javax.xml.namespace.QName NUMERATOR$2 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "numerator");
            private static final javax.xml.namespace.QName NUMERATORDESCRIPTION$4 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "numeratorDescription");
            private static final javax.xml.namespace.QName NUMERATORAGGREGATIONOPERATOR$6 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "numeratorAggregationOperator");
            private static final javax.xml.namespace.QName DENOMINATOR$8 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "denominator");
            private static final javax.xml.namespace.QName DENOMINATORDESCRIPTION$10 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "denominatorDescription");
            private static final javax.xml.namespace.QName DENOMINATORAGGREGATIONOPERATOR$12 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "denominatorAggregationOperator");
            private static final javax.xml.namespace.QName INDICATORTYPEREF$14 = 
                new javax.xml.namespace.QName("", "indicatorTypeRef");
            
            
            /**
             * Gets the "annualized" element
             */
            public java.lang.String getAnnualized()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANNUALIZED$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "annualized" element
             */
            public org.apache.xmlbeans.XmlString xgetAnnualized()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANNUALIZED$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "annualized" element
             */
            public void setAnnualized(java.lang.String annualized)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANNUALIZED$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANNUALIZED$0);
                    }
                    target.setStringValue(annualized);
                }
            }
            
            /**
             * Sets (as xml) the "annualized" element
             */
            public void xsetAnnualized(org.apache.xmlbeans.XmlString annualized)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANNUALIZED$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANNUALIZED$0);
                    }
                    target.set(annualized);
                }
            }
            
            /**
             * Gets the "numerator" element
             */
            public java.lang.String getNumerator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERATOR$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "numerator" element
             */
            public org.apache.xmlbeans.XmlString xgetNumerator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERATOR$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "numerator" element
             */
            public void setNumerator(java.lang.String numerator)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERATOR$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERATOR$2);
                    }
                    target.setStringValue(numerator);
                }
            }
            
            /**
             * Sets (as xml) the "numerator" element
             */
            public void xsetNumerator(org.apache.xmlbeans.XmlString numerator)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERATOR$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMERATOR$2);
                    }
                    target.set(numerator);
                }
            }
            
            /**
             * Gets the "numeratorDescription" element
             */
            public java.lang.String getNumeratorDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERATORDESCRIPTION$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "numeratorDescription" element
             */
            public org.apache.xmlbeans.XmlString xgetNumeratorDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERATORDESCRIPTION$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "numeratorDescription" element
             */
            public void setNumeratorDescription(java.lang.String numeratorDescription)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERATORDESCRIPTION$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERATORDESCRIPTION$4);
                    }
                    target.setStringValue(numeratorDescription);
                }
            }
            
            /**
             * Sets (as xml) the "numeratorDescription" element
             */
            public void xsetNumeratorDescription(org.apache.xmlbeans.XmlString numeratorDescription)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERATORDESCRIPTION$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMERATORDESCRIPTION$4);
                    }
                    target.set(numeratorDescription);
                }
            }
            
            /**
             * Gets the "numeratorAggregationOperator" element
             */
            public java.lang.String getNumeratorAggregationOperator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERATORAGGREGATIONOPERATOR$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "numeratorAggregationOperator" element
             */
            public org.apache.xmlbeans.XmlString xgetNumeratorAggregationOperator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERATORAGGREGATIONOPERATOR$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "numeratorAggregationOperator" element
             */
            public void setNumeratorAggregationOperator(java.lang.String numeratorAggregationOperator)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERATORAGGREGATIONOPERATOR$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERATORAGGREGATIONOPERATOR$6);
                    }
                    target.setStringValue(numeratorAggregationOperator);
                }
            }
            
            /**
             * Sets (as xml) the "numeratorAggregationOperator" element
             */
            public void xsetNumeratorAggregationOperator(org.apache.xmlbeans.XmlString numeratorAggregationOperator)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMERATORAGGREGATIONOPERATOR$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMERATORAGGREGATIONOPERATOR$6);
                    }
                    target.set(numeratorAggregationOperator);
                }
            }
            
            /**
             * Gets the "denominator" element
             */
            public java.lang.String getDenominator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINATOR$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "denominator" element
             */
            public org.apache.xmlbeans.XmlString xgetDenominator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENOMINATOR$8, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "denominator" element
             */
            public void setDenominator(java.lang.String denominator)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINATOR$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DENOMINATOR$8);
                    }
                    target.setStringValue(denominator);
                }
            }
            
            /**
             * Sets (as xml) the "denominator" element
             */
            public void xsetDenominator(org.apache.xmlbeans.XmlString denominator)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENOMINATOR$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DENOMINATOR$8);
                    }
                    target.set(denominator);
                }
            }
            
            /**
             * Gets the "denominatorDescription" element
             */
            public java.lang.String getDenominatorDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINATORDESCRIPTION$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "denominatorDescription" element
             */
            public org.apache.xmlbeans.XmlString xgetDenominatorDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENOMINATORDESCRIPTION$10, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "denominatorDescription" element
             */
            public void setDenominatorDescription(java.lang.String denominatorDescription)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINATORDESCRIPTION$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DENOMINATORDESCRIPTION$10);
                    }
                    target.setStringValue(denominatorDescription);
                }
            }
            
            /**
             * Sets (as xml) the "denominatorDescription" element
             */
            public void xsetDenominatorDescription(org.apache.xmlbeans.XmlString denominatorDescription)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENOMINATORDESCRIPTION$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DENOMINATORDESCRIPTION$10);
                    }
                    target.set(denominatorDescription);
                }
            }
            
            /**
             * Gets the "denominatorAggregationOperator" element
             */
            public java.lang.String getDenominatorAggregationOperator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINATORAGGREGATIONOPERATOR$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "denominatorAggregationOperator" element
             */
            public org.apache.xmlbeans.XmlString xgetDenominatorAggregationOperator()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENOMINATORAGGREGATIONOPERATOR$12, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "denominatorAggregationOperator" element
             */
            public void setDenominatorAggregationOperator(java.lang.String denominatorAggregationOperator)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINATORAGGREGATIONOPERATOR$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DENOMINATORAGGREGATIONOPERATOR$12);
                    }
                    target.setStringValue(denominatorAggregationOperator);
                }
            }
            
            /**
             * Sets (as xml) the "denominatorAggregationOperator" element
             */
            public void xsetDenominatorAggregationOperator(org.apache.xmlbeans.XmlString denominatorAggregationOperator)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DENOMINATORAGGREGATIONOPERATOR$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DENOMINATORAGGREGATIONOPERATOR$12);
                    }
                    target.set(denominatorAggregationOperator);
                }
            }
            
            /**
             * Gets the "indicatorTypeRef" attribute
             */
            public int getIndicatorTypeRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDICATORTYPEREF$14);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "indicatorTypeRef" attribute
             */
            public org.dhis2.ns.schema.dxf2.DxfIDRef xgetIndicatorTypeRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                    target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(INDICATORTYPEREF$14);
                    return target;
                }
            }
            
            /**
             * Sets the "indicatorTypeRef" attribute
             */
            public void setIndicatorTypeRef(int indicatorTypeRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDICATORTYPEREF$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDICATORTYPEREF$14);
                    }
                    target.setIntValue(indicatorTypeRef);
                }
            }
            
            /**
             * Sets (as xml) the "indicatorTypeRef" attribute
             */
            public void xsetIndicatorTypeRef(org.dhis2.ns.schema.dxf2.DxfIDRef indicatorTypeRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                    target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(INDICATORTYPEREF$14);
                    if (target == null)
                    {
                      target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().add_attribute_user(INDICATORTYPEREF$14);
                    }
                    target.set(indicatorTypeRef);
                }
            }
        }
    }
}
