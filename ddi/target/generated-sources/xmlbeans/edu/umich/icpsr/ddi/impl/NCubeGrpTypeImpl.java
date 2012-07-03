/*
 * XML Type:  nCubeGrpType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.NCubeGrpType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML nCubeGrpType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class NCubeGrpTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.NCubeGrpType
{
    private static final long serialVersionUID = 1L;
    
    public NCubeGrpTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABL$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "labl");
    private static final javax.xml.namespace.QName TXT$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "txt");
    private static final javax.xml.namespace.QName CONCEPT$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "concept");
    private static final javax.xml.namespace.QName DEFNTN$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "defntn");
    private static final javax.xml.namespace.QName UNIVERSE$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "universe");
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
    private static final javax.xml.namespace.QName TYPE$20 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName NCUBE$22 = 
        new javax.xml.namespace.QName("", "nCube");
    private static final javax.xml.namespace.QName NCUBEGRP$24 = 
        new javax.xml.namespace.QName("", "nCubeGrp");
    private static final javax.xml.namespace.QName NAME$26 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName SDATREFS$28 = 
        new javax.xml.namespace.QName("", "sdatrefs");
    private static final javax.xml.namespace.QName METHREFS$30 = 
        new javax.xml.namespace.QName("", "methrefs");
    private static final javax.xml.namespace.QName PUBREFS$32 = 
        new javax.xml.namespace.QName("", "pubrefs");
    private static final javax.xml.namespace.QName ACCESS$34 = 
        new javax.xml.namespace.QName("", "access");
    
    
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
     * Gets array of all "txt" elements
     */
    public edu.umich.icpsr.ddi.TxtType[] getTxtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TXT$2, targetList);
            edu.umich.icpsr.ddi.TxtType[] result = new edu.umich.icpsr.ddi.TxtType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "txt" element
     */
    public edu.umich.icpsr.ddi.TxtType getTxtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TxtType target = null;
            target = (edu.umich.icpsr.ddi.TxtType)get_store().find_element_user(TXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "txt" element
     */
    public int sizeOfTxtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXT$2);
        }
    }
    
    /**
     * Sets array of all "txt" element
     */
    public void setTxtArray(edu.umich.icpsr.ddi.TxtType[] txtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(txtArray, TXT$2);
        }
    }
    
    /**
     * Sets ith "txt" element
     */
    public void setTxtArray(int i, edu.umich.icpsr.ddi.TxtType txt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TxtType target = null;
            target = (edu.umich.icpsr.ddi.TxtType)get_store().find_element_user(TXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(txt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "txt" element
     */
    public edu.umich.icpsr.ddi.TxtType insertNewTxt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TxtType target = null;
            target = (edu.umich.icpsr.ddi.TxtType)get_store().insert_element_user(TXT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "txt" element
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
     * Removes the ith "txt" element
     */
    public void removeTxt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXT$2, i);
        }
    }
    
    /**
     * Gets array of all "concept" elements
     */
    public edu.umich.icpsr.ddi.ConceptType[] getConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPT$4, targetList);
            edu.umich.icpsr.ddi.ConceptType[] result = new edu.umich.icpsr.ddi.ConceptType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "concept" element
     */
    public edu.umich.icpsr.ddi.ConceptType getConceptArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConceptType target = null;
            target = (edu.umich.icpsr.ddi.ConceptType)get_store().find_element_user(CONCEPT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "concept" element
     */
    public int sizeOfConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPT$4);
        }
    }
    
    /**
     * Sets array of all "concept" element
     */
    public void setConceptArray(edu.umich.icpsr.ddi.ConceptType[] conceptArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptArray, CONCEPT$4);
        }
    }
    
    /**
     * Sets ith "concept" element
     */
    public void setConceptArray(int i, edu.umich.icpsr.ddi.ConceptType concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConceptType target = null;
            target = (edu.umich.icpsr.ddi.ConceptType)get_store().find_element_user(CONCEPT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(concept);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "concept" element
     */
    public edu.umich.icpsr.ddi.ConceptType insertNewConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConceptType target = null;
            target = (edu.umich.icpsr.ddi.ConceptType)get_store().insert_element_user(CONCEPT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "concept" element
     */
    public edu.umich.icpsr.ddi.ConceptType addNewConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConceptType target = null;
            target = (edu.umich.icpsr.ddi.ConceptType)get_store().add_element_user(CONCEPT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "concept" element
     */
    public void removeConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPT$4, i);
        }
    }
    
    /**
     * Gets the "defntn" element
     */
    public edu.umich.icpsr.ddi.DefntnType getDefntn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DefntnType target = null;
            target = (edu.umich.icpsr.ddi.DefntnType)get_store().find_element_user(DEFNTN$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "defntn" element
     */
    public boolean isSetDefntn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFNTN$6) != 0;
        }
    }
    
    /**
     * Sets the "defntn" element
     */
    public void setDefntn(edu.umich.icpsr.ddi.DefntnType defntn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DefntnType target = null;
            target = (edu.umich.icpsr.ddi.DefntnType)get_store().find_element_user(DEFNTN$6, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DefntnType)get_store().add_element_user(DEFNTN$6);
            }
            target.set(defntn);
        }
    }
    
    /**
     * Appends and returns a new empty "defntn" element
     */
    public edu.umich.icpsr.ddi.DefntnType addNewDefntn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DefntnType target = null;
            target = (edu.umich.icpsr.ddi.DefntnType)get_store().add_element_user(DEFNTN$6);
            return target;
        }
    }
    
    /**
     * Unsets the "defntn" element
     */
    public void unsetDefntn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFNTN$6, 0);
        }
    }
    
    /**
     * Gets the "universe" element
     */
    public edu.umich.icpsr.ddi.UniverseType getUniverse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.UniverseType target = null;
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().find_element_user(UNIVERSE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "universe" element
     */
    public boolean isSetUniverse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIVERSE$8) != 0;
        }
    }
    
    /**
     * Sets the "universe" element
     */
    public void setUniverse(edu.umich.icpsr.ddi.UniverseType universe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.UniverseType target = null;
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().find_element_user(UNIVERSE$8, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.UniverseType)get_store().add_element_user(UNIVERSE$8);
            }
            target.set(universe);
        }
    }
    
    /**
     * Appends and returns a new empty "universe" element
     */
    public edu.umich.icpsr.ddi.UniverseType addNewUniverse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.UniverseType target = null;
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().add_element_user(UNIVERSE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "universe" element
     */
    public void unsetUniverse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIVERSE$8, 0);
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
    public edu.umich.icpsr.ddi.NCubeGrpType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.NCubeGrpType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.NCubeGrpType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NCubeGrpType.Source target = null;
            target = (edu.umich.icpsr.ddi.NCubeGrpType.Source)get_store().find_attribute_user(SOURCE$18);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.NCubeGrpType.Source)get_default_attribute_value(SOURCE$18);
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
    public void setSource(edu.umich.icpsr.ddi.NCubeGrpType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.NCubeGrpType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NCubeGrpType.Source target = null;
            target = (edu.umich.icpsr.ddi.NCubeGrpType.Source)get_store().find_attribute_user(SOURCE$18);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.NCubeGrpType.Source)get_store().add_attribute_user(SOURCE$18);
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
    public edu.umich.icpsr.ddi.NCubeGrpType.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$20);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.NCubeGrpType.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public edu.umich.icpsr.ddi.NCubeGrpType.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NCubeGrpType.Type target = null;
            target = (edu.umich.icpsr.ddi.NCubeGrpType.Type)get_store().find_attribute_user(TYPE$20);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.NCubeGrpType.Type)get_default_attribute_value(TYPE$20);
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
            return get_store().find_attribute_user(TYPE$20) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(edu.umich.icpsr.ddi.NCubeGrpType.Type.Enum type)
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
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(edu.umich.icpsr.ddi.NCubeGrpType.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NCubeGrpType.Type target = null;
            target = (edu.umich.icpsr.ddi.NCubeGrpType.Type)get_store().find_attribute_user(TYPE$20);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.NCubeGrpType.Type)get_store().add_attribute_user(TYPE$20);
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
     * Gets the "nCube" attribute
     */
    public java.util.List getNCube()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NCUBE$22);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "nCube" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetNCube()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(NCUBE$22);
            return target;
        }
    }
    
    /**
     * True if has "nCube" attribute
     */
    public boolean isSetNCube()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NCUBE$22) != null;
        }
    }
    
    /**
     * Sets the "nCube" attribute
     */
    public void setNCube(java.util.List nCube)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NCUBE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NCUBE$22);
            }
            target.setListValue(nCube);
        }
    }
    
    /**
     * Sets (as xml) the "nCube" attribute
     */
    public void xsetNCube(org.apache.xmlbeans.XmlIDREFS nCube)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(NCUBE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(NCUBE$22);
            }
            target.set(nCube);
        }
    }
    
    /**
     * Unsets the "nCube" attribute
     */
    public void unsetNCube()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NCUBE$22);
        }
    }
    
    /**
     * Gets the "nCubeGrp" attribute
     */
    public java.util.List getNCubeGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NCUBEGRP$24);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "nCubeGrp" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetNCubeGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(NCUBEGRP$24);
            return target;
        }
    }
    
    /**
     * True if has "nCubeGrp" attribute
     */
    public boolean isSetNCubeGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NCUBEGRP$24) != null;
        }
    }
    
    /**
     * Sets the "nCubeGrp" attribute
     */
    public void setNCubeGrp(java.util.List nCubeGrp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NCUBEGRP$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NCUBEGRP$24);
            }
            target.setListValue(nCubeGrp);
        }
    }
    
    /**
     * Sets (as xml) the "nCubeGrp" attribute
     */
    public void xsetNCubeGrp(org.apache.xmlbeans.XmlIDREFS nCubeGrp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(NCUBEGRP$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(NCUBEGRP$24);
            }
            target.set(nCubeGrp);
        }
    }
    
    /**
     * Unsets the "nCubeGrp" attribute
     */
    public void unsetNCubeGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NCUBEGRP$24);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$26);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$26) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$26);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$26);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SDATREFS$28);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(SDATREFS$28);
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
            return get_store().find_attribute_user(SDATREFS$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SDATREFS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SDATREFS$28);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(SDATREFS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(SDATREFS$28);
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
            get_store().remove_attribute(SDATREFS$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHREFS$30);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(METHREFS$30);
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
            return get_store().find_attribute_user(METHREFS$30) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHREFS$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHREFS$30);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(METHREFS$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(METHREFS$30);
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
            get_store().remove_attribute(METHREFS$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBREFS$32);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(PUBREFS$32);
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
            return get_store().find_attribute_user(PUBREFS$32) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBREFS$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBREFS$32);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(PUBREFS$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(PUBREFS$32);
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
            get_store().remove_attribute(PUBREFS$32);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCESS$34);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(ACCESS$34);
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
            return get_store().find_attribute_user(ACCESS$34) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCESS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCESS$34);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(ACCESS$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(ACCESS$34);
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
            get_store().remove_attribute(ACCESS$34);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.NCubeGrpType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.NCubeGrpType.Source
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
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.NCubeGrpType$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.NCubeGrpType.Type
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
