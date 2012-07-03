/*
 * XML Type:  citationType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.CitationType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML citationType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface CitationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CitationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("citationtype046ctype");
    
    /**
     * Gets the "titlStmt" element
     */
    edu.umich.icpsr.ddi.TitlStmtType getTitlStmt();
    
    /**
     * Sets the "titlStmt" element
     */
    void setTitlStmt(edu.umich.icpsr.ddi.TitlStmtType titlStmt);
    
    /**
     * Appends and returns a new empty "titlStmt" element
     */
    edu.umich.icpsr.ddi.TitlStmtType addNewTitlStmt();
    
    /**
     * Gets the "rspStmt" element
     */
    edu.umich.icpsr.ddi.RspStmtType getRspStmt();
    
    /**
     * True if has "rspStmt" element
     */
    boolean isSetRspStmt();
    
    /**
     * Sets the "rspStmt" element
     */
    void setRspStmt(edu.umich.icpsr.ddi.RspStmtType rspStmt);
    
    /**
     * Appends and returns a new empty "rspStmt" element
     */
    edu.umich.icpsr.ddi.RspStmtType addNewRspStmt();
    
    /**
     * Unsets the "rspStmt" element
     */
    void unsetRspStmt();
    
    /**
     * Gets the "prodStmt" element
     */
    edu.umich.icpsr.ddi.ProdStmtType getProdStmt();
    
    /**
     * True if has "prodStmt" element
     */
    boolean isSetProdStmt();
    
    /**
     * Sets the "prodStmt" element
     */
    void setProdStmt(edu.umich.icpsr.ddi.ProdStmtType prodStmt);
    
    /**
     * Appends and returns a new empty "prodStmt" element
     */
    edu.umich.icpsr.ddi.ProdStmtType addNewProdStmt();
    
    /**
     * Unsets the "prodStmt" element
     */
    void unsetProdStmt();
    
    /**
     * Gets the "distStmt" element
     */
    edu.umich.icpsr.ddi.DistStmtType getDistStmt();
    
    /**
     * True if has "distStmt" element
     */
    boolean isSetDistStmt();
    
    /**
     * Sets the "distStmt" element
     */
    void setDistStmt(edu.umich.icpsr.ddi.DistStmtType distStmt);
    
    /**
     * Appends and returns a new empty "distStmt" element
     */
    edu.umich.icpsr.ddi.DistStmtType addNewDistStmt();
    
    /**
     * Unsets the "distStmt" element
     */
    void unsetDistStmt();
    
    /**
     * Gets the "serStmt" element
     */
    edu.umich.icpsr.ddi.SerStmtType getSerStmt();
    
    /**
     * True if has "serStmt" element
     */
    boolean isSetSerStmt();
    
    /**
     * Sets the "serStmt" element
     */
    void setSerStmt(edu.umich.icpsr.ddi.SerStmtType serStmt);
    
    /**
     * Appends and returns a new empty "serStmt" element
     */
    edu.umich.icpsr.ddi.SerStmtType addNewSerStmt();
    
    /**
     * Unsets the "serStmt" element
     */
    void unsetSerStmt();
    
    /**
     * Gets array of all "verStmt" elements
     */
    edu.umich.icpsr.ddi.VerStmtType[] getVerStmtArray();
    
    /**
     * Gets ith "verStmt" element
     */
    edu.umich.icpsr.ddi.VerStmtType getVerStmtArray(int i);
    
    /**
     * Returns number of "verStmt" element
     */
    int sizeOfVerStmtArray();
    
    /**
     * Sets array of all "verStmt" element
     */
    void setVerStmtArray(edu.umich.icpsr.ddi.VerStmtType[] verStmtArray);
    
    /**
     * Sets ith "verStmt" element
     */
    void setVerStmtArray(int i, edu.umich.icpsr.ddi.VerStmtType verStmt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "verStmt" element
     */
    edu.umich.icpsr.ddi.VerStmtType insertNewVerStmt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "verStmt" element
     */
    edu.umich.icpsr.ddi.VerStmtType addNewVerStmt();
    
    /**
     * Removes the ith "verStmt" element
     */
    void removeVerStmt(int i);
    
    /**
     * Gets the "biblCit" element
     */
    edu.umich.icpsr.ddi.BiblCitType getBiblCit();
    
    /**
     * True if has "biblCit" element
     */
    boolean isSetBiblCit();
    
    /**
     * Sets the "biblCit" element
     */
    void setBiblCit(edu.umich.icpsr.ddi.BiblCitType biblCit);
    
    /**
     * Appends and returns a new empty "biblCit" element
     */
    edu.umich.icpsr.ddi.BiblCitType addNewBiblCit();
    
    /**
     * Unsets the "biblCit" element
     */
    void unsetBiblCit();
    
    /**
     * Gets array of all "holdings" elements
     */
    edu.umich.icpsr.ddi.HoldingsType[] getHoldingsArray();
    
    /**
     * Gets ith "holdings" element
     */
    edu.umich.icpsr.ddi.HoldingsType getHoldingsArray(int i);
    
    /**
     * Returns number of "holdings" element
     */
    int sizeOfHoldingsArray();
    
    /**
     * Sets array of all "holdings" element
     */
    void setHoldingsArray(edu.umich.icpsr.ddi.HoldingsType[] holdingsArray);
    
    /**
     * Sets ith "holdings" element
     */
    void setHoldingsArray(int i, edu.umich.icpsr.ddi.HoldingsType holdings);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "holdings" element
     */
    edu.umich.icpsr.ddi.HoldingsType insertNewHoldings(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "holdings" element
     */
    edu.umich.icpsr.ddi.HoldingsType addNewHoldings();
    
    /**
     * Removes the ith "holdings" element
     */
    void removeHoldings(int i);
    
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
    edu.umich.icpsr.ddi.CitationType.Source.Enum getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    edu.umich.icpsr.ddi.CitationType.Source xgetSource();
    
    /**
     * True if has "source" attribute
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(edu.umich.icpsr.ddi.CitationType.Source.Enum source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(edu.umich.icpsr.ddi.CitationType.Source source);
    
    /**
     * Unsets the "source" attribute
     */
    void unsetSource();
    
    /**
     * Gets the "MARCURI" attribute
     */
    java.lang.String getMARCURI();
    
    /**
     * Gets (as xml) the "MARCURI" attribute
     */
    org.apache.xmlbeans.XmlString xgetMARCURI();
    
    /**
     * True if has "MARCURI" attribute
     */
    boolean isSetMARCURI();
    
    /**
     * Sets the "MARCURI" attribute
     */
    void setMARCURI(java.lang.String marcuri);
    
    /**
     * Sets (as xml) the "MARCURI" attribute
     */
    void xsetMARCURI(org.apache.xmlbeans.XmlString marcuri);
    
    /**
     * Unsets the "MARCURI" attribute
     */
    void unsetMARCURI();
    
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CitationType$Source.
     */
    public interface Source extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("source8067attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ARCHIVE = Enum.forString("archive");
        static final Enum PRODUCER = Enum.forString("producer");
        
        static final int INT_ARCHIVE = Enum.INT_ARCHIVE;
        static final int INT_PRODUCER = Enum.INT_PRODUCER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.CitationType$Source.
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
            public static edu.umich.icpsr.ddi.CitationType.Source newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.CitationType.Source) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.CitationType.Source newInstance() {
              return (edu.umich.icpsr.ddi.CitationType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.CitationType.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.CitationType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.CitationType newInstance() {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.CitationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.CitationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.CitationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.CitationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.CitationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.CitationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.CitationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.CitationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.CitationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.CitationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.CitationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.CitationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.CitationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.CitationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.CitationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.CitationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.CitationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.CitationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
