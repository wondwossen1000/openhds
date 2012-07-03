/*
 * XML Type:  catgryGrpType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.CatgryGrpType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML catgryGrpType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class CatgryGrpTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.CatgryGrpType
{
    private static final long serialVersionUID = 1L;
    
    public CatgryGrpTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABL$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "labl");
    private static final javax.xml.namespace.QName CATSTAT$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "catStat");
    private static final javax.xml.namespace.QName TXT$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "txt");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$8 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$12 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName MISSING$14 = 
        new javax.xml.namespace.QName("", "missing");
    private static final javax.xml.namespace.QName MISSTYPE$16 = 
        new javax.xml.namespace.QName("", "missType");
    private static final javax.xml.namespace.QName CATGRY$18 = 
        new javax.xml.namespace.QName("", "catgry");
    private static final javax.xml.namespace.QName CATGRP$20 = 
        new javax.xml.namespace.QName("", "catGrp");
    private static final javax.xml.namespace.QName LEVELNO$22 = 
        new javax.xml.namespace.QName("", "levelno");
    private static final javax.xml.namespace.QName LEVELNM$24 = 
        new javax.xml.namespace.QName("", "levelnm");
    private static final javax.xml.namespace.QName COMPL$26 = 
        new javax.xml.namespace.QName("", "compl");
    private static final javax.xml.namespace.QName EXCLS$28 = 
        new javax.xml.namespace.QName("", "excls");
    
    
    /**
     * Gets array of all "labl" elements
     */
    public edu.umich.icpsr.ddi.LablType[] getLablArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LABL$0, targetList);
            edu.umich.icpsr.ddi.LablType[] result = new edu.umich.icpsr.ddi.LablType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "labl" element
     */
    public edu.umich.icpsr.ddi.LablType getLablArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LablType target = null;
            target = (edu.umich.icpsr.ddi.LablType)get_store().find_element_user(LABL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "labl" element
     */
    public int sizeOfLablArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LABL$0);
        }
    }
    
    /**
     * Sets array of all "labl" element
     */
    public void setLablArray(edu.umich.icpsr.ddi.LablType[] lablArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lablArray, LABL$0);
        }
    }
    
    /**
     * Sets ith "labl" element
     */
    public void setLablArray(int i, edu.umich.icpsr.ddi.LablType labl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LablType target = null;
            target = (edu.umich.icpsr.ddi.LablType)get_store().find_element_user(LABL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(labl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "labl" element
     */
    public edu.umich.icpsr.ddi.LablType insertNewLabl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LablType target = null;
            target = (edu.umich.icpsr.ddi.LablType)get_store().insert_element_user(LABL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "labl" element
     */
    public edu.umich.icpsr.ddi.LablType addNewLabl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LablType target = null;
            target = (edu.umich.icpsr.ddi.LablType)get_store().add_element_user(LABL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "labl" element
     */
    public void removeLabl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LABL$0, i);
        }
    }
    
    /**
     * Gets array of all "catStat" elements
     */
    public edu.umich.icpsr.ddi.CatStatType[] getCatStatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATSTAT$2, targetList);
            edu.umich.icpsr.ddi.CatStatType[] result = new edu.umich.icpsr.ddi.CatStatType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "catStat" element
     */
    public edu.umich.icpsr.ddi.CatStatType getCatStatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatStatType target = null;
            target = (edu.umich.icpsr.ddi.CatStatType)get_store().find_element_user(CATSTAT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "catStat" element
     */
    public int sizeOfCatStatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATSTAT$2);
        }
    }
    
    /**
     * Sets array of all "catStat" element
     */
    public void setCatStatArray(edu.umich.icpsr.ddi.CatStatType[] catStatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(catStatArray, CATSTAT$2);
        }
    }
    
    /**
     * Sets ith "catStat" element
     */
    public void setCatStatArray(int i, edu.umich.icpsr.ddi.CatStatType catStat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatStatType target = null;
            target = (edu.umich.icpsr.ddi.CatStatType)get_store().find_element_user(CATSTAT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(catStat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "catStat" element
     */
    public edu.umich.icpsr.ddi.CatStatType insertNewCatStat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatStatType target = null;
            target = (edu.umich.icpsr.ddi.CatStatType)get_store().insert_element_user(CATSTAT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "catStat" element
     */
    public edu.umich.icpsr.ddi.CatStatType addNewCatStat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatStatType target = null;
            target = (edu.umich.icpsr.ddi.CatStatType)get_store().add_element_user(CATSTAT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "catStat" element
     */
    public void removeCatStat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATSTAT$2, i);
        }
    }
    
    /**
     * Gets array of all "txt" elements
     */
    public edu.umich.icpsr.ddi.TxtType[] getTxtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TXT$4, targetList);
            edu.umich.icpsr.ddi.TxtType[] result = new edu.umich.icpsr.ddi.TxtType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "txt" element
     */
    public edu.umich.icpsr.ddi.TxtType getTxtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TxtType target = null;
            target = (edu.umich.icpsr.ddi.TxtType)get_store().find_element_user(TXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "txt" element
     */
    public int sizeOfTxtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXT$4);
        }
    }
    
    /**
     * Sets array of all "txt" element
     */
    public void setTxtArray(edu.umich.icpsr.ddi.TxtType[] txtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(txtArray, TXT$4);
        }
    }
    
    /**
     * Sets ith "txt" element
     */
    public void setTxtArray(int i, edu.umich.icpsr.ddi.TxtType txt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TxtType target = null;
            target = (edu.umich.icpsr.ddi.TxtType)get_store().find_element_user(TXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(txt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "txt" element
     */
    public edu.umich.icpsr.ddi.TxtType insertNewTxt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TxtType target = null;
            target = (edu.umich.icpsr.ddi.TxtType)get_store().insert_element_user(TXT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "txt" element
     */
    public edu.umich.icpsr.ddi.TxtType addNewTxt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TxtType target = null;
            target = (edu.umich.icpsr.ddi.TxtType)get_store().add_element_user(TXT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "txt" element
     */
    public void removeTxt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXT$4, i);
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
    public edu.umich.icpsr.ddi.CatgryGrpType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.CatgryGrpType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.CatgryGrpType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryGrpType.Source target = null;
            target = (edu.umich.icpsr.ddi.CatgryGrpType.Source)get_store().find_attribute_user(SOURCE$12);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatgryGrpType.Source)get_default_attribute_value(SOURCE$12);
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
    public void setSource(edu.umich.icpsr.ddi.CatgryGrpType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.CatgryGrpType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryGrpType.Source target = null;
            target = (edu.umich.icpsr.ddi.CatgryGrpType.Source)get_store().find_attribute_user(SOURCE$12);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatgryGrpType.Source)get_store().add_attribute_user(SOURCE$12);
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
     * Gets the "missing" attribute
     */
    public edu.umich.icpsr.ddi.CatgryGrpType.Missing.Enum getMissing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MISSING$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MISSING$14);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.CatgryGrpType.Missing.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "missing" attribute
     */
    public edu.umich.icpsr.ddi.CatgryGrpType.Missing xgetMissing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryGrpType.Missing target = null;
            target = (edu.umich.icpsr.ddi.CatgryGrpType.Missing)get_store().find_attribute_user(MISSING$14);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatgryGrpType.Missing)get_default_attribute_value(MISSING$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "missing" attribute
     */
    public boolean isSetMissing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MISSING$14) != null;
        }
    }
    
    /**
     * Sets the "missing" attribute
     */
    public void setMissing(edu.umich.icpsr.ddi.CatgryGrpType.Missing.Enum missing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MISSING$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MISSING$14);
            }
            target.setEnumValue(missing);
        }
    }
    
    /**
     * Sets (as xml) the "missing" attribute
     */
    public void xsetMissing(edu.umich.icpsr.ddi.CatgryGrpType.Missing missing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryGrpType.Missing target = null;
            target = (edu.umich.icpsr.ddi.CatgryGrpType.Missing)get_store().find_attribute_user(MISSING$14);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatgryGrpType.Missing)get_store().add_attribute_user(MISSING$14);
            }
            target.set(missing);
        }
    }
    
    /**
     * Unsets the "missing" attribute
     */
    public void unsetMissing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MISSING$14);
        }
    }
    
    /**
     * Gets the "missType" attribute
     */
    public java.lang.String getMissType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MISSTYPE$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "missType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMissType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MISSTYPE$16);
            return target;
        }
    }
    
    /**
     * True if has "missType" attribute
     */
    public boolean isSetMissType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MISSTYPE$16) != null;
        }
    }
    
    /**
     * Sets the "missType" attribute
     */
    public void setMissType(java.lang.String missType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MISSTYPE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MISSTYPE$16);
            }
            target.setStringValue(missType);
        }
    }
    
    /**
     * Sets (as xml) the "missType" attribute
     */
    public void xsetMissType(org.apache.xmlbeans.XmlString missType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MISSTYPE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MISSTYPE$16);
            }
            target.set(missType);
        }
    }
    
    /**
     * Unsets the "missType" attribute
     */
    public void unsetMissType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MISSTYPE$16);
        }
    }
    
    /**
     * Gets the "catgry" attribute
     */
    public java.util.List getCatgry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATGRY$18);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "catgry" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetCatgry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(CATGRY$18);
            return target;
        }
    }
    
    /**
     * True if has "catgry" attribute
     */
    public boolean isSetCatgry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CATGRY$18) != null;
        }
    }
    
    /**
     * Sets the "catgry" attribute
     */
    public void setCatgry(java.util.List catgry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATGRY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATGRY$18);
            }
            target.setListValue(catgry);
        }
    }
    
    /**
     * Sets (as xml) the "catgry" attribute
     */
    public void xsetCatgry(org.apache.xmlbeans.XmlIDREFS catgry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(CATGRY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(CATGRY$18);
            }
            target.set(catgry);
        }
    }
    
    /**
     * Unsets the "catgry" attribute
     */
    public void unsetCatgry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CATGRY$18);
        }
    }
    
    /**
     * Gets the "catGrp" attribute
     */
    public java.util.List getCatGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATGRP$20);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "catGrp" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetCatGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(CATGRP$20);
            return target;
        }
    }
    
    /**
     * True if has "catGrp" attribute
     */
    public boolean isSetCatGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CATGRP$20) != null;
        }
    }
    
    /**
     * Sets the "catGrp" attribute
     */
    public void setCatGrp(java.util.List catGrp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATGRP$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATGRP$20);
            }
            target.setListValue(catGrp);
        }
    }
    
    /**
     * Sets (as xml) the "catGrp" attribute
     */
    public void xsetCatGrp(org.apache.xmlbeans.XmlIDREFS catGrp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(CATGRP$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(CATGRP$20);
            }
            target.set(catGrp);
        }
    }
    
    /**
     * Unsets the "catGrp" attribute
     */
    public void unsetCatGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CATGRP$20);
        }
    }
    
    /**
     * Gets the "levelno" attribute
     */
    public java.lang.String getLevelno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVELNO$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "levelno" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLevelno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEVELNO$22);
            return target;
        }
    }
    
    /**
     * True if has "levelno" attribute
     */
    public boolean isSetLevelno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEVELNO$22) != null;
        }
    }
    
    /**
     * Sets the "levelno" attribute
     */
    public void setLevelno(java.lang.String levelno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVELNO$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVELNO$22);
            }
            target.setStringValue(levelno);
        }
    }
    
    /**
     * Sets (as xml) the "levelno" attribute
     */
    public void xsetLevelno(org.apache.xmlbeans.XmlString levelno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEVELNO$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LEVELNO$22);
            }
            target.set(levelno);
        }
    }
    
    /**
     * Unsets the "levelno" attribute
     */
    public void unsetLevelno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEVELNO$22);
        }
    }
    
    /**
     * Gets the "levelnm" attribute
     */
    public java.lang.String getLevelnm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVELNM$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "levelnm" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLevelnm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEVELNM$24);
            return target;
        }
    }
    
    /**
     * True if has "levelnm" attribute
     */
    public boolean isSetLevelnm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEVELNM$24) != null;
        }
    }
    
    /**
     * Sets the "levelnm" attribute
     */
    public void setLevelnm(java.lang.String levelnm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVELNM$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVELNM$24);
            }
            target.setStringValue(levelnm);
        }
    }
    
    /**
     * Sets (as xml) the "levelnm" attribute
     */
    public void xsetLevelnm(org.apache.xmlbeans.XmlString levelnm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEVELNM$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LEVELNM$24);
            }
            target.set(levelnm);
        }
    }
    
    /**
     * Unsets the "levelnm" attribute
     */
    public void unsetLevelnm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEVELNM$24);
        }
    }
    
    /**
     * Gets the "compl" attribute
     */
    public edu.umich.icpsr.ddi.CatgryGrpType.Compl.Enum getCompl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COMPL$26);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.CatgryGrpType.Compl.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "compl" attribute
     */
    public edu.umich.icpsr.ddi.CatgryGrpType.Compl xgetCompl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryGrpType.Compl target = null;
            target = (edu.umich.icpsr.ddi.CatgryGrpType.Compl)get_store().find_attribute_user(COMPL$26);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatgryGrpType.Compl)get_default_attribute_value(COMPL$26);
            }
            return target;
        }
    }
    
    /**
     * True if has "compl" attribute
     */
    public boolean isSetCompl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPL$26) != null;
        }
    }
    
    /**
     * Sets the "compl" attribute
     */
    public void setCompl(edu.umich.icpsr.ddi.CatgryGrpType.Compl.Enum compl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPL$26);
            }
            target.setEnumValue(compl);
        }
    }
    
    /**
     * Sets (as xml) the "compl" attribute
     */
    public void xsetCompl(edu.umich.icpsr.ddi.CatgryGrpType.Compl compl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryGrpType.Compl target = null;
            target = (edu.umich.icpsr.ddi.CatgryGrpType.Compl)get_store().find_attribute_user(COMPL$26);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatgryGrpType.Compl)get_store().add_attribute_user(COMPL$26);
            }
            target.set(compl);
        }
    }
    
    /**
     * Unsets the "compl" attribute
     */
    public void unsetCompl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPL$26);
        }
    }
    
    /**
     * Gets the "excls" attribute
     */
    public edu.umich.icpsr.ddi.CatgryGrpType.Excls.Enum getExcls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXCLS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXCLS$28);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.CatgryGrpType.Excls.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "excls" attribute
     */
    public edu.umich.icpsr.ddi.CatgryGrpType.Excls xgetExcls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryGrpType.Excls target = null;
            target = (edu.umich.icpsr.ddi.CatgryGrpType.Excls)get_store().find_attribute_user(EXCLS$28);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatgryGrpType.Excls)get_default_attribute_value(EXCLS$28);
            }
            return target;
        }
    }
    
    /**
     * True if has "excls" attribute
     */
    public boolean isSetExcls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXCLS$28) != null;
        }
    }
    
    /**
     * Sets the "excls" attribute
     */
    public void setExcls(edu.umich.icpsr.ddi.CatgryGrpType.Excls.Enum excls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXCLS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXCLS$28);
            }
            target.setEnumValue(excls);
        }
    }
    
    /**
     * Sets (as xml) the "excls" attribute
     */
    public void xsetExcls(edu.umich.icpsr.ddi.CatgryGrpType.Excls excls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryGrpType.Excls target = null;
            target = (edu.umich.icpsr.ddi.CatgryGrpType.Excls)get_store().find_attribute_user(EXCLS$28);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatgryGrpType.Excls)get_store().add_attribute_user(EXCLS$28);
            }
            target.set(excls);
        }
    }
    
    /**
     * Unsets the "excls" attribute
     */
    public void unsetExcls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXCLS$28);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CatgryGrpType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.CatgryGrpType.Source
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
    /**
     * An XML missing(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CatgryGrpType$Missing.
     */
    public static class MissingImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.CatgryGrpType.Missing
    {
        private static final long serialVersionUID = 1L;
        
        public MissingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MissingImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML compl(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CatgryGrpType$Compl.
     */
    public static class ComplImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.CatgryGrpType.Compl
    {
        private static final long serialVersionUID = 1L;
        
        public ComplImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ComplImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML excls(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CatgryGrpType$Excls.
     */
    public static class ExclsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.CatgryGrpType.Excls
    {
        private static final long serialVersionUID = 1L;
        
        public ExclsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ExclsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
