/*
 * An XML document type.
 * Localname: orgUnitStructure
 * Namespace: http://dhis2.org/ns/schema/dxf2
 * Java type: org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument
 *
 * Automatically generated - do not modify.
 */
package org.dhis2.ns.schema.dxf2;


/**
 * A document containing one orgUnitStructure(@http://dhis2.org/ns/schema/dxf2) element.
 *
 * This is a complex type.
 */
public interface OrgUnitStructureDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrgUnitStructureDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("orgunitstructure580fdoctype");
    
    /**
     * Gets the "orgUnitStructure" element
     */
    org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure getOrgUnitStructure();
    
    /**
     * Sets the "orgUnitStructure" element
     */
    void setOrgUnitStructure(org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure orgUnitStructure);
    
    /**
     * Appends and returns a new empty "orgUnitStructure" element
     */
    org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure addNewOrgUnitStructure();
    
    /**
     * An XML orgUnitStructure(@http://dhis2.org/ns/schema/dxf2).
     *
     * This is a complex type.
     */
    public interface OrgUnitStructure extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrgUnitStructure.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC17BA6E8E56BDD38D3B388D2F7C7E5D0").resolveHandle("orgunitstructure6048elemtype");
        
        /**
         * Gets the "organisationUnitLevels" element
         */
        org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels getOrganisationUnitLevels();
        
        /**
         * Sets the "organisationUnitLevels" element
         */
        void setOrganisationUnitLevels(org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels organisationUnitLevels);
        
        /**
         * Appends and returns a new empty "organisationUnitLevels" element
         */
        org.dhis2.ns.schema.dxf2.OrganisationUnitLevelsDocument.OrganisationUnitLevels addNewOrganisationUnitLevels();
        
        /**
         * Gets the "organisationUnits" element
         */
        org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits getOrganisationUnits();
        
        /**
         * Sets the "organisationUnits" element
         */
        void setOrganisationUnits(org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits organisationUnits);
        
        /**
         * Appends and returns a new empty "organisationUnits" element
         */
        org.dhis2.ns.schema.dxf2.OrganisationUnitsDocument.OrganisationUnits addNewOrganisationUnits();
        
        /**
         * Gets the "organisationUnitRelationships" element
         */
        org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships getOrganisationUnitRelationships();
        
        /**
         * Sets the "organisationUnitRelationships" element
         */
        void setOrganisationUnitRelationships(org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships organisationUnitRelationships);
        
        /**
         * Appends and returns a new empty "organisationUnitRelationships" element
         */
        org.dhis2.ns.schema.dxf2.OrganisationUnitRelationshipsDocument.OrganisationUnitRelationships addNewOrganisationUnitRelationships();
        
        /**
         * Gets the "organisationUnitGroups" element
         */
        org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups getOrganisationUnitGroups();
        
        /**
         * Sets the "organisationUnitGroups" element
         */
        void setOrganisationUnitGroups(org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups organisationUnitGroups);
        
        /**
         * Appends and returns a new empty "organisationUnitGroups" element
         */
        org.dhis2.ns.schema.dxf2.OrganisationUnitGroupsDocument.OrganisationUnitGroups addNewOrganisationUnitGroups();
        
        /**
         * Gets the "groupSets" element
         */
        org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets getGroupSets();
        
        /**
         * Sets the "groupSets" element
         */
        void setGroupSets(org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets groupSets);
        
        /**
         * Appends and returns a new empty "groupSets" element
         */
        org.dhis2.ns.schema.dxf2.GroupSetsDocument.GroupSets addNewGroupSets();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure newInstance() {
              return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument.OrgUnitStructure) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument newInstance() {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.dhis2.ns.schema.dxf2.OrgUnitStructureDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
