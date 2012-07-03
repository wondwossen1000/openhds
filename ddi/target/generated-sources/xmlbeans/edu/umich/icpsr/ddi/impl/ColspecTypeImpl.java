/*
 * XML Type:  colspecType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.ColspecType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML colspecType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class ColspecTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.ColspecType
{
    private static final long serialVersionUID = 1L;
    
    public ColspecTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COLNUM$0 = 
        new javax.xml.namespace.QName("", "colnum");
    private static final javax.xml.namespace.QName COLNAME$2 = 
        new javax.xml.namespace.QName("", "colname");
    private static final javax.xml.namespace.QName COLWIDTH$4 = 
        new javax.xml.namespace.QName("", "colwidth");
    private static final javax.xml.namespace.QName COLSEP$6 = 
        new javax.xml.namespace.QName("", "colsep");
    private static final javax.xml.namespace.QName ROWSEP$8 = 
        new javax.xml.namespace.QName("", "rowsep");
    private static final javax.xml.namespace.QName ALIGN$10 = 
        new javax.xml.namespace.QName("", "align");
    private static final javax.xml.namespace.QName CHAR$12 = 
        new javax.xml.namespace.QName("", "char");
    private static final javax.xml.namespace.QName CHAROFF$14 = 
        new javax.xml.namespace.QName("", "charoff");
    
    
    /**
     * Gets the "colnum" attribute
     */
    public java.lang.String getColnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLNUM$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "colnum" attribute
     */
    public org.apache.xmlbeans.XmlString xgetColnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLNUM$0);
            return target;
        }
    }
    
    /**
     * True if has "colnum" attribute
     */
    public boolean isSetColnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLNUM$0) != null;
        }
    }
    
    /**
     * Sets the "colnum" attribute
     */
    public void setColnum(java.lang.String colnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLNUM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLNUM$0);
            }
            target.setStringValue(colnum);
        }
    }
    
    /**
     * Sets (as xml) the "colnum" attribute
     */
    public void xsetColnum(org.apache.xmlbeans.XmlString colnum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLNUM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLNUM$0);
            }
            target.set(colnum);
        }
    }
    
    /**
     * Unsets the "colnum" attribute
     */
    public void unsetColnum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLNUM$0);
        }
    }
    
    /**
     * Gets the "colname" attribute
     */
    public java.lang.String getColname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLNAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "colname" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetColname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(COLNAME$2);
            return target;
        }
    }
    
    /**
     * True if has "colname" attribute
     */
    public boolean isSetColname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLNAME$2) != null;
        }
    }
    
    /**
     * Sets the "colname" attribute
     */
    public void setColname(java.lang.String colname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLNAME$2);
            }
            target.setStringValue(colname);
        }
    }
    
    /**
     * Sets (as xml) the "colname" attribute
     */
    public void xsetColname(org.apache.xmlbeans.XmlNMTOKEN colname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(COLNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(COLNAME$2);
            }
            target.set(colname);
        }
    }
    
    /**
     * Unsets the "colname" attribute
     */
    public void unsetColname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLNAME$2);
        }
    }
    
    /**
     * Gets the "colwidth" attribute
     */
    public java.lang.String getColwidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLWIDTH$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "colwidth" attribute
     */
    public org.apache.xmlbeans.XmlString xgetColwidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLWIDTH$4);
            return target;
        }
    }
    
    /**
     * True if has "colwidth" attribute
     */
    public boolean isSetColwidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLWIDTH$4) != null;
        }
    }
    
    /**
     * Sets the "colwidth" attribute
     */
    public void setColwidth(java.lang.String colwidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLWIDTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLWIDTH$4);
            }
            target.setStringValue(colwidth);
        }
    }
    
    /**
     * Sets (as xml) the "colwidth" attribute
     */
    public void xsetColwidth(org.apache.xmlbeans.XmlString colwidth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLWIDTH$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLWIDTH$4);
            }
            target.set(colwidth);
        }
    }
    
    /**
     * Unsets the "colwidth" attribute
     */
    public void unsetColwidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLWIDTH$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLSEP$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLSEP$6);
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
            return get_store().find_attribute_user(COLSEP$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLSEP$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLSEP$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLSEP$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLSEP$6);
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
            get_store().remove_attribute(COLSEP$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWSEP$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROWSEP$8);
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
            return get_store().find_attribute_user(ROWSEP$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWSEP$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWSEP$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROWSEP$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROWSEP$8);
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
            get_store().remove_attribute(ROWSEP$8);
        }
    }
    
    /**
     * Gets the "align" attribute
     */
    public edu.umich.icpsr.ddi.ColspecType.Align.Enum getAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGN$10);
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.ColspecType.Align.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "align" attribute
     */
    public edu.umich.icpsr.ddi.ColspecType.Align xgetAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ColspecType.Align target = null;
            target = (edu.umich.icpsr.ddi.ColspecType.Align)get_store().find_attribute_user(ALIGN$10);
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
            return get_store().find_attribute_user(ALIGN$10) != null;
        }
    }
    
    /**
     * Sets the "align" attribute
     */
    public void setAlign(edu.umich.icpsr.ddi.ColspecType.Align.Enum align)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIGN$10);
            }
            target.setEnumValue(align);
        }
    }
    
    /**
     * Sets (as xml) the "align" attribute
     */
    public void xsetAlign(edu.umich.icpsr.ddi.ColspecType.Align align)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ColspecType.Align target = null;
            target = (edu.umich.icpsr.ddi.ColspecType.Align)get_store().find_attribute_user(ALIGN$10);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.ColspecType.Align)get_store().add_attribute_user(ALIGN$10);
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
            get_store().remove_attribute(ALIGN$10);
        }
    }
    
    /**
     * Gets the "char" attribute
     */
    public java.lang.String getChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAR$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "char" attribute
     */
    public org.apache.xmlbeans.XmlString xgetChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHAR$12);
            return target;
        }
    }
    
    /**
     * True if has "char" attribute
     */
    public boolean isSetChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHAR$12) != null;
        }
    }
    
    /**
     * Sets the "char" attribute
     */
    public void setChar(java.lang.String xchar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAR$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHAR$12);
            }
            target.setStringValue(xchar);
        }
    }
    
    /**
     * Sets (as xml) the "char" attribute
     */
    public void xsetChar(org.apache.xmlbeans.XmlString xchar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHAR$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CHAR$12);
            }
            target.set(xchar);
        }
    }
    
    /**
     * Unsets the "char" attribute
     */
    public void unsetChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHAR$12);
        }
    }
    
    /**
     * Gets the "charoff" attribute
     */
    public java.lang.String getCharoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAROFF$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "charoff" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetCharoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CHAROFF$14);
            return target;
        }
    }
    
    /**
     * True if has "charoff" attribute
     */
    public boolean isSetCharoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHAROFF$14) != null;
        }
    }
    
    /**
     * Sets the "charoff" attribute
     */
    public void setCharoff(java.lang.String charoff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAROFF$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHAROFF$14);
            }
            target.setStringValue(charoff);
        }
    }
    
    /**
     * Sets (as xml) the "charoff" attribute
     */
    public void xsetCharoff(org.apache.xmlbeans.XmlNMTOKEN charoff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CHAROFF$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(CHAROFF$14);
            }
            target.set(charoff);
        }
    }
    
    /**
     * Unsets the "charoff" attribute
     */
    public void unsetCharoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHAROFF$14);
        }
    }
    /**
     * An XML align(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.ColspecType$Align.
     */
    public static class AlignImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.ColspecType.Align
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
