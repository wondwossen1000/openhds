/*
 * XML Type:  tgroupType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.TgroupType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML tgroupType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class TgroupTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.TgroupType
{
    private static final long serialVersionUID = 1L;
    
    public TgroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLSPEC$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "colspec");
    private static final javax.xml.namespace.QName THEAD$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "thead");
    private static final javax.xml.namespace.QName TBODY$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "tbody");
    private static final javax.xml.namespace.QName COLS$6 = 
        new javax.xml.namespace.QName("", "cols");
    private static final javax.xml.namespace.QName COLSEP$8 = 
        new javax.xml.namespace.QName("", "colsep");
    private static final javax.xml.namespace.QName ROWSEP$10 = 
        new javax.xml.namespace.QName("", "rowsep");
    private static final javax.xml.namespace.QName ALIGN$12 = 
        new javax.xml.namespace.QName("", "align");
    
    
    /**
     * Gets array of all "colspec" elements
     */
    public edu.umich.icpsr.ddi.ColspecType[] getColspecArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLSPEC$0, targetList);
            edu.umich.icpsr.ddi.ColspecType[] result = new edu.umich.icpsr.ddi.ColspecType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "colspec" element
     */
    public edu.umich.icpsr.ddi.ColspecType getColspecArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ColspecType target = null;
            target = (edu.umich.icpsr.ddi.ColspecType)get_store().find_element_user(COLSPEC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "colspec" element
     */
    public int sizeOfColspecArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLSPEC$0);
        }
    }
    
    /**
     * Sets array of all "colspec" element
     */
    public void setColspecArray(edu.umich.icpsr.ddi.ColspecType[] colspecArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colspecArray, COLSPEC$0);
        }
    }
    
    /**
     * Sets ith "colspec" element
     */
    public void setColspecArray(int i, edu.umich.icpsr.ddi.ColspecType colspec)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ColspecType target = null;
            target = (edu.umich.icpsr.ddi.ColspecType)get_store().find_element_user(COLSPEC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(colspec);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "colspec" element
     */
    public edu.umich.icpsr.ddi.ColspecType insertNewColspec(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ColspecType target = null;
            target = (edu.umich.icpsr.ddi.ColspecType)get_store().insert_element_user(COLSPEC$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "colspec" element
     */
    public edu.umich.icpsr.ddi.ColspecType addNewColspec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ColspecType target = null;
            target = (edu.umich.icpsr.ddi.ColspecType)get_store().add_element_user(COLSPEC$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "colspec" element
     */
    public void removeColspec(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLSPEC$0, i);
        }
    }
    
    /**
     * Gets the "thead" element
     */
    public edu.umich.icpsr.ddi.TheadType getThead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TheadType target = null;
            target = (edu.umich.icpsr.ddi.TheadType)get_store().find_element_user(THEAD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "thead" element
     */
    public boolean isSetThead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THEAD$2) != 0;
        }
    }
    
    /**
     * Sets the "thead" element
     */
    public void setThead(edu.umich.icpsr.ddi.TheadType thead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TheadType target = null;
            target = (edu.umich.icpsr.ddi.TheadType)get_store().find_element_user(THEAD$2, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.TheadType)get_store().add_element_user(THEAD$2);
            }
            target.set(thead);
        }
    }
    
    /**
     * Appends and returns a new empty "thead" element
     */
    public edu.umich.icpsr.ddi.TheadType addNewThead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TheadType target = null;
            target = (edu.umich.icpsr.ddi.TheadType)get_store().add_element_user(THEAD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "thead" element
     */
    public void unsetThead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THEAD$2, 0);
        }
    }
    
    /**
     * Gets the "tbody" element
     */
    public edu.umich.icpsr.ddi.TbodyType getTbody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TbodyType target = null;
            target = (edu.umich.icpsr.ddi.TbodyType)get_store().find_element_user(TBODY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tbody" element
     */
    public void setTbody(edu.umich.icpsr.ddi.TbodyType tbody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TbodyType target = null;
            target = (edu.umich.icpsr.ddi.TbodyType)get_store().find_element_user(TBODY$4, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.TbodyType)get_store().add_element_user(TBODY$4);
            }
            target.set(tbody);
        }
    }
    
    /**
     * Appends and returns a new empty "tbody" element
     */
    public edu.umich.icpsr.ddi.TbodyType addNewTbody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TbodyType target = null;
            target = (edu.umich.icpsr.ddi.TbodyType)get_store().add_element_user(TBODY$4);
            return target;
        }
    }
    
    /**
     * Gets the "cols" attribute
     */
    public java.lang.String getCols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLS$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cols" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLS$6);
            return target;
        }
    }
    
    /**
     * Sets the "cols" attribute
     */
    public void setCols(java.lang.String cols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLS$6);
            }
            target.setStringValue(cols);
        }
    }
    
    /**
     * Sets (as xml) the "cols" attribute
     */
    public void xsetCols(org.apache.xmlbeans.XmlString cols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLS$6);
            }
            target.set(cols);
        }
    }
    
    /**
     * Gets the "colsep" attribute
     */
    public java.lang.String getColsep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLSEP$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "colsep" attribute
     */
    public org.apache.xmlbeans.XmlString xgetColsep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLSEP$8);
            return target;
        }
    }
    
    /**
     * True if has "colsep" attribute
     */
    public boolean isSetColsep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLSEP$8) != null;
        }
    }
    
    /**
     * Sets the "colsep" attribute
     */
    public void setColsep(java.lang.String colsep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLSEP$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLSEP$8);
            }
            target.setStringValue(colsep);
        }
    }
    
    /**
     * Sets (as xml) the "colsep" attribute
     */
    public void xsetColsep(org.apache.xmlbeans.XmlString colsep)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLSEP$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLSEP$8);
            }
            target.set(colsep);
        }
    }
    
    /**
     * Unsets the "colsep" attribute
     */
    public void unsetColsep()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLSEP$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWSEP$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROWSEP$10);
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
            return get_store().find_attribute_user(ROWSEP$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWSEP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWSEP$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROWSEP$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROWSEP$10);
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
            get_store().remove_attribute(ROWSEP$10);
        }
    }
    
    /**
     * Gets the "align" attribute
     */
    public edu.umich.icpsr.ddi.TgroupType.Align.Enum getAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGN$12);
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.TgroupType.Align.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "align" attribute
     */
    public edu.umich.icpsr.ddi.TgroupType.Align xgetAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TgroupType.Align target = null;
            target = (edu.umich.icpsr.ddi.TgroupType.Align)get_store().find_attribute_user(ALIGN$12);
            return target;
        }
    }
    
    /**
     * True if has "align" attribute
     */
    public boolean isSetAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALIGN$12) != null;
        }
    }
    
    /**
     * Sets the "align" attribute
     */
    public void setAlign(edu.umich.icpsr.ddi.TgroupType.Align.Enum align)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGN$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIGN$12);
            }
            target.setEnumValue(align);
        }
    }
    
    /**
     * Sets (as xml) the "align" attribute
     */
    public void xsetAlign(edu.umich.icpsr.ddi.TgroupType.Align align)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TgroupType.Align target = null;
            target = (edu.umich.icpsr.ddi.TgroupType.Align)get_store().find_attribute_user(ALIGN$12);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.TgroupType.Align)get_store().add_attribute_user(ALIGN$12);
            }
            target.set(align);
        }
    }
    
    /**
     * Unsets the "align" attribute
     */
    public void unsetAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALIGN$12);
        }
    }
    /**
     * An XML align(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.TgroupType$Align.
     */
    public static class AlignImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.TgroupType.Align
    {
        private static final long serialVersionUID = 1L;
        
        public AlignImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AlignImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
