/*
 * XML Type:  distStmtType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.DistStmtType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML distStmtType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface DistStmtType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DistStmtType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("diststmttypeaf65type");
    
    /**
     * Gets array of all "distrbtr" elements
     */
    edu.umich.icpsr.ddi.DistrbtrType[] getDistrbtrArray();
    
    /**
     * Gets ith "distrbtr" element
     */
    edu.umich.icpsr.ddi.DistrbtrType getDistrbtrArray(int i);
    
    /**
     * Returns number of "distrbtr" element
     */
    int sizeOfDistrbtrArray();
    
    /**
     * Sets array of all "distrbtr" element
     */
    void setDistrbtrArray(edu.umich.icpsr.ddi.DistrbtrType[] distrbtrArray);
    
    /**
     * Sets ith "distrbtr" element
     */
    void setDistrbtrArray(int i, edu.umich.icpsr.ddi.DistrbtrType distrbtr);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "distrbtr" element
     */
    edu.umich.icpsr.ddi.DistrbtrType insertNewDistrbtr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "distrbtr" element
     */
    edu.umich.icpsr.ddi.DistrbtrType addNewDistrbtr();
    
    /**
     * Removes the ith "distrbtr" element
     */
    void removeDistrbtr(int i);
    
    /**
     * Gets array of all "contact" elements
     */
    edu.umich.icpsr.ddi.ContactType[] getContactArray();
    
    /**
     * Gets ith "contact" element
     */
    edu.umich.icpsr.ddi.ContactType getContactArray(int i);
    
    /**
     * Returns number of "contact" element
     */
    int sizeOfContactArray();
    
    /**
     * Sets array of all "contact" element
     */
    void setContactArray(edu.umich.icpsr.ddi.ContactType[] contactArray);
    
    /**
     * Sets ith "contact" element
     */
    void setContactArray(int i, edu.umich.icpsr.ddi.ContactType contact);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contact" element
     */
    edu.umich.icpsr.ddi.ContactType insertNewContact(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contact" element
     */
    edu.umich.icpsr.ddi.ContactType addNewContact();
    
    /**
     * Removes the ith "contact" element
     */
    void removeContact(int i);
    
    /**
     * Gets array of all "depositr" elements
     */
    edu.umich.icpsr.ddi.DepositrType[] getDepositrArray();
    
    /**
     * Gets ith "depositr" element
     */
    edu.umich.icpsr.ddi.DepositrType getDepositrArray(int i);
    
    /**
     * Returns number of "depositr" element
     */
    int sizeOfDepositrArray();
    
    /**
     * Sets array of all "depositr" element
     */
    void setDepositrArray(edu.umich.icpsr.ddi.DepositrType[] depositrArray);
    
    /**
     * Sets ith "depositr" element
     */
    void setDepositrArray(int i, edu.umich.icpsr.ddi.DepositrType depositr);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "depositr" element
     */
    edu.umich.icpsr.ddi.DepositrType insertNewDepositr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "depositr" element
     */
    edu.umich.icpsr.ddi.DepositrType addNewDepositr();
    
    /**
     * Removes the ith "depositr" element
     */
    void removeDepositr(int i);
    
    /**
     * Gets array of all "depDate" elements
     */
    edu.umich.icpsr.ddi.DepDateType[] getDepDateArray();
    
    /**
     * Gets ith "depDate" element
     */
    edu.umich.icpsr.ddi.DepDateType getDepDateArray(int i);
    
    /**
     * Returns number of "depDate" element
     */
    int sizeOfDepDateArray();
    
    /**
     * Sets array of all "depDate" element
     */
    void setDepDateArray(edu.umich.icpsr.ddi.DepDateType[] depDateArray);
    
    /**
     * Sets ith "depDate" element
     */
    void setDepDateArray(int i, edu.umich.icpsr.ddi.DepDateType depDate);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "depDate" element
     */
    edu.umich.icpsr.ddi.DepDateType insertNewDepDate(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "depDate" element
     */
    edu.umich.icpsr.ddi.DepDateType addNewDepDate();
    
    /**
     * Removes the ith "depDate" element
     */
    void removeDepDate(int i);
    
    /**
     * Gets the "distDate" element
     */
    edu.umich.icpsr.ddi.DistDateType getDistDate();
    
    /**
     * True if has "distDate" element
     */
    boolean isSetDistDate();
    
    /**
     * Sets the "distDate" element
     */
    void setDistDate(edu.umich.icpsr.ddi.DistDateType distDate);
    
    /**
     * Appends and returns a new empty "distDate" element
     */
    edu.umich.icpsr.ddi.DistDateType addNewDistDate();
    
    /**
     * Unsets the "distDate" element
     */
    void unsetDistDate();
    
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
    edu.umich.icpsr.ddi.DistStmtType.Source.Enum getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    edu.umich.icpsr.ddi.DistStmtType.Source xgetSource();
    
    /**
     * True if has "source" attribute
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(edu.umich.icpsr.ddi.DistStmtType.Source.Enum source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(edu.umich.icpsr.ddi.DistStmtType.Source source);
    
    /**
     * Unsets the "source" attribute
     */
    void unsetSource();
    
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.DistStmtType$Source.
     */
    public interface Source extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("source2b60attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ARCHIVE = Enum.forString("archive");
        static final Enum PRODUCER = Enum.forString("producer");
        
        static final int INT_ARCHIVE = Enum.INT_ARCHIVE;
        static final int INT_PRODUCER = Enum.INT_PRODUCER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.DistStmtType$Source.
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
            public static edu.umich.icpsr.ddi.DistStmtType.Source newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.DistStmtType.Source) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.DistStmtType.Source newInstance() {
              return (edu.umich.icpsr.ddi.DistStmtType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.DistStmtType.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.DistStmtType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.DistStmtType newInstance() {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.DistStmtType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.DistStmtType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.DistStmtType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.DistStmtType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.DistStmtType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.DistStmtType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.DistStmtType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.DistStmtType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.DistStmtType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.DistStmtType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.DistStmtType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.DistStmtType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.DistStmtType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.DistStmtType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.DistStmtType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.DistStmtType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.DistStmtType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.DistStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
