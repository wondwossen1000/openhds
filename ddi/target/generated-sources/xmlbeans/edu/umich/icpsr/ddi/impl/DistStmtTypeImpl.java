/*
 * XML Type:  distStmtType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.DistStmtType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML distStmtType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class DistStmtTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.DistStmtType
{
    private static final long serialVersionUID = 1L;
    
    public DistStmtTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTRBTR$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "distrbtr");
    private static final javax.xml.namespace.QName CONTACT$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "contact");
    private static final javax.xml.namespace.QName DEPOSITR$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "depositr");
    private static final javax.xml.namespace.QName DEPDATE$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "depDate");
    private static final javax.xml.namespace.QName DISTDATE$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "distDate");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$12 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$16 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets array of all "distrbtr" elements
     */
    public edu.umich.icpsr.ddi.DistrbtrType[] getDistrbtrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DISTRBTR$0, targetList);
            edu.umich.icpsr.ddi.DistrbtrType[] result = new edu.umich.icpsr.ddi.DistrbtrType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "distrbtr" element
     */
    public edu.umich.icpsr.ddi.DistrbtrType getDistrbtrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DistrbtrType target = null;
            target = (edu.umich.icpsr.ddi.DistrbtrType)get_store().find_element_user(DISTRBTR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "distrbtr" element
     */
    public int sizeOfDistrbtrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTRBTR$0);
        }
    }
    
    /**
     * Sets array of all "distrbtr" element
     */
    public void setDistrbtrArray(edu.umich.icpsr.ddi.DistrbtrType[] distrbtrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(distrbtrArray, DISTRBTR$0);
        }
    }
    
    /**
     * Sets ith "distrbtr" element
     */
    public void setDistrbtrArray(int i, edu.umich.icpsr.ddi.DistrbtrType distrbtr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DistrbtrType target = null;
            target = (edu.umich.icpsr.ddi.DistrbtrType)get_store().find_element_user(DISTRBTR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(distrbtr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distrbtr" element
     */
    public edu.umich.icpsr.ddi.DistrbtrType insertNewDistrbtr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DistrbtrType target = null;
            target = (edu.umich.icpsr.ddi.DistrbtrType)get_store().insert_element_user(DISTRBTR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distrbtr" element
     */
    public edu.umich.icpsr.ddi.DistrbtrType addNewDistrbtr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DistrbtrType target = null;
            target = (edu.umich.icpsr.ddi.DistrbtrType)get_store().add_element_user(DISTRBTR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "distrbtr" element
     */
    public void removeDistrbtr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTRBTR$0, i);
        }
    }
    
    /**
     * Gets array of all "contact" elements
     */
    public edu.umich.icpsr.ddi.ContactType[] getContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTACT$2, targetList);
            edu.umich.icpsr.ddi.ContactType[] result = new edu.umich.icpsr.ddi.ContactType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contact" element
     */
    public edu.umich.icpsr.ddi.ContactType getContactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ContactType target = null;
            target = (edu.umich.icpsr.ddi.ContactType)get_store().find_element_user(CONTACT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contact" element
     */
    public int sizeOfContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACT$2);
        }
    }
    
    /**
     * Sets array of all "contact" element
     */
    public void setContactArray(edu.umich.icpsr.ddi.ContactType[] contactArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contactArray, CONTACT$2);
        }
    }
    
    /**
     * Sets ith "contact" element
     */
    public void setContactArray(int i, edu.umich.icpsr.ddi.ContactType contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ContactType target = null;
            target = (edu.umich.icpsr.ddi.ContactType)get_store().find_element_user(CONTACT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contact);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contact" element
     */
    public edu.umich.icpsr.ddi.ContactType insertNewContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ContactType target = null;
            target = (edu.umich.icpsr.ddi.ContactType)get_store().insert_element_user(CONTACT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contact" element
     */
    public edu.umich.icpsr.ddi.ContactType addNewContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ContactType target = null;
            target = (edu.umich.icpsr.ddi.ContactType)get_store().add_element_user(CONTACT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "contact" element
     */
    public void removeContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACT$2, i);
        }
    }
    
    /**
     * Gets array of all "depositr" elements
     */
    public edu.umich.icpsr.ddi.DepositrType[] getDepositrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEPOSITR$4, targetList);
            edu.umich.icpsr.ddi.DepositrType[] result = new edu.umich.icpsr.ddi.DepositrType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "depositr" element
     */
    public edu.umich.icpsr.ddi.DepositrType getDepositrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DepositrType target = null;
            target = (edu.umich.icpsr.ddi.DepositrType)get_store().find_element_user(DEPOSITR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "depositr" element
     */
    public int sizeOfDepositrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPOSITR$4);
        }
    }
    
    /**
     * Sets array of all "depositr" element
     */
    public void setDepositrArray(edu.umich.icpsr.ddi.DepositrType[] depositrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(depositrArray, DEPOSITR$4);
        }
    }
    
    /**
     * Sets ith "depositr" element
     */
    public void setDepositrArray(int i, edu.umich.icpsr.ddi.DepositrType depositr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DepositrType target = null;
            target = (edu.umich.icpsr.ddi.DepositrType)get_store().find_element_user(DEPOSITR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(depositr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "depositr" element
     */
    public edu.umich.icpsr.ddi.DepositrType insertNewDepositr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DepositrType target = null;
            target = (edu.umich.icpsr.ddi.DepositrType)get_store().insert_element_user(DEPOSITR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "depositr" element
     */
    public edu.umich.icpsr.ddi.DepositrType addNewDepositr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DepositrType target = null;
            target = (edu.umich.icpsr.ddi.DepositrType)get_store().add_element_user(DEPOSITR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "depositr" element
     */
    public void removeDepositr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPOSITR$4, i);
        }
    }
    
    /**
     * Gets array of all "depDate" elements
     */
    public edu.umich.icpsr.ddi.DepDateType[] getDepDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEPDATE$6, targetList);
            edu.umich.icpsr.ddi.DepDateType[] result = new edu.umich.icpsr.ddi.DepDateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "depDate" element
     */
    public edu.umich.icpsr.ddi.DepDateType getDepDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DepDateType target = null;
            target = (edu.umich.icpsr.ddi.DepDateType)get_store().find_element_user(DEPDATE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "depDate" element
     */
    public int sizeOfDepDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPDATE$6);
        }
    }
    
    /**
     * Sets array of all "depDate" element
     */
    public void setDepDateArray(edu.umich.icpsr.ddi.DepDateType[] depDateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(depDateArray, DEPDATE$6);
        }
    }
    
    /**
     * Sets ith "depDate" element
     */
    public void setDepDateArray(int i, edu.umich.icpsr.ddi.DepDateType depDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DepDateType target = null;
            target = (edu.umich.icpsr.ddi.DepDateType)get_store().find_element_user(DEPDATE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(depDate);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "depDate" element
     */
    public edu.umich.icpsr.ddi.DepDateType insertNewDepDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DepDateType target = null;
            target = (edu.umich.icpsr.ddi.DepDateType)get_store().insert_element_user(DEPDATE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "depDate" element
     */
    public edu.umich.icpsr.ddi.DepDateType addNewDepDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DepDateType target = null;
            target = (edu.umich.icpsr.ddi.DepDateType)get_store().add_element_user(DEPDATE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "depDate" element
     */
    public void removeDepDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPDATE$6, i);
        }
    }
    
    /**
     * Gets the "distDate" element
     */
    public edu.umich.icpsr.ddi.DistDateType getDistDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DistDateType target = null;
            target = (edu.umich.icpsr.ddi.DistDateType)get_store().find_element_user(DISTDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "distDate" element
     */
    public boolean isSetDistDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTDATE$8) != 0;
        }
    }
    
    /**
     * Sets the "distDate" element
     */
    public void setDistDate(edu.umich.icpsr.ddi.DistDateType distDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DistDateType target = null;
            target = (edu.umich.icpsr.ddi.DistDateType)get_store().find_element_user(DISTDATE$8, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DistDateType)get_store().add_element_user(DISTDATE$8);
            }
            target.set(distDate);
        }
    }
    
    /**
     * Appends and returns a new empty "distDate" element
     */
    public edu.umich.icpsr.ddi.DistDateType addNewDistDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DistDateType target = null;
            target = (edu.umich.icpsr.ddi.DistDateType)get_store().add_element_user(DISTDATE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "distDate" element
     */
    public void unsetDistDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTDATE$8, 0);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public org.apache.xmlbeans.XmlID xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * True if has "ID" attribute
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$10) != null;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" attribute
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$10);
        }
    }
    
    /**
     * Gets the "xml-lang" attribute
     */
    public java.lang.String getXmlLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "xml-lang" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetXmlLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$12);
            return target;
        }
    }
    
    /**
     * True if has "xml-lang" attribute
     */
    public boolean isSetXmlLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XMLLANG$12) != null;
        }
    }
    
    /**
     * Sets the "xml-lang" attribute
     */
    public void setXmlLang(java.lang.String xmlLang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$12);
            }
            target.setStringValue(xmlLang);
        }
    }
    
    /**
     * Sets (as xml) the "xml-lang" attribute
     */
    public void xsetXmlLang(org.apache.xmlbeans.XmlNMTOKEN xmlLang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$12);
            }
            target.set(xmlLang);
        }
    }
    
    /**
     * Unsets the "xml-lang" attribute
     */
    public void unsetXmlLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XMLLANG$12);
        }
    }
    
    /**
     * Gets the "lang" attribute
     */
    public java.lang.String getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$14);
            return target;
        }
    }
    
    /**
     * True if has "lang" attribute
     */
    public boolean isSetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANG$14) != null;
        }
    }
    
    /**
     * Sets the "lang" attribute
     */
    public void setLang(java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$14);
            }
            target.setStringValue(lang);
        }
    }
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$14);
            }
            target.set(lang);
        }
    }
    
    /**
     * Unsets the "lang" attribute
     */
    public void unsetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANG$14);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.DistStmtType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$16);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.DistStmtType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.DistStmtType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DistStmtType.Source target = null;
            target = (edu.umich.icpsr.ddi.DistStmtType.Source)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DistStmtType.Source)get_default_attribute_value(SOURCE$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "source" attribute
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOURCE$16) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.DistStmtType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$16);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.DistStmtType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DistStmtType.Source target = null;
            target = (edu.umich.icpsr.ddi.DistStmtType.Source)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DistStmtType.Source)get_store().add_attribute_user(SOURCE$16);
            }
            target.set(source);
        }
    }
    
    /**
     * Unsets the "source" attribute
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOURCE$16);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.DistStmtType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.DistStmtType.Source
    {
        private static final long serialVersionUID = 1L;
        
        public SourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SourceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
