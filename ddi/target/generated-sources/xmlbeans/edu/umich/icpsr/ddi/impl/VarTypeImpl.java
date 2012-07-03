/*
 * XML Type:  varType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.VarType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML varType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class VarTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.VarType
{
    private static final long serialVersionUID = 1L;
    
    public VarTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "location");
    private static final javax.xml.namespace.QName LABL$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "labl");
    private static final javax.xml.namespace.QName IMPUTATION$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "imputation");
    private static final javax.xml.namespace.QName SECURITY$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "security");
    private static final javax.xml.namespace.QName EMBARGO$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "embargo");
    private static final javax.xml.namespace.QName RESPUNIT$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "respUnit");
    private static final javax.xml.namespace.QName ANLYSUNIT$12 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "anlysUnit");
    private static final javax.xml.namespace.QName QSTN$14 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "qstn");
    private static final javax.xml.namespace.QName VALRNG$16 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "valrng");
    private static final javax.xml.namespace.QName INVALRNG$18 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "invalrng");
    private static final javax.xml.namespace.QName UNDOCCOD$20 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "undocCod");
    private static final javax.xml.namespace.QName UNIVERSE$22 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "universe");
    private static final javax.xml.namespace.QName TOTLRESP$24 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "TotlResp");
    private static final javax.xml.namespace.QName SUMSTAT$26 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "sumStat");
    private static final javax.xml.namespace.QName TXT$28 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "txt");
    private static final javax.xml.namespace.QName STDCATGRY$30 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "stdCatgry");
    private static final javax.xml.namespace.QName CATGRYGRP$32 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "catgryGrp");
    private static final javax.xml.namespace.QName CATGRY$34 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "catgry");
    private static final javax.xml.namespace.QName CODINSTR$36 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "codInstr");
    private static final javax.xml.namespace.QName VERSTMT$38 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "verStmt");
    private static final javax.xml.namespace.QName CONCEPT$40 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "concept");
    private static final javax.xml.namespace.QName DERIVATION$42 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "derivation");
    private static final javax.xml.namespace.QName VARFORMAT$44 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "varFormat");
    private static final javax.xml.namespace.QName GEOMAP$46 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "geoMap");
    private static final javax.xml.namespace.QName CATLEVEL$48 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "catLevel");
    private static final javax.xml.namespace.QName NOTES$50 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "notes");
    private static final javax.xml.namespace.QName ID$52 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$54 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$56 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$58 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName NAME$60 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName WGT$62 = 
        new javax.xml.namespace.QName("", "wgt");
    private static final javax.xml.namespace.QName WGTVAR$64 = 
        new javax.xml.namespace.QName("", "wgt-var");
    private static final javax.xml.namespace.QName WEIGHT$66 = 
        new javax.xml.namespace.QName("", "weight");
    private static final javax.xml.namespace.QName QSTN2$68 = 
        new javax.xml.namespace.QName("", "qstn");
    private static final javax.xml.namespace.QName FILES$70 = 
        new javax.xml.namespace.QName("", "files");
    private static final javax.xml.namespace.QName VENDOR$72 = 
        new javax.xml.namespace.QName("", "vendor");
    private static final javax.xml.namespace.QName DCML$74 = 
        new javax.xml.namespace.QName("", "dcml");
    private static final javax.xml.namespace.QName INTRVL$76 = 
        new javax.xml.namespace.QName("", "intrvl");
    private static final javax.xml.namespace.QName RECTYPE$78 = 
        new javax.xml.namespace.QName("", "rectype");
    private static final javax.xml.namespace.QName SDATREFS$80 = 
        new javax.xml.namespace.QName("", "sdatrefs");
    private static final javax.xml.namespace.QName METHREFS$82 = 
        new javax.xml.namespace.QName("", "methrefs");
    private static final javax.xml.namespace.QName PUBREFS$84 = 
        new javax.xml.namespace.QName("", "pubrefs");
    private static final javax.xml.namespace.QName ACCESS$86 = 
        new javax.xml.namespace.QName("", "access");
    private static final javax.xml.namespace.QName AGGRMETH$88 = 
        new javax.xml.namespace.QName("", "aggrMeth");
    private static final javax.xml.namespace.QName MEASUNIT$90 = 
        new javax.xml.namespace.QName("", "measUnit");
    private static final javax.xml.namespace.QName SCALE$92 = 
        new javax.xml.namespace.QName("", "scale");
    private static final javax.xml.namespace.QName ORIGIN$94 = 
        new javax.xml.namespace.QName("", "origin");
    private static final javax.xml.namespace.QName NATURE$96 = 
        new javax.xml.namespace.QName("", "nature");
    private static final javax.xml.namespace.QName ADDITIVITY$98 = 
        new javax.xml.namespace.QName("", "additivity");
    private static final javax.xml.namespace.QName TEMPORAL$100 = 
        new javax.xml.namespace.QName("", "temporal");
    private static final javax.xml.namespace.QName GEOG$102 = 
        new javax.xml.namespace.QName("", "geog");
    private static final javax.xml.namespace.QName GEOVOCAB$104 = 
        new javax.xml.namespace.QName("", "geoVocab");
    private static final javax.xml.namespace.QName CATQNTY$106 = 
        new javax.xml.namespace.QName("", "catQnty");
    
    
    /**
     * Gets array of all "location" elements
     */
    public edu.umich.icpsr.ddi.LocationType[] getLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATION$0, targetList);
            edu.umich.icpsr.ddi.LocationType[] result = new edu.umich.icpsr.ddi.LocationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "location" element
     */
    public edu.umich.icpsr.ddi.LocationType getLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LocationType target = null;
            target = (edu.umich.icpsr.ddi.LocationType)get_store().find_element_user(LOCATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "location" element
     */
    public int sizeOfLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$0);
        }
    }
    
    /**
     * Sets array of all "location" element
     */
    public void setLocationArray(edu.umich.icpsr.ddi.LocationType[] locationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationArray, LOCATION$0);
        }
    }
    
    /**
     * Sets ith "location" element
     */
    public void setLocationArray(int i, edu.umich.icpsr.ddi.LocationType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LocationType target = null;
            target = (edu.umich.icpsr.ddi.LocationType)get_store().find_element_user(LOCATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(location);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "location" element
     */
    public edu.umich.icpsr.ddi.LocationType insertNewLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LocationType target = null;
            target = (edu.umich.icpsr.ddi.LocationType)get_store().insert_element_user(LOCATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    public edu.umich.icpsr.ddi.LocationType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LocationType target = null;
            target = (edu.umich.icpsr.ddi.LocationType)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "location" element
     */
    public void removeLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$0, i);
        }
    }
    
    /**
     * Gets array of all "labl" elements
     */
    public edu.umich.icpsr.ddi.LablType[] getLablArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LABL$2, targetList);
            edu.umich.icpsr.ddi.LablType[] result = new edu.umich.icpsr.ddi.LablType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "labl" element
     */
    public edu.umich.icpsr.ddi.LablType getLablArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LablType target = null;
            target = (edu.umich.icpsr.ddi.LablType)get_store().find_element_user(LABL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "labl" element
     */
    public int sizeOfLablArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LABL$2);
        }
    }
    
    /**
     * Sets array of all "labl" element
     */
    public void setLablArray(edu.umich.icpsr.ddi.LablType[] lablArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(lablArray, LABL$2);
        }
    }
    
    /**
     * Sets ith "labl" element
     */
    public void setLablArray(int i, edu.umich.icpsr.ddi.LablType labl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LablType target = null;
            target = (edu.umich.icpsr.ddi.LablType)get_store().find_element_user(LABL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(labl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "labl" element
     */
    public edu.umich.icpsr.ddi.LablType insertNewLabl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LablType target = null;
            target = (edu.umich.icpsr.ddi.LablType)get_store().insert_element_user(LABL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "labl" element
     */
    public edu.umich.icpsr.ddi.LablType addNewLabl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.LablType target = null;
            target = (edu.umich.icpsr.ddi.LablType)get_store().add_element_user(LABL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "labl" element
     */
    public void removeLabl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LABL$2, i);
        }
    }
    
    /**
     * Gets the "imputation" element
     */
    public edu.umich.icpsr.ddi.ImputationType getImputation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ImputationType target = null;
            target = (edu.umich.icpsr.ddi.ImputationType)get_store().find_element_user(IMPUTATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "imputation" element
     */
    public boolean isSetImputation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPUTATION$4) != 0;
        }
    }
    
    /**
     * Sets the "imputation" element
     */
    public void setImputation(edu.umich.icpsr.ddi.ImputationType imputation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ImputationType target = null;
            target = (edu.umich.icpsr.ddi.ImputationType)get_store().find_element_user(IMPUTATION$4, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.ImputationType)get_store().add_element_user(IMPUTATION$4);
            }
            target.set(imputation);
        }
    }
    
    /**
     * Appends and returns a new empty "imputation" element
     */
    public edu.umich.icpsr.ddi.ImputationType addNewImputation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ImputationType target = null;
            target = (edu.umich.icpsr.ddi.ImputationType)get_store().add_element_user(IMPUTATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "imputation" element
     */
    public void unsetImputation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPUTATION$4, 0);
        }
    }
    
    /**
     * Gets the "security" element
     */
    public edu.umich.icpsr.ddi.SecurityType getSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SecurityType target = null;
            target = (edu.umich.icpsr.ddi.SecurityType)get_store().find_element_user(SECURITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "security" element
     */
    public boolean isSetSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITY$6) != 0;
        }
    }
    
    /**
     * Sets the "security" element
     */
    public void setSecurity(edu.umich.icpsr.ddi.SecurityType security)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SecurityType target = null;
            target = (edu.umich.icpsr.ddi.SecurityType)get_store().find_element_user(SECURITY$6, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SecurityType)get_store().add_element_user(SECURITY$6);
            }
            target.set(security);
        }
    }
    
    /**
     * Appends and returns a new empty "security" element
     */
    public edu.umich.icpsr.ddi.SecurityType addNewSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SecurityType target = null;
            target = (edu.umich.icpsr.ddi.SecurityType)get_store().add_element_user(SECURITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "security" element
     */
    public void unsetSecurity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITY$6, 0);
        }
    }
    
    /**
     * Gets the "embargo" element
     */
    public edu.umich.icpsr.ddi.EmbargoType getEmbargo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EmbargoType target = null;
            target = (edu.umich.icpsr.ddi.EmbargoType)get_store().find_element_user(EMBARGO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "embargo" element
     */
    public boolean isSetEmbargo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMBARGO$8) != 0;
        }
    }
    
    /**
     * Sets the "embargo" element
     */
    public void setEmbargo(edu.umich.icpsr.ddi.EmbargoType embargo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EmbargoType target = null;
            target = (edu.umich.icpsr.ddi.EmbargoType)get_store().find_element_user(EMBARGO$8, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.EmbargoType)get_store().add_element_user(EMBARGO$8);
            }
            target.set(embargo);
        }
    }
    
    /**
     * Appends and returns a new empty "embargo" element
     */
    public edu.umich.icpsr.ddi.EmbargoType addNewEmbargo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.EmbargoType target = null;
            target = (edu.umich.icpsr.ddi.EmbargoType)get_store().add_element_user(EMBARGO$8);
            return target;
        }
    }
    
    /**
     * Unsets the "embargo" element
     */
    public void unsetEmbargo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMBARGO$8, 0);
        }
    }
    
    /**
     * Gets the "respUnit" element
     */
    public edu.umich.icpsr.ddi.RespUnitType getRespUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RespUnitType target = null;
            target = (edu.umich.icpsr.ddi.RespUnitType)get_store().find_element_user(RESPUNIT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "respUnit" element
     */
    public boolean isSetRespUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPUNIT$10) != 0;
        }
    }
    
    /**
     * Sets the "respUnit" element
     */
    public void setRespUnit(edu.umich.icpsr.ddi.RespUnitType respUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RespUnitType target = null;
            target = (edu.umich.icpsr.ddi.RespUnitType)get_store().find_element_user(RESPUNIT$10, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RespUnitType)get_store().add_element_user(RESPUNIT$10);
            }
            target.set(respUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "respUnit" element
     */
    public edu.umich.icpsr.ddi.RespUnitType addNewRespUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.RespUnitType target = null;
            target = (edu.umich.icpsr.ddi.RespUnitType)get_store().add_element_user(RESPUNIT$10);
            return target;
        }
    }
    
    /**
     * Unsets the "respUnit" element
     */
    public void unsetRespUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPUNIT$10, 0);
        }
    }
    
    /**
     * Gets the "anlysUnit" element
     */
    public edu.umich.icpsr.ddi.AnlysUnitType getAnlysUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AnlysUnitType target = null;
            target = (edu.umich.icpsr.ddi.AnlysUnitType)get_store().find_element_user(ANLYSUNIT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "anlysUnit" element
     */
    public boolean isSetAnlysUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANLYSUNIT$12) != 0;
        }
    }
    
    /**
     * Sets the "anlysUnit" element
     */
    public void setAnlysUnit(edu.umich.icpsr.ddi.AnlysUnitType anlysUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AnlysUnitType target = null;
            target = (edu.umich.icpsr.ddi.AnlysUnitType)get_store().find_element_user(ANLYSUNIT$12, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.AnlysUnitType)get_store().add_element_user(ANLYSUNIT$12);
            }
            target.set(anlysUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "anlysUnit" element
     */
    public edu.umich.icpsr.ddi.AnlysUnitType addNewAnlysUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AnlysUnitType target = null;
            target = (edu.umich.icpsr.ddi.AnlysUnitType)get_store().add_element_user(ANLYSUNIT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "anlysUnit" element
     */
    public void unsetAnlysUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANLYSUNIT$12, 0);
        }
    }
    
    /**
     * Gets array of all "qstn" elements
     */
    public edu.umich.icpsr.ddi.QstnType[] getQstnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QSTN$14, targetList);
            edu.umich.icpsr.ddi.QstnType[] result = new edu.umich.icpsr.ddi.QstnType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "qstn" element
     */
    public edu.umich.icpsr.ddi.QstnType getQstnArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.QstnType target = null;
            target = (edu.umich.icpsr.ddi.QstnType)get_store().find_element_user(QSTN$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "qstn" element
     */
    public int sizeOfQstnArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QSTN$14);
        }
    }
    
    /**
     * Sets array of all "qstn" element
     */
    public void setQstnArray(edu.umich.icpsr.ddi.QstnType[] qstnArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(qstnArray, QSTN$14);
        }
    }
    
    /**
     * Sets ith "qstn" element
     */
    public void setQstnArray(int i, edu.umich.icpsr.ddi.QstnType qstn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.QstnType target = null;
            target = (edu.umich.icpsr.ddi.QstnType)get_store().find_element_user(QSTN$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(qstn);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "qstn" element
     */
    public edu.umich.icpsr.ddi.QstnType insertNewQstn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.QstnType target = null;
            target = (edu.umich.icpsr.ddi.QstnType)get_store().insert_element_user(QSTN$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "qstn" element
     */
    public edu.umich.icpsr.ddi.QstnType addNewQstn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.QstnType target = null;
            target = (edu.umich.icpsr.ddi.QstnType)get_store().add_element_user(QSTN$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "qstn" element
     */
    public void removeQstn(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QSTN$14, i);
        }
    }
    
    /**
     * Gets array of all "valrng" elements
     */
    public edu.umich.icpsr.ddi.ValrngType[] getValrngArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALRNG$16, targetList);
            edu.umich.icpsr.ddi.ValrngType[] result = new edu.umich.icpsr.ddi.ValrngType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "valrng" element
     */
    public edu.umich.icpsr.ddi.ValrngType getValrngArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ValrngType target = null;
            target = (edu.umich.icpsr.ddi.ValrngType)get_store().find_element_user(VALRNG$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "valrng" element
     */
    public int sizeOfValrngArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALRNG$16);
        }
    }
    
    /**
     * Sets array of all "valrng" element
     */
    public void setValrngArray(edu.umich.icpsr.ddi.ValrngType[] valrngArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(valrngArray, VALRNG$16);
        }
    }
    
    /**
     * Sets ith "valrng" element
     */
    public void setValrngArray(int i, edu.umich.icpsr.ddi.ValrngType valrng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ValrngType target = null;
            target = (edu.umich.icpsr.ddi.ValrngType)get_store().find_element_user(VALRNG$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(valrng);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "valrng" element
     */
    public edu.umich.icpsr.ddi.ValrngType insertNewValrng(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ValrngType target = null;
            target = (edu.umich.icpsr.ddi.ValrngType)get_store().insert_element_user(VALRNG$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "valrng" element
     */
    public edu.umich.icpsr.ddi.ValrngType addNewValrng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ValrngType target = null;
            target = (edu.umich.icpsr.ddi.ValrngType)get_store().add_element_user(VALRNG$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "valrng" element
     */
    public void removeValrng(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALRNG$16, i);
        }
    }
    
    /**
     * Gets array of all "invalrng" elements
     */
    public edu.umich.icpsr.ddi.InvalrngType[] getInvalrngArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INVALRNG$18, targetList);
            edu.umich.icpsr.ddi.InvalrngType[] result = new edu.umich.icpsr.ddi.InvalrngType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "invalrng" element
     */
    public edu.umich.icpsr.ddi.InvalrngType getInvalrngArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.InvalrngType target = null;
            target = (edu.umich.icpsr.ddi.InvalrngType)get_store().find_element_user(INVALRNG$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "invalrng" element
     */
    public int sizeOfInvalrngArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVALRNG$18);
        }
    }
    
    /**
     * Sets array of all "invalrng" element
     */
    public void setInvalrngArray(edu.umich.icpsr.ddi.InvalrngType[] invalrngArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(invalrngArray, INVALRNG$18);
        }
    }
    
    /**
     * Sets ith "invalrng" element
     */
    public void setInvalrngArray(int i, edu.umich.icpsr.ddi.InvalrngType invalrng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.InvalrngType target = null;
            target = (edu.umich.icpsr.ddi.InvalrngType)get_store().find_element_user(INVALRNG$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(invalrng);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "invalrng" element
     */
    public edu.umich.icpsr.ddi.InvalrngType insertNewInvalrng(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.InvalrngType target = null;
            target = (edu.umich.icpsr.ddi.InvalrngType)get_store().insert_element_user(INVALRNG$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "invalrng" element
     */
    public edu.umich.icpsr.ddi.InvalrngType addNewInvalrng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.InvalrngType target = null;
            target = (edu.umich.icpsr.ddi.InvalrngType)get_store().add_element_user(INVALRNG$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "invalrng" element
     */
    public void removeInvalrng(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVALRNG$18, i);
        }
    }
    
    /**
     * Gets array of all "undocCod" elements
     */
    public edu.umich.icpsr.ddi.UndocCodType[] getUndocCodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNDOCCOD$20, targetList);
            edu.umich.icpsr.ddi.UndocCodType[] result = new edu.umich.icpsr.ddi.UndocCodType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "undocCod" element
     */
    public edu.umich.icpsr.ddi.UndocCodType getUndocCodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.UndocCodType target = null;
            target = (edu.umich.icpsr.ddi.UndocCodType)get_store().find_element_user(UNDOCCOD$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "undocCod" element
     */
    public int sizeOfUndocCodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNDOCCOD$20);
        }
    }
    
    /**
     * Sets array of all "undocCod" element
     */
    public void setUndocCodArray(edu.umich.icpsr.ddi.UndocCodType[] undocCodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(undocCodArray, UNDOCCOD$20);
        }
    }
    
    /**
     * Sets ith "undocCod" element
     */
    public void setUndocCodArray(int i, edu.umich.icpsr.ddi.UndocCodType undocCod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.UndocCodType target = null;
            target = (edu.umich.icpsr.ddi.UndocCodType)get_store().find_element_user(UNDOCCOD$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(undocCod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "undocCod" element
     */
    public edu.umich.icpsr.ddi.UndocCodType insertNewUndocCod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.UndocCodType target = null;
            target = (edu.umich.icpsr.ddi.UndocCodType)get_store().insert_element_user(UNDOCCOD$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "undocCod" element
     */
    public edu.umich.icpsr.ddi.UndocCodType addNewUndocCod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.UndocCodType target = null;
            target = (edu.umich.icpsr.ddi.UndocCodType)get_store().add_element_user(UNDOCCOD$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "undocCod" element
     */
    public void removeUndocCod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNDOCCOD$20, i);
        }
    }
    
    /**
     * Gets array of all "universe" elements
     */
    public edu.umich.icpsr.ddi.UniverseType[] getUniverseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNIVERSE$22, targetList);
            edu.umich.icpsr.ddi.UniverseType[] result = new edu.umich.icpsr.ddi.UniverseType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "universe" element
     */
    public edu.umich.icpsr.ddi.UniverseType getUniverseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.UniverseType target = null;
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().find_element_user(UNIVERSE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "universe" element
     */
    public int sizeOfUniverseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIVERSE$22);
        }
    }
    
    /**
     * Sets array of all "universe" element
     */
    public void setUniverseArray(edu.umich.icpsr.ddi.UniverseType[] universeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(universeArray, UNIVERSE$22);
        }
    }
    
    /**
     * Sets ith "universe" element
     */
    public void setUniverseArray(int i, edu.umich.icpsr.ddi.UniverseType universe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.UniverseType target = null;
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().find_element_user(UNIVERSE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(universe);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "universe" element
     */
    public edu.umich.icpsr.ddi.UniverseType insertNewUniverse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.UniverseType target = null;
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().insert_element_user(UNIVERSE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "universe" element
     */
    public edu.umich.icpsr.ddi.UniverseType addNewUniverse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.UniverseType target = null;
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().add_element_user(UNIVERSE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "universe" element
     */
    public void removeUniverse(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIVERSE$22, i);
        }
    }
    
    /**
     * Gets the "TotlResp" element
     */
    public edu.umich.icpsr.ddi.TotlRespType getTotlResp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TotlRespType target = null;
            target = (edu.umich.icpsr.ddi.TotlRespType)get_store().find_element_user(TOTLRESP$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TotlResp" element
     */
    public boolean isSetTotlResp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTLRESP$24) != 0;
        }
    }
    
    /**
     * Sets the "TotlResp" element
     */
    public void setTotlResp(edu.umich.icpsr.ddi.TotlRespType totlResp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TotlRespType target = null;
            target = (edu.umich.icpsr.ddi.TotlRespType)get_store().find_element_user(TOTLRESP$24, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.TotlRespType)get_store().add_element_user(TOTLRESP$24);
            }
            target.set(totlResp);
        }
    }
    
    /**
     * Appends and returns a new empty "TotlResp" element
     */
    public edu.umich.icpsr.ddi.TotlRespType addNewTotlResp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TotlRespType target = null;
            target = (edu.umich.icpsr.ddi.TotlRespType)get_store().add_element_user(TOTLRESP$24);
            return target;
        }
    }
    
    /**
     * Unsets the "TotlResp" element
     */
    public void unsetTotlResp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTLRESP$24, 0);
        }
    }
    
    /**
     * Gets array of all "sumStat" elements
     */
    public edu.umich.icpsr.ddi.SumStatType[] getSumStatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUMSTAT$26, targetList);
            edu.umich.icpsr.ddi.SumStatType[] result = new edu.umich.icpsr.ddi.SumStatType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sumStat" element
     */
    public edu.umich.icpsr.ddi.SumStatType getSumStatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SumStatType target = null;
            target = (edu.umich.icpsr.ddi.SumStatType)get_store().find_element_user(SUMSTAT$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sumStat" element
     */
    public int sizeOfSumStatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUMSTAT$26);
        }
    }
    
    /**
     * Sets array of all "sumStat" element
     */
    public void setSumStatArray(edu.umich.icpsr.ddi.SumStatType[] sumStatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sumStatArray, SUMSTAT$26);
        }
    }
    
    /**
     * Sets ith "sumStat" element
     */
    public void setSumStatArray(int i, edu.umich.icpsr.ddi.SumStatType sumStat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SumStatType target = null;
            target = (edu.umich.icpsr.ddi.SumStatType)get_store().find_element_user(SUMSTAT$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sumStat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sumStat" element
     */
    public edu.umich.icpsr.ddi.SumStatType insertNewSumStat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SumStatType target = null;
            target = (edu.umich.icpsr.ddi.SumStatType)get_store().insert_element_user(SUMSTAT$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sumStat" element
     */
    public edu.umich.icpsr.ddi.SumStatType addNewSumStat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SumStatType target = null;
            target = (edu.umich.icpsr.ddi.SumStatType)get_store().add_element_user(SUMSTAT$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "sumStat" element
     */
    public void removeSumStat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUMSTAT$26, i);
        }
    }
    
    /**
     * Gets array of all "txt" elements
     */
    public edu.umich.icpsr.ddi.TxtType[] getTxtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TXT$28, targetList);
            edu.umich.icpsr.ddi.TxtType[] result = new edu.umich.icpsr.ddi.TxtType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "txt" element
     */
    public edu.umich.icpsr.ddi.TxtType getTxtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TxtType target = null;
            target = (edu.umich.icpsr.ddi.TxtType)get_store().find_element_user(TXT$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "txt" element
     */
    public int sizeOfTxtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TXT$28);
        }
    }
    
    /**
     * Sets array of all "txt" element
     */
    public void setTxtArray(edu.umich.icpsr.ddi.TxtType[] txtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(txtArray, TXT$28);
        }
    }
    
    /**
     * Sets ith "txt" element
     */
    public void setTxtArray(int i, edu.umich.icpsr.ddi.TxtType txt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TxtType target = null;
            target = (edu.umich.icpsr.ddi.TxtType)get_store().find_element_user(TXT$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(txt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "txt" element
     */
    public edu.umich.icpsr.ddi.TxtType insertNewTxt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TxtType target = null;
            target = (edu.umich.icpsr.ddi.TxtType)get_store().insert_element_user(TXT$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "txt" element
     */
    public edu.umich.icpsr.ddi.TxtType addNewTxt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TxtType target = null;
            target = (edu.umich.icpsr.ddi.TxtType)get_store().add_element_user(TXT$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "txt" element
     */
    public void removeTxt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TXT$28, i);
        }
    }
    
    /**
     * Gets array of all "stdCatgry" elements
     */
    public edu.umich.icpsr.ddi.StdCatgryType[] getStdCatgryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STDCATGRY$30, targetList);
            edu.umich.icpsr.ddi.StdCatgryType[] result = new edu.umich.icpsr.ddi.StdCatgryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "stdCatgry" element
     */
    public edu.umich.icpsr.ddi.StdCatgryType getStdCatgryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.StdCatgryType target = null;
            target = (edu.umich.icpsr.ddi.StdCatgryType)get_store().find_element_user(STDCATGRY$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "stdCatgry" element
     */
    public int sizeOfStdCatgryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STDCATGRY$30);
        }
    }
    
    /**
     * Sets array of all "stdCatgry" element
     */
    public void setStdCatgryArray(edu.umich.icpsr.ddi.StdCatgryType[] stdCatgryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stdCatgryArray, STDCATGRY$30);
        }
    }
    
    /**
     * Sets ith "stdCatgry" element
     */
    public void setStdCatgryArray(int i, edu.umich.icpsr.ddi.StdCatgryType stdCatgry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.StdCatgryType target = null;
            target = (edu.umich.icpsr.ddi.StdCatgryType)get_store().find_element_user(STDCATGRY$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stdCatgry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "stdCatgry" element
     */
    public edu.umich.icpsr.ddi.StdCatgryType insertNewStdCatgry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.StdCatgryType target = null;
            target = (edu.umich.icpsr.ddi.StdCatgryType)get_store().insert_element_user(STDCATGRY$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "stdCatgry" element
     */
    public edu.umich.icpsr.ddi.StdCatgryType addNewStdCatgry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.StdCatgryType target = null;
            target = (edu.umich.icpsr.ddi.StdCatgryType)get_store().add_element_user(STDCATGRY$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "stdCatgry" element
     */
    public void removeStdCatgry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STDCATGRY$30, i);
        }
    }
    
    /**
     * Gets array of all "catgryGrp" elements
     */
    public edu.umich.icpsr.ddi.CatgryGrpType[] getCatgryGrpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATGRYGRP$32, targetList);
            edu.umich.icpsr.ddi.CatgryGrpType[] result = new edu.umich.icpsr.ddi.CatgryGrpType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "catgryGrp" element
     */
    public edu.umich.icpsr.ddi.CatgryGrpType getCatgryGrpArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryGrpType target = null;
            target = (edu.umich.icpsr.ddi.CatgryGrpType)get_store().find_element_user(CATGRYGRP$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "catgryGrp" element
     */
    public int sizeOfCatgryGrpArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATGRYGRP$32);
        }
    }
    
    /**
     * Sets array of all "catgryGrp" element
     */
    public void setCatgryGrpArray(edu.umich.icpsr.ddi.CatgryGrpType[] catgryGrpArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(catgryGrpArray, CATGRYGRP$32);
        }
    }
    
    /**
     * Sets ith "catgryGrp" element
     */
    public void setCatgryGrpArray(int i, edu.umich.icpsr.ddi.CatgryGrpType catgryGrp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryGrpType target = null;
            target = (edu.umich.icpsr.ddi.CatgryGrpType)get_store().find_element_user(CATGRYGRP$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(catgryGrp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "catgryGrp" element
     */
    public edu.umich.icpsr.ddi.CatgryGrpType insertNewCatgryGrp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryGrpType target = null;
            target = (edu.umich.icpsr.ddi.CatgryGrpType)get_store().insert_element_user(CATGRYGRP$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "catgryGrp" element
     */
    public edu.umich.icpsr.ddi.CatgryGrpType addNewCatgryGrp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryGrpType target = null;
            target = (edu.umich.icpsr.ddi.CatgryGrpType)get_store().add_element_user(CATGRYGRP$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "catgryGrp" element
     */
    public void removeCatgryGrp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATGRYGRP$32, i);
        }
    }
    
    /**
     * Gets array of all "catgry" elements
     */
    public edu.umich.icpsr.ddi.CatgryType[] getCatgryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATGRY$34, targetList);
            edu.umich.icpsr.ddi.CatgryType[] result = new edu.umich.icpsr.ddi.CatgryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "catgry" element
     */
    public edu.umich.icpsr.ddi.CatgryType getCatgryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryType target = null;
            target = (edu.umich.icpsr.ddi.CatgryType)get_store().find_element_user(CATGRY$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "catgry" element
     */
    public int sizeOfCatgryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATGRY$34);
        }
    }
    
    /**
     * Sets array of all "catgry" element
     */
    public void setCatgryArray(edu.umich.icpsr.ddi.CatgryType[] catgryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(catgryArray, CATGRY$34);
        }
    }
    
    /**
     * Sets ith "catgry" element
     */
    public void setCatgryArray(int i, edu.umich.icpsr.ddi.CatgryType catgry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryType target = null;
            target = (edu.umich.icpsr.ddi.CatgryType)get_store().find_element_user(CATGRY$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(catgry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "catgry" element
     */
    public edu.umich.icpsr.ddi.CatgryType insertNewCatgry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryType target = null;
            target = (edu.umich.icpsr.ddi.CatgryType)get_store().insert_element_user(CATGRY$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "catgry" element
     */
    public edu.umich.icpsr.ddi.CatgryType addNewCatgry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatgryType target = null;
            target = (edu.umich.icpsr.ddi.CatgryType)get_store().add_element_user(CATGRY$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "catgry" element
     */
    public void removeCatgry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATGRY$34, i);
        }
    }
    
    /**
     * Gets array of all "codInstr" elements
     */
    public edu.umich.icpsr.ddi.CodInstrType[] getCodInstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODINSTR$36, targetList);
            edu.umich.icpsr.ddi.CodInstrType[] result = new edu.umich.icpsr.ddi.CodInstrType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "codInstr" element
     */
    public edu.umich.icpsr.ddi.CodInstrType getCodInstrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CodInstrType target = null;
            target = (edu.umich.icpsr.ddi.CodInstrType)get_store().find_element_user(CODINSTR$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "codInstr" element
     */
    public int sizeOfCodInstrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODINSTR$36);
        }
    }
    
    /**
     * Sets array of all "codInstr" element
     */
    public void setCodInstrArray(edu.umich.icpsr.ddi.CodInstrType[] codInstrArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(codInstrArray, CODINSTR$36);
        }
    }
    
    /**
     * Sets ith "codInstr" element
     */
    public void setCodInstrArray(int i, edu.umich.icpsr.ddi.CodInstrType codInstr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CodInstrType target = null;
            target = (edu.umich.icpsr.ddi.CodInstrType)get_store().find_element_user(CODINSTR$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(codInstr);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "codInstr" element
     */
    public edu.umich.icpsr.ddi.CodInstrType insertNewCodInstr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CodInstrType target = null;
            target = (edu.umich.icpsr.ddi.CodInstrType)get_store().insert_element_user(CODINSTR$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "codInstr" element
     */
    public edu.umich.icpsr.ddi.CodInstrType addNewCodInstr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CodInstrType target = null;
            target = (edu.umich.icpsr.ddi.CodInstrType)get_store().add_element_user(CODINSTR$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "codInstr" element
     */
    public void removeCodInstr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODINSTR$36, i);
        }
    }
    
    /**
     * Gets array of all "verStmt" elements
     */
    public edu.umich.icpsr.ddi.VerStmtType[] getVerStmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VERSTMT$38, targetList);
            edu.umich.icpsr.ddi.VerStmtType[] result = new edu.umich.icpsr.ddi.VerStmtType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "verStmt" element
     */
    public edu.umich.icpsr.ddi.VerStmtType getVerStmtArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerStmtType target = null;
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().find_element_user(VERSTMT$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "verStmt" element
     */
    public int sizeOfVerStmtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSTMT$38);
        }
    }
    
    /**
     * Sets array of all "verStmt" element
     */
    public void setVerStmtArray(edu.umich.icpsr.ddi.VerStmtType[] verStmtArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(verStmtArray, VERSTMT$38);
        }
    }
    
    /**
     * Sets ith "verStmt" element
     */
    public void setVerStmtArray(int i, edu.umich.icpsr.ddi.VerStmtType verStmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerStmtType target = null;
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().find_element_user(VERSTMT$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(verStmt);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "verStmt" element
     */
    public edu.umich.icpsr.ddi.VerStmtType insertNewVerStmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerStmtType target = null;
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().insert_element_user(VERSTMT$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "verStmt" element
     */
    public edu.umich.icpsr.ddi.VerStmtType addNewVerStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerStmtType target = null;
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().add_element_user(VERSTMT$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "verStmt" element
     */
    public void removeVerStmt(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSTMT$38, i);
        }
    }
    
    /**
     * Gets array of all "concept" elements
     */
    public edu.umich.icpsr.ddi.ConceptType[] getConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONCEPT$40, targetList);
            edu.umich.icpsr.ddi.ConceptType[] result = new edu.umich.icpsr.ddi.ConceptType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "concept" element
     */
    public edu.umich.icpsr.ddi.ConceptType getConceptArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConceptType target = null;
            target = (edu.umich.icpsr.ddi.ConceptType)get_store().find_element_user(CONCEPT$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "concept" element
     */
    public int sizeOfConceptArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONCEPT$40);
        }
    }
    
    /**
     * Sets array of all "concept" element
     */
    public void setConceptArray(edu.umich.icpsr.ddi.ConceptType[] conceptArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conceptArray, CONCEPT$40);
        }
    }
    
    /**
     * Sets ith "concept" element
     */
    public void setConceptArray(int i, edu.umich.icpsr.ddi.ConceptType concept)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConceptType target = null;
            target = (edu.umich.icpsr.ddi.ConceptType)get_store().find_element_user(CONCEPT$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(concept);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "concept" element
     */
    public edu.umich.icpsr.ddi.ConceptType insertNewConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConceptType target = null;
            target = (edu.umich.icpsr.ddi.ConceptType)get_store().insert_element_user(CONCEPT$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "concept" element
     */
    public edu.umich.icpsr.ddi.ConceptType addNewConcept()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConceptType target = null;
            target = (edu.umich.icpsr.ddi.ConceptType)get_store().add_element_user(CONCEPT$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "concept" element
     */
    public void removeConcept(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONCEPT$40, i);
        }
    }
    
    /**
     * Gets the "derivation" element
     */
    public edu.umich.icpsr.ddi.DerivationType getDerivation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DerivationType target = null;
            target = (edu.umich.icpsr.ddi.DerivationType)get_store().find_element_user(DERIVATION$42, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "derivation" element
     */
    public boolean isSetDerivation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DERIVATION$42) != 0;
        }
    }
    
    /**
     * Sets the "derivation" element
     */
    public void setDerivation(edu.umich.icpsr.ddi.DerivationType derivation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DerivationType target = null;
            target = (edu.umich.icpsr.ddi.DerivationType)get_store().find_element_user(DERIVATION$42, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DerivationType)get_store().add_element_user(DERIVATION$42);
            }
            target.set(derivation);
        }
    }
    
    /**
     * Appends and returns a new empty "derivation" element
     */
    public edu.umich.icpsr.ddi.DerivationType addNewDerivation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DerivationType target = null;
            target = (edu.umich.icpsr.ddi.DerivationType)get_store().add_element_user(DERIVATION$42);
            return target;
        }
    }
    
    /**
     * Unsets the "derivation" element
     */
    public void unsetDerivation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DERIVATION$42, 0);
        }
    }
    
    /**
     * Gets the "varFormat" element
     */
    public edu.umich.icpsr.ddi.VarFormatType getVarFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarFormatType target = null;
            target = (edu.umich.icpsr.ddi.VarFormatType)get_store().find_element_user(VARFORMAT$44, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "varFormat" element
     */
    public boolean isSetVarFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARFORMAT$44) != 0;
        }
    }
    
    /**
     * Sets the "varFormat" element
     */
    public void setVarFormat(edu.umich.icpsr.ddi.VarFormatType varFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarFormatType target = null;
            target = (edu.umich.icpsr.ddi.VarFormatType)get_store().find_element_user(VARFORMAT$44, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarFormatType)get_store().add_element_user(VARFORMAT$44);
            }
            target.set(varFormat);
        }
    }
    
    /**
     * Appends and returns a new empty "varFormat" element
     */
    public edu.umich.icpsr.ddi.VarFormatType addNewVarFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarFormatType target = null;
            target = (edu.umich.icpsr.ddi.VarFormatType)get_store().add_element_user(VARFORMAT$44);
            return target;
        }
    }
    
    /**
     * Unsets the "varFormat" element
     */
    public void unsetVarFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARFORMAT$44, 0);
        }
    }
    
    /**
     * Gets array of all "geoMap" elements
     */
    public edu.umich.icpsr.ddi.GeoMapType[] getGeoMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOMAP$46, targetList);
            edu.umich.icpsr.ddi.GeoMapType[] result = new edu.umich.icpsr.ddi.GeoMapType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "geoMap" element
     */
    public edu.umich.icpsr.ddi.GeoMapType getGeoMapArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeoMapType target = null;
            target = (edu.umich.icpsr.ddi.GeoMapType)get_store().find_element_user(GEOMAP$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "geoMap" element
     */
    public int sizeOfGeoMapArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOMAP$46);
        }
    }
    
    /**
     * Sets array of all "geoMap" element
     */
    public void setGeoMapArray(edu.umich.icpsr.ddi.GeoMapType[] geoMapArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(geoMapArray, GEOMAP$46);
        }
    }
    
    /**
     * Sets ith "geoMap" element
     */
    public void setGeoMapArray(int i, edu.umich.icpsr.ddi.GeoMapType geoMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeoMapType target = null;
            target = (edu.umich.icpsr.ddi.GeoMapType)get_store().find_element_user(GEOMAP$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geoMap);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geoMap" element
     */
    public edu.umich.icpsr.ddi.GeoMapType insertNewGeoMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeoMapType target = null;
            target = (edu.umich.icpsr.ddi.GeoMapType)get_store().insert_element_user(GEOMAP$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geoMap" element
     */
    public edu.umich.icpsr.ddi.GeoMapType addNewGeoMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeoMapType target = null;
            target = (edu.umich.icpsr.ddi.GeoMapType)get_store().add_element_user(GEOMAP$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "geoMap" element
     */
    public void removeGeoMap(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOMAP$46, i);
        }
    }
    
    /**
     * Gets array of all "catLevel" elements
     */
    public edu.umich.icpsr.ddi.CatLevelType[] getCatLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATLEVEL$48, targetList);
            edu.umich.icpsr.ddi.CatLevelType[] result = new edu.umich.icpsr.ddi.CatLevelType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "catLevel" element
     */
    public edu.umich.icpsr.ddi.CatLevelType getCatLevelArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatLevelType target = null;
            target = (edu.umich.icpsr.ddi.CatLevelType)get_store().find_element_user(CATLEVEL$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "catLevel" element
     */
    public int sizeOfCatLevelArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATLEVEL$48);
        }
    }
    
    /**
     * Sets array of all "catLevel" element
     */
    public void setCatLevelArray(edu.umich.icpsr.ddi.CatLevelType[] catLevelArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(catLevelArray, CATLEVEL$48);
        }
    }
    
    /**
     * Sets ith "catLevel" element
     */
    public void setCatLevelArray(int i, edu.umich.icpsr.ddi.CatLevelType catLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatLevelType target = null;
            target = (edu.umich.icpsr.ddi.CatLevelType)get_store().find_element_user(CATLEVEL$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(catLevel);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "catLevel" element
     */
    public edu.umich.icpsr.ddi.CatLevelType insertNewCatLevel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatLevelType target = null;
            target = (edu.umich.icpsr.ddi.CatLevelType)get_store().insert_element_user(CATLEVEL$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "catLevel" element
     */
    public edu.umich.icpsr.ddi.CatLevelType addNewCatLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CatLevelType target = null;
            target = (edu.umich.icpsr.ddi.CatLevelType)get_store().add_element_user(CATLEVEL$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "catLevel" element
     */
    public void removeCatLevel(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATLEVEL$48, i);
        }
    }
    
    /**
     * Gets array of all "notes" elements
     */
    public edu.umich.icpsr.ddi.NotesType[] getNotesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NOTES$50, targetList);
            edu.umich.icpsr.ddi.NotesType[] result = new edu.umich.icpsr.ddi.NotesType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "notes" element
     */
    public edu.umich.icpsr.ddi.NotesType getNotesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NotesType target = null;
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "notes" element
     */
    public int sizeOfNotesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOTES$50);
        }
    }
    
    /**
     * Sets array of all "notes" element
     */
    public void setNotesArray(edu.umich.icpsr.ddi.NotesType[] notesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(notesArray, NOTES$50);
        }
    }
    
    /**
     * Sets ith "notes" element
     */
    public void setNotesArray(int i, edu.umich.icpsr.ddi.NotesType notes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NotesType target = null;
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(notes);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "notes" element
     */
    public edu.umich.icpsr.ddi.NotesType insertNewNotes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NotesType target = null;
            target = (edu.umich.icpsr.ddi.NotesType)get_store().insert_element_user(NOTES$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "notes" element
     */
    public edu.umich.icpsr.ddi.NotesType addNewNotes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NotesType target = null;
            target = (edu.umich.icpsr.ddi.NotesType)get_store().add_element_user(NOTES$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "notes" element
     */
    public void removeNotes(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOTES$50, i);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$52);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public org.apache.xmlbeans.XmlID xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$52);
            return target;
        }
    }
    
    /**
     * True if has "ID" attribute
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$52) != null;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$52);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$52);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$52);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" attribute
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$52);
        }
    }
    
    /**
     * Gets the "xml-lang" attribute
     */
    public java.lang.String getXmlLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$54);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "xml-lang" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetXmlLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$54);
            return target;
        }
    }
    
    /**
     * True if has "xml-lang" attribute
     */
    public boolean isSetXmlLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(XMLLANG$54) != null;
        }
    }
    
    /**
     * Sets the "xml-lang" attribute
     */
    public void setXmlLang(java.lang.String xmlLang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$54);
            }
            target.setStringValue(xmlLang);
        }
    }
    
    /**
     * Sets (as xml) the "xml-lang" attribute
     */
    public void xsetXmlLang(org.apache.xmlbeans.XmlNMTOKEN xmlLang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$54);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$54);
            }
            target.set(xmlLang);
        }
    }
    
    /**
     * Unsets the "xml-lang" attribute
     */
    public void unsetXmlLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(XMLLANG$54);
        }
    }
    
    /**
     * Gets the "lang" attribute
     */
    public java.lang.String getLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$56);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "lang" attribute
     */
    public org.apache.xmlbeans.XmlLanguage xgetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$56);
            return target;
        }
    }
    
    /**
     * True if has "lang" attribute
     */
    public boolean isSetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANG$56) != null;
        }
    }
    
    /**
     * Sets the "lang" attribute
     */
    public void setLang(java.lang.String lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$56);
            }
            target.setStringValue(lang);
        }
    }
    
    /**
     * Sets (as xml) the "lang" attribute
     */
    public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLanguage target = null;
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$56);
            }
            target.set(lang);
        }
    }
    
    /**
     * Unsets the "lang" attribute
     */
    public void unsetLang()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANG$56);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.VarType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$58);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.VarType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.VarType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.Source target = null;
            target = (edu.umich.icpsr.ddi.VarType.Source)get_store().find_attribute_user(SOURCE$58);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarType.Source)get_default_attribute_value(SOURCE$58);
            }
            return target;
        }
    }
    
    /**
     * True if has "source" attribute
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SOURCE$58) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.VarType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$58);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.VarType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.Source target = null;
            target = (edu.umich.icpsr.ddi.VarType.Source)get_store().find_attribute_user(SOURCE$58);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarType.Source)get_store().add_attribute_user(SOURCE$58);
            }
            target.set(source);
        }
    }
    
    /**
     * Unsets the "source" attribute
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SOURCE$58);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$60);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$60);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$60);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$60);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "wgt" attribute
     */
    public edu.umich.icpsr.ddi.VarType.Wgt.Enum getWgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WGT$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(WGT$62);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.VarType.Wgt.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "wgt" attribute
     */
    public edu.umich.icpsr.ddi.VarType.Wgt xgetWgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.Wgt target = null;
            target = (edu.umich.icpsr.ddi.VarType.Wgt)get_store().find_attribute_user(WGT$62);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarType.Wgt)get_default_attribute_value(WGT$62);
            }
            return target;
        }
    }
    
    /**
     * True if has "wgt" attribute
     */
    public boolean isSetWgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WGT$62) != null;
        }
    }
    
    /**
     * Sets the "wgt" attribute
     */
    public void setWgt(edu.umich.icpsr.ddi.VarType.Wgt.Enum wgt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WGT$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WGT$62);
            }
            target.setEnumValue(wgt);
        }
    }
    
    /**
     * Sets (as xml) the "wgt" attribute
     */
    public void xsetWgt(edu.umich.icpsr.ddi.VarType.Wgt wgt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.Wgt target = null;
            target = (edu.umich.icpsr.ddi.VarType.Wgt)get_store().find_attribute_user(WGT$62);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarType.Wgt)get_store().add_attribute_user(WGT$62);
            }
            target.set(wgt);
        }
    }
    
    /**
     * Unsets the "wgt" attribute
     */
    public void unsetWgt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WGT$62);
        }
    }
    
    /**
     * Gets the "wgt-var" attribute
     */
    public java.util.List getWgtVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WGTVAR$64);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "wgt-var" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetWgtVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(WGTVAR$64);
            return target;
        }
    }
    
    /**
     * True if has "wgt-var" attribute
     */
    public boolean isSetWgtVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WGTVAR$64) != null;
        }
    }
    
    /**
     * Sets the "wgt-var" attribute
     */
    public void setWgtVar(java.util.List wgtVar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WGTVAR$64);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WGTVAR$64);
            }
            target.setListValue(wgtVar);
        }
    }
    
    /**
     * Sets (as xml) the "wgt-var" attribute
     */
    public void xsetWgtVar(org.apache.xmlbeans.XmlIDREFS wgtVar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(WGTVAR$64);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(WGTVAR$64);
            }
            target.set(wgtVar);
        }
    }
    
    /**
     * Unsets the "wgt-var" attribute
     */
    public void unsetWgtVar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WGTVAR$64);
        }
    }
    
    /**
     * Gets the "weight" attribute
     */
    public java.util.List getWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEIGHT$66);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "weight" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(WEIGHT$66);
            return target;
        }
    }
    
    /**
     * True if has "weight" attribute
     */
    public boolean isSetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WEIGHT$66) != null;
        }
    }
    
    /**
     * Sets the "weight" attribute
     */
    public void setWeight(java.util.List weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WEIGHT$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WEIGHT$66);
            }
            target.setListValue(weight);
        }
    }
    
    /**
     * Sets (as xml) the "weight" attribute
     */
    public void xsetWeight(org.apache.xmlbeans.XmlIDREFS weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(WEIGHT$66);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(WEIGHT$66);
            }
            target.set(weight);
        }
    }
    
    /**
     * Unsets the "weight" attribute
     */
    public void unsetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WEIGHT$66);
        }
    }
    
    /**
     * Gets the "qstn" attribute
     */
    public java.util.List getQstn2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QSTN2$68);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "qstn" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetQstn2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(QSTN2$68);
            return target;
        }
    }
    
    /**
     * True if has "qstn" attribute
     */
    public boolean isSetQstn2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QSTN2$68) != null;
        }
    }
    
    /**
     * Sets the "qstn" attribute
     */
    public void setQstn2(java.util.List qstn2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QSTN2$68);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QSTN2$68);
            }
            target.setListValue(qstn2);
        }
    }
    
    /**
     * Sets (as xml) the "qstn" attribute
     */
    public void xsetQstn2(org.apache.xmlbeans.XmlIDREFS qstn2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(QSTN2$68);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(QSTN2$68);
            }
            target.set(qstn2);
        }
    }
    
    /**
     * Unsets the "qstn" attribute
     */
    public void unsetQstn2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QSTN2$68);
        }
    }
    
    /**
     * Gets the "files" attribute
     */
    public java.util.List getFiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILES$70);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "files" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetFiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(FILES$70);
            return target;
        }
    }
    
    /**
     * True if has "files" attribute
     */
    public boolean isSetFiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FILES$70) != null;
        }
    }
    
    /**
     * Sets the "files" attribute
     */
    public void setFiles(java.util.List files)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FILES$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FILES$70);
            }
            target.setListValue(files);
        }
    }
    
    /**
     * Sets (as xml) the "files" attribute
     */
    public void xsetFiles(org.apache.xmlbeans.XmlIDREFS files)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(FILES$70);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(FILES$70);
            }
            target.set(files);
        }
    }
    
    /**
     * Unsets the "files" attribute
     */
    public void unsetFiles()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FILES$70);
        }
    }
    
    /**
     * Gets the "vendor" attribute
     */
    public java.lang.String getVendor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VENDOR$72);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "vendor" attribute
     */
    public org.apache.xmlbeans.XmlString xgetVendor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VENDOR$72);
            return target;
        }
    }
    
    /**
     * True if has "vendor" attribute
     */
    public boolean isSetVendor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VENDOR$72) != null;
        }
    }
    
    /**
     * Sets the "vendor" attribute
     */
    public void setVendor(java.lang.String vendor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VENDOR$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VENDOR$72);
            }
            target.setStringValue(vendor);
        }
    }
    
    /**
     * Sets (as xml) the "vendor" attribute
     */
    public void xsetVendor(org.apache.xmlbeans.XmlString vendor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VENDOR$72);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VENDOR$72);
            }
            target.set(vendor);
        }
    }
    
    /**
     * Unsets the "vendor" attribute
     */
    public void unsetVendor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VENDOR$72);
        }
    }
    
    /**
     * Gets the "dcml" attribute
     */
    public java.lang.String getDcml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DCML$74);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dcml" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDcml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DCML$74);
            return target;
        }
    }
    
    /**
     * True if has "dcml" attribute
     */
    public boolean isSetDcml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DCML$74) != null;
        }
    }
    
    /**
     * Sets the "dcml" attribute
     */
    public void setDcml(java.lang.String dcml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DCML$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DCML$74);
            }
            target.setStringValue(dcml);
        }
    }
    
    /**
     * Sets (as xml) the "dcml" attribute
     */
    public void xsetDcml(org.apache.xmlbeans.XmlString dcml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DCML$74);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DCML$74);
            }
            target.set(dcml);
        }
    }
    
    /**
     * Unsets the "dcml" attribute
     */
    public void unsetDcml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DCML$74);
        }
    }
    
    /**
     * Gets the "intrvl" attribute
     */
    public edu.umich.icpsr.ddi.VarType.Intrvl.Enum getIntrvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTRVL$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTRVL$76);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.VarType.Intrvl.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "intrvl" attribute
     */
    public edu.umich.icpsr.ddi.VarType.Intrvl xgetIntrvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.Intrvl target = null;
            target = (edu.umich.icpsr.ddi.VarType.Intrvl)get_store().find_attribute_user(INTRVL$76);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarType.Intrvl)get_default_attribute_value(INTRVL$76);
            }
            return target;
        }
    }
    
    /**
     * True if has "intrvl" attribute
     */
    public boolean isSetIntrvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTRVL$76) != null;
        }
    }
    
    /**
     * Sets the "intrvl" attribute
     */
    public void setIntrvl(edu.umich.icpsr.ddi.VarType.Intrvl.Enum intrvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTRVL$76);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTRVL$76);
            }
            target.setEnumValue(intrvl);
        }
    }
    
    /**
     * Sets (as xml) the "intrvl" attribute
     */
    public void xsetIntrvl(edu.umich.icpsr.ddi.VarType.Intrvl intrvl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.Intrvl target = null;
            target = (edu.umich.icpsr.ddi.VarType.Intrvl)get_store().find_attribute_user(INTRVL$76);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarType.Intrvl)get_store().add_attribute_user(INTRVL$76);
            }
            target.set(intrvl);
        }
    }
    
    /**
     * Unsets the "intrvl" attribute
     */
    public void unsetIntrvl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTRVL$76);
        }
    }
    
    /**
     * Gets the "rectype" attribute
     */
    public java.lang.String getRectype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECTYPE$78);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rectype" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRectype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RECTYPE$78);
            return target;
        }
    }
    
    /**
     * True if has "rectype" attribute
     */
    public boolean isSetRectype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RECTYPE$78) != null;
        }
    }
    
    /**
     * Sets the "rectype" attribute
     */
    public void setRectype(java.lang.String rectype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RECTYPE$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RECTYPE$78);
            }
            target.setStringValue(rectype);
        }
    }
    
    /**
     * Sets (as xml) the "rectype" attribute
     */
    public void xsetRectype(org.apache.xmlbeans.XmlString rectype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RECTYPE$78);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RECTYPE$78);
            }
            target.set(rectype);
        }
    }
    
    /**
     * Unsets the "rectype" attribute
     */
    public void unsetRectype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RECTYPE$78);
        }
    }
    
    /**
     * Gets the "sdatrefs" attribute
     */
    public java.util.List getSdatrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SDATREFS$80);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "sdatrefs" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetSdatrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(SDATREFS$80);
            return target;
        }
    }
    
    /**
     * True if has "sdatrefs" attribute
     */
    public boolean isSetSdatrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SDATREFS$80) != null;
        }
    }
    
    /**
     * Sets the "sdatrefs" attribute
     */
    public void setSdatrefs(java.util.List sdatrefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SDATREFS$80);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SDATREFS$80);
            }
            target.setListValue(sdatrefs);
        }
    }
    
    /**
     * Sets (as xml) the "sdatrefs" attribute
     */
    public void xsetSdatrefs(org.apache.xmlbeans.XmlIDREFS sdatrefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(SDATREFS$80);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(SDATREFS$80);
            }
            target.set(sdatrefs);
        }
    }
    
    /**
     * Unsets the "sdatrefs" attribute
     */
    public void unsetSdatrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SDATREFS$80);
        }
    }
    
    /**
     * Gets the "methrefs" attribute
     */
    public java.util.List getMethrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHREFS$82);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "methrefs" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetMethrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(METHREFS$82);
            return target;
        }
    }
    
    /**
     * True if has "methrefs" attribute
     */
    public boolean isSetMethrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METHREFS$82) != null;
        }
    }
    
    /**
     * Sets the "methrefs" attribute
     */
    public void setMethrefs(java.util.List methrefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHREFS$82);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHREFS$82);
            }
            target.setListValue(methrefs);
        }
    }
    
    /**
     * Sets (as xml) the "methrefs" attribute
     */
    public void xsetMethrefs(org.apache.xmlbeans.XmlIDREFS methrefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(METHREFS$82);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(METHREFS$82);
            }
            target.set(methrefs);
        }
    }
    
    /**
     * Unsets the "methrefs" attribute
     */
    public void unsetMethrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METHREFS$82);
        }
    }
    
    /**
     * Gets the "pubrefs" attribute
     */
    public java.util.List getPubrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBREFS$84);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "pubrefs" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetPubrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(PUBREFS$84);
            return target;
        }
    }
    
    /**
     * True if has "pubrefs" attribute
     */
    public boolean isSetPubrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PUBREFS$84) != null;
        }
    }
    
    /**
     * Sets the "pubrefs" attribute
     */
    public void setPubrefs(java.util.List pubrefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBREFS$84);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBREFS$84);
            }
            target.setListValue(pubrefs);
        }
    }
    
    /**
     * Sets (as xml) the "pubrefs" attribute
     */
    public void xsetPubrefs(org.apache.xmlbeans.XmlIDREFS pubrefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(PUBREFS$84);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(PUBREFS$84);
            }
            target.set(pubrefs);
        }
    }
    
    /**
     * Unsets the "pubrefs" attribute
     */
    public void unsetPubrefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PUBREFS$84);
        }
    }
    
    /**
     * Gets the "access" attribute
     */
    public java.util.List getAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCESS$86);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "access" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(ACCESS$86);
            return target;
        }
    }
    
    /**
     * True if has "access" attribute
     */
    public boolean isSetAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACCESS$86) != null;
        }
    }
    
    /**
     * Sets the "access" attribute
     */
    public void setAccess(java.util.List access)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCESS$86);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCESS$86);
            }
            target.setListValue(access);
        }
    }
    
    /**
     * Sets (as xml) the "access" attribute
     */
    public void xsetAccess(org.apache.xmlbeans.XmlIDREFS access)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(ACCESS$86);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(ACCESS$86);
            }
            target.set(access);
        }
    }
    
    /**
     * Unsets the "access" attribute
     */
    public void unsetAccess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACCESS$86);
        }
    }
    
    /**
     * Gets the "aggrMeth" attribute
     */
    public edu.umich.icpsr.ddi.VarType.AggrMeth.Enum getAggrMeth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGRMETH$88);
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.VarType.AggrMeth.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "aggrMeth" attribute
     */
    public edu.umich.icpsr.ddi.VarType.AggrMeth xgetAggrMeth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.AggrMeth target = null;
            target = (edu.umich.icpsr.ddi.VarType.AggrMeth)get_store().find_attribute_user(AGGRMETH$88);
            return target;
        }
    }
    
    /**
     * True if has "aggrMeth" attribute
     */
    public boolean isSetAggrMeth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AGGRMETH$88) != null;
        }
    }
    
    /**
     * Sets the "aggrMeth" attribute
     */
    public void setAggrMeth(edu.umich.icpsr.ddi.VarType.AggrMeth.Enum aggrMeth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AGGRMETH$88);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AGGRMETH$88);
            }
            target.setEnumValue(aggrMeth);
        }
    }
    
    /**
     * Sets (as xml) the "aggrMeth" attribute
     */
    public void xsetAggrMeth(edu.umich.icpsr.ddi.VarType.AggrMeth aggrMeth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.AggrMeth target = null;
            target = (edu.umich.icpsr.ddi.VarType.AggrMeth)get_store().find_attribute_user(AGGRMETH$88);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarType.AggrMeth)get_store().add_attribute_user(AGGRMETH$88);
            }
            target.set(aggrMeth);
        }
    }
    
    /**
     * Unsets the "aggrMeth" attribute
     */
    public void unsetAggrMeth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AGGRMETH$88);
        }
    }
    
    /**
     * Gets the "measUnit" attribute
     */
    public java.lang.String getMeasUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASUNIT$90);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "measUnit" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMeasUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEASUNIT$90);
            return target;
        }
    }
    
    /**
     * True if has "measUnit" attribute
     */
    public boolean isSetMeasUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEASUNIT$90) != null;
        }
    }
    
    /**
     * Sets the "measUnit" attribute
     */
    public void setMeasUnit(java.lang.String measUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEASUNIT$90);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEASUNIT$90);
            }
            target.setStringValue(measUnit);
        }
    }
    
    /**
     * Sets (as xml) the "measUnit" attribute
     */
    public void xsetMeasUnit(org.apache.xmlbeans.XmlString measUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MEASUNIT$90);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MEASUNIT$90);
            }
            target.set(measUnit);
        }
    }
    
    /**
     * Unsets the "measUnit" attribute
     */
    public void unsetMeasUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEASUNIT$90);
        }
    }
    
    /**
     * Gets the "scale" attribute
     */
    public java.lang.String getScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALE$92);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scale" attribute
     */
    public org.apache.xmlbeans.XmlString xgetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCALE$92);
            return target;
        }
    }
    
    /**
     * True if has "scale" attribute
     */
    public boolean isSetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCALE$92) != null;
        }
    }
    
    /**
     * Sets the "scale" attribute
     */
    public void setScale(java.lang.String scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCALE$92);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCALE$92);
            }
            target.setStringValue(scale);
        }
    }
    
    /**
     * Sets (as xml) the "scale" attribute
     */
    public void xsetScale(org.apache.xmlbeans.XmlString scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCALE$92);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCALE$92);
            }
            target.set(scale);
        }
    }
    
    /**
     * Unsets the "scale" attribute
     */
    public void unsetScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCALE$92);
        }
    }
    
    /**
     * Gets the "origin" attribute
     */
    public java.lang.String getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGIN$94);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "origin" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIGIN$94);
            return target;
        }
    }
    
    /**
     * True if has "origin" attribute
     */
    public boolean isSetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIGIN$94) != null;
        }
    }
    
    /**
     * Sets the "origin" attribute
     */
    public void setOrigin(java.lang.String origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORIGIN$94);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORIGIN$94);
            }
            target.setStringValue(origin);
        }
    }
    
    /**
     * Sets (as xml) the "origin" attribute
     */
    public void xsetOrigin(org.apache.xmlbeans.XmlString origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ORIGIN$94);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ORIGIN$94);
            }
            target.set(origin);
        }
    }
    
    /**
     * Unsets the "origin" attribute
     */
    public void unsetOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIGIN$94);
        }
    }
    
    /**
     * Gets the "nature" attribute
     */
    public edu.umich.icpsr.ddi.VarType.Nature.Enum getNature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NATURE$96);
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.VarType.Nature.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "nature" attribute
     */
    public edu.umich.icpsr.ddi.VarType.Nature xgetNature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.Nature target = null;
            target = (edu.umich.icpsr.ddi.VarType.Nature)get_store().find_attribute_user(NATURE$96);
            return target;
        }
    }
    
    /**
     * True if has "nature" attribute
     */
    public boolean isSetNature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NATURE$96) != null;
        }
    }
    
    /**
     * Sets the "nature" attribute
     */
    public void setNature(edu.umich.icpsr.ddi.VarType.Nature.Enum nature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NATURE$96);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NATURE$96);
            }
            target.setEnumValue(nature);
        }
    }
    
    /**
     * Sets (as xml) the "nature" attribute
     */
    public void xsetNature(edu.umich.icpsr.ddi.VarType.Nature nature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.Nature target = null;
            target = (edu.umich.icpsr.ddi.VarType.Nature)get_store().find_attribute_user(NATURE$96);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarType.Nature)get_store().add_attribute_user(NATURE$96);
            }
            target.set(nature);
        }
    }
    
    /**
     * Unsets the "nature" attribute
     */
    public void unsetNature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NATURE$96);
        }
    }
    
    /**
     * Gets the "additivity" attribute
     */
    public edu.umich.icpsr.ddi.VarType.Additivity.Enum getAdditivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDITIVITY$98);
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.VarType.Additivity.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "additivity" attribute
     */
    public edu.umich.icpsr.ddi.VarType.Additivity xgetAdditivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.Additivity target = null;
            target = (edu.umich.icpsr.ddi.VarType.Additivity)get_store().find_attribute_user(ADDITIVITY$98);
            return target;
        }
    }
    
    /**
     * True if has "additivity" attribute
     */
    public boolean isSetAdditivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDITIVITY$98) != null;
        }
    }
    
    /**
     * Sets the "additivity" attribute
     */
    public void setAdditivity(edu.umich.icpsr.ddi.VarType.Additivity.Enum additivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDITIVITY$98);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDITIVITY$98);
            }
            target.setEnumValue(additivity);
        }
    }
    
    /**
     * Sets (as xml) the "additivity" attribute
     */
    public void xsetAdditivity(edu.umich.icpsr.ddi.VarType.Additivity additivity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.Additivity target = null;
            target = (edu.umich.icpsr.ddi.VarType.Additivity)get_store().find_attribute_user(ADDITIVITY$98);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarType.Additivity)get_store().add_attribute_user(ADDITIVITY$98);
            }
            target.set(additivity);
        }
    }
    
    /**
     * Unsets the "additivity" attribute
     */
    public void unsetAdditivity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDITIVITY$98);
        }
    }
    
    /**
     * Gets the "temporal" attribute
     */
    public edu.umich.icpsr.ddi.VarType.Temporal.Enum getTemporal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEMPORAL$100);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TEMPORAL$100);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.VarType.Temporal.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "temporal" attribute
     */
    public edu.umich.icpsr.ddi.VarType.Temporal xgetTemporal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.Temporal target = null;
            target = (edu.umich.icpsr.ddi.VarType.Temporal)get_store().find_attribute_user(TEMPORAL$100);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarType.Temporal)get_default_attribute_value(TEMPORAL$100);
            }
            return target;
        }
    }
    
    /**
     * True if has "temporal" attribute
     */
    public boolean isSetTemporal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TEMPORAL$100) != null;
        }
    }
    
    /**
     * Sets the "temporal" attribute
     */
    public void setTemporal(edu.umich.icpsr.ddi.VarType.Temporal.Enum temporal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TEMPORAL$100);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TEMPORAL$100);
            }
            target.setEnumValue(temporal);
        }
    }
    
    /**
     * Sets (as xml) the "temporal" attribute
     */
    public void xsetTemporal(edu.umich.icpsr.ddi.VarType.Temporal temporal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.Temporal target = null;
            target = (edu.umich.icpsr.ddi.VarType.Temporal)get_store().find_attribute_user(TEMPORAL$100);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarType.Temporal)get_store().add_attribute_user(TEMPORAL$100);
            }
            target.set(temporal);
        }
    }
    
    /**
     * Unsets the "temporal" attribute
     */
    public void unsetTemporal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TEMPORAL$100);
        }
    }
    
    /**
     * Gets the "geog" attribute
     */
    public edu.umich.icpsr.ddi.VarType.Geog.Enum getGeog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOG$102);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(GEOG$102);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.VarType.Geog.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "geog" attribute
     */
    public edu.umich.icpsr.ddi.VarType.Geog xgetGeog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.Geog target = null;
            target = (edu.umich.icpsr.ddi.VarType.Geog)get_store().find_attribute_user(GEOG$102);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarType.Geog)get_default_attribute_value(GEOG$102);
            }
            return target;
        }
    }
    
    /**
     * True if has "geog" attribute
     */
    public boolean isSetGeog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GEOG$102) != null;
        }
    }
    
    /**
     * Sets the "geog" attribute
     */
    public void setGeog(edu.umich.icpsr.ddi.VarType.Geog.Enum geog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOG$102);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GEOG$102);
            }
            target.setEnumValue(geog);
        }
    }
    
    /**
     * Sets (as xml) the "geog" attribute
     */
    public void xsetGeog(edu.umich.icpsr.ddi.VarType.Geog geog)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VarType.Geog target = null;
            target = (edu.umich.icpsr.ddi.VarType.Geog)get_store().find_attribute_user(GEOG$102);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VarType.Geog)get_store().add_attribute_user(GEOG$102);
            }
            target.set(geog);
        }
    }
    
    /**
     * Unsets the "geog" attribute
     */
    public void unsetGeog()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GEOG$102);
        }
    }
    
    /**
     * Gets the "geoVocab" attribute
     */
    public java.lang.String getGeoVocab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOVOCAB$104);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "geoVocab" attribute
     */
    public org.apache.xmlbeans.XmlString xgetGeoVocab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOVOCAB$104);
            return target;
        }
    }
    
    /**
     * True if has "geoVocab" attribute
     */
    public boolean isSetGeoVocab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GEOVOCAB$104) != null;
        }
    }
    
    /**
     * Sets the "geoVocab" attribute
     */
    public void setGeoVocab(java.lang.String geoVocab)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOVOCAB$104);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GEOVOCAB$104);
            }
            target.setStringValue(geoVocab);
        }
    }
    
    /**
     * Sets (as xml) the "geoVocab" attribute
     */
    public void xsetGeoVocab(org.apache.xmlbeans.XmlString geoVocab)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOVOCAB$104);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GEOVOCAB$104);
            }
            target.set(geoVocab);
        }
    }
    
    /**
     * Unsets the "geoVocab" attribute
     */
    public void unsetGeoVocab()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GEOVOCAB$104);
        }
    }
    
    /**
     * Gets the "catQnty" attribute
     */
    public java.lang.String getCatQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATQNTY$106);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "catQnty" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCatQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CATQNTY$106);
            return target;
        }
    }
    
    /**
     * True if has "catQnty" attribute
     */
    public boolean isSetCatQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CATQNTY$106) != null;
        }
    }
    
    /**
     * Sets the "catQnty" attribute
     */
    public void setCatQnty(java.lang.String catQnty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CATQNTY$106);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CATQNTY$106);
            }
            target.setStringValue(catQnty);
        }
    }
    
    /**
     * Sets (as xml) the "catQnty" attribute
     */
    public void xsetCatQnty(org.apache.xmlbeans.XmlString catQnty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CATQNTY$106);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CATQNTY$106);
            }
            target.set(catQnty);
        }
    }
    
    /**
     * Unsets the "catQnty" attribute
     */
    public void unsetCatQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CATQNTY$106);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.VarType.Source
    {
        private static final long serialVersionUID = 1L;
        
        public SourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SourceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML wgt(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$Wgt.
     */
    public static class WgtImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.VarType.Wgt
    {
        private static final long serialVersionUID = 1L;
        
        public WgtImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected WgtImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML intrvl(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$Intrvl.
     */
    public static class IntrvlImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.VarType.Intrvl
    {
        private static final long serialVersionUID = 1L;
        
        public IntrvlImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected IntrvlImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML aggrMeth(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$AggrMeth.
     */
    public static class AggrMethImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.VarType.AggrMeth
    {
        private static final long serialVersionUID = 1L;
        
        public AggrMethImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AggrMethImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML nature(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$Nature.
     */
    public static class NatureImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.VarType.Nature
    {
        private static final long serialVersionUID = 1L;
        
        public NatureImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NatureImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML additivity(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$Additivity.
     */
    public static class AdditivityImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.VarType.Additivity
    {
        private static final long serialVersionUID = 1L;
        
        public AdditivityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AdditivityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML temporal(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$Temporal.
     */
    public static class TemporalImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.VarType.Temporal
    {
        private static final long serialVersionUID = 1L;
        
        public TemporalImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TemporalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML geog(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.VarType$Geog.
     */
    public static class GeogImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.VarType.Geog
    {
        private static final long serialVersionUID = 1L;
        
        public GeogImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected GeogImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
