/*
 * XML Type:  fileStrcType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.FileStrcType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML fileStrcType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class FileStrcTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.FileStrcType
{
    private static final long serialVersionUID = 1L;
    
    public FileStrcTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECGRP$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "recGrp");
    private static final javax.xml.namespace.QName NOTES$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "notes");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$6 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$10 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName TYPE$12 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets array of all "recGrp" elements
     */
    public edu.umich.icpsr.ddi.RecGrpType[] getRecGrpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECGRP$0, targetList);
            edu.umich.icpsr.ddi.RecGrpType[] result = new edu.umich.icpsr.ddi.RecGrpType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recGrp" element
     */
    public edu.umich.icpsr.ddi.RecGrpType getRecGrpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecGrpType target = null;
            target = (edu.umich.icpsr.ddi.RecGrpType)get_store().find_element_user(RECGRP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recGrp" element
     */
    public int sizeOfRecGrpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECGRP$0);
        }
    }
    
    /**
     * Sets array of all "recGrp" element
     */
    public void setRecGrpArray(edu.umich.icpsr.ddi.RecGrpType[] recGrpArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(recGrpArray, RECGRP$0);
        }
    }
    
    /**
     * Sets ith "recGrp" element
     */
    public void setRecGrpArray(int i, edu.umich.icpsr.ddi.RecGrpType recGrp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecGrpType target = null;
            target = (edu.umich.icpsr.ddi.RecGrpType)get_store().find_element_user(RECGRP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(recGrp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recGrp" element
     */
    public edu.umich.icpsr.ddi.RecGrpType insertNewRecGrp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecGrpType target = null;
            target = (edu.umich.icpsr.ddi.RecGrpType)get_store().insert_element_user(RECGRP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recGrp" element
     */
    public edu.umich.icpsr.ddi.RecGrpType addNewRecGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecGrpType target = null;
            target = (edu.umich.icpsr.ddi.RecGrpType)get_store().add_element_user(RECGRP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "recGrp" element
     */
    public void removeRecGrp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECGRP$0, i);
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
    public edu.umich.icpsr.ddi.FileStrcType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.FileStrcType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.FileStrcType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileStrcType.Source target = null;
            target = (edu.umich.icpsr.ddi.FileStrcType.Source)get_store().find_attribute_user(SOURCE$10);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FileStrcType.Source)get_default_attribute_value(SOURCE$10);
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
    public void setSource(edu.umich.icpsr.ddi.FileStrcType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.FileStrcType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileStrcType.Source target = null;
            target = (edu.umich.icpsr.ddi.FileStrcType.Source)get_store().find_attribute_user(SOURCE$10);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FileStrcType.Source)get_store().add_attribute_user(SOURCE$10);
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
     * Gets the "type" attribute
     */
    public edu.umich.icpsr.ddi.FileStrcType.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$12);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.FileStrcType.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public edu.umich.icpsr.ddi.FileStrcType.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileStrcType.Type target = null;
            target = (edu.umich.icpsr.ddi.FileStrcType.Type)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FileStrcType.Type)get_default_attribute_value(TYPE$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$12) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(edu.umich.icpsr.ddi.FileStrcType.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$12);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(edu.umich.icpsr.ddi.FileStrcType.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileStrcType.Type target = null;
            target = (edu.umich.icpsr.ddi.FileStrcType.Type)get_store().find_attribute_user(TYPE$12);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FileStrcType.Type)get_store().add_attribute_user(TYPE$12);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$12);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.FileStrcType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.FileStrcType.Source
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
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.FileStrcType$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.FileStrcType.Type
    {
        private static final long serialVersionUID = 1L;
        
        public TypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
