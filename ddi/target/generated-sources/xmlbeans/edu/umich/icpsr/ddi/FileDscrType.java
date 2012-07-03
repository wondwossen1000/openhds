/*
 * XML Type:  fileDscrType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.FileDscrType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML fileDscrType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface FileDscrType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FileDscrType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("filedscrtype7599type");
    
    /**
     * Gets array of all "fileTxt" elements
     */
    edu.umich.icpsr.ddi.FileTxtType[] getFileTxtArray();
    
    /**
     * Gets ith "fileTxt" element
     */
    edu.umich.icpsr.ddi.FileTxtType getFileTxtArray(int i);
    
    /**
     * Returns number of "fileTxt" element
     */
    int sizeOfFileTxtArray();
    
    /**
     * Sets array of all "fileTxt" element
     */
    void setFileTxtArray(edu.umich.icpsr.ddi.FileTxtType[] fileTxtArray);
    
    /**
     * Sets ith "fileTxt" element
     */
    void setFileTxtArray(int i, edu.umich.icpsr.ddi.FileTxtType fileTxt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fileTxt" element
     */
    edu.umich.icpsr.ddi.FileTxtType insertNewFileTxt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fileTxt" element
     */
    edu.umich.icpsr.ddi.FileTxtType addNewFileTxt();
    
    /**
     * Removes the ith "fileTxt" element
     */
    void removeFileTxt(int i);
    
    /**
     * Gets the "locMap" element
     */
    edu.umich.icpsr.ddi.LocMapType getLocMap();
    
    /**
     * True if has "locMap" element
     */
    boolean isSetLocMap();
    
    /**
     * Sets the "locMap" element
     */
    void setLocMap(edu.umich.icpsr.ddi.LocMapType locMap);
    
    /**
     * Appends and returns a new empty "locMap" element
     */
    edu.umich.icpsr.ddi.LocMapType addNewLocMap();
    
    /**
     * Unsets the "locMap" element
     */
    void unsetLocMap();
    
    /**
     * Gets array of all "notes" elements
     */
    edu.umich.icpsr.ddi.NotesType[] getNotesArray();
    
    /**
     * Gets ith "notes" element
     */
    edu.umich.icpsr.ddi.NotesType getNotesArray(int i);
    
    /**
     * Returns number of "notes" element
     */
    int sizeOfNotesArray();
    
    /**
     * Sets array of all "notes" element
     */
    void setNotesArray(edu.umich.icpsr.ddi.NotesType[] notesArray);
    
    /**
     * Sets ith "notes" element
     */
    void setNotesArray(int i, edu.umich.icpsr.ddi.NotesType notes);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "notes" element
     */
    edu.umich.icpsr.ddi.NotesType insertNewNotes(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "notes" element
     */
    edu.umich.icpsr.ddi.NotesType addNewNotes();
    
    /**
     * Removes the ith "notes" element
     */
    void removeNotes(int i);
    
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
    edu.umich.icpsr.ddi.FileDscrType.Source.Enum getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    edu.umich.icpsr.ddi.FileDscrType.Source xgetSource();
    
    /**
     * True if has "source" attribute
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(edu.umich.icpsr.ddi.FileDscrType.Source.Enum source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(edu.umich.icpsr.ddi.FileDscrType.Source source);
    
    /**
     * Unsets the "source" attribute
     */
    void unsetSource();
    
    /**
     * Gets the "URI" attribute
     */
    java.lang.String getURI();
    
    /**
     * Gets (as xml) the "URI" attribute
     */
    org.apache.xmlbeans.XmlString xgetURI();
    
    /**
     * True if has "URI" attribute
     */
    boolean isSetURI();
    
    /**
     * Sets the "URI" attribute
     */
    void setURI(java.lang.String uri);
    
    /**
     * Sets (as xml) the "URI" attribute
     */
    void xsetURI(org.apache.xmlbeans.XmlString uri);
    
    /**
     * Unsets the "URI" attribute
     */
    void unsetURI();
    
    /**
     * Gets the "sdatrefs" attribute
     */
    java.util.List getSdatrefs();
    
    /**
     * Gets (as xml) the "sdatrefs" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetSdatrefs();
    
    /**
     * True if has "sdatrefs" attribute
     */
    boolean isSetSdatrefs();
    
    /**
     * Sets the "sdatrefs" attribute
     */
    void setSdatrefs(java.util.List sdatrefs);
    
    /**
     * Sets (as xml) the "sdatrefs" attribute
     */
    void xsetSdatrefs(org.apache.xmlbeans.XmlIDREFS sdatrefs);
    
    /**
     * Unsets the "sdatrefs" attribute
     */
    void unsetSdatrefs();
    
    /**
     * Gets the "methrefs" attribute
     */
    java.util.List getMethrefs();
    
    /**
     * Gets (as xml) the "methrefs" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetMethrefs();
    
    /**
     * True if has "methrefs" attribute
     */
    boolean isSetMethrefs();
    
    /**
     * Sets the "methrefs" attribute
     */
    void setMethrefs(java.util.List methrefs);
    
    /**
     * Sets (as xml) the "methrefs" attribute
     */
    void xsetMethrefs(org.apache.xmlbeans.XmlIDREFS methrefs);
    
    /**
     * Unsets the "methrefs" attribute
     */
    void unsetMethrefs();
    
    /**
     * Gets the "pubrefs" attribute
     */
    java.util.List getPubrefs();
    
    /**
     * Gets (as xml) the "pubrefs" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetPubrefs();
    
    /**
     * True if has "pubrefs" attribute
     */
    boolean isSetPubrefs();
    
    /**
     * Sets the "pubrefs" attribute
     */
    void setPubrefs(java.util.List pubrefs);
    
    /**
     * Sets (as xml) the "pubrefs" attribute
     */
    void xsetPubrefs(org.apache.xmlbeans.XmlIDREFS pubrefs);
    
    /**
     * Unsets the "pubrefs" attribute
     */
    void unsetPubrefs();
    
    /**
     * Gets the "access" attribute
     */
    java.util.List getAccess();
    
    /**
     * Gets (as xml) the "access" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetAccess();
    
    /**
     * True if has "access" attribute
     */
    boolean isSetAccess();
    
    /**
     * Sets the "access" attribute
     */
    void setAccess(java.util.List access);
    
    /**
     * Sets (as xml) the "access" attribute
     */
    void xsetAccess(org.apache.xmlbeans.XmlIDREFS access);
    
    /**
     * Unsets the "access" attribute
     */
    void unsetAccess();
    
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.FileDscrType$Source.
     */
    public interface Source extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("sourcef194attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ARCHIVE = Enum.forString("archive");
        static final Enum PRODUCER = Enum.forString("producer");
        
        static final int INT_ARCHIVE = Enum.INT_ARCHIVE;
        static final int INT_PRODUCER = Enum.INT_PRODUCER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.FileDscrType$Source.
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
            public static edu.umich.icpsr.ddi.FileDscrType.Source newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.FileDscrType.Source) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.FileDscrType.Source newInstance() {
              return (edu.umich.icpsr.ddi.FileDscrType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.FileDscrType.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.FileDscrType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.FileDscrType newInstance() {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.FileDscrType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.FileDscrType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.FileDscrType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.FileDscrType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.FileDscrType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.FileDscrType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.FileDscrType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.FileDscrType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.FileDscrType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.FileDscrType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.FileDscrType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.FileDscrType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.FileDscrType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.FileDscrType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.FileDscrType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.FileDscrType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.FileDscrType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.FileDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
