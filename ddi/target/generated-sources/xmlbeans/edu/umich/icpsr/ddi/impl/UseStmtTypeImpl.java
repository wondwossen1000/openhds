/*
 * XML Type:  useStmtType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.UseStmtType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML useStmtType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class UseStmtTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.UseStmtType
{
    private static final long serialVersionUID = 1L;
    
    public UseStmtTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFDEC$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "confDec");
    private static final javax.xml.namespace.QName SPECPERM$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "specPerm");
    private static final javax.xml.namespace.QName RESTRCTN$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "restrctn");
    private static final javax.xml.namespace.QName CONTACT$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "contact");
    private static final javax.xml.namespace.QName CITREQ$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "citReq");
    private static final javax.xml.namespace.QName DEPOSREQ$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "deposReq");
    private static final javax.xml.namespace.QName CONDITIONS$12 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "conditions");
    private static final javax.xml.namespace.QName DISCLAIMER$14 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "disclaimer");
    private static final javax.xml.namespace.QName ID$16 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$18 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$20 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$22 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets the "confDec" element
     */
    public edu.umich.icpsr.ddi.ConfDecType getConfDec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConfDecType target = null;
            target = (edu.umich.icpsr.ddi.ConfDecType)get_store().find_element_user(CONFDEC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "confDec" element
     */
    public boolean isSetConfDec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFDEC$0) != 0;
        }
    }
    
    /**
     * Sets the "confDec" element
     */
    public void setConfDec(edu.umich.icpsr.ddi.ConfDecType confDec)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConfDecType target = null;
            target = (edu.umich.icpsr.ddi.ConfDecType)get_store().find_element_user(CONFDEC$0, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.ConfDecType)get_store().add_element_user(CONFDEC$0);
            }
            target.set(confDec);
        }
    }
    
    /**
     * Appends and returns a new empty "confDec" element
     */
    public edu.umich.icpsr.ddi.ConfDecType addNewConfDec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConfDecType target = null;
            target = (edu.umich.icpsr.ddi.ConfDecType)get_store().add_element_user(CONFDEC$0);
            return target;
        }
    }
    
    /**
     * Unsets the "confDec" element
     */
    public void unsetConfDec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFDEC$0, 0);
        }
    }
    
    /**
     * Gets the "specPerm" element
     */
    public edu.umich.icpsr.ddi.SpecPermType getSpecPerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SpecPermType target = null;
            target = (edu.umich.icpsr.ddi.SpecPermType)get_store().find_element_user(SPECPERM$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "specPerm" element
     */
    public boolean isSetSpecPerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECPERM$2) != 0;
        }
    }
    
    /**
     * Sets the "specPerm" element
     */
    public void setSpecPerm(edu.umich.icpsr.ddi.SpecPermType specPerm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SpecPermType target = null;
            target = (edu.umich.icpsr.ddi.SpecPermType)get_store().find_element_user(SPECPERM$2, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SpecPermType)get_store().add_element_user(SPECPERM$2);
            }
            target.set(specPerm);
        }
    }
    
    /**
     * Appends and returns a new empty "specPerm" element
     */
    public edu.umich.icpsr.ddi.SpecPermType addNewSpecPerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SpecPermType target = null;
            target = (edu.umich.icpsr.ddi.SpecPermType)get_store().add_element_user(SPECPERM$2);
            return target;
        }
    }
    
    /**
     * Unsets the "specPerm" element
     */
    public void unsetSpecPerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECPERM$2, 0);
        }
    }
    
    /**
     * Gets the "restrctn" element
     */
    public edu.umich.icpsr.ddi.RestrctnType getRestrctn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RestrctnType target = null;
            target = (edu.umich.icpsr.ddi.RestrctnType)get_store().find_element_user(RESTRCTN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "restrctn" element
     */
    public boolean isSetRestrctn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESTRCTN$4) != 0;
        }
    }
    
    /**
     * Sets the "restrctn" element
     */
    public void setRestrctn(edu.umich.icpsr.ddi.RestrctnType restrctn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RestrctnType target = null;
            target = (edu.umich.icpsr.ddi.RestrctnType)get_store().find_element_user(RESTRCTN$4, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RestrctnType)get_store().add_element_user(RESTRCTN$4);
            }
            target.set(restrctn);
        }
    }
    
    /**
     * Appends and returns a new empty "restrctn" element
     */
    public edu.umich.icpsr.ddi.RestrctnType addNewRestrctn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RestrctnType target = null;
            target = (edu.umich.icpsr.ddi.RestrctnType)get_store().add_element_user(RESTRCTN$4);
            return target;
        }
    }
    
    /**
     * Unsets the "restrctn" element
     */
    public void unsetRestrctn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESTRCTN$4, 0);
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
            get_store().find_all_element_users(CONTACT$6, targetList);
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
            target = (edu.umich.icpsr.ddi.ContactType)get_store().find_element_user(CONTACT$6, i);
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
            return get_store().count_elements(CONTACT$6);
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
            arraySetterHelper(contactArray, CONTACT$6);
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
            target = (edu.umich.icpsr.ddi.ContactType)get_store().find_element_user(CONTACT$6, i);
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
            target = (edu.umich.icpsr.ddi.ContactType)get_store().insert_element_user(CONTACT$6, i);
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
            target = (edu.umich.icpsr.ddi.ContactType)get_store().add_element_user(CONTACT$6);
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
            get_store().remove_element(CONTACT$6, i);
        }
    }
    
    /**
     * Gets the "citReq" element
     */
    public edu.umich.icpsr.ddi.CitReqType getCitReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CitReqType target = null;
            target = (edu.umich.icpsr.ddi.CitReqType)get_store().find_element_user(CITREQ$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "citReq" element
     */
    public boolean isSetCitReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITREQ$8) != 0;
        }
    }
    
    /**
     * Sets the "citReq" element
     */
    public void setCitReq(edu.umich.icpsr.ddi.CitReqType citReq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CitReqType target = null;
            target = (edu.umich.icpsr.ddi.CitReqType)get_store().find_element_user(CITREQ$8, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CitReqType)get_store().add_element_user(CITREQ$8);
            }
            target.set(citReq);
        }
    }
    
    /**
     * Appends and returns a new empty "citReq" element
     */
    public edu.umich.icpsr.ddi.CitReqType addNewCitReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CitReqType target = null;
            target = (edu.umich.icpsr.ddi.CitReqType)get_store().add_element_user(CITREQ$8);
            return target;
        }
    }
    
    /**
     * Unsets the "citReq" element
     */
    public void unsetCitReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITREQ$8, 0);
        }
    }
    
    /**
     * Gets the "deposReq" element
     */
    public edu.umich.icpsr.ddi.DeposReqType getDeposReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DeposReqType target = null;
            target = (edu.umich.icpsr.ddi.DeposReqType)get_store().find_element_user(DEPOSREQ$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "deposReq" element
     */
    public boolean isSetDeposReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPOSREQ$10) != 0;
        }
    }
    
    /**
     * Sets the "deposReq" element
     */
    public void setDeposReq(edu.umich.icpsr.ddi.DeposReqType deposReq)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DeposReqType target = null;
            target = (edu.umich.icpsr.ddi.DeposReqType)get_store().find_element_user(DEPOSREQ$10, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DeposReqType)get_store().add_element_user(DEPOSREQ$10);
            }
            target.set(deposReq);
        }
    }
    
    /**
     * Appends and returns a new empty "deposReq" element
     */
    public edu.umich.icpsr.ddi.DeposReqType addNewDeposReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DeposReqType target = null;
            target = (edu.umich.icpsr.ddi.DeposReqType)get_store().add_element_user(DEPOSREQ$10);
            return target;
        }
    }
    
    /**
     * Unsets the "deposReq" element
     */
    public void unsetDeposReq()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPOSREQ$10, 0);
        }
    }
    
    /**
     * Gets the "conditions" element
     */
    public edu.umich.icpsr.ddi.ConditionsType getConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConditionsType target = null;
            target = (edu.umich.icpsr.ddi.ConditionsType)get_store().find_element_user(CONDITIONS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "conditions" element
     */
    public boolean isSetConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONDITIONS$12) != 0;
        }
    }
    
    /**
     * Sets the "conditions" element
     */
    public void setConditions(edu.umich.icpsr.ddi.ConditionsType conditions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConditionsType target = null;
            target = (edu.umich.icpsr.ddi.ConditionsType)get_store().find_element_user(CONDITIONS$12, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.ConditionsType)get_store().add_element_user(CONDITIONS$12);
            }
            target.set(conditions);
        }
    }
    
    /**
     * Appends and returns a new empty "conditions" element
     */
    public edu.umich.icpsr.ddi.ConditionsType addNewConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConditionsType target = null;
            target = (edu.umich.icpsr.ddi.ConditionsType)get_store().add_element_user(CONDITIONS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "conditions" element
     */
    public void unsetConditions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONDITIONS$12, 0);
        }
    }
    
    /**
     * Gets the "disclaimer" element
     */
    public edu.umich.icpsr.ddi.DisclaimerType getDisclaimer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DisclaimerType target = null;
            target = (edu.umich.icpsr.ddi.DisclaimerType)get_store().find_element_user(DISCLAIMER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "disclaimer" element
     */
    public boolean isSetDisclaimer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISCLAIMER$14) != 0;
        }
    }
    
    /**
     * Sets the "disclaimer" element
     */
    public void setDisclaimer(edu.umich.icpsr.ddi.DisclaimerType disclaimer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DisclaimerType target = null;
            target = (edu.umich.icpsr.ddi.DisclaimerType)get_store().find_element_user(DISCLAIMER$14, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DisclaimerType)get_store().add_element_user(DISCLAIMER$14);
            }
            target.set(disclaimer);
        }
    }
    
    /**
     * Appends and returns a new empty "disclaimer" element
     */
    public edu.umich.icpsr.ddi.DisclaimerType addNewDisclaimer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DisclaimerType target = null;
            target = (edu.umich.icpsr.ddi.DisclaimerType)get_store().add_element_user(DISCLAIMER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "disclaimer" element
     */
    public void unsetDisclaimer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISCLAIMER$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$16);
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
            return get_store().find_attribute_user(ID$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$16);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$16);
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
            get_store().remove_attribute(ID$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$18);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$18);
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
            return get_store().find_attribute_user(XMLLANG$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$18);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$18);
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
            get_store().remove_attribute(XMLLANG$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$20);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$20);
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
            return get_store().find_attribute_user(LANG$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$20);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$20);
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
            get_store().remove_attribute(LANG$20);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.UseStmtType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$22);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.UseStmtType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.UseStmtType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.UseStmtType.Source target = null;
            target = (edu.umich.icpsr.ddi.UseStmtType.Source)get_store().find_attribute_user(SOURCE$22);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.UseStmtType.Source)get_default_attribute_value(SOURCE$22);
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
            return get_store().find_attribute_user(SOURCE$22) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.UseStmtType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$22);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.UseStmtType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.UseStmtType.Source target = null;
            target = (edu.umich.icpsr.ddi.UseStmtType.Source)get_store().find_attribute_user(SOURCE$22);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.UseStmtType.Source)get_store().add_attribute_user(SOURCE$22);
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
            get_store().remove_attribute(SOURCE$22);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.UseStmtType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.UseStmtType.Source
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
