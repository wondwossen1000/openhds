/*
 * XML Type:  fileDscrType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.FileDscrType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML fileDscrType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class FileDscrTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.FileDscrType
{
    private static final long serialVersionUID = 1L;
    
    public FileDscrTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILETXT$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "fileTxt");
    private static final javax.xml.namespace.QName LOCMAP$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "locMap");
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
    private static final javax.xml.namespace.QName URI$14 = 
        new javax.xml.namespace.QName("", "URI");
    private static final javax.xml.namespace.QName SDATREFS$16 = 
        new javax.xml.namespace.QName("", "sdatrefs");
    private static final javax.xml.namespace.QName METHREFS$18 = 
        new javax.xml.namespace.QName("", "methrefs");
    private static final javax.xml.namespace.QName PUBREFS$20 = 
        new javax.xml.namespace.QName("", "pubrefs");
    private static final javax.xml.namespace.QName ACCESS$22 = 
        new javax.xml.namespace.QName("", "access");
    
    
    /**
     * Gets array of all "fileTxt" elements
     */
    public edu.umich.icpsr.ddi.FileTxtType[] getFileTxtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FILETXT$0, targetList);
            edu.umich.icpsr.ddi.FileTxtType[] result = new edu.umich.icpsr.ddi.FileTxtType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fileTxt" element
     */
    public edu.umich.icpsr.ddi.FileTxtType getFileTxtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileTxtType target = null;
            target = (edu.umich.icpsr.ddi.FileTxtType)get_store().find_element_user(FILETXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fileTxt" element
     */
    public int sizeOfFileTxtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILETXT$0);
        }
    }
    
    /**
     * Sets array of all "fileTxt" element
     */
    public void setFileTxtArray(edu.umich.icpsr.ddi.FileTxtType[] fileTxtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fileTxtArray, FILETXT$0);
        }
    }
    
    /**
     * Sets ith "fileTxt" element
     */
    public void setFileTxtArray(int i, edu.umich.icpsr.ddi.FileTxtType fileTxt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileTxtType target = null;
            target = (edu.umich.icpsr.ddi.FileTxtType)get_store().find_element_user(FILETXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fileTxt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fileTxt" element
     */
    public edu.umich.icpsr.ddi.FileTxtType insertNewFileTxt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileTxtType target = null;
            target = (edu.umich.icpsr.ddi.FileTxtType)get_store().insert_element_user(FILETXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fileTxt" element
     */
    public edu.umich.icpsr.ddi.FileTxtType addNewFileTxt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileTxtType target = null;
            target = (edu.umich.icpsr.ddi.FileTxtType)get_store().add_element_user(FILETXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "fileTxt" element
     */
    public void removeFileTxt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILETXT$0, i);
        }
    }
    
    /**
     * Gets the "locMap" element
     */
    public edu.umich.icpsr.ddi.LocMapType getLocMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LocMapType target = null;
            target = (edu.umich.icpsr.ddi.LocMapType)get_store().find_element_user(LOCMAP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "locMap" element
     */
    public boolean isSetLocMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCMAP$2) != 0;
        }
    }
    
    /**
     * Sets the "locMap" element
     */
    public void setLocMap(edu.umich.icpsr.ddi.LocMapType locMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LocMapType target = null;
            target = (edu.umich.icpsr.ddi.LocMapType)get_store().find_element_user(LOCMAP$2, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.LocMapType)get_store().add_element_user(LOCMAP$2);
            }
            target.set(locMap);
        }
    }
    
    /**
     * Appends and returns a new empty "locMap" element
     */
    public edu.umich.icpsr.ddi.LocMapType addNewLocMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LocMapType target = null;
            target = (edu.umich.icpsr.ddi.LocMapType)get_store().add_element_user(LOCMAP$2);
            return target;
        }
    }
    
    /**
     * Unsets the "locMap" element
     */
    public void unsetLocMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCMAP$2, 0);
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
    public edu.umich.icpsr.ddi.FileDscrType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.FileDscrType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.FileDscrType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileDscrType.Source target = null;
            target = (edu.umich.icpsr.ddi.FileDscrType.Source)get_store().find_attribute_user(SOURCE$12);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FileDscrType.Source)get_default_attribute_value(SOURCE$12);
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
    public void setSource(edu.umich.icpsr.ddi.FileDscrType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.FileDscrType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileDscrType.Source target = null;
            target = (edu.umich.icpsr.ddi.FileDscrType.Source)get_store().find_attribute_user(SOURCE$12);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FileDscrType.Source)get_store().add_attribute_user(SOURCE$12);
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
     * Gets the "URI" attribute
     */
    public java.lang.String getURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URI" attribute
     */
    public org.apache.xmlbeans.XmlString xgetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URI$14);
            return target;
        }
    }
    
    /**
     * True if has "URI" attribute
     */
    public boolean isSetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(URI$14) != null;
        }
    }
    
    /**
     * Sets the "URI" attribute
     */
    public void setURI(java.lang.String uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$14);
            }
            target.setStringValue(uri);
        }
    }
    
    /**
     * Sets (as xml) the "URI" attribute
     */
    public void xsetURI(org.apache.xmlbeans.XmlString uri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URI$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(URI$14);
            }
            target.set(uri);
        }
    }
    
    /**
     * Unsets the "URI" attribute
     */
    public void unsetURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(URI$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SDATREFS$16);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(SDATREFS$16);
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
            return get_store().find_attribute_user(SDATREFS$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SDATREFS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SDATREFS$16);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(SDATREFS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(SDATREFS$16);
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
            get_store().remove_attribute(SDATREFS$16);
        }
    }
    
    /**
     * Gets the "methrefs" attribute
     */
    public java.util.List getMethrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHREFS$18);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "methrefs" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetMethrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(METHREFS$18);
            return target;
        }
    }
    
    /**
     * True if has "methrefs" attribute
     */
    public boolean isSetMethrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METHREFS$18) != null;
        }
    }
    
    /**
     * Sets the "methrefs" attribute
     */
    public void setMethrefs(java.util.List methrefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHREFS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHREFS$18);
            }
            target.setListValue(methrefs);
        }
    }
    
    /**
     * Sets (as xml) the "methrefs" attribute
     */
    public void xsetMethrefs(org.apache.xmlbeans.XmlIDREFS methrefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(METHREFS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(METHREFS$18);
            }
            target.set(methrefs);
        }
    }
    
    /**
     * Unsets the "methrefs" attribute
     */
    public void unsetMethrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METHREFS$18);
        }
    }
    
    /**
     * Gets the "pubrefs" attribute
     */
    public java.util.List getPubrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBREFS$20);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "pubrefs" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetPubrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(PUBREFS$20);
            return target;
        }
    }
    
    /**
     * True if has "pubrefs" attribute
     */
    public boolean isSetPubrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PUBREFS$20) != null;
        }
    }
    
    /**
     * Sets the "pubrefs" attribute
     */
    public void setPubrefs(java.util.List pubrefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBREFS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBREFS$20);
            }
            target.setListValue(pubrefs);
        }
    }
    
    /**
     * Sets (as xml) the "pubrefs" attribute
     */
    public void xsetPubrefs(org.apache.xmlbeans.XmlIDREFS pubrefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(PUBREFS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(PUBREFS$20);
            }
            target.set(pubrefs);
        }
    }
    
    /**
     * Unsets the "pubrefs" attribute
     */
    public void unsetPubrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PUBREFS$20);
        }
    }
    
    /**
     * Gets the "access" attribute
     */
    public java.util.List getAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCESS$22);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "access" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(ACCESS$22);
            return target;
        }
    }
    
    /**
     * True if has "access" attribute
     */
    public boolean isSetAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCESS$22) != null;
        }
    }
    
    /**
     * Sets the "access" attribute
     */
    public void setAccess(java.util.List access)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCESS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCESS$22);
            }
            target.setListValue(access);
        }
    }
    
    /**
     * Sets (as xml) the "access" attribute
     */
    public void xsetAccess(org.apache.xmlbeans.XmlIDREFS access)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(ACCESS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(ACCESS$22);
            }
            target.set(access);
        }
    }
    
    /**
     * Unsets the "access" attribute
     */
    public void unsetAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCESS$22);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.FileDscrType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.FileDscrType.Source
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
