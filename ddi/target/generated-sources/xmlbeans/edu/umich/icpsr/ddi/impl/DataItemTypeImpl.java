/*
 * XML Type:  dataItemType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.DataItemType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML dataItemType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class DataItemTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.DataItemType
{
    private static final long serialVersionUID = 1L;
    
    public DataItemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CUBECOORD$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "CubeCoord");
    private static final javax.xml.namespace.QName PHYSLOC$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "physLoc");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$6 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$8 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$10 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName VARREF$12 = 
        new javax.xml.namespace.QName("", "varRef");
    private static final javax.xml.namespace.QName NCUBEREF$14 = 
        new javax.xml.namespace.QName("", "nCubeRef");
    
    
    /**
     * Gets array of all "CubeCoord" elements
     */
    public edu.umich.icpsr.ddi.CubeCoordType[] getCubeCoordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CUBECOORD$0, targetList);
            edu.umich.icpsr.ddi.CubeCoordType[] result = new edu.umich.icpsr.ddi.CubeCoordType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CubeCoord" element
     */
    public edu.umich.icpsr.ddi.CubeCoordType getCubeCoordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CubeCoordType target = null;
            target = (edu.umich.icpsr.ddi.CubeCoordType)get_store().find_element_user(CUBECOORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CubeCoord" element
     */
    public int sizeOfCubeCoordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUBECOORD$0);
        }
    }
    
    /**
     * Sets array of all "CubeCoord" element
     */
    public void setCubeCoordArray(edu.umich.icpsr.ddi.CubeCoordType[] cubeCoordArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cubeCoordArray, CUBECOORD$0);
        }
    }
    
    /**
     * Sets ith "CubeCoord" element
     */
    public void setCubeCoordArray(int i, edu.umich.icpsr.ddi.CubeCoordType cubeCoord)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CubeCoordType target = null;
            target = (edu.umich.icpsr.ddi.CubeCoordType)get_store().find_element_user(CUBECOORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cubeCoord);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CubeCoord" element
     */
    public edu.umich.icpsr.ddi.CubeCoordType insertNewCubeCoord(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CubeCoordType target = null;
            target = (edu.umich.icpsr.ddi.CubeCoordType)get_store().insert_element_user(CUBECOORD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CubeCoord" element
     */
    public edu.umich.icpsr.ddi.CubeCoordType addNewCubeCoord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CubeCoordType target = null;
            target = (edu.umich.icpsr.ddi.CubeCoordType)get_store().add_element_user(CUBECOORD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "CubeCoord" element
     */
    public void removeCubeCoord(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUBECOORD$0, i);
        }
    }
    
    /**
     * Gets array of all "physLoc" elements
     */
    public edu.umich.icpsr.ddi.PhysLocType[] getPhysLocArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PHYSLOC$2, targetList);
            edu.umich.icpsr.ddi.PhysLocType[] result = new edu.umich.icpsr.ddi.PhysLocType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "physLoc" element
     */
    public edu.umich.icpsr.ddi.PhysLocType getPhysLocArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PhysLocType target = null;
            target = (edu.umich.icpsr.ddi.PhysLocType)get_store().find_element_user(PHYSLOC$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "physLoc" element
     */
    public int sizeOfPhysLocArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHYSLOC$2);
        }
    }
    
    /**
     * Sets array of all "physLoc" element
     */
    public void setPhysLocArray(edu.umich.icpsr.ddi.PhysLocType[] physLocArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(physLocArray, PHYSLOC$2);
        }
    }
    
    /**
     * Sets ith "physLoc" element
     */
    public void setPhysLocArray(int i, edu.umich.icpsr.ddi.PhysLocType physLoc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PhysLocType target = null;
            target = (edu.umich.icpsr.ddi.PhysLocType)get_store().find_element_user(PHYSLOC$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(physLoc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "physLoc" element
     */
    public edu.umich.icpsr.ddi.PhysLocType insertNewPhysLoc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PhysLocType target = null;
            target = (edu.umich.icpsr.ddi.PhysLocType)get_store().insert_element_user(PHYSLOC$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "physLoc" element
     */
    public edu.umich.icpsr.ddi.PhysLocType addNewPhysLoc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PhysLocType target = null;
            target = (edu.umich.icpsr.ddi.PhysLocType)get_store().add_element_user(PHYSLOC$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "physLoc" element
     */
    public void removePhysLoc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHYSLOC$2, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
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
            return get_store().find_attribute_user(ID$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
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
            get_store().remove_attribute(ID$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$6);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$6);
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
            return get_store().find_attribute_user(XMLLANG$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$6);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$6);
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
            get_store().remove_attribute(XMLLANG$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$8);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$8);
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
            return get_store().find_attribute_user(LANG$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$8);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$8);
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
            get_store().remove_attribute(LANG$8);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.DataItemType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$10);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.DataItemType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.DataItemType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataItemType.Source target = null;
            target = (edu.umich.icpsr.ddi.DataItemType.Source)get_store().find_attribute_user(SOURCE$10);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DataItemType.Source)get_default_attribute_value(SOURCE$10);
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
            return get_store().find_attribute_user(SOURCE$10) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.DataItemType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$10);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.DataItemType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataItemType.Source target = null;
            target = (edu.umich.icpsr.ddi.DataItemType.Source)get_store().find_attribute_user(SOURCE$10);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DataItemType.Source)get_store().add_attribute_user(SOURCE$10);
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
            get_store().remove_attribute(SOURCE$10);
        }
    }
    
    /**
     * Gets the "varRef" attribute
     */
    public java.lang.String getVarRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VARREF$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "varRef" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetVarRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(VARREF$12);
            return target;
        }
    }
    
    /**
     * True if has "varRef" attribute
     */
    public boolean isSetVarRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VARREF$12) != null;
        }
    }
    
    /**
     * Sets the "varRef" attribute
     */
    public void setVarRef(java.lang.String varRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VARREF$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VARREF$12);
            }
            target.setStringValue(varRef);
        }
    }
    
    /**
     * Sets (as xml) the "varRef" attribute
     */
    public void xsetVarRef(org.apache.xmlbeans.XmlIDREF varRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(VARREF$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(VARREF$12);
            }
            target.set(varRef);
        }
    }
    
    /**
     * Unsets the "varRef" attribute
     */
    public void unsetVarRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VARREF$12);
        }
    }
    
    /**
     * Gets the "nCubeRef" attribute
     */
    public java.lang.String getNCubeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NCUBEREF$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nCubeRef" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetNCubeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(NCUBEREF$14);
            return target;
        }
    }
    
    /**
     * True if has "nCubeRef" attribute
     */
    public boolean isSetNCubeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NCUBEREF$14) != null;
        }
    }
    
    /**
     * Sets the "nCubeRef" attribute
     */
    public void setNCubeRef(java.lang.String nCubeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NCUBEREF$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NCUBEREF$14);
            }
            target.setStringValue(nCubeRef);
        }
    }
    
    /**
     * Sets (as xml) the "nCubeRef" attribute
     */
    public void xsetNCubeRef(org.apache.xmlbeans.XmlIDREF nCubeRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(NCUBEREF$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(NCUBEREF$14);
            }
            target.set(nCubeRef);
        }
    }
    
    /**
     * Unsets the "nCubeRef" attribute
     */
    public void unsetNCubeRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NCUBEREF$14);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.DataItemType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.DataItemType.Source
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
