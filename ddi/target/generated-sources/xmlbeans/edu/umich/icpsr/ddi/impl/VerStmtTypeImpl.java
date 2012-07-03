/*
 * XML Type:  verStmtType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.VerStmtType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML verStmtType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class VerStmtTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.VerStmtType
{
    private static final long serialVersionUID = 1L;
    
    public VerStmtTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSION$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "version");
    private static final javax.xml.namespace.QName VERRESP$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "verResp");
    private static final javax.xml.namespace.QName NOTES$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "notes");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$8 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$12 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets the "version" element
     */
    public edu.umich.icpsr.ddi.VersionType getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VersionType target = null;
            target = (edu.umich.icpsr.ddi.VersionType)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "version" element
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSION$0) != 0;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(edu.umich.icpsr.ddi.VersionType version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VersionType target = null;
            target = (edu.umich.icpsr.ddi.VersionType)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VersionType)get_store().add_element_user(VERSION$0);
            }
            target.set(version);
        }
    }
    
    /**
     * Appends and returns a new empty "version" element
     */
    public edu.umich.icpsr.ddi.VersionType addNewVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VersionType target = null;
            target = (edu.umich.icpsr.ddi.VersionType)get_store().add_element_user(VERSION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "version" element
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSION$0, 0);
        }
    }
    
    /**
     * Gets the "verResp" element
     */
    public edu.umich.icpsr.ddi.VerRespType getVerResp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerRespType target = null;
            target = (edu.umich.icpsr.ddi.VerRespType)get_store().find_element_user(VERRESP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "verResp" element
     */
    public boolean isSetVerResp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERRESP$2) != 0;
        }
    }
    
    /**
     * Sets the "verResp" element
     */
    public void setVerResp(edu.umich.icpsr.ddi.VerRespType verResp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerRespType target = null;
            target = (edu.umich.icpsr.ddi.VerRespType)get_store().find_element_user(VERRESP$2, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VerRespType)get_store().add_element_user(VERRESP$2);
            }
            target.set(verResp);
        }
    }
    
    /**
     * Appends and returns a new empty "verResp" element
     */
    public edu.umich.icpsr.ddi.VerRespType addNewVerResp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerRespType target = null;
            target = (edu.umich.icpsr.ddi.VerRespType)get_store().add_element_user(VERRESP$2);
            return target;
        }
    }
    
    /**
     * Unsets the "verResp" element
     */
    public void unsetVerResp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERRESP$2, 0);
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
            get_store().find_all_element_users(NOTES$4, targetList);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$4, i);
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
            return get_store().count_elements(NOTES$4);
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
            arraySetterHelper(notesArray, NOTES$4);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$4, i);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().insert_element_user(NOTES$4, i);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().add_element_user(NOTES$4);
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
            get_store().remove_element(NOTES$4, i);
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
    public edu.umich.icpsr.ddi.VerStmtType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.VerStmtType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.VerStmtType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerStmtType.Source target = null;
            target = (edu.umich.icpsr.ddi.VerStmtType.Source)get_store().find_attribute_user(SOURCE$12);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VerStmtType.Source)get_default_attribute_value(SOURCE$12);
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
    public void setSource(edu.umich.icpsr.ddi.VerStmtType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.VerStmtType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerStmtType.Source target = null;
            target = (edu.umich.icpsr.ddi.VerStmtType.Source)get_store().find_attribute_user(SOURCE$12);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VerStmtType.Source)get_store().add_attribute_user(SOURCE$12);
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
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VerStmtType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.VerStmtType.Source
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
