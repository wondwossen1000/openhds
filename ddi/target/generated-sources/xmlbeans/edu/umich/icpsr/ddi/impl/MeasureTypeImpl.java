/*
 * XML Type:  measureType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.MeasureType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML measureType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class MeasureTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.MeasureType
{
    private static final long serialVersionUID = 1L;
    
    public MeasureTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName VARREF$8 = 
        new javax.xml.namespace.QName("", "varRef");
    private static final javax.xml.namespace.QName AGGRMETH$10 = 
        new javax.xml.namespace.QName("", "aggrMeth");
    private static final javax.xml.namespace.QName MEASUNIT$12 = 
        new javax.xml.namespace.QName("", "measUnit");
    private static final javax.xml.namespace.QName SCALE$14 = 
        new javax.xml.namespace.QName("", "scale");
    private static final javax.xml.namespace.QName ORIGIN$16 = 
        new javax.xml.namespace.QName("", "origin");
    private static final javax.xml.namespace.QName ADDITIVITY$18 = 
        new javax.xml.namespace.QName("", "additivity");
    
    
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
    public edu.umich.icpsr.ddi.MeasureType.Source.Enum getSource()
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
            return (edu.umich.icpsr.ddi.MeasureType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.MeasureType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MeasureType.Source target = null;
            target = (edu.umich.icpsr.ddi.MeasureType.Source)get_store().find_attribute_user(SOURCE$6);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.MeasureType.Source)get_default_attribute_value(SOURCE$6);
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
    public void setSource(edu.umich.icpsr.ddi.MeasureType.Source.Enum source)
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
    public void xsetSource(edu.umich.icpsr.ddi.MeasureType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MeasureType.Source target = null;
            target = (edu.umich.icpsr.ddi.MeasureType.Source)get_store().find_attribute_user(SOURCE$6);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.MeasureType.Source)get_store().add_attribute_user(SOURCE$6);
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
     * Gets the "varRef" attribute
     */
    public java.lang.String getVarRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VARREF$8);
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
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(VARREF$8);
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
            return get_store().find_attribute_user(VARREF$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VARREF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VARREF$8);
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
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(VARREF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(VARREF$8);
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
            get_store().remove_attribute(VARREF$8);
        }
    }
    
    /**
     * Gets the "aggrMeth" attribute
     */
    public edu.umich.icpsr.ddi.MeasureType.AggrMeth.Enum getAggrMeth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGRMETH$10);
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.MeasureType.AggrMeth.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "aggrMeth" attribute
     */
    public edu.umich.icpsr.ddi.MeasureType.AggrMeth xgetAggrMeth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MeasureType.AggrMeth target = null;
            target = (edu.umich.icpsr.ddi.MeasureType.AggrMeth)get_store().find_attribute_user(AGGRMETH$10);
            return target;
        }
    }
    
    /**
     * True if has "aggrMeth" attribute
     */
    public boolean isSetAggrMeth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AGGRMETH$10) != null;
        }
    }
    
    /**
     * Sets the "aggrMeth" attribute
     */
    public void setAggrMeth(edu.umich.icpsr.ddi.MeasureType.AggrMeth.Enum aggrMeth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGRMETH$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGGRMETH$10);
            }
            target.setEnumValue(aggrMeth);
        }
    }
    
    /**
     * Sets (as xml) the "aggrMeth" attribute
     */
    public void xsetAggrMeth(edu.umich.icpsr.ddi.MeasureType.AggrMeth aggrMeth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MeasureType.AggrMeth target = null;
            target = (edu.umich.icpsr.ddi.MeasureType.AggrMeth)get_store().find_attribute_user(AGGRMETH$10);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.MeasureType.AggrMeth)get_store().add_attribute_user(AGGRMETH$10);
            }
            target.set(aggrMeth);
        }
    }
    
    /**
     * Unsets the "aggrMeth" attribute
     */
    public void unsetAggrMeth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AGGRMETH$10);
        }
    }
    
    /**
     * Gets the "measUnit" attribute
     */
    public java.lang.String getMeasUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASUNIT$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "measUnit" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMeasUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEASUNIT$12);
            return target;
        }
    }
    
    /**
     * True if has "measUnit" attribute
     */
    public boolean isSetMeasUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEASUNIT$12) != null;
        }
    }
    
    /**
     * Sets the "measUnit" attribute
     */
    public void setMeasUnit(java.lang.String measUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASUNIT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEASUNIT$12);
            }
            target.setStringValue(measUnit);
        }
    }
    
    /**
     * Sets (as xml) the "measUnit" attribute
     */
    public void xsetMeasUnit(org.apache.xmlbeans.XmlString measUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEASUNIT$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEASUNIT$12);
            }
            target.set(measUnit);
        }
    }
    
    /**
     * Unsets the "measUnit" attribute
     */
    public void unsetMeasUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEASUNIT$12);
        }
    }
    
    /**
     * Gets the "scale" attribute
     */
    public java.lang.String getScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALE$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scale" attribute
     */
    public org.apache.xmlbeans.XmlString xgetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCALE$14);
            return target;
        }
    }
    
    /**
     * True if has "scale" attribute
     */
    public boolean isSetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCALE$14) != null;
        }
    }
    
    /**
     * Sets the "scale" attribute
     */
    public void setScale(java.lang.String scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCALE$14);
            }
            target.setStringValue(scale);
        }
    }
    
    /**
     * Sets (as xml) the "scale" attribute
     */
    public void xsetScale(org.apache.xmlbeans.XmlString scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCALE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCALE$14);
            }
            target.set(scale);
        }
    }
    
    /**
     * Unsets the "scale" attribute
     */
    public void unsetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCALE$14);
        }
    }
    
    /**
     * Gets the "origin" attribute
     */
    public java.lang.String getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGIN$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "origin" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIGIN$16);
            return target;
        }
    }
    
    /**
     * True if has "origin" attribute
     */
    public boolean isSetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIGIN$16) != null;
        }
    }
    
    /**
     * Sets the "origin" attribute
     */
    public void setOrigin(java.lang.String origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGIN$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIGIN$16);
            }
            target.setStringValue(origin);
        }
    }
    
    /**
     * Sets (as xml) the "origin" attribute
     */
    public void xsetOrigin(org.apache.xmlbeans.XmlString origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIGIN$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORIGIN$16);
            }
            target.set(origin);
        }
    }
    
    /**
     * Unsets the "origin" attribute
     */
    public void unsetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIGIN$16);
        }
    }
    
    /**
     * Gets the "additivity" attribute
     */
    public edu.umich.icpsr.ddi.MeasureType.Additivity.Enum getAdditivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDITIVITY$18);
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.MeasureType.Additivity.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "additivity" attribute
     */
    public edu.umich.icpsr.ddi.MeasureType.Additivity xgetAdditivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MeasureType.Additivity target = null;
            target = (edu.umich.icpsr.ddi.MeasureType.Additivity)get_store().find_attribute_user(ADDITIVITY$18);
            return target;
        }
    }
    
    /**
     * True if has "additivity" attribute
     */
    public boolean isSetAdditivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDITIVITY$18) != null;
        }
    }
    
    /**
     * Sets the "additivity" attribute
     */
    public void setAdditivity(edu.umich.icpsr.ddi.MeasureType.Additivity.Enum additivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDITIVITY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDITIVITY$18);
            }
            target.setEnumValue(additivity);
        }
    }
    
    /**
     * Sets (as xml) the "additivity" attribute
     */
    public void xsetAdditivity(edu.umich.icpsr.ddi.MeasureType.Additivity additivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MeasureType.Additivity target = null;
            target = (edu.umich.icpsr.ddi.MeasureType.Additivity)get_store().find_attribute_user(ADDITIVITY$18);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.MeasureType.Additivity)get_store().add_attribute_user(ADDITIVITY$18);
            }
            target.set(additivity);
        }
    }
    
    /**
     * Unsets the "additivity" attribute
     */
    public void unsetAdditivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDITIVITY$18);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.MeasureType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.MeasureType.Source
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
     * An XML aggrMeth(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.MeasureType$AggrMeth.
     */
    public static class AggrMethImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.MeasureType.AggrMeth
    {
        private static final long serialVersionUID = 1L;
        
        public AggrMethImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AggrMethImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML additivity(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.MeasureType$Additivity.
     */
    public static class AdditivityImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.MeasureType.Additivity
    {
        private static final long serialVersionUID = 1L;
        
        public AdditivityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AdditivityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
