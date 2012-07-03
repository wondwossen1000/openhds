/*
 * XML Type:  varType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.VarType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * An XML varType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public interface VarType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VarType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("vartypee5detype");
    
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
     * Gets array of all "qstn" elements
     */
    edu.umich.icpsr.ddi.QstnType[] getQstnArray();
    
    /**
     * Gets ith "qstn" element
     */
    edu.umich.icpsr.ddi.QstnType getQstnArray(int i);
    
    /**
     * Returns number of "qstn" element
     */
    int sizeOfQstnArray();
    
    /**
     * Sets array of all "qstn" element
     */
    void setQstnArray(edu.umich.icpsr.ddi.QstnType[] qstnArray);
    
    /**
     * Sets ith "qstn" element
     */
    void setQstnArray(int i, edu.umich.icpsr.ddi.QstnType qstn);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "qstn" element
     */
    edu.umich.icpsr.ddi.QstnType insertNewQstn(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "qstn" element
     */
    edu.umich.icpsr.ddi.QstnType addNewQstn();
    
    /**
     * Removes the ith "qstn" element
     */
    void removeQstn(int i);
    
    /**
     * Gets array of all "valrng" elements
     */
    edu.umich.icpsr.ddi.ValrngType[] getValrngArray();
    
    /**
     * Gets ith "valrng" element
     */
    edu.umich.icpsr.ddi.ValrngType getValrngArray(int i);
    
    /**
     * Returns number of "valrng" element
     */
    int sizeOfValrngArray();
    
    /**
     * Sets array of all "valrng" element
     */
    void setValrngArray(edu.umich.icpsr.ddi.ValrngType[] valrngArray);
    
    /**
     * Sets ith "valrng" element
     */
    void setValrngArray(int i, edu.umich.icpsr.ddi.ValrngType valrng);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "valrng" element
     */
    edu.umich.icpsr.ddi.ValrngType insertNewValrng(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "valrng" element
     */
    edu.umich.icpsr.ddi.ValrngType addNewValrng();
    
    /**
     * Removes the ith "valrng" element
     */
    void removeValrng(int i);
    
    /**
     * Gets array of all "invalrng" elements
     */
    edu.umich.icpsr.ddi.InvalrngType[] getInvalrngArray();
    
    /**
     * Gets ith "invalrng" element
     */
    edu.umich.icpsr.ddi.InvalrngType getInvalrngArray(int i);
    
    /**
     * Returns number of "invalrng" element
     */
    int sizeOfInvalrngArray();
    
    /**
     * Sets array of all "invalrng" element
     */
    void setInvalrngArray(edu.umich.icpsr.ddi.InvalrngType[] invalrngArray);
    
    /**
     * Sets ith "invalrng" element
     */
    void setInvalrngArray(int i, edu.umich.icpsr.ddi.InvalrngType invalrng);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "invalrng" element
     */
    edu.umich.icpsr.ddi.InvalrngType insertNewInvalrng(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "invalrng" element
     */
    edu.umich.icpsr.ddi.InvalrngType addNewInvalrng();
    
    /**
     * Removes the ith "invalrng" element
     */
    void removeInvalrng(int i);
    
    /**
     * Gets array of all "undocCod" elements
     */
    edu.umich.icpsr.ddi.UndocCodType[] getUndocCodArray();
    
    /**
     * Gets ith "undocCod" element
     */
    edu.umich.icpsr.ddi.UndocCodType getUndocCodArray(int i);
    
    /**
     * Returns number of "undocCod" element
     */
    int sizeOfUndocCodArray();
    
    /**
     * Sets array of all "undocCod" element
     */
    void setUndocCodArray(edu.umich.icpsr.ddi.UndocCodType[] undocCodArray);
    
    /**
     * Sets ith "undocCod" element
     */
    void setUndocCodArray(int i, edu.umich.icpsr.ddi.UndocCodType undocCod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "undocCod" element
     */
    edu.umich.icpsr.ddi.UndocCodType insertNewUndocCod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "undocCod" element
     */
    edu.umich.icpsr.ddi.UndocCodType addNewUndocCod();
    
    /**
     * Removes the ith "undocCod" element
     */
    void removeUndocCod(int i);
    
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
     * Gets the "TotlResp" element
     */
    edu.umich.icpsr.ddi.TotlRespType getTotlResp();
    
    /**
     * True if has "TotlResp" element
     */
    boolean isSetTotlResp();
    
    /**
     * Sets the "TotlResp" element
     */
    void setTotlResp(edu.umich.icpsr.ddi.TotlRespType totlResp);
    
    /**
     * Appends and returns a new empty "TotlResp" element
     */
    edu.umich.icpsr.ddi.TotlRespType addNewTotlResp();
    
    /**
     * Unsets the "TotlResp" element
     */
    void unsetTotlResp();
    
    /**
     * Gets array of all "sumStat" elements
     */
    edu.umich.icpsr.ddi.SumStatType[] getSumStatArray();
    
    /**
     * Gets ith "sumStat" element
     */
    edu.umich.icpsr.ddi.SumStatType getSumStatArray(int i);
    
    /**
     * Returns number of "sumStat" element
     */
    int sizeOfSumStatArray();
    
    /**
     * Sets array of all "sumStat" element
     */
    void setSumStatArray(edu.umich.icpsr.ddi.SumStatType[] sumStatArray);
    
    /**
     * Sets ith "sumStat" element
     */
    void setSumStatArray(int i, edu.umich.icpsr.ddi.SumStatType sumStat);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sumStat" element
     */
    edu.umich.icpsr.ddi.SumStatType insertNewSumStat(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sumStat" element
     */
    edu.umich.icpsr.ddi.SumStatType addNewSumStat();
    
    /**
     * Removes the ith "sumStat" element
     */
    void removeSumStat(int i);
    
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
     * Gets array of all "stdCatgry" elements
     */
    edu.umich.icpsr.ddi.StdCatgryType[] getStdCatgryArray();
    
    /**
     * Gets ith "stdCatgry" element
     */
    edu.umich.icpsr.ddi.StdCatgryType getStdCatgryArray(int i);
    
    /**
     * Returns number of "stdCatgry" element
     */
    int sizeOfStdCatgryArray();
    
    /**
     * Sets array of all "stdCatgry" element
     */
    void setStdCatgryArray(edu.umich.icpsr.ddi.StdCatgryType[] stdCatgryArray);
    
    /**
     * Sets ith "stdCatgry" element
     */
    void setStdCatgryArray(int i, edu.umich.icpsr.ddi.StdCatgryType stdCatgry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stdCatgry" element
     */
    edu.umich.icpsr.ddi.StdCatgryType insertNewStdCatgry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stdCatgry" element
     */
    edu.umich.icpsr.ddi.StdCatgryType addNewStdCatgry();
    
    /**
     * Removes the ith "stdCatgry" element
     */
    void removeStdCatgry(int i);
    
    /**
     * Gets array of all "catgryGrp" elements
     */
    edu.umich.icpsr.ddi.CatgryGrpType[] getCatgryGrpArray();
    
    /**
     * Gets ith "catgryGrp" element
     */
    edu.umich.icpsr.ddi.CatgryGrpType getCatgryGrpArray(int i);
    
    /**
     * Returns number of "catgryGrp" element
     */
    int sizeOfCatgryGrpArray();
    
    /**
     * Sets array of all "catgryGrp" element
     */
    void setCatgryGrpArray(edu.umich.icpsr.ddi.CatgryGrpType[] catgryGrpArray);
    
    /**
     * Sets ith "catgryGrp" element
     */
    void setCatgryGrpArray(int i, edu.umich.icpsr.ddi.CatgryGrpType catgryGrp);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "catgryGrp" element
     */
    edu.umich.icpsr.ddi.CatgryGrpType insertNewCatgryGrp(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "catgryGrp" element
     */
    edu.umich.icpsr.ddi.CatgryGrpType addNewCatgryGrp();
    
    /**
     * Removes the ith "catgryGrp" element
     */
    void removeCatgryGrp(int i);
    
    /**
     * Gets array of all "catgry" elements
     */
    edu.umich.icpsr.ddi.CatgryType[] getCatgryArray();
    
    /**
     * Gets ith "catgry" element
     */
    edu.umich.icpsr.ddi.CatgryType getCatgryArray(int i);
    
    /**
     * Returns number of "catgry" element
     */
    int sizeOfCatgryArray();
    
    /**
     * Sets array of all "catgry" element
     */
    void setCatgryArray(edu.umich.icpsr.ddi.CatgryType[] catgryArray);
    
    /**
     * Sets ith "catgry" element
     */
    void setCatgryArray(int i, edu.umich.icpsr.ddi.CatgryType catgry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "catgry" element
     */
    edu.umich.icpsr.ddi.CatgryType insertNewCatgry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "catgry" element
     */
    edu.umich.icpsr.ddi.CatgryType addNewCatgry();
    
    /**
     * Removes the ith "catgry" element
     */
    void removeCatgry(int i);
    
    /**
     * Gets array of all "codInstr" elements
     */
    edu.umich.icpsr.ddi.CodInstrType[] getCodInstrArray();
    
    /**
     * Gets ith "codInstr" element
     */
    edu.umich.icpsr.ddi.CodInstrType getCodInstrArray(int i);
    
    /**
     * Returns number of "codInstr" element
     */
    int sizeOfCodInstrArray();
    
    /**
     * Sets array of all "codInstr" element
     */
    void setCodInstrArray(edu.umich.icpsr.ddi.CodInstrType[] codInstrArray);
    
    /**
     * Sets ith "codInstr" element
     */
    void setCodInstrArray(int i, edu.umich.icpsr.ddi.CodInstrType codInstr);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "codInstr" element
     */
    edu.umich.icpsr.ddi.CodInstrType insertNewCodInstr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "codInstr" element
     */
    edu.umich.icpsr.ddi.CodInstrType addNewCodInstr();
    
    /**
     * Removes the ith "codInstr" element
     */
    void removeCodInstr(int i);
    
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
     * Gets the "derivation" element
     */
    edu.umich.icpsr.ddi.DerivationType getDerivation();
    
    /**
     * True if has "derivation" element
     */
    boolean isSetDerivation();
    
    /**
     * Sets the "derivation" element
     */
    void setDerivation(edu.umich.icpsr.ddi.DerivationType derivation);
    
    /**
     * Appends and returns a new empty "derivation" element
     */
    edu.umich.icpsr.ddi.DerivationType addNewDerivation();
    
    /**
     * Unsets the "derivation" element
     */
    void unsetDerivation();
    
    /**
     * Gets the "varFormat" element
     */
    edu.umich.icpsr.ddi.VarFormatType getVarFormat();
    
    /**
     * True if has "varFormat" element
     */
    boolean isSetVarFormat();
    
    /**
     * Sets the "varFormat" element
     */
    void setVarFormat(edu.umich.icpsr.ddi.VarFormatType varFormat);
    
    /**
     * Appends and returns a new empty "varFormat" element
     */
    edu.umich.icpsr.ddi.VarFormatType addNewVarFormat();
    
    /**
     * Unsets the "varFormat" element
     */
    void unsetVarFormat();
    
    /**
     * Gets array of all "geoMap" elements
     */
    edu.umich.icpsr.ddi.GeoMapType[] getGeoMapArray();
    
    /**
     * Gets ith "geoMap" element
     */
    edu.umich.icpsr.ddi.GeoMapType getGeoMapArray(int i);
    
    /**
     * Returns number of "geoMap" element
     */
    int sizeOfGeoMapArray();
    
    /**
     * Sets array of all "geoMap" element
     */
    void setGeoMapArray(edu.umich.icpsr.ddi.GeoMapType[] geoMapArray);
    
    /**
     * Sets ith "geoMap" element
     */
    void setGeoMapArray(int i, edu.umich.icpsr.ddi.GeoMapType geoMap);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoMap" element
     */
    edu.umich.icpsr.ddi.GeoMapType insertNewGeoMap(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geoMap" element
     */
    edu.umich.icpsr.ddi.GeoMapType addNewGeoMap();
    
    /**
     * Removes the ith "geoMap" element
     */
    void removeGeoMap(int i);
    
    /**
     * Gets array of all "catLevel" elements
     */
    edu.umich.icpsr.ddi.CatLevelType[] getCatLevelArray();
    
    /**
     * Gets ith "catLevel" element
     */
    edu.umich.icpsr.ddi.CatLevelType getCatLevelArray(int i);
    
    /**
     * Returns number of "catLevel" element
     */
    int sizeOfCatLevelArray();
    
    /**
     * Sets array of all "catLevel" element
     */
    void setCatLevelArray(edu.umich.icpsr.ddi.CatLevelType[] catLevelArray);
    
    /**
     * Sets ith "catLevel" element
     */
    void setCatLevelArray(int i, edu.umich.icpsr.ddi.CatLevelType catLevel);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "catLevel" element
     */
    edu.umich.icpsr.ddi.CatLevelType insertNewCatLevel(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "catLevel" element
     */
    edu.umich.icpsr.ddi.CatLevelType addNewCatLevel();
    
    /**
     * Removes the ith "catLevel" element
     */
    void removeCatLevel(int i);
    
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
    edu.umich.icpsr.ddi.VarType.Source.Enum getSource();
    
    /**
     * Gets (as xml) the "source" attribute
     */
    edu.umich.icpsr.ddi.VarType.Source xgetSource();
    
    /**
     * True if has "source" attribute
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" attribute
     */
    void setSource(edu.umich.icpsr.ddi.VarType.Source.Enum source);
    
    /**
     * Sets (as xml) the "source" attribute
     */
    void xsetSource(edu.umich.icpsr.ddi.VarType.Source source);
    
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
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "wgt" attribute
     */
    edu.umich.icpsr.ddi.VarType.Wgt.Enum getWgt();
    
    /**
     * Gets (as xml) the "wgt" attribute
     */
    edu.umich.icpsr.ddi.VarType.Wgt xgetWgt();
    
    /**
     * True if has "wgt" attribute
     */
    boolean isSetWgt();
    
    /**
     * Sets the "wgt" attribute
     */
    void setWgt(edu.umich.icpsr.ddi.VarType.Wgt.Enum wgt);
    
    /**
     * Sets (as xml) the "wgt" attribute
     */
    void xsetWgt(edu.umich.icpsr.ddi.VarType.Wgt wgt);
    
    /**
     * Unsets the "wgt" attribute
     */
    void unsetWgt();
    
    /**
     * Gets the "wgt-var" attribute
     */
    java.util.List getWgtVar();
    
    /**
     * Gets (as xml) the "wgt-var" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetWgtVar();
    
    /**
     * True if has "wgt-var" attribute
     */
    boolean isSetWgtVar();
    
    /**
     * Sets the "wgt-var" attribute
     */
    void setWgtVar(java.util.List wgtVar);
    
    /**
     * Sets (as xml) the "wgt-var" attribute
     */
    void xsetWgtVar(org.apache.xmlbeans.XmlIDREFS wgtVar);
    
    /**
     * Unsets the "wgt-var" attribute
     */
    void unsetWgtVar();
    
    /**
     * Gets the "weight" attribute
     */
    java.util.List getWeight();
    
    /**
     * Gets (as xml) the "weight" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetWeight();
    
    /**
     * True if has "weight" attribute
     */
    boolean isSetWeight();
    
    /**
     * Sets the "weight" attribute
     */
    void setWeight(java.util.List weight);
    
    /**
     * Sets (as xml) the "weight" attribute
     */
    void xsetWeight(org.apache.xmlbeans.XmlIDREFS weight);
    
    /**
     * Unsets the "weight" attribute
     */
    void unsetWeight();
    
    /**
     * Gets the "qstn" attribute
     */
    java.util.List getQstn2();
    
    /**
     * Gets (as xml) the "qstn" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetQstn2();
    
    /**
     * True if has "qstn" attribute
     */
    boolean isSetQstn2();
    
    /**
     * Sets the "qstn" attribute
     */
    void setQstn2(java.util.List qstn2);
    
    /**
     * Sets (as xml) the "qstn" attribute
     */
    void xsetQstn2(org.apache.xmlbeans.XmlIDREFS qstn2);
    
    /**
     * Unsets the "qstn" attribute
     */
    void unsetQstn2();
    
    /**
     * Gets the "files" attribute
     */
    java.util.List getFiles();
    
    /**
     * Gets (as xml) the "files" attribute
     */
    org.apache.xmlbeans.XmlIDREFS xgetFiles();
    
    /**
     * True if has "files" attribute
     */
    boolean isSetFiles();
    
    /**
     * Sets the "files" attribute
     */
    void setFiles(java.util.List files);
    
    /**
     * Sets (as xml) the "files" attribute
     */
    void xsetFiles(org.apache.xmlbeans.XmlIDREFS files);
    
    /**
     * Unsets the "files" attribute
     */
    void unsetFiles();
    
    /**
     * Gets the "vendor" attribute
     */
    java.lang.String getVendor();
    
    /**
     * Gets (as xml) the "vendor" attribute
     */
    org.apache.xmlbeans.XmlString xgetVendor();
    
    /**
     * True if has "vendor" attribute
     */
    boolean isSetVendor();
    
    /**
     * Sets the "vendor" attribute
     */
    void setVendor(java.lang.String vendor);
    
    /**
     * Sets (as xml) the "vendor" attribute
     */
    void xsetVendor(org.apache.xmlbeans.XmlString vendor);
    
    /**
     * Unsets the "vendor" attribute
     */
    void unsetVendor();
    
    /**
     * Gets the "dcml" attribute
     */
    java.lang.String getDcml();
    
    /**
     * Gets (as xml) the "dcml" attribute
     */
    org.apache.xmlbeans.XmlString xgetDcml();
    
    /**
     * True if has "dcml" attribute
     */
    boolean isSetDcml();
    
    /**
     * Sets the "dcml" attribute
     */
    void setDcml(java.lang.String dcml);
    
    /**
     * Sets (as xml) the "dcml" attribute
     */
    void xsetDcml(org.apache.xmlbeans.XmlString dcml);
    
    /**
     * Unsets the "dcml" attribute
     */
    void unsetDcml();
    
    /**
     * Gets the "intrvl" attribute
     */
    edu.umich.icpsr.ddi.VarType.Intrvl.Enum getIntrvl();
    
    /**
     * Gets (as xml) the "intrvl" attribute
     */
    edu.umich.icpsr.ddi.VarType.Intrvl xgetIntrvl();
    
    /**
     * True if has "intrvl" attribute
     */
    boolean isSetIntrvl();
    
    /**
     * Sets the "intrvl" attribute
     */
    void setIntrvl(edu.umich.icpsr.ddi.VarType.Intrvl.Enum intrvl);
    
    /**
     * Sets (as xml) the "intrvl" attribute
     */
    void xsetIntrvl(edu.umich.icpsr.ddi.VarType.Intrvl intrvl);
    
    /**
     * Unsets the "intrvl" attribute
     */
    void unsetIntrvl();
    
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
     * Gets the "aggrMeth" attribute
     */
    edu.umich.icpsr.ddi.VarType.AggrMeth.Enum getAggrMeth();
    
    /**
     * Gets (as xml) the "aggrMeth" attribute
     */
    edu.umich.icpsr.ddi.VarType.AggrMeth xgetAggrMeth();
    
    /**
     * True if has "aggrMeth" attribute
     */
    boolean isSetAggrMeth();
    
    /**
     * Sets the "aggrMeth" attribute
     */
    void setAggrMeth(edu.umich.icpsr.ddi.VarType.AggrMeth.Enum aggrMeth);
    
    /**
     * Sets (as xml) the "aggrMeth" attribute
     */
    void xsetAggrMeth(edu.umich.icpsr.ddi.VarType.AggrMeth aggrMeth);
    
    /**
     * Unsets the "aggrMeth" attribute
     */
    void unsetAggrMeth();
    
    /**
     * Gets the "measUnit" attribute
     */
    java.lang.String getMeasUnit();
    
    /**
     * Gets (as xml) the "measUnit" attribute
     */
    org.apache.xmlbeans.XmlString xgetMeasUnit();
    
    /**
     * True if has "measUnit" attribute
     */
    boolean isSetMeasUnit();
    
    /**
     * Sets the "measUnit" attribute
     */
    void setMeasUnit(java.lang.String measUnit);
    
    /**
     * Sets (as xml) the "measUnit" attribute
     */
    void xsetMeasUnit(org.apache.xmlbeans.XmlString measUnit);
    
    /**
     * Unsets the "measUnit" attribute
     */
    void unsetMeasUnit();
    
    /**
     * Gets the "scale" attribute
     */
    java.lang.String getScale();
    
    /**
     * Gets (as xml) the "scale" attribute
     */
    org.apache.xmlbeans.XmlString xgetScale();
    
    /**
     * True if has "scale" attribute
     */
    boolean isSetScale();
    
    /**
     * Sets the "scale" attribute
     */
    void setScale(java.lang.String scale);
    
    /**
     * Sets (as xml) the "scale" attribute
     */
    void xsetScale(org.apache.xmlbeans.XmlString scale);
    
    /**
     * Unsets the "scale" attribute
     */
    void unsetScale();
    
    /**
     * Gets the "origin" attribute
     */
    java.lang.String getOrigin();
    
    /**
     * Gets (as xml) the "origin" attribute
     */
    org.apache.xmlbeans.XmlString xgetOrigin();
    
    /**
     * True if has "origin" attribute
     */
    boolean isSetOrigin();
    
    /**
     * Sets the "origin" attribute
     */
    void setOrigin(java.lang.String origin);
    
    /**
     * Sets (as xml) the "origin" attribute
     */
    void xsetOrigin(org.apache.xmlbeans.XmlString origin);
    
    /**
     * Unsets the "origin" attribute
     */
    void unsetOrigin();
    
    /**
     * Gets the "nature" attribute
     */
    edu.umich.icpsr.ddi.VarType.Nature.Enum getNature();
    
    /**
     * Gets (as xml) the "nature" attribute
     */
    edu.umich.icpsr.ddi.VarType.Nature xgetNature();
    
    /**
     * True if has "nature" attribute
     */
    boolean isSetNature();
    
    /**
     * Sets the "nature" attribute
     */
    void setNature(edu.umich.icpsr.ddi.VarType.Nature.Enum nature);
    
    /**
     * Sets (as xml) the "nature" attribute
     */
    void xsetNature(edu.umich.icpsr.ddi.VarType.Nature nature);
    
    /**
     * Unsets the "nature" attribute
     */
    void unsetNature();
    
    /**
     * Gets the "additivity" attribute
     */
    edu.umich.icpsr.ddi.VarType.Additivity.Enum getAdditivity();
    
    /**
     * Gets (as xml) the "additivity" attribute
     */
    edu.umich.icpsr.ddi.VarType.Additivity xgetAdditivity();
    
    /**
     * True if has "additivity" attribute
     */
    boolean isSetAdditivity();
    
    /**
     * Sets the "additivity" attribute
     */
    void setAdditivity(edu.umich.icpsr.ddi.VarType.Additivity.Enum additivity);
    
    /**
     * Sets (as xml) the "additivity" attribute
     */
    void xsetAdditivity(edu.umich.icpsr.ddi.VarType.Additivity additivity);
    
    /**
     * Unsets the "additivity" attribute
     */
    void unsetAdditivity();
    
    /**
     * Gets the "temporal" attribute
     */
    edu.umich.icpsr.ddi.VarType.Temporal.Enum getTemporal();
    
    /**
     * Gets (as xml) the "temporal" attribute
     */
    edu.umich.icpsr.ddi.VarType.Temporal xgetTemporal();
    
    /**
     * True if has "temporal" attribute
     */
    boolean isSetTemporal();
    
    /**
     * Sets the "temporal" attribute
     */
    void setTemporal(edu.umich.icpsr.ddi.VarType.Temporal.Enum temporal);
    
    /**
     * Sets (as xml) the "temporal" attribute
     */
    void xsetTemporal(edu.umich.icpsr.ddi.VarType.Temporal temporal);
    
    /**
     * Unsets the "temporal" attribute
     */
    void unsetTemporal();
    
    /**
     * Gets the "geog" attribute
     */
    edu.umich.icpsr.ddi.VarType.Geog.Enum getGeog();
    
    /**
     * Gets (as xml) the "geog" attribute
     */
    edu.umich.icpsr.ddi.VarType.Geog xgetGeog();
    
    /**
     * True if has "geog" attribute
     */
    boolean isSetGeog();
    
    /**
     * Sets the "geog" attribute
     */
    void setGeog(edu.umich.icpsr.ddi.VarType.Geog.Enum geog);
    
    /**
     * Sets (as xml) the "geog" attribute
     */
    void xsetGeog(edu.umich.icpsr.ddi.VarType.Geog geog);
    
    /**
     * Unsets the "geog" attribute
     */
    void unsetGeog();
    
    /**
     * Gets the "geoVocab" attribute
     */
    java.lang.String getGeoVocab();
    
    /**
     * Gets (as xml) the "geoVocab" attribute
     */
    org.apache.xmlbeans.XmlString xgetGeoVocab();
    
    /**
     * True if has "geoVocab" attribute
     */
    boolean isSetGeoVocab();
    
    /**
     * Sets the "geoVocab" attribute
     */
    void setGeoVocab(java.lang.String geoVocab);
    
    /**
     * Sets (as xml) the "geoVocab" attribute
     */
    void xsetGeoVocab(org.apache.xmlbeans.XmlString geoVocab);
    
    /**
     * Unsets the "geoVocab" attribute
     */
    void unsetGeoVocab();
    
    /**
     * Gets the "catQnty" attribute
     */
    java.lang.String getCatQnty();
    
    /**
     * Gets (as xml) the "catQnty" attribute
     */
    org.apache.xmlbeans.XmlString xgetCatQnty();
    
    /**
     * True if has "catQnty" attribute
     */
    boolean isSetCatQnty();
    
    /**
     * Sets the "catQnty" attribute
     */
    void setCatQnty(java.lang.String catQnty);
    
    /**
     * Sets (as xml) the "catQnty" attribute
     */
    void xsetCatQnty(org.apache.xmlbeans.XmlString catQnty);
    
    /**
     * Unsets the "catQnty" attribute
     */
    void unsetCatQnty();
    
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$Source.
     */
    public interface Source extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("source9903attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ARCHIVE = Enum.forString("archive");
        static final Enum PRODUCER = Enum.forString("producer");
        
        static final int INT_ARCHIVE = Enum.INT_ARCHIVE;
        static final int INT_PRODUCER = Enum.INT_PRODUCER;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.VarType$Source.
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
            public static edu.umich.icpsr.ddi.VarType.Source newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.VarType.Source) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.VarType.Source newInstance() {
              return (edu.umich.icpsr.ddi.VarType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.VarType.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.VarType.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML wgt(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$Wgt.
     */
    public interface Wgt extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Wgt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("wgta552attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum WGT = Enum.forString("wgt");
        static final Enum NOT_WGT = Enum.forString("not-wgt");
        
        static final int INT_WGT = Enum.INT_WGT;
        static final int INT_NOT_WGT = Enum.INT_NOT_WGT;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.VarType$Wgt.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_WGT
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
            
            static final int INT_WGT = 1;
            static final int INT_NOT_WGT = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("wgt", INT_WGT),
                    new Enum("not-wgt", INT_NOT_WGT),
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
            public static edu.umich.icpsr.ddi.VarType.Wgt newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.VarType.Wgt) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.VarType.Wgt newInstance() {
              return (edu.umich.icpsr.ddi.VarType.Wgt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.VarType.Wgt newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.VarType.Wgt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML intrvl(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$Intrvl.
     */
    public interface Intrvl extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Intrvl.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("intrvl7685attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum CONTIN = Enum.forString("contin");
        static final Enum DISCRETE = Enum.forString("discrete");
        
        static final int INT_CONTIN = Enum.INT_CONTIN;
        static final int INT_DISCRETE = Enum.INT_DISCRETE;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.VarType$Intrvl.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_CONTIN
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
            
            static final int INT_CONTIN = 1;
            static final int INT_DISCRETE = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("contin", INT_CONTIN),
                    new Enum("discrete", INT_DISCRETE),
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
            public static edu.umich.icpsr.ddi.VarType.Intrvl newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.VarType.Intrvl) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.VarType.Intrvl newInstance() {
              return (edu.umich.icpsr.ddi.VarType.Intrvl) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.VarType.Intrvl newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.VarType.Intrvl) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML aggrMeth(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$AggrMeth.
     */
    public interface AggrMeth extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AggrMeth.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("aggrmetha521attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum SUM = Enum.forString("sum");
        static final Enum AVERAGE = Enum.forString("average");
        static final Enum COUNT = Enum.forString("count");
        static final Enum MODE = Enum.forString("mode");
        static final Enum MEDIAN = Enum.forString("median");
        static final Enum MAXIMUM = Enum.forString("maximum");
        static final Enum MINIMUM = Enum.forString("minimum");
        
        static final int INT_SUM = Enum.INT_SUM;
        static final int INT_AVERAGE = Enum.INT_AVERAGE;
        static final int INT_COUNT = Enum.INT_COUNT;
        static final int INT_MODE = Enum.INT_MODE;
        static final int INT_MEDIAN = Enum.INT_MEDIAN;
        static final int INT_MAXIMUM = Enum.INT_MAXIMUM;
        static final int INT_MINIMUM = Enum.INT_MINIMUM;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.VarType$AggrMeth.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_SUM
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
            
            static final int INT_SUM = 1;
            static final int INT_AVERAGE = 2;
            static final int INT_COUNT = 3;
            static final int INT_MODE = 4;
            static final int INT_MEDIAN = 5;
            static final int INT_MAXIMUM = 6;
            static final int INT_MINIMUM = 7;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("sum", INT_SUM),
                    new Enum("average", INT_AVERAGE),
                    new Enum("count", INT_COUNT),
                    new Enum("mode", INT_MODE),
                    new Enum("median", INT_MEDIAN),
                    new Enum("maximum", INT_MAXIMUM),
                    new Enum("minimum", INT_MINIMUM),
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
            public static edu.umich.icpsr.ddi.VarType.AggrMeth newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.VarType.AggrMeth) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.VarType.AggrMeth newInstance() {
              return (edu.umich.icpsr.ddi.VarType.AggrMeth) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.VarType.AggrMeth newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.VarType.AggrMeth) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML nature(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$Nature.
     */
    public interface Nature extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Nature.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("nature11f7attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum NOMINAL = Enum.forString("nominal");
        static final Enum ORDINAL = Enum.forString("ordinal");
        static final Enum INTERVAL = Enum.forString("interval");
        static final Enum RATIO = Enum.forString("ratio");
        
        static final int INT_NOMINAL = Enum.INT_NOMINAL;
        static final int INT_ORDINAL = Enum.INT_ORDINAL;
        static final int INT_INTERVAL = Enum.INT_INTERVAL;
        static final int INT_RATIO = Enum.INT_RATIO;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.VarType$Nature.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_NOMINAL
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
            
            static final int INT_NOMINAL = 1;
            static final int INT_ORDINAL = 2;
            static final int INT_INTERVAL = 3;
            static final int INT_RATIO = 4;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("nominal", INT_NOMINAL),
                    new Enum("ordinal", INT_ORDINAL),
                    new Enum("interval", INT_INTERVAL),
                    new Enum("ratio", INT_RATIO),
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
            public static edu.umich.icpsr.ddi.VarType.Nature newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.VarType.Nature) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.VarType.Nature newInstance() {
              return (edu.umich.icpsr.ddi.VarType.Nature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.VarType.Nature newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.VarType.Nature) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML additivity(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$Additivity.
     */
    public interface Additivity extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Additivity.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("additivitye209attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum STOCK = Enum.forString("stock");
        static final Enum FLOW = Enum.forString("flow");
        static final Enum NON_ADDITIVE = Enum.forString("non-additive");
        
        static final int INT_STOCK = Enum.INT_STOCK;
        static final int INT_FLOW = Enum.INT_FLOW;
        static final int INT_NON_ADDITIVE = Enum.INT_NON_ADDITIVE;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.VarType$Additivity.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_STOCK
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
            
            static final int INT_STOCK = 1;
            static final int INT_FLOW = 2;
            static final int INT_NON_ADDITIVE = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("stock", INT_STOCK),
                    new Enum("flow", INT_FLOW),
                    new Enum("non-additive", INT_NON_ADDITIVE),
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
            public static edu.umich.icpsr.ddi.VarType.Additivity newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.VarType.Additivity) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.VarType.Additivity newInstance() {
              return (edu.umich.icpsr.ddi.VarType.Additivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.VarType.Additivity newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.VarType.Additivity) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML temporal(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$Temporal.
     */
    public interface Temporal extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Temporal.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("temporal64dcattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum Y = Enum.forString("Y");
        static final Enum N = Enum.forString("N");
        
        static final int INT_Y = Enum.INT_Y;
        static final int INT_N = Enum.INT_N;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.VarType$Temporal.
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
            public static edu.umich.icpsr.ddi.VarType.Temporal newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.VarType.Temporal) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.VarType.Temporal newInstance() {
              return (edu.umich.icpsr.ddi.VarType.Temporal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.VarType.Temporal newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.VarType.Temporal) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML geog(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$Geog.
     */
    public interface Geog extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Geog.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("geog6948attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum Y = Enum.forString("Y");
        static final Enum N = Enum.forString("N");
        
        static final int INT_Y = Enum.INT_Y;
        static final int INT_N = Enum.INT_N;
        
        /**
         * Enumeration value class for edu.umich.icpsr.ddi.VarType$Geog.
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
            public static edu.umich.icpsr.ddi.VarType.Geog newValue(java.lang.Object obj) {
              return (edu.umich.icpsr.ddi.VarType.Geog) type.newValue( obj ); }
            
            public static edu.umich.icpsr.ddi.VarType.Geog newInstance() {
              return (edu.umich.icpsr.ddi.VarType.Geog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.VarType.Geog newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.VarType.Geog) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.VarType newInstance() {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.VarType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.VarType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.VarType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.VarType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.VarType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.VarType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.VarType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.VarType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.VarType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.VarType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.VarType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.VarType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.VarType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.VarType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.VarType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.VarType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.VarType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.VarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
