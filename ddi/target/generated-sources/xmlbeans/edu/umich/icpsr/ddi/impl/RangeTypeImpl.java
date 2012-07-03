/*
 * XML Type:  rangeType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.RangeType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML rangeType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class RangeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.RangeType
{
    private static final long serialVersionUID = 1L;
    
    public RangeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$2 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$4 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$6 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName UNITS$8 = 
        new javax.xml.namespace.QName("", "UNITS");
    private static final javax.xml.namespace.QName MIN$10 = 
        new javax.xml.namespace.QName("", "min");
    private static final javax.xml.namespace.QName MINEXCLUSIVE$12 = 
        new javax.xml.namespace.QName("", "minExclusive");
    private static final javax.xml.namespace.QName MAX$14 = 
        new javax.xml.namespace.QName("", "max");
    private static final javax.xml.namespace.QName MAXEXCLUSIVE$16 = 
        new javax.xml.namespace.QName("", "maxExclusive");
    
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
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
            return get_store().find_attribute_user(ID$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$0);
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
            get_store().remove_attribute(ID$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$2);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$2);
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
            return get_store().find_attribute_user(XMLLANG$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$2);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$2);
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
            get_store().remove_attribute(XMLLANG$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$4);
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
            return get_store().find_attribute_user(LANG$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$4);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$4);
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
            get_store().remove_attribute(LANG$4);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.RangeType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$6);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.RangeType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.RangeType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RangeType.Source target = null;
            target = (edu.umich.icpsr.ddi.RangeType.Source)get_store().find_attribute_user(SOURCE$6);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RangeType.Source)get_default_attribute_value(SOURCE$6);
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
            return get_store().find_attribute_user(SOURCE$6) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.RangeType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$6);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.RangeType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RangeType.Source target = null;
            target = (edu.umich.icpsr.ddi.RangeType.Source)get_store().find_attribute_user(SOURCE$6);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RangeType.Source)get_store().add_attribute_user(SOURCE$6);
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
            get_store().remove_attribute(SOURCE$6);
        }
    }
    
    /**
     * Gets the "UNITS" attribute
     */
    public edu.umich.icpsr.ddi.RangeType.UNITS.Enum getUNITS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNITS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UNITS$8);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.RangeType.UNITS.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "UNITS" attribute
     */
    public edu.umich.icpsr.ddi.RangeType.UNITS xgetUNITS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RangeType.UNITS target = null;
            target = (edu.umich.icpsr.ddi.RangeType.UNITS)get_store().find_attribute_user(UNITS$8);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RangeType.UNITS)get_default_attribute_value(UNITS$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "UNITS" attribute
     */
    public boolean isSetUNITS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNITS$8) != null;
        }
    }
    
    /**
     * Sets the "UNITS" attribute
     */
    public void setUNITS(edu.umich.icpsr.ddi.RangeType.UNITS.Enum units)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNITS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNITS$8);
            }
            target.setEnumValue(units);
        }
    }
    
    /**
     * Sets (as xml) the "UNITS" attribute
     */
    public void xsetUNITS(edu.umich.icpsr.ddi.RangeType.UNITS units)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RangeType.UNITS target = null;
            target = (edu.umich.icpsr.ddi.RangeType.UNITS)get_store().find_attribute_user(UNITS$8);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RangeType.UNITS)get_store().add_attribute_user(UNITS$8);
            }
            target.set(units);
        }
    }
    
    /**
     * Unsets the "UNITS" attribute
     */
    public void unsetUNITS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNITS$8);
        }
    }
    
    /**
     * Gets the "min" attribute
     */
    public java.lang.String getMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "min" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIN$10);
            return target;
        }
    }
    
    /**
     * True if has "min" attribute
     */
    public boolean isSetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MIN$10) != null;
        }
    }
    
    /**
     * Sets the "min" attribute
     */
    public void setMin(java.lang.String min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIN$10);
            }
            target.setStringValue(min);
        }
    }
    
    /**
     * Sets (as xml) the "min" attribute
     */
    public void xsetMin(org.apache.xmlbeans.XmlString min)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIN$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MIN$10);
            }
            target.set(min);
        }
    }
    
    /**
     * Unsets the "min" attribute
     */
    public void unsetMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MIN$10);
        }
    }
    
    /**
     * Gets the "minExclusive" attribute
     */
    public java.lang.String getMinExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINEXCLUSIVE$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "minExclusive" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMinExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MINEXCLUSIVE$12);
            return target;
        }
    }
    
    /**
     * True if has "minExclusive" attribute
     */
    public boolean isSetMinExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MINEXCLUSIVE$12) != null;
        }
    }
    
    /**
     * Sets the "minExclusive" attribute
     */
    public void setMinExclusive(java.lang.String minExclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINEXCLUSIVE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINEXCLUSIVE$12);
            }
            target.setStringValue(minExclusive);
        }
    }
    
    /**
     * Sets (as xml) the "minExclusive" attribute
     */
    public void xsetMinExclusive(org.apache.xmlbeans.XmlString minExclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MINEXCLUSIVE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MINEXCLUSIVE$12);
            }
            target.set(minExclusive);
        }
    }
    
    /**
     * Unsets the "minExclusive" attribute
     */
    public void unsetMinExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MINEXCLUSIVE$12);
        }
    }
    
    /**
     * Gets the "max" attribute
     */
    public java.lang.String getMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "max" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAX$14);
            return target;
        }
    }
    
    /**
     * True if has "max" attribute
     */
    public boolean isSetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAX$14) != null;
        }
    }
    
    /**
     * Sets the "max" attribute
     */
    public void setMax(java.lang.String max)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAX$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAX$14);
            }
            target.setStringValue(max);
        }
    }
    
    /**
     * Sets (as xml) the "max" attribute
     */
    public void xsetMax(org.apache.xmlbeans.XmlString max)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAX$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MAX$14);
            }
            target.set(max);
        }
    }
    
    /**
     * Unsets the "max" attribute
     */
    public void unsetMax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAX$14);
        }
    }
    
    /**
     * Gets the "maxExclusive" attribute
     */
    public java.lang.String getMaxExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXEXCLUSIVE$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxExclusive" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMaxExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAXEXCLUSIVE$16);
            return target;
        }
    }
    
    /**
     * True if has "maxExclusive" attribute
     */
    public boolean isSetMaxExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MAXEXCLUSIVE$16) != null;
        }
    }
    
    /**
     * Sets the "maxExclusive" attribute
     */
    public void setMaxExclusive(java.lang.String maxExclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXEXCLUSIVE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXEXCLUSIVE$16);
            }
            target.setStringValue(maxExclusive);
        }
    }
    
    /**
     * Sets (as xml) the "maxExclusive" attribute
     */
    public void xsetMaxExclusive(org.apache.xmlbeans.XmlString maxExclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MAXEXCLUSIVE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MAXEXCLUSIVE$16);
            }
            target.set(maxExclusive);
        }
    }
    
    /**
     * Unsets the "maxExclusive" attribute
     */
    public void unsetMaxExclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MAXEXCLUSIVE$16);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.RangeType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.RangeType.Source
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
    /**
     * An XML UNITS(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.RangeType$UNITS.
     */
    public static class UNITSImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.RangeType.UNITS
    {
        private static final long serialVersionUID = 1L;
        
        public UNITSImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected UNITSImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
