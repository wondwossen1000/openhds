/*
 * XML Type:  itmType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.ItmType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML itmType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class ItmTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.ItmType
{
    private static final long serialVersionUID = 1L;
    
    public ItmTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABEL$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "label");
    private static final javax.xml.namespace.QName EMPH$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "emph");
    private static final javax.xml.namespace.QName HI$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "hi");
    private static final javax.xml.namespace.QName LIST$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "list");
    private static final javax.xml.namespace.QName P$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "p");
    private static final javax.xml.namespace.QName LINK$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "Link");
    private static final javax.xml.namespace.QName EXTLINK$12 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "ExtLink");
    private static final javax.xml.namespace.QName ID$14 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$16 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$18 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$20 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName N$22 = 
        new javax.xml.namespace.QName("", "n");
    private static final javax.xml.namespace.QName REND$24 = 
        new javax.xml.namespace.QName("", "rend");
    
    
    /**
     * Gets array of all "label" elements
     */
    public edu.umich.icpsr.ddi.LabelType[] getLabelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LABEL$0, targetList);
            edu.umich.icpsr.ddi.LabelType[] result = new edu.umich.icpsr.ddi.LabelType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "label" element
     */
    public edu.umich.icpsr.ddi.LabelType getLabelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LabelType target = null;
            target = (edu.umich.icpsr.ddi.LabelType)get_store().find_element_user(LABEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "label" element
     */
    public int sizeOfLabelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LABEL$0);
        }
    }
    
    /**
     * Sets array of all "label" element
     */
    public void setLabelArray(edu.umich.icpsr.ddi.LabelType[] labelArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(labelArray, LABEL$0);
        }
    }
    
    /**
     * Sets ith "label" element
     */
    public void setLabelArray(int i, edu.umich.icpsr.ddi.LabelType label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LabelType target = null;
            target = (edu.umich.icpsr.ddi.LabelType)get_store().find_element_user(LABEL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(label);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "label" element
     */
    public edu.umich.icpsr.ddi.LabelType insertNewLabel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LabelType target = null;
            target = (edu.umich.icpsr.ddi.LabelType)get_store().insert_element_user(LABEL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "label" element
     */
    public edu.umich.icpsr.ddi.LabelType addNewLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LabelType target = null;
            target = (edu.umich.icpsr.ddi.LabelType)get_store().add_element_user(LABEL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "label" element
     */
    public void removeLabel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LABEL$0, i);
        }
    }
    
    /**
     * Gets array of all "emph" elements
     */
    public edu.umich.icpsr.ddi.EmphType[] getEmphArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMPH$2, targetList);
            edu.umich.icpsr.ddi.EmphType[] result = new edu.umich.icpsr.ddi.EmphType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "emph" element
     */
    public edu.umich.icpsr.ddi.EmphType getEmphArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EmphType target = null;
            target = (edu.umich.icpsr.ddi.EmphType)get_store().find_element_user(EMPH$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "emph" element
     */
    public int sizeOfEmphArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMPH$2);
        }
    }
    
    /**
     * Sets array of all "emph" element
     */
    public void setEmphArray(edu.umich.icpsr.ddi.EmphType[] emphArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(emphArray, EMPH$2);
        }
    }
    
    /**
     * Sets ith "emph" element
     */
    public void setEmphArray(int i, edu.umich.icpsr.ddi.EmphType emph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EmphType target = null;
            target = (edu.umich.icpsr.ddi.EmphType)get_store().find_element_user(EMPH$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(emph);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "emph" element
     */
    public edu.umich.icpsr.ddi.EmphType insertNewEmph(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EmphType target = null;
            target = (edu.umich.icpsr.ddi.EmphType)get_store().insert_element_user(EMPH$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "emph" element
     */
    public edu.umich.icpsr.ddi.EmphType addNewEmph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EmphType target = null;
            target = (edu.umich.icpsr.ddi.EmphType)get_store().add_element_user(EMPH$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "emph" element
     */
    public void removeEmph(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMPH$2, i);
        }
    }
    
    /**
     * Gets array of all "hi" elements
     */
    public edu.umich.icpsr.ddi.HiType[] getHiArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HI$4, targetList);
            edu.umich.icpsr.ddi.HiType[] result = new edu.umich.icpsr.ddi.HiType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "hi" element
     */
    public edu.umich.icpsr.ddi.HiType getHiArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HiType target = null;
            target = (edu.umich.icpsr.ddi.HiType)get_store().find_element_user(HI$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "hi" element
     */
    public int sizeOfHiArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HI$4);
        }
    }
    
    /**
     * Sets array of all "hi" element
     */
    public void setHiArray(edu.umich.icpsr.ddi.HiType[] hiArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(hiArray, HI$4);
        }
    }
    
    /**
     * Sets ith "hi" element
     */
    public void setHiArray(int i, edu.umich.icpsr.ddi.HiType hi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HiType target = null;
            target = (edu.umich.icpsr.ddi.HiType)get_store().find_element_user(HI$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(hi);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hi" element
     */
    public edu.umich.icpsr.ddi.HiType insertNewHi(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HiType target = null;
            target = (edu.umich.icpsr.ddi.HiType)get_store().insert_element_user(HI$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hi" element
     */
    public edu.umich.icpsr.ddi.HiType addNewHi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HiType target = null;
            target = (edu.umich.icpsr.ddi.HiType)get_store().add_element_user(HI$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "hi" element
     */
    public void removeHi(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HI$4, i);
        }
    }
    
    /**
     * Gets array of all "list" elements
     */
    public edu.umich.icpsr.ddi.ListType[] getListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LIST$6, targetList);
            edu.umich.icpsr.ddi.ListType[] result = new edu.umich.icpsr.ddi.ListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "list" element
     */
    public edu.umich.icpsr.ddi.ListType getListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ListType target = null;
            target = (edu.umich.icpsr.ddi.ListType)get_store().find_element_user(LIST$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "list" element
     */
    public int sizeOfListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIST$6);
        }
    }
    
    /**
     * Sets array of all "list" element
     */
    public void setListArray(edu.umich.icpsr.ddi.ListType[] listArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(listArray, LIST$6);
        }
    }
    
    /**
     * Sets ith "list" element
     */
    public void setListArray(int i, edu.umich.icpsr.ddi.ListType list)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ListType target = null;
            target = (edu.umich.icpsr.ddi.ListType)get_store().find_element_user(LIST$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(list);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "list" element
     */
    public edu.umich.icpsr.ddi.ListType insertNewList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ListType target = null;
            target = (edu.umich.icpsr.ddi.ListType)get_store().insert_element_user(LIST$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "list" element
     */
    public edu.umich.icpsr.ddi.ListType addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ListType target = null;
            target = (edu.umich.icpsr.ddi.ListType)get_store().add_element_user(LIST$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "list" element
     */
    public void removeList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIST$6, i);
        }
    }
    
    /**
     * Gets array of all "p" elements
     */
    public edu.umich.icpsr.ddi.PType[] getPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(P$8, targetList);
            edu.umich.icpsr.ddi.PType[] result = new edu.umich.icpsr.ddi.PType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "p" element
     */
    public edu.umich.icpsr.ddi.PType getPArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PType target = null;
            target = (edu.umich.icpsr.ddi.PType)get_store().find_element_user(P$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "p" element
     */
    public int sizeOfPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(P$8);
        }
    }
    
    /**
     * Sets array of all "p" element
     */
    public void setPArray(edu.umich.icpsr.ddi.PType[] pArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pArray, P$8);
        }
    }
    
    /**
     * Sets ith "p" element
     */
    public void setPArray(int i, edu.umich.icpsr.ddi.PType p)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PType target = null;
            target = (edu.umich.icpsr.ddi.PType)get_store().find_element_user(P$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(p);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "p" element
     */
    public edu.umich.icpsr.ddi.PType insertNewP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PType target = null;
            target = (edu.umich.icpsr.ddi.PType)get_store().insert_element_user(P$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "p" element
     */
    public edu.umich.icpsr.ddi.PType addNewP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PType target = null;
            target = (edu.umich.icpsr.ddi.PType)get_store().add_element_user(P$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "p" element
     */
    public void removeP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(P$8, i);
        }
    }
    
    /**
     * Gets array of all "Link" elements
     */
    public edu.umich.icpsr.ddi.LinkType[] getLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINK$10, targetList);
            edu.umich.icpsr.ddi.LinkType[] result = new edu.umich.icpsr.ddi.LinkType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Link" element
     */
    public edu.umich.icpsr.ddi.LinkType getLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LinkType target = null;
            target = (edu.umich.icpsr.ddi.LinkType)get_store().find_element_user(LINK$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Link" element
     */
    public int sizeOfLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINK$10);
        }
    }
    
    /**
     * Sets array of all "Link" element
     */
    public void setLinkArray(edu.umich.icpsr.ddi.LinkType[] linkArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linkArray, LINK$10);
        }
    }
    
    /**
     * Sets ith "Link" element
     */
    public void setLinkArray(int i, edu.umich.icpsr.ddi.LinkType link)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LinkType target = null;
            target = (edu.umich.icpsr.ddi.LinkType)get_store().find_element_user(LINK$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(link);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Link" element
     */
    public edu.umich.icpsr.ddi.LinkType insertNewLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LinkType target = null;
            target = (edu.umich.icpsr.ddi.LinkType)get_store().insert_element_user(LINK$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Link" element
     */
    public edu.umich.icpsr.ddi.LinkType addNewLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LinkType target = null;
            target = (edu.umich.icpsr.ddi.LinkType)get_store().add_element_user(LINK$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "Link" element
     */
    public void removeLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINK$10, i);
        }
    }
    
    /**
     * Gets array of all "ExtLink" elements
     */
    public edu.umich.icpsr.ddi.ExtLinkType[] getExtLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTLINK$12, targetList);
            edu.umich.icpsr.ddi.ExtLinkType[] result = new edu.umich.icpsr.ddi.ExtLinkType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ExtLink" element
     */
    public edu.umich.icpsr.ddi.ExtLinkType getExtLinkArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ExtLinkType target = null;
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().find_element_user(EXTLINK$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ExtLink" element
     */
    public int sizeOfExtLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTLINK$12);
        }
    }
    
    /**
     * Sets array of all "ExtLink" element
     */
    public void setExtLinkArray(edu.umich.icpsr.ddi.ExtLinkType[] extLinkArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(extLinkArray, EXTLINK$12);
        }
    }
    
    /**
     * Sets ith "ExtLink" element
     */
    public void setExtLinkArray(int i, edu.umich.icpsr.ddi.ExtLinkType extLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ExtLinkType target = null;
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().find_element_user(EXTLINK$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extLink);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ExtLink" element
     */
    public edu.umich.icpsr.ddi.ExtLinkType insertNewExtLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ExtLinkType target = null;
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().insert_element_user(EXTLINK$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ExtLink" element
     */
    public edu.umich.icpsr.ddi.ExtLinkType addNewExtLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ExtLinkType target = null;
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().add_element_user(EXTLINK$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "ExtLink" element
     */
    public void removeExtLink(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTLINK$12, i);
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
    public edu.umich.icpsr.ddi.ItmType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.ItmType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.ItmType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ItmType.Source target = null;
            target = (edu.umich.icpsr.ddi.ItmType.Source)get_store().find_attribute_user(SOURCE$20);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.ItmType.Source)get_default_attribute_value(SOURCE$20);
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
    public void setSource(edu.umich.icpsr.ddi.ItmType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.ItmType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ItmType.Source target = null;
            target = (edu.umich.icpsr.ddi.ItmType.Source)get_store().find_attribute_user(SOURCE$20);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.ItmType.Source)get_store().add_attribute_user(SOURCE$20);
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
     * Gets the "n" attribute
     */
    public java.lang.String getN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(N$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "n" attribute
     */
    public org.apache.xmlbeans.XmlString xgetN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(N$22);
            return target;
        }
    }
    
    /**
     * True if has "n" attribute
     */
    public boolean isSetN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(N$22) != null;
        }
    }
    
    /**
     * Sets the "n" attribute
     */
    public void setN(java.lang.String n)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(N$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(N$22);
            }
            target.setStringValue(n);
        }
    }
    
    /**
     * Sets (as xml) the "n" attribute
     */
    public void xsetN(org.apache.xmlbeans.XmlString n)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(N$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(N$22);
            }
            target.set(n);
        }
    }
    
    /**
     * Unsets the "n" attribute
     */
    public void unsetN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(N$22);
        }
    }
    
    /**
     * Gets the "rend" attribute
     */
    public java.lang.String getRend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REND$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rend" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REND$24);
            return target;
        }
    }
    
    /**
     * True if has "rend" attribute
     */
    public boolean isSetRend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REND$24) != null;
        }
    }
    
    /**
     * Sets the "rend" attribute
     */
    public void setRend(java.lang.String rend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REND$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REND$24);
            }
            target.setStringValue(rend);
        }
    }
    
    /**
     * Sets (as xml) the "rend" attribute
     */
    public void xsetRend(org.apache.xmlbeans.XmlString rend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(REND$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(REND$24);
            }
            target.set(rend);
        }
    }
    
    /**
     * Unsets the "rend" attribute
     */
    public void unsetRend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REND$24);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.ItmType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.ItmType.Source
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
