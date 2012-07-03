/*
 * XML Type:  titlStmtType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.TitlStmtType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML titlStmtType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface TitlStmtType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TitlStmtType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("titlstmttype3f7etype");
    
    /**
     * Gets the "titl" element
     */
    edu.umich.icpsr.ddi.TitlType getTitl();
    
    /**
     * Sets the "titl" element
     */
    void setTitl(edu.umich.icpsr.ddi.TitlType titl);
    
    /**
     * Appends and returns a new empty "titl" element
     */
    edu.umich.icpsr.ddi.TitlType addNewTitl();
    
    /**
     * Gets array of all "subTitl" elements
     */
    edu.umich.icpsr.ddi.SubTitlType[] getSubTitlArray();
    
    /**
     * Gets ith "subTitl" element
     */
    edu.umich.icpsr.ddi.SubTitlType getSubTitlArray(int i);
    
    /**
     * Returns number of "subTitl" element
     */
    int sizeOfSubTitlArray();
    
    /**
     * Sets array of all "subTitl" element
     */
    void setSubTitlArray(edu.umich.icpsr.ddi.SubTitlType[] subTitlArray);
    
    /**
     * Sets ith "subTitl" element
     */
    void setSubTitlArray(int i, edu.umich.icpsr.ddi.SubTitlType subTitl);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subTitl" element
     */
    edu.umich.icpsr.ddi.SubTitlType insertNewSubTitl(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subTitl" element
     */
    edu.umich.icpsr.ddi.SubTitlType addNewSubTitl();
    
    /**
     * Removes the ith "subTitl" element
     */
    void removeSubTitl(int i);
    
    /**
     * Gets array of all "altTitl" elements
     */
    edu.umich.icpsr.ddi.AltTitlType[] getAltTitlArray();
    
    /**
     * Gets ith "altTitl" element
     */
    edu.umich.icpsr.ddi.AltTitlType getAltTitlArray(int i);
    
    /**
     * Returns number of "altTitl" element
     */
    int sizeOfAltTitlArray();
    
    /**
     * Sets array of all "altTitl" element
     */
    void setAltTitlArray(edu.umich.icpsr.ddi.AltTitlType[] altTitlArray);
    
    /**
     * Sets ith "altTitl" element
     */
    void setAltTitlArray(int i, edu.umich.icpsr.ddi.AltTitlType altTitl);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "altTitl" element
     */
    edu.umich.icpsr.ddi.AltTitlType insertNewAltTitl(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "altTitl" element
     */
    edu.umich.icpsr.ddi.AltTitlType addNewAltTitl();
    
    /**
     * Removes the ith "altTitl" element
     */
    void removeAltTitl(int i);
    
    /**
     * Gets array of all "parTitl" elements
     */
    edu.umich.icpsr.ddi.ParTitlType[] getParTitlArray();
    
    /**
     * Gets ith "parTitl" element
     */
    edu.umich.icpsr.ddi.ParTitlType getParTitlArray(int i);
    
    /**
     * Returns number of "parTitl" element
     */
    int sizeOfParTitlArray();
    
    /**
     * Sets array of all "parTitl" element
     */
    void setParTitlArray(edu.umich.icpsr.ddi.ParTitlType[] parTitlArray);
    
    /**
     * Sets ith "parTitl" element
     */
    void setParTitlArray(int i, edu.umich.icpsr.ddi.ParTitlType parTitl);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parTitl" element
     */
    edu.umich.icpsr.ddi.ParTitlType insertNewParTitl(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parTitl" element
     */
    edu.umich.icpsr.ddi.ParTitlType addNewParTitl();
    
    /**
     * Removes the ith "parTitl" element
     */
    void removeParTitl(int i);
    
    /**
     * Gets array of all "IDNo" elements
     */
    edu.umich.icpsr.ddi.IDNoType[] getIDNoArray();
    
    /**
     * Gets ith "IDNo" element
     */
    edu.umich.icpsr.ddi.IDNoType getIDNoArray(int i);
    
    /**
     * Returns number of "IDNo" element
     */
    int sizeOfIDNoArray();
    
    /**
     * Sets array of all "IDNo" element
     */
    void setIDNoArray(edu.umich.icpsr.ddi.IDNoType[] idNoArray);
    
    /**
     * Sets ith "IDNo" element
     */
    void setIDNoArray(int i, edu.umich.icpsr.ddi.IDNoType idNo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IDNo" element
     */
    edu.umich.icpsr.ddi.IDNoType insertNewIDNo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IDNo" element
     */
    edu.umich.icpsr.ddi.IDNoType addNewIDNo();
    
    /**
     * Removes the ith "IDNo" element
     */
    void removeIDNo(int i);
    
    /**
     * Gets the "ID" attribute
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    org.apache.xmlbeans.XmlID xgetID();
    
    /**
     * True if has "ID" attribute
     */
    boolean isSetID();
    
    /**
     * Sets the "ID" attribute
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(org.apache.xmlbeans.XmlID id);
    
    /**
     * Unsets the "ID" attribute
     */
    void unsetID();
    
    /**
     * Gets the "xml-lang" attribute
     */
    java.lang.String getXmlLang();
    
    /**
     * Gets (as xml) the "xml-lang" attribute
     */
    org.apache.xmlbeans.XmlNMTOKEN xgetXmlLang();
    
    /**
     * True if has "xml-lang" attribute
     */
    boolean isSetXmlLang();
    
    /**
     * Sets the "xml-lang" attribute
     */
    void setXmlLang(java.lang.String xmlLang);
    
    /**
     * Sets (as xml) the "xml-lang" attribute
     */
    void xsetXmlLang(org.apache.xmlbeans.XmlNMTOKEN xmlLang);
    
    /**
     * Unsets the "xml-lang" attribute
     */
    void unsetXmlLang();
    
    /**
     * Gets the "lang" attribute
     */
    java.lang.String getLang();
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    org.apache.xmlbeans.XmlLanguage xgetLang();
    
    /**
     * True if has "lang" attribute
     */
    boolean isSetLang();
    
    /**
     * Sets the "lang" attribute
     */
    void setLang(java.lang.String lang);
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    void xsetLang(org.apache.xmlbeans.XmlLanguage lang);
    
    /**
     * Unsets the "lang" attribute
     */
    void unsetLang();
    
    /**
     * Gets the "source" attribute
     */
    edu.umich.icpsr.ddi.TitlStmtType.Source.Enum getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    edu.umich.icpsr.ddi.TitlStmtType.Source xgetSource();
    
    /**
     * True if has "source" attribute
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(edu.umich.icpsr.ddi.TitlStmtType.Source.Enum source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(edu.umich.icpsr.ddi.TitlStmtType.Source source);
    
    /**
     * Unsets the "source" attribute
     */
    void unsetSource();
    
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.TitlStmtType$Source.
     */
    public interface Source extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("sourcebb79attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ARCHIVE = Enum.forString("archive");
        static final Enum PRODUCER = Enum.forString("producer");
        
        static final int INT_ARCHIVE = Enum.INT_ARCHIVE;
        static final int INT_PRODUCER = Enum.INT_PRODUCER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.TitlStmtType$Source.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ARCHIVE
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_ARCHIVE = 1;
            static final int INT_PRODUCER = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("archive", INT_ARCHIVE),
                    new Enum("producer", INT_PRODUCER),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.umich.icpsr.ddi.TitlStmtType.Source newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.TitlStmtType.Source) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.TitlStmtType.Source newInstance() {
              return (edu.umich.icpsr.ddi.TitlStmtType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.TitlStmtType.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.TitlStmtType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.TitlStmtType newInstance() {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.TitlStmtType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.TitlStmtType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.TitlStmtType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.TitlStmtType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.TitlStmtType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.TitlStmtType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.TitlStmtType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.TitlStmtType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.TitlStmtType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.TitlStmtType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.TitlStmtType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.TitlStmtType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.TitlStmtType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.TitlStmtType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.TitlStmtType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.TitlStmtType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.TitlStmtType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.TitlStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
