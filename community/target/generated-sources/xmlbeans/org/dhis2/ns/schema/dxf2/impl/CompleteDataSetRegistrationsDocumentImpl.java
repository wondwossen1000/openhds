/*
 * An XML document type.
 * Localname: completeDataSetRegistrations
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one completeDataSetRegistrations(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class CompleteDataSetRegistrationsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompleteDataSetRegistrationsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLETEDATASETREGISTRATIONS$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "completeDataSetRegistrations");
    
    
    /**
     * Gets the "completeDataSetRegistrations" element
     */
    public org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations getCompleteDataSetRegistrations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations target = null;
            target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations)get_store().find_element_user(COMPLETEDATASETREGISTRATIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
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
            target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations)get_store().find_element_user(COMPLETEDATASETREGISTRATIONS$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations)get_store().add_element_user(COMPLETEDATASETREGISTRATIONS$0);
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
            target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations)get_store().add_element_user(COMPLETEDATASETREGISTRATIONS$0);
            return target;
        }
    }
    /**
     * An XML completeDataSetRegistrations(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class CompleteDataSetRegistrationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationsDocument.CompleteDataSetRegistrations
    {
        private static final long serialVersionUID = 1L;
        
        public CompleteDataSetRegistrationsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COMPLETEDATASETREGISTRATIONPERIOD$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "completeDataSetRegistrationPeriod");
        
        
        /**
         * Gets array of all "completeDataSetRegistrationPeriod" elements
         */
        public org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod[] getCompleteDataSetRegistrationPeriodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMPLETEDATASETREGISTRATIONPERIOD$0, targetList);
                org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod[] result = new org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "completeDataSetRegistrationPeriod" element
         */
        public org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod getCompleteDataSetRegistrationPeriodArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod target = null;
                target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod)get_store().find_element_user(COMPLETEDATASETREGISTRATIONPERIOD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "completeDataSetRegistrationPeriod" element
         */
        public int sizeOfCompleteDataSetRegistrationPeriodArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMPLETEDATASETREGISTRATIONPERIOD$0);
            }
        }
        
        /**
         * Sets array of all "completeDataSetRegistrationPeriod" element
         */
        public void setCompleteDataSetRegistrationPeriodArray(org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod[] completeDataSetRegistrationPeriodArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(completeDataSetRegistrationPeriodArray, COMPLETEDATASETREGISTRATIONPERIOD$0);
            }
        }
        
        /**
         * Sets ith "completeDataSetRegistrationPeriod" element
         */
        public void setCompleteDataSetRegistrationPeriodArray(int i, org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod completeDataSetRegistrationPeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod target = null;
                target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod)get_store().find_element_user(COMPLETEDATASETREGISTRATIONPERIOD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(completeDataSetRegistrationPeriod);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "completeDataSetRegistrationPeriod" element
         */
        public org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod insertNewCompleteDataSetRegistrationPeriod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod target = null;
                target = (org.dhis2.ns.schema.dxf2.CompleteDataSetRegistrationPeriodDocument.CompleteDataSetRegistrationPeriod)get_store().insert_element_user(COMPLETEDATASETREGISTRATIONPERIOD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "completeDataSetRegistrationPeriod" element
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
         * Removes the ith "completeDataSetRegistrationPeriod" element
         */
        public void removeCompleteDataSetRegistrationPeriod(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMPLETEDATASETREGISTRATIONPERIOD$0, i);
            }
        }
    }
}
