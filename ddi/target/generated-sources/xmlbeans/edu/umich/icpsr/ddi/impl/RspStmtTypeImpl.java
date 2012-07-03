/*
 * XML Type:  rspStmtType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.RspStmtType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML rspStmtType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class RspStmtTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.RspStmtType
{
    private static final long serialVersionUID = 1L;
    
    public RspStmtTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHENTY$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "AuthEnty");
    private static final javax.xml.namespace.QName OTHID$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "othId");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$6 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$10 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets array of all "AuthEnty" elements
     */
    public edu.umich.icpsr.ddi.AuthEntyType[] getAuthEntyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHENTY$0, targetList);
            edu.umich.icpsr.ddi.AuthEntyType[] result = new edu.umich.icpsr.ddi.AuthEntyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AuthEnty" element
     */
    public edu.umich.icpsr.ddi.AuthEntyType getAuthEntyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AuthEntyType target = null;
            target = (edu.umich.icpsr.ddi.AuthEntyType)get_store().find_element_user(AUTHENTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AuthEnty" element
     */
    public int sizeOfAuthEntyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHENTY$0);
        }
    }
    
    /**
     * Sets array of all "AuthEnty" element
     */
    public void setAuthEntyArray(edu.umich.icpsr.ddi.AuthEntyType[] authEntyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(authEntyArray, AUTHENTY$0);
        }
    }
    
    /**
     * Sets ith "AuthEnty" element
     */
    public void setAuthEntyArray(int i, edu.umich.icpsr.ddi.AuthEntyType authEnty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AuthEntyType target = null;
            target = (edu.umich.icpsr.ddi.AuthEntyType)get_store().find_element_user(AUTHENTY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(authEnty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AuthEnty" element
     */
    public edu.umich.icpsr.ddi.AuthEntyType insertNewAuthEnty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AuthEntyType target = null;
            target = (edu.umich.icpsr.ddi.AuthEntyType)get_store().insert_element_user(AUTHENTY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AuthEnty" element
     */
    public edu.umich.icpsr.ddi.AuthEntyType addNewAuthEnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AuthEntyType target = null;
            target = (edu.umich.icpsr.ddi.AuthEntyType)get_store().add_element_user(AUTHENTY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AuthEnty" element
     */
    public void removeAuthEnty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHENTY$0, i);
        }
    }
    
    /**
     * Gets array of all "othId" elements
     */
    public edu.umich.icpsr.ddi.OthIdType[] getOthIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OTHID$2, targetList);
            edu.umich.icpsr.ddi.OthIdType[] result = new edu.umich.icpsr.ddi.OthIdType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "othId" element
     */
    public edu.umich.icpsr.ddi.OthIdType getOthIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OthIdType target = null;
            target = (edu.umich.icpsr.ddi.OthIdType)get_store().find_element_user(OTHID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "othId" element
     */
    public int sizeOfOthIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHID$2);
        }
    }
    
    /**
     * Sets array of all "othId" element
     */
    public void setOthIdArray(edu.umich.icpsr.ddi.OthIdType[] othIdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(othIdArray, OTHID$2);
        }
    }
    
    /**
     * Sets ith "othId" element
     */
    public void setOthIdArray(int i, edu.umich.icpsr.ddi.OthIdType othId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OthIdType target = null;
            target = (edu.umich.icpsr.ddi.OthIdType)get_store().find_element_user(OTHID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(othId);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "othId" element
     */
    public edu.umich.icpsr.ddi.OthIdType insertNewOthId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OthIdType target = null;
            target = (edu.umich.icpsr.ddi.OthIdType)get_store().insert_element_user(OTHID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "othId" element
     */
    public edu.umich.icpsr.ddi.OthIdType addNewOthId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OthIdType target = null;
            target = (edu.umich.icpsr.ddi.OthIdType)get_store().add_element_user(OTHID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "othId" element
     */
    public void removeOthId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHID$2, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
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
            return get_store().find_attribute_user(ID$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
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
            get_store().remove_attribute(ID$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$6);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$6);
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
            return get_store().find_attribute_user(XMLLANG$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$6);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$6);
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
            get_store().remove_attribute(XMLLANG$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$8);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$8);
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
            return get_store().find_attribute_user(LANG$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$8);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$8);
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
            get_store().remove_attribute(LANG$8);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.RspStmtType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$10);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.RspStmtType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.RspStmtType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RspStmtType.Source target = null;
            target = (edu.umich.icpsr.ddi.RspStmtType.Source)get_store().find_attribute_user(SOURCE$10);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RspStmtType.Source)get_default_attribute_value(SOURCE$10);
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
            return get_store().find_attribute_user(SOURCE$10) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.RspStmtType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$10);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.RspStmtType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RspStmtType.Source target = null;
            target = (edu.umich.icpsr.ddi.RspStmtType.Source)get_store().find_attribute_user(SOURCE$10);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RspStmtType.Source)get_store().add_attribute_user(SOURCE$10);
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
            get_store().remove_attribute(SOURCE$10);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.RspStmtType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.RspStmtType.Source
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
