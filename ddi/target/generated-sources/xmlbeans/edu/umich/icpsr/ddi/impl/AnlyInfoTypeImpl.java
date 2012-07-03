/*
 * XML Type:  anlyInfoType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.AnlyInfoType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML anlyInfoType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class AnlyInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.AnlyInfoType
{
    private static final long serialVersionUID = 1L;
    
    public AnlyInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPRATE$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "respRate");
    private static final javax.xml.namespace.QName ESTSMPERR$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "EstSmpErr");
    private static final javax.xml.namespace.QName DATAAPPR$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "dataAppr");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$8 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$12 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets array of all "respRate" elements
     */
    public edu.umich.icpsr.ddi.RespRateType[] getRespRateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESPRATE$0, targetList);
            edu.umich.icpsr.ddi.RespRateType[] result = new edu.umich.icpsr.ddi.RespRateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "respRate" element
     */
    public edu.umich.icpsr.ddi.RespRateType getRespRateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RespRateType target = null;
            target = (edu.umich.icpsr.ddi.RespRateType)get_store().find_element_user(RESPRATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "respRate" element
     */
    public int sizeOfRespRateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPRATE$0);
        }
    }
    
    /**
     * Sets array of all "respRate" element
     */
    public void setRespRateArray(edu.umich.icpsr.ddi.RespRateType[] respRateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(respRateArray, RESPRATE$0);
        }
    }
    
    /**
     * Sets ith "respRate" element
     */
    public void setRespRateArray(int i, edu.umich.icpsr.ddi.RespRateType respRate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RespRateType target = null;
            target = (edu.umich.icpsr.ddi.RespRateType)get_store().find_element_user(RESPRATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(respRate);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "respRate" element
     */
    public edu.umich.icpsr.ddi.RespRateType insertNewRespRate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RespRateType target = null;
            target = (edu.umich.icpsr.ddi.RespRateType)get_store().insert_element_user(RESPRATE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "respRate" element
     */
    public edu.umich.icpsr.ddi.RespRateType addNewRespRate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RespRateType target = null;
            target = (edu.umich.icpsr.ddi.RespRateType)get_store().add_element_user(RESPRATE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "respRate" element
     */
    public void removeRespRate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPRATE$0, i);
        }
    }
    
    /**
     * Gets array of all "EstSmpErr" elements
     */
    public edu.umich.icpsr.ddi.EstSmpErrType[] getEstSmpErrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ESTSMPERR$2, targetList);
            edu.umich.icpsr.ddi.EstSmpErrType[] result = new edu.umich.icpsr.ddi.EstSmpErrType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "EstSmpErr" element
     */
    public edu.umich.icpsr.ddi.EstSmpErrType getEstSmpErrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EstSmpErrType target = null;
            target = (edu.umich.icpsr.ddi.EstSmpErrType)get_store().find_element_user(ESTSMPERR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "EstSmpErr" element
     */
    public int sizeOfEstSmpErrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESTSMPERR$2);
        }
    }
    
    /**
     * Sets array of all "EstSmpErr" element
     */
    public void setEstSmpErrArray(edu.umich.icpsr.ddi.EstSmpErrType[] estSmpErrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(estSmpErrArray, ESTSMPERR$2);
        }
    }
    
    /**
     * Sets ith "EstSmpErr" element
     */
    public void setEstSmpErrArray(int i, edu.umich.icpsr.ddi.EstSmpErrType estSmpErr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EstSmpErrType target = null;
            target = (edu.umich.icpsr.ddi.EstSmpErrType)get_store().find_element_user(ESTSMPERR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(estSmpErr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EstSmpErr" element
     */
    public edu.umich.icpsr.ddi.EstSmpErrType insertNewEstSmpErr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EstSmpErrType target = null;
            target = (edu.umich.icpsr.ddi.EstSmpErrType)get_store().insert_element_user(ESTSMPERR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EstSmpErr" element
     */
    public edu.umich.icpsr.ddi.EstSmpErrType addNewEstSmpErr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EstSmpErrType target = null;
            target = (edu.umich.icpsr.ddi.EstSmpErrType)get_store().add_element_user(ESTSMPERR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "EstSmpErr" element
     */
    public void removeEstSmpErr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESTSMPERR$2, i);
        }
    }
    
    /**
     * Gets array of all "dataAppr" elements
     */
    public edu.umich.icpsr.ddi.DataApprType[] getDataApprArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAAPPR$4, targetList);
            edu.umich.icpsr.ddi.DataApprType[] result = new edu.umich.icpsr.ddi.DataApprType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataAppr" element
     */
    public edu.umich.icpsr.ddi.DataApprType getDataApprArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataApprType target = null;
            target = (edu.umich.icpsr.ddi.DataApprType)get_store().find_element_user(DATAAPPR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataAppr" element
     */
    public int sizeOfDataApprArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAAPPR$4);
        }
    }
    
    /**
     * Sets array of all "dataAppr" element
     */
    public void setDataApprArray(edu.umich.icpsr.ddi.DataApprType[] dataApprArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataApprArray, DATAAPPR$4);
        }
    }
    
    /**
     * Sets ith "dataAppr" element
     */
    public void setDataApprArray(int i, edu.umich.icpsr.ddi.DataApprType dataAppr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataApprType target = null;
            target = (edu.umich.icpsr.ddi.DataApprType)get_store().find_element_user(DATAAPPR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataAppr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataAppr" element
     */
    public edu.umich.icpsr.ddi.DataApprType insertNewDataAppr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataApprType target = null;
            target = (edu.umich.icpsr.ddi.DataApprType)get_store().insert_element_user(DATAAPPR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataAppr" element
     */
    public edu.umich.icpsr.ddi.DataApprType addNewDataAppr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataApprType target = null;
            target = (edu.umich.icpsr.ddi.DataApprType)get_store().add_element_user(DATAAPPR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataAppr" element
     */
    public void removeDataAppr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAAPPR$4, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
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
            return get_store().find_attribute_user(ID$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
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
            get_store().remove_attribute(ID$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$8);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$8);
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
            return get_store().find_attribute_user(XMLLANG$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$8);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$8);
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
            get_store().remove_attribute(XMLLANG$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$10);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$10);
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
            return get_store().find_attribute_user(LANG$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$10);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$10);
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
            get_store().remove_attribute(LANG$10);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.AnlyInfoType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$12);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.AnlyInfoType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.AnlyInfoType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AnlyInfoType.Source target = null;
            target = (edu.umich.icpsr.ddi.AnlyInfoType.Source)get_store().find_attribute_user(SOURCE$12);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.AnlyInfoType.Source)get_default_attribute_value(SOURCE$12);
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
            return get_store().find_attribute_user(SOURCE$12) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.AnlyInfoType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$12);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.AnlyInfoType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AnlyInfoType.Source target = null;
            target = (edu.umich.icpsr.ddi.AnlyInfoType.Source)get_store().find_attribute_user(SOURCE$12);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.AnlyInfoType.Source)get_store().add_attribute_user(SOURCE$12);
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
            get_store().remove_attribute(SOURCE$12);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.AnlyInfoType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.AnlyInfoType.Source
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
