/*
 * XML Type:  recGrpType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.RecGrpType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML recGrpType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface RecGrpType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecGrpType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("recgrptype981etype");
    
    /**
     * Gets array of all "labl" elements
     */
    edu.umich.icpsr.ddi.LablType[] getLablArray();
    
    /**
     * Gets ith "labl" element
     */
    edu.umich.icpsr.ddi.LablType getLablArray(int i);
    
    /**
     * Returns number of "labl" element
     */
    int sizeOfLablArray();
    
    /**
     * Sets array of all "labl" element
     */
    void setLablArray(edu.umich.icpsr.ddi.LablType[] lablArray);
    
    /**
     * Sets ith "labl" element
     */
    void setLablArray(int i, edu.umich.icpsr.ddi.LablType labl);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "labl" element
     */
    edu.umich.icpsr.ddi.LablType insertNewLabl(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "labl" element
     */
    edu.umich.icpsr.ddi.LablType addNewLabl();
    
    /**
     * Removes the ith "labl" element
     */
    void removeLabl(int i);
    
    /**
     * Gets the "recDimnsn" element
     */
    edu.umich.icpsr.ddi.RecDimnsnType getRecDimnsn();
    
    /**
     * True if has "recDimnsn" element
     */
    boolean isSetRecDimnsn();
    
    /**
     * Sets the "recDimnsn" element
     */
    void setRecDimnsn(edu.umich.icpsr.ddi.RecDimnsnType recDimnsn);
    
    /**
     * Appends and returns a new empty "recDimnsn" element
     */
    edu.umich.icpsr.ddi.RecDimnsnType addNewRecDimnsn();
    
    /**
     * Unsets the "recDimnsn" element
     */
    void unsetRecDimnsn();
    
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
    edu.umich.icpsr.ddi.RecGrpType.Source.Enum getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    edu.umich.icpsr.ddi.RecGrpType.Source xgetSource();
    
    /**
     * True if has "source" attribute
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(edu.umich.icpsr.ddi.RecGrpType.Source.Enum source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(edu.umich.icpsr.ddi.RecGrpType.Source source);
    
    /**
     * Unsets the "source" attribute
     */
    void unsetSource();
    
    /**
     * Gets the "recGrp" attribute
     */
    java.util.List getRecGrp();
    
    /**
     * Gets (as xml) the "recGrp" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetRecGrp();
    
    /**
     * True if has "recGrp" attribute
     */
    boolean isSetRecGrp();
    
    /**
     * Sets the "recGrp" attribute
     */
    void setRecGrp(java.util.List recGrp);
    
    /**
     * Sets (as xml) the "recGrp" attribute
     */
    void xsetRecGrp(org.apache.xmlbeans.XmlIDREFS recGrp);
    
    /**
     * Unsets the "recGrp" attribute
     */
    void unsetRecGrp();
    
    /**
     * Gets the "rectype" attribute
     */
    java.lang.String getRectype();
    
    /**
     * Gets (as xml) the "rectype" attribute
     */
    org.apache.xmlbeans.XmlString xgetRectype();
    
    /**
     * True if has "rectype" attribute
     */
    boolean isSetRectype();
    
    /**
     * Sets the "rectype" attribute
     */
    void setRectype(java.lang.String rectype);
    
    /**
     * Sets (as xml) the "rectype" attribute
     */
    void xsetRectype(org.apache.xmlbeans.XmlString rectype);
    
    /**
     * Unsets the "rectype" attribute
     */
    void unsetRectype();
    
    /**
     * Gets the "keyvar" attribute
     */
    java.util.List getKeyvar();
    
    /**
     * Gets (as xml) the "keyvar" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetKeyvar();
    
    /**
     * True if has "keyvar" attribute
     */
    boolean isSetKeyvar();
    
    /**
     * Sets the "keyvar" attribute
     */
    void setKeyvar(java.util.List keyvar);
    
    /**
     * Sets (as xml) the "keyvar" attribute
     */
    void xsetKeyvar(org.apache.xmlbeans.XmlIDREFS keyvar);
    
    /**
     * Unsets the "keyvar" attribute
     */
    void unsetKeyvar();
    
    /**
     * Gets the "rtypeloc" attribute
     */
    java.lang.String getRtypeloc();
    
    /**
     * Gets (as xml) the "rtypeloc" attribute
     */
    org.apache.xmlbeans.XmlString xgetRtypeloc();
    
    /**
     * True if has "rtypeloc" attribute
     */
    boolean isSetRtypeloc();
    
    /**
     * Sets the "rtypeloc" attribute
     */
    void setRtypeloc(java.lang.String rtypeloc);
    
    /**
     * Sets (as xml) the "rtypeloc" attribute
     */
    void xsetRtypeloc(org.apache.xmlbeans.XmlString rtypeloc);
    
    /**
     * Unsets the "rtypeloc" attribute
     */
    void unsetRtypeloc();
    
    /**
     * Gets the "rtypewidth" attribute
     */
    java.lang.String getRtypewidth();
    
    /**
     * Gets (as xml) the "rtypewidth" attribute
     */
    org.apache.xmlbeans.XmlString xgetRtypewidth();
    
    /**
     * True if has "rtypewidth" attribute
     */
    boolean isSetRtypewidth();
    
    /**
     * Sets the "rtypewidth" attribute
     */
    void setRtypewidth(java.lang.String rtypewidth);
    
    /**
     * Sets (as xml) the "rtypewidth" attribute
     */
    void xsetRtypewidth(org.apache.xmlbeans.XmlString rtypewidth);
    
    /**
     * Unsets the "rtypewidth" attribute
     */
    void unsetRtypewidth();
    
    /**
     * Gets the "rtypevtype" attribute
     */
    edu.umich.icpsr.ddi.RecGrpType.Rtypevtype.Enum getRtypevtype();
    
    /**
     * Gets (as xml) the "rtypevtype" attribute
     */
    edu.umich.icpsr.ddi.RecGrpType.Rtypevtype xgetRtypevtype();
    
    /**
     * True if has "rtypevtype" attribute
     */
    boolean isSetRtypevtype();
    
    /**
     * Sets the "rtypevtype" attribute
     */
    void setRtypevtype(edu.umich.icpsr.ddi.RecGrpType.Rtypevtype.Enum rtypevtype);
    
    /**
     * Sets (as xml) the "rtypevtype" attribute
     */
    void xsetRtypevtype(edu.umich.icpsr.ddi.RecGrpType.Rtypevtype rtypevtype);
    
    /**
     * Unsets the "rtypevtype" attribute
     */
    void unsetRtypevtype();
    
    /**
     * Gets the "recidvar" attribute
     */
    java.lang.String getRecidvar();
    
    /**
     * Gets (as xml) the "recidvar" attribute
     */
    org.apache.xmlbeans.XmlString xgetRecidvar();
    
    /**
     * True if has "recidvar" attribute
     */
    boolean isSetRecidvar();
    
    /**
     * Sets the "recidvar" attribute
     */
    void setRecidvar(java.lang.String recidvar);
    
    /**
     * Sets (as xml) the "recidvar" attribute
     */
    void xsetRecidvar(org.apache.xmlbeans.XmlString recidvar);
    
    /**
     * Unsets the "recidvar" attribute
     */
    void unsetRecidvar();
    
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.RecGrpType$Source.
     */
    public interface Source extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("sourced6d9attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ARCHIVE = Enum.forString("archive");
        static final Enum PRODUCER = Enum.forString("producer");
        
        static final int INT_ARCHIVE = Enum.INT_ARCHIVE;
        static final int INT_PRODUCER = Enum.INT_PRODUCER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.RecGrpType$Source.
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
            public static edu.umich.icpsr.ddi.RecGrpType.Source newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.RecGrpType.Source) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.RecGrpType.Source newInstance() {
              return (edu.umich.icpsr.ddi.RecGrpType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.RecGrpType.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.RecGrpType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML rtypevtype(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.RecGrpType$Rtypevtype.
     */
    public interface Rtypevtype extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Rtypevtype.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("rtypevtype70c2attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum NUMERIC = Enum.forString("numeric");
        static final Enum CHARACTER = Enum.forString("character");
        
        static final int INT_NUMERIC = Enum.INT_NUMERIC;
        static final int INT_CHARACTER = Enum.INT_CHARACTER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.RecGrpType$Rtypevtype.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_NUMERIC
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
            
            static final int INT_NUMERIC = 1;
            static final int INT_CHARACTER = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("numeric", INT_NUMERIC),
                    new Enum("character", INT_CHARACTER),
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
            public static edu.umich.icpsr.ddi.RecGrpType.Rtypevtype newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.RecGrpType.Rtypevtype) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.RecGrpType.Rtypevtype newInstance() {
              return (edu.umich.icpsr.ddi.RecGrpType.Rtypevtype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.RecGrpType.Rtypevtype newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.RecGrpType.Rtypevtype) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.RecGrpType newInstance() {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.RecGrpType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.RecGrpType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.RecGrpType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.RecGrpType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.RecGrpType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.RecGrpType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.RecGrpType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.RecGrpType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.RecGrpType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.RecGrpType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.RecGrpType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.RecGrpType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.RecGrpType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.RecGrpType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.RecGrpType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.RecGrpType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.RecGrpType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.RecGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
