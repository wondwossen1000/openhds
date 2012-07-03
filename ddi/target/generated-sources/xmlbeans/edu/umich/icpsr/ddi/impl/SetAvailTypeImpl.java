/*
 * XML Type:  setAvailType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.SetAvailType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML setAvailType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class SetAvailTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.SetAvailType
{
    private static final long serialVersionUID = 1L;
    
    public SetAvailTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCSPLAC$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "accsPlac");
    private static final javax.xml.namespace.QName ORIGARCH$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "origArch");
    private static final javax.xml.namespace.QName AVLSTATUS$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "avlStatus");
    private static final javax.xml.namespace.QName COLLSIZE$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "collSize");
    private static final javax.xml.namespace.QName COMPLETE$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "complete");
    private static final javax.xml.namespace.QName FILEQNTY$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "fileQnty");
    private static final javax.xml.namespace.QName NOTES$12 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "notes");
    private static final javax.xml.namespace.QName ID$14 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$16 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$18 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$20 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName MEDIA$22 = 
        new javax.xml.namespace.QName("", "media");
    private static final javax.xml.namespace.QName CALLNO$24 = 
        new javax.xml.namespace.QName("", "callno");
    private static final javax.xml.namespace.QName LABEL$26 = 
        new javax.xml.namespace.QName("", "label");
    private static final javax.xml.namespace.QName TYPE$28 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets array of all "accsPlac" elements
     */
    public edu.umich.icpsr.ddi.AccsPlacType[] getAccsPlacArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACCSPLAC$0, targetList);
            edu.umich.icpsr.ddi.AccsPlacType[] result = new edu.umich.icpsr.ddi.AccsPlacType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "accsPlac" element
     */
    public edu.umich.icpsr.ddi.AccsPlacType getAccsPlacArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AccsPlacType target = null;
            target = (edu.umich.icpsr.ddi.AccsPlacType)get_store().find_element_user(ACCSPLAC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "accsPlac" element
     */
    public int sizeOfAccsPlacArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCSPLAC$0);
        }
    }
    
    /**
     * Sets array of all "accsPlac" element
     */
    public void setAccsPlacArray(edu.umich.icpsr.ddi.AccsPlacType[] accsPlacArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(accsPlacArray, ACCSPLAC$0);
        }
    }
    
    /**
     * Sets ith "accsPlac" element
     */
    public void setAccsPlacArray(int i, edu.umich.icpsr.ddi.AccsPlacType accsPlac)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AccsPlacType target = null;
            target = (edu.umich.icpsr.ddi.AccsPlacType)get_store().find_element_user(ACCSPLAC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(accsPlac);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "accsPlac" element
     */
    public edu.umich.icpsr.ddi.AccsPlacType insertNewAccsPlac(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AccsPlacType target = null;
            target = (edu.umich.icpsr.ddi.AccsPlacType)get_store().insert_element_user(ACCSPLAC$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "accsPlac" element
     */
    public edu.umich.icpsr.ddi.AccsPlacType addNewAccsPlac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AccsPlacType target = null;
            target = (edu.umich.icpsr.ddi.AccsPlacType)get_store().add_element_user(ACCSPLAC$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "accsPlac" element
     */
    public void removeAccsPlac(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCSPLAC$0, i);
        }
    }
    
    /**
     * Gets the "origArch" element
     */
    public edu.umich.icpsr.ddi.OrigArchType getOrigArch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OrigArchType target = null;
            target = (edu.umich.icpsr.ddi.OrigArchType)get_store().find_element_user(ORIGARCH$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "origArch" element
     */
    public boolean isSetOrigArch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGARCH$2) != 0;
        }
    }
    
    /**
     * Sets the "origArch" element
     */
    public void setOrigArch(edu.umich.icpsr.ddi.OrigArchType origArch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OrigArchType target = null;
            target = (edu.umich.icpsr.ddi.OrigArchType)get_store().find_element_user(ORIGARCH$2, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.OrigArchType)get_store().add_element_user(ORIGARCH$2);
            }
            target.set(origArch);
        }
    }
    
    /**
     * Appends and returns a new empty "origArch" element
     */
    public edu.umich.icpsr.ddi.OrigArchType addNewOrigArch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OrigArchType target = null;
            target = (edu.umich.icpsr.ddi.OrigArchType)get_store().add_element_user(ORIGARCH$2);
            return target;
        }
    }
    
    /**
     * Unsets the "origArch" element
     */
    public void unsetOrigArch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGARCH$2, 0);
        }
    }
    
    /**
     * Gets array of all "avlStatus" elements
     */
    public edu.umich.icpsr.ddi.AvlStatusType[] getAvlStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AVLSTATUS$4, targetList);
            edu.umich.icpsr.ddi.AvlStatusType[] result = new edu.umich.icpsr.ddi.AvlStatusType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "avlStatus" element
     */
    public edu.umich.icpsr.ddi.AvlStatusType getAvlStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AvlStatusType target = null;
            target = (edu.umich.icpsr.ddi.AvlStatusType)get_store().find_element_user(AVLSTATUS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "avlStatus" element
     */
    public int sizeOfAvlStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AVLSTATUS$4);
        }
    }
    
    /**
     * Sets array of all "avlStatus" element
     */
    public void setAvlStatusArray(edu.umich.icpsr.ddi.AvlStatusType[] avlStatusArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(avlStatusArray, AVLSTATUS$4);
        }
    }
    
    /**
     * Sets ith "avlStatus" element
     */
    public void setAvlStatusArray(int i, edu.umich.icpsr.ddi.AvlStatusType avlStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AvlStatusType target = null;
            target = (edu.umich.icpsr.ddi.AvlStatusType)get_store().find_element_user(AVLSTATUS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(avlStatus);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "avlStatus" element
     */
    public edu.umich.icpsr.ddi.AvlStatusType insertNewAvlStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AvlStatusType target = null;
            target = (edu.umich.icpsr.ddi.AvlStatusType)get_store().insert_element_user(AVLSTATUS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "avlStatus" element
     */
    public edu.umich.icpsr.ddi.AvlStatusType addNewAvlStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AvlStatusType target = null;
            target = (edu.umich.icpsr.ddi.AvlStatusType)get_store().add_element_user(AVLSTATUS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "avlStatus" element
     */
    public void removeAvlStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AVLSTATUS$4, i);
        }
    }
    
    /**
     * Gets the "collSize" element
     */
    public edu.umich.icpsr.ddi.CollSizeType getCollSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollSizeType target = null;
            target = (edu.umich.icpsr.ddi.CollSizeType)get_store().find_element_user(COLLSIZE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "collSize" element
     */
    public boolean isSetCollSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLLSIZE$6) != 0;
        }
    }
    
    /**
     * Sets the "collSize" element
     */
    public void setCollSize(edu.umich.icpsr.ddi.CollSizeType collSize)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollSizeType target = null;
            target = (edu.umich.icpsr.ddi.CollSizeType)get_store().find_element_user(COLLSIZE$6, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CollSizeType)get_store().add_element_user(COLLSIZE$6);
            }
            target.set(collSize);
        }
    }
    
    /**
     * Appends and returns a new empty "collSize" element
     */
    public edu.umich.icpsr.ddi.CollSizeType addNewCollSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollSizeType target = null;
            target = (edu.umich.icpsr.ddi.CollSizeType)get_store().add_element_user(COLLSIZE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "collSize" element
     */
    public void unsetCollSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLLSIZE$6, 0);
        }
    }
    
    /**
     * Gets the "complete" element
     */
    public edu.umich.icpsr.ddi.CompleteType getComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CompleteType target = null;
            target = (edu.umich.icpsr.ddi.CompleteType)get_store().find_element_user(COMPLETE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "complete" element
     */
    public boolean isSetComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLETE$8) != 0;
        }
    }
    
    /**
     * Sets the "complete" element
     */
    public void setComplete(edu.umich.icpsr.ddi.CompleteType complete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CompleteType target = null;
            target = (edu.umich.icpsr.ddi.CompleteType)get_store().find_element_user(COMPLETE$8, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CompleteType)get_store().add_element_user(COMPLETE$8);
            }
            target.set(complete);
        }
    }
    
    /**
     * Appends and returns a new empty "complete" element
     */
    public edu.umich.icpsr.ddi.CompleteType addNewComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CompleteType target = null;
            target = (edu.umich.icpsr.ddi.CompleteType)get_store().add_element_user(COMPLETE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "complete" element
     */
    public void unsetComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLETE$8, 0);
        }
    }
    
    /**
     * Gets the "fileQnty" element
     */
    public edu.umich.icpsr.ddi.FileQntyType getFileQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileQntyType target = null;
            target = (edu.umich.icpsr.ddi.FileQntyType)get_store().find_element_user(FILEQNTY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fileQnty" element
     */
    public boolean isSetFileQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEQNTY$10) != 0;
        }
    }
    
    /**
     * Sets the "fileQnty" element
     */
    public void setFileQnty(edu.umich.icpsr.ddi.FileQntyType fileQnty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileQntyType target = null;
            target = (edu.umich.icpsr.ddi.FileQntyType)get_store().find_element_user(FILEQNTY$10, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FileQntyType)get_store().add_element_user(FILEQNTY$10);
            }
            target.set(fileQnty);
        }
    }
    
    /**
     * Appends and returns a new empty "fileQnty" element
     */
    public edu.umich.icpsr.ddi.FileQntyType addNewFileQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileQntyType target = null;
            target = (edu.umich.icpsr.ddi.FileQntyType)get_store().add_element_user(FILEQNTY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "fileQnty" element
     */
    public void unsetFileQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEQNTY$10, 0);
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
            get_store().find_all_element_users(NOTES$12, targetList);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$12, i);
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
            return get_store().count_elements(NOTES$12);
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
            arraySetterHelper(notesArray, NOTES$12);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$12, i);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().insert_element_user(NOTES$12, i);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().add_element_user(NOTES$12);
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
            get_store().remove_element(NOTES$12, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$14);
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
            return get_store().find_attribute_user(ID$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$14);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$14);
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
            get_store().remove_attribute(ID$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$16);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$16);
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
            return get_store().find_attribute_user(XMLLANG$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$16);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$16);
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
            get_store().remove_attribute(XMLLANG$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$18);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$18);
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
            return get_store().find_attribute_user(LANG$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$18);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$18);
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
            get_store().remove_attribute(LANG$18);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.SetAvailType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$20);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.SetAvailType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.SetAvailType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SetAvailType.Source target = null;
            target = (edu.umich.icpsr.ddi.SetAvailType.Source)get_store().find_attribute_user(SOURCE$20);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SetAvailType.Source)get_default_attribute_value(SOURCE$20);
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
            return get_store().find_attribute_user(SOURCE$20) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.SetAvailType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$20);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.SetAvailType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SetAvailType.Source target = null;
            target = (edu.umich.icpsr.ddi.SetAvailType.Source)get_store().find_attribute_user(SOURCE$20);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SetAvailType.Source)get_store().add_attribute_user(SOURCE$20);
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
            get_store().remove_attribute(SOURCE$20);
        }
    }
    
    /**
     * Gets the "media" attribute
     */
    public java.lang.String getMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIA$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "media" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIA$22);
            return target;
        }
    }
    
    /**
     * True if has "media" attribute
     */
    public boolean isSetMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEDIA$22) != null;
        }
    }
    
    /**
     * Sets the "media" attribute
     */
    public void setMedia(java.lang.String media)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIA$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEDIA$22);
            }
            target.setStringValue(media);
        }
    }
    
    /**
     * Sets (as xml) the "media" attribute
     */
    public void xsetMedia(org.apache.xmlbeans.XmlString media)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEDIA$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEDIA$22);
            }
            target.set(media);
        }
    }
    
    /**
     * Unsets the "media" attribute
     */
    public void unsetMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEDIA$22);
        }
    }
    
    /**
     * Gets the "callno" attribute
     */
    public java.lang.String getCallno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALLNO$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "callno" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCallno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CALLNO$24);
            return target;
        }
    }
    
    /**
     * True if has "callno" attribute
     */
    public boolean isSetCallno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALLNO$24) != null;
        }
    }
    
    /**
     * Sets the "callno" attribute
     */
    public void setCallno(java.lang.String callno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALLNO$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALLNO$24);
            }
            target.setStringValue(callno);
        }
    }
    
    /**
     * Sets (as xml) the "callno" attribute
     */
    public void xsetCallno(org.apache.xmlbeans.XmlString callno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CALLNO$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CALLNO$24);
            }
            target.set(callno);
        }
    }
    
    /**
     * Unsets the "callno" attribute
     */
    public void unsetCallno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALLNO$24);
        }
    }
    
    /**
     * Gets the "label" attribute
     */
    public java.lang.String getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "label" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$26);
            return target;
        }
    }
    
    /**
     * True if has "label" attribute
     */
    public boolean isSetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LABEL$26) != null;
        }
    }
    
    /**
     * Sets the "label" attribute
     */
    public void setLabel(java.lang.String label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$26);
            }
            target.setStringValue(label);
        }
    }
    
    /**
     * Sets (as xml) the "label" attribute
     */
    public void xsetLabel(org.apache.xmlbeans.XmlString label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$26);
            }
            target.set(label);
        }
    }
    
    /**
     * Unsets the "label" attribute
     */
    public void unsetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LABEL$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$28);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$28);
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
            return get_store().find_attribute_user(TYPE$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$28);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$28);
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
            get_store().remove_attribute(TYPE$28);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.SetAvailType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.SetAvailType.Source
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
