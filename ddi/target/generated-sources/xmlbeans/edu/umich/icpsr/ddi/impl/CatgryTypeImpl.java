/*
 * XML Type:  catgryType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.CatgryType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML catgryType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class CatgryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.CatgryType
{
    private static final long serialVersionUID = 1L;
    
    public CatgryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATVALU$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "catValu");
    private static final javax.xml.namespace.QName LABL$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "labl");
    private static final javax.xml.namespace.QName TXT$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "txt");
    private static final javax.xml.namespace.QName CATSTAT$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "catStat");
    private static final javax.xml.namespace.QName MROW$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "mrow");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$12 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$16 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName MISSING$18 = 
        new javax.xml.namespace.QName("", "missing");
    private static final javax.xml.namespace.QName MISSTYPE$20 = 
        new javax.xml.namespace.QName("", "missType");
    private static final javax.xml.namespace.QName COUNTRY$22 = 
        new javax.xml.namespace.QName("", "country");
    private static final javax.xml.namespace.QName SDATREFS$24 = 
        new javax.xml.namespace.QName("", "sdatrefs");
    private static final javax.xml.namespace.QName EXCLS$26 = 
        new javax.xml.namespace.QName("", "excls");
    private static final javax.xml.namespace.QName CATGRY$28 = 
        new javax.xml.namespace.QName("", "catgry");
    private static final javax.xml.namespace.QName LEVEL$30 = 
        new javax.xml.namespace.QName("", "level");
    
    
    /**
     * Gets the "catValu" element
     */
    public edu.umich.icpsr.ddi.CatValuType getCatValu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatValuType target = null;
            target = (edu.umich.icpsr.ddi.CatValuType)get_store().find_element_user(CATVALU$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "catValu" element
     */
    public boolean isSetCatValu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATVALU$0) != 0;
        }
    }
    
    /**
     * Sets the "catValu" element
     */
    public void setCatValu(edu.umich.icpsr.ddi.CatValuType catValu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatValuType target = null;
            target = (edu.umich.icpsr.ddi.CatValuType)get_store().find_element_user(CATVALU$0, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatValuType)get_store().add_element_user(CATVALU$0);
            }
            target.set(catValu);
        }
    }
    
    /**
     * Appends and returns a new empty "catValu" element
     */
    public edu.umich.icpsr.ddi.CatValuType addNewCatValu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatValuType target = null;
            target = (edu.umich.icpsr.ddi.CatValuType)get_store().add_element_user(CATVALU$0);
            return target;
        }
    }
    
    /**
     * Unsets the "catValu" element
     */
    public void unsetCatValu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATVALU$0, 0);
        }
    }
    
    /**
     * Gets array of all "labl" elements
     */
    public edu.umich.icpsr.ddi.LablType[] getLablArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LABL$2, targetList);
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
            target = (edu.umich.icpsr.ddi.LablType)get_store().find_element_user(LABL$2, i);
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
            return get_store().count_elements(LABL$2);
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
            arraySetterHelper(lablArray, LABL$2);
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
            target = (edu.umich.icpsr.ddi.LablType)get_store().find_element_user(LABL$2, i);
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
            target = (edu.umich.icpsr.ddi.LablType)get_store().insert_element_user(LABL$2, i);
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
            target = (edu.umich.icpsr.ddi.LablType)get_store().add_element_user(LABL$2);
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
            get_store().remove_element(LABL$2, i);
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
     * Gets array of all "catStat" elements
     */
    public edu.umich.icpsr.ddi.CatStatType[] getCatStatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATSTAT$6, targetList);
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
            target = (edu.umich.icpsr.ddi.CatStatType)get_store().find_element_user(CATSTAT$6, i);
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
            return get_store().count_elements(CATSTAT$6);
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
            arraySetterHelper(catStatArray, CATSTAT$6);
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
            target = (edu.umich.icpsr.ddi.CatStatType)get_store().find_element_user(CATSTAT$6, i);
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
            target = (edu.umich.icpsr.ddi.CatStatType)get_store().insert_element_user(CATSTAT$6, i);
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
            target = (edu.umich.icpsr.ddi.CatStatType)get_store().add_element_user(CATSTAT$6);
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
            get_store().remove_element(CATSTAT$6, i);
        }
    }
    
    /**
     * Gets the "mrow" element
     */
    public edu.umich.icpsr.ddi.MrowType getMrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MrowType target = null;
            target = (edu.umich.icpsr.ddi.MrowType)get_store().find_element_user(MROW$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "mrow" element
     */
    public boolean isSetMrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MROW$8) != 0;
        }
    }
    
    /**
     * Sets the "mrow" element
     */
    public void setMrow(edu.umich.icpsr.ddi.MrowType mrow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MrowType target = null;
            target = (edu.umich.icpsr.ddi.MrowType)get_store().find_element_user(MROW$8, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.MrowType)get_store().add_element_user(MROW$8);
            }
            target.set(mrow);
        }
    }
    
    /**
     * Appends and returns a new empty "mrow" element
     */
    public edu.umich.icpsr.ddi.MrowType addNewMrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MrowType target = null;
            target = (edu.umich.icpsr.ddi.MrowType)get_store().add_element_user(MROW$8);
            return target;
        }
    }
    
    /**
     * Unsets the "mrow" element
     */
    public void unsetMrow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MROW$8, 0);
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
    public edu.umich.icpsr.ddi.CatgryType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.CatgryType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.CatgryType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryType.Source target = null;
            target = (edu.umich.icpsr.ddi.CatgryType.Source)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatgryType.Source)get_default_attribute_value(SOURCE$16);
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
    public void setSource(edu.umich.icpsr.ddi.CatgryType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.CatgryType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryType.Source target = null;
            target = (edu.umich.icpsr.ddi.CatgryType.Source)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatgryType.Source)get_store().add_attribute_user(SOURCE$16);
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
     * Gets the "missing" attribute
     */
    public edu.umich.icpsr.ddi.CatgryType.Missing.Enum getMissing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MISSING$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MISSING$18);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.CatgryType.Missing.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "missing" attribute
     */
    public edu.umich.icpsr.ddi.CatgryType.Missing xgetMissing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryType.Missing target = null;
            target = (edu.umich.icpsr.ddi.CatgryType.Missing)get_store().find_attribute_user(MISSING$18);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatgryType.Missing)get_default_attribute_value(MISSING$18);
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
            return get_store().find_attribute_user(MISSING$18) != null;
        }
    }
    
    /**
     * Sets the "missing" attribute
     */
    public void setMissing(edu.umich.icpsr.ddi.CatgryType.Missing.Enum missing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MISSING$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MISSING$18);
            }
            target.setEnumValue(missing);
        }
    }
    
    /**
     * Sets (as xml) the "missing" attribute
     */
    public void xsetMissing(edu.umich.icpsr.ddi.CatgryType.Missing missing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryType.Missing target = null;
            target = (edu.umich.icpsr.ddi.CatgryType.Missing)get_store().find_attribute_user(MISSING$18);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatgryType.Missing)get_store().add_attribute_user(MISSING$18);
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
            get_store().remove_attribute(MISSING$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MISSTYPE$20);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MISSTYPE$20);
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
            return get_store().find_attribute_user(MISSTYPE$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MISSTYPE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MISSTYPE$20);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MISSTYPE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MISSTYPE$20);
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
            get_store().remove_attribute(MISSTYPE$20);
        }
    }
    
    /**
     * Gets the "country" attribute
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRY$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "country" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRY$22);
            return target;
        }
    }
    
    /**
     * True if has "country" attribute
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COUNTRY$22) != null;
        }
    }
    
    /**
     * Sets the "country" attribute
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNTRY$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNTRY$22);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "country" attribute
     */
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COUNTRY$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COUNTRY$22);
            }
            target.set(country);
        }
    }
    
    /**
     * Unsets the "country" attribute
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COUNTRY$22);
        }
    }
    
    /**
     * Gets the "sdatrefs" attribute
     */
    public java.util.List getSdatrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SDATREFS$24);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "sdatrefs" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetSdatrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(SDATREFS$24);
            return target;
        }
    }
    
    /**
     * True if has "sdatrefs" attribute
     */
    public boolean isSetSdatrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SDATREFS$24) != null;
        }
    }
    
    /**
     * Sets the "sdatrefs" attribute
     */
    public void setSdatrefs(java.util.List sdatrefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SDATREFS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SDATREFS$24);
            }
            target.setListValue(sdatrefs);
        }
    }
    
    /**
     * Sets (as xml) the "sdatrefs" attribute
     */
    public void xsetSdatrefs(org.apache.xmlbeans.XmlIDREFS sdatrefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(SDATREFS$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(SDATREFS$24);
            }
            target.set(sdatrefs);
        }
    }
    
    /**
     * Unsets the "sdatrefs" attribute
     */
    public void unsetSdatrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SDATREFS$24);
        }
    }
    
    /**
     * Gets the "excls" attribute
     */
    public edu.umich.icpsr.ddi.CatgryType.Excls.Enum getExcls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXCLS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXCLS$26);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.CatgryType.Excls.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "excls" attribute
     */
    public edu.umich.icpsr.ddi.CatgryType.Excls xgetExcls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryType.Excls target = null;
            target = (edu.umich.icpsr.ddi.CatgryType.Excls)get_store().find_attribute_user(EXCLS$26);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatgryType.Excls)get_default_attribute_value(EXCLS$26);
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
            return get_store().find_attribute_user(EXCLS$26) != null;
        }
    }
    
    /**
     * Sets the "excls" attribute
     */
    public void setExcls(edu.umich.icpsr.ddi.CatgryType.Excls.Enum excls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXCLS$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXCLS$26);
            }
            target.setEnumValue(excls);
        }
    }
    
    /**
     * Sets (as xml) the "excls" attribute
     */
    public void xsetExcls(edu.umich.icpsr.ddi.CatgryType.Excls excls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryType.Excls target = null;
            target = (edu.umich.icpsr.ddi.CatgryType.Excls)get_store().find_attribute_user(EXCLS$26);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CatgryType.Excls)get_store().add_attribute_user(EXCLS$26);
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
            get_store().remove_attribute(EXCLS$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATGRY$28);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(CATGRY$28);
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
            return get_store().find_attribute_user(CATGRY$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATGRY$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATGRY$28);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(CATGRY$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(CATGRY$28);
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
            get_store().remove_attribute(CATGRY$28);
        }
    }
    
    /**
     * Gets the "level" attribute
     */
    public java.lang.String getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "level" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(LEVEL$30);
            return target;
        }
    }
    
    /**
     * True if has "level" attribute
     */
    public boolean isSetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEVEL$30) != null;
        }
    }
    
    /**
     * Sets the "level" attribute
     */
    public void setLevel(java.lang.String level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$30);
            }
            target.setStringValue(level);
        }
    }
    
    /**
     * Sets (as xml) the "level" attribute
     */
    public void xsetLevel(org.apache.xmlbeans.XmlIDREF level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(LEVEL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(LEVEL$30);
            }
            target.set(level);
        }
    }
    
    /**
     * Unsets the "level" attribute
     */
    public void unsetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEVEL$30);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CatgryType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.CatgryType.Source
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
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CatgryType$Missing.
     */
    public static class MissingImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.CatgryType.Missing
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
     * An XML excls(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CatgryType$Excls.
     */
    public static class ExclsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.CatgryType.Excls
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
