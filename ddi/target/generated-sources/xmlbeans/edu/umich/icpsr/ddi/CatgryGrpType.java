/*
 * XML Type:  catgryGrpType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.CatgryGrpType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML catgryGrpType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface CatgryGrpType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CatgryGrpType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("catgrygrptyped418type");
    
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
     * Gets array of all "catStat" elements
     */
    edu.umich.icpsr.ddi.CatStatType[] getCatStatArray();
    
    /**
     * Gets ith "catStat" element
     */
    edu.umich.icpsr.ddi.CatStatType getCatStatArray(int i);
    
    /**
     * Returns number of "catStat" element
     */
    int sizeOfCatStatArray();
    
    /**
     * Sets array of all "catStat" element
     */
    void setCatStatArray(edu.umich.icpsr.ddi.CatStatType[] catStatArray);
    
    /**
     * Sets ith "catStat" element
     */
    void setCatStatArray(int i, edu.umich.icpsr.ddi.CatStatType catStat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "catStat" element
     */
    edu.umich.icpsr.ddi.CatStatType insertNewCatStat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "catStat" element
     */
    edu.umich.icpsr.ddi.CatStatType addNewCatStat();
    
    /**
     * Removes the ith "catStat" element
     */
    void removeCatStat(int i);
    
    /**
     * Gets array of all "txt" elements
     */
    edu.umich.icpsr.ddi.TxtType[] getTxtArray();
    
    /**
     * Gets ith "txt" element
     */
    edu.umich.icpsr.ddi.TxtType getTxtArray(int i);
    
    /**
     * Returns number of "txt" element
     */
    int sizeOfTxtArray();
    
    /**
     * Sets array of all "txt" element
     */
    void setTxtArray(edu.umich.icpsr.ddi.TxtType[] txtArray);
    
    /**
     * Sets ith "txt" element
     */
    void setTxtArray(int i, edu.umich.icpsr.ddi.TxtType txt);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "txt" element
     */
    edu.umich.icpsr.ddi.TxtType insertNewTxt(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "txt" element
     */
    edu.umich.icpsr.ddi.TxtType addNewTxt();
    
    /**
     * Removes the ith "txt" element
     */
    void removeTxt(int i);
    
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
    edu.umich.icpsr.ddi.CatgryGrpType.Source.Enum getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    edu.umich.icpsr.ddi.CatgryGrpType.Source xgetSource();
    
    /**
     * True if has "source" attribute
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(edu.umich.icpsr.ddi.CatgryGrpType.Source.Enum source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(edu.umich.icpsr.ddi.CatgryGrpType.Source source);
    
    /**
     * Unsets the "source" attribute
     */
    void unsetSource();
    
    /**
     * Gets the "missing" attribute
     */
    edu.umich.icpsr.ddi.CatgryGrpType.Missing.Enum getMissing();
    
    /**
     * Gets (as xml) the "missing" attribute
     */
    edu.umich.icpsr.ddi.CatgryGrpType.Missing xgetMissing();
    
    /**
     * True if has "missing" attribute
     */
    boolean isSetMissing();
    
    /**
     * Sets the "missing" attribute
     */
    void setMissing(edu.umich.icpsr.ddi.CatgryGrpType.Missing.Enum missing);
    
    /**
     * Sets (as xml) the "missing" attribute
     */
    void xsetMissing(edu.umich.icpsr.ddi.CatgryGrpType.Missing missing);
    
    /**
     * Unsets the "missing" attribute
     */
    void unsetMissing();
    
    /**
     * Gets the "missType" attribute
     */
    java.lang.String getMissType();
    
    /**
     * Gets (as xml) the "missType" attribute
     */
    org.apache.xmlbeans.XmlString xgetMissType();
    
    /**
     * True if has "missType" attribute
     */
    boolean isSetMissType();
    
    /**
     * Sets the "missType" attribute
     */
    void setMissType(java.lang.String missType);
    
    /**
     * Sets (as xml) the "missType" attribute
     */
    void xsetMissType(org.apache.xmlbeans.XmlString missType);
    
    /**
     * Unsets the "missType" attribute
     */
    void unsetMissType();
    
    /**
     * Gets the "catgry" attribute
     */
    java.util.List getCatgry();
    
    /**
     * Gets (as xml) the "catgry" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetCatgry();
    
    /**
     * True if has "catgry" attribute
     */
    boolean isSetCatgry();
    
    /**
     * Sets the "catgry" attribute
     */
    void setCatgry(java.util.List catgry);
    
    /**
     * Sets (as xml) the "catgry" attribute
     */
    void xsetCatgry(org.apache.xmlbeans.XmlIDREFS catgry);
    
    /**
     * Unsets the "catgry" attribute
     */
    void unsetCatgry();
    
    /**
     * Gets the "catGrp" attribute
     */
    java.util.List getCatGrp();
    
    /**
     * Gets (as xml) the "catGrp" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetCatGrp();
    
    /**
     * True if has "catGrp" attribute
     */
    boolean isSetCatGrp();
    
    /**
     * Sets the "catGrp" attribute
     */
    void setCatGrp(java.util.List catGrp);
    
    /**
     * Sets (as xml) the "catGrp" attribute
     */
    void xsetCatGrp(org.apache.xmlbeans.XmlIDREFS catGrp);
    
    /**
     * Unsets the "catGrp" attribute
     */
    void unsetCatGrp();
    
    /**
     * Gets the "levelno" attribute
     */
    java.lang.String getLevelno();
    
    /**
     * Gets (as xml) the "levelno" attribute
     */
    org.apache.xmlbeans.XmlString xgetLevelno();
    
    /**
     * True if has "levelno" attribute
     */
    boolean isSetLevelno();
    
    /**
     * Sets the "levelno" attribute
     */
    void setLevelno(java.lang.String levelno);
    
    /**
     * Sets (as xml) the "levelno" attribute
     */
    void xsetLevelno(org.apache.xmlbeans.XmlString levelno);
    
    /**
     * Unsets the "levelno" attribute
     */
    void unsetLevelno();
    
    /**
     * Gets the "levelnm" attribute
     */
    java.lang.String getLevelnm();
    
    /**
     * Gets (as xml) the "levelnm" attribute
     */
    org.apache.xmlbeans.XmlString xgetLevelnm();
    
    /**
     * True if has "levelnm" attribute
     */
    boolean isSetLevelnm();
    
    /**
     * Sets the "levelnm" attribute
     */
    void setLevelnm(java.lang.String levelnm);
    
    /**
     * Sets (as xml) the "levelnm" attribute
     */
    void xsetLevelnm(org.apache.xmlbeans.XmlString levelnm);
    
    /**
     * Unsets the "levelnm" attribute
     */
    void unsetLevelnm();
    
    /**
     * Gets the "compl" attribute
     */
    edu.umich.icpsr.ddi.CatgryGrpType.Compl.Enum getCompl();
    
    /**
     * Gets (as xml) the "compl" attribute
     */
    edu.umich.icpsr.ddi.CatgryGrpType.Compl xgetCompl();
    
    /**
     * True if has "compl" attribute
     */
    boolean isSetCompl();
    
    /**
     * Sets the "compl" attribute
     */
    void setCompl(edu.umich.icpsr.ddi.CatgryGrpType.Compl.Enum compl);
    
    /**
     * Sets (as xml) the "compl" attribute
     */
    void xsetCompl(edu.umich.icpsr.ddi.CatgryGrpType.Compl compl);
    
    /**
     * Unsets the "compl" attribute
     */
    void unsetCompl();
    
    /**
     * Gets the "excls" attribute
     */
    edu.umich.icpsr.ddi.CatgryGrpType.Excls.Enum getExcls();
    
    /**
     * Gets (as xml) the "excls" attribute
     */
    edu.umich.icpsr.ddi.CatgryGrpType.Excls xgetExcls();
    
    /**
     * True if has "excls" attribute
     */
    boolean isSetExcls();
    
    /**
     * Sets the "excls" attribute
     */
    void setExcls(edu.umich.icpsr.ddi.CatgryGrpType.Excls.Enum excls);
    
    /**
     * Sets (as xml) the "excls" attribute
     */
    void xsetExcls(edu.umich.icpsr.ddi.CatgryGrpType.Excls excls);
    
    /**
     * Unsets the "excls" attribute
     */
    void unsetExcls();
    
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CatgryGrpType$Source.
     */
    public interface Source extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("sourced77dattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ARCHIVE = Enum.forString("archive");
        static final Enum PRODUCER = Enum.forString("producer");
        
        static final int INT_ARCHIVE = Enum.INT_ARCHIVE;
        static final int INT_PRODUCER = Enum.INT_PRODUCER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.CatgryGrpType$Source.
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
            public static edu.umich.icpsr.ddi.CatgryGrpType.Source newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.CatgryGrpType.Source) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.CatgryGrpType.Source newInstance() {
              return (edu.umich.icpsr.ddi.CatgryGrpType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.CatgryGrpType.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.CatgryGrpType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML missing(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CatgryGrpType$Missing.
     */
    public interface Missing extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Missing.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("missing948aattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum Y = Enum.forString("Y");
        static final Enum N = Enum.forString("N");
        
        static final int INT_Y = Enum.INT_Y;
        static final int INT_N = Enum.INT_N;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.CatgryGrpType$Missing.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_Y
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
            
            static final int INT_Y = 1;
            static final int INT_N = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Y", INT_Y),
                    new Enum("N", INT_N),
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
            public static edu.umich.icpsr.ddi.CatgryGrpType.Missing newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.CatgryGrpType.Missing) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.CatgryGrpType.Missing newInstance() {
              return (edu.umich.icpsr.ddi.CatgryGrpType.Missing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.CatgryGrpType.Missing newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.CatgryGrpType.Missing) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML compl(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CatgryGrpType$Compl.
     */
    public interface Compl extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Compl.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("complccd3attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum TRUE = Enum.forString("true");
        static final Enum FALSE = Enum.forString("false");
        
        static final int INT_TRUE = Enum.INT_TRUE;
        static final int INT_FALSE = Enum.INT_FALSE;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.CatgryGrpType$Compl.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_TRUE
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
            
            static final int INT_TRUE = 1;
            static final int INT_FALSE = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("true", INT_TRUE),
                    new Enum("false", INT_FALSE),
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
            public static edu.umich.icpsr.ddi.CatgryGrpType.Compl newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.CatgryGrpType.Compl) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.CatgryGrpType.Compl newInstance() {
              return (edu.umich.icpsr.ddi.CatgryGrpType.Compl) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.CatgryGrpType.Compl newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.CatgryGrpType.Compl) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML excls(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CatgryGrpType$Excls.
     */
    public interface Excls extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Excls.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("excls9539attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum TRUE = Enum.forString("true");
        static final Enum FALSE = Enum.forString("false");
        
        static final int INT_TRUE = Enum.INT_TRUE;
        static final int INT_FALSE = Enum.INT_FALSE;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.CatgryGrpType$Excls.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_TRUE
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
            
            static final int INT_TRUE = 1;
            static final int INT_FALSE = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("true", INT_TRUE),
                    new Enum("false", INT_FALSE),
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
            public static edu.umich.icpsr.ddi.CatgryGrpType.Excls newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.CatgryGrpType.Excls) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.CatgryGrpType.Excls newInstance() {
              return (edu.umich.icpsr.ddi.CatgryGrpType.Excls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.CatgryGrpType.Excls newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.CatgryGrpType.Excls) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.CatgryGrpType newInstance() {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.CatgryGrpType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.CatgryGrpType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.CatgryGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
