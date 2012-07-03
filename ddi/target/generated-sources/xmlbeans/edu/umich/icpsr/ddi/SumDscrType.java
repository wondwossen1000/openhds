/*
 * XML Type:  sumDscrType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.SumDscrType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML sumDscrType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface SumDscrType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SumDscrType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("sumdscrtype7b1ctype");
    
    /**
     * Gets array of all "timePrd" elements
     */
    edu.umich.icpsr.ddi.TimePrdType[] getTimePrdArray();
    
    /**
     * Gets ith "timePrd" element
     */
    edu.umich.icpsr.ddi.TimePrdType getTimePrdArray(int i);
    
    /**
     * Returns number of "timePrd" element
     */
    int sizeOfTimePrdArray();
    
    /**
     * Sets array of all "timePrd" element
     */
    void setTimePrdArray(edu.umich.icpsr.ddi.TimePrdType[] timePrdArray);
    
    /**
     * Sets ith "timePrd" element
     */
    void setTimePrdArray(int i, edu.umich.icpsr.ddi.TimePrdType timePrd);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "timePrd" element
     */
    edu.umich.icpsr.ddi.TimePrdType insertNewTimePrd(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "timePrd" element
     */
    edu.umich.icpsr.ddi.TimePrdType addNewTimePrd();
    
    /**
     * Removes the ith "timePrd" element
     */
    void removeTimePrd(int i);
    
    /**
     * Gets array of all "collDate" elements
     */
    edu.umich.icpsr.ddi.CollDateType[] getCollDateArray();
    
    /**
     * Gets ith "collDate" element
     */
    edu.umich.icpsr.ddi.CollDateType getCollDateArray(int i);
    
    /**
     * Returns number of "collDate" element
     */
    int sizeOfCollDateArray();
    
    /**
     * Sets array of all "collDate" element
     */
    void setCollDateArray(edu.umich.icpsr.ddi.CollDateType[] collDateArray);
    
    /**
     * Sets ith "collDate" element
     */
    void setCollDateArray(int i, edu.umich.icpsr.ddi.CollDateType collDate);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "collDate" element
     */
    edu.umich.icpsr.ddi.CollDateType insertNewCollDate(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "collDate" element
     */
    edu.umich.icpsr.ddi.CollDateType addNewCollDate();
    
    /**
     * Removes the ith "collDate" element
     */
    void removeCollDate(int i);
    
    /**
     * Gets array of all "nation" elements
     */
    edu.umich.icpsr.ddi.NationType[] getNationArray();
    
    /**
     * Gets ith "nation" element
     */
    edu.umich.icpsr.ddi.NationType getNationArray(int i);
    
    /**
     * Returns number of "nation" element
     */
    int sizeOfNationArray();
    
    /**
     * Sets array of all "nation" element
     */
    void setNationArray(edu.umich.icpsr.ddi.NationType[] nationArray);
    
    /**
     * Sets ith "nation" element
     */
    void setNationArray(int i, edu.umich.icpsr.ddi.NationType nation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nation" element
     */
    edu.umich.icpsr.ddi.NationType insertNewNation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nation" element
     */
    edu.umich.icpsr.ddi.NationType addNewNation();
    
    /**
     * Removes the ith "nation" element
     */
    void removeNation(int i);
    
    /**
     * Gets array of all "geogCover" elements
     */
    edu.umich.icpsr.ddi.GeogCoverType[] getGeogCoverArray();
    
    /**
     * Gets ith "geogCover" element
     */
    edu.umich.icpsr.ddi.GeogCoverType getGeogCoverArray(int i);
    
    /**
     * Returns number of "geogCover" element
     */
    int sizeOfGeogCoverArray();
    
    /**
     * Sets array of all "geogCover" element
     */
    void setGeogCoverArray(edu.umich.icpsr.ddi.GeogCoverType[] geogCoverArray);
    
    /**
     * Sets ith "geogCover" element
     */
    void setGeogCoverArray(int i, edu.umich.icpsr.ddi.GeogCoverType geogCover);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geogCover" element
     */
    edu.umich.icpsr.ddi.GeogCoverType insertNewGeogCover(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geogCover" element
     */
    edu.umich.icpsr.ddi.GeogCoverType addNewGeogCover();
    
    /**
     * Removes the ith "geogCover" element
     */
    void removeGeogCover(int i);
    
    /**
     * Gets array of all "geogUnit" elements
     */
    edu.umich.icpsr.ddi.GeogUnitType[] getGeogUnitArray();
    
    /**
     * Gets ith "geogUnit" element
     */
    edu.umich.icpsr.ddi.GeogUnitType getGeogUnitArray(int i);
    
    /**
     * Returns number of "geogUnit" element
     */
    int sizeOfGeogUnitArray();
    
    /**
     * Sets array of all "geogUnit" element
     */
    void setGeogUnitArray(edu.umich.icpsr.ddi.GeogUnitType[] geogUnitArray);
    
    /**
     * Sets ith "geogUnit" element
     */
    void setGeogUnitArray(int i, edu.umich.icpsr.ddi.GeogUnitType geogUnit);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geogUnit" element
     */
    edu.umich.icpsr.ddi.GeogUnitType insertNewGeogUnit(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geogUnit" element
     */
    edu.umich.icpsr.ddi.GeogUnitType addNewGeogUnit();
    
    /**
     * Removes the ith "geogUnit" element
     */
    void removeGeogUnit(int i);
    
    /**
     * Gets the "geoBndBox" element
     */
    edu.umich.icpsr.ddi.GeoBndBoxType getGeoBndBox();
    
    /**
     * True if has "geoBndBox" element
     */
    boolean isSetGeoBndBox();
    
    /**
     * Sets the "geoBndBox" element
     */
    void setGeoBndBox(edu.umich.icpsr.ddi.GeoBndBoxType geoBndBox);
    
    /**
     * Appends and returns a new empty "geoBndBox" element
     */
    edu.umich.icpsr.ddi.GeoBndBoxType addNewGeoBndBox();
    
    /**
     * Unsets the "geoBndBox" element
     */
    void unsetGeoBndBox();
    
    /**
     * Gets the "boundPoly" element
     */
    edu.umich.icpsr.ddi.BoundPolyType getBoundPoly();
    
    /**
     * True if has "boundPoly" element
     */
    boolean isSetBoundPoly();
    
    /**
     * Sets the "boundPoly" element
     */
    void setBoundPoly(edu.umich.icpsr.ddi.BoundPolyType boundPoly);
    
    /**
     * Appends and returns a new empty "boundPoly" element
     */
    edu.umich.icpsr.ddi.BoundPolyType addNewBoundPoly();
    
    /**
     * Unsets the "boundPoly" element
     */
    void unsetBoundPoly();
    
    /**
     * Gets array of all "anlyUnit" elements
     */
    edu.umich.icpsr.ddi.AnlyUnitType[] getAnlyUnitArray();
    
    /**
     * Gets ith "anlyUnit" element
     */
    edu.umich.icpsr.ddi.AnlyUnitType getAnlyUnitArray(int i);
    
    /**
     * Returns number of "anlyUnit" element
     */
    int sizeOfAnlyUnitArray();
    
    /**
     * Sets array of all "anlyUnit" element
     */
    void setAnlyUnitArray(edu.umich.icpsr.ddi.AnlyUnitType[] anlyUnitArray);
    
    /**
     * Sets ith "anlyUnit" element
     */
    void setAnlyUnitArray(int i, edu.umich.icpsr.ddi.AnlyUnitType anlyUnit);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "anlyUnit" element
     */
    edu.umich.icpsr.ddi.AnlyUnitType insertNewAnlyUnit(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "anlyUnit" element
     */
    edu.umich.icpsr.ddi.AnlyUnitType addNewAnlyUnit();
    
    /**
     * Removes the ith "anlyUnit" element
     */
    void removeAnlyUnit(int i);
    
    /**
     * Gets array of all "universe" elements
     */
    edu.umich.icpsr.ddi.UniverseType[] getUniverseArray();
    
    /**
     * Gets ith "universe" element
     */
    edu.umich.icpsr.ddi.UniverseType getUniverseArray(int i);
    
    /**
     * Returns number of "universe" element
     */
    int sizeOfUniverseArray();
    
    /**
     * Sets array of all "universe" element
     */
    void setUniverseArray(edu.umich.icpsr.ddi.UniverseType[] universeArray);
    
    /**
     * Sets ith "universe" element
     */
    void setUniverseArray(int i, edu.umich.icpsr.ddi.UniverseType universe);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "universe" element
     */
    edu.umich.icpsr.ddi.UniverseType insertNewUniverse(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "universe" element
     */
    edu.umich.icpsr.ddi.UniverseType addNewUniverse();
    
    /**
     * Removes the ith "universe" element
     */
    void removeUniverse(int i);
    
    /**
     * Gets array of all "dataKind" elements
     */
    edu.umich.icpsr.ddi.DataKindType[] getDataKindArray();
    
    /**
     * Gets ith "dataKind" element
     */
    edu.umich.icpsr.ddi.DataKindType getDataKindArray(int i);
    
    /**
     * Returns number of "dataKind" element
     */
    int sizeOfDataKindArray();
    
    /**
     * Sets array of all "dataKind" element
     */
    void setDataKindArray(edu.umich.icpsr.ddi.DataKindType[] dataKindArray);
    
    /**
     * Sets ith "dataKind" element
     */
    void setDataKindArray(int i, edu.umich.icpsr.ddi.DataKindType dataKind);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataKind" element
     */
    edu.umich.icpsr.ddi.DataKindType insertNewDataKind(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataKind" element
     */
    edu.umich.icpsr.ddi.DataKindType addNewDataKind();
    
    /**
     * Removes the ith "dataKind" element
     */
    void removeDataKind(int i);
    
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
    edu.umich.icpsr.ddi.SumDscrType.Source.Enum getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    edu.umich.icpsr.ddi.SumDscrType.Source xgetSource();
    
    /**
     * True if has "source" attribute
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(edu.umich.icpsr.ddi.SumDscrType.Source.Enum source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(edu.umich.icpsr.ddi.SumDscrType.Source source);
    
    /**
     * Unsets the "source" attribute
     */
    void unsetSource();
    
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.SumDscrType$Source.
     */
    public interface Source extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("source13c1attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ARCHIVE = Enum.forString("archive");
        static final Enum PRODUCER = Enum.forString("producer");
        
        static final int INT_ARCHIVE = Enum.INT_ARCHIVE;
        static final int INT_PRODUCER = Enum.INT_PRODUCER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.SumDscrType$Source.
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
            public static edu.umich.icpsr.ddi.SumDscrType.Source newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.SumDscrType.Source) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.SumDscrType.Source newInstance() {
              return (edu.umich.icpsr.ddi.SumDscrType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.SumDscrType.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.SumDscrType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.SumDscrType newInstance() {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.SumDscrType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.SumDscrType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.SumDscrType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.SumDscrType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.SumDscrType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.SumDscrType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.SumDscrType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.SumDscrType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.SumDscrType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.SumDscrType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.SumDscrType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.SumDscrType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.SumDscrType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.SumDscrType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.SumDscrType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.SumDscrType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.SumDscrType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.SumDscrType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
