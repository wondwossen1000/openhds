/*
 * XML Type:  docDscrType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.DocDscrType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML docDscrType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class DocDscrTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.DocDscrType
{
    private static final long serialVersionUID = 1L;
    
    public DocDscrTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITATION$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "citation");
    private static final javax.xml.namespace.QName GUIDE$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "guide");
    private static final javax.xml.namespace.QName DOCSTATUS$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "docStatus");
    private static final javax.xml.namespace.QName DOCSRC$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "docSrc");
    private static final javax.xml.namespace.QName NOTES$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "notes");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$12 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$14 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$16 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets the "citation" element
     */
    public edu.umich.icpsr.ddi.CitationType getCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CitationType target = null;
            target = (edu.umich.icpsr.ddi.CitationType)get_store().find_element_user(CITATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "citation" element
     */
    public boolean isSetCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITATION$0) != 0;
        }
    }
    
    /**
     * Sets the "citation" element
     */
    public void setCitation(edu.umich.icpsr.ddi.CitationType citation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CitationType target = null;
            target = (edu.umich.icpsr.ddi.CitationType)get_store().find_element_user(CITATION$0, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CitationType)get_store().add_element_user(CITATION$0);
            }
            target.set(citation);
        }
    }
    
    /**
     * Appends and returns a new empty "citation" element
     */
    public edu.umich.icpsr.ddi.CitationType addNewCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CitationType target = null;
            target = (edu.umich.icpsr.ddi.CitationType)get_store().add_element_user(CITATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "citation" element
     */
    public void unsetCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITATION$0, 0);
        }
    }
    
    /**
     * Gets the "guide" element
     */
    public edu.umich.icpsr.ddi.GuideType getGuide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GuideType target = null;
            target = (edu.umich.icpsr.ddi.GuideType)get_store().find_element_user(GUIDE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "guide" element
     */
    public boolean isSetGuide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GUIDE$2) != 0;
        }
    }
    
    /**
     * Sets the "guide" element
     */
    public void setGuide(edu.umich.icpsr.ddi.GuideType guide)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GuideType target = null;
            target = (edu.umich.icpsr.ddi.GuideType)get_store().find_element_user(GUIDE$2, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.GuideType)get_store().add_element_user(GUIDE$2);
            }
            target.set(guide);
        }
    }
    
    /**
     * Appends and returns a new empty "guide" element
     */
    public edu.umich.icpsr.ddi.GuideType addNewGuide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GuideType target = null;
            target = (edu.umich.icpsr.ddi.GuideType)get_store().add_element_user(GUIDE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "guide" element
     */
    public void unsetGuide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GUIDE$2, 0);
        }
    }
    
    /**
     * Gets the "docStatus" element
     */
    public edu.umich.icpsr.ddi.DocStatusType getDocStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DocStatusType target = null;
            target = (edu.umich.icpsr.ddi.DocStatusType)get_store().find_element_user(DOCSTATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "docStatus" element
     */
    public boolean isSetDocStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCSTATUS$4) != 0;
        }
    }
    
    /**
     * Sets the "docStatus" element
     */
    public void setDocStatus(edu.umich.icpsr.ddi.DocStatusType docStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DocStatusType target = null;
            target = (edu.umich.icpsr.ddi.DocStatusType)get_store().find_element_user(DOCSTATUS$4, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DocStatusType)get_store().add_element_user(DOCSTATUS$4);
            }
            target.set(docStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "docStatus" element
     */
    public edu.umich.icpsr.ddi.DocStatusType addNewDocStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DocStatusType target = null;
            target = (edu.umich.icpsr.ddi.DocStatusType)get_store().add_element_user(DOCSTATUS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "docStatus" element
     */
    public void unsetDocStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCSTATUS$4, 0);
        }
    }
    
    /**
     * Gets array of all "docSrc" elements
     */
    public edu.umich.icpsr.ddi.DocSrcType[] getDocSrcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCSRC$6, targetList);
            edu.umich.icpsr.ddi.DocSrcType[] result = new edu.umich.icpsr.ddi.DocSrcType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "docSrc" element
     */
    public edu.umich.icpsr.ddi.DocSrcType getDocSrcArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DocSrcType target = null;
            target = (edu.umich.icpsr.ddi.DocSrcType)get_store().find_element_user(DOCSRC$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "docSrc" element
     */
    public int sizeOfDocSrcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCSRC$6);
        }
    }
    
    /**
     * Sets array of all "docSrc" element
     */
    public void setDocSrcArray(edu.umich.icpsr.ddi.DocSrcType[] docSrcArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(docSrcArray, DOCSRC$6);
        }
    }
    
    /**
     * Sets ith "docSrc" element
     */
    public void setDocSrcArray(int i, edu.umich.icpsr.ddi.DocSrcType docSrc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DocSrcType target = null;
            target = (edu.umich.icpsr.ddi.DocSrcType)get_store().find_element_user(DOCSRC$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(docSrc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "docSrc" element
     */
    public edu.umich.icpsr.ddi.DocSrcType insertNewDocSrc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DocSrcType target = null;
            target = (edu.umich.icpsr.ddi.DocSrcType)get_store().insert_element_user(DOCSRC$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "docSrc" element
     */
    public edu.umich.icpsr.ddi.DocSrcType addNewDocSrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DocSrcType target = null;
            target = (edu.umich.icpsr.ddi.DocSrcType)get_store().add_element_user(DOCSRC$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "docSrc" element
     */
    public void removeDocSrc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCSRC$6, i);
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
            get_store().find_all_element_users(NOTES$8, targetList);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$8, i);
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
            return get_store().count_elements(NOTES$8);
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
            arraySetterHelper(notesArray, NOTES$8);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$8, i);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().insert_element_user(NOTES$8, i);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().add_element_user(NOTES$8);
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
            get_store().remove_element(NOTES$8, i);
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
    public edu.umich.icpsr.ddi.DocDscrType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.DocDscrType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.DocDscrType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DocDscrType.Source target = null;
            target = (edu.umich.icpsr.ddi.DocDscrType.Source)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DocDscrType.Source)get_default_attribute_value(SOURCE$16);
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
    public void setSource(edu.umich.icpsr.ddi.DocDscrType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.DocDscrType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DocDscrType.Source target = null;
            target = (edu.umich.icpsr.ddi.DocDscrType.Source)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DocDscrType.Source)get_store().add_attribute_user(SOURCE$16);
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
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.DocDscrType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.DocDscrType.Source
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
