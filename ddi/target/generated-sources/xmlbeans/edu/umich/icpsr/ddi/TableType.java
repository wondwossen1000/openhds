/*
 * XML Type:  tableType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.TableType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML tableType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface TableType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TableType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("tabletype7197type");
    
    /**
     * Gets the "titl" element
     */
    edu.umich.icpsr.ddi.TitlType getTitl();
    
    /**
     * True if has "titl" element
     */
    boolean isSetTitl();
    
    /**
     * Sets the "titl" element
     */
    void setTitl(edu.umich.icpsr.ddi.TitlType titl);
    
    /**
     * Appends and returns a new empty "titl" element
     */
    edu.umich.icpsr.ddi.TitlType addNewTitl();
    
    /**
     * Unsets the "titl" element
     */
    void unsetTitl();
    
    /**
     * Gets array of all "tgroup" elements
     */
    edu.umich.icpsr.ddi.TgroupType[] getTgroupArray();
    
    /**
     * Gets ith "tgroup" element
     */
    edu.umich.icpsr.ddi.TgroupType getTgroupArray(int i);
    
    /**
     * Returns number of "tgroup" element
     */
    int sizeOfTgroupArray();
    
    /**
     * Sets array of all "tgroup" element
     */
    void setTgroupArray(edu.umich.icpsr.ddi.TgroupType[] tgroupArray);
    
    /**
     * Sets ith "tgroup" element
     */
    void setTgroupArray(int i, edu.umich.icpsr.ddi.TgroupType tgroup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tgroup" element
     */
    edu.umich.icpsr.ddi.TgroupType insertNewTgroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tgroup" element
     */
    edu.umich.icpsr.ddi.TgroupType addNewTgroup();
    
    /**
     * Removes the ith "tgroup" element
     */
    void removeTgroup(int i);
    
    /**
     * Gets the "frame" attribute
     */
    edu.umich.icpsr.ddi.TableType.Frame.Enum getFrame();
    
    /**
     * Gets (as xml) the "frame" attribute
     */
    edu.umich.icpsr.ddi.TableType.Frame xgetFrame();
    
    /**
     * True if has "frame" attribute
     */
    boolean isSetFrame();
    
    /**
     * Sets the "frame" attribute
     */
    void setFrame(edu.umich.icpsr.ddi.TableType.Frame.Enum frame);
    
    /**
     * Sets (as xml) the "frame" attribute
     */
    void xsetFrame(edu.umich.icpsr.ddi.TableType.Frame frame);
    
    /**
     * Unsets the "frame" attribute
     */
    void unsetFrame();
    
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
     * Gets the "pgwide" attribute
     */
    java.lang.String getPgwide();
    
    /**
     * Gets (as xml) the "pgwide" attribute
     */
    org.apache.xmlbeans.XmlString xgetPgwide();
    
    /**
     * True if has "pgwide" attribute
     */
    boolean isSetPgwide();
    
    /**
     * Sets the "pgwide" attribute
     */
    void setPgwide(java.lang.String pgwide);
    
    /**
     * Sets (as xml) the "pgwide" attribute
     */
    void xsetPgwide(org.apache.xmlbeans.XmlString pgwide);
    
    /**
     * Unsets the "pgwide" attribute
     */
    void unsetPgwide();
    
    /**
     * An XML frame(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.TableType$Frame.
     */
    public interface Frame extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Frame.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("frame8ba2attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum TOP = Enum.forString("top");
        static final Enum BOTTOM = Enum.forString("bottom");
        static final Enum TOPBOT = Enum.forString("topbot");
        static final Enum ALL = Enum.forString("all");
        static final Enum SIDES = Enum.forString("sides");
        static final Enum NONE = Enum.forString("none");
        
        static final int INT_TOP = Enum.INT_TOP;
        static final int INT_BOTTOM = Enum.INT_BOTTOM;
        static final int INT_TOPBOT = Enum.INT_TOPBOT;
        static final int INT_ALL = Enum.INT_ALL;
        static final int INT_SIDES = Enum.INT_SIDES;
        static final int INT_NONE = Enum.INT_NONE;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.TableType$Frame.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_TOP
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
            
            static final int INT_TOP = 1;
            static final int INT_BOTTOM = 2;
            static final int INT_TOPBOT = 3;
            static final int INT_ALL = 4;
            static final int INT_SIDES = 5;
            static final int INT_NONE = 6;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("top", INT_TOP),
                    new Enum("bottom", INT_BOTTOM),
                    new Enum("topbot", INT_TOPBOT),
                    new Enum("all", INT_ALL),
                    new Enum("sides", INT_SIDES),
                    new Enum("none", INT_NONE),
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
            public static edu.umich.icpsr.ddi.TableType.Frame newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.TableType.Frame) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.TableType.Frame newInstance() {
              return (edu.umich.icpsr.ddi.TableType.Frame) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.TableType.Frame newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.TableType.Frame) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.TableType newInstance() {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.TableType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.TableType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.TableType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.TableType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.TableType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.TableType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.TableType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.TableType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.TableType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.TableType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.TableType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.TableType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.TableType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.TableType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.TableType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.TableType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.TableType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.TableType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
