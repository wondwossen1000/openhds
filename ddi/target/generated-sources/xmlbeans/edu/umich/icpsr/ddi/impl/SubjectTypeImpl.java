/*
 * XML Type:  subjectType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.SubjectType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML subjectType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class SubjectTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.SubjectType
{
    private static final long serialVersionUID = 1L;
    
    public SubjectTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYWORD$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "keyword");
    private static final javax.xml.namespace.QName TOPCCLAS$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "topcClas");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$6 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$10 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets array of all "keyword" elements
     */
    public edu.umich.icpsr.ddi.KeywordType[] getKeywordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYWORD$0, targetList);
            edu.umich.icpsr.ddi.KeywordType[] result = new edu.umich.icpsr.ddi.KeywordType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "keyword" element
     */
    public edu.umich.icpsr.ddi.KeywordType getKeywordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.KeywordType target = null;
            target = (edu.umich.icpsr.ddi.KeywordType)get_store().find_element_user(KEYWORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "keyword" element
     */
    public int sizeOfKeywordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYWORD$0);
        }
    }
    
    /**
     * Sets array of all "keyword" element
     */
    public void setKeywordArray(edu.umich.icpsr.ddi.KeywordType[] keywordArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keywordArray, KEYWORD$0);
        }
    }
    
    /**
     * Sets ith "keyword" element
     */
    public void setKeywordArray(int i, edu.umich.icpsr.ddi.KeywordType keyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.KeywordType target = null;
            target = (edu.umich.icpsr.ddi.KeywordType)get_store().find_element_user(KEYWORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyword);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "keyword" element
     */
    public edu.umich.icpsr.ddi.KeywordType insertNewKeyword(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.KeywordType target = null;
            target = (edu.umich.icpsr.ddi.KeywordType)get_store().insert_element_user(KEYWORD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "keyword" element
     */
    public edu.umich.icpsr.ddi.KeywordType addNewKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.KeywordType target = null;
            target = (edu.umich.icpsr.ddi.KeywordType)get_store().add_element_user(KEYWORD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "keyword" element
     */
    public void removeKeyword(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYWORD$0, i);
        }
    }
    
    /**
     * Gets array of all "topcClas" elements
     */
    public edu.umich.icpsr.ddi.TopcClasType[] getTopcClasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TOPCCLAS$2, targetList);
            edu.umich.icpsr.ddi.TopcClasType[] result = new edu.umich.icpsr.ddi.TopcClasType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "topcClas" element
     */
    public edu.umich.icpsr.ddi.TopcClasType getTopcClasArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TopcClasType target = null;
            target = (edu.umich.icpsr.ddi.TopcClasType)get_store().find_element_user(TOPCCLAS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "topcClas" element
     */
    public int sizeOfTopcClasArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOPCCLAS$2);
        }
    }
    
    /**
     * Sets array of all "topcClas" element
     */
    public void setTopcClasArray(edu.umich.icpsr.ddi.TopcClasType[] topcClasArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(topcClasArray, TOPCCLAS$2);
        }
    }
    
    /**
     * Sets ith "topcClas" element
     */
    public void setTopcClasArray(int i, edu.umich.icpsr.ddi.TopcClasType topcClas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TopcClasType target = null;
            target = (edu.umich.icpsr.ddi.TopcClasType)get_store().find_element_user(TOPCCLAS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(topcClas);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "topcClas" element
     */
    public edu.umich.icpsr.ddi.TopcClasType insertNewTopcClas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TopcClasType target = null;
            target = (edu.umich.icpsr.ddi.TopcClasType)get_store().insert_element_user(TOPCCLAS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "topcClas" element
     */
    public edu.umich.icpsr.ddi.TopcClasType addNewTopcClas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TopcClasType target = null;
            target = (edu.umich.icpsr.ddi.TopcClasType)get_store().add_element_user(TOPCCLAS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "topcClas" element
     */
    public void removeTopcClas(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOPCCLAS$2, i);
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
    public edu.umich.icpsr.ddi.SubjectType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.SubjectType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.SubjectType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SubjectType.Source target = null;
            target = (edu.umich.icpsr.ddi.SubjectType.Source)get_store().find_attribute_user(SOURCE$10);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SubjectType.Source)get_default_attribute_value(SOURCE$10);
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
    public void setSource(edu.umich.icpsr.ddi.SubjectType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.SubjectType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SubjectType.Source target = null;
            target = (edu.umich.icpsr.ddi.SubjectType.Source)get_store().find_attribute_user(SOURCE$10);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SubjectType.Source)get_store().add_attribute_user(SOURCE$10);
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
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.SubjectType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.SubjectType.Source
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
