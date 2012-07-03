/*
 * XML Type:  methodType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.MethodType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML methodType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class MethodTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.MethodType
{
    private static final long serialVersionUID = 1L;
    
    public MethodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATACOLL$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "dataColl");
    private static final javax.xml.namespace.QName NOTES$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "notes");
    private static final javax.xml.namespace.QName ANLYINFO$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "anlyInfo");
    private static final javax.xml.namespace.QName STDYCLAS$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "stdyClas");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$10 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$14 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets array of all "dataColl" elements
     */
    public edu.umich.icpsr.ddi.DataCollType[] getDataCollArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATACOLL$0, targetList);
            edu.umich.icpsr.ddi.DataCollType[] result = new edu.umich.icpsr.ddi.DataCollType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataColl" element
     */
    public edu.umich.icpsr.ddi.DataCollType getDataCollArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataCollType target = null;
            target = (edu.umich.icpsr.ddi.DataCollType)get_store().find_element_user(DATACOLL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataColl" element
     */
    public int sizeOfDataCollArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACOLL$0);
        }
    }
    
    /**
     * Sets array of all "dataColl" element
     */
    public void setDataCollArray(edu.umich.icpsr.ddi.DataCollType[] dataCollArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataCollArray, DATACOLL$0);
        }
    }
    
    /**
     * Sets ith "dataColl" element
     */
    public void setDataCollArray(int i, edu.umich.icpsr.ddi.DataCollType dataColl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataCollType target = null;
            target = (edu.umich.icpsr.ddi.DataCollType)get_store().find_element_user(DATACOLL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataColl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataColl" element
     */
    public edu.umich.icpsr.ddi.DataCollType insertNewDataColl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataCollType target = null;
            target = (edu.umich.icpsr.ddi.DataCollType)get_store().insert_element_user(DATACOLL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataColl" element
     */
    public edu.umich.icpsr.ddi.DataCollType addNewDataColl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataCollType target = null;
            target = (edu.umich.icpsr.ddi.DataCollType)get_store().add_element_user(DATACOLL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataColl" element
     */
    public void removeDataColl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACOLL$0, i);
        }
    }
    
    /**
     * Gets array of all "notes" elements
     */
    public edu.umich.icpsr.ddi.NotesType[] getNotesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NOTES$2, targetList);
            edu.umich.icpsr.ddi.NotesType[] result = new edu.umich.icpsr.ddi.NotesType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "notes" element
     */
    public edu.umich.icpsr.ddi.NotesType getNotesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NotesType target = null;
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "notes" element
     */
    public int sizeOfNotesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTES$2);
        }
    }
    
    /**
     * Sets array of all "notes" element
     */
    public void setNotesArray(edu.umich.icpsr.ddi.NotesType[] notesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(notesArray, NOTES$2);
        }
    }
    
    /**
     * Sets ith "notes" element
     */
    public void setNotesArray(int i, edu.umich.icpsr.ddi.NotesType notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NotesType target = null;
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(notes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "notes" element
     */
    public edu.umich.icpsr.ddi.NotesType insertNewNotes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NotesType target = null;
            target = (edu.umich.icpsr.ddi.NotesType)get_store().insert_element_user(NOTES$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "notes" element
     */
    public edu.umich.icpsr.ddi.NotesType addNewNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NotesType target = null;
            target = (edu.umich.icpsr.ddi.NotesType)get_store().add_element_user(NOTES$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "notes" element
     */
    public void removeNotes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTES$2, i);
        }
    }
    
    /**
     * Gets the "anlyInfo" element
     */
    public edu.umich.icpsr.ddi.AnlyInfoType getAnlyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AnlyInfoType target = null;
            target = (edu.umich.icpsr.ddi.AnlyInfoType)get_store().find_element_user(ANLYINFO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "anlyInfo" element
     */
    public boolean isSetAnlyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANLYINFO$4) != 0;
        }
    }
    
    /**
     * Sets the "anlyInfo" element
     */
    public void setAnlyInfo(edu.umich.icpsr.ddi.AnlyInfoType anlyInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AnlyInfoType target = null;
            target = (edu.umich.icpsr.ddi.AnlyInfoType)get_store().find_element_user(ANLYINFO$4, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.AnlyInfoType)get_store().add_element_user(ANLYINFO$4);
            }
            target.set(anlyInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "anlyInfo" element
     */
    public edu.umich.icpsr.ddi.AnlyInfoType addNewAnlyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AnlyInfoType target = null;
            target = (edu.umich.icpsr.ddi.AnlyInfoType)get_store().add_element_user(ANLYINFO$4);
            return target;
        }
    }
    
    /**
     * Unsets the "anlyInfo" element
     */
    public void unsetAnlyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANLYINFO$4, 0);
        }
    }
    
    /**
     * Gets the "stdyClas" element
     */
    public edu.umich.icpsr.ddi.StdyClasType getStdyClas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.StdyClasType target = null;
            target = (edu.umich.icpsr.ddi.StdyClasType)get_store().find_element_user(STDYCLAS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "stdyClas" element
     */
    public boolean isSetStdyClas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDYCLAS$6) != 0;
        }
    }
    
    /**
     * Sets the "stdyClas" element
     */
    public void setStdyClas(edu.umich.icpsr.ddi.StdyClasType stdyClas)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.StdyClasType target = null;
            target = (edu.umich.icpsr.ddi.StdyClasType)get_store().find_element_user(STDYCLAS$6, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.StdyClasType)get_store().add_element_user(STDYCLAS$6);
            }
            target.set(stdyClas);
        }
    }
    
    /**
     * Appends and returns a new empty "stdyClas" element
     */
    public edu.umich.icpsr.ddi.StdyClasType addNewStdyClas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.StdyClasType target = null;
            target = (edu.umich.icpsr.ddi.StdyClasType)get_store().add_element_user(STDYCLAS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "stdyClas" element
     */
    public void unsetStdyClas()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDYCLAS$6, 0);
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
    public edu.umich.icpsr.ddi.MethodType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.MethodType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.MethodType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MethodType.Source target = null;
            target = (edu.umich.icpsr.ddi.MethodType.Source)get_store().find_attribute_user(SOURCE$14);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.MethodType.Source)get_default_attribute_value(SOURCE$14);
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
    public void setSource(edu.umich.icpsr.ddi.MethodType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.MethodType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MethodType.Source target = null;
            target = (edu.umich.icpsr.ddi.MethodType.Source)get_store().find_attribute_user(SOURCE$14);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.MethodType.Source)get_store().add_attribute_user(SOURCE$14);
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
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.MethodType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.MethodType.Source
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
