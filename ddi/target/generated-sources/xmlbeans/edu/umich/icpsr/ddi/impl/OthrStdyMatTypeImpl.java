/*
 * XML Type:  othrStdyMatType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.OthrStdyMatType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML othrStdyMatType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class OthrStdyMatTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.OthrStdyMatType
{
    private static final long serialVersionUID = 1L;
    
    public OthrStdyMatTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELMAT$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "relMat");
    private static final javax.xml.namespace.QName RELSTDY$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "relStdy");
    private static final javax.xml.namespace.QName RELPUBL$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "relPubl");
    private static final javax.xml.namespace.QName OTHREFS$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "othRefs");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$10 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$14 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets array of all "relMat" elements
     */
    public edu.umich.icpsr.ddi.RelMatType[] getRelMatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELMAT$0, targetList);
            edu.umich.icpsr.ddi.RelMatType[] result = new edu.umich.icpsr.ddi.RelMatType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relMat" element
     */
    public edu.umich.icpsr.ddi.RelMatType getRelMatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RelMatType target = null;
            target = (edu.umich.icpsr.ddi.RelMatType)get_store().find_element_user(RELMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relMat" element
     */
    public int sizeOfRelMatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELMAT$0);
        }
    }
    
    /**
     * Sets array of all "relMat" element
     */
    public void setRelMatArray(edu.umich.icpsr.ddi.RelMatType[] relMatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relMatArray, RELMAT$0);
        }
    }
    
    /**
     * Sets ith "relMat" element
     */
    public void setRelMatArray(int i, edu.umich.icpsr.ddi.RelMatType relMat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RelMatType target = null;
            target = (edu.umich.icpsr.ddi.RelMatType)get_store().find_element_user(RELMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relMat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relMat" element
     */
    public edu.umich.icpsr.ddi.RelMatType insertNewRelMat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RelMatType target = null;
            target = (edu.umich.icpsr.ddi.RelMatType)get_store().insert_element_user(RELMAT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relMat" element
     */
    public edu.umich.icpsr.ddi.RelMatType addNewRelMat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RelMatType target = null;
            target = (edu.umich.icpsr.ddi.RelMatType)get_store().add_element_user(RELMAT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "relMat" element
     */
    public void removeRelMat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELMAT$0, i);
        }
    }
    
    /**
     * Gets array of all "relStdy" elements
     */
    public edu.umich.icpsr.ddi.RelStdyType[] getRelStdyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELSTDY$2, targetList);
            edu.umich.icpsr.ddi.RelStdyType[] result = new edu.umich.icpsr.ddi.RelStdyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relStdy" element
     */
    public edu.umich.icpsr.ddi.RelStdyType getRelStdyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RelStdyType target = null;
            target = (edu.umich.icpsr.ddi.RelStdyType)get_store().find_element_user(RELSTDY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relStdy" element
     */
    public int sizeOfRelStdyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELSTDY$2);
        }
    }
    
    /**
     * Sets array of all "relStdy" element
     */
    public void setRelStdyArray(edu.umich.icpsr.ddi.RelStdyType[] relStdyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relStdyArray, RELSTDY$2);
        }
    }
    
    /**
     * Sets ith "relStdy" element
     */
    public void setRelStdyArray(int i, edu.umich.icpsr.ddi.RelStdyType relStdy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RelStdyType target = null;
            target = (edu.umich.icpsr.ddi.RelStdyType)get_store().find_element_user(RELSTDY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relStdy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relStdy" element
     */
    public edu.umich.icpsr.ddi.RelStdyType insertNewRelStdy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RelStdyType target = null;
            target = (edu.umich.icpsr.ddi.RelStdyType)get_store().insert_element_user(RELSTDY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relStdy" element
     */
    public edu.umich.icpsr.ddi.RelStdyType addNewRelStdy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RelStdyType target = null;
            target = (edu.umich.icpsr.ddi.RelStdyType)get_store().add_element_user(RELSTDY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "relStdy" element
     */
    public void removeRelStdy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELSTDY$2, i);
        }
    }
    
    /**
     * Gets array of all "relPubl" elements
     */
    public edu.umich.icpsr.ddi.RelPublType[] getRelPublArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELPUBL$4, targetList);
            edu.umich.icpsr.ddi.RelPublType[] result = new edu.umich.icpsr.ddi.RelPublType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relPubl" element
     */
    public edu.umich.icpsr.ddi.RelPublType getRelPublArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RelPublType target = null;
            target = (edu.umich.icpsr.ddi.RelPublType)get_store().find_element_user(RELPUBL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relPubl" element
     */
    public int sizeOfRelPublArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELPUBL$4);
        }
    }
    
    /**
     * Sets array of all "relPubl" element
     */
    public void setRelPublArray(edu.umich.icpsr.ddi.RelPublType[] relPublArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relPublArray, RELPUBL$4);
        }
    }
    
    /**
     * Sets ith "relPubl" element
     */
    public void setRelPublArray(int i, edu.umich.icpsr.ddi.RelPublType relPubl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RelPublType target = null;
            target = (edu.umich.icpsr.ddi.RelPublType)get_store().find_element_user(RELPUBL$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relPubl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relPubl" element
     */
    public edu.umich.icpsr.ddi.RelPublType insertNewRelPubl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RelPublType target = null;
            target = (edu.umich.icpsr.ddi.RelPublType)get_store().insert_element_user(RELPUBL$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relPubl" element
     */
    public edu.umich.icpsr.ddi.RelPublType addNewRelPubl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RelPublType target = null;
            target = (edu.umich.icpsr.ddi.RelPublType)get_store().add_element_user(RELPUBL$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "relPubl" element
     */
    public void removeRelPubl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELPUBL$4, i);
        }
    }
    
    /**
     * Gets array of all "othRefs" elements
     */
    public edu.umich.icpsr.ddi.OthRefsType[] getOthRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OTHREFS$6, targetList);
            edu.umich.icpsr.ddi.OthRefsType[] result = new edu.umich.icpsr.ddi.OthRefsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "othRefs" element
     */
    public edu.umich.icpsr.ddi.OthRefsType getOthRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OthRefsType target = null;
            target = (edu.umich.icpsr.ddi.OthRefsType)get_store().find_element_user(OTHREFS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "othRefs" element
     */
    public int sizeOfOthRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHREFS$6);
        }
    }
    
    /**
     * Sets array of all "othRefs" element
     */
    public void setOthRefsArray(edu.umich.icpsr.ddi.OthRefsType[] othRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(othRefsArray, OTHREFS$6);
        }
    }
    
    /**
     * Sets ith "othRefs" element
     */
    public void setOthRefsArray(int i, edu.umich.icpsr.ddi.OthRefsType othRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OthRefsType target = null;
            target = (edu.umich.icpsr.ddi.OthRefsType)get_store().find_element_user(OTHREFS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(othRefs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "othRefs" element
     */
    public edu.umich.icpsr.ddi.OthRefsType insertNewOthRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OthRefsType target = null;
            target = (edu.umich.icpsr.ddi.OthRefsType)get_store().insert_element_user(OTHREFS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "othRefs" element
     */
    public edu.umich.icpsr.ddi.OthRefsType addNewOthRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OthRefsType target = null;
            target = (edu.umich.icpsr.ddi.OthRefsType)get_store().add_element_user(OTHREFS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "othRefs" element
     */
    public void removeOthRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHREFS$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
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
            return get_store().find_attribute_user(ID$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$8);
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
            get_store().remove_attribute(ID$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$10);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$10);
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
            return get_store().find_attribute_user(XMLLANG$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$10);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$10);
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
            get_store().remove_attribute(XMLLANG$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$12);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$12);
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
            return get_store().find_attribute_user(LANG$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$12);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$12);
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
            get_store().remove_attribute(LANG$12);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.OthrStdyMatType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$14);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.OthrStdyMatType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.OthrStdyMatType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OthrStdyMatType.Source target = null;
            target = (edu.umich.icpsr.ddi.OthrStdyMatType.Source)get_store().find_attribute_user(SOURCE$14);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.OthrStdyMatType.Source)get_default_attribute_value(SOURCE$14);
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
            return get_store().find_attribute_user(SOURCE$14) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.OthrStdyMatType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$14);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.OthrStdyMatType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OthrStdyMatType.Source target = null;
            target = (edu.umich.icpsr.ddi.OthrStdyMatType.Source)get_store().find_attribute_user(SOURCE$14);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.OthrStdyMatType.Source)get_store().add_attribute_user(SOURCE$14);
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
            get_store().remove_attribute(SOURCE$14);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.OthrStdyMatType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.OthrStdyMatType.Source
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
