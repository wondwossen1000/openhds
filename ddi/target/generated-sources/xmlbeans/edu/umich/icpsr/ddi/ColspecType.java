/*
 * XML Type:  colspecType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.ColspecType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML colspecType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface ColspecType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ColspecType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("colspectype1ecatype");
    
    /**
     * Gets the "colnum" attribute
     */
    java.lang.String getColnum();
    
    /**
     * Gets (as xml) the "colnum" attribute
     */
    org.apache.xmlbeans.XmlString xgetColnum();
    
    /**
     * True if has "colnum" attribute
     */
    boolean isSetColnum();
    
    /**
     * Sets the "colnum" attribute
     */
    void setColnum(java.lang.String colnum);
    
    /**
     * Sets (as xml) the "colnum" attribute
     */
    void xsetColnum(org.apache.xmlbeans.XmlString colnum);
    
    /**
     * Unsets the "colnum" attribute
     */
    void unsetColnum();
    
    /**
     * Gets the "colname" attribute
     */
    java.lang.String getColname();
    
    /**
     * Gets (as xml) the "colname" attribute
     */
    org.apache.xmlbeans.XmlNMTOKEN xgetColname();
    
    /**
     * True if has "colname" attribute
     */
    boolean isSetColname();
    
    /**
     * Sets the "colname" attribute
     */
    void setColname(java.lang.String colname);
    
    /**
     * Sets (as xml) the "colname" attribute
     */
    void xsetColname(org.apache.xmlbeans.XmlNMTOKEN colname);
    
    /**
     * Unsets the "colname" attribute
     */
    void unsetColname();
    
    /**
     * Gets the "colwidth" attribute
     */
    java.lang.String getColwidth();
    
    /**
     * Gets (as xml) the "colwidth" attribute
     */
    org.apache.xmlbeans.XmlString xgetColwidth();
    
    /**
     * True if has "colwidth" attribute
     */
    boolean isSetColwidth();
    
    /**
     * Sets the "colwidth" attribute
     */
    void setColwidth(java.lang.String colwidth);
    
    /**
     * Sets (as xml) the "colwidth" attribute
     */
    void xsetColwidth(org.apache.xmlbeans.XmlString colwidth);
    
    /**
     * Unsets the "colwidth" attribute
     */
    void unsetColwidth();
    
    /**
     * Gets the "colsep" attribute
     */
    java.lang.String getColsep();
    
    /**
     * Gets (as xml) the "colsep" attribute
     */
    org.apache.xmlbeans.XmlString xgetColsep();
    
    /**
     * True if has "colsep" attribute
     */
    boolean isSetColsep();
    
    /**
     * Sets the "colsep" attribute
     */
    void setColsep(java.lang.String colsep);
    
    /**
     * Sets (as xml) the "colsep" attribute
     */
    void xsetColsep(org.apache.xmlbeans.XmlString colsep);
    
    /**
     * Unsets the "colsep" attribute
     */
    void unsetColsep();
    
    /**
     * Gets the "rowsep" attribute
     */
    java.lang.String getRowsep();
    
    /**
     * Gets (as xml) the "rowsep" attribute
     */
    org.apache.xmlbeans.XmlString xgetRowsep();
    
    /**
     * True if has "rowsep" attribute
     */
    boolean isSetRowsep();
    
    /**
     * Sets the "rowsep" attribute
     */
    void setRowsep(java.lang.String rowsep);
    
    /**
     * Sets (as xml) the "rowsep" attribute
     */
    void xsetRowsep(org.apache.xmlbeans.XmlString rowsep);
    
    /**
     * Unsets the "rowsep" attribute
     */
    void unsetRowsep();
    
    /**
     * Gets the "align" attribute
     */
    edu.umich.icpsr.ddi.ColspecType.Align.Enum getAlign();
    
    /**
     * Gets (as xml) the "align" attribute
     */
    edu.umich.icpsr.ddi.ColspecType.Align xgetAlign();
    
    /**
     * True if has "align" attribute
     */
    boolean isSetAlign();
    
    /**
     * Sets the "align" attribute
     */
    void setAlign(edu.umich.icpsr.ddi.ColspecType.Align.Enum align);
    
    /**
     * Sets (as xml) the "align" attribute
     */
    void xsetAlign(edu.umich.icpsr.ddi.ColspecType.Align align);
    
    /**
     * Unsets the "align" attribute
     */
    void unsetAlign();
    
    /**
     * Gets the "char" attribute
     */
    java.lang.String getChar();
    
    /**
     * Gets (as xml) the "char" attribute
     */
    org.apache.xmlbeans.XmlString xgetChar();
    
    /**
     * True if has "char" attribute
     */
    boolean isSetChar();
    
    /**
     * Sets the "char" attribute
     */
    void setChar(java.lang.String xchar);
    
    /**
     * Sets (as xml) the "char" attribute
     */
    void xsetChar(org.apache.xmlbeans.XmlString xchar);
    
    /**
     * Unsets the "char" attribute
     */
    void unsetChar();
    
    /**
     * Gets the "charoff" attribute
     */
    java.lang.String getCharoff();
    
    /**
     * Gets (as xml) the "charoff" attribute
     */
    org.apache.xmlbeans.XmlNMTOKEN xgetCharoff();
    
    /**
     * True if has "charoff" attribute
     */
    boolean isSetCharoff();
    
    /**
     * Sets the "charoff" attribute
     */
    void setCharoff(java.lang.String charoff);
    
    /**
     * Sets (as xml) the "charoff" attribute
     */
    void xsetCharoff(org.apache.xmlbeans.XmlNMTOKEN charoff);
    
    /**
     * Unsets the "charoff" attribute
     */
    void unsetCharoff();
    
    /**
     * An XML align(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.ColspecType$Align.
     */
    public interface Align extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Align.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("align2b7dattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum LEFT = Enum.forString("left");
        static final Enum RIGHT = Enum.forString("right");
        static final Enum CENTER = Enum.forString("center");
        static final Enum JUSTIFY = Enum.forString("justify");
        static final Enum CHAR = Enum.forString("char");
        
        static final int INT_LEFT = Enum.INT_LEFT;
        static final int INT_RIGHT = Enum.INT_RIGHT;
        static final int INT_CENTER = Enum.INT_CENTER;
        static final int INT_JUSTIFY = Enum.INT_JUSTIFY;
        static final int INT_CHAR = Enum.INT_CHAR;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.ColspecType$Align.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_LEFT
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
            
            static final int INT_LEFT = 1;
            static final int INT_RIGHT = 2;
            static final int INT_CENTER = 3;
            static final int INT_JUSTIFY = 4;
            static final int INT_CHAR = 5;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("left", INT_LEFT),
                    new Enum("right", INT_RIGHT),
                    new Enum("center", INT_CENTER),
                    new Enum("justify", INT_JUSTIFY),
                    new Enum("char", INT_CHAR),
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
            public static edu.umich.icpsr.ddi.ColspecType.Align newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.ColspecType.Align) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.ColspecType.Align newInstance() {
              return (edu.umich.icpsr.ddi.ColspecType.Align) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.ColspecType.Align newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.ColspecType.Align) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.ColspecType newInstance() {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.ColspecType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.ColspecType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.ColspecType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.ColspecType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.ColspecType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.ColspecType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.ColspecType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.ColspecType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.ColspecType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.ColspecType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.ColspecType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.ColspecType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.ColspecType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.ColspecType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.ColspecType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.ColspecType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.ColspecType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.ColspecType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
