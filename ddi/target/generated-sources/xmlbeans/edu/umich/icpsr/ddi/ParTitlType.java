/*
 * XML Type:  parTitlType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.ParTitlType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML parTitlType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface ParTitlType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParTitlType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("partitltype4337type");
    
    /**
     * Gets array of all "Link" elements
     */
    edu.umich.icpsr.ddi.LinkType[] getLinkArray();
    
    /**
     * Gets ith "Link" element
     */
    edu.umich.icpsr.ddi.LinkType getLinkArray(int i);
    
    /**
     * Returns number of "Link" element
     */
    int sizeOfLinkArray();
    
    /**
     * Sets array of all "Link" element
     */
    void setLinkArray(edu.umich.icpsr.ddi.LinkType[] linkArray);
    
    /**
     * Sets ith "Link" element
     */
    void setLinkArray(int i, edu.umich.icpsr.ddi.LinkType link);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Link" element
     */
    edu.umich.icpsr.ddi.LinkType insertNewLink(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Link" element
     */
    edu.umich.icpsr.ddi.LinkType addNewLink();
    
    /**
     * Removes the ith "Link" element
     */
    void removeLink(int i);
    
    /**
     * Gets array of all "ExtLink" elements
     */
    edu.umich.icpsr.ddi.ExtLinkType[] getExtLinkArray();
    
    /**
     * Gets ith "ExtLink" element
     */
    edu.umich.icpsr.ddi.ExtLinkType getExtLinkArray(int i);
    
    /**
     * Returns number of "ExtLink" element
     */
    int sizeOfExtLinkArray();
    
    /**
     * Sets array of all "ExtLink" element
     */
    void setExtLinkArray(edu.umich.icpsr.ddi.ExtLinkType[] extLinkArray);
    
    /**
     * Sets ith "ExtLink" element
     */
    void setExtLinkArray(int i, edu.umich.icpsr.ddi.ExtLinkType extLink);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ExtLink" element
     */
    edu.umich.icpsr.ddi.ExtLinkType insertNewExtLink(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ExtLink" element
     */
    edu.umich.icpsr.ddi.ExtLinkType addNewExtLink();
    
    /**
     * Removes the ith "ExtLink" element
     */
    void removeExtLink(int i);
    
    /**
     * Gets array of all "div" elements
     */
    edu.umich.icpsr.ddi.DivType[] getDivArray();
    
    /**
     * Gets ith "div" element
     */
    edu.umich.icpsr.ddi.DivType getDivArray(int i);
    
    /**
     * Returns number of "div" element
     */
    int sizeOfDivArray();
    
    /**
     * Sets array of all "div" element
     */
    void setDivArray(edu.umich.icpsr.ddi.DivType[] divArray);
    
    /**
     * Sets ith "div" element
     */
    void setDivArray(int i, edu.umich.icpsr.ddi.DivType div);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "div" element
     */
    edu.umich.icpsr.ddi.DivType insertNewDiv(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "div" element
     */
    edu.umich.icpsr.ddi.DivType addNewDiv();
    
    /**
     * Removes the ith "div" element
     */
    void removeDiv(int i);
    
    /**
     * Gets array of all "emph" elements
     */
    edu.umich.icpsr.ddi.EmphType[] getEmphArray();
    
    /**
     * Gets ith "emph" element
     */
    edu.umich.icpsr.ddi.EmphType getEmphArray(int i);
    
    /**
     * Returns number of "emph" element
     */
    int sizeOfEmphArray();
    
    /**
     * Sets array of all "emph" element
     */
    void setEmphArray(edu.umich.icpsr.ddi.EmphType[] emphArray);
    
    /**
     * Sets ith "emph" element
     */
    void setEmphArray(int i, edu.umich.icpsr.ddi.EmphType emph);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "emph" element
     */
    edu.umich.icpsr.ddi.EmphType insertNewEmph(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "emph" element
     */
    edu.umich.icpsr.ddi.EmphType addNewEmph();
    
    /**
     * Removes the ith "emph" element
     */
    void removeEmph(int i);
    
    /**
     * Gets array of all "head" elements
     */
    edu.umich.icpsr.ddi.HeadType[] getHeadArray();
    
    /**
     * Gets ith "head" element
     */
    edu.umich.icpsr.ddi.HeadType getHeadArray(int i);
    
    /**
     * Returns number of "head" element
     */
    int sizeOfHeadArray();
    
    /**
     * Sets array of all "head" element
     */
    void setHeadArray(edu.umich.icpsr.ddi.HeadType[] headArray);
    
    /**
     * Sets ith "head" element
     */
    void setHeadArray(int i, edu.umich.icpsr.ddi.HeadType head);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "head" element
     */
    edu.umich.icpsr.ddi.HeadType insertNewHead(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "head" element
     */
    edu.umich.icpsr.ddi.HeadType addNewHead();
    
    /**
     * Removes the ith "head" element
     */
    void removeHead(int i);
    
    /**
     * Gets array of all "hi" elements
     */
    edu.umich.icpsr.ddi.HiType[] getHiArray();
    
    /**
     * Gets ith "hi" element
     */
    edu.umich.icpsr.ddi.HiType getHiArray(int i);
    
    /**
     * Returns number of "hi" element
     */
    int sizeOfHiArray();
    
    /**
     * Sets array of all "hi" element
     */
    void setHiArray(edu.umich.icpsr.ddi.HiType[] hiArray);
    
    /**
     * Sets ith "hi" element
     */
    void setHiArray(int i, edu.umich.icpsr.ddi.HiType hi);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "hi" element
     */
    edu.umich.icpsr.ddi.HiType insertNewHi(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "hi" element
     */
    edu.umich.icpsr.ddi.HiType addNewHi();
    
    /**
     * Removes the ith "hi" element
     */
    void removeHi(int i);
    
    /**
     * Gets array of all "list" elements
     */
    edu.umich.icpsr.ddi.ListType[] getListArray();
    
    /**
     * Gets ith "list" element
     */
    edu.umich.icpsr.ddi.ListType getListArray(int i);
    
    /**
     * Returns number of "list" element
     */
    int sizeOfListArray();
    
    /**
     * Sets array of all "list" element
     */
    void setListArray(edu.umich.icpsr.ddi.ListType[] listArray);
    
    /**
     * Sets ith "list" element
     */
    void setListArray(int i, edu.umich.icpsr.ddi.ListType list);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "list" element
     */
    edu.umich.icpsr.ddi.ListType insertNewList(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "list" element
     */
    edu.umich.icpsr.ddi.ListType addNewList();
    
    /**
     * Removes the ith "list" element
     */
    void removeList(int i);
    
    /**
     * Gets array of all "p" elements
     */
    edu.umich.icpsr.ddi.PType[] getPArray();
    
    /**
     * Gets ith "p" element
     */
    edu.umich.icpsr.ddi.PType getPArray(int i);
    
    /**
     * Returns number of "p" element
     */
    int sizeOfPArray();
    
    /**
     * Sets array of all "p" element
     */
    void setPArray(edu.umich.icpsr.ddi.PType[] pArray);
    
    /**
     * Sets ith "p" element
     */
    void setPArray(int i, edu.umich.icpsr.ddi.PType p);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "p" element
     */
    edu.umich.icpsr.ddi.PType insertNewP(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "p" element
     */
    edu.umich.icpsr.ddi.PType addNewP();
    
    /**
     * Removes the ith "p" element
     */
    void removeP(int i);
    
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
    edu.umich.icpsr.ddi.ParTitlType.Source.Enum getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    edu.umich.icpsr.ddi.ParTitlType.Source xgetSource();
    
    /**
     * True if has "source" attribute
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(edu.umich.icpsr.ddi.ParTitlType.Source.Enum source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(edu.umich.icpsr.ddi.ParTitlType.Source source);
    
    /**
     * Unsets the "source" attribute
     */
    void unsetSource();
    
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.ParTitlType$Source.
     */
    public interface Source extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("sourcedbdcattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ARCHIVE = Enum.forString("archive");
        static final Enum PRODUCER = Enum.forString("producer");
        
        static final int INT_ARCHIVE = Enum.INT_ARCHIVE;
        static final int INT_PRODUCER = Enum.INT_PRODUCER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.ParTitlType$Source.
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
            public static edu.umich.icpsr.ddi.ParTitlType.Source newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.ParTitlType.Source) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.ParTitlType.Source newInstance() {
              return (edu.umich.icpsr.ddi.ParTitlType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.ParTitlType.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.ParTitlType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.ParTitlType newInstance() {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.ParTitlType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.ParTitlType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.ParTitlType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.ParTitlType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.ParTitlType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.ParTitlType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.ParTitlType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.ParTitlType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.ParTitlType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.ParTitlType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.ParTitlType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.ParTitlType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.ParTitlType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.ParTitlType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.ParTitlType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.ParTitlType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.ParTitlType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.ParTitlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
