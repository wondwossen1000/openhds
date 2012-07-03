/*
 * XML Type:  theadType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.TheadType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML theadType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class TheadTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.TheadType
{
    private static final long serialVersionUID = 1L;
    
    public TheadTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROW$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "row");
    private static final javax.xml.namespace.QName VALIGN$2 = 
        new javax.xml.namespace.QName("", "valign");
    
    
    /**
     * Gets array of all "row" elements
     */
    public edu.umich.icpsr.ddi.RowType[] getRowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROW$0, targetList);
            edu.umich.icpsr.ddi.RowType[] result = new edu.umich.icpsr.ddi.RowType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "row" element
     */
    public edu.umich.icpsr.ddi.RowType getRowArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RowType target = null;
            target = (edu.umich.icpsr.ddi.RowType)get_store().find_element_user(ROW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "row" element
     */
    public int sizeOfRowArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROW$0);
        }
    }
    
    /**
     * Sets array of all "row" element
     */
    public void setRowArray(edu.umich.icpsr.ddi.RowType[] rowArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rowArray, ROW$0);
        }
    }
    
    /**
     * Sets ith "row" element
     */
    public void setRowArray(int i, edu.umich.icpsr.ddi.RowType row)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RowType target = null;
            target = (edu.umich.icpsr.ddi.RowType)get_store().find_element_user(ROW$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(row);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "row" element
     */
    public edu.umich.icpsr.ddi.RowType insertNewRow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RowType target = null;
            target = (edu.umich.icpsr.ddi.RowType)get_store().insert_element_user(ROW$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "row" element
     */
    public edu.umich.icpsr.ddi.RowType addNewRow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RowType target = null;
            target = (edu.umich.icpsr.ddi.RowType)get_store().add_element_user(ROW$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "row" element
     */
    public void removeRow(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROW$0, i);
        }
    }
    
    /**
     * Gets the "valign" attribute
     */
    public edu.umich.icpsr.ddi.TheadType.Valign.Enum getValign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIGN$2);
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.TheadType.Valign.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "valign" attribute
     */
    public edu.umich.icpsr.ddi.TheadType.Valign xgetValign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TheadType.Valign target = null;
            target = (edu.umich.icpsr.ddi.TheadType.Valign)get_store().find_attribute_user(VALIGN$2);
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
            return get_store().find_attribute_user(VALIGN$2) != null;
        }
    }
    
    /**
     * Sets the "valign" attribute
     */
    public void setValign(edu.umich.icpsr.ddi.TheadType.Valign.Enum valign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIGN$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIGN$2);
            }
            target.setEnumValue(valign);
        }
    }
    
    /**
     * Sets (as xml) the "valign" attribute
     */
    public void xsetValign(edu.umich.icpsr.ddi.TheadType.Valign valign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TheadType.Valign target = null;
            target = (edu.umich.icpsr.ddi.TheadType.Valign)get_store().find_attribute_user(VALIGN$2);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.TheadType.Valign)get_store().add_attribute_user(VALIGN$2);
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
            get_store().remove_attribute(VALIGN$2);
        }
    }
    /**
     * An XML valign(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.TheadType$Valign.
     */
    public static class ValignImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.TheadType.Valign
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
