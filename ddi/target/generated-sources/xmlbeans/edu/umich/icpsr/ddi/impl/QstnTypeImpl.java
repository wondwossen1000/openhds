/*
 * XML Type:  qstnType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.QstnType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML qstnType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class QstnTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.QstnType
{
    private static final long serialVersionUID = 1L;
    
    public QstnTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREQTXT$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "preQTxt");
    private static final javax.xml.namespace.QName QSTNLIT$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "qstnLit");
    private static final javax.xml.namespace.QName POSTQTXT$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "postQTxt");
    private static final javax.xml.namespace.QName FORWARD$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "forward");
    private static final javax.xml.namespace.QName BACKWARD$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "backward");
    private static final javax.xml.namespace.QName IVUINSTR$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "ivuInstr");
    private static final javax.xml.namespace.QName LINK$12 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "Link");
    private static final javax.xml.namespace.QName EXTLINK$14 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "ExtLink");
    private static final javax.xml.namespace.QName DIV$16 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "div");
    private static final javax.xml.namespace.QName EMPH$18 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "emph");
    private static final javax.xml.namespace.QName HEAD$20 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "head");
    private static final javax.xml.namespace.QName HI$22 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "hi");
    private static final javax.xml.namespace.QName LIST$24 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "list");
    private static final javax.xml.namespace.QName P$26 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "p");
    private static final javax.xml.namespace.QName ID$28 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$30 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$32 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$34 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName QSTN$36 = 
        new javax.xml.namespace.QName("", "qstn");
    private static final javax.xml.namespace.QName VAR$38 = 
        new javax.xml.namespace.QName("", "var");
    private static final javax.xml.namespace.QName SEQNO$40 = 
        new javax.xml.namespace.QName("", "seqNo");
    private static final javax.xml.namespace.QName SDATREFS$42 = 
        new javax.xml.namespace.QName("", "sdatrefs");
    
    
    /**
     * Gets array of all "preQTxt" elements
     */
    public edu.umich.icpsr.ddi.PreQTxtType[] getPreQTxtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PREQTXT$0, targetList);
            edu.umich.icpsr.ddi.PreQTxtType[] result = new edu.umich.icpsr.ddi.PreQTxtType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "preQTxt" element
     */
    public edu.umich.icpsr.ddi.PreQTxtType getPreQTxtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PreQTxtType target = null;
            target = (edu.umich.icpsr.ddi.PreQTxtType)get_store().find_element_user(PREQTXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "preQTxt" element
     */
    public int sizeOfPreQTxtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREQTXT$0);
        }
    }
    
    /**
     * Sets array of all "preQTxt" element
     */
    public void setPreQTxtArray(edu.umich.icpsr.ddi.PreQTxtType[] preQTxtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(preQTxtArray, PREQTXT$0);
        }
    }
    
    /**
     * Sets ith "preQTxt" element
     */
    public void setPreQTxtArray(int i, edu.umich.icpsr.ddi.PreQTxtType preQTxt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PreQTxtType target = null;
            target = (edu.umich.icpsr.ddi.PreQTxtType)get_store().find_element_user(PREQTXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(preQTxt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "preQTxt" element
     */
    public edu.umich.icpsr.ddi.PreQTxtType insertNewPreQTxt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PreQTxtType target = null;
            target = (edu.umich.icpsr.ddi.PreQTxtType)get_store().insert_element_user(PREQTXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "preQTxt" element
     */
    public edu.umich.icpsr.ddi.PreQTxtType addNewPreQTxt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PreQTxtType target = null;
            target = (edu.umich.icpsr.ddi.PreQTxtType)get_store().add_element_user(PREQTXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "preQTxt" element
     */
    public void removePreQTxt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREQTXT$0, i);
        }
    }
    
    /**
     * Gets array of all "qstnLit" elements
     */
    public edu.umich.icpsr.ddi.QstnLitType[] getQstnLitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QSTNLIT$2, targetList);
            edu.umich.icpsr.ddi.QstnLitType[] result = new edu.umich.icpsr.ddi.QstnLitType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "qstnLit" element
     */
    public edu.umich.icpsr.ddi.QstnLitType getQstnLitArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.QstnLitType target = null;
            target = (edu.umich.icpsr.ddi.QstnLitType)get_store().find_element_user(QSTNLIT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "qstnLit" element
     */
    public int sizeOfQstnLitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QSTNLIT$2);
        }
    }
    
    /**
     * Sets array of all "qstnLit" element
     */
    public void setQstnLitArray(edu.umich.icpsr.ddi.QstnLitType[] qstnLitArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(qstnLitArray, QSTNLIT$2);
        }
    }
    
    /**
     * Sets ith "qstnLit" element
     */
    public void setQstnLitArray(int i, edu.umich.icpsr.ddi.QstnLitType qstnLit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.QstnLitType target = null;
            target = (edu.umich.icpsr.ddi.QstnLitType)get_store().find_element_user(QSTNLIT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(qstnLit);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "qstnLit" element
     */
    public edu.umich.icpsr.ddi.QstnLitType insertNewQstnLit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.QstnLitType target = null;
            target = (edu.umich.icpsr.ddi.QstnLitType)get_store().insert_element_user(QSTNLIT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "qstnLit" element
     */
    public edu.umich.icpsr.ddi.QstnLitType addNewQstnLit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.QstnLitType target = null;
            target = (edu.umich.icpsr.ddi.QstnLitType)get_store().add_element_user(QSTNLIT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "qstnLit" element
     */
    public void removeQstnLit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QSTNLIT$2, i);
        }
    }
    
    /**
     * Gets array of all "postQTxt" elements
     */
    public edu.umich.icpsr.ddi.PostQTxtType[] getPostQTxtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POSTQTXT$4, targetList);
            edu.umich.icpsr.ddi.PostQTxtType[] result = new edu.umich.icpsr.ddi.PostQTxtType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "postQTxt" element
     */
    public edu.umich.icpsr.ddi.PostQTxtType getPostQTxtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PostQTxtType target = null;
            target = (edu.umich.icpsr.ddi.PostQTxtType)get_store().find_element_user(POSTQTXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "postQTxt" element
     */
    public int sizeOfPostQTxtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTQTXT$4);
        }
    }
    
    /**
     * Sets array of all "postQTxt" element
     */
    public void setPostQTxtArray(edu.umich.icpsr.ddi.PostQTxtType[] postQTxtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(postQTxtArray, POSTQTXT$4);
        }
    }
    
    /**
     * Sets ith "postQTxt" element
     */
    public void setPostQTxtArray(int i, edu.umich.icpsr.ddi.PostQTxtType postQTxt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PostQTxtType target = null;
            target = (edu.umich.icpsr.ddi.PostQTxtType)get_store().find_element_user(POSTQTXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(postQTxt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "postQTxt" element
     */
    public edu.umich.icpsr.ddi.PostQTxtType insertNewPostQTxt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PostQTxtType target = null;
            target = (edu.umich.icpsr.ddi.PostQTxtType)get_store().insert_element_user(POSTQTXT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "postQTxt" element
     */
    public edu.umich.icpsr.ddi.PostQTxtType addNewPostQTxt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PostQTxtType target = null;
            target = (edu.umich.icpsr.ddi.PostQTxtType)get_store().add_element_user(POSTQTXT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "postQTxt" element
     */
    public void removePostQTxt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTQTXT$4, i);
        }
    }
    
    /**
     * Gets array of all "forward" elements
     */
    public edu.umich.icpsr.ddi.ForwardType[] getForwardArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORWARD$6, targetList);
            edu.umich.icpsr.ddi.ForwardType[] result = new edu.umich.icpsr.ddi.ForwardType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "forward" element
     */
    public edu.umich.icpsr.ddi.ForwardType getForwardArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ForwardType target = null;
            target = (edu.umich.icpsr.ddi.ForwardType)get_store().find_element_user(FORWARD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "forward" element
     */
    public int sizeOfForwardArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORWARD$6);
        }
    }
    
    /**
     * Sets array of all "forward" element
     */
    public void setForwardArray(edu.umich.icpsr.ddi.ForwardType[] forwardArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(forwardArray, FORWARD$6);
        }
    }
    
    /**
     * Sets ith "forward" element
     */
    public void setForwardArray(int i, edu.umich.icpsr.ddi.ForwardType forward)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ForwardType target = null;
            target = (edu.umich.icpsr.ddi.ForwardType)get_store().find_element_user(FORWARD$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(forward);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "forward" element
     */
    public edu.umich.icpsr.ddi.ForwardType insertNewForward(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ForwardType target = null;
            target = (edu.umich.icpsr.ddi.ForwardType)get_store().insert_element_user(FORWARD$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "forward" element
     */
    public edu.umich.icpsr.ddi.ForwardType addNewForward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ForwardType target = null;
            target = (edu.umich.icpsr.ddi.ForwardType)get_store().add_element_user(FORWARD$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "forward" element
     */
    public void removeForward(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORWARD$6, i);
        }
    }
    
    /**
     * Gets array of all "backward" elements
     */
    public edu.umich.icpsr.ddi.BackwardType[] getBackwardArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BACKWARD$8, targetList);
            edu.umich.icpsr.ddi.BackwardType[] result = new edu.umich.icpsr.ddi.BackwardType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "backward" element
     */
    public edu.umich.icpsr.ddi.BackwardType getBackwardArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.BackwardType target = null;
            target = (edu.umich.icpsr.ddi.BackwardType)get_store().find_element_user(BACKWARD$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "backward" element
     */
    public int sizeOfBackwardArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BACKWARD$8);
        }
    }
    
    /**
     * Sets array of all "backward" element
     */
    public void setBackwardArray(edu.umich.icpsr.ddi.BackwardType[] backwardArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(backwardArray, BACKWARD$8);
        }
    }
    
    /**
     * Sets ith "backward" element
     */
    public void setBackwardArray(int i, edu.umich.icpsr.ddi.BackwardType backward)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.BackwardType target = null;
            target = (edu.umich.icpsr.ddi.BackwardType)get_store().find_element_user(BACKWARD$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(backward);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "backward" element
     */
    public edu.umich.icpsr.ddi.BackwardType insertNewBackward(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.BackwardType target = null;
            target = (edu.umich.icpsr.ddi.BackwardType)get_store().insert_element_user(BACKWARD$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "backward" element
     */
    public edu.umich.icpsr.ddi.BackwardType addNewBackward()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.BackwardType target = null;
            target = (edu.umich.icpsr.ddi.BackwardType)get_store().add_element_user(BACKWARD$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "backward" element
     */
    public void removeBackward(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BACKWARD$8, i);
        }
    }
    
    /**
     * Gets array of all "ivuInstr" elements
     */
    public edu.umich.icpsr.ddi.IvuInstrType[] getIvuInstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IVUINSTR$10, targetList);
            edu.umich.icpsr.ddi.IvuInstrType[] result = new edu.umich.icpsr.ddi.IvuInstrType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ivuInstr" element
     */
    public edu.umich.icpsr.ddi.IvuInstrType getIvuInstrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.IvuInstrType target = null;
            target = (edu.umich.icpsr.ddi.IvuInstrType)get_store().find_element_user(IVUINSTR$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ivuInstr" element
     */
    public int sizeOfIvuInstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IVUINSTR$10);
        }
    }
    
    /**
     * Sets array of all "ivuInstr" element
     */
    public void setIvuInstrArray(edu.umich.icpsr.ddi.IvuInstrType[] ivuInstrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ivuInstrArray, IVUINSTR$10);
        }
    }
    
    /**
     * Sets ith "ivuInstr" element
     */
    public void setIvuInstrArray(int i, edu.umich.icpsr.ddi.IvuInstrType ivuInstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.IvuInstrType target = null;
            target = (edu.umich.icpsr.ddi.IvuInstrType)get_store().find_element_user(IVUINSTR$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ivuInstr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ivuInstr" element
     */
    public edu.umich.icpsr.ddi.IvuInstrType insertNewIvuInstr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.IvuInstrType target = null;
            target = (edu.umich.icpsr.ddi.IvuInstrType)get_store().insert_element_user(IVUINSTR$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ivuInstr" element
     */
    public edu.umich.icpsr.ddi.IvuInstrType addNewIvuInstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.IvuInstrType target = null;
            target = (edu.umich.icpsr.ddi.IvuInstrType)get_store().add_element_user(IVUINSTR$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "ivuInstr" element
     */
    public void removeIvuInstr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IVUINSTR$10, i);
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
            get_store().find_all_element_users(LINK$12, targetList);
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
            target = (edu.umich.icpsr.ddi.LinkType)get_store().find_element_user(LINK$12, i);
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
            return get_store().count_elements(LINK$12);
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
            arraySetterHelper(linkArray, LINK$12);
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
            target = (edu.umich.icpsr.ddi.LinkType)get_store().find_element_user(LINK$12, i);
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
            target = (edu.umich.icpsr.ddi.LinkType)get_store().insert_element_user(LINK$12, i);
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
            target = (edu.umich.icpsr.ddi.LinkType)get_store().add_element_user(LINK$12);
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
            get_store().remove_element(LINK$12, i);
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
            get_store().find_all_element_users(EXTLINK$14, targetList);
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
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().find_element_user(EXTLINK$14, i);
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
            return get_store().count_elements(EXTLINK$14);
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
            arraySetterHelper(extLinkArray, EXTLINK$14);
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
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().find_element_user(EXTLINK$14, i);
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
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().insert_element_user(EXTLINK$14, i);
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
            target = (edu.umich.icpsr.ddi.ExtLinkType)get_store().add_element_user(EXTLINK$14);
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
            get_store().remove_element(EXTLINK$14, i);
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
            get_store().find_all_element_users(DIV$16, targetList);
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
            target = (edu.umich.icpsr.ddi.DivType)get_store().find_element_user(DIV$16, i);
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
            return get_store().count_elements(DIV$16);
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
            arraySetterHelper(divArray, DIV$16);
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
            target = (edu.umich.icpsr.ddi.DivType)get_store().find_element_user(DIV$16, i);
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
            target = (edu.umich.icpsr.ddi.DivType)get_store().insert_element_user(DIV$16, i);
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
            target = (edu.umich.icpsr.ddi.DivType)get_store().add_element_user(DIV$16);
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
            get_store().remove_element(DIV$16, i);
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
            get_store().find_all_element_users(EMPH$18, targetList);
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
            target = (edu.umich.icpsr.ddi.EmphType)get_store().find_element_user(EMPH$18, i);
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
            return get_store().count_elements(EMPH$18);
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
            arraySetterHelper(emphArray, EMPH$18);
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
            target = (edu.umich.icpsr.ddi.EmphType)get_store().find_element_user(EMPH$18, i);
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
            target = (edu.umich.icpsr.ddi.EmphType)get_store().insert_element_user(EMPH$18, i);
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
            target = (edu.umich.icpsr.ddi.EmphType)get_store().add_element_user(EMPH$18);
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
            get_store().remove_element(EMPH$18, i);
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
            get_store().find_all_element_users(HEAD$20, targetList);
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
            target = (edu.umich.icpsr.ddi.HeadType)get_store().find_element_user(HEAD$20, i);
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
            return get_store().count_elements(HEAD$20);
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
            arraySetterHelper(headArray, HEAD$20);
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
            target = (edu.umich.icpsr.ddi.HeadType)get_store().find_element_user(HEAD$20, i);
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
            target = (edu.umich.icpsr.ddi.HeadType)get_store().insert_element_user(HEAD$20, i);
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
            target = (edu.umich.icpsr.ddi.HeadType)get_store().add_element_user(HEAD$20);
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
            get_store().remove_element(HEAD$20, i);
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
            get_store().find_all_element_users(HI$22, targetList);
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
            target = (edu.umich.icpsr.ddi.HiType)get_store().find_element_user(HI$22, i);
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
            return get_store().count_elements(HI$22);
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
            arraySetterHelper(hiArray, HI$22);
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
            target = (edu.umich.icpsr.ddi.HiType)get_store().find_element_user(HI$22, i);
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
            target = (edu.umich.icpsr.ddi.HiType)get_store().insert_element_user(HI$22, i);
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
            target = (edu.umich.icpsr.ddi.HiType)get_store().add_element_user(HI$22);
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
            get_store().remove_element(HI$22, i);
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
            get_store().find_all_element_users(LIST$24, targetList);
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
            target = (edu.umich.icpsr.ddi.ListType)get_store().find_element_user(LIST$24, i);
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
            return get_store().count_elements(LIST$24);
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
            arraySetterHelper(listArray, LIST$24);
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
            target = (edu.umich.icpsr.ddi.ListType)get_store().find_element_user(LIST$24, i);
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
            target = (edu.umich.icpsr.ddi.ListType)get_store().insert_element_user(LIST$24, i);
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
            target = (edu.umich.icpsr.ddi.ListType)get_store().add_element_user(LIST$24);
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
            get_store().remove_element(LIST$24, i);
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
            get_store().find_all_element_users(P$26, targetList);
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
            target = (edu.umich.icpsr.ddi.PType)get_store().find_element_user(P$26, i);
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
            return get_store().count_elements(P$26);
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
            arraySetterHelper(pArray, P$26);
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
            target = (edu.umich.icpsr.ddi.PType)get_store().find_element_user(P$26, i);
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
            target = (edu.umich.icpsr.ddi.PType)get_store().insert_element_user(P$26, i);
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
            target = (edu.umich.icpsr.ddi.PType)get_store().add_element_user(P$26);
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
            get_store().remove_element(P$26, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$28);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$28);
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
            return get_store().find_attribute_user(ID$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$28);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$28);
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
            get_store().remove_attribute(ID$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$30);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$30);
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
            return get_store().find_attribute_user(XMLLANG$30) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$30);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$30);
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
            get_store().remove_attribute(XMLLANG$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$32);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$32);
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
            return get_store().find_attribute_user(LANG$32) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$32);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$32);
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
            get_store().remove_attribute(LANG$32);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.QstnType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$34);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.QstnType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.QstnType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.QstnType.Source target = null;
            target = (edu.umich.icpsr.ddi.QstnType.Source)get_store().find_attribute_user(SOURCE$34);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.QstnType.Source)get_default_attribute_value(SOURCE$34);
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
            return get_store().find_attribute_user(SOURCE$34) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.QstnType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$34);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.QstnType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.QstnType.Source target = null;
            target = (edu.umich.icpsr.ddi.QstnType.Source)get_store().find_attribute_user(SOURCE$34);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.QstnType.Source)get_store().add_attribute_user(SOURCE$34);
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
            get_store().remove_attribute(SOURCE$34);
        }
    }
    
    /**
     * Gets the "qstn" attribute
     */
    public java.lang.String getQstn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QSTN$36);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "qstn" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetQstn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(QSTN$36);
            return target;
        }
    }
    
    /**
     * True if has "qstn" attribute
     */
    public boolean isSetQstn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QSTN$36) != null;
        }
    }
    
    /**
     * Sets the "qstn" attribute
     */
    public void setQstn(java.lang.String qstn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QSTN$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QSTN$36);
            }
            target.setStringValue(qstn);
        }
    }
    
    /**
     * Sets (as xml) the "qstn" attribute
     */
    public void xsetQstn(org.apache.xmlbeans.XmlIDREF qstn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(QSTN$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(QSTN$36);
            }
            target.set(qstn);
        }
    }
    
    /**
     * Unsets the "qstn" attribute
     */
    public void unsetQstn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QSTN$36);
        }
    }
    
    /**
     * Gets the "var" attribute
     */
    public java.util.List getVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAR$38);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "var" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(VAR$38);
            return target;
        }
    }
    
    /**
     * True if has "var" attribute
     */
    public boolean isSetVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VAR$38) != null;
        }
    }
    
    /**
     * Sets the "var" attribute
     */
    public void setVar(java.util.List var)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VAR$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VAR$38);
            }
            target.setListValue(var);
        }
    }
    
    /**
     * Sets (as xml) the "var" attribute
     */
    public void xsetVar(org.apache.xmlbeans.XmlIDREFS var)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(VAR$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(VAR$38);
            }
            target.set(var);
        }
    }
    
    /**
     * Unsets the "var" attribute
     */
    public void unsetVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VAR$38);
        }
    }
    
    /**
     * Gets the "seqNo" attribute
     */
    public java.lang.String getSeqNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEQNO$40);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "seqNo" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSeqNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEQNO$40);
            return target;
        }
    }
    
    /**
     * True if has "seqNo" attribute
     */
    public boolean isSetSeqNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SEQNO$40) != null;
        }
    }
    
    /**
     * Sets the "seqNo" attribute
     */
    public void setSeqNo(java.lang.String seqNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEQNO$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEQNO$40);
            }
            target.setStringValue(seqNo);
        }
    }
    
    /**
     * Sets (as xml) the "seqNo" attribute
     */
    public void xsetSeqNo(org.apache.xmlbeans.XmlString seqNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SEQNO$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SEQNO$40);
            }
            target.set(seqNo);
        }
    }
    
    /**
     * Unsets the "seqNo" attribute
     */
    public void unsetSeqNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SEQNO$40);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SDATREFS$42);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(SDATREFS$42);
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
            return get_store().find_attribute_user(SDATREFS$42) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SDATREFS$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SDATREFS$42);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(SDATREFS$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(SDATREFS$42);
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
            get_store().remove_attribute(SDATREFS$42);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.QstnType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.QstnType.Source
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
