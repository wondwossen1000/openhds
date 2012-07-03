/*
 * XML Type:  recDimnsnType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.RecDimnsnType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML recDimnsnType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class RecDimnsnTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.RecDimnsnType
{
    private static final long serialVersionUID = 1L;
    
    public RecDimnsnTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VARQNTY$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "varQnty");
    private static final javax.xml.namespace.QName CASEQNTY$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "caseQnty");
    private static final javax.xml.namespace.QName LOGRECL$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "logRecL");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$8 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$10 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$12 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName LEVEL$14 = 
        new javax.xml.namespace.QName("", "level");
    
    
    /**
     * Gets the "varQnty" element
     */
    public edu.umich.icpsr.ddi.VarQntyType getVarQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarQntyType target = null;
            target = (edu.umich.icpsr.ddi.VarQntyType)get_store().find_element_user(VARQNTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "varQnty" element
     */
    public boolean isSetVarQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARQNTY$0) != 0;
        }
    }
    
    /**
     * Sets the "varQnty" element
     */
    public void setVarQnty(edu.umich.icpsr.ddi.VarQntyType varQnty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarQntyType target = null;
            target = (edu.umich.icpsr.ddi.VarQntyType)get_store().find_element_user(VARQNTY$0, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarQntyType)get_store().add_element_user(VARQNTY$0);
            }
            target.set(varQnty);
        }
    }
    
    /**
     * Appends and returns a new empty "varQnty" element
     */
    public edu.umich.icpsr.ddi.VarQntyType addNewVarQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarQntyType target = null;
            target = (edu.umich.icpsr.ddi.VarQntyType)get_store().add_element_user(VARQNTY$0);
            return target;
        }
    }
    
    /**
     * Unsets the "varQnty" element
     */
    public void unsetVarQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARQNTY$0, 0);
        }
    }
    
    /**
     * Gets the "caseQnty" element
     */
    public edu.umich.icpsr.ddi.CaseQntyType getCaseQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CaseQntyType target = null;
            target = (edu.umich.icpsr.ddi.CaseQntyType)get_store().find_element_user(CASEQNTY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "caseQnty" element
     */
    public boolean isSetCaseQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CASEQNTY$2) != 0;
        }
    }
    
    /**
     * Sets the "caseQnty" element
     */
    public void setCaseQnty(edu.umich.icpsr.ddi.CaseQntyType caseQnty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CaseQntyType target = null;
            target = (edu.umich.icpsr.ddi.CaseQntyType)get_store().find_element_user(CASEQNTY$2, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CaseQntyType)get_store().add_element_user(CASEQNTY$2);
            }
            target.set(caseQnty);
        }
    }
    
    /**
     * Appends and returns a new empty "caseQnty" element
     */
    public edu.umich.icpsr.ddi.CaseQntyType addNewCaseQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CaseQntyType target = null;
            target = (edu.umich.icpsr.ddi.CaseQntyType)get_store().add_element_user(CASEQNTY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "caseQnty" element
     */
    public void unsetCaseQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CASEQNTY$2, 0);
        }
    }
    
    /**
     * Gets the "logRecL" element
     */
    public edu.umich.icpsr.ddi.LogRecLType getLogRecL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LogRecLType target = null;
            target = (edu.umich.icpsr.ddi.LogRecLType)get_store().find_element_user(LOGRECL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "logRecL" element
     */
    public boolean isSetLogRecL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGRECL$4) != 0;
        }
    }
    
    /**
     * Sets the "logRecL" element
     */
    public void setLogRecL(edu.umich.icpsr.ddi.LogRecLType logRecL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LogRecLType target = null;
            target = (edu.umich.icpsr.ddi.LogRecLType)get_store().find_element_user(LOGRECL$4, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.LogRecLType)get_store().add_element_user(LOGRECL$4);
            }
            target.set(logRecL);
        }
    }
    
    /**
     * Appends and returns a new empty "logRecL" element
     */
    public edu.umich.icpsr.ddi.LogRecLType addNewLogRecL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LogRecLType target = null;
            target = (edu.umich.icpsr.ddi.LogRecLType)get_store().add_element_user(LOGRECL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "logRecL" element
     */
    public void unsetLogRecL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGRECL$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
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
            return get_store().find_attribute_user(ID$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
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
            get_store().remove_attribute(ID$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$8);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$8);
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
            return get_store().find_attribute_user(XMLLANG$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$8);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$8);
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
            get_store().remove_attribute(XMLLANG$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$10);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$10);
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
            return get_store().find_attribute_user(LANG$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$10);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$10);
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
            get_store().remove_attribute(LANG$10);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.RecDimnsnType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$12);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.RecDimnsnType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.RecDimnsnType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecDimnsnType.Source target = null;
            target = (edu.umich.icpsr.ddi.RecDimnsnType.Source)get_store().find_attribute_user(SOURCE$12);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RecDimnsnType.Source)get_default_attribute_value(SOURCE$12);
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
            return get_store().find_attribute_user(SOURCE$12) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.RecDimnsnType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$12);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.RecDimnsnType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RecDimnsnType.Source target = null;
            target = (edu.umich.icpsr.ddi.RecDimnsnType.Source)get_store().find_attribute_user(SOURCE$12);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RecDimnsnType.Source)get_store().add_attribute_user(SOURCE$12);
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
            get_store().remove_attribute(SOURCE$12);
        }
    }
    
    /**
     * Gets the "level" attribute
     */
    public java.lang.String getLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "level" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEVEL$14);
            return target;
        }
    }
    
    /**
     * True if has "level" attribute
     */
    public boolean isSetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LEVEL$14) != null;
        }
    }
    
    /**
     * Sets the "level" attribute
     */
    public void setLevel(java.lang.String level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LEVEL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LEVEL$14);
            }
            target.setStringValue(level);
        }
    }
    
    /**
     * Sets (as xml) the "level" attribute
     */
    public void xsetLevel(org.apache.xmlbeans.XmlString level)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LEVEL$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LEVEL$14);
            }
            target.set(level);
        }
    }
    
    /**
     * Unsets the "level" attribute
     */
    public void unsetLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LEVEL$14);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.RecDimnsnType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.RecDimnsnType.Source
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
