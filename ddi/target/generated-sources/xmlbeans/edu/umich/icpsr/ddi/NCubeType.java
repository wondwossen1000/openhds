/*
 * XML Type:  nCubeType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.NCubeType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML nCubeType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface NCubeType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NCubeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("ncubetype2f82type");
    
    /**
     * Gets array of all "location" elements
     */
    edu.umich.icpsr.ddi.LocationType[] getLocationArray();
    
    /**
     * Gets ith "location" element
     */
    edu.umich.icpsr.ddi.LocationType getLocationArray(int i);
    
    /**
     * Returns number of "location" element
     */
    int sizeOfLocationArray();
    
    /**
     * Sets array of all "location" element
     */
    void setLocationArray(edu.umich.icpsr.ddi.LocationType[] locationArray);
    
    /**
     * Sets ith "location" element
     */
    void setLocationArray(int i, edu.umich.icpsr.ddi.LocationType location);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "location" element
     */
    edu.umich.icpsr.ddi.LocationType insertNewLocation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    edu.umich.icpsr.ddi.LocationType addNewLocation();
    
    /**
     * Removes the ith "location" element
     */
    void removeLocation(int i);
    
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
     * Gets the "imputation" element
     */
    edu.umich.icpsr.ddi.ImputationType getImputation();
    
    /**
     * True if has "imputation" element
     */
    boolean isSetImputation();
    
    /**
     * Sets the "imputation" element
     */
    void setImputation(edu.umich.icpsr.ddi.ImputationType imputation);
    
    /**
     * Appends and returns a new empty "imputation" element
     */
    edu.umich.icpsr.ddi.ImputationType addNewImputation();
    
    /**
     * Unsets the "imputation" element
     */
    void unsetImputation();
    
    /**
     * Gets the "security" element
     */
    edu.umich.icpsr.ddi.SecurityType getSecurity();
    
    /**
     * True if has "security" element
     */
    boolean isSetSecurity();
    
    /**
     * Sets the "security" element
     */
    void setSecurity(edu.umich.icpsr.ddi.SecurityType security);
    
    /**
     * Appends and returns a new empty "security" element
     */
    edu.umich.icpsr.ddi.SecurityType addNewSecurity();
    
    /**
     * Unsets the "security" element
     */
    void unsetSecurity();
    
    /**
     * Gets the "embargo" element
     */
    edu.umich.icpsr.ddi.EmbargoType getEmbargo();
    
    /**
     * True if has "embargo" element
     */
    boolean isSetEmbargo();
    
    /**
     * Sets the "embargo" element
     */
    void setEmbargo(edu.umich.icpsr.ddi.EmbargoType embargo);
    
    /**
     * Appends and returns a new empty "embargo" element
     */
    edu.umich.icpsr.ddi.EmbargoType addNewEmbargo();
    
    /**
     * Unsets the "embargo" element
     */
    void unsetEmbargo();
    
    /**
     * Gets the "respUnit" element
     */
    edu.umich.icpsr.ddi.RespUnitType getRespUnit();
    
    /**
     * True if has "respUnit" element
     */
    boolean isSetRespUnit();
    
    /**
     * Sets the "respUnit" element
     */
    void setRespUnit(edu.umich.icpsr.ddi.RespUnitType respUnit);
    
    /**
     * Appends and returns a new empty "respUnit" element
     */
    edu.umich.icpsr.ddi.RespUnitType addNewRespUnit();
    
    /**
     * Unsets the "respUnit" element
     */
    void unsetRespUnit();
    
    /**
     * Gets the "anlysUnit" element
     */
    edu.umich.icpsr.ddi.AnlysUnitType getAnlysUnit();
    
    /**
     * True if has "anlysUnit" element
     */
    boolean isSetAnlysUnit();
    
    /**
     * Sets the "anlysUnit" element
     */
    void setAnlysUnit(edu.umich.icpsr.ddi.AnlysUnitType anlysUnit);
    
    /**
     * Appends and returns a new empty "anlysUnit" element
     */
    edu.umich.icpsr.ddi.AnlysUnitType addNewAnlysUnit();
    
    /**
     * Unsets the "anlysUnit" element
     */
    void unsetAnlysUnit();
    
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
     * Gets the "purpose" element
     */
    edu.umich.icpsr.ddi.PurposeType getPurpose();
    
    /**
     * True if has "purpose" element
     */
    boolean isSetPurpose();
    
    /**
     * Sets the "purpose" element
     */
    void setPurpose(edu.umich.icpsr.ddi.PurposeType purpose);
    
    /**
     * Appends and returns a new empty "purpose" element
     */
    edu.umich.icpsr.ddi.PurposeType addNewPurpose();
    
    /**
     * Unsets the "purpose" element
     */
    void unsetPurpose();
    
    /**
     * Gets array of all "dmns" elements
     */
    edu.umich.icpsr.ddi.DmnsType[] getDmnsArray();
    
    /**
     * Gets ith "dmns" element
     */
    edu.umich.icpsr.ddi.DmnsType getDmnsArray(int i);
    
    /**
     * Returns number of "dmns" element
     */
    int sizeOfDmnsArray();
    
    /**
     * Sets array of all "dmns" element
     */
    void setDmnsArray(edu.umich.icpsr.ddi.DmnsType[] dmnsArray);
    
    /**
     * Sets ith "dmns" element
     */
    void setDmnsArray(int i, edu.umich.icpsr.ddi.DmnsType dmns);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dmns" element
     */
    edu.umich.icpsr.ddi.DmnsType insertNewDmns(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dmns" element
     */
    edu.umich.icpsr.ddi.DmnsType addNewDmns();
    
    /**
     * Removes the ith "dmns" element
     */
    void removeDmns(int i);
    
    /**
     * Gets array of all "measure" elements
     */
    edu.umich.icpsr.ddi.MeasureType[] getMeasureArray();
    
    /**
     * Gets ith "measure" element
     */
    edu.umich.icpsr.ddi.MeasureType getMeasureArray(int i);
    
    /**
     * Returns number of "measure" element
     */
    int sizeOfMeasureArray();
    
    /**
     * Sets array of all "measure" element
     */
    void setMeasureArray(edu.umich.icpsr.ddi.MeasureType[] measureArray);
    
    /**
     * Sets ith "measure" element
     */
    void setMeasureArray(int i, edu.umich.icpsr.ddi.MeasureType measure);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "measure" element
     */
    edu.umich.icpsr.ddi.MeasureType insertNewMeasure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "measure" element
     */
    edu.umich.icpsr.ddi.MeasureType addNewMeasure();
    
    /**
     * Removes the ith "measure" element
     */
    void removeMeasure(int i);
    
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
    edu.umich.icpsr.ddi.NCubeType.Source.Enum getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    edu.umich.icpsr.ddi.NCubeType.Source xgetSource();
    
    /**
     * True if has "source" attribute
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(edu.umich.icpsr.ddi.NCubeType.Source.Enum source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(edu.umich.icpsr.ddi.NCubeType.Source source);
    
    /**
     * Unsets the "source" attribute
     */
    void unsetSource();
    
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
     * Gets the "dmnsQnty" attribute
     */
    java.lang.String getDmnsQnty();
    
    /**
     * Gets (as xml) the "dmnsQnty" attribute
     */
    org.apache.xmlbeans.XmlString xgetDmnsQnty();
    
    /**
     * True if has "dmnsQnty" attribute
     */
    boolean isSetDmnsQnty();
    
    /**
     * Sets the "dmnsQnty" attribute
     */
    void setDmnsQnty(java.lang.String dmnsQnty);
    
    /**
     * Sets (as xml) the "dmnsQnty" attribute
     */
    void xsetDmnsQnty(org.apache.xmlbeans.XmlString dmnsQnty);
    
    /**
     * Unsets the "dmnsQnty" attribute
     */
    void unsetDmnsQnty();
    
    /**
     * Gets the "cellQnty" attribute
     */
    java.lang.String getCellQnty();
    
    /**
     * Gets (as xml) the "cellQnty" attribute
     */
    org.apache.xmlbeans.XmlString xgetCellQnty();
    
    /**
     * True if has "cellQnty" attribute
     */
    boolean isSetCellQnty();
    
    /**
     * Sets the "cellQnty" attribute
     */
    void setCellQnty(java.lang.String cellQnty);
    
    /**
     * Sets (as xml) the "cellQnty" attribute
     */
    void xsetCellQnty(org.apache.xmlbeans.XmlString cellQnty);
    
    /**
     * Unsets the "cellQnty" attribute
     */
    void unsetCellQnty();
    
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.NCubeType$Source.
     */
    public interface Source extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("sourcead67attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ARCHIVE = Enum.forString("archive");
        static final Enum PRODUCER = Enum.forString("producer");
        
        static final int INT_ARCHIVE = Enum.INT_ARCHIVE;
        static final int INT_PRODUCER = Enum.INT_PRODUCER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.NCubeType$Source.
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
            public static edu.umich.icpsr.ddi.NCubeType.Source newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.NCubeType.Source) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.NCubeType.Source newInstance() {
              return (edu.umich.icpsr.ddi.NCubeType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.NCubeType.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.NCubeType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.NCubeType newInstance() {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.NCubeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.NCubeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.NCubeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.NCubeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.NCubeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.NCubeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.NCubeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.NCubeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.NCubeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.NCubeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.NCubeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
