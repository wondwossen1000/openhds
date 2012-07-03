/*
 * An XML document type.
 * Localname: organisationUnit
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrganisationUnitDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2.impl;
/**
 * A document containing one organisationUnit(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public class OrganisationUnitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganisationUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANISATIONUNIT$0 = 
        new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "organisationUnit");
    
    
    /**
     * Gets the "organisationUnit" element
     */
    public org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit getOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit)get_store().find_element_user(ORGANISATIONUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "organisationUnit" element
     */
    public void setOrganisationUnit(org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit organisationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit)get_store().find_element_user(ORGANISATIONUNIT$0, 0);
            if (target == null)
            {
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit)get_store().add_element_user(ORGANISATIONUNIT$0);
            }
            target.set(organisationUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "organisationUnit" element
     */
    public org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit addNewOrganisationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit target = null;
            target = (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit)get_store().add_element_user(ORGANISATIONUNIT$0);
            return target;
        }
    }
    /**
     * An XML organisationUnit(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public static class OrganisationUnitImpl extends org.dhis2.ns.schema.dxf2.impl.IdentifiableObjectImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit
    {
        private static final long serialVersionUID = 1L;
        
        public OrganisationUnitImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATASETS$0 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataSets");
        private static final javax.xml.namespace.QName OPENINGDATE$2 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "openingDate");
        private static final javax.xml.namespace.QName CLOSEDDATE$4 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "closedDate");
        private static final javax.xml.namespace.QName ACTIVE$6 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "active");
        private static final javax.xml.namespace.QName COMMENT$8 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "comment");
        private static final javax.xml.namespace.QName GEOCODE$10 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "geoCode");
        private static final javax.xml.namespace.QName POLYGONCOORDINATES$12 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "polygonCoordinates");
        private static final javax.xml.namespace.QName LATITUDE$14 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "latitude");
        private static final javax.xml.namespace.QName LONGITUDE$16 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "longitude");
        private static final javax.xml.namespace.QName URL$18 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "url");
        private static final javax.xml.namespace.QName LASTUPDATED$20 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "lastUpdated");
        private static final javax.xml.namespace.QName FEATURE$22 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "feature");
        private static final javax.xml.namespace.QName CHILDREN$24 = 
            new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "children");
        
        
        /**
         * Gets the "dataSets" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets getDataSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets)get_store().find_element_user(DATASETS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dataSets" element
         */
        public boolean isSetDataSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATASETS$0) != 0;
            }
        }
        
        /**
         * Sets the "dataSets" element
         */
        public void setDataSets(org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets dataSets)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets)get_store().find_element_user(DATASETS$0, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets)get_store().add_element_user(DATASETS$0);
                }
                target.set(dataSets);
            }
        }
        
        /**
         * Appends and returns a new empty "dataSets" element
         */
        public org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets addNewDataSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets target = null;
                target = (org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets)get_store().add_element_user(DATASETS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "dataSets" element
         */
        public void unsetDataSets()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATASETS$0, 0);
            }
        }
        
        /**
         * Gets the "openingDate" element
         */
        public java.util.Calendar getOpeningDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENINGDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "openingDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetOpeningDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(OPENINGDATE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "openingDate" element
         */
        public boolean isSetOpeningDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPENINGDATE$2) != 0;
            }
        }
        
        /**
         * Sets the "openingDate" element
         */
        public void setOpeningDate(java.util.Calendar openingDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPENINGDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPENINGDATE$2);
                }
                target.setCalendarValue(openingDate);
            }
        }
        
        /**
         * Sets (as xml) the "openingDate" element
         */
        public void xsetOpeningDate(org.apache.xmlbeans.XmlDate openingDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(OPENINGDATE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(OPENINGDATE$2);
                }
                target.set(openingDate);
            }
        }
        
        /**
         * Unsets the "openingDate" element
         */
        public void unsetOpeningDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPENINGDATE$2, 0);
            }
        }
        
        /**
         * Gets the "closedDate" element
         */
        public java.util.Calendar getClosedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSEDDATE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "closedDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetClosedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(CLOSEDDATE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "closedDate" element
         */
        public boolean isSetClosedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLOSEDDATE$4) != 0;
            }
        }
        
        /**
         * Sets the "closedDate" element
         */
        public void setClosedDate(java.util.Calendar closedDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLOSEDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLOSEDDATE$4);
                }
                target.setCalendarValue(closedDate);
            }
        }
        
        /**
         * Sets (as xml) the "closedDate" element
         */
        public void xsetClosedDate(org.apache.xmlbeans.XmlDate closedDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(CLOSEDDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(CLOSEDDATE$4);
                }
                target.set(closedDate);
            }
        }
        
        /**
         * Unsets the "closedDate" element
         */
        public void unsetClosedDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLOSEDDATE$4, 0);
            }
        }
        
        /**
         * Gets the "active" element
         */
        public boolean getActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVE$6, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "active" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTIVE$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "active" element
         */
        public boolean isSetActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ACTIVE$6) != 0;
            }
        }
        
        /**
         * Sets the "active" element
         */
        public void setActive(boolean active)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTIVE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTIVE$6);
                }
                target.setBooleanValue(active);
            }
        }
        
        /**
         * Sets (as xml) the "active" element
         */
        public void xsetActive(org.apache.xmlbeans.XmlBoolean active)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ACTIVE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ACTIVE$6);
                }
                target.set(active);
            }
        }
        
        /**
         * Unsets the "active" element
         */
        public void unsetActive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ACTIVE$6, 0);
            }
        }
        
        /**
         * Gets the "comment" element
         */
        public java.lang.String getComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "comment" element
         */
        public org.apache.xmlbeans.XmlString xgetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "comment" element
         */
        public boolean isSetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMENT$8) != 0;
            }
        }
        
        /**
         * Sets the "comment" element
         */
        public void setComment(java.lang.String comment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENT$8);
                }
                target.setStringValue(comment);
            }
        }
        
        /**
         * Sets (as xml) the "comment" element
         */
        public void xsetComment(org.apache.xmlbeans.XmlString comment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENT$8);
                }
                target.set(comment);
            }
        }
        
        /**
         * Unsets the "comment" element
         */
        public void unsetComment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMENT$8, 0);
            }
        }
        
        /**
         * Gets the "geoCode" element
         */
        public java.lang.String getGeoCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOCODE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "geoCode" element
         */
        public org.apache.xmlbeans.XmlString xgetGeoCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOCODE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "geoCode" element
         */
        public boolean isSetGeoCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GEOCODE$10) != 0;
            }
        }
        
        /**
         * Sets the "geoCode" element
         */
        public void setGeoCode(java.lang.String geoCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GEOCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GEOCODE$10);
                }
                target.setStringValue(geoCode);
            }
        }
        
        /**
         * Sets (as xml) the "geoCode" element
         */
        public void xsetGeoCode(org.apache.xmlbeans.XmlString geoCode)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GEOCODE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GEOCODE$10);
                }
                target.set(geoCode);
            }
        }
        
        /**
         * Unsets the "geoCode" element
         */
        public void unsetGeoCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GEOCODE$10, 0);
            }
        }
        
        /**
         * Gets the "polygonCoordinates" element
         */
        public java.lang.String getPolygonCoordinates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLYGONCOORDINATES$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "polygonCoordinates" element
         */
        public org.apache.xmlbeans.XmlString xgetPolygonCoordinates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLYGONCOORDINATES$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "polygonCoordinates" element
         */
        public boolean isSetPolygonCoordinates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(POLYGONCOORDINATES$12) != 0;
            }
        }
        
        /**
         * Sets the "polygonCoordinates" element
         */
        public void setPolygonCoordinates(java.lang.String polygonCoordinates)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLYGONCOORDINATES$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLYGONCOORDINATES$12);
                }
                target.setStringValue(polygonCoordinates);
            }
        }
        
        /**
         * Sets (as xml) the "polygonCoordinates" element
         */
        public void xsetPolygonCoordinates(org.apache.xmlbeans.XmlString polygonCoordinates)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLYGONCOORDINATES$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POLYGONCOORDINATES$12);
                }
                target.set(polygonCoordinates);
            }
        }
        
        /**
         * Unsets the "polygonCoordinates" element
         */
        public void unsetPolygonCoordinates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(POLYGONCOORDINATES$12, 0);
            }
        }
        
        /**
         * Gets the "latitude" element
         */
        public java.lang.String getLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "latitude" element
         */
        public org.apache.xmlbeans.XmlString xgetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATITUDE$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "latitude" element
         */
        public boolean isSetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LATITUDE$14) != 0;
            }
        }
        
        /**
         * Sets the "latitude" element
         */
        public void setLatitude(java.lang.String latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$14);
                }
                target.setStringValue(latitude);
            }
        }
        
        /**
         * Sets (as xml) the "latitude" element
         */
        public void xsetLatitude(org.apache.xmlbeans.XmlString latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATITUDE$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LATITUDE$14);
                }
                target.set(latitude);
            }
        }
        
        /**
         * Unsets the "latitude" element
         */
        public void unsetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LATITUDE$14, 0);
            }
        }
        
        /**
         * Gets the "longitude" element
         */
        public java.lang.String getLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "longitude" element
         */
        public org.apache.xmlbeans.XmlString xgetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LONGITUDE$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "longitude" element
         */
        public boolean isSetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LONGITUDE$16) != 0;
            }
        }
        
        /**
         * Sets the "longitude" element
         */
        public void setLongitude(java.lang.String longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$16);
                }
                target.setStringValue(longitude);
            }
        }
        
        /**
         * Sets (as xml) the "longitude" element
         */
        public void xsetLongitude(org.apache.xmlbeans.XmlString longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LONGITUDE$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LONGITUDE$16);
                }
                target.set(longitude);
            }
        }
        
        /**
         * Unsets the "longitude" element
         */
        public void unsetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LONGITUDE$16, 0);
            }
        }
        
        /**
         * Gets the "url" element
         */
        public java.lang.String getUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "url" element
         */
        public org.apache.xmlbeans.XmlString xgetUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$18, 0);
                return target;
            }
        }
        
        /**
         * True if has "url" element
         */
        public boolean isSetUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(URL$18) != 0;
            }
        }
        
        /**
         * Sets the "url" element
         */
        public void setUrl(java.lang.String url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$18);
                }
                target.setStringValue(url);
            }
        }
        
        /**
         * Sets (as xml) the "url" element
         */
        public void xsetUrl(org.apache.xmlbeans.XmlString url)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$18);
                }
                target.set(url);
            }
        }
        
        /**
         * Unsets the "url" element
         */
        public void unsetUrl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(URL$18, 0);
            }
        }
        
        /**
         * Gets the "lastUpdated" element
         */
        public java.util.Calendar getLastUpdated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATED$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "lastUpdated" element
         */
        public org.apache.xmlbeans.XmlDate xgetLastUpdated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(LASTUPDATED$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "lastUpdated" element
         */
        public boolean isSetLastUpdated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LASTUPDATED$20) != 0;
            }
        }
        
        /**
         * Sets the "lastUpdated" element
         */
        public void setLastUpdated(java.util.Calendar lastUpdated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATED$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTUPDATED$20);
                }
                target.setCalendarValue(lastUpdated);
            }
        }
        
        /**
         * Sets (as xml) the "lastUpdated" element
         */
        public void xsetLastUpdated(org.apache.xmlbeans.XmlDate lastUpdated)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(LASTUPDATED$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(LASTUPDATED$20);
                }
                target.set(lastUpdated);
            }
        }
        
        /**
         * Unsets the "lastUpdated" element
         */
        public void unsetLastUpdated()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LASTUPDATED$20, 0);
            }
        }
        
        /**
         * Gets the "feature" element
         */
        public java.lang.String getFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURE$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "feature" element
         */
        public org.apache.xmlbeans.XmlString xgetFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FEATURE$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "feature" element
         */
        public boolean isSetFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FEATURE$22) != 0;
            }
        }
        
        /**
         * Sets the "feature" element
         */
        public void setFeature(java.lang.String feature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FEATURE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FEATURE$22);
                }
                target.setStringValue(feature);
            }
        }
        
        /**
         * Sets (as xml) the "feature" element
         */
        public void xsetFeature(org.apache.xmlbeans.XmlString feature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FEATURE$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FEATURE$22);
                }
                target.set(feature);
            }
        }
        
        /**
         * Unsets the "feature" element
         */
        public void unsetFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FEATURE$22, 0);
            }
        }
        
        /**
         * Gets the "children" element
         */
        public org.dhis2.ns.schema.dxf2.ChildrenDocument.Children getChildren()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ChildrenDocument.Children target = null;
                target = (org.dhis2.ns.schema.dxf2.ChildrenDocument.Children)get_store().find_element_user(CHILDREN$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "children" element
         */
        public void setChildren(org.dhis2.ns.schema.dxf2.ChildrenDocument.Children children)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ChildrenDocument.Children target = null;
                target = (org.dhis2.ns.schema.dxf2.ChildrenDocument.Children)get_store().find_element_user(CHILDREN$24, 0);
                if (target == null)
                {
                    target = (org.dhis2.ns.schema.dxf2.ChildrenDocument.Children)get_store().add_element_user(CHILDREN$24);
                }
                target.set(children);
            }
        }
        
        /**
         * Appends and returns a new empty "children" element
         */
        public org.dhis2.ns.schema.dxf2.ChildrenDocument.Children addNewChildren()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.dhis2.ns.schema.dxf2.ChildrenDocument.Children target = null;
                target = (org.dhis2.ns.schema.dxf2.ChildrenDocument.Children)get_store().add_element_user(CHILDREN$24);
                return target;
            }
        }
        /**
         * An XML dataSets(@http://dhis2.org/ns/schema/dxf2).
         *
         * This is a complex type.
         */
        public static class DataSetsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.dhis2.ns.schema.dxf2.OrganisationUnitDocument.OrganisationUnit.DataSets
        {
            private static final long serialVersionUID = 1L;
            
            public DataSetsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DATASETREF$0 = 
                new javax.xml.namespace.QName("http://dhis2.org/ns/schema/dxf2", "dataSetRef");
            
            
            /**
             * Gets array of all "dataSetRef" elements
             */
            public org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef[] getDataSetRefArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DATASETREF$0, targetList);
                    org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef[] result = new org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "dataSetRef" element
             */
            public org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef getDataSetRefArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef)get_store().find_element_user(DATASETREF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "dataSetRef" element
             */
            public int sizeOfDataSetRefArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DATASETREF$0);
                }
            }
            
            /**
             * Sets array of all "dataSetRef" element
             */
            public void setDataSetRefArray(org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef[] dataSetRefArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(dataSetRefArray, DATASETREF$0);
                }
            }
            
            /**
             * Sets ith "dataSetRef" element
             */
            public void setDataSetRefArray(int i, org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef dataSetRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef)get_store().find_element_user(DATASETREF$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(dataSetRef);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "dataSetRef" element
             */
            public org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef insertNewDataSetRef(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef)get_store().insert_element_user(DATASETREF$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "dataSetRef" element
             */
            public org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef addNewDataSetRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef target = null;
                    target = (org.dhis2.ns.schema.dxf2.DataSetRefDocument.DataSetRef)get_store().add_element_user(DATASETREF$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "dataSetRef" element
             */
            public void removeDataSetRef(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DATASETREF$0, i);
                }
            }
        }
    }
}
