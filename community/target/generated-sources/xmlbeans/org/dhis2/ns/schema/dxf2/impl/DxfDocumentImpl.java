/*
 * An XML document type.
 * Localname: dxf
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.DxfDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one dxf(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class DxfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DxfDocument
{
    private static final long serialVersionUID = 1L;
    
    public DxfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DXF$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dxf");
    
    
    /**
     * Gets the "dxf" element
     */
    public org.dhis2.ns.schema.dxf2.DxfDocument.Dxf getDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DxfDocument.Dxf target = null;
            target = (org.dhis2.ns.schema.dxf2.DxfDocument.Dxf)get_store().find_element_user(DXF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dxf" element
     */
    public void setDxf(org.dhis2.ns.schema.dxf2.DxfDocument.Dxf dxf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DxfDocument.Dxf target = null;
            target = (org.dhis2.ns.schema.dxf2.DxfDocument.Dxf)get_store().find_element_user(DXF$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.DxfDocument.Dxf)get_store().add_element_user(DXF$0);
            }
            target.set(dxf);
        }
    }
    
    /**
     * Appends and returns a new empty "dxf" element
     */
    public org.dhis2.ns.schema.dxf2.DxfDocument.Dxf addNewDxf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.DxfDocument.Dxf target = null;
            target = (org.dhis2.ns.schema.dxf2.DxfDocument.Dxf)get_store().add_element_user(DXF$0);
            return target;
        }
    }
    /**
     * An XML dxf(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class DxfImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.DxfDocument.Dxf
    {
        private static final long serialVersionUID = 1L;
        
        public DxfImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName METADATA$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "metadata");
        private static final javax.xml.namespace.QName DATAVALUES$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataValues");
        
        
        /**
         * Gets the "metadata" element
         */
        public org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata getMetadata()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata target = null;
                target = (org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata)get_store().find_element_user(METADATA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "metadata" element
         */
        public void setMetadata(org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata metadata)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata target = null;
                target = (org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata)get_store().find_element_user(METADATA$0, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata)get_store().add_element_user(METADATA$0);
                }
                target.set(metadata);
            }
        }
        
        /**
         * Appends and returns a new empty "metadata" element
         */
        public org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata addNewMetadata()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata target = null;
                target = (org.dhis2.ns.schema.dxf2.MetadataDocument.Metadata)get_store().add_element_user(METADATA$0);
                return target;
            }
        }
        
        /**
         * Gets the "dataValues" element
         */
        public org.dhis2.ns.schema.dxf2.DataValues getDataValues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataValues target = null;
                target = (org.dhis2.ns.schema.dxf2.DataValues)get_store().find_element_user(DATAVALUES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dataValues" element
         */
        public boolean isSetDataValues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATAVALUES$2) != 0;
            }
        }
        
        /**
         * Sets the "dataValues" element
         */
        public void setDataValues(org.dhis2.ns.schema.dxf2.DataValues dataValues)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataValues target = null;
                target = (org.dhis2.ns.schema.dxf2.DataValues)get_store().find_element_user(DATAVALUES$2, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.DataValues)get_store().add_element_user(DATAVALUES$2);
                }
                target.set(dataValues);
            }
        }
        
        /**
         * Appends and returns a new empty "dataValues" element
         */
        public org.dhis2.ns.schema.dxf2.DataValues addNewDataValues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.DataValues target = null;
                target = (org.dhis2.ns.schema.dxf2.DataValues)get_store().add_element_user(DATAVALUES$2);
                return target;
            }
        }
        
        /**
         * Unsets the "dataValues" element
         */
        public void unsetDataValues()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATAVALUES$2, 0);
            }
        }
    }
}
