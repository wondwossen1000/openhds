/*
 * XML Type:  prodStmtType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.ProdStmtType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML prodStmtType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class ProdStmtTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.ProdStmtType
{
    private static final long serialVersionUID = 1L;
    
    public ProdStmtTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCER$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "producer");
    private static final javax.xml.namespace.QName COPYRIGHT$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "copyright");
    private static final javax.xml.namespace.QName PRODDATE$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "prodDate");
    private static final javax.xml.namespace.QName PRODPLAC$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "prodPlac");
    private static final javax.xml.namespace.QName SOFTWARE$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "software");
    private static final javax.xml.namespace.QName FUNDAG$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "fundAg");
    private static final javax.xml.namespace.QName GRANTNO$12 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "grantNo");
    private static final javax.xml.namespace.QName ID$14 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$16 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$18 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$20 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets array of all "producer" elements
     */
    public edu.umich.icpsr.ddi.ProducerType[] getProducerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCER$0, targetList);
            edu.umich.icpsr.ddi.ProducerType[] result = new edu.umich.icpsr.ddi.ProducerType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "producer" element
     */
    public edu.umich.icpsr.ddi.ProducerType getProducerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProducerType target = null;
            target = (edu.umich.icpsr.ddi.ProducerType)get_store().find_element_user(PRODUCER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "producer" element
     */
    public int sizeOfProducerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCER$0);
        }
    }
    
    /**
     * Sets array of all "producer" element
     */
    public void setProducerArray(edu.umich.icpsr.ddi.ProducerType[] producerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(producerArray, PRODUCER$0);
        }
    }
    
    /**
     * Sets ith "producer" element
     */
    public void setProducerArray(int i, edu.umich.icpsr.ddi.ProducerType producer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProducerType target = null;
            target = (edu.umich.icpsr.ddi.ProducerType)get_store().find_element_user(PRODUCER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(producer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "producer" element
     */
    public edu.umich.icpsr.ddi.ProducerType insertNewProducer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProducerType target = null;
            target = (edu.umich.icpsr.ddi.ProducerType)get_store().insert_element_user(PRODUCER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "producer" element
     */
    public edu.umich.icpsr.ddi.ProducerType addNewProducer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProducerType target = null;
            target = (edu.umich.icpsr.ddi.ProducerType)get_store().add_element_user(PRODUCER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "producer" element
     */
    public void removeProducer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCER$0, i);
        }
    }
    
    /**
     * Gets the "copyright" element
     */
    public edu.umich.icpsr.ddi.CopyrightType getCopyright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CopyrightType target = null;
            target = (edu.umich.icpsr.ddi.CopyrightType)get_store().find_element_user(COPYRIGHT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "copyright" element
     */
    public boolean isSetCopyright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COPYRIGHT$2) != 0;
        }
    }
    
    /**
     * Sets the "copyright" element
     */
    public void setCopyright(edu.umich.icpsr.ddi.CopyrightType copyright)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CopyrightType target = null;
            target = (edu.umich.icpsr.ddi.CopyrightType)get_store().find_element_user(COPYRIGHT$2, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CopyrightType)get_store().add_element_user(COPYRIGHT$2);
            }
            target.set(copyright);
        }
    }
    
    /**
     * Appends and returns a new empty "copyright" element
     */
    public edu.umich.icpsr.ddi.CopyrightType addNewCopyright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CopyrightType target = null;
            target = (edu.umich.icpsr.ddi.CopyrightType)get_store().add_element_user(COPYRIGHT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "copyright" element
     */
    public void unsetCopyright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COPYRIGHT$2, 0);
        }
    }
    
    /**
     * Gets array of all "prodDate" elements
     */
    public edu.umich.icpsr.ddi.ProdDateType[] getProdDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODDATE$4, targetList);
            edu.umich.icpsr.ddi.ProdDateType[] result = new edu.umich.icpsr.ddi.ProdDateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "prodDate" element
     */
    public edu.umich.icpsr.ddi.ProdDateType getProdDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProdDateType target = null;
            target = (edu.umich.icpsr.ddi.ProdDateType)get_store().find_element_user(PRODDATE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "prodDate" element
     */
    public int sizeOfProdDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODDATE$4);
        }
    }
    
    /**
     * Sets array of all "prodDate" element
     */
    public void setProdDateArray(edu.umich.icpsr.ddi.ProdDateType[] prodDateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(prodDateArray, PRODDATE$4);
        }
    }
    
    /**
     * Sets ith "prodDate" element
     */
    public void setProdDateArray(int i, edu.umich.icpsr.ddi.ProdDateType prodDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProdDateType target = null;
            target = (edu.umich.icpsr.ddi.ProdDateType)get_store().find_element_user(PRODDATE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(prodDate);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prodDate" element
     */
    public edu.umich.icpsr.ddi.ProdDateType insertNewProdDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProdDateType target = null;
            target = (edu.umich.icpsr.ddi.ProdDateType)get_store().insert_element_user(PRODDATE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prodDate" element
     */
    public edu.umich.icpsr.ddi.ProdDateType addNewProdDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProdDateType target = null;
            target = (edu.umich.icpsr.ddi.ProdDateType)get_store().add_element_user(PRODDATE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "prodDate" element
     */
    public void removeProdDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODDATE$4, i);
        }
    }
    
    /**
     * Gets array of all "prodPlac" elements
     */
    public edu.umich.icpsr.ddi.ProdPlacType[] getProdPlacArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODPLAC$6, targetList);
            edu.umich.icpsr.ddi.ProdPlacType[] result = new edu.umich.icpsr.ddi.ProdPlacType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "prodPlac" element
     */
    public edu.umich.icpsr.ddi.ProdPlacType getProdPlacArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProdPlacType target = null;
            target = (edu.umich.icpsr.ddi.ProdPlacType)get_store().find_element_user(PRODPLAC$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "prodPlac" element
     */
    public int sizeOfProdPlacArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODPLAC$6);
        }
    }
    
    /**
     * Sets array of all "prodPlac" element
     */
    public void setProdPlacArray(edu.umich.icpsr.ddi.ProdPlacType[] prodPlacArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(prodPlacArray, PRODPLAC$6);
        }
    }
    
    /**
     * Sets ith "prodPlac" element
     */
    public void setProdPlacArray(int i, edu.umich.icpsr.ddi.ProdPlacType prodPlac)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProdPlacType target = null;
            target = (edu.umich.icpsr.ddi.ProdPlacType)get_store().find_element_user(PRODPLAC$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(prodPlac);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prodPlac" element
     */
    public edu.umich.icpsr.ddi.ProdPlacType insertNewProdPlac(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProdPlacType target = null;
            target = (edu.umich.icpsr.ddi.ProdPlacType)get_store().insert_element_user(PRODPLAC$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prodPlac" element
     */
    public edu.umich.icpsr.ddi.ProdPlacType addNewProdPlac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProdPlacType target = null;
            target = (edu.umich.icpsr.ddi.ProdPlacType)get_store().add_element_user(PRODPLAC$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "prodPlac" element
     */
    public void removeProdPlac(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODPLAC$6, i);
        }
    }
    
    /**
     * Gets array of all "software" elements
     */
    public edu.umich.icpsr.ddi.SoftwareType[] getSoftwareArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOFTWARE$8, targetList);
            edu.umich.icpsr.ddi.SoftwareType[] result = new edu.umich.icpsr.ddi.SoftwareType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "software" element
     */
    public edu.umich.icpsr.ddi.SoftwareType getSoftwareArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SoftwareType target = null;
            target = (edu.umich.icpsr.ddi.SoftwareType)get_store().find_element_user(SOFTWARE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "software" element
     */
    public int sizeOfSoftwareArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTWARE$8);
        }
    }
    
    /**
     * Sets array of all "software" element
     */
    public void setSoftwareArray(edu.umich.icpsr.ddi.SoftwareType[] softwareArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(softwareArray, SOFTWARE$8);
        }
    }
    
    /**
     * Sets ith "software" element
     */
    public void setSoftwareArray(int i, edu.umich.icpsr.ddi.SoftwareType software)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SoftwareType target = null;
            target = (edu.umich.icpsr.ddi.SoftwareType)get_store().find_element_user(SOFTWARE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(software);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "software" element
     */
    public edu.umich.icpsr.ddi.SoftwareType insertNewSoftware(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SoftwareType target = null;
            target = (edu.umich.icpsr.ddi.SoftwareType)get_store().insert_element_user(SOFTWARE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "software" element
     */
    public edu.umich.icpsr.ddi.SoftwareType addNewSoftware()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SoftwareType target = null;
            target = (edu.umich.icpsr.ddi.SoftwareType)get_store().add_element_user(SOFTWARE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "software" element
     */
    public void removeSoftware(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTWARE$8, i);
        }
    }
    
    /**
     * Gets array of all "fundAg" elements
     */
    public edu.umich.icpsr.ddi.FundAgType[] getFundAgArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FUNDAG$10, targetList);
            edu.umich.icpsr.ddi.FundAgType[] result = new edu.umich.icpsr.ddi.FundAgType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "fundAg" element
     */
    public edu.umich.icpsr.ddi.FundAgType getFundAgArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FundAgType target = null;
            target = (edu.umich.icpsr.ddi.FundAgType)get_store().find_element_user(FUNDAG$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "fundAg" element
     */
    public int sizeOfFundAgArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FUNDAG$10);
        }
    }
    
    /**
     * Sets array of all "fundAg" element
     */
    public void setFundAgArray(edu.umich.icpsr.ddi.FundAgType[] fundAgArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(fundAgArray, FUNDAG$10);
        }
    }
    
    /**
     * Sets ith "fundAg" element
     */
    public void setFundAgArray(int i, edu.umich.icpsr.ddi.FundAgType fundAg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FundAgType target = null;
            target = (edu.umich.icpsr.ddi.FundAgType)get_store().find_element_user(FUNDAG$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(fundAg);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fundAg" element
     */
    public edu.umich.icpsr.ddi.FundAgType insertNewFundAg(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FundAgType target = null;
            target = (edu.umich.icpsr.ddi.FundAgType)get_store().insert_element_user(FUNDAG$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fundAg" element
     */
    public edu.umich.icpsr.ddi.FundAgType addNewFundAg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FundAgType target = null;
            target = (edu.umich.icpsr.ddi.FundAgType)get_store().add_element_user(FUNDAG$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "fundAg" element
     */
    public void removeFundAg(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FUNDAG$10, i);
        }
    }
    
    /**
     * Gets array of all "grantNo" elements
     */
    public edu.umich.icpsr.ddi.GrantNoType[] getGrantNoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GRANTNO$12, targetList);
            edu.umich.icpsr.ddi.GrantNoType[] result = new edu.umich.icpsr.ddi.GrantNoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "grantNo" element
     */
    public edu.umich.icpsr.ddi.GrantNoType getGrantNoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GrantNoType target = null;
            target = (edu.umich.icpsr.ddi.GrantNoType)get_store().find_element_user(GRANTNO$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "grantNo" element
     */
    public int sizeOfGrantNoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GRANTNO$12);
        }
    }
    
    /**
     * Sets array of all "grantNo" element
     */
    public void setGrantNoArray(edu.umich.icpsr.ddi.GrantNoType[] grantNoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(grantNoArray, GRANTNO$12);
        }
    }
    
    /**
     * Sets ith "grantNo" element
     */
    public void setGrantNoArray(int i, edu.umich.icpsr.ddi.GrantNoType grantNo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GrantNoType target = null;
            target = (edu.umich.icpsr.ddi.GrantNoType)get_store().find_element_user(GRANTNO$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(grantNo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "grantNo" element
     */
    public edu.umich.icpsr.ddi.GrantNoType insertNewGrantNo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GrantNoType target = null;
            target = (edu.umich.icpsr.ddi.GrantNoType)get_store().insert_element_user(GRANTNO$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "grantNo" element
     */
    public edu.umich.icpsr.ddi.GrantNoType addNewGrantNo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GrantNoType target = null;
            target = (edu.umich.icpsr.ddi.GrantNoType)get_store().add_element_user(GRANTNO$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "grantNo" element
     */
    public void removeGrantNo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GRANTNO$12, i);
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
    public edu.umich.icpsr.ddi.ProdStmtType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.ProdStmtType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.ProdStmtType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProdStmtType.Source target = null;
            target = (edu.umich.icpsr.ddi.ProdStmtType.Source)get_store().find_attribute_user(SOURCE$20);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.ProdStmtType.Source)get_default_attribute_value(SOURCE$20);
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
    public void setSource(edu.umich.icpsr.ddi.ProdStmtType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.ProdStmtType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProdStmtType.Source target = null;
            target = (edu.umich.icpsr.ddi.ProdStmtType.Source)get_store().find_attribute_user(SOURCE$20);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.ProdStmtType.Source)get_store().add_attribute_user(SOURCE$20);
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
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.ProdStmtType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.ProdStmtType.Source
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
