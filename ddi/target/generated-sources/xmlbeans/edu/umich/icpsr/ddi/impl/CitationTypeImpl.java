/*
 * XML Type:  citationType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.CitationType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML citationType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class CitationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.CitationType
{
    private static final long serialVersionUID = 1L;
    
    public CitationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLSTMT$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "titlStmt");
    private static final javax.xml.namespace.QName RSPSTMT$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "rspStmt");
    private static final javax.xml.namespace.QName PRODSTMT$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "prodStmt");
    private static final javax.xml.namespace.QName DISTSTMT$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "distStmt");
    private static final javax.xml.namespace.QName SERSTMT$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "serStmt");
    private static final javax.xml.namespace.QName VERSTMT$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "verStmt");
    private static final javax.xml.namespace.QName BIBLCIT$12 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "biblCit");
    private static final javax.xml.namespace.QName HOLDINGS$14 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "holdings");
    private static final javax.xml.namespace.QName NOTES$16 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "notes");
    private static final javax.xml.namespace.QName ID$18 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$20 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$22 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$24 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName MARCURI$26 = 
        new javax.xml.namespace.QName("", "MARCURI");
    
    
    /**
     * Gets the "titlStmt" element
     */
    public edu.umich.icpsr.ddi.TitlStmtType getTitlStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TitlStmtType target = null;
            target = (edu.umich.icpsr.ddi.TitlStmtType)get_store().find_element_user(TITLSTMT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "titlStmt" element
     */
    public void setTitlStmt(edu.umich.icpsr.ddi.TitlStmtType titlStmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TitlStmtType target = null;
            target = (edu.umich.icpsr.ddi.TitlStmtType)get_store().find_element_user(TITLSTMT$0, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.TitlStmtType)get_store().add_element_user(TITLSTMT$0);
            }
            target.set(titlStmt);
        }
    }
    
    /**
     * Appends and returns a new empty "titlStmt" element
     */
    public edu.umich.icpsr.ddi.TitlStmtType addNewTitlStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TitlStmtType target = null;
            target = (edu.umich.icpsr.ddi.TitlStmtType)get_store().add_element_user(TITLSTMT$0);
            return target;
        }
    }
    
    /**
     * Gets the "rspStmt" element
     */
    public edu.umich.icpsr.ddi.RspStmtType getRspStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RspStmtType target = null;
            target = (edu.umich.icpsr.ddi.RspStmtType)get_store().find_element_user(RSPSTMT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "rspStmt" element
     */
    public boolean isSetRspStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RSPSTMT$2) != 0;
        }
    }
    
    /**
     * Sets the "rspStmt" element
     */
    public void setRspStmt(edu.umich.icpsr.ddi.RspStmtType rspStmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RspStmtType target = null;
            target = (edu.umich.icpsr.ddi.RspStmtType)get_store().find_element_user(RSPSTMT$2, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RspStmtType)get_store().add_element_user(RSPSTMT$2);
            }
            target.set(rspStmt);
        }
    }
    
    /**
     * Appends and returns a new empty "rspStmt" element
     */
    public edu.umich.icpsr.ddi.RspStmtType addNewRspStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RspStmtType target = null;
            target = (edu.umich.icpsr.ddi.RspStmtType)get_store().add_element_user(RSPSTMT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "rspStmt" element
     */
    public void unsetRspStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RSPSTMT$2, 0);
        }
    }
    
    /**
     * Gets the "prodStmt" element
     */
    public edu.umich.icpsr.ddi.ProdStmtType getProdStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProdStmtType target = null;
            target = (edu.umich.icpsr.ddi.ProdStmtType)get_store().find_element_user(PRODSTMT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "prodStmt" element
     */
    public boolean isSetProdStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODSTMT$4) != 0;
        }
    }
    
    /**
     * Sets the "prodStmt" element
     */
    public void setProdStmt(edu.umich.icpsr.ddi.ProdStmtType prodStmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProdStmtType target = null;
            target = (edu.umich.icpsr.ddi.ProdStmtType)get_store().find_element_user(PRODSTMT$4, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.ProdStmtType)get_store().add_element_user(PRODSTMT$4);
            }
            target.set(prodStmt);
        }
    }
    
    /**
     * Appends and returns a new empty "prodStmt" element
     */
    public edu.umich.icpsr.ddi.ProdStmtType addNewProdStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProdStmtType target = null;
            target = (edu.umich.icpsr.ddi.ProdStmtType)get_store().add_element_user(PRODSTMT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "prodStmt" element
     */
    public void unsetProdStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODSTMT$4, 0);
        }
    }
    
    /**
     * Gets the "distStmt" element
     */
    public edu.umich.icpsr.ddi.DistStmtType getDistStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DistStmtType target = null;
            target = (edu.umich.icpsr.ddi.DistStmtType)get_store().find_element_user(DISTSTMT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "distStmt" element
     */
    public boolean isSetDistStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISTSTMT$6) != 0;
        }
    }
    
    /**
     * Sets the "distStmt" element
     */
    public void setDistStmt(edu.umich.icpsr.ddi.DistStmtType distStmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DistStmtType target = null;
            target = (edu.umich.icpsr.ddi.DistStmtType)get_store().find_element_user(DISTSTMT$6, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DistStmtType)get_store().add_element_user(DISTSTMT$6);
            }
            target.set(distStmt);
        }
    }
    
    /**
     * Appends and returns a new empty "distStmt" element
     */
    public edu.umich.icpsr.ddi.DistStmtType addNewDistStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DistStmtType target = null;
            target = (edu.umich.icpsr.ddi.DistStmtType)get_store().add_element_user(DISTSTMT$6);
            return target;
        }
    }
    
    /**
     * Unsets the "distStmt" element
     */
    public void unsetDistStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISTSTMT$6, 0);
        }
    }
    
    /**
     * Gets the "serStmt" element
     */
    public edu.umich.icpsr.ddi.SerStmtType getSerStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SerStmtType target = null;
            target = (edu.umich.icpsr.ddi.SerStmtType)get_store().find_element_user(SERSTMT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "serStmt" element
     */
    public boolean isSetSerStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERSTMT$8) != 0;
        }
    }
    
    /**
     * Sets the "serStmt" element
     */
    public void setSerStmt(edu.umich.icpsr.ddi.SerStmtType serStmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SerStmtType target = null;
            target = (edu.umich.icpsr.ddi.SerStmtType)get_store().find_element_user(SERSTMT$8, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SerStmtType)get_store().add_element_user(SERSTMT$8);
            }
            target.set(serStmt);
        }
    }
    
    /**
     * Appends and returns a new empty "serStmt" element
     */
    public edu.umich.icpsr.ddi.SerStmtType addNewSerStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SerStmtType target = null;
            target = (edu.umich.icpsr.ddi.SerStmtType)get_store().add_element_user(SERSTMT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "serStmt" element
     */
    public void unsetSerStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERSTMT$8, 0);
        }
    }
    
    /**
     * Gets array of all "verStmt" elements
     */
    public edu.umich.icpsr.ddi.VerStmtType[] getVerStmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VERSTMT$10, targetList);
            edu.umich.icpsr.ddi.VerStmtType[] result = new edu.umich.icpsr.ddi.VerStmtType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "verStmt" element
     */
    public edu.umich.icpsr.ddi.VerStmtType getVerStmtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerStmtType target = null;
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().find_element_user(VERSTMT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "verStmt" element
     */
    public int sizeOfVerStmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSTMT$10);
        }
    }
    
    /**
     * Sets array of all "verStmt" element
     */
    public void setVerStmtArray(edu.umich.icpsr.ddi.VerStmtType[] verStmtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(verStmtArray, VERSTMT$10);
        }
    }
    
    /**
     * Sets ith "verStmt" element
     */
    public void setVerStmtArray(int i, edu.umich.icpsr.ddi.VerStmtType verStmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerStmtType target = null;
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().find_element_user(VERSTMT$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(verStmt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "verStmt" element
     */
    public edu.umich.icpsr.ddi.VerStmtType insertNewVerStmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerStmtType target = null;
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().insert_element_user(VERSTMT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "verStmt" element
     */
    public edu.umich.icpsr.ddi.VerStmtType addNewVerStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerStmtType target = null;
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().add_element_user(VERSTMT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "verStmt" element
     */
    public void removeVerStmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSTMT$10, i);
        }
    }
    
    /**
     * Gets the "biblCit" element
     */
    public edu.umich.icpsr.ddi.BiblCitType getBiblCit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.BiblCitType target = null;
            target = (edu.umich.icpsr.ddi.BiblCitType)get_store().find_element_user(BIBLCIT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "biblCit" element
     */
    public boolean isSetBiblCit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIBLCIT$12) != 0;
        }
    }
    
    /**
     * Sets the "biblCit" element
     */
    public void setBiblCit(edu.umich.icpsr.ddi.BiblCitType biblCit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.BiblCitType target = null;
            target = (edu.umich.icpsr.ddi.BiblCitType)get_store().find_element_user(BIBLCIT$12, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.BiblCitType)get_store().add_element_user(BIBLCIT$12);
            }
            target.set(biblCit);
        }
    }
    
    /**
     * Appends and returns a new empty "biblCit" element
     */
    public edu.umich.icpsr.ddi.BiblCitType addNewBiblCit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.BiblCitType target = null;
            target = (edu.umich.icpsr.ddi.BiblCitType)get_store().add_element_user(BIBLCIT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "biblCit" element
     */
    public void unsetBiblCit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIBLCIT$12, 0);
        }
    }
    
    /**
     * Gets array of all "holdings" elements
     */
    public edu.umich.icpsr.ddi.HoldingsType[] getHoldingsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HOLDINGS$14, targetList);
            edu.umich.icpsr.ddi.HoldingsType[] result = new edu.umich.icpsr.ddi.HoldingsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "holdings" element
     */
    public edu.umich.icpsr.ddi.HoldingsType getHoldingsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HoldingsType target = null;
            target = (edu.umich.icpsr.ddi.HoldingsType)get_store().find_element_user(HOLDINGS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "holdings" element
     */
    public int sizeOfHoldingsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOLDINGS$14);
        }
    }
    
    /**
     * Sets array of all "holdings" element
     */
    public void setHoldingsArray(edu.umich.icpsr.ddi.HoldingsType[] holdingsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(holdingsArray, HOLDINGS$14);
        }
    }
    
    /**
     * Sets ith "holdings" element
     */
    public void setHoldingsArray(int i, edu.umich.icpsr.ddi.HoldingsType holdings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HoldingsType target = null;
            target = (edu.umich.icpsr.ddi.HoldingsType)get_store().find_element_user(HOLDINGS$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(holdings);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "holdings" element
     */
    public edu.umich.icpsr.ddi.HoldingsType insertNewHoldings(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HoldingsType target = null;
            target = (edu.umich.icpsr.ddi.HoldingsType)get_store().insert_element_user(HOLDINGS$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "holdings" element
     */
    public edu.umich.icpsr.ddi.HoldingsType addNewHoldings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.HoldingsType target = null;
            target = (edu.umich.icpsr.ddi.HoldingsType)get_store().add_element_user(HOLDINGS$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "holdings" element
     */
    public void removeHoldings(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOLDINGS$14, i);
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
            get_store().find_all_element_users(NOTES$16, targetList);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$16, i);
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
            return get_store().count_elements(NOTES$16);
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
            arraySetterHelper(notesArray, NOTES$16);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$16, i);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().insert_element_user(NOTES$16, i);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().add_element_user(NOTES$16);
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
            get_store().remove_element(NOTES$16, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$18);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$18);
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
            return get_store().find_attribute_user(ID$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$18);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$18);
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
            get_store().remove_attribute(ID$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$20);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$20);
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
            return get_store().find_attribute_user(XMLLANG$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$20);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$20);
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
            get_store().remove_attribute(XMLLANG$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$22);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$22);
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
            return get_store().find_attribute_user(LANG$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$22);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$22);
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
            get_store().remove_attribute(LANG$22);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.CitationType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$24);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.CitationType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.CitationType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CitationType.Source target = null;
            target = (edu.umich.icpsr.ddi.CitationType.Source)get_store().find_attribute_user(SOURCE$24);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CitationType.Source)get_default_attribute_value(SOURCE$24);
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
            return get_store().find_attribute_user(SOURCE$24) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.CitationType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$24);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.CitationType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CitationType.Source target = null;
            target = (edu.umich.icpsr.ddi.CitationType.Source)get_store().find_attribute_user(SOURCE$24);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CitationType.Source)get_store().add_attribute_user(SOURCE$24);
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
            get_store().remove_attribute(SOURCE$24);
        }
    }
    
    /**
     * Gets the "MARCURI" attribute
     */
    public java.lang.String getMARCURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARCURI$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MARCURI" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMARCURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MARCURI$26);
            return target;
        }
    }
    
    /**
     * True if has "MARCURI" attribute
     */
    public boolean isSetMARCURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MARCURI$26) != null;
        }
    }
    
    /**
     * Sets the "MARCURI" attribute
     */
    public void setMARCURI(java.lang.String marcuri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MARCURI$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MARCURI$26);
            }
            target.setStringValue(marcuri);
        }
    }
    
    /**
     * Sets (as xml) the "MARCURI" attribute
     */
    public void xsetMARCURI(org.apache.xmlbeans.XmlString marcuri)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MARCURI$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MARCURI$26);
            }
            target.set(marcuri);
        }
    }
    
    /**
     * Unsets the "MARCURI" attribute
     */
    public void unsetMARCURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MARCURI$26);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CitationType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.CitationType.Source
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
