/*
 * XML Type:  sumStatType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.SumStatType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML sumStatType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class SumStatTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.SumStatType
{
    private static final long serialVersionUID = 1L;
    
    public SumStatTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINK$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "Link");
    private static final javax.xml.namespace.QName EXTLINK$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "ExtLink");
    private static final javax.xml.namespace.QName DIV$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "div");
    private static final javax.xml.namespace.QName EMPH$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "emph");
    private static final javax.xml.namespace.QName HEAD$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "head");
    private static final javax.xml.namespace.QName HI$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "hi");
    private static final javax.xml.namespace.QName LIST$12 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "list");
    private static final javax.xml.namespace.QName P$14 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "p");
    private static final javax.xml.namespace.QName ID$16 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$18 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$20 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$22 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName WGTD$24 = 
        new javax.xml.namespace.QName("", "wgtd");
    private static final javax.xml.namespace.QName WGTVAR$26 = 
        new javax.xml.namespace.QName("", "wgt-var");
    private static final javax.xml.namespace.QName WEIGHT$28 = 
        new javax.xml.namespace.QName("", "weight");
    private static final javax.xml.namespace.QName TYPE$30 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets array of all "Link" elements
     */
    public edu.umich.icpsr.ddi.LinkType[] getLinkArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINK$0, targetList);
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
            target = (edu.umich.icpsr.ddi.LinkType)get_store().find_element_user(LINK$0, i);
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
            return get_store().count_elements(LINK$0);
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
            arraySetterHelper(linkArray, LINK$0);
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
            target = (edu.umich.icpsr.ddi.LinkType)get_store().find_element_user(LINK$0, i);
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
            target = (edu.umich.icpsr.ddi.LinkType)get_store().insert_element_user(LINK$0, i);
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
            target = (edu.umich.icpsr.ddi.LinkType)get_store().add_element_user(LINK$0);
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
            get_store().remove_element(LINK$0, i);
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
            get_store().find_all_element_users(EXTLINK$2, targetList);
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
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().find_element_user(EXTLINK$2, i);
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
            return get_store().count_elements(EXTLINK$2);
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
            arraySetterHelper(extLinkArray, EXTLINK$2);
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
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().find_element_user(EXTLINK$2, i);
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
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().insert_element_user(EXTLINK$2, i);
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
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().add_element_user(EXTLINK$2);
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
            get_store().remove_element(EXTLINK$2, i);
        }
    }
    
    /**
     * Gets array of all "div" elements
     */
    public edu.umich.icpsr.ddi.DivType[] getDivArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIV$4, targetList);
            edu.umich.icpsr.ddi.DivType[] result = new edu.umich.icpsr.ddi.DivType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "div" element
     */
    public edu.umich.icpsr.ddi.DivType getDivArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DivType target = null;
            target = (edu.umich.icpsr.ddi.DivType)get_store().find_element_user(DIV$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "div" element
     */
    public int sizeOfDivArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIV$4);
        }
    }
    
    /**
     * Sets array of all "div" element
     */
    public void setDivArray(edu.umich.icpsr.ddi.DivType[] divArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(divArray, DIV$4);
        }
    }
    
    /**
     * Sets ith "div" element
     */
    public void setDivArray(int i, edu.umich.icpsr.ddi.DivType div)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DivType target = null;
            target = (edu.umich.icpsr.ddi.DivType)get_store().find_element_user(DIV$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(div);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "div" element
     */
    public edu.umich.icpsr.ddi.DivType insertNewDiv(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DivType target = null;
            target = (edu.umich.icpsr.ddi.DivType)get_store().insert_element_user(DIV$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "div" element
     */
    public edu.umich.icpsr.ddi.DivType addNewDiv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DivType target = null;
            target = (edu.umich.icpsr.ddi.DivType)get_store().add_element_user(DIV$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "div" element
     */
    public void removeDiv(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIV$4, i);
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
            get_store().find_all_element_users(EMPH$6, targetList);
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
            target = (edu.umich.icpsr.ddi.EmphType)get_store().find_element_user(EMPH$6, i);
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
            return get_store().count_elements(EMPH$6);
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
            arraySetterHelper(emphArray, EMPH$6);
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
            target = (edu.umich.icpsr.ddi.EmphType)get_store().find_element_user(EMPH$6, i);
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
            target = (edu.umich.icpsr.ddi.EmphType)get_store().insert_element_user(EMPH$6, i);
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
            target = (edu.umich.icpsr.ddi.EmphType)get_store().add_element_user(EMPH$6);
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
            get_store().remove_element(EMPH$6, i);
        }
    }
    
    /**
     * Gets array of all "head" elements
     */
    public edu.umich.icpsr.ddi.HeadType[] getHeadArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HEAD$8, targetList);
            edu.umich.icpsr.ddi.HeadType[] result = new edu.umich.icpsr.ddi.HeadType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "head" element
     */
    public edu.umich.icpsr.ddi.HeadType getHeadArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HeadType target = null;
            target = (edu.umich.icpsr.ddi.HeadType)get_store().find_element_user(HEAD$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "head" element
     */
    public int sizeOfHeadArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEAD$8);
        }
    }
    
    /**
     * Sets array of all "head" element
     */
    public void setHeadArray(edu.umich.icpsr.ddi.HeadType[] headArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(headArray, HEAD$8);
        }
    }
    
    /**
     * Sets ith "head" element
     */
    public void setHeadArray(int i, edu.umich.icpsr.ddi.HeadType head)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HeadType target = null;
            target = (edu.umich.icpsr.ddi.HeadType)get_store().find_element_user(HEAD$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(head);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "head" element
     */
    public edu.umich.icpsr.ddi.HeadType insertNewHead(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HeadType target = null;
            target = (edu.umich.icpsr.ddi.HeadType)get_store().insert_element_user(HEAD$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "head" element
     */
    public edu.umich.icpsr.ddi.HeadType addNewHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HeadType target = null;
            target = (edu.umich.icpsr.ddi.HeadType)get_store().add_element_user(HEAD$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "head" element
     */
    public void removeHead(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEAD$8, i);
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
            get_store().find_all_element_users(HI$10, targetList);
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
            target = (edu.umich.icpsr.ddi.HiType)get_store().find_element_user(HI$10, i);
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
            return get_store().count_elements(HI$10);
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
            arraySetterHelper(hiArray, HI$10);
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
            target = (edu.umich.icpsr.ddi.HiType)get_store().find_element_user(HI$10, i);
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
            target = (edu.umich.icpsr.ddi.HiType)get_store().insert_element_user(HI$10, i);
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
            target = (edu.umich.icpsr.ddi.HiType)get_store().add_element_user(HI$10);
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
            get_store().remove_element(HI$10, i);
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
            get_store().find_all_element_users(LIST$12, targetList);
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
            target = (edu.umich.icpsr.ddi.ListType)get_store().find_element_user(LIST$12, i);
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
            return get_store().count_elements(LIST$12);
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
            arraySetterHelper(listArray, LIST$12);
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
            target = (edu.umich.icpsr.ddi.ListType)get_store().find_element_user(LIST$12, i);
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
            target = (edu.umich.icpsr.ddi.ListType)get_store().insert_element_user(LIST$12, i);
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
            target = (edu.umich.icpsr.ddi.ListType)get_store().add_element_user(LIST$12);
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
            get_store().remove_element(LIST$12, i);
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
            get_store().find_all_element_users(P$14, targetList);
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
            target = (edu.umich.icpsr.ddi.PType)get_store().find_element_user(P$14, i);
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
            return get_store().count_elements(P$14);
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
            arraySetterHelper(pArray, P$14);
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
            target = (edu.umich.icpsr.ddi.PType)get_store().find_element_user(P$14, i);
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
            target = (edu.umich.icpsr.ddi.PType)get_store().insert_element_user(P$14, i);
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
            target = (edu.umich.icpsr.ddi.PType)get_store().add_element_user(P$14);
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
            get_store().remove_element(P$14, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$16);
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
            return get_store().find_attribute_user(ID$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$16);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$16);
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
            get_store().remove_attribute(ID$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$18);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$18);
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
            return get_store().find_attribute_user(XMLLANG$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$18);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$18);
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
            get_store().remove_attribute(XMLLANG$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$20);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$20);
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
            return get_store().find_attribute_user(LANG$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$20);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$20);
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
            get_store().remove_attribute(LANG$20);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.SumStatType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$22);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.SumStatType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.SumStatType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SumStatType.Source target = null;
            target = (edu.umich.icpsr.ddi.SumStatType.Source)get_store().find_attribute_user(SOURCE$22);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SumStatType.Source)get_default_attribute_value(SOURCE$22);
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
            return get_store().find_attribute_user(SOURCE$22) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.SumStatType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$22);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.SumStatType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SumStatType.Source target = null;
            target = (edu.umich.icpsr.ddi.SumStatType.Source)get_store().find_attribute_user(SOURCE$22);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SumStatType.Source)get_store().add_attribute_user(SOURCE$22);
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
            get_store().remove_attribute(SOURCE$22);
        }
    }
    
    /**
     * Gets the "wgtd" attribute
     */
    public edu.umich.icpsr.ddi.SumStatType.Wgtd.Enum getWgtd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WGTD$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(WGTD$24);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.SumStatType.Wgtd.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "wgtd" attribute
     */
    public edu.umich.icpsr.ddi.SumStatType.Wgtd xgetWgtd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SumStatType.Wgtd target = null;
            target = (edu.umich.icpsr.ddi.SumStatType.Wgtd)get_store().find_attribute_user(WGTD$24);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SumStatType.Wgtd)get_default_attribute_value(WGTD$24);
            }
            return target;
        }
    }
    
    /**
     * True if has "wgtd" attribute
     */
    public boolean isSetWgtd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WGTD$24) != null;
        }
    }
    
    /**
     * Sets the "wgtd" attribute
     */
    public void setWgtd(edu.umich.icpsr.ddi.SumStatType.Wgtd.Enum wgtd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WGTD$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WGTD$24);
            }
            target.setEnumValue(wgtd);
        }
    }
    
    /**
     * Sets (as xml) the "wgtd" attribute
     */
    public void xsetWgtd(edu.umich.icpsr.ddi.SumStatType.Wgtd wgtd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SumStatType.Wgtd target = null;
            target = (edu.umich.icpsr.ddi.SumStatType.Wgtd)get_store().find_attribute_user(WGTD$24);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SumStatType.Wgtd)get_store().add_attribute_user(WGTD$24);
            }
            target.set(wgtd);
        }
    }
    
    /**
     * Unsets the "wgtd" attribute
     */
    public void unsetWgtd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WGTD$24);
        }
    }
    
    /**
     * Gets the "wgt-var" attribute
     */
    public java.util.List getWgtVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WGTVAR$26);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "wgt-var" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetWgtVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(WGTVAR$26);
            return target;
        }
    }
    
    /**
     * True if has "wgt-var" attribute
     */
    public boolean isSetWgtVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WGTVAR$26) != null;
        }
    }
    
    /**
     * Sets the "wgt-var" attribute
     */
    public void setWgtVar(java.util.List wgtVar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WGTVAR$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WGTVAR$26);
            }
            target.setListValue(wgtVar);
        }
    }
    
    /**
     * Sets (as xml) the "wgt-var" attribute
     */
    public void xsetWgtVar(org.apache.xmlbeans.XmlIDREFS wgtVar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(WGTVAR$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(WGTVAR$26);
            }
            target.set(wgtVar);
        }
    }
    
    /**
     * Unsets the "wgt-var" attribute
     */
    public void unsetWgtVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WGTVAR$26);
        }
    }
    
    /**
     * Gets the "weight" attribute
     */
    public java.util.List getWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEIGHT$28);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "weight" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(WEIGHT$28);
            return target;
        }
    }
    
    /**
     * True if has "weight" attribute
     */
    public boolean isSetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WEIGHT$28) != null;
        }
    }
    
    /**
     * Sets the "weight" attribute
     */
    public void setWeight(java.util.List weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEIGHT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEIGHT$28);
            }
            target.setListValue(weight);
        }
    }
    
    /**
     * Sets (as xml) the "weight" attribute
     */
    public void xsetWeight(org.apache.xmlbeans.XmlIDREFS weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(WEIGHT$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(WEIGHT$28);
            }
            target.set(weight);
        }
    }
    
    /**
     * Unsets the "weight" attribute
     */
    public void unsetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WEIGHT$28);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public edu.umich.icpsr.ddi.SumStatType.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$30);
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.SumStatType.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public edu.umich.icpsr.ddi.SumStatType.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SumStatType.Type target = null;
            target = (edu.umich.icpsr.ddi.SumStatType.Type)get_store().find_attribute_user(TYPE$30);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(edu.umich.icpsr.ddi.SumStatType.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$30);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(edu.umich.icpsr.ddi.SumStatType.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SumStatType.Type target = null;
            target = (edu.umich.icpsr.ddi.SumStatType.Type)get_store().find_attribute_user(TYPE$30);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SumStatType.Type)get_store().add_attribute_user(TYPE$30);
            }
            target.set(type);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.SumStatType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.SumStatType.Source
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
     * An XML wgtd(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.SumStatType$Wgtd.
     */
    public static class WgtdImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.SumStatType.Wgtd
    {
        private static final long serialVersionUID = 1L;
        
        public WgtdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected WgtdImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.SumStatType$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.SumStatType.Type
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
