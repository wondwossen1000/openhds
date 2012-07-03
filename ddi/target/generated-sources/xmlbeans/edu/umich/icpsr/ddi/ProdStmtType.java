/*
 * XML Type:  prodStmtType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.ProdStmtType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML prodStmtType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface ProdStmtType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProdStmtType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("prodstmttype0494type");
    
    /**
     * Gets array of all "producer" elements
     */
    edu.umich.icpsr.ddi.ProducerType[] getProducerArray();
    
    /**
     * Gets ith "producer" element
     */
    edu.umich.icpsr.ddi.ProducerType getProducerArray(int i);
    
    /**
     * Returns number of "producer" element
     */
    int sizeOfProducerArray();
    
    /**
     * Sets array of all "producer" element
     */
    void setProducerArray(edu.umich.icpsr.ddi.ProducerType[] producerArray);
    
    /**
     * Sets ith "producer" element
     */
    void setProducerArray(int i, edu.umich.icpsr.ddi.ProducerType producer);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "producer" element
     */
    edu.umich.icpsr.ddi.ProducerType insertNewProducer(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "producer" element
     */
    edu.umich.icpsr.ddi.ProducerType addNewProducer();
    
    /**
     * Removes the ith "producer" element
     */
    void removeProducer(int i);
    
    /**
     * Gets the "copyright" element
     */
    edu.umich.icpsr.ddi.CopyrightType getCopyright();
    
    /**
     * True if has "copyright" element
     */
    boolean isSetCopyright();
    
    /**
     * Sets the "copyright" element
     */
    void setCopyright(edu.umich.icpsr.ddi.CopyrightType copyright);
    
    /**
     * Appends and returns a new empty "copyright" element
     */
    edu.umich.icpsr.ddi.CopyrightType addNewCopyright();
    
    /**
     * Unsets the "copyright" element
     */
    void unsetCopyright();
    
    /**
     * Gets array of all "prodDate" elements
     */
    edu.umich.icpsr.ddi.ProdDateType[] getProdDateArray();
    
    /**
     * Gets ith "prodDate" element
     */
    edu.umich.icpsr.ddi.ProdDateType getProdDateArray(int i);
    
    /**
     * Returns number of "prodDate" element
     */
    int sizeOfProdDateArray();
    
    /**
     * Sets array of all "prodDate" element
     */
    void setProdDateArray(edu.umich.icpsr.ddi.ProdDateType[] prodDateArray);
    
    /**
     * Sets ith "prodDate" element
     */
    void setProdDateArray(int i, edu.umich.icpsr.ddi.ProdDateType prodDate);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prodDate" element
     */
    edu.umich.icpsr.ddi.ProdDateType insertNewProdDate(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prodDate" element
     */
    edu.umich.icpsr.ddi.ProdDateType addNewProdDate();
    
    /**
     * Removes the ith "prodDate" element
     */
    void removeProdDate(int i);
    
    /**
     * Gets array of all "prodPlac" elements
     */
    edu.umich.icpsr.ddi.ProdPlacType[] getProdPlacArray();
    
    /**
     * Gets ith "prodPlac" element
     */
    edu.umich.icpsr.ddi.ProdPlacType getProdPlacArray(int i);
    
    /**
     * Returns number of "prodPlac" element
     */
    int sizeOfProdPlacArray();
    
    /**
     * Sets array of all "prodPlac" element
     */
    void setProdPlacArray(edu.umich.icpsr.ddi.ProdPlacType[] prodPlacArray);
    
    /**
     * Sets ith "prodPlac" element
     */
    void setProdPlacArray(int i, edu.umich.icpsr.ddi.ProdPlacType prodPlac);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prodPlac" element
     */
    edu.umich.icpsr.ddi.ProdPlacType insertNewProdPlac(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prodPlac" element
     */
    edu.umich.icpsr.ddi.ProdPlacType addNewProdPlac();
    
    /**
     * Removes the ith "prodPlac" element
     */
    void removeProdPlac(int i);
    
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
     * Gets array of all "fundAg" elements
     */
    edu.umich.icpsr.ddi.FundAgType[] getFundAgArray();
    
    /**
     * Gets ith "fundAg" element
     */
    edu.umich.icpsr.ddi.FundAgType getFundAgArray(int i);
    
    /**
     * Returns number of "fundAg" element
     */
    int sizeOfFundAgArray();
    
    /**
     * Sets array of all "fundAg" element
     */
    void setFundAgArray(edu.umich.icpsr.ddi.FundAgType[] fundAgArray);
    
    /**
     * Sets ith "fundAg" element
     */
    void setFundAgArray(int i, edu.umich.icpsr.ddi.FundAgType fundAg);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fundAg" element
     */
    edu.umich.icpsr.ddi.FundAgType insertNewFundAg(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fundAg" element
     */
    edu.umich.icpsr.ddi.FundAgType addNewFundAg();
    
    /**
     * Removes the ith "fundAg" element
     */
    void removeFundAg(int i);
    
    /**
     * Gets array of all "grantNo" elements
     */
    edu.umich.icpsr.ddi.GrantNoType[] getGrantNoArray();
    
    /**
     * Gets ith "grantNo" element
     */
    edu.umich.icpsr.ddi.GrantNoType getGrantNoArray(int i);
    
    /**
     * Returns number of "grantNo" element
     */
    int sizeOfGrantNoArray();
    
    /**
     * Sets array of all "grantNo" element
     */
    void setGrantNoArray(edu.umich.icpsr.ddi.GrantNoType[] grantNoArray);
    
    /**
     * Sets ith "grantNo" element
     */
    void setGrantNoArray(int i, edu.umich.icpsr.ddi.GrantNoType grantNo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "grantNo" element
     */
    edu.umich.icpsr.ddi.GrantNoType insertNewGrantNo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "grantNo" element
     */
    edu.umich.icpsr.ddi.GrantNoType addNewGrantNo();
    
    /**
     * Removes the ith "grantNo" element
     */
    void removeGrantNo(int i);
    
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
    edu.umich.icpsr.ddi.ProdStmtType.Source.Enum getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    edu.umich.icpsr.ddi.ProdStmtType.Source xgetSource();
    
    /**
     * True if has "source" attribute
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(edu.umich.icpsr.ddi.ProdStmtType.Source.Enum source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(edu.umich.icpsr.ddi.ProdStmtType.Source source);
    
    /**
     * Unsets the "source" attribute
     */
    void unsetSource();
    
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.ProdStmtType$Source.
     */
    public interface Source extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("source808fattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ARCHIVE = Enum.forString("archive");
        static final Enum PRODUCER = Enum.forString("producer");
        
        static final int INT_ARCHIVE = Enum.INT_ARCHIVE;
        static final int INT_PRODUCER = Enum.INT_PRODUCER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.ProdStmtType$Source.
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
            public static edu.umich.icpsr.ddi.ProdStmtType.Source newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.ProdStmtType.Source) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.ProdStmtType.Source newInstance() {
              return (edu.umich.icpsr.ddi.ProdStmtType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.ProdStmtType.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.ProdStmtType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.ProdStmtType newInstance() {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.ProdStmtType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.ProdStmtType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.ProdStmtType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.ProdStmtType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.ProdStmtType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.ProdStmtType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.ProdStmtType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.ProdStmtType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.ProdStmtType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.ProdStmtType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.ProdStmtType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.ProdStmtType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.ProdStmtType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.ProdStmtType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.ProdStmtType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.ProdStmtType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.ProdStmtType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.ProdStmtType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
