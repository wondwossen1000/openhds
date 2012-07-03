/*
 * XML Type:  nCubeGrpType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.NCubeGrpType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML nCubeGrpType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface NCubeGrpType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NCubeGrpType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("ncubegrptypea151type");
    
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
     * Gets array of all "concept" elements
     */
    edu.umich.icpsr.ddi.ConceptType[] getConceptArray();
    
    /**
     * Gets ith "concept" element
     */
    edu.umich.icpsr.ddi.ConceptType getConceptArray(int i);
    
    /**
     * Returns number of "concept" element
     */
    int sizeOfConceptArray();
    
    /**
     * Sets array of all "concept" element
     */
    void setConceptArray(edu.umich.icpsr.ddi.ConceptType[] conceptArray);
    
    /**
     * Sets ith "concept" element
     */
    void setConceptArray(int i, edu.umich.icpsr.ddi.ConceptType concept);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "concept" element
     */
    edu.umich.icpsr.ddi.ConceptType insertNewConcept(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "concept" element
     */
    edu.umich.icpsr.ddi.ConceptType addNewConcept();
    
    /**
     * Removes the ith "concept" element
     */
    void removeConcept(int i);
    
    /**
     * Gets the "defntn" element
     */
    edu.umich.icpsr.ddi.DefntnType getDefntn();
    
    /**
     * True if has "defntn" element
     */
    boolean isSetDefntn();
    
    /**
     * Sets the "defntn" element
     */
    void setDefntn(edu.umich.icpsr.ddi.DefntnType defntn);
    
    /**
     * Appends and returns a new empty "defntn" element
     */
    edu.umich.icpsr.ddi.DefntnType addNewDefntn();
    
    /**
     * Unsets the "defntn" element
     */
    void unsetDefntn();
    
    /**
     * Gets the "universe" element
     */
    edu.umich.icpsr.ddi.UniverseType getUniverse();
    
    /**
     * True if has "universe" element
     */
    boolean isSetUniverse();
    
    /**
     * Sets the "universe" element
     */
    void setUniverse(edu.umich.icpsr.ddi.UniverseType universe);
    
    /**
     * Appends and returns a new empty "universe" element
     */
    edu.umich.icpsr.ddi.UniverseType addNewUniverse();
    
    /**
     * Unsets the "universe" element
     */
    void unsetUniverse();
    
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
    edu.umich.icpsr.ddi.NCubeGrpType.Source.Enum getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    edu.umich.icpsr.ddi.NCubeGrpType.Source xgetSource();
    
    /**
     * True if has "source" attribute
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(edu.umich.icpsr.ddi.NCubeGrpType.Source.Enum source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(edu.umich.icpsr.ddi.NCubeGrpType.Source source);
    
    /**
     * Unsets the "source" attribute
     */
    void unsetSource();
    
    /**
     * Gets the "type" attribute
     */
    edu.umich.icpsr.ddi.NCubeGrpType.Type.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    edu.umich.icpsr.ddi.NCubeGrpType.Type xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(edu.umich.icpsr.ddi.NCubeGrpType.Type.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(edu.umich.icpsr.ddi.NCubeGrpType.Type type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "nCube" attribute
     */
    java.util.List getNCube();
    
    /**
     * Gets (as xml) the "nCube" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetNCube();
    
    /**
     * True if has "nCube" attribute
     */
    boolean isSetNCube();
    
    /**
     * Sets the "nCube" attribute
     */
    void setNCube(java.util.List nCube);
    
    /**
     * Sets (as xml) the "nCube" attribute
     */
    void xsetNCube(org.apache.xmlbeans.XmlIDREFS nCube);
    
    /**
     * Unsets the "nCube" attribute
     */
    void unsetNCube();
    
    /**
     * Gets the "nCubeGrp" attribute
     */
    java.util.List getNCubeGrp();
    
    /**
     * Gets (as xml) the "nCubeGrp" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetNCubeGrp();
    
    /**
     * True if has "nCubeGrp" attribute
     */
    boolean isSetNCubeGrp();
    
    /**
     * Sets the "nCubeGrp" attribute
     */
    void setNCubeGrp(java.util.List nCubeGrp);
    
    /**
     * Sets (as xml) the "nCubeGrp" attribute
     */
    void xsetNCubeGrp(org.apache.xmlbeans.XmlIDREFS nCubeGrp);
    
    /**
     * Unsets the "nCubeGrp" attribute
     */
    void unsetNCubeGrp();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "sdatrefs" attribute
     */
    java.util.List getSdatrefs();
    
    /**
     * Gets (as xml) the "sdatrefs" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetSdatrefs();
    
    /**
     * True if has "sdatrefs" attribute
     */
    boolean isSetSdatrefs();
    
    /**
     * Sets the "sdatrefs" attribute
     */
    void setSdatrefs(java.util.List sdatrefs);
    
    /**
     * Sets (as xml) the "sdatrefs" attribute
     */
    void xsetSdatrefs(org.apache.xmlbeans.XmlIDREFS sdatrefs);
    
    /**
     * Unsets the "sdatrefs" attribute
     */
    void unsetSdatrefs();
    
    /**
     * Gets the "methrefs" attribute
     */
    java.util.List getMethrefs();
    
    /**
     * Gets (as xml) the "methrefs" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetMethrefs();
    
    /**
     * True if has "methrefs" attribute
     */
    boolean isSetMethrefs();
    
    /**
     * Sets the "methrefs" attribute
     */
    void setMethrefs(java.util.List methrefs);
    
    /**
     * Sets (as xml) the "methrefs" attribute
     */
    void xsetMethrefs(org.apache.xmlbeans.XmlIDREFS methrefs);
    
    /**
     * Unsets the "methrefs" attribute
     */
    void unsetMethrefs();
    
    /**
     * Gets the "pubrefs" attribute
     */
    java.util.List getPubrefs();
    
    /**
     * Gets (as xml) the "pubrefs" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetPubrefs();
    
    /**
     * True if has "pubrefs" attribute
     */
    boolean isSetPubrefs();
    
    /**
     * Sets the "pubrefs" attribute
     */
    void setPubrefs(java.util.List pubrefs);
    
    /**
     * Sets (as xml) the "pubrefs" attribute
     */
    void xsetPubrefs(org.apache.xmlbeans.XmlIDREFS pubrefs);
    
    /**
     * Unsets the "pubrefs" attribute
     */
    void unsetPubrefs();
    
    /**
     * Gets the "access" attribute
     */
    java.util.List getAccess();
    
    /**
     * Gets (as xml) the "access" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetAccess();
    
    /**
     * True if has "access" attribute
     */
    boolean isSetAccess();
    
    /**
     * Sets the "access" attribute
     */
    void setAccess(java.util.List access);
    
    /**
     * Sets (as xml) the "access" attribute
     */
    void xsetAccess(org.apache.xmlbeans.XmlIDREFS access);
    
    /**
     * Unsets the "access" attribute
     */
    void unsetAccess();
    
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.NCubeGrpType$Source.
     */
    public interface Source extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("source1d4cattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ARCHIVE = Enum.forString("archive");
        static final Enum PRODUCER = Enum.forString("producer");
        
        static final int INT_ARCHIVE = Enum.INT_ARCHIVE;
        static final int INT_PRODUCER = Enum.INT_PRODUCER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.NCubeGrpType$Source.
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
            public static edu.umich.icpsr.ddi.NCubeGrpType.Source newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.NCubeGrpType.Source) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.NCubeGrpType.Source newInstance() {
              return (edu.umich.icpsr.ddi.NCubeGrpType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.NCubeGrpType.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.NCubeGrpType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.NCubeGrpType$Type.
     */
    public interface Type extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("type7d2battrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum SECTION = Enum.forString("section");
        static final Enum MULTIPLE_RESP = Enum.forString("multipleResp");
        static final Enum GRID = Enum.forString("grid");
        static final Enum DISPLAY = Enum.forString("display");
        static final Enum REPETITION = Enum.forString("repetition");
        static final Enum SUBJECT = Enum.forString("subject");
        static final Enum VERSION = Enum.forString("version");
        static final Enum ITERATION = Enum.forString("iteration");
        static final Enum ANALYSIS = Enum.forString("analysis");
        static final Enum PRAGMATIC = Enum.forString("pragmatic");
        static final Enum RECORD = Enum.forString("record");
        static final Enum FILE = Enum.forString("file");
        static final Enum RANDOMIZED = Enum.forString("randomized");
        static final Enum OTHER = Enum.forString("other");
        
        static final int INT_SECTION = Enum.INT_SECTION;
        static final int INT_MULTIPLE_RESP = Enum.INT_MULTIPLE_RESP;
        static final int INT_GRID = Enum.INT_GRID;
        static final int INT_DISPLAY = Enum.INT_DISPLAY;
        static final int INT_REPETITION = Enum.INT_REPETITION;
        static final int INT_SUBJECT = Enum.INT_SUBJECT;
        static final int INT_VERSION = Enum.INT_VERSION;
        static final int INT_ITERATION = Enum.INT_ITERATION;
        static final int INT_ANALYSIS = Enum.INT_ANALYSIS;
        static final int INT_PRAGMATIC = Enum.INT_PRAGMATIC;
        static final int INT_RECORD = Enum.INT_RECORD;
        static final int INT_FILE = Enum.INT_FILE;
        static final int INT_RANDOMIZED = Enum.INT_RANDOMIZED;
        static final int INT_OTHER = Enum.INT_OTHER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.NCubeGrpType$Type.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_SECTION
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
            
            static final int INT_SECTION = 1;
            static final int INT_MULTIPLE_RESP = 2;
            static final int INT_GRID = 3;
            static final int INT_DISPLAY = 4;
            static final int INT_REPETITION = 5;
            static final int INT_SUBJECT = 6;
            static final int INT_VERSION = 7;
            static final int INT_ITERATION = 8;
            static final int INT_ANALYSIS = 9;
            static final int INT_PRAGMATIC = 10;
            static final int INT_RECORD = 11;
            static final int INT_FILE = 12;
            static final int INT_RANDOMIZED = 13;
            static final int INT_OTHER = 14;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("section", INT_SECTION),
                    new Enum("multipleResp", INT_MULTIPLE_RESP),
                    new Enum("grid", INT_GRID),
                    new Enum("display", INT_DISPLAY),
                    new Enum("repetition", INT_REPETITION),
                    new Enum("subject", INT_SUBJECT),
                    new Enum("version", INT_VERSION),
                    new Enum("iteration", INT_ITERATION),
                    new Enum("analysis", INT_ANALYSIS),
                    new Enum("pragmatic", INT_PRAGMATIC),
                    new Enum("record", INT_RECORD),
                    new Enum("file", INT_FILE),
                    new Enum("randomized", INT_RANDOMIZED),
                    new Enum("other", INT_OTHER),
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
            public static edu.umich.icpsr.ddi.NCubeGrpType.Type newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.NCubeGrpType.Type) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.NCubeGrpType.Type newInstance() {
              return (edu.umich.icpsr.ddi.NCubeGrpType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.NCubeGrpType.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.NCubeGrpType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.NCubeGrpType newInstance() {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeGrpType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.NCubeGrpType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.NCubeGrpType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
