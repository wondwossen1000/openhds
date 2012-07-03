/*
 * XML Type:  dataDscrType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.DataDscrType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML dataDscrType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class DataDscrTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.DataDscrType
{
    private static final long serialVersionUID = 1L;
    
    public DataDscrTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARGRP$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "varGrp");
    private static final javax.xml.namespace.QName NCUBEGRP$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "nCubeGrp");
    private static final javax.xml.namespace.QName VAR$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "var");
    private static final javax.xml.namespace.QName NCUBE$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "nCube");
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
     * Gets array of all "varGrp" elements
     */
    public edu.umich.icpsr.ddi.VarGrpType[] getVarGrpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VARGRP$0, targetList);
            edu.umich.icpsr.ddi.VarGrpType[] result = new edu.umich.icpsr.ddi.VarGrpType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "varGrp" element
     */
    public edu.umich.icpsr.ddi.VarGrpType getVarGrpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarGrpType target = null;
            target = (edu.umich.icpsr.ddi.VarGrpType)get_store().find_element_user(VARGRP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "varGrp" element
     */
    public int sizeOfVarGrpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARGRP$0);
        }
    }
    
    /**
     * Sets array of all "varGrp" element
     */
    public void setVarGrpArray(edu.umich.icpsr.ddi.VarGrpType[] varGrpArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(varGrpArray, VARGRP$0);
        }
    }
    
    /**
     * Sets ith "varGrp" element
     */
    public void setVarGrpArray(int i, edu.umich.icpsr.ddi.VarGrpType varGrp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarGrpType target = null;
            target = (edu.umich.icpsr.ddi.VarGrpType)get_store().find_element_user(VARGRP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(varGrp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "varGrp" element
     */
    public edu.umich.icpsr.ddi.VarGrpType insertNewVarGrp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarGrpType target = null;
            target = (edu.umich.icpsr.ddi.VarGrpType)get_store().insert_element_user(VARGRP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "varGrp" element
     */
    public edu.umich.icpsr.ddi.VarGrpType addNewVarGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarGrpType target = null;
            target = (edu.umich.icpsr.ddi.VarGrpType)get_store().add_element_user(VARGRP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "varGrp" element
     */
    public void removeVarGrp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARGRP$0, i);
        }
    }
    
    /**
     * Gets array of all "nCubeGrp" elements
     */
    public edu.umich.icpsr.ddi.NCubeGrpType[] getNCubeGrpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NCUBEGRP$2, targetList);
            edu.umich.icpsr.ddi.NCubeGrpType[] result = new edu.umich.icpsr.ddi.NCubeGrpType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "nCubeGrp" element
     */
    public edu.umich.icpsr.ddi.NCubeGrpType getNCubeGrpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NCubeGrpType target = null;
            target = (edu.umich.icpsr.ddi.NCubeGrpType)get_store().find_element_user(NCUBEGRP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "nCubeGrp" element
     */
    public int sizeOfNCubeGrpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NCUBEGRP$2);
        }
    }
    
    /**
     * Sets array of all "nCubeGrp" element
     */
    public void setNCubeGrpArray(edu.umich.icpsr.ddi.NCubeGrpType[] nCubeGrpArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nCubeGrpArray, NCUBEGRP$2);
        }
    }
    
    /**
     * Sets ith "nCubeGrp" element
     */
    public void setNCubeGrpArray(int i, edu.umich.icpsr.ddi.NCubeGrpType nCubeGrp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NCubeGrpType target = null;
            target = (edu.umich.icpsr.ddi.NCubeGrpType)get_store().find_element_user(NCUBEGRP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(nCubeGrp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nCubeGrp" element
     */
    public edu.umich.icpsr.ddi.NCubeGrpType insertNewNCubeGrp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NCubeGrpType target = null;
            target = (edu.umich.icpsr.ddi.NCubeGrpType)get_store().insert_element_user(NCUBEGRP$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nCubeGrp" element
     */
    public edu.umich.icpsr.ddi.NCubeGrpType addNewNCubeGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NCubeGrpType target = null;
            target = (edu.umich.icpsr.ddi.NCubeGrpType)get_store().add_element_user(NCUBEGRP$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "nCubeGrp" element
     */
    public void removeNCubeGrp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NCUBEGRP$2, i);
        }
    }
    
    /**
     * Gets array of all "var" elements
     */
    public edu.umich.icpsr.ddi.VarType[] getVarArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VAR$4, targetList);
            edu.umich.icpsr.ddi.VarType[] result = new edu.umich.icpsr.ddi.VarType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "var" element
     */
    public edu.umich.icpsr.ddi.VarType getVarArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType target = null;
            target = (edu.umich.icpsr.ddi.VarType)get_store().find_element_user(VAR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "var" element
     */
    public int sizeOfVarArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VAR$4);
        }
    }
    
    /**
     * Sets array of all "var" element
     */
    public void setVarArray(edu.umich.icpsr.ddi.VarType[] varArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(varArray, VAR$4);
        }
    }
    
    /**
     * Sets ith "var" element
     */
    public void setVarArray(int i, edu.umich.icpsr.ddi.VarType var)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType target = null;
            target = (edu.umich.icpsr.ddi.VarType)get_store().find_element_user(VAR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(var);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "var" element
     */
    public edu.umich.icpsr.ddi.VarType insertNewVar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType target = null;
            target = (edu.umich.icpsr.ddi.VarType)get_store().insert_element_user(VAR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "var" element
     */
    public edu.umich.icpsr.ddi.VarType addNewVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType target = null;
            target = (edu.umich.icpsr.ddi.VarType)get_store().add_element_user(VAR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "var" element
     */
    public void removeVar(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VAR$4, i);
        }
    }
    
    /**
     * Gets array of all "nCube" elements
     */
    public edu.umich.icpsr.ddi.NCubeType[] getNCubeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NCUBE$6, targetList);
            edu.umich.icpsr.ddi.NCubeType[] result = new edu.umich.icpsr.ddi.NCubeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "nCube" element
     */
    public edu.umich.icpsr.ddi.NCubeType getNCubeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NCubeType target = null;
            target = (edu.umich.icpsr.ddi.NCubeType)get_store().find_element_user(NCUBE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "nCube" element
     */
    public int sizeOfNCubeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NCUBE$6);
        }
    }
    
    /**
     * Sets array of all "nCube" element
     */
    public void setNCubeArray(edu.umich.icpsr.ddi.NCubeType[] nCubeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nCubeArray, NCUBE$6);
        }
    }
    
    /**
     * Sets ith "nCube" element
     */
    public void setNCubeArray(int i, edu.umich.icpsr.ddi.NCubeType nCube)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NCubeType target = null;
            target = (edu.umich.icpsr.ddi.NCubeType)get_store().find_element_user(NCUBE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(nCube);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nCube" element
     */
    public edu.umich.icpsr.ddi.NCubeType insertNewNCube(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NCubeType target = null;
            target = (edu.umich.icpsr.ddi.NCubeType)get_store().insert_element_user(NCUBE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nCube" element
     */
    public edu.umich.icpsr.ddi.NCubeType addNewNCube()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NCubeType target = null;
            target = (edu.umich.icpsr.ddi.NCubeType)get_store().add_element_user(NCUBE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "nCube" element
     */
    public void removeNCube(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NCUBE$6, i);
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
    public edu.umich.icpsr.ddi.DataDscrType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.DataDscrType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.DataDscrType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataDscrType.Source target = null;
            target = (edu.umich.icpsr.ddi.DataDscrType.Source)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DataDscrType.Source)get_default_attribute_value(SOURCE$16);
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
    public void setSource(edu.umich.icpsr.ddi.DataDscrType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.DataDscrType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataDscrType.Source target = null;
            target = (edu.umich.icpsr.ddi.DataDscrType.Source)get_store().find_attribute_user(SOURCE$16);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DataDscrType.Source)get_store().add_attribute_user(SOURCE$16);
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
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.DataDscrType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.DataDscrType.Source
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
