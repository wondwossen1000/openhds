/*
 * An XML document type.
 * Localname: completeDataSetRegistrationPeriod
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one completeDataSetRegistrationPeriod(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class CompleteDataSetRegistrationPeriodDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompleteDataSetRegistrationPeriodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLETEDATASETREGISTRATIONPERIOD$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "completeDataSetRegistrationPeriod");
    
    
    /**
     * Gets the "completeDataSetRegistrationPeriod" element
     */
    public org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod getCompleteDataSetRegistrationPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod target = null;
            target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod)get_store().find_element_user(COMPLETEDATASETREGISTRATIONPERIOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "completeDataSetRegistrationPeriod" element
     */
    public void setCompleteDataSetRegistrationPeriod(org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod completeDataSetRegistrationPeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod target = null;
            target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod)get_store().find_element_user(COMPLETEDATASETREGISTRATIONPERIOD$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod)get_store().add_element_user(COMPLETEDATASETREGISTRATIONPERIOD$0);
            }
            target.set(completeDataSetRegistrationPeriod);
        }
    }
    
    /**
     * Appends and returns a new empty "completeDataSetRegistrationPeriod" element
     */
    public org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod addNewCompleteDataSetRegistrationPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod target = null;
            target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod)get_store().add_element_user(COMPLETEDATASETREGISTRATIONPERIOD$0);
            return target;
        }
    }
    /**
     * An XML completeDataSetRegistrationPeriod(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class CompleteDataSetRegistrationPeriodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod
    {
        private static final long serialVersionUID = 1L;
        
        public CompleteDataSetRegistrationPeriodImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PERIODREF$0 = 
            new javax.xml.namespace.QName("", "periodRef");
        private static final javax.xml.namespace.QName SORTORDER$2 = 
            new javax.xml.namespace.QName("", "sortOrder");
        
        
        /**
         * Gets the "periodRef" attribute
         */
        public int getPeriodRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIODREF$0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "periodRef" attribute
         */
        public org.dhis2.ns.schema.dxf2.DxfIDRef xgetPeriodRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(PERIODREF$0);
                return target;
            }
        }
        
        /**
         * Sets the "periodRef" attribute
         */
        public void setPeriodRef(int periodRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIODREF$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERIODREF$0);
                }
                target.setIntValue(periodRef);
            }
        }
        
        /**
         * Sets (as xml) the "periodRef" attribute
         */
        public void xsetPeriodRef(org.dhis2.ns.schema.dxf2.DxfIDRef periodRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DxfIDRef target = null;
                target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().find_attribute_user(PERIODREF$0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DxfIDRef)get_store().add_attribute_user(PERIODREF$0);
                }
                target.set(periodRef);
            }
        }
        
        /**
         * Gets the "sortOrder" attribute
         */
        public java.math.BigInteger getSortOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$2);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "sortOrder" attribute
         */
        public org.apache.xmlbeans.XmlInteger xgetSortOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$2);
                return target;
            }
        }
        
        /**
         * Sets the "sortOrder" attribute
         */
        public void setSortOrder(java.math.BigInteger sortOrder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SORTORDER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SORTORDER$2);
                }
                target.setBigIntegerValue(sortOrder);
            }
        }
        
        /**
         * Sets (as xml) the "sortOrder" attribute
         */
        public void xsetSortOrder(org.apache.xmlbeans.XmlInteger sortOrder)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SORTORDER$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SORTORDER$2);
                }
                target.set(sortOrder);
            }
        }
    }
}
