/*
 * XML Type:  nCubeType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.NCubeType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML nCubeType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class NCubeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.NCubeType
{
    private static final long serialVersionUID = 1L;
    
    public NCubeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "location");
    private static final javax.xml.namespace.QName LABL$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "labl");
    private static final javax.xml.namespace.QName TXT$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "txt");
    private static final javax.xml.namespace.QName UNIVERSE$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "universe");
    private static final javax.xml.namespace.QName IMPUTATION$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "imputation");
    private static final javax.xml.namespace.QName SECURITY$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "security");
    private static final javax.xml.namespace.QName EMBARGO$12 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "embargo");
    private static final javax.xml.namespace.QName RESPUNIT$14 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "respUnit");
    private static final javax.xml.namespace.QName ANLYSUNIT$16 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "anlysUnit");
    private static final javax.xml.namespace.QName VERSTMT$18 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "verStmt");
    private static final javax.xml.namespace.QName PURPOSE$20 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "purpose");
    private static final javax.xml.namespace.QName DMNS$22 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "dmns");
    private static final javax.xml.namespace.QName MEASURE$24 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "measure");
    private static final javax.xml.namespace.QName NOTES$26 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "notes");
    private static final javax.xml.namespace.QName ID$28 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$30 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$32 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$34 = 
        new javax.xml.namespace.QName("", "source");
    private static final javax.xml.namespace.QName NAME$36 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName SDATREFS$38 = 
        new javax.xml.namespace.QName("", "sdatrefs");
    private static final javax.xml.namespace.QName METHREFS$40 = 
        new javax.xml.namespace.QName("", "methrefs");
    private static final javax.xml.namespace.QName PUBREFS$42 = 
        new javax.xml.namespace.QName("", "pubrefs");
    private static final javax.xml.namespace.QName ACCESS$44 = 
        new javax.xml.namespace.QName("", "access");
    private static final javax.xml.namespace.QName DMNSQNTY$46 = 
        new javax.xml.namespace.QName("", "dmnsQnty");
    private static final javax.xml.namespace.QName CELLQNTY$48 = 
        new javax.xml.namespace.QName("", "cellQnty");
    
    
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
     * Gets array of all "txt" elements
     */
    public edu.umich.icpsr.ddi.TxtType[] getTxtArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TXT$4, targetList);
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
            target = (edu.umich.icpsr.ddi.TxtType)get_store().find_element_user(TXT$4, i);
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
            return get_store().count_elements(TXT$4);
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
            arraySetterHelper(txtArray, TXT$4);
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
            target = (edu.umich.icpsr.ddi.TxtType)get_store().find_element_user(TXT$4, i);
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
            target = (edu.umich.icpsr.ddi.TxtType)get_store().insert_element_user(TXT$4, i);
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
            target = (edu.umich.icpsr.ddi.TxtType)get_store().add_element_user(TXT$4);
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
            get_store().remove_element(TXT$4, i);
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
            get_store().find_all_element_users(UNIVERSE$6, targetList);
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
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().find_element_user(UNIVERSE$6, i);
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
            return get_store().count_elements(UNIVERSE$6);
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
            arraySetterHelper(universeArray, UNIVERSE$6);
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
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().find_element_user(UNIVERSE$6, i);
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
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().insert_element_user(UNIVERSE$6, i);
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
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().add_element_user(UNIVERSE$6);
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
            get_store().remove_element(UNIVERSE$6, i);
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
            target = (edu.umich.icpsr.ddi.ImputationType)get_store().find_element_user(IMPUTATION$8, 0);
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
            return get_store().count_elements(IMPUTATION$8) != 0;
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
            target = (edu.umich.icpsr.ddi.ImputationType)get_store().find_element_user(IMPUTATION$8, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.ImputationType)get_store().add_element_user(IMPUTATION$8);
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
            target = (edu.umich.icpsr.ddi.ImputationType)get_store().add_element_user(IMPUTATION$8);
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
            get_store().remove_element(IMPUTATION$8, 0);
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
            target = (edu.umich.icpsr.ddi.SecurityType)get_store().find_element_user(SECURITY$10, 0);
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
            return get_store().count_elements(SECURITY$10) != 0;
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
            target = (edu.umich.icpsr.ddi.SecurityType)get_store().find_element_user(SECURITY$10, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SecurityType)get_store().add_element_user(SECURITY$10);
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
            target = (edu.umich.icpsr.ddi.SecurityType)get_store().add_element_user(SECURITY$10);
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
            get_store().remove_element(SECURITY$10, 0);
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
            target = (edu.umich.icpsr.ddi.EmbargoType)get_store().find_element_user(EMBARGO$12, 0);
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
            return get_store().count_elements(EMBARGO$12) != 0;
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
            target = (edu.umich.icpsr.ddi.EmbargoType)get_store().find_element_user(EMBARGO$12, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.EmbargoType)get_store().add_element_user(EMBARGO$12);
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
            target = (edu.umich.icpsr.ddi.EmbargoType)get_store().add_element_user(EMBARGO$12);
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
            get_store().remove_element(EMBARGO$12, 0);
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
            target = (edu.umich.icpsr.ddi.RespUnitType)get_store().find_element_user(RESPUNIT$14, 0);
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
            return get_store().count_elements(RESPUNIT$14) != 0;
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
            target = (edu.umich.icpsr.ddi.RespUnitType)get_store().find_element_user(RESPUNIT$14, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.RespUnitType)get_store().add_element_user(RESPUNIT$14);
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
            target = (edu.umich.icpsr.ddi.RespUnitType)get_store().add_element_user(RESPUNIT$14);
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
            get_store().remove_element(RESPUNIT$14, 0);
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
            target = (edu.umich.icpsr.ddi.AnlysUnitType)get_store().find_element_user(ANLYSUNIT$16, 0);
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
            return get_store().count_elements(ANLYSUNIT$16) != 0;
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
            target = (edu.umich.icpsr.ddi.AnlysUnitType)get_store().find_element_user(ANLYSUNIT$16, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.AnlysUnitType)get_store().add_element_user(ANLYSUNIT$16);
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
            target = (edu.umich.icpsr.ddi.AnlysUnitType)get_store().add_element_user(ANLYSUNIT$16);
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
            get_store().remove_element(ANLYSUNIT$16, 0);
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
            get_store().find_all_element_users(VERSTMT$18, targetList);
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
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().find_element_user(VERSTMT$18, i);
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
            return get_store().count_elements(VERSTMT$18);
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
            arraySetterHelper(verStmtArray, VERSTMT$18);
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
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().find_element_user(VERSTMT$18, i);
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
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().insert_element_user(VERSTMT$18, i);
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
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().add_element_user(VERSTMT$18);
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
            get_store().remove_element(VERSTMT$18, i);
        }
    }
    
    /**
     * Gets the "purpose" element
     */
    public edu.umich.icpsr.ddi.PurposeType getPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PurposeType target = null;
            target = (edu.umich.icpsr.ddi.PurposeType)get_store().find_element_user(PURPOSE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "purpose" element
     */
    public boolean isSetPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PURPOSE$20) != 0;
        }
    }
    
    /**
     * Sets the "purpose" element
     */
    public void setPurpose(edu.umich.icpsr.ddi.PurposeType purpose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PurposeType target = null;
            target = (edu.umich.icpsr.ddi.PurposeType)get_store().find_element_user(PURPOSE$20, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.PurposeType)get_store().add_element_user(PURPOSE$20);
            }
            target.set(purpose);
        }
    }
    
    /**
     * Appends and returns a new empty "purpose" element
     */
    public edu.umich.icpsr.ddi.PurposeType addNewPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.PurposeType target = null;
            target = (edu.umich.icpsr.ddi.PurposeType)get_store().add_element_user(PURPOSE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "purpose" element
     */
    public void unsetPurpose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PURPOSE$20, 0);
        }
    }
    
    /**
     * Gets array of all "dmns" elements
     */
    public edu.umich.icpsr.ddi.DmnsType[] getDmnsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DMNS$22, targetList);
            edu.umich.icpsr.ddi.DmnsType[] result = new edu.umich.icpsr.ddi.DmnsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dmns" element
     */
    public edu.umich.icpsr.ddi.DmnsType getDmnsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DmnsType target = null;
            target = (edu.umich.icpsr.ddi.DmnsType)get_store().find_element_user(DMNS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dmns" element
     */
    public int sizeOfDmnsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DMNS$22);
        }
    }
    
    /**
     * Sets array of all "dmns" element
     */
    public void setDmnsArray(edu.umich.icpsr.ddi.DmnsType[] dmnsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dmnsArray, DMNS$22);
        }
    }
    
    /**
     * Sets ith "dmns" element
     */
    public void setDmnsArray(int i, edu.umich.icpsr.ddi.DmnsType dmns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DmnsType target = null;
            target = (edu.umich.icpsr.ddi.DmnsType)get_store().find_element_user(DMNS$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dmns);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dmns" element
     */
    public edu.umich.icpsr.ddi.DmnsType insertNewDmns(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DmnsType target = null;
            target = (edu.umich.icpsr.ddi.DmnsType)get_store().insert_element_user(DMNS$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dmns" element
     */
    public edu.umich.icpsr.ddi.DmnsType addNewDmns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DmnsType target = null;
            target = (edu.umich.icpsr.ddi.DmnsType)get_store().add_element_user(DMNS$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "dmns" element
     */
    public void removeDmns(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DMNS$22, i);
        }
    }
    
    /**
     * Gets array of all "measure" elements
     */
    public edu.umich.icpsr.ddi.MeasureType[] getMeasureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEASURE$24, targetList);
            edu.umich.icpsr.ddi.MeasureType[] result = new edu.umich.icpsr.ddi.MeasureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "measure" element
     */
    public edu.umich.icpsr.ddi.MeasureType getMeasureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MeasureType target = null;
            target = (edu.umich.icpsr.ddi.MeasureType)get_store().find_element_user(MEASURE$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "measure" element
     */
    public int sizeOfMeasureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASURE$24);
        }
    }
    
    /**
     * Sets array of all "measure" element
     */
    public void setMeasureArray(edu.umich.icpsr.ddi.MeasureType[] measureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(measureArray, MEASURE$24);
        }
    }
    
    /**
     * Sets ith "measure" element
     */
    public void setMeasureArray(int i, edu.umich.icpsr.ddi.MeasureType measure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MeasureType target = null;
            target = (edu.umich.icpsr.ddi.MeasureType)get_store().find_element_user(MEASURE$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(measure);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "measure" element
     */
    public edu.umich.icpsr.ddi.MeasureType insertNewMeasure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MeasureType target = null;
            target = (edu.umich.icpsr.ddi.MeasureType)get_store().insert_element_user(MEASURE$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "measure" element
     */
    public edu.umich.icpsr.ddi.MeasureType addNewMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.MeasureType target = null;
            target = (edu.umich.icpsr.ddi.MeasureType)get_store().add_element_user(MEASURE$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "measure" element
     */
    public void removeMeasure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASURE$24, i);
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
            get_store().find_all_element_users(NOTES$26, targetList);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$26, i);
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
            return get_store().count_elements(NOTES$26);
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
            arraySetterHelper(notesArray, NOTES$26);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().find_element_user(NOTES$26, i);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().insert_element_user(NOTES$26, i);
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
            target = (edu.umich.icpsr.ddi.NotesType)get_store().add_element_user(NOTES$26);
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
            get_store().remove_element(NOTES$26, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$28);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$28);
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
            return get_store().find_attribute_user(ID$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$28);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$28);
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
            get_store().remove_attribute(ID$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$30);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$30);
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
            return get_store().find_attribute_user(XMLLANG$30) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$30);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$30);
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
            get_store().remove_attribute(XMLLANG$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$32);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$32);
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
            return get_store().find_attribute_user(LANG$32) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$32);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$32);
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
            get_store().remove_attribute(LANG$32);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.NCubeType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$34);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.NCubeType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.NCubeType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NCubeType.Source target = null;
            target = (edu.umich.icpsr.ddi.NCubeType.Source)get_store().find_attribute_user(SOURCE$34);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.NCubeType.Source)get_default_attribute_value(SOURCE$34);
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
            return get_store().find_attribute_user(SOURCE$34) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.NCubeType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$34);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.NCubeType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NCubeType.Source target = null;
            target = (edu.umich.icpsr.ddi.NCubeType.Source)get_store().find_attribute_user(SOURCE$34);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.NCubeType.Source)get_store().add_attribute_user(SOURCE$34);
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
            get_store().remove_attribute(SOURCE$34);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$36);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$36);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$36) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$36);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$36);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$36);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SDATREFS$38);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(SDATREFS$38);
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
            return get_store().find_attribute_user(SDATREFS$38) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SDATREFS$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SDATREFS$38);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(SDATREFS$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(SDATREFS$38);
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
            get_store().remove_attribute(SDATREFS$38);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHREFS$40);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(METHREFS$40);
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
            return get_store().find_attribute_user(METHREFS$40) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METHREFS$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METHREFS$40);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(METHREFS$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(METHREFS$40);
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
            get_store().remove_attribute(METHREFS$40);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBREFS$42);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(PUBREFS$42);
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
            return get_store().find_attribute_user(PUBREFS$42) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PUBREFS$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PUBREFS$42);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(PUBREFS$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(PUBREFS$42);
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
            get_store().remove_attribute(PUBREFS$42);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCESS$44);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(ACCESS$44);
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
            return get_store().find_attribute_user(ACCESS$44) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACCESS$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACCESS$44);
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
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(ACCESS$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(ACCESS$44);
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
            get_store().remove_attribute(ACCESS$44);
        }
    }
    
    /**
     * Gets the "dmnsQnty" attribute
     */
    public java.lang.String getDmnsQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DMNSQNTY$46);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dmnsQnty" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDmnsQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DMNSQNTY$46);
            return target;
        }
    }
    
    /**
     * True if has "dmnsQnty" attribute
     */
    public boolean isSetDmnsQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DMNSQNTY$46) != null;
        }
    }
    
    /**
     * Sets the "dmnsQnty" attribute
     */
    public void setDmnsQnty(java.lang.String dmnsQnty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DMNSQNTY$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DMNSQNTY$46);
            }
            target.setStringValue(dmnsQnty);
        }
    }
    
    /**
     * Sets (as xml) the "dmnsQnty" attribute
     */
    public void xsetDmnsQnty(org.apache.xmlbeans.XmlString dmnsQnty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DMNSQNTY$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DMNSQNTY$46);
            }
            target.set(dmnsQnty);
        }
    }
    
    /**
     * Unsets the "dmnsQnty" attribute
     */
    public void unsetDmnsQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DMNSQNTY$46);
        }
    }
    
    /**
     * Gets the "cellQnty" attribute
     */
    public java.lang.String getCellQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLQNTY$48);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cellQnty" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCellQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CELLQNTY$48);
            return target;
        }
    }
    
    /**
     * True if has "cellQnty" attribute
     */
    public boolean isSetCellQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CELLQNTY$48) != null;
        }
    }
    
    /**
     * Sets the "cellQnty" attribute
     */
    public void setCellQnty(java.lang.String cellQnty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLQNTY$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CELLQNTY$48);
            }
            target.setStringValue(cellQnty);
        }
    }
    
    /**
     * Sets (as xml) the "cellQnty" attribute
     */
    public void xsetCellQnty(org.apache.xmlbeans.XmlString cellQnty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CELLQNTY$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CELLQNTY$48);
            }
            target.set(cellQnty);
        }
    }
    
    /**
     * Unsets the "cellQnty" attribute
     */
    public void unsetCellQnty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CELLQNTY$48);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.NCubeType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.NCubeType.Source
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
}
