/*
 * An XML document type.
 * Localname: dataDictionaries
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DataDictionariesDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dataDictionaries(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DataDictionariesDocumentImpl extends org.dhis2.ns.schema.dxf2.impl.DataDictionaryDefinitionDocumentImpl implements org.dhis2.ns.schema.dxf2.DataDictionariesDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataDictionariesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATADICTIONARIES$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataDictionaries");
    
    
    /**
     * Gets the "dataDictionaries" element
     */
    public org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition getDataDictionaries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition target = null;
            target = (org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition)get_store().find_element_user(DATADICTIONARIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dataDictionaries" element
     */
    public void setDataDictionaries(org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition dataDictionaries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition target = null;
            target = (org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition)get_store().find_element_user(DATADICTIONARIES$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition)get_store().add_element_user(DATADICTIONARIES$0);
            }
            target.set(dataDictionaries);
        }
    }
    
    /**
     * Appends and returns a new empty "dataDictionaries" element
     */
    public org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition addNewDataDictionaries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition target = null;
            target = (org.dhis2.ns.schema.dxf2.DataDictionaryDefinitionDocument.DataDictionaryDefinition)get_store().add_element_user(DATADICTIONARIES$0);
            return target;
        }
    }
}
