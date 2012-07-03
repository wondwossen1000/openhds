/*
 * XML Type:  entryType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.EntryType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML entryType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.EntryType.
 */
public class EntryTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements edu.umich.icpsr.ddi.EntryType
{
    private static final long serialVersionUID = 1L;
    
    public EntryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected EntryTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName COLNAME$0 = 
        new javax.xml.namespace.QName("", "colname");
    private static final javax.xml.namespace.QName NAMEST$2 = 
        new javax.xml.namespace.QName("", "namest");
    private static final javax.xml.namespace.QName NAMEEND$4 = 
        new javax.xml.namespace.QName("", "nameend");
    private static final javax.xml.namespace.QName MOREROWS$6 = 
        new javax.xml.namespace.QName("", "morerows");
    private static final javax.xml.namespace.QName COLSEP$8 = 
        new javax.xml.namespace.QName("", "colsep");
    private static final javax.xml.namespace.QName ROWSEP$10 = 
        new javax.xml.namespace.QName("", "rowsep");
    private static final javax.xml.namespace.QName ALIGN$12 = 
        new javax.xml.namespace.QName("", "align");
    private static final javax.xml.namespace.QName CHAR$14 = 
        new javax.xml.namespace.QName("", "char");
    private static final javax.xml.namespace.QName CHAROFF$16 = 
        new javax.xml.namespace.QName("", "charoff");
    private static final javax.xml.namespace.QName VALIGN$18 = 
        new javax.xml.namespace.QName("", "valign");
    
    
    /**
     * Gets the "colname" attribute
     */
    public java.lang.String getColname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLNAME$0);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(COLNAME$0);
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
            return get_store().find_attribute_user(COLNAME$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLNAME$0);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(COLNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(COLNAME$0);
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
            get_store().remove_attribute(COLNAME$0);
        }
    }
    
    /**
     * Gets the "namest" attribute
     */
    public java.lang.String getNamest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEST$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "namest" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetNamest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAMEST$2);
            return target;
        }
    }
    
    /**
     * True if has "namest" attribute
     */
    public boolean isSetNamest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAMEST$2) != null;
        }
    }
    
    /**
     * Sets the "namest" attribute
     */
    public void setNamest(java.lang.String namest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEST$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMEST$2);
            }
            target.setStringValue(namest);
        }
    }
    
    /**
     * Sets (as xml) the "namest" attribute
     */
    public void xsetNamest(org.apache.xmlbeans.XmlNMTOKEN namest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAMEST$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAMEST$2);
            }
            target.set(namest);
        }
    }
    
    /**
     * Unsets the "namest" attribute
     */
    public void unsetNamest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAMEST$2);
        }
    }
    
    /**
     * Gets the "nameend" attribute
     */
    public java.lang.String getNameend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEEND$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nameend" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetNameend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAMEEND$4);
            return target;
        }
    }
    
    /**
     * True if has "nameend" attribute
     */
    public boolean isSetNameend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAMEEND$4) != null;
        }
    }
    
    /**
     * Sets the "nameend" attribute
     */
    public void setNameend(java.lang.String nameend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAMEEND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAMEEND$4);
            }
            target.setStringValue(nameend);
        }
    }
    
    /**
     * Sets (as xml) the "nameend" attribute
     */
    public void xsetNameend(org.apache.xmlbeans.XmlNMTOKEN nameend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(NAMEEND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(NAMEEND$4);
            }
            target.set(nameend);
        }
    }
    
    /**
     * Unsets the "nameend" attribute
     */
    public void unsetNameend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAMEEND$4);
        }
    }
    
    /**
     * Gets the "morerows" attribute
     */
    public java.lang.String getMorerows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOREROWS$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "morerows" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMorerows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MOREROWS$6);
            return target;
        }
    }
    
    /**
     * True if has "morerows" attribute
     */
    public boolean isSetMorerows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MOREROWS$6) != null;
        }
    }
    
    /**
     * Sets the "morerows" attribute
     */
    public void setMorerows(java.lang.String morerows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOREROWS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOREROWS$6);
            }
            target.setStringValue(morerows);
        }
    }
    
    /**
     * Sets (as xml) the "morerows" attribute
     */
    public void xsetMorerows(org.apache.xmlbeans.XmlString morerows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MOREROWS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MOREROWS$6);
            }
            target.set(morerows);
        }
    }
    
    /**
     * Unsets the "morerows" attribute
     */
    public void unsetMorerows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MOREROWS$6);
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
    public edu.umich.icpsr.ddi.EntryType.Align.Enum getAlign()
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
            return (edu.umich.icpsr.ddi.EntryType.Align.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "align" attribute
     */
    public edu.umich.icpsr.ddi.EntryType.Align xgetAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EntryType.Align target = null;
            target = (edu.umich.icpsr.ddi.EntryType.Align)get_store().find_attribute_user(ALIGN$12);
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
    public void setAlign(edu.umich.icpsr.ddi.EntryType.Align.Enum align)
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
    public void xsetAlign(edu.umich.icpsr.ddi.EntryType.Align align)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EntryType.Align target = null;
            target = (edu.umich.icpsr.ddi.EntryType.Align)get_store().find_attribute_user(ALIGN$12);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.EntryType.Align)get_store().add_attribute_user(ALIGN$12);
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
     * Gets the "char" attribute
     */
    public java.lang.String getChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAR$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHAR$14);
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
            return get_store().find_attribute_user(CHAR$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAR$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHAR$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHAR$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CHAR$14);
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
            get_store().remove_attribute(CHAR$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAROFF$16);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CHAROFF$16);
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
            return get_store().find_attribute_user(CHAROFF$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAROFF$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHAROFF$16);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CHAROFF$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(CHAROFF$16);
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
            get_store().remove_attribute(CHAROFF$16);
        }
    }
    
    /**
     * Gets the "valign" attribute
     */
    public edu.umich.icpsr.ddi.EntryType.Valign.Enum getValign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIGN$18);
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.EntryType.Valign.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "valign" attribute
     */
    public edu.umich.icpsr.ddi.EntryType.Valign xgetValign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EntryType.Valign target = null;
            target = (edu.umich.icpsr.ddi.EntryType.Valign)get_store().find_attribute_user(VALIGN$18);
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
            return get_store().find_attribute_user(VALIGN$18) != null;
        }
    }
    
    /**
     * Sets the "valign" attribute
     */
    public void setValign(edu.umich.icpsr.ddi.EntryType.Valign.Enum valign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIGN$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIGN$18);
            }
            target.setEnumValue(valign);
        }
    }
    
    /**
     * Sets (as xml) the "valign" attribute
     */
    public void xsetValign(edu.umich.icpsr.ddi.EntryType.Valign valign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EntryType.Valign target = null;
            target = (edu.umich.icpsr.ddi.EntryType.Valign)get_store().find_attribute_user(VALIGN$18);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.EntryType.Valign)get_store().add_attribute_user(VALIGN$18);
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
            get_store().remove_attribute(VALIGN$18);
        }
    }
    /**
     * An XML align(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.EntryType$Align.
     */
    public static class AlignImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.EntryType.Align
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
    /**
     * An XML valign(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.EntryType$Valign.
     */
    public static class ValignImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.EntryType.Valign
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
