/*
 * XML Type:  dimensnsType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.DimensnsType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML dimensnsType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class DimensnsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.DimensnsType
{
    private static final long serialVersionUID = 1L;
    
    public DimensnsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CASEQNTY$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "caseQnty");
    private static final javax.xml.namespace.QName VARQNTY$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "varQnty");
    private static final javax.xml.namespace.QName LOGRECL$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "logRecL");
    private static final javax.xml.namespace.QName RECPRCAS$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "recPrCas");
    private static final javax.xml.namespace.QName RECNUMTOT$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "recNumTot");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$12 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$16 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets array of all "caseQnty" elements
     */
    public edu.umich.icpsr.ddi.CaseQntyType[] getCaseQntyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CASEQNTY$0, targetList);
            edu.umich.icpsr.ddi.CaseQntyType[] result = new edu.umich.icpsr.ddi.CaseQntyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "caseQnty" element
     */
    public edu.umich.icpsr.ddi.CaseQntyType getCaseQntyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CaseQntyType target = null;
            target = (edu.umich.icpsr.ddi.CaseQntyType)get_store().find_element_user(CASEQNTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "caseQnty" element
     */
    public int sizeOfCaseQntyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASEQNTY$0);
        }
    }
    
    /**
     * Sets array of all "caseQnty" element
     */
    public void setCaseQntyArray(edu.umich.icpsr.ddi.CaseQntyType[] caseQntyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(caseQntyArray, CASEQNTY$0);
        }
    }
    
    /**
     * Sets ith "caseQnty" element
     */
    public void setCaseQntyArray(int i, edu.umich.icpsr.ddi.CaseQntyType caseQnty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CaseQntyType target = null;
            target = (edu.umich.icpsr.ddi.CaseQntyType)get_store().find_element_user(CASEQNTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(caseQnty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "caseQnty" element
     */
    public edu.umich.icpsr.ddi.CaseQntyType insertNewCaseQnty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CaseQntyType target = null;
            target = (edu.umich.icpsr.ddi.CaseQntyType)get_store().insert_element_user(CASEQNTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "caseQnty" element
     */
    public edu.umich.icpsr.ddi.CaseQntyType addNewCaseQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CaseQntyType target = null;
            target = (edu.umich.icpsr.ddi.CaseQntyType)get_store().add_element_user(CASEQNTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "caseQnty" element
     */
    public void removeCaseQnty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASEQNTY$0, i);
        }
    }
    
    /**
     * Gets array of all "varQnty" elements
     */
    public edu.umich.icpsr.ddi.VarQntyType[] getVarQntyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VARQNTY$2, targetList);
            edu.umich.icpsr.ddi.VarQntyType[] result = new edu.umich.icpsr.ddi.VarQntyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "varQnty" element
     */
    public edu.umich.icpsr.ddi.VarQntyType getVarQntyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarQntyType target = null;
            target = (edu.umich.icpsr.ddi.VarQntyType)get_store().find_element_user(VARQNTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "varQnty" element
     */
    public int sizeOfVarQntyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARQNTY$2);
        }
    }
    
    /**
     * Sets array of all "varQnty" element
     */
    public void setVarQntyArray(edu.umich.icpsr.ddi.VarQntyType[] varQntyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(varQntyArray, VARQNTY$2);
        }
    }
    
    /**
     * Sets ith "varQnty" element
     */
    public void setVarQntyArray(int i, edu.umich.icpsr.ddi.VarQntyType varQnty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarQntyType target = null;
            target = (edu.umich.icpsr.ddi.VarQntyType)get_store().find_element_user(VARQNTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(varQnty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "varQnty" element
     */
    public edu.umich.icpsr.ddi.VarQntyType insertNewVarQnty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarQntyType target = null;
            target = (edu.umich.icpsr.ddi.VarQntyType)get_store().insert_element_user(VARQNTY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "varQnty" element
     */
    public edu.umich.icpsr.ddi.VarQntyType addNewVarQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarQntyType target = null;
            target = (edu.umich.icpsr.ddi.VarQntyType)get_store().add_element_user(VARQNTY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "varQnty" element
     */
    public void removeVarQnty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARQNTY$2, i);
        }
    }
    
    /**
     * Gets array of all "logRecL" elements
     */
    public edu.umich.icpsr.ddi.LogRecLType[] getLogRecLArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOGRECL$4, targetList);
            edu.umich.icpsr.ddi.LogRecLType[] result = new edu.umich.icpsr.ddi.LogRecLType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "logRecL" element
     */
    public edu.umich.icpsr.ddi.LogRecLType getLogRecLArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LogRecLType target = null;
            target = (edu.umich.icpsr.ddi.LogRecLType)get_store().find_element_user(LOGRECL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "logRecL" element
     */
    public int sizeOfLogRecLArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGRECL$4);
        }
    }
    
    /**
     * Sets array of all "logRecL" element
     */
    public void setLogRecLArray(edu.umich.icpsr.ddi.LogRecLType[] logRecLArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(logRecLArray, LOGRECL$4);
        }
    }
    
    /**
     * Sets ith "logRecL" element
     */
    public void setLogRecLArray(int i, edu.umich.icpsr.ddi.LogRecLType logRecL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LogRecLType target = null;
            target = (edu.umich.icpsr.ddi.LogRecLType)get_store().find_element_user(LOGRECL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(logRecL);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "logRecL" element
     */
    public edu.umich.icpsr.ddi.LogRecLType insertNewLogRecL(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LogRecLType target = null;
            target = (edu.umich.icpsr.ddi.LogRecLType)get_store().insert_element_user(LOGRECL$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "logRecL" element
     */
    public edu.umich.icpsr.ddi.LogRecLType addNewLogRecL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LogRecLType target = null;
            target = (edu.umich.icpsr.ddi.LogRecLType)get_store().add_element_user(LOGRECL$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "logRecL" element
     */
    public void removeLogRecL(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGRECL$4, i);
        }
    }
    
    /**
     * Gets array of all "recPrCas" elements
     */
    public edu.umich.icpsr.ddi.RecPrCasType[] getRecPrCasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECPRCAS$6, targetList);
            edu.umich.icpsr.ddi.RecPrCasType[] result = new edu.umich.icpsr.ddi.RecPrCasType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recPrCas" element
     */
    public edu.umich.icpsr.ddi.RecPrCasType getRecPrCasArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecPrCasType target = null;
            target = (edu.umich.icpsr.ddi.RecPrCasType)get_store().find_element_user(RECPRCAS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recPrCas" element
     */
    public int sizeOfRecPrCasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECPRCAS$6);
        }
    }
    
    /**
     * Sets array of all "recPrCas" element
     */
    public void setRecPrCasArray(edu.umich.icpsr.ddi.RecPrCasType[] recPrCasArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(recPrCasArray, RECPRCAS$6);
        }
    }
    
    /**
     * Sets ith "recPrCas" element
     */
    public void setRecPrCasArray(int i, edu.umich.icpsr.ddi.RecPrCasType recPrCas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecPrCasType target = null;
            target = (edu.umich.icpsr.ddi.RecPrCasType)get_store().find_element_user(RECPRCAS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(recPrCas);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recPrCas" element
     */
    public edu.umich.icpsr.ddi.RecPrCasType insertNewRecPrCas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecPrCasType target = null;
            target = (edu.umich.icpsr.ddi.RecPrCasType)get_store().insert_element_user(RECPRCAS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recPrCas" element
     */
    public edu.umich.icpsr.ddi.RecPrCasType addNewRecPrCas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecPrCasType target = null;
            target = (edu.umich.icpsr.ddi.RecPrCasType)get_store().add_element_user(RECPRCAS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "recPrCas" element
     */
    public void removeRecPrCas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECPRCAS$6, i);
        }
    }
    
    /**
     * Gets array of all "recNumTot" elements
     */
    public edu.umich.icpsr.ddi.RecNumTotType[] getRecNumTotArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECNUMTOT$8, targetList);
            edu.umich.icpsr.ddi.RecNumTotType[] result = new edu.umich.icpsr.ddi.RecNumTotType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recNumTot" element
     */
    public edu.umich.icpsr.ddi.RecNumTotType getRecNumTotArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecNumTotType target = null;
            target = (edu.umich.icpsr.ddi.RecNumTotType)get_store().find_element_user(RECNUMTOT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recNumTot" element
     */
    public int sizeOfRecNumTotArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECNUMTOT$8);
        }
    }
    
    /**
     * Sets array of all "recNumTot" element
     */
    public void setRecNumTotArray(edu.umich.icpsr.ddi.RecNumTotType[] recNumTotArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(recNumTotArray, RECNUMTOT$8);
        }
    }
    
    /**
     * Sets ith "recNumTot" element
     */
    public void setRecNumTotArray(int i, edu.umich.icpsr.ddi.RecNumTotType recNumTot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecNumTotType target = null;
            target = (edu.umich.icpsr.ddi.RecNumTotType)get_store().find_element_user(RECNUMTOT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(recNumTot);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recNumTot" element
     */
    public edu.umich.icpsr.ddi.RecNumTotType insertNewRecNumTot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecNumTotType target = null;
            target = (edu.umich.icpsr.ddi.RecNumTotType)get_store().insert_element_user(RECNUMTOT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recNumTot" element
     */
    public edu.umich.icpsr.ddi.RecNumTotType addNewRecNumTot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecNumTotType target = null;
            target = (edu.umich.icpsr.ddi.RecNumTotType)get_store().add_element_user(RECNUMTOT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "recNumTot" element
     */
    public void removeRecNumTot(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECNUMTOT$8, i);
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
    public edu.umich.icpsr.ddi.DimensnsType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.DimensnsType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.DimensnsType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DimensnsType.Source target = null;
            target = (edu.umich.icpsr.ddi.DimensnsType.Source)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DimensnsType.Source)get_default_attribute_value(SOURCE$16);
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
    public void setSource(edu.umich.icpsr.ddi.DimensnsType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.DimensnsType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DimensnsType.Source target = null;
            target = (edu.umich.icpsr.ddi.DimensnsType.Source)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DimensnsType.Source)get_store().add_attribute_user(SOURCE$16);
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
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.DimensnsType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.DimensnsType.Source
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
