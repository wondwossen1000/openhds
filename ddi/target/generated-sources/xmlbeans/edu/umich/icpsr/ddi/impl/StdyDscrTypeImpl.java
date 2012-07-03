/*
 * XML Type:  stdyDscrType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.StdyDscrType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML stdyDscrType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class StdyDscrTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.StdyDscrType
{
    private static final long serialVersionUID = 1L;
    
    public StdyDscrTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITATION$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "citation");
    private static final javax.xml.namespace.QName STDYINFO$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "stdyInfo");
    private static final javax.xml.namespace.QName METHOD$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "method");
    private static final javax.xml.namespace.QName DATAACCS$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "dataAccs");
    private static final javax.xml.namespace.QName OTHRSTDYMAT$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "othrStdyMat");
    private static final javax.xml.namespace.QName NOTES$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "notes");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$14 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$16 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$18 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName ACCESS$20 = 
        new javax.xml.namespace.QName("", "access");
    
    
    /**
     * Gets array of all "citation" elements
     */
    public edu.umich.icpsr.ddi.CitationType[] getCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CITATION$0, targetList);
            edu.umich.icpsr.ddi.CitationType[] result = new edu.umich.icpsr.ddi.CitationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "citation" element
     */
    public edu.umich.icpsr.ddi.CitationType getCitationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CitationType target = null;
            target = (edu.umich.icpsr.ddi.CitationType)get_store().find_element_user(CITATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "citation" element
     */
    public int sizeOfCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITATION$0);
        }
    }
    
    /**
     * Sets array of all "citation" element
     */
    public void setCitationArray(edu.umich.icpsr.ddi.CitationType[] citationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(citationArray, CITATION$0);
        }
    }
    
    /**
     * Sets ith "citation" element
     */
    public void setCitationArray(int i, edu.umich.icpsr.ddi.CitationType citation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CitationType target = null;
            target = (edu.umich.icpsr.ddi.CitationType)get_store().find_element_user(CITATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(citation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "citation" element
     */
    public edu.umich.icpsr.ddi.CitationType insertNewCitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CitationType target = null;
            target = (edu.umich.icpsr.ddi.CitationType)get_store().insert_element_user(CITATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "citation" element
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
     * Removes the ith "citation" element
     */
    public void removeCitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITATION$0, i);
        }
    }
    
    /**
     * Gets array of all "stdyInfo" elements
     */
    public edu.umich.icpsr.ddi.StdyInfoType[] getStdyInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STDYINFO$2, targetList);
            edu.umich.icpsr.ddi.StdyInfoType[] result = new edu.umich.icpsr.ddi.StdyInfoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "stdyInfo" element
     */
    public edu.umich.icpsr.ddi.StdyInfoType getStdyInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.StdyInfoType target = null;
            target = (edu.umich.icpsr.ddi.StdyInfoType)get_store().find_element_user(STDYINFO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "stdyInfo" element
     */
    public int sizeOfStdyInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDYINFO$2);
        }
    }
    
    /**
     * Sets array of all "stdyInfo" element
     */
    public void setStdyInfoArray(edu.umich.icpsr.ddi.StdyInfoType[] stdyInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stdyInfoArray, STDYINFO$2);
        }
    }
    
    /**
     * Sets ith "stdyInfo" element
     */
    public void setStdyInfoArray(int i, edu.umich.icpsr.ddi.StdyInfoType stdyInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.StdyInfoType target = null;
            target = (edu.umich.icpsr.ddi.StdyInfoType)get_store().find_element_user(STDYINFO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stdyInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stdyInfo" element
     */
    public edu.umich.icpsr.ddi.StdyInfoType insertNewStdyInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.StdyInfoType target = null;
            target = (edu.umich.icpsr.ddi.StdyInfoType)get_store().insert_element_user(STDYINFO$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stdyInfo" element
     */
    public edu.umich.icpsr.ddi.StdyInfoType addNewStdyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.StdyInfoType target = null;
            target = (edu.umich.icpsr.ddi.StdyInfoType)get_store().add_element_user(STDYINFO$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "stdyInfo" element
     */
    public void removeStdyInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDYINFO$2, i);
        }
    }
    
    /**
     * Gets array of all "method" elements
     */
    public edu.umich.icpsr.ddi.MethodType[] getMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(METHOD$4, targetList);
            edu.umich.icpsr.ddi.MethodType[] result = new edu.umich.icpsr.ddi.MethodType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "method" element
     */
    public edu.umich.icpsr.ddi.MethodType getMethodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MethodType target = null;
            target = (edu.umich.icpsr.ddi.MethodType)get_store().find_element_user(METHOD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "method" element
     */
    public int sizeOfMethodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METHOD$4);
        }
    }
    
    /**
     * Sets array of all "method" element
     */
    public void setMethodArray(edu.umich.icpsr.ddi.MethodType[] methodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(methodArray, METHOD$4);
        }
    }
    
    /**
     * Sets ith "method" element
     */
    public void setMethodArray(int i, edu.umich.icpsr.ddi.MethodType method)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MethodType target = null;
            target = (edu.umich.icpsr.ddi.MethodType)get_store().find_element_user(METHOD$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(method);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "method" element
     */
    public edu.umich.icpsr.ddi.MethodType insertNewMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MethodType target = null;
            target = (edu.umich.icpsr.ddi.MethodType)get_store().insert_element_user(METHOD$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "method" element
     */
    public edu.umich.icpsr.ddi.MethodType addNewMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MethodType target = null;
            target = (edu.umich.icpsr.ddi.MethodType)get_store().add_element_user(METHOD$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "method" element
     */
    public void removeMethod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METHOD$4, i);
        }
    }
    
    /**
     * Gets array of all "dataAccs" elements
     */
    public edu.umich.icpsr.ddi.DataAccsType[] getDataAccsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAACCS$6, targetList);
            edu.umich.icpsr.ddi.DataAccsType[] result = new edu.umich.icpsr.ddi.DataAccsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataAccs" element
     */
    public edu.umich.icpsr.ddi.DataAccsType getDataAccsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataAccsType target = null;
            target = (edu.umich.icpsr.ddi.DataAccsType)get_store().find_element_user(DATAACCS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataAccs" element
     */
    public int sizeOfDataAccsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAACCS$6);
        }
    }
    
    /**
     * Sets array of all "dataAccs" element
     */
    public void setDataAccsArray(edu.umich.icpsr.ddi.DataAccsType[] dataAccsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataAccsArray, DATAACCS$6);
        }
    }
    
    /**
     * Sets ith "dataAccs" element
     */
    public void setDataAccsArray(int i, edu.umich.icpsr.ddi.DataAccsType dataAccs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataAccsType target = null;
            target = (edu.umich.icpsr.ddi.DataAccsType)get_store().find_element_user(DATAACCS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataAccs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataAccs" element
     */
    public edu.umich.icpsr.ddi.DataAccsType insertNewDataAccs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataAccsType target = null;
            target = (edu.umich.icpsr.ddi.DataAccsType)get_store().insert_element_user(DATAACCS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataAccs" element
     */
    public edu.umich.icpsr.ddi.DataAccsType addNewDataAccs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataAccsType target = null;
            target = (edu.umich.icpsr.ddi.DataAccsType)get_store().add_element_user(DATAACCS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataAccs" element
     */
    public void removeDataAccs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAACCS$6, i);
        }
    }
    
    /**
     * Gets array of all "othrStdyMat" elements
     */
    public edu.umich.icpsr.ddi.OthrStdyMatType[] getOthrStdyMatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OTHRSTDYMAT$8, targetList);
            edu.umich.icpsr.ddi.OthrStdyMatType[] result = new edu.umich.icpsr.ddi.OthrStdyMatType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "othrStdyMat" element
     */
    public edu.umich.icpsr.ddi.OthrStdyMatType getOthrStdyMatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OthrStdyMatType target = null;
            target = (edu.umich.icpsr.ddi.OthrStdyMatType)get_store().find_element_user(OTHRSTDYMAT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "othrStdyMat" element
     */
    public int sizeOfOthrStdyMatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHRSTDYMAT$8);
        }
    }
    
    /**
     * Sets array of all "othrStdyMat" element
     */
    public void setOthrStdyMatArray(edu.umich.icpsr.ddi.OthrStdyMatType[] othrStdyMatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(othrStdyMatArray, OTHRSTDYMAT$8);
        }
    }
    
    /**
     * Sets ith "othrStdyMat" element
     */
    public void setOthrStdyMatArray(int i, edu.umich.icpsr.ddi.OthrStdyMatType othrStdyMat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OthrStdyMatType target = null;
            target = (edu.umich.icpsr.ddi.OthrStdyMatType)get_store().find_element_user(OTHRSTDYMAT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(othrStdyMat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "othrStdyMat" element
     */
    public edu.umich.icpsr.ddi.OthrStdyMatType insertNewOthrStdyMat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OthrStdyMatType target = null;
            target = (edu.umich.icpsr.ddi.OthrStdyMatType)get_store().insert_element_user(OTHRSTDYMAT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "othrStdyMat" element
     */
    public edu.umich.icpsr.ddi.OthrStdyMatType addNewOthrStdyMat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.OthrStdyMatType target = null;
            target = (edu.umich.icpsr.ddi.OthrStdyMatType)get_store().add_element_user(OTHRSTDYMAT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "othrStdyMat" element
     */
    public void removeOthrStdyMat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHRSTDYMAT$8, i);
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
            get_store().find_all_element_users(NOTES$10, targetList);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$10, i);
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
            return get_store().count_elements(NOTES$10);
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
            arraySetterHelper(notesArray, NOTES$10);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$10, i);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().insert_element_user(NOTES$10, i);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().add_element_user(NOTES$10);
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
            get_store().remove_element(NOTES$10, i);
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
    public edu.umich.icpsr.ddi.StdyDscrType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.StdyDscrType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.StdyDscrType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.StdyDscrType.Source target = null;
            target = (edu.umich.icpsr.ddi.StdyDscrType.Source)get_store().find_attribute_user(SOURCE$18);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.StdyDscrType.Source)get_default_attribute_value(SOURCE$18);
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
    public void setSource(edu.umich.icpsr.ddi.StdyDscrType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.StdyDscrType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.StdyDscrType.Source target = null;
            target = (edu.umich.icpsr.ddi.StdyDscrType.Source)get_store().find_attribute_user(SOURCE$18);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.StdyDscrType.Source)get_store().add_attribute_user(SOURCE$18);
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
     * Gets the "access" attribute
     */
    public java.util.List getAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCESS$20);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(ACCESS$20);
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
            return get_store().find_attribute_user(ACCESS$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCESS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCESS$20);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(ACCESS$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(ACCESS$20);
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
            get_store().remove_attribute(ACCESS$20);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.StdyDscrType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.StdyDscrType.Source
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
