/*
 * XML Type:  rowType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.RowType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML rowType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class RowTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.RowType
{
    private static final long serialVersionUID = 1L;
    
    public RowTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTRY$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "entry");
    private static final javax.xml.namespace.QName ROWSEP$2 = 
        new javax.xml.namespace.QName("", "rowsep");
    private static final javax.xml.namespace.QName VALIGN$4 = 
        new javax.xml.namespace.QName("", "valign");
    
    
    /**
     * Gets array of all "entry" elements
     */
    public edu.umich.icpsr.ddi.EntryType[] getEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTRY$0, targetList);
            edu.umich.icpsr.ddi.EntryType[] result = new edu.umich.icpsr.ddi.EntryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entry" element
     */
    public edu.umich.icpsr.ddi.EntryType getEntryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EntryType target = null;
            target = (edu.umich.icpsr.ddi.EntryType)get_store().find_element_user(ENTRY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entry" element
     */
    public int sizeOfEntryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRY$0);
        }
    }
    
    /**
     * Sets array of all "entry" element
     */
    public void setEntryArray(edu.umich.icpsr.ddi.EntryType[] entryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(entryArray, ENTRY$0);
        }
    }
    
    /**
     * Sets ith "entry" element
     */
    public void setEntryArray(int i, edu.umich.icpsr.ddi.EntryType entry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EntryType target = null;
            target = (edu.umich.icpsr.ddi.EntryType)get_store().find_element_user(ENTRY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    public edu.umich.icpsr.ddi.EntryType insertNewEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EntryType target = null;
            target = (edu.umich.icpsr.ddi.EntryType)get_store().insert_element_user(ENTRY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    public edu.umich.icpsr.ddi.EntryType addNewEntry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EntryType target = null;
            target = (edu.umich.icpsr.ddi.EntryType)get_store().add_element_user(ENTRY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "entry" element
     */
    public void removeEntry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRY$0, i);
        }
    }
    
    /**
     * Gets the "rowsep" attribute
     */
    public java.lang.String getRowsep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWSEP$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rowsep" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRowsep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROWSEP$2);
            return target;
        }
    }
    
    /**
     * True if has "rowsep" attribute
     */
    public boolean isSetRowsep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROWSEP$2) != null;
        }
    }
    
    /**
     * Sets the "rowsep" attribute
     */
    public void setRowsep(java.lang.String rowsep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWSEP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWSEP$2);
            }
            target.setStringValue(rowsep);
        }
    }
    
    /**
     * Sets (as xml) the "rowsep" attribute
     */
    public void xsetRowsep(org.apache.xmlbeans.XmlString rowsep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROWSEP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROWSEP$2);
            }
            target.set(rowsep);
        }
    }
    
    /**
     * Unsets the "rowsep" attribute
     */
    public void unsetRowsep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROWSEP$2);
        }
    }
    
    /**
     * Gets the "valign" attribute
     */
    public edu.umich.icpsr.ddi.RowType.Valign.Enum getValign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIGN$4);
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.RowType.Valign.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "valign" attribute
     */
    public edu.umich.icpsr.ddi.RowType.Valign xgetValign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RowType.Valign target = null;
            target = (edu.umich.icpsr.ddi.RowType.Valign)get_store().find_attribute_user(VALIGN$4);
            return target;
        }
    }
    
    /**
     * True if has "valign" attribute
     */
    public boolean isSetValign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIGN$4) != null;
        }
    }
    
    /**
     * Sets the "valign" attribute
     */
    public void setValign(edu.umich.icpsr.ddi.RowType.Valign.Enum valign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIGN$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIGN$4);
            }
            target.setEnumValue(valign);
        }
    }
    
    /**
     * Sets (as xml) the "valign" attribute
     */
    public void xsetValign(edu.umich.icpsr.ddi.RowType.Valign valign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RowType.Valign target = null;
            target = (edu.umich.icpsr.ddi.RowType.Valign)get_store().find_attribute_user(VALIGN$4);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RowType.Valign)get_store().add_attribute_user(VALIGN$4);
            }
            target.set(valign);
        }
    }
    
    /**
     * Unsets the "valign" attribute
     */
    public void unsetValign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIGN$4);
        }
    }
    /**
     * An XML valign(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.RowType$Valign.
     */
    public static class ValignImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.RowType.Valign
    {
        private static final long serialVersionUID = 1L;
        
        public ValignImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ValignImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
