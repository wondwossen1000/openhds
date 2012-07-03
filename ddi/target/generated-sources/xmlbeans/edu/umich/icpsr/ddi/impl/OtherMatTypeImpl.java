/*
 * XML Type:  otherMatType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.OtherMatType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML otherMatType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class OtherMatTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.OtherMatType
{
    private static final long serialVersionUID = 1L;
    
    public OtherMatTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABL$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "labl");
    private static final javax.xml.namespace.QName TXT$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "txt");
    private static final javax.xml.namespace.QName NOTES$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "notes");
    private static final javax.xml.namespace.QName TABLE$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "table");
    private static final javax.xml.namespace.QName CITATION$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "citation");
    private static final javax.xml.namespace.QName OTHERMAT$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "otherMat");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$14 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$16 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$18 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName TYPE$20 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName LEVEL$22 = 
        new javax.xml.namespace.QName("", "level");
    private static final javax.xml.namespace.QName URI$24 = 
        new javax.xml.namespace.QName("", "URI");
    
    
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
     * Gets the "txt" element
     */
    public edu.umich.icpsr.ddi.TxtType getTxt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TxtType target = null;
            target = (edu.umich.icpsr.ddi.TxtType)get_store().find_element_user(TXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "txt" element
     */
    public boolean isSetTxt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXT$2) != 0;
        }
    }
    
    /**
     * Sets the "txt" element
     */
    public void setTxt(edu.umich.icpsr.ddi.TxtType txt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TxtType target = null;
            target = (edu.umich.icpsr.ddi.TxtType)get_store().find_element_user(TXT$2, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.TxtType)get_store().add_element_user(TXT$2);
            }
            target.set(txt);
        }
    }
    
    /**
     * Appends and returns a new empty "txt" element
     */
    public edu.umich.icpsr.ddi.TxtType addNewTxt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TxtType target = null;
            target = (edu.umich.icpsr.ddi.TxtType)get_store().add_element_user(TXT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "txt" element
     */
    public void unsetTxt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXT$2, 0);
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
     * Gets array of all "table" elements
     */
    public edu.umich.icpsr.ddi.TableType[] getTableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TABLE$6, targetList);
            edu.umich.icpsr.ddi.TableType[] result = new edu.umich.icpsr.ddi.TableType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "table" element
     */
    public edu.umich.icpsr.ddi.TableType getTableArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TableType target = null;
            target = (edu.umich.icpsr.ddi.TableType)get_store().find_element_user(TABLE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "table" element
     */
    public int sizeOfTableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLE$6);
        }
    }
    
    /**
     * Sets array of all "table" element
     */
    public void setTableArray(edu.umich.icpsr.ddi.TableType[] tableArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tableArray, TABLE$6);
        }
    }
    
    /**
     * Sets ith "table" element
     */
    public void setTableArray(int i, edu.umich.icpsr.ddi.TableType table)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TableType target = null;
            target = (edu.umich.icpsr.ddi.TableType)get_store().find_element_user(TABLE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(table);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "table" element
     */
    public edu.umich.icpsr.ddi.TableType insertNewTable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TableType target = null;
            target = (edu.umich.icpsr.ddi.TableType)get_store().insert_element_user(TABLE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "table" element
     */
    public edu.umich.icpsr.ddi.TableType addNewTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TableType target = null;
            target = (edu.umich.icpsr.ddi.TableType)get_store().add_element_user(TABLE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "table" element
     */
    public void removeTable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLE$6, i);
        }
    }
    
    /**
     * Gets the "citation" element
     */
    public edu.umich.icpsr.ddi.CitationType getCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CitationType target = null;
            target = (edu.umich.icpsr.ddi.CitationType)get_store().find_element_user(CITATION$8, 0);
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
            return get_store().count_elements(CITATION$8) != 0;
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
            target = (edu.umich.icpsr.ddi.CitationType)get_store().find_element_user(CITATION$8, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CitationType)get_store().add_element_user(CITATION$8);
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
            target = (edu.umich.icpsr.ddi.CitationType)get_store().add_element_user(CITATION$8);
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
            get_store().remove_element(CITATION$8, 0);
        }
    }
    
    /**
     * Gets array of all "otherMat" elements
     */
    public edu.umich.icpsr.ddi.OtherMatType[] getOtherMatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OTHERMAT$10, targetList);
            edu.umich.icpsr.ddi.OtherMatType[] result = new edu.umich.icpsr.ddi.OtherMatType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "otherMat" element
     */
    public edu.umich.icpsr.ddi.OtherMatType getOtherMatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OtherMatType target = null;
            target = (edu.umich.icpsr.ddi.OtherMatType)get_store().find_element_user(OTHERMAT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "otherMat" element
     */
    public int sizeOfOtherMatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERMAT$10);
        }
    }
    
    /**
     * Sets array of all "otherMat" element
     */
    public void setOtherMatArray(edu.umich.icpsr.ddi.OtherMatType[] otherMatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(otherMatArray, OTHERMAT$10);
        }
    }
    
    /**
     * Sets ith "otherMat" element
     */
    public void setOtherMatArray(int i, edu.umich.icpsr.ddi.OtherMatType otherMat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OtherMatType target = null;
            target = (edu.umich.icpsr.ddi.OtherMatType)get_store().find_element_user(OTHERMAT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(otherMat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "otherMat" element
     */
    public edu.umich.icpsr.ddi.OtherMatType insertNewOtherMat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OtherMatType target = null;
            target = (edu.umich.icpsr.ddi.OtherMatType)get_store().insert_element_user(OTHERMAT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "otherMat" element
     */
    public edu.umich.icpsr.ddi.OtherMatType addNewOtherMat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OtherMatType target = null;
            target = (edu.umich.icpsr.ddi.OtherMatType)get_store().add_element_user(OTHERMAT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "otherMat" element
     */
    public void removeOtherMat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERMAT$10, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
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
            return get_store().find_attribute_user(ID$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$12);
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
            get_store().remove_attribute(ID$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$14);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$14);
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
            return get_store().find_attribute_user(XMLLANG$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$14);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$14);
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
            get_store().remove_attribute(XMLLANG$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$16);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$16);
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
            return get_store().find_attribute_user(LANG$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$16);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$16);
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
            get_store().remove_attribute(LANG$16);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.OtherMatType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$18);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.OtherMatType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.OtherMatType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OtherMatType.Source target = null;
            target = (edu.umich.icpsr.ddi.OtherMatType.Source)get_store().find_attribute_user(SOURCE$18);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.OtherMatType.Source)get_default_attribute_value(SOURCE$18);
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
            return get_store().find_attribute_user(SOURCE$18) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.OtherMatType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$18);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.OtherMatType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OtherMatType.Source target = null;
            target = (edu.umich.icpsr.ddi.OtherMatType.Source)get_store().find_attribute_user(SOURCE$18);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.OtherMatType.Source)get_store().add_attribute_user(SOURCE$18);
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
            get_store().remove_attribute(SOURCE$18);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$20);
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
            return get_store().find_attribute_user(TYPE$20) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$20);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$20);
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
            get_store().remove_attribute(TYPE$20);
        }
    }
    
    /**
     * Gets the "level" attribute
     */
    public edu.umich.icpsr.ddi.OtherMatType.Level.Enum getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$22);
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.OtherMatType.Level.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "level" attribute
     */
    public edu.umich.icpsr.ddi.OtherMatType.Level xgetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OtherMatType.Level target = null;
            target = (edu.umich.icpsr.ddi.OtherMatType.Level)get_store().find_attribute_user(LEVEL$22);
            return target;
        }
    }
    
    /**
     * Sets the "level" attribute
     */
    public void setLevel(edu.umich.icpsr.ddi.OtherMatType.Level.Enum level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$22);
            }
            target.setEnumValue(level);
        }
    }
    
    /**
     * Sets (as xml) the "level" attribute
     */
    public void xsetLevel(edu.umich.icpsr.ddi.OtherMatType.Level level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OtherMatType.Level target = null;
            target = (edu.umich.icpsr.ddi.OtherMatType.Level)get_store().find_attribute_user(LEVEL$22);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.OtherMatType.Level)get_store().add_attribute_user(LEVEL$22);
            }
            target.set(level);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$24);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URI$24);
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
            return get_store().find_attribute_user(URI$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$24);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URI$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(URI$24);
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
            get_store().remove_attribute(URI$24);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.OtherMatType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.OtherMatType.Source
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
     * An XML level(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.OtherMatType$Level.
     */
    public static class LevelImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.OtherMatType.Level
    {
        private static final long serialVersionUID = 1L;
        
        public LevelImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected LevelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
