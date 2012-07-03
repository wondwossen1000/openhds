/*
 * XML Type:  tableType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.TableType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML tableType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class TableTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.TableType
{
    private static final long serialVersionUID = 1L;
    
    public TableTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITL$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "titl");
    private static final javax.xml.namespace.QName TGROUP$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "tgroup");
    private static final javax.xml.namespace.QName FRAME$4 = 
        new javax.xml.namespace.QName("", "frame");
    private static final javax.xml.namespace.QName COLSEP$6 = 
        new javax.xml.namespace.QName("", "colsep");
    private static final javax.xml.namespace.QName ROWSEP$8 = 
        new javax.xml.namespace.QName("", "rowsep");
    private static final javax.xml.namespace.QName PGWIDE$10 = 
        new javax.xml.namespace.QName("", "pgwide");
    
    
    /**
     * Gets the "titl" element
     */
    public edu.umich.icpsr.ddi.TitlType getTitl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TitlType target = null;
            target = (edu.umich.icpsr.ddi.TitlType)get_store().find_element_user(TITL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "titl" element
     */
    public boolean isSetTitl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITL$0) != 0;
        }
    }
    
    /**
     * Sets the "titl" element
     */
    public void setTitl(edu.umich.icpsr.ddi.TitlType titl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TitlType target = null;
            target = (edu.umich.icpsr.ddi.TitlType)get_store().find_element_user(TITL$0, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.TitlType)get_store().add_element_user(TITL$0);
            }
            target.set(titl);
        }
    }
    
    /**
     * Appends and returns a new empty "titl" element
     */
    public edu.umich.icpsr.ddi.TitlType addNewTitl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TitlType target = null;
            target = (edu.umich.icpsr.ddi.TitlType)get_store().add_element_user(TITL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "titl" element
     */
    public void unsetTitl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITL$0, 0);
        }
    }
    
    /**
     * Gets array of all "tgroup" elements
     */
    public edu.umich.icpsr.ddi.TgroupType[] getTgroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TGROUP$2, targetList);
            edu.umich.icpsr.ddi.TgroupType[] result = new edu.umich.icpsr.ddi.TgroupType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tgroup" element
     */
    public edu.umich.icpsr.ddi.TgroupType getTgroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TgroupType target = null;
            target = (edu.umich.icpsr.ddi.TgroupType)get_store().find_element_user(TGROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tgroup" element
     */
    public int sizeOfTgroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TGROUP$2);
        }
    }
    
    /**
     * Sets array of all "tgroup" element
     */
    public void setTgroupArray(edu.umich.icpsr.ddi.TgroupType[] tgroupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tgroupArray, TGROUP$2);
        }
    }
    
    /**
     * Sets ith "tgroup" element
     */
    public void setTgroupArray(int i, edu.umich.icpsr.ddi.TgroupType tgroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TgroupType target = null;
            target = (edu.umich.icpsr.ddi.TgroupType)get_store().find_element_user(TGROUP$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tgroup);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tgroup" element
     */
    public edu.umich.icpsr.ddi.TgroupType insertNewTgroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TgroupType target = null;
            target = (edu.umich.icpsr.ddi.TgroupType)get_store().insert_element_user(TGROUP$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tgroup" element
     */
    public edu.umich.icpsr.ddi.TgroupType addNewTgroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TgroupType target = null;
            target = (edu.umich.icpsr.ddi.TgroupType)get_store().add_element_user(TGROUP$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "tgroup" element
     */
    public void removeTgroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TGROUP$2, i);
        }
    }
    
    /**
     * Gets the "frame" attribute
     */
    public edu.umich.icpsr.ddi.TableType.Frame.Enum getFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$4);
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.TableType.Frame.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "frame" attribute
     */
    public edu.umich.icpsr.ddi.TableType.Frame xgetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TableType.Frame target = null;
            target = (edu.umich.icpsr.ddi.TableType.Frame)get_store().find_attribute_user(FRAME$4);
            return target;
        }
    }
    
    /**
     * True if has "frame" attribute
     */
    public boolean isSetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FRAME$4) != null;
        }
    }
    
    /**
     * Sets the "frame" attribute
     */
    public void setFrame(edu.umich.icpsr.ddi.TableType.Frame.Enum frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRAME$4);
            }
            target.setEnumValue(frame);
        }
    }
    
    /**
     * Sets (as xml) the "frame" attribute
     */
    public void xsetFrame(edu.umich.icpsr.ddi.TableType.Frame frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TableType.Frame target = null;
            target = (edu.umich.icpsr.ddi.TableType.Frame)get_store().find_attribute_user(FRAME$4);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.TableType.Frame)get_store().add_attribute_user(FRAME$4);
            }
            target.set(frame);
        }
    }
    
    /**
     * Unsets the "frame" attribute
     */
    public void unsetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FRAME$4);
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
     * Gets the "pgwide" attribute
     */
    public java.lang.String getPgwide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PGWIDE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pgwide" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPgwide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PGWIDE$10);
            return target;
        }
    }
    
    /**
     * True if has "pgwide" attribute
     */
    public boolean isSetPgwide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PGWIDE$10) != null;
        }
    }
    
    /**
     * Sets the "pgwide" attribute
     */
    public void setPgwide(java.lang.String pgwide)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PGWIDE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PGWIDE$10);
            }
            target.setStringValue(pgwide);
        }
    }
    
    /**
     * Sets (as xml) the "pgwide" attribute
     */
    public void xsetPgwide(org.apache.xmlbeans.XmlString pgwide)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PGWIDE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PGWIDE$10);
            }
            target.set(pgwide);
        }
    }
    
    /**
     * Unsets the "pgwide" attribute
     */
    public void unsetPgwide()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PGWIDE$10);
        }
    }
    /**
     * An XML frame(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.TableType$Frame.
     */
    public static class FrameImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.TableType.Frame
    {
        private static final long serialVersionUID = 1L;
        
        public FrameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FrameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
