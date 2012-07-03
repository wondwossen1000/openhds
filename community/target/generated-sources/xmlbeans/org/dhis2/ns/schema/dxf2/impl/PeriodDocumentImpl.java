/*
 * An XML document type.
 * Localname: period
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.PeriodDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one period(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class PeriodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.PeriodDocument
{
    private static final long serialVersionUID = 1L;
    
    public PeriodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERIOD$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "period");
    
    
    /**
     * Gets the "period" element
     */
    public org.dhis2.ns.schema.dxf2.PeriodDocument.Period getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.PeriodDocument.Period target = null;
            target = (org.dhis2.ns.schema.dxf2.PeriodDocument.Period)get_store().find_element_user(PERIOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(org.dhis2.ns.schema.dxf2.PeriodDocument.Period period)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.PeriodDocument.Period target = null;
            target = (org.dhis2.ns.schema.dxf2.PeriodDocument.Period)get_store().find_element_user(PERIOD$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.PeriodDocument.Period)get_store().add_element_user(PERIOD$0);
            }
            target.set(period);
        }
    }
    
    /**
     * Appends and returns a new empty "period" element
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
     * An XML period(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class PeriodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.PeriodDocument.Period
    {
        private static final long serialVersionUID = 1L;
        
        public PeriodImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "id");
        private static final javax.xml.namespace.QName PERIODTYPE$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "periodType");
        private static final javax.xml.namespace.QName STARTDATE$4 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "startDate");
        private static final javax.xml.namespace.QName ENDDATE$6 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "endDate");
        
        
        /**
         * Gets the "id" element
         */
        public int getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public org.dhis2.ns.schema.dxf2.DxfID xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfID target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_element_user(ID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(int id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                }
                target.setIntValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(org.dhis2.ns.schema.dxf2.DxfID id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfID target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfID)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "periodType" element
         */
        public java.lang.String getPeriodType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "periodType" element
         */
        public org.apache.xmlbeans.XmlString xgetPeriodType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERIODTYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "periodType" element
         */
        public void setPeriodType(java.lang.String periodType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERIODTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERIODTYPE$2);
                }
                target.setStringValue(periodType);
            }
        }
        
        /**
         * Sets (as xml) the "periodType" element
         */
        public void xsetPeriodType(org.apache.xmlbeans.XmlString periodType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERIODTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERIODTYPE$2);
                }
                target.set(periodType);
            }
        }
        
        /**
         * Gets the "startDate" element
         */
        public java.lang.String getStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "startDate" element
         */
        public org.apache.xmlbeans.XmlString xgetStartDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "startDate" element
         */
        public void setStartDate(java.lang.String startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$4);
                }
                target.setStringValue(startDate);
            }
        }
        
        /**
         * Sets (as xml) the "startDate" element
         */
        public void xsetStartDate(org.apache.xmlbeans.XmlString startDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTDATE$4);
                }
                target.set(startDate);
            }
        }
        
        /**
         * Gets the "endDate" element
         */
        public java.lang.String getEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "endDate" element
         */
        public org.apache.xmlbeans.XmlString xgetEndDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "endDate" element
         */
        public void setEndDate(java.lang.String endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$6);
                }
                target.setStringValue(endDate);
            }
        }
        
        /**
         * Sets (as xml) the "endDate" element
         */
        public void xsetEndDate(org.apache.xmlbeans.XmlString endDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDDATE$6);
                }
                target.set(endDate);
            }
        }
    }
}
