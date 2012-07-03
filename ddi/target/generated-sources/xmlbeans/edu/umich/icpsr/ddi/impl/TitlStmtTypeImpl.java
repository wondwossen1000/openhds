/*
 * XML Type:  titlStmtType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.TitlStmtType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML titlStmtType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class TitlStmtTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.TitlStmtType
{
    private static final long serialVersionUID = 1L;
    
    public TitlStmtTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITL$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "titl");
    private static final javax.xml.namespace.QName SUBTITL$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "subTitl");
    private static final javax.xml.namespace.QName ALTTITL$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "altTitl");
    private static final javax.xml.namespace.QName PARTITL$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "parTitl");
    private static final javax.xml.namespace.QName IDNO$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "IDNo");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$12 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$16 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets the "titl" element
     */
    public edu.umich.icpsr.ddi.TitlType getTitl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TitlType target = null;
            target = (edu.umich.icpsr.ddi.TitlType)get_store().find_element_user(TITL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "titl" element
     */
    public void setTitl(edu.umich.icpsr.ddi.TitlType titl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TitlType target = null;
            target = (edu.umich.icpsr.ddi.TitlType)get_store().find_element_user(TITL$0, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.TitlType)get_store().add_element_user(TITL$0);
            }
            target.set(titl);
        }
    }
    
    /**
     * Appends and returns a new empty "titl" element
     */
    public edu.umich.icpsr.ddi.TitlType addNewTitl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TitlType target = null;
            target = (edu.umich.icpsr.ddi.TitlType)get_store().add_element_user(TITL$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "subTitl" elements
     */
    public edu.umich.icpsr.ddi.SubTitlType[] getSubTitlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBTITL$2, targetList);
            edu.umich.icpsr.ddi.SubTitlType[] result = new edu.umich.icpsr.ddi.SubTitlType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "subTitl" element
     */
    public edu.umich.icpsr.ddi.SubTitlType getSubTitlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SubTitlType target = null;
            target = (edu.umich.icpsr.ddi.SubTitlType)get_store().find_element_user(SUBTITL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "subTitl" element
     */
    public int sizeOfSubTitlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBTITL$2);
        }
    }
    
    /**
     * Sets array of all "subTitl" element
     */
    public void setSubTitlArray(edu.umich.icpsr.ddi.SubTitlType[] subTitlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subTitlArray, SUBTITL$2);
        }
    }
    
    /**
     * Sets ith "subTitl" element
     */
    public void setSubTitlArray(int i, edu.umich.icpsr.ddi.SubTitlType subTitl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SubTitlType target = null;
            target = (edu.umich.icpsr.ddi.SubTitlType)get_store().find_element_user(SUBTITL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subTitl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subTitl" element
     */
    public edu.umich.icpsr.ddi.SubTitlType insertNewSubTitl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SubTitlType target = null;
            target = (edu.umich.icpsr.ddi.SubTitlType)get_store().insert_element_user(SUBTITL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subTitl" element
     */
    public edu.umich.icpsr.ddi.SubTitlType addNewSubTitl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SubTitlType target = null;
            target = (edu.umich.icpsr.ddi.SubTitlType)get_store().add_element_user(SUBTITL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "subTitl" element
     */
    public void removeSubTitl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBTITL$2, i);
        }
    }
    
    /**
     * Gets array of all "altTitl" elements
     */
    public edu.umich.icpsr.ddi.AltTitlType[] getAltTitlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALTTITL$4, targetList);
            edu.umich.icpsr.ddi.AltTitlType[] result = new edu.umich.icpsr.ddi.AltTitlType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "altTitl" element
     */
    public edu.umich.icpsr.ddi.AltTitlType getAltTitlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AltTitlType target = null;
            target = (edu.umich.icpsr.ddi.AltTitlType)get_store().find_element_user(ALTTITL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "altTitl" element
     */
    public int sizeOfAltTitlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTTITL$4);
        }
    }
    
    /**
     * Sets array of all "altTitl" element
     */
    public void setAltTitlArray(edu.umich.icpsr.ddi.AltTitlType[] altTitlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(altTitlArray, ALTTITL$4);
        }
    }
    
    /**
     * Sets ith "altTitl" element
     */
    public void setAltTitlArray(int i, edu.umich.icpsr.ddi.AltTitlType altTitl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AltTitlType target = null;
            target = (edu.umich.icpsr.ddi.AltTitlType)get_store().find_element_user(ALTTITL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(altTitl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "altTitl" element
     */
    public edu.umich.icpsr.ddi.AltTitlType insertNewAltTitl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AltTitlType target = null;
            target = (edu.umich.icpsr.ddi.AltTitlType)get_store().insert_element_user(ALTTITL$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "altTitl" element
     */
    public edu.umich.icpsr.ddi.AltTitlType addNewAltTitl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AltTitlType target = null;
            target = (edu.umich.icpsr.ddi.AltTitlType)get_store().add_element_user(ALTTITL$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "altTitl" element
     */
    public void removeAltTitl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTTITL$4, i);
        }
    }
    
    /**
     * Gets array of all "parTitl" elements
     */
    public edu.umich.icpsr.ddi.ParTitlType[] getParTitlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTITL$6, targetList);
            edu.umich.icpsr.ddi.ParTitlType[] result = new edu.umich.icpsr.ddi.ParTitlType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "parTitl" element
     */
    public edu.umich.icpsr.ddi.ParTitlType getParTitlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ParTitlType target = null;
            target = (edu.umich.icpsr.ddi.ParTitlType)get_store().find_element_user(PARTITL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "parTitl" element
     */
    public int sizeOfParTitlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTITL$6);
        }
    }
    
    /**
     * Sets array of all "parTitl" element
     */
    public void setParTitlArray(edu.umich.icpsr.ddi.ParTitlType[] parTitlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(parTitlArray, PARTITL$6);
        }
    }
    
    /**
     * Sets ith "parTitl" element
     */
    public void setParTitlArray(int i, edu.umich.icpsr.ddi.ParTitlType parTitl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ParTitlType target = null;
            target = (edu.umich.icpsr.ddi.ParTitlType)get_store().find_element_user(PARTITL$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(parTitl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parTitl" element
     */
    public edu.umich.icpsr.ddi.ParTitlType insertNewParTitl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ParTitlType target = null;
            target = (edu.umich.icpsr.ddi.ParTitlType)get_store().insert_element_user(PARTITL$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parTitl" element
     */
    public edu.umich.icpsr.ddi.ParTitlType addNewParTitl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ParTitlType target = null;
            target = (edu.umich.icpsr.ddi.ParTitlType)get_store().add_element_user(PARTITL$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "parTitl" element
     */
    public void removeParTitl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTITL$6, i);
        }
    }
    
    /**
     * Gets array of all "IDNo" elements
     */
    public edu.umich.icpsr.ddi.IDNoType[] getIDNoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDNO$8, targetList);
            edu.umich.icpsr.ddi.IDNoType[] result = new edu.umich.icpsr.ddi.IDNoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IDNo" element
     */
    public edu.umich.icpsr.ddi.IDNoType getIDNoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.IDNoType target = null;
            target = (edu.umich.icpsr.ddi.IDNoType)get_store().find_element_user(IDNO$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "IDNo" element
     */
    public int sizeOfIDNoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDNO$8);
        }
    }
    
    /**
     * Sets array of all "IDNo" element
     */
    public void setIDNoArray(edu.umich.icpsr.ddi.IDNoType[] idNoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(idNoArray, IDNO$8);
        }
    }
    
    /**
     * Sets ith "IDNo" element
     */
    public void setIDNoArray(int i, edu.umich.icpsr.ddi.IDNoType idNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.IDNoType target = null;
            target = (edu.umich.icpsr.ddi.IDNoType)get_store().find_element_user(IDNO$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(idNo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IDNo" element
     */
    public edu.umich.icpsr.ddi.IDNoType insertNewIDNo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.IDNoType target = null;
            target = (edu.umich.icpsr.ddi.IDNoType)get_store().insert_element_user(IDNO$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IDNo" element
     */
    public edu.umich.icpsr.ddi.IDNoType addNewIDNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.IDNoType target = null;
            target = (edu.umich.icpsr.ddi.IDNoType)get_store().add_element_user(IDNO$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "IDNo" element
     */
    public void removeIDNo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDNO$8, i);
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
    public edu.umich.icpsr.ddi.TitlStmtType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.TitlStmtType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.TitlStmtType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TitlStmtType.Source target = null;
            target = (edu.umich.icpsr.ddi.TitlStmtType.Source)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.TitlStmtType.Source)get_default_attribute_value(SOURCE$16);
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
    public void setSource(edu.umich.icpsr.ddi.TitlStmtType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.TitlStmtType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TitlStmtType.Source target = null;
            target = (edu.umich.icpsr.ddi.TitlStmtType.Source)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.TitlStmtType.Source)get_store().add_attribute_user(SOURCE$16);
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
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.TitlStmtType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.TitlStmtType.Source
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
