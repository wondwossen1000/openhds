/*
 * XML Type:  fileTxtType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.FileTxtType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML fileTxtType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface FileTxtType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FileTxtType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("filetxttype8611type");
    
    /**
     * Gets the "fileName" element
     */
    edu.umich.icpsr.ddi.FileNameType getFileName();
    
    /**
     * True if has "fileName" element
     */
    boolean isSetFileName();
    
    /**
     * Sets the "fileName" element
     */
    void setFileName(edu.umich.icpsr.ddi.FileNameType fileName);
    
    /**
     * Appends and returns a new empty "fileName" element
     */
    edu.umich.icpsr.ddi.FileNameType addNewFileName();
    
    /**
     * Unsets the "fileName" element
     */
    void unsetFileName();
    
    /**
     * Gets the "fileCont" element
     */
    edu.umich.icpsr.ddi.FileContType getFileCont();
    
    /**
     * True if has "fileCont" element
     */
    boolean isSetFileCont();
    
    /**
     * Sets the "fileCont" element
     */
    void setFileCont(edu.umich.icpsr.ddi.FileContType fileCont);
    
    /**
     * Appends and returns a new empty "fileCont" element
     */
    edu.umich.icpsr.ddi.FileContType addNewFileCont();
    
    /**
     * Unsets the "fileCont" element
     */
    void unsetFileCont();
    
    /**
     * Gets the "fileStrc" element
     */
    edu.umich.icpsr.ddi.FileStrcType getFileStrc();
    
    /**
     * True if has "fileStrc" element
     */
    boolean isSetFileStrc();
    
    /**
     * Sets the "fileStrc" element
     */
    void setFileStrc(edu.umich.icpsr.ddi.FileStrcType fileStrc);
    
    /**
     * Appends and returns a new empty "fileStrc" element
     */
    edu.umich.icpsr.ddi.FileStrcType addNewFileStrc();
    
    /**
     * Unsets the "fileStrc" element
     */
    void unsetFileStrc();
    
    /**
     * Gets the "dimensns" element
     */
    edu.umich.icpsr.ddi.DimensnsType getDimensns();
    
    /**
     * True if has "dimensns" element
     */
    boolean isSetDimensns();
    
    /**
     * Sets the "dimensns" element
     */
    void setDimensns(edu.umich.icpsr.ddi.DimensnsType dimensns);
    
    /**
     * Appends and returns a new empty "dimensns" element
     */
    edu.umich.icpsr.ddi.DimensnsType addNewDimensns();
    
    /**
     * Unsets the "dimensns" element
     */
    void unsetDimensns();
    
    /**
     * Gets the "fileType" element
     */
    edu.umich.icpsr.ddi.FileTypeType getFileType();
    
    /**
     * True if has "fileType" element
     */
    boolean isSetFileType();
    
    /**
     * Sets the "fileType" element
     */
    void setFileType(edu.umich.icpsr.ddi.FileTypeType fileType);
    
    /**
     * Appends and returns a new empty "fileType" element
     */
    edu.umich.icpsr.ddi.FileTypeType addNewFileType();
    
    /**
     * Unsets the "fileType" element
     */
    void unsetFileType();
    
    /**
     * Gets the "format" element
     */
    edu.umich.icpsr.ddi.FormatType getFormat();
    
    /**
     * True if has "format" element
     */
    boolean isSetFormat();
    
    /**
     * Sets the "format" element
     */
    void setFormat(edu.umich.icpsr.ddi.FormatType format);
    
    /**
     * Appends and returns a new empty "format" element
     */
    edu.umich.icpsr.ddi.FormatType addNewFormat();
    
    /**
     * Unsets the "format" element
     */
    void unsetFormat();
    
    /**
     * Gets the "filePlac" element
     */
    edu.umich.icpsr.ddi.FilePlacType getFilePlac();
    
    /**
     * True if has "filePlac" element
     */
    boolean isSetFilePlac();
    
    /**
     * Sets the "filePlac" element
     */
    void setFilePlac(edu.umich.icpsr.ddi.FilePlacType filePlac);
    
    /**
     * Appends and returns a new empty "filePlac" element
     */
    edu.umich.icpsr.ddi.FilePlacType addNewFilePlac();
    
    /**
     * Unsets the "filePlac" element
     */
    void unsetFilePlac();
    
    /**
     * Gets array of all "dataChck" elements
     */
    edu.umich.icpsr.ddi.DataChckType[] getDataChckArray();
    
    /**
     * Gets ith "dataChck" element
     */
    edu.umich.icpsr.ddi.DataChckType getDataChckArray(int i);
    
    /**
     * Returns number of "dataChck" element
     */
    int sizeOfDataChckArray();
    
    /**
     * Sets array of all "dataChck" element
     */
    void setDataChckArray(edu.umich.icpsr.ddi.DataChckType[] dataChckArray);
    
    /**
     * Sets ith "dataChck" element
     */
    void setDataChckArray(int i, edu.umich.icpsr.ddi.DataChckType dataChck);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataChck" element
     */
    edu.umich.icpsr.ddi.DataChckType insertNewDataChck(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataChck" element
     */
    edu.umich.icpsr.ddi.DataChckType addNewDataChck();
    
    /**
     * Removes the ith "dataChck" element
     */
    void removeDataChck(int i);
    
    /**
     * Gets the "ProcStat" element
     */
    edu.umich.icpsr.ddi.ProcStatType getProcStat();
    
    /**
     * True if has "ProcStat" element
     */
    boolean isSetProcStat();
    
    /**
     * Sets the "ProcStat" element
     */
    void setProcStat(edu.umich.icpsr.ddi.ProcStatType procStat);
    
    /**
     * Appends and returns a new empty "ProcStat" element
     */
    edu.umich.icpsr.ddi.ProcStatType addNewProcStat();
    
    /**
     * Unsets the "ProcStat" element
     */
    void unsetProcStat();
    
    /**
     * Gets the "dataMsng" element
     */
    edu.umich.icpsr.ddi.DataMsngType getDataMsng();
    
    /**
     * True if has "dataMsng" element
     */
    boolean isSetDataMsng();
    
    /**
     * Sets the "dataMsng" element
     */
    void setDataMsng(edu.umich.icpsr.ddi.DataMsngType dataMsng);
    
    /**
     * Appends and returns a new empty "dataMsng" element
     */
    edu.umich.icpsr.ddi.DataMsngType addNewDataMsng();
    
    /**
     * Unsets the "dataMsng" element
     */
    void unsetDataMsng();
    
    /**
     * Gets array of all "software" elements
     */
    edu.umich.icpsr.ddi.SoftwareType[] getSoftwareArray();
    
    /**
     * Gets ith "software" element
     */
    edu.umich.icpsr.ddi.SoftwareType getSoftwareArray(int i);
    
    /**
     * Returns number of "software" element
     */
    int sizeOfSoftwareArray();
    
    /**
     * Sets array of all "software" element
     */
    void setSoftwareArray(edu.umich.icpsr.ddi.SoftwareType[] softwareArray);
    
    /**
     * Sets ith "software" element
     */
    void setSoftwareArray(int i, edu.umich.icpsr.ddi.SoftwareType software);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "software" element
     */
    edu.umich.icpsr.ddi.SoftwareType insertNewSoftware(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "software" element
     */
    edu.umich.icpsr.ddi.SoftwareType addNewSoftware();
    
    /**
     * Removes the ith "software" element
     */
    void removeSoftware(int i);
    
    /**
     * Gets the "verStmt" element
     */
    edu.umich.icpsr.ddi.VerStmtType getVerStmt();
    
    /**
     * True if has "verStmt" element
     */
    boolean isSetVerStmt();
    
    /**
     * Sets the "verStmt" element
     */
    void setVerStmt(edu.umich.icpsr.ddi.VerStmtType verStmt);
    
    /**
     * Appends and returns a new empty "verStmt" element
     */
    edu.umich.icpsr.ddi.VerStmtType addNewVerStmt();
    
    /**
     * Unsets the "verStmt" element
     */
    void unsetVerStmt();
    
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
    edu.umich.icpsr.ddi.FileTxtType.Source.Enum getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    edu.umich.icpsr.ddi.FileTxtType.Source xgetSource();
    
    /**
     * True if has "source" attribute
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(edu.umich.icpsr.ddi.FileTxtType.Source.Enum source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(edu.umich.icpsr.ddi.FileTxtType.Source source);
    
    /**
     * Unsets the "source" attribute
     */
    void unsetSource();
    
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.FileTxtType$Source.
     */
    public interface Source extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("source1eb6attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ARCHIVE = Enum.forString("archive");
        static final Enum PRODUCER = Enum.forString("producer");
        
        static final int INT_ARCHIVE = Enum.INT_ARCHIVE;
        static final int INT_PRODUCER = Enum.INT_PRODUCER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.FileTxtType$Source.
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
            public static edu.umich.icpsr.ddi.FileTxtType.Source newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.FileTxtType.Source) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.FileTxtType.Source newInstance() {
              return (edu.umich.icpsr.ddi.FileTxtType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.FileTxtType.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.FileTxtType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.FileTxtType newInstance() {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.FileTxtType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.FileTxtType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.FileTxtType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.FileTxtType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.FileTxtType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.FileTxtType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.FileTxtType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.FileTxtType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.FileTxtType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.FileTxtType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.FileTxtType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.FileTxtType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.FileTxtType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.FileTxtType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.FileTxtType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.FileTxtType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.FileTxtType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.FileTxtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
