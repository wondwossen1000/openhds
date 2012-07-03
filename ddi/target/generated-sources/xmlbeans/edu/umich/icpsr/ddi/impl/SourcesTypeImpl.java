/*
 * XML Type:  sourcesType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.SourcesType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML sourcesType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class SourcesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.SourcesType
{
    private static final long serialVersionUID = 1L;
    
    public SourcesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASRC$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "dataSrc");
    private static final javax.xml.namespace.QName SRCORIG$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "srcOrig");
    private static final javax.xml.namespace.QName SRCCHAR$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "srcChar");
    private static final javax.xml.namespace.QName SRCDOCU$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "srcDocu");
    private static final javax.xml.namespace.QName SOURCES$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "sources");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$12 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$16 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets array of all "dataSrc" elements
     */
    public edu.umich.icpsr.ddi.DataSrcType[] getDataSrcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATASRC$0, targetList);
            edu.umich.icpsr.ddi.DataSrcType[] result = new edu.umich.icpsr.ddi.DataSrcType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataSrc" element
     */
    public edu.umich.icpsr.ddi.DataSrcType getDataSrcArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataSrcType target = null;
            target = (edu.umich.icpsr.ddi.DataSrcType)get_store().find_element_user(DATASRC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataSrc" element
     */
    public int sizeOfDataSrcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASRC$0);
        }
    }
    
    /**
     * Sets array of all "dataSrc" element
     */
    public void setDataSrcArray(edu.umich.icpsr.ddi.DataSrcType[] dataSrcArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataSrcArray, DATASRC$0);
        }
    }
    
    /**
     * Sets ith "dataSrc" element
     */
    public void setDataSrcArray(int i, edu.umich.icpsr.ddi.DataSrcType dataSrc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataSrcType target = null;
            target = (edu.umich.icpsr.ddi.DataSrcType)get_store().find_element_user(DATASRC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataSrc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataSrc" element
     */
    public edu.umich.icpsr.ddi.DataSrcType insertNewDataSrc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataSrcType target = null;
            target = (edu.umich.icpsr.ddi.DataSrcType)get_store().insert_element_user(DATASRC$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataSrc" element
     */
    public edu.umich.icpsr.ddi.DataSrcType addNewDataSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataSrcType target = null;
            target = (edu.umich.icpsr.ddi.DataSrcType)get_store().add_element_user(DATASRC$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataSrc" element
     */
    public void removeDataSrc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASRC$0, i);
        }
    }
    
    /**
     * Gets array of all "srcOrig" elements
     */
    public edu.umich.icpsr.ddi.SrcOrigType[] getSrcOrigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SRCORIG$2, targetList);
            edu.umich.icpsr.ddi.SrcOrigType[] result = new edu.umich.icpsr.ddi.SrcOrigType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "srcOrig" element
     */
    public edu.umich.icpsr.ddi.SrcOrigType getSrcOrigArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SrcOrigType target = null;
            target = (edu.umich.icpsr.ddi.SrcOrigType)get_store().find_element_user(SRCORIG$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "srcOrig" element
     */
    public int sizeOfSrcOrigArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SRCORIG$2);
        }
    }
    
    /**
     * Sets array of all "srcOrig" element
     */
    public void setSrcOrigArray(edu.umich.icpsr.ddi.SrcOrigType[] srcOrigArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(srcOrigArray, SRCORIG$2);
        }
    }
    
    /**
     * Sets ith "srcOrig" element
     */
    public void setSrcOrigArray(int i, edu.umich.icpsr.ddi.SrcOrigType srcOrig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SrcOrigType target = null;
            target = (edu.umich.icpsr.ddi.SrcOrigType)get_store().find_element_user(SRCORIG$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(srcOrig);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "srcOrig" element
     */
    public edu.umich.icpsr.ddi.SrcOrigType insertNewSrcOrig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SrcOrigType target = null;
            target = (edu.umich.icpsr.ddi.SrcOrigType)get_store().insert_element_user(SRCORIG$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "srcOrig" element
     */
    public edu.umich.icpsr.ddi.SrcOrigType addNewSrcOrig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SrcOrigType target = null;
            target = (edu.umich.icpsr.ddi.SrcOrigType)get_store().add_element_user(SRCORIG$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "srcOrig" element
     */
    public void removeSrcOrig(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SRCORIG$2, i);
        }
    }
    
    /**
     * Gets array of all "srcChar" elements
     */
    public edu.umich.icpsr.ddi.SrcCharType[] getSrcCharArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SRCCHAR$4, targetList);
            edu.umich.icpsr.ddi.SrcCharType[] result = new edu.umich.icpsr.ddi.SrcCharType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "srcChar" element
     */
    public edu.umich.icpsr.ddi.SrcCharType getSrcCharArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SrcCharType target = null;
            target = (edu.umich.icpsr.ddi.SrcCharType)get_store().find_element_user(SRCCHAR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "srcChar" element
     */
    public int sizeOfSrcCharArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SRCCHAR$4);
        }
    }
    
    /**
     * Sets array of all "srcChar" element
     */
    public void setSrcCharArray(edu.umich.icpsr.ddi.SrcCharType[] srcCharArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(srcCharArray, SRCCHAR$4);
        }
    }
    
    /**
     * Sets ith "srcChar" element
     */
    public void setSrcCharArray(int i, edu.umich.icpsr.ddi.SrcCharType srcChar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SrcCharType target = null;
            target = (edu.umich.icpsr.ddi.SrcCharType)get_store().find_element_user(SRCCHAR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(srcChar);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "srcChar" element
     */
    public edu.umich.icpsr.ddi.SrcCharType insertNewSrcChar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SrcCharType target = null;
            target = (edu.umich.icpsr.ddi.SrcCharType)get_store().insert_element_user(SRCCHAR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "srcChar" element
     */
    public edu.umich.icpsr.ddi.SrcCharType addNewSrcChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SrcCharType target = null;
            target = (edu.umich.icpsr.ddi.SrcCharType)get_store().add_element_user(SRCCHAR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "srcChar" element
     */
    public void removeSrcChar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SRCCHAR$4, i);
        }
    }
    
    /**
     * Gets array of all "srcDocu" elements
     */
    public edu.umich.icpsr.ddi.SrcDocuType[] getSrcDocuArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SRCDOCU$6, targetList);
            edu.umich.icpsr.ddi.SrcDocuType[] result = new edu.umich.icpsr.ddi.SrcDocuType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "srcDocu" element
     */
    public edu.umich.icpsr.ddi.SrcDocuType getSrcDocuArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SrcDocuType target = null;
            target = (edu.umich.icpsr.ddi.SrcDocuType)get_store().find_element_user(SRCDOCU$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "srcDocu" element
     */
    public int sizeOfSrcDocuArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SRCDOCU$6);
        }
    }
    
    /**
     * Sets array of all "srcDocu" element
     */
    public void setSrcDocuArray(edu.umich.icpsr.ddi.SrcDocuType[] srcDocuArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(srcDocuArray, SRCDOCU$6);
        }
    }
    
    /**
     * Sets ith "srcDocu" element
     */
    public void setSrcDocuArray(int i, edu.umich.icpsr.ddi.SrcDocuType srcDocu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SrcDocuType target = null;
            target = (edu.umich.icpsr.ddi.SrcDocuType)get_store().find_element_user(SRCDOCU$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(srcDocu);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "srcDocu" element
     */
    public edu.umich.icpsr.ddi.SrcDocuType insertNewSrcDocu(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SrcDocuType target = null;
            target = (edu.umich.icpsr.ddi.SrcDocuType)get_store().insert_element_user(SRCDOCU$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "srcDocu" element
     */
    public edu.umich.icpsr.ddi.SrcDocuType addNewSrcDocu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SrcDocuType target = null;
            target = (edu.umich.icpsr.ddi.SrcDocuType)get_store().add_element_user(SRCDOCU$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "srcDocu" element
     */
    public void removeSrcDocu(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SRCDOCU$6, i);
        }
    }
    
    /**
     * Gets array of all "sources" elements
     */
    public edu.umich.icpsr.ddi.SourcesType[] getSourcesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCES$8, targetList);
            edu.umich.icpsr.ddi.SourcesType[] result = new edu.umich.icpsr.ddi.SourcesType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sources" element
     */
    public edu.umich.icpsr.ddi.SourcesType getSourcesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SourcesType target = null;
            target = (edu.umich.icpsr.ddi.SourcesType)get_store().find_element_user(SOURCES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sources" element
     */
    public int sizeOfSourcesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCES$8);
        }
    }
    
    /**
     * Sets array of all "sources" element
     */
    public void setSourcesArray(edu.umich.icpsr.ddi.SourcesType[] sourcesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sourcesArray, SOURCES$8);
        }
    }
    
    /**
     * Sets ith "sources" element
     */
    public void setSourcesArray(int i, edu.umich.icpsr.ddi.SourcesType sources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SourcesType target = null;
            target = (edu.umich.icpsr.ddi.SourcesType)get_store().find_element_user(SOURCES$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sources);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sources" element
     */
    public edu.umich.icpsr.ddi.SourcesType insertNewSources(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SourcesType target = null;
            target = (edu.umich.icpsr.ddi.SourcesType)get_store().insert_element_user(SOURCES$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sources" element
     */
    public edu.umich.icpsr.ddi.SourcesType addNewSources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SourcesType target = null;
            target = (edu.umich.icpsr.ddi.SourcesType)get_store().add_element_user(SOURCES$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "sources" element
     */
    public void removeSources(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCES$8, i);
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
    public edu.umich.icpsr.ddi.SourcesType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.SourcesType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.SourcesType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SourcesType.Source target = null;
            target = (edu.umich.icpsr.ddi.SourcesType.Source)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SourcesType.Source)get_default_attribute_value(SOURCE$16);
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
    public void setSource(edu.umich.icpsr.ddi.SourcesType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.SourcesType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SourcesType.Source target = null;
            target = (edu.umich.icpsr.ddi.SourcesType.Source)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SourcesType.Source)get_store().add_attribute_user(SOURCE$16);
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
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.SourcesType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.SourcesType.Source
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
