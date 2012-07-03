/*
 * XML Type:  recGrpType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.RecGrpType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML recGrpType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class RecGrpTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.RecGrpType
{
    private static final long serialVersionUID = 1L;
    
    public RecGrpTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABL$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "labl");
    private static final javax.xml.namespace.QName RECDIMNSN$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "recDimnsn");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$6 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$10 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName RECGRP$12 = 
        new javax.xml.namespace.QName("", "recGrp");
    private static final javax.xml.namespace.QName RECTYPE$14 = 
        new javax.xml.namespace.QName("", "rectype");
    private static final javax.xml.namespace.QName KEYVAR$16 = 
        new javax.xml.namespace.QName("", "keyvar");
    private static final javax.xml.namespace.QName RTYPELOC$18 = 
        new javax.xml.namespace.QName("", "rtypeloc");
    private static final javax.xml.namespace.QName RTYPEWIDTH$20 = 
        new javax.xml.namespace.QName("", "rtypewidth");
    private static final javax.xml.namespace.QName RTYPEVTYPE$22 = 
        new javax.xml.namespace.QName("", "rtypevtype");
    private static final javax.xml.namespace.QName RECIDVAR$24 = 
        new javax.xml.namespace.QName("", "recidvar");
    
    
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
     * Gets the "recDimnsn" element
     */
    public edu.umich.icpsr.ddi.RecDimnsnType getRecDimnsn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecDimnsnType target = null;
            target = (edu.umich.icpsr.ddi.RecDimnsnType)get_store().find_element_user(RECDIMNSN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "recDimnsn" element
     */
    public boolean isSetRecDimnsn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECDIMNSN$2) != 0;
        }
    }
    
    /**
     * Sets the "recDimnsn" element
     */
    public void setRecDimnsn(edu.umich.icpsr.ddi.RecDimnsnType recDimnsn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecDimnsnType target = null;
            target = (edu.umich.icpsr.ddi.RecDimnsnType)get_store().find_element_user(RECDIMNSN$2, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RecDimnsnType)get_store().add_element_user(RECDIMNSN$2);
            }
            target.set(recDimnsn);
        }
    }
    
    /**
     * Appends and returns a new empty "recDimnsn" element
     */
    public edu.umich.icpsr.ddi.RecDimnsnType addNewRecDimnsn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecDimnsnType target = null;
            target = (edu.umich.icpsr.ddi.RecDimnsnType)get_store().add_element_user(RECDIMNSN$2);
            return target;
        }
    }
    
    /**
     * Unsets the "recDimnsn" element
     */
    public void unsetRecDimnsn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECDIMNSN$2, 0);
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
    public edu.umich.icpsr.ddi.RecGrpType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.RecGrpType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.RecGrpType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecGrpType.Source target = null;
            target = (edu.umich.icpsr.ddi.RecGrpType.Source)get_store().find_attribute_user(SOURCE$10);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RecGrpType.Source)get_default_attribute_value(SOURCE$10);
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
    public void setSource(edu.umich.icpsr.ddi.RecGrpType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.RecGrpType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecGrpType.Source target = null;
            target = (edu.umich.icpsr.ddi.RecGrpType.Source)get_store().find_attribute_user(SOURCE$10);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RecGrpType.Source)get_store().add_attribute_user(SOURCE$10);
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
     * Gets the "recGrp" attribute
     */
    public java.util.List getRecGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECGRP$12);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "recGrp" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetRecGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(RECGRP$12);
            return target;
        }
    }
    
    /**
     * True if has "recGrp" attribute
     */
    public boolean isSetRecGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RECGRP$12) != null;
        }
    }
    
    /**
     * Sets the "recGrp" attribute
     */
    public void setRecGrp(java.util.List recGrp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECGRP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECGRP$12);
            }
            target.setListValue(recGrp);
        }
    }
    
    /**
     * Sets (as xml) the "recGrp" attribute
     */
    public void xsetRecGrp(org.apache.xmlbeans.XmlIDREFS recGrp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(RECGRP$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(RECGRP$12);
            }
            target.set(recGrp);
        }
    }
    
    /**
     * Unsets the "recGrp" attribute
     */
    public void unsetRecGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RECGRP$12);
        }
    }
    
    /**
     * Gets the "rectype" attribute
     */
    public java.lang.String getRectype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECTYPE$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rectype" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRectype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RECTYPE$14);
            return target;
        }
    }
    
    /**
     * True if has "rectype" attribute
     */
    public boolean isSetRectype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RECTYPE$14) != null;
        }
    }
    
    /**
     * Sets the "rectype" attribute
     */
    public void setRectype(java.lang.String rectype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECTYPE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECTYPE$14);
            }
            target.setStringValue(rectype);
        }
    }
    
    /**
     * Sets (as xml) the "rectype" attribute
     */
    public void xsetRectype(org.apache.xmlbeans.XmlString rectype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RECTYPE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RECTYPE$14);
            }
            target.set(rectype);
        }
    }
    
    /**
     * Unsets the "rectype" attribute
     */
    public void unsetRectype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RECTYPE$14);
        }
    }
    
    /**
     * Gets the "keyvar" attribute
     */
    public java.util.List getKeyvar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYVAR$16);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "keyvar" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetKeyvar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(KEYVAR$16);
            return target;
        }
    }
    
    /**
     * True if has "keyvar" attribute
     */
    public boolean isSetKeyvar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(KEYVAR$16) != null;
        }
    }
    
    /**
     * Sets the "keyvar" attribute
     */
    public void setKeyvar(java.util.List keyvar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEYVAR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEYVAR$16);
            }
            target.setListValue(keyvar);
        }
    }
    
    /**
     * Sets (as xml) the "keyvar" attribute
     */
    public void xsetKeyvar(org.apache.xmlbeans.XmlIDREFS keyvar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(KEYVAR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(KEYVAR$16);
            }
            target.set(keyvar);
        }
    }
    
    /**
     * Unsets the "keyvar" attribute
     */
    public void unsetKeyvar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(KEYVAR$16);
        }
    }
    
    /**
     * Gets the "rtypeloc" attribute
     */
    public java.lang.String getRtypeloc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RTYPELOC$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rtypeloc" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRtypeloc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RTYPELOC$18);
            return target;
        }
    }
    
    /**
     * True if has "rtypeloc" attribute
     */
    public boolean isSetRtypeloc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RTYPELOC$18) != null;
        }
    }
    
    /**
     * Sets the "rtypeloc" attribute
     */
    public void setRtypeloc(java.lang.String rtypeloc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RTYPELOC$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RTYPELOC$18);
            }
            target.setStringValue(rtypeloc);
        }
    }
    
    /**
     * Sets (as xml) the "rtypeloc" attribute
     */
    public void xsetRtypeloc(org.apache.xmlbeans.XmlString rtypeloc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RTYPELOC$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RTYPELOC$18);
            }
            target.set(rtypeloc);
        }
    }
    
    /**
     * Unsets the "rtypeloc" attribute
     */
    public void unsetRtypeloc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RTYPELOC$18);
        }
    }
    
    /**
     * Gets the "rtypewidth" attribute
     */
    public java.lang.String getRtypewidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RTYPEWIDTH$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RTYPEWIDTH$20);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rtypewidth" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRtypewidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RTYPEWIDTH$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(RTYPEWIDTH$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "rtypewidth" attribute
     */
    public boolean isSetRtypewidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RTYPEWIDTH$20) != null;
        }
    }
    
    /**
     * Sets the "rtypewidth" attribute
     */
    public void setRtypewidth(java.lang.String rtypewidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RTYPEWIDTH$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RTYPEWIDTH$20);
            }
            target.setStringValue(rtypewidth);
        }
    }
    
    /**
     * Sets (as xml) the "rtypewidth" attribute
     */
    public void xsetRtypewidth(org.apache.xmlbeans.XmlString rtypewidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RTYPEWIDTH$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RTYPEWIDTH$20);
            }
            target.set(rtypewidth);
        }
    }
    
    /**
     * Unsets the "rtypewidth" attribute
     */
    public void unsetRtypewidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RTYPEWIDTH$20);
        }
    }
    
    /**
     * Gets the "rtypevtype" attribute
     */
    public edu.umich.icpsr.ddi.RecGrpType.Rtypevtype.Enum getRtypevtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RTYPEVTYPE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(RTYPEVTYPE$22);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.RecGrpType.Rtypevtype.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "rtypevtype" attribute
     */
    public edu.umich.icpsr.ddi.RecGrpType.Rtypevtype xgetRtypevtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecGrpType.Rtypevtype target = null;
            target = (edu.umich.icpsr.ddi.RecGrpType.Rtypevtype)get_store().find_attribute_user(RTYPEVTYPE$22);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RecGrpType.Rtypevtype)get_default_attribute_value(RTYPEVTYPE$22);
            }
            return target;
        }
    }
    
    /**
     * True if has "rtypevtype" attribute
     */
    public boolean isSetRtypevtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RTYPEVTYPE$22) != null;
        }
    }
    
    /**
     * Sets the "rtypevtype" attribute
     */
    public void setRtypevtype(edu.umich.icpsr.ddi.RecGrpType.Rtypevtype.Enum rtypevtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RTYPEVTYPE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RTYPEVTYPE$22);
            }
            target.setEnumValue(rtypevtype);
        }
    }
    
    /**
     * Sets (as xml) the "rtypevtype" attribute
     */
    public void xsetRtypevtype(edu.umich.icpsr.ddi.RecGrpType.Rtypevtype rtypevtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecGrpType.Rtypevtype target = null;
            target = (edu.umich.icpsr.ddi.RecGrpType.Rtypevtype)get_store().find_attribute_user(RTYPEVTYPE$22);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RecGrpType.Rtypevtype)get_store().add_attribute_user(RTYPEVTYPE$22);
            }
            target.set(rtypevtype);
        }
    }
    
    /**
     * Unsets the "rtypevtype" attribute
     */
    public void unsetRtypevtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RTYPEVTYPE$22);
        }
    }
    
    /**
     * Gets the "recidvar" attribute
     */
    public java.lang.String getRecidvar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECIDVAR$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "recidvar" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRecidvar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RECIDVAR$24);
            return target;
        }
    }
    
    /**
     * True if has "recidvar" attribute
     */
    public boolean isSetRecidvar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RECIDVAR$24) != null;
        }
    }
    
    /**
     * Sets the "recidvar" attribute
     */
    public void setRecidvar(java.lang.String recidvar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECIDVAR$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECIDVAR$24);
            }
            target.setStringValue(recidvar);
        }
    }
    
    /**
     * Sets (as xml) the "recidvar" attribute
     */
    public void xsetRecidvar(org.apache.xmlbeans.XmlString recidvar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RECIDVAR$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RECIDVAR$24);
            }
            target.set(recidvar);
        }
    }
    
    /**
     * Unsets the "recidvar" attribute
     */
    public void unsetRecidvar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RECIDVAR$24);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.RecGrpType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.RecGrpType.Source
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
     * An XML rtypevtype(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.RecGrpType$Rtypevtype.
     */
    public static class RtypevtypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.RecGrpType.Rtypevtype
    {
        private static final long serialVersionUID = 1L;
        
        public RtypevtypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected RtypevtypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
