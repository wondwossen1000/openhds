/*
 * XML Type:  sumDscrType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.SumDscrType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML sumDscrType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class SumDscrTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.SumDscrType
{
    private static final long serialVersionUID = 1L;
    
    public SumDscrTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEPRD$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "timePrd");
    private static final javax.xml.namespace.QName COLLDATE$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "collDate");
    private static final javax.xml.namespace.QName NATION$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "nation");
    private static final javax.xml.namespace.QName GEOGCOVER$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "geogCover");
    private static final javax.xml.namespace.QName GEOGUNIT$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "geogUnit");
    private static final javax.xml.namespace.QName GEOBNDBOX$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "geoBndBox");
    private static final javax.xml.namespace.QName BOUNDPOLY$12 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "boundPoly");
    private static final javax.xml.namespace.QName ANLYUNIT$14 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "anlyUnit");
    private static final javax.xml.namespace.QName UNIVERSE$16 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "universe");
    private static final javax.xml.namespace.QName DATAKIND$18 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "dataKind");
    private static final javax.xml.namespace.QName ID$20 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$22 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$24 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$26 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets array of all "timePrd" elements
     */
    public edu.umich.icpsr.ddi.TimePrdType[] getTimePrdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIMEPRD$0, targetList);
            edu.umich.icpsr.ddi.TimePrdType[] result = new edu.umich.icpsr.ddi.TimePrdType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "timePrd" element
     */
    public edu.umich.icpsr.ddi.TimePrdType getTimePrdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TimePrdType target = null;
            target = (edu.umich.icpsr.ddi.TimePrdType)get_store().find_element_user(TIMEPRD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "timePrd" element
     */
    public int sizeOfTimePrdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEPRD$0);
        }
    }
    
    /**
     * Sets array of all "timePrd" element
     */
    public void setTimePrdArray(edu.umich.icpsr.ddi.TimePrdType[] timePrdArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(timePrdArray, TIMEPRD$0);
        }
    }
    
    /**
     * Sets ith "timePrd" element
     */
    public void setTimePrdArray(int i, edu.umich.icpsr.ddi.TimePrdType timePrd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TimePrdType target = null;
            target = (edu.umich.icpsr.ddi.TimePrdType)get_store().find_element_user(TIMEPRD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(timePrd);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "timePrd" element
     */
    public edu.umich.icpsr.ddi.TimePrdType insertNewTimePrd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TimePrdType target = null;
            target = (edu.umich.icpsr.ddi.TimePrdType)get_store().insert_element_user(TIMEPRD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "timePrd" element
     */
    public edu.umich.icpsr.ddi.TimePrdType addNewTimePrd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TimePrdType target = null;
            target = (edu.umich.icpsr.ddi.TimePrdType)get_store().add_element_user(TIMEPRD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "timePrd" element
     */
    public void removeTimePrd(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEPRD$0, i);
        }
    }
    
    /**
     * Gets array of all "collDate" elements
     */
    public edu.umich.icpsr.ddi.CollDateType[] getCollDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLLDATE$2, targetList);
            edu.umich.icpsr.ddi.CollDateType[] result = new edu.umich.icpsr.ddi.CollDateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "collDate" element
     */
    public edu.umich.icpsr.ddi.CollDateType getCollDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollDateType target = null;
            target = (edu.umich.icpsr.ddi.CollDateType)get_store().find_element_user(COLLDATE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "collDate" element
     */
    public int sizeOfCollDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLLDATE$2);
        }
    }
    
    /**
     * Sets array of all "collDate" element
     */
    public void setCollDateArray(edu.umich.icpsr.ddi.CollDateType[] collDateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(collDateArray, COLLDATE$2);
        }
    }
    
    /**
     * Sets ith "collDate" element
     */
    public void setCollDateArray(int i, edu.umich.icpsr.ddi.CollDateType collDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollDateType target = null;
            target = (edu.umich.icpsr.ddi.CollDateType)get_store().find_element_user(COLLDATE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(collDate);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "collDate" element
     */
    public edu.umich.icpsr.ddi.CollDateType insertNewCollDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollDateType target = null;
            target = (edu.umich.icpsr.ddi.CollDateType)get_store().insert_element_user(COLLDATE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "collDate" element
     */
    public edu.umich.icpsr.ddi.CollDateType addNewCollDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollDateType target = null;
            target = (edu.umich.icpsr.ddi.CollDateType)get_store().add_element_user(COLLDATE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "collDate" element
     */
    public void removeCollDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLLDATE$2, i);
        }
    }
    
    /**
     * Gets array of all "nation" elements
     */
    public edu.umich.icpsr.ddi.NationType[] getNationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NATION$4, targetList);
            edu.umich.icpsr.ddi.NationType[] result = new edu.umich.icpsr.ddi.NationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "nation" element
     */
    public edu.umich.icpsr.ddi.NationType getNationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NationType target = null;
            target = (edu.umich.icpsr.ddi.NationType)get_store().find_element_user(NATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "nation" element
     */
    public int sizeOfNationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NATION$4);
        }
    }
    
    /**
     * Sets array of all "nation" element
     */
    public void setNationArray(edu.umich.icpsr.ddi.NationType[] nationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(nationArray, NATION$4);
        }
    }
    
    /**
     * Sets ith "nation" element
     */
    public void setNationArray(int i, edu.umich.icpsr.ddi.NationType nation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NationType target = null;
            target = (edu.umich.icpsr.ddi.NationType)get_store().find_element_user(NATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(nation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "nation" element
     */
    public edu.umich.icpsr.ddi.NationType insertNewNation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NationType target = null;
            target = (edu.umich.icpsr.ddi.NationType)get_store().insert_element_user(NATION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "nation" element
     */
    public edu.umich.icpsr.ddi.NationType addNewNation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.NationType target = null;
            target = (edu.umich.icpsr.ddi.NationType)get_store().add_element_user(NATION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "nation" element
     */
    public void removeNation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NATION$4, i);
        }
    }
    
    /**
     * Gets array of all "geogCover" elements
     */
    public edu.umich.icpsr.ddi.GeogCoverType[] getGeogCoverArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOGCOVER$6, targetList);
            edu.umich.icpsr.ddi.GeogCoverType[] result = new edu.umich.icpsr.ddi.GeogCoverType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "geogCover" element
     */
    public edu.umich.icpsr.ddi.GeogCoverType getGeogCoverArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeogCoverType target = null;
            target = (edu.umich.icpsr.ddi.GeogCoverType)get_store().find_element_user(GEOGCOVER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "geogCover" element
     */
    public int sizeOfGeogCoverArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOGCOVER$6);
        }
    }
    
    /**
     * Sets array of all "geogCover" element
     */
    public void setGeogCoverArray(edu.umich.icpsr.ddi.GeogCoverType[] geogCoverArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(geogCoverArray, GEOGCOVER$6);
        }
    }
    
    /**
     * Sets ith "geogCover" element
     */
    public void setGeogCoverArray(int i, edu.umich.icpsr.ddi.GeogCoverType geogCover)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeogCoverType target = null;
            target = (edu.umich.icpsr.ddi.GeogCoverType)get_store().find_element_user(GEOGCOVER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geogCover);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geogCover" element
     */
    public edu.umich.icpsr.ddi.GeogCoverType insertNewGeogCover(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeogCoverType target = null;
            target = (edu.umich.icpsr.ddi.GeogCoverType)get_store().insert_element_user(GEOGCOVER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geogCover" element
     */
    public edu.umich.icpsr.ddi.GeogCoverType addNewGeogCover()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeogCoverType target = null;
            target = (edu.umich.icpsr.ddi.GeogCoverType)get_store().add_element_user(GEOGCOVER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "geogCover" element
     */
    public void removeGeogCover(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOGCOVER$6, i);
        }
    }
    
    /**
     * Gets array of all "geogUnit" elements
     */
    public edu.umich.icpsr.ddi.GeogUnitType[] getGeogUnitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOGUNIT$8, targetList);
            edu.umich.icpsr.ddi.GeogUnitType[] result = new edu.umich.icpsr.ddi.GeogUnitType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "geogUnit" element
     */
    public edu.umich.icpsr.ddi.GeogUnitType getGeogUnitArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeogUnitType target = null;
            target = (edu.umich.icpsr.ddi.GeogUnitType)get_store().find_element_user(GEOGUNIT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "geogUnit" element
     */
    public int sizeOfGeogUnitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOGUNIT$8);
        }
    }
    
    /**
     * Sets array of all "geogUnit" element
     */
    public void setGeogUnitArray(edu.umich.icpsr.ddi.GeogUnitType[] geogUnitArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(geogUnitArray, GEOGUNIT$8);
        }
    }
    
    /**
     * Sets ith "geogUnit" element
     */
    public void setGeogUnitArray(int i, edu.umich.icpsr.ddi.GeogUnitType geogUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeogUnitType target = null;
            target = (edu.umich.icpsr.ddi.GeogUnitType)get_store().find_element_user(GEOGUNIT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geogUnit);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geogUnit" element
     */
    public edu.umich.icpsr.ddi.GeogUnitType insertNewGeogUnit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeogUnitType target = null;
            target = (edu.umich.icpsr.ddi.GeogUnitType)get_store().insert_element_user(GEOGUNIT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geogUnit" element
     */
    public edu.umich.icpsr.ddi.GeogUnitType addNewGeogUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeogUnitType target = null;
            target = (edu.umich.icpsr.ddi.GeogUnitType)get_store().add_element_user(GEOGUNIT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "geogUnit" element
     */
    public void removeGeogUnit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOGUNIT$8, i);
        }
    }
    
    /**
     * Gets the "geoBndBox" element
     */
    public edu.umich.icpsr.ddi.GeoBndBoxType getGeoBndBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeoBndBoxType target = null;
            target = (edu.umich.icpsr.ddi.GeoBndBoxType)get_store().find_element_user(GEOBNDBOX$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "geoBndBox" element
     */
    public boolean isSetGeoBndBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOBNDBOX$10) != 0;
        }
    }
    
    /**
     * Sets the "geoBndBox" element
     */
    public void setGeoBndBox(edu.umich.icpsr.ddi.GeoBndBoxType geoBndBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeoBndBoxType target = null;
            target = (edu.umich.icpsr.ddi.GeoBndBoxType)get_store().find_element_user(GEOBNDBOX$10, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.GeoBndBoxType)get_store().add_element_user(GEOBNDBOX$10);
            }
            target.set(geoBndBox);
        }
    }
    
    /**
     * Appends and returns a new empty "geoBndBox" element
     */
    public edu.umich.icpsr.ddi.GeoBndBoxType addNewGeoBndBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.GeoBndBoxType target = null;
            target = (edu.umich.icpsr.ddi.GeoBndBoxType)get_store().add_element_user(GEOBNDBOX$10);
            return target;
        }
    }
    
    /**
     * Unsets the "geoBndBox" element
     */
    public void unsetGeoBndBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOBNDBOX$10, 0);
        }
    }
    
    /**
     * Gets the "boundPoly" element
     */
    public edu.umich.icpsr.ddi.BoundPolyType getBoundPoly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.BoundPolyType target = null;
            target = (edu.umich.icpsr.ddi.BoundPolyType)get_store().find_element_user(BOUNDPOLY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "boundPoly" element
     */
    public boolean isSetBoundPoly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOUNDPOLY$12) != 0;
        }
    }
    
    /**
     * Sets the "boundPoly" element
     */
    public void setBoundPoly(edu.umich.icpsr.ddi.BoundPolyType boundPoly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.BoundPolyType target = null;
            target = (edu.umich.icpsr.ddi.BoundPolyType)get_store().find_element_user(BOUNDPOLY$12, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.BoundPolyType)get_store().add_element_user(BOUNDPOLY$12);
            }
            target.set(boundPoly);
        }
    }
    
    /**
     * Appends and returns a new empty "boundPoly" element
     */
    public edu.umich.icpsr.ddi.BoundPolyType addNewBoundPoly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.BoundPolyType target = null;
            target = (edu.umich.icpsr.ddi.BoundPolyType)get_store().add_element_user(BOUNDPOLY$12);
            return target;
        }
    }
    
    /**
     * Unsets the "boundPoly" element
     */
    public void unsetBoundPoly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOUNDPOLY$12, 0);
        }
    }
    
    /**
     * Gets array of all "anlyUnit" elements
     */
    public edu.umich.icpsr.ddi.AnlyUnitType[] getAnlyUnitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANLYUNIT$14, targetList);
            edu.umich.icpsr.ddi.AnlyUnitType[] result = new edu.umich.icpsr.ddi.AnlyUnitType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "anlyUnit" element
     */
    public edu.umich.icpsr.ddi.AnlyUnitType getAnlyUnitArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AnlyUnitType target = null;
            target = (edu.umich.icpsr.ddi.AnlyUnitType)get_store().find_element_user(ANLYUNIT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "anlyUnit" element
     */
    public int sizeOfAnlyUnitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANLYUNIT$14);
        }
    }
    
    /**
     * Sets array of all "anlyUnit" element
     */
    public void setAnlyUnitArray(edu.umich.icpsr.ddi.AnlyUnitType[] anlyUnitArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(anlyUnitArray, ANLYUNIT$14);
        }
    }
    
    /**
     * Sets ith "anlyUnit" element
     */
    public void setAnlyUnitArray(int i, edu.umich.icpsr.ddi.AnlyUnitType anlyUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AnlyUnitType target = null;
            target = (edu.umich.icpsr.ddi.AnlyUnitType)get_store().find_element_user(ANLYUNIT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(anlyUnit);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "anlyUnit" element
     */
    public edu.umich.icpsr.ddi.AnlyUnitType insertNewAnlyUnit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AnlyUnitType target = null;
            target = (edu.umich.icpsr.ddi.AnlyUnitType)get_store().insert_element_user(ANLYUNIT$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "anlyUnit" element
     */
    public edu.umich.icpsr.ddi.AnlyUnitType addNewAnlyUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.AnlyUnitType target = null;
            target = (edu.umich.icpsr.ddi.AnlyUnitType)get_store().add_element_user(ANLYUNIT$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "anlyUnit" element
     */
    public void removeAnlyUnit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANLYUNIT$14, i);
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
            get_store().find_all_element_users(UNIVERSE$16, targetList);
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
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().find_element_user(UNIVERSE$16, i);
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
            return get_store().count_elements(UNIVERSE$16);
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
            arraySetterHelper(universeArray, UNIVERSE$16);
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
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().find_element_user(UNIVERSE$16, i);
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
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().insert_element_user(UNIVERSE$16, i);
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
            target = (edu.umich.icpsr.ddi.UniverseType)get_store().add_element_user(UNIVERSE$16);
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
            get_store().remove_element(UNIVERSE$16, i);
        }
    }
    
    /**
     * Gets array of all "dataKind" elements
     */
    public edu.umich.icpsr.ddi.DataKindType[] getDataKindArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAKIND$18, targetList);
            edu.umich.icpsr.ddi.DataKindType[] result = new edu.umich.icpsr.ddi.DataKindType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataKind" element
     */
    public edu.umich.icpsr.ddi.DataKindType getDataKindArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataKindType target = null;
            target = (edu.umich.icpsr.ddi.DataKindType)get_store().find_element_user(DATAKIND$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataKind" element
     */
    public int sizeOfDataKindArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAKIND$18);
        }
    }
    
    /**
     * Sets array of all "dataKind" element
     */
    public void setDataKindArray(edu.umich.icpsr.ddi.DataKindType[] dataKindArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataKindArray, DATAKIND$18);
        }
    }
    
    /**
     * Sets ith "dataKind" element
     */
    public void setDataKindArray(int i, edu.umich.icpsr.ddi.DataKindType dataKind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataKindType target = null;
            target = (edu.umich.icpsr.ddi.DataKindType)get_store().find_element_user(DATAKIND$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataKind);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataKind" element
     */
    public edu.umich.icpsr.ddi.DataKindType insertNewDataKind(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataKindType target = null;
            target = (edu.umich.icpsr.ddi.DataKindType)get_store().insert_element_user(DATAKIND$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataKind" element
     */
    public edu.umich.icpsr.ddi.DataKindType addNewDataKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataKindType target = null;
            target = (edu.umich.icpsr.ddi.DataKindType)get_store().add_element_user(DATAKIND$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataKind" element
     */
    public void removeDataKind(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAKIND$18, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$20);
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
            return get_store().find_attribute_user(ID$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$20);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$20);
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
            get_store().remove_attribute(ID$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$22);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$22);
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
            return get_store().find_attribute_user(XMLLANG$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$22);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$22);
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
            get_store().remove_attribute(XMLLANG$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$24);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$24);
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
            return get_store().find_attribute_user(LANG$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$24);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$24);
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
            get_store().remove_attribute(LANG$24);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.SumDscrType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$26);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.SumDscrType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.SumDscrType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SumDscrType.Source target = null;
            target = (edu.umich.icpsr.ddi.SumDscrType.Source)get_store().find_attribute_user(SOURCE$26);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SumDscrType.Source)get_default_attribute_value(SOURCE$26);
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
            return get_store().find_attribute_user(SOURCE$26) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.SumDscrType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$26);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.SumDscrType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SumDscrType.Source target = null;
            target = (edu.umich.icpsr.ddi.SumDscrType.Source)get_store().find_attribute_user(SOURCE$26);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SumDscrType.Source)get_store().add_attribute_user(SOURCE$26);
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
            get_store().remove_attribute(SOURCE$26);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.SumDscrType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.SumDscrType.Source
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
