/*
 * XML Type:  geoBndBoxType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.GeoBndBoxType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML geoBndBoxType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class GeoBndBoxTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.GeoBndBoxType
{
    private static final long serialVersionUID = 1L;
    
    public GeoBndBoxTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WESTBL$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "westBL");
    private static final javax.xml.namespace.QName EASTBL$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "eastBL");
    private static final javax.xml.namespace.QName SOUTHBL$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "southBL");
    private static final javax.xml.namespace.QName NORTHBL$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "northBL");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$10 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$12 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$14 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets the "westBL" element
     */
    public edu.umich.icpsr.ddi.WestBLType getWestBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.WestBLType target = null;
            target = (edu.umich.icpsr.ddi.WestBLType)get_store().find_element_user(WESTBL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "westBL" element
     */
    public void setWestBL(edu.umich.icpsr.ddi.WestBLType westBL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.WestBLType target = null;
            target = (edu.umich.icpsr.ddi.WestBLType)get_store().find_element_user(WESTBL$0, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.WestBLType)get_store().add_element_user(WESTBL$0);
            }
            target.set(westBL);
        }
    }
    
    /**
     * Appends and returns a new empty "westBL" element
     */
    public edu.umich.icpsr.ddi.WestBLType addNewWestBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.WestBLType target = null;
            target = (edu.umich.icpsr.ddi.WestBLType)get_store().add_element_user(WESTBL$0);
            return target;
        }
    }
    
    /**
     * Gets the "eastBL" element
     */
    public edu.umich.icpsr.ddi.EastBLType getEastBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EastBLType target = null;
            target = (edu.umich.icpsr.ddi.EastBLType)get_store().find_element_user(EASTBL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eastBL" element
     */
    public void setEastBL(edu.umich.icpsr.ddi.EastBLType eastBL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EastBLType target = null;
            target = (edu.umich.icpsr.ddi.EastBLType)get_store().find_element_user(EASTBL$2, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.EastBLType)get_store().add_element_user(EASTBL$2);
            }
            target.set(eastBL);
        }
    }
    
    /**
     * Appends and returns a new empty "eastBL" element
     */
    public edu.umich.icpsr.ddi.EastBLType addNewEastBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EastBLType target = null;
            target = (edu.umich.icpsr.ddi.EastBLType)get_store().add_element_user(EASTBL$2);
            return target;
        }
    }
    
    /**
     * Gets the "southBL" element
     */
    public edu.umich.icpsr.ddi.SouthBLType getSouthBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SouthBLType target = null;
            target = (edu.umich.icpsr.ddi.SouthBLType)get_store().find_element_user(SOUTHBL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "southBL" element
     */
    public void setSouthBL(edu.umich.icpsr.ddi.SouthBLType southBL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SouthBLType target = null;
            target = (edu.umich.icpsr.ddi.SouthBLType)get_store().find_element_user(SOUTHBL$4, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SouthBLType)get_store().add_element_user(SOUTHBL$4);
            }
            target.set(southBL);
        }
    }
    
    /**
     * Appends and returns a new empty "southBL" element
     */
    public edu.umich.icpsr.ddi.SouthBLType addNewSouthBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SouthBLType target = null;
            target = (edu.umich.icpsr.ddi.SouthBLType)get_store().add_element_user(SOUTHBL$4);
            return target;
        }
    }
    
    /**
     * Gets the "northBL" element
     */
    public edu.umich.icpsr.ddi.NorthBLType getNorthBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NorthBLType target = null;
            target = (edu.umich.icpsr.ddi.NorthBLType)get_store().find_element_user(NORTHBL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "northBL" element
     */
    public void setNorthBL(edu.umich.icpsr.ddi.NorthBLType northBL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NorthBLType target = null;
            target = (edu.umich.icpsr.ddi.NorthBLType)get_store().find_element_user(NORTHBL$6, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.NorthBLType)get_store().add_element_user(NORTHBL$6);
            }
            target.set(northBL);
        }
    }
    
    /**
     * Appends and returns a new empty "northBL" element
     */
    public edu.umich.icpsr.ddi.NorthBLType addNewNorthBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NorthBLType target = null;
            target = (edu.umich.icpsr.ddi.NorthBLType)get_store().add_element_user(NORTHBL$6);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
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
            return get_store().find_attribute_user(ID$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$8);
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
            get_store().remove_attribute(ID$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$10);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$10);
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
            return get_store().find_attribute_user(XMLLANG$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$10);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$10);
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
            get_store().remove_attribute(XMLLANG$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$12);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$12);
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
            return get_store().find_attribute_user(LANG$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$12);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$12);
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
            get_store().remove_attribute(LANG$12);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.GeoBndBoxType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$14);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.GeoBndBoxType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.GeoBndBoxType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeoBndBoxType.Source target = null;
            target = (edu.umich.icpsr.ddi.GeoBndBoxType.Source)get_store().find_attribute_user(SOURCE$14);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.GeoBndBoxType.Source)get_default_attribute_value(SOURCE$14);
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
            return get_store().find_attribute_user(SOURCE$14) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.GeoBndBoxType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$14);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.GeoBndBoxType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeoBndBoxType.Source target = null;
            target = (edu.umich.icpsr.ddi.GeoBndBoxType.Source)get_store().find_attribute_user(SOURCE$14);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.GeoBndBoxType.Source)get_store().add_attribute_user(SOURCE$14);
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
            get_store().remove_attribute(SOURCE$14);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.GeoBndBoxType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.GeoBndBoxType.Source
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
