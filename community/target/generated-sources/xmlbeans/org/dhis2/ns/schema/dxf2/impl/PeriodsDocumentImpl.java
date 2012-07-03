/*
 * An XML document type.
 * Localname: periods
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.PeriodsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one periods(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class PeriodsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.PeriodsDocument
{
    private static final long serialVersionUID = 1L;
    
    public PeriodsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERIODS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "periods");
    
    
    /**
     * Gets the "periods" element
     */
    public org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods getPeriods()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods target = null;
            target = (org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods)get_store().find_element_user(PERIODS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods)get_store().find_element_user(PERIODS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods)get_store().add_element_user(PERIODS$0);
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
            target = (org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods)get_store().add_element_user(PERIODS$0);
            return target;
        }
    }
    /**
     * An XML periods(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class PeriodsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.PeriodsDocument.Periods
    {
        private static final long serialVersionUID = 1L;
        
        public PeriodsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PERIOD$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "period");
        
        
        /**
         * Gets array of all "period" elements
         */
        public org.dhis2.ns.schema.dxf2.PeriodDocument.Period[] getPeriodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(PERIOD$0, targetList);
                org.dhis2.ns.schema.dxf2.PeriodDocument.Period[] result = new org.dhis2.ns.schema.dxf2.PeriodDocument.Period[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "period" element
         */
        public org.dhis2.ns.schema.dxf2.PeriodDocument.Period getPeriodArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.PeriodDocument.Period target = null;
                target = (org.dhis2.ns.schema.dxf2.PeriodDocument.Period)get_store().find_element_user(PERIOD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "period" element
         */
        public int sizeOfPeriodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PERIOD$0);
            }
        }
        
        /**
         * Sets array of all "period" element
         */
        public void setPeriodArray(org.dhis2.ns.schema.dxf2.PeriodDocument.Period[] periodArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(periodArray, PERIOD$0);
            }
        }
        
        /**
         * Sets ith "period" element
         */
        public void setPeriodArray(int i, org.dhis2.ns.schema.dxf2.PeriodDocument.Period period)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.PeriodDocument.Period target = null;
                target = (org.dhis2.ns.schema.dxf2.PeriodDocument.Period)get_store().find_element_user(PERIOD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(period);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "period" element
         */
        public org.dhis2.ns.schema.dxf2.PeriodDocument.Period insertNewPeriod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.PeriodDocument.Period target = null;
                target = (org.dhis2.ns.schema.dxf2.PeriodDocument.Period)get_store().insert_element_user(PERIOD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "period" element
         */
        public org.dhis2.ns.schema.dxf2.PeriodDocument.Period addNewPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.PeriodDocument.Period target = null;
                target = (org.dhis2.ns.schema.dxf2.PeriodDocument.Period)get_store().add_element_user(PERIOD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "period" element
         */
        public void removePeriod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PERIOD$0, i);
            }
        }
    }
}
