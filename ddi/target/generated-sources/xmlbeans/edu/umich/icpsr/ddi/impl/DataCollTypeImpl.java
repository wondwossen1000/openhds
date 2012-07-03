/*
 * XML Type:  dataCollType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.DataCollType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML dataCollType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class DataCollTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.DataCollType
{
    private static final long serialVersionUID = 1L;
    
    public DataCollTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEMETH$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "timeMeth");
    private static final javax.xml.namespace.QName DATACOLLECTOR$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "dataCollector");
    private static final javax.xml.namespace.QName FREQUENC$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "frequenc");
    private static final javax.xml.namespace.QName SAMPPROC$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "sampProc");
    private static final javax.xml.namespace.QName DEVIAT$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "deviat");
    private static final javax.xml.namespace.QName COLLMODE$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "collMode");
    private static final javax.xml.namespace.QName RESINSTRU$12 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "resInstru");
    private static final javax.xml.namespace.QName SOURCES$14 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "sources");
    private static final javax.xml.namespace.QName COLLSITU$16 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "collSitu");
    private static final javax.xml.namespace.QName ACTMIN$18 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "actMin");
    private static final javax.xml.namespace.QName CONOPS$20 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "ConOps");
    private static final javax.xml.namespace.QName WEIGHT$22 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "weight");
    private static final javax.xml.namespace.QName CLEANOPS$24 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "cleanOps");
    private static final javax.xml.namespace.QName ID$26 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$28 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$30 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$32 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets array of all "timeMeth" elements
     */
    public edu.umich.icpsr.ddi.TimeMethType[] getTimeMethArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TIMEMETH$0, targetList);
            edu.umich.icpsr.ddi.TimeMethType[] result = new edu.umich.icpsr.ddi.TimeMethType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "timeMeth" element
     */
    public edu.umich.icpsr.ddi.TimeMethType getTimeMethArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TimeMethType target = null;
            target = (edu.umich.icpsr.ddi.TimeMethType)get_store().find_element_user(TIMEMETH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "timeMeth" element
     */
    public int sizeOfTimeMethArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEMETH$0);
        }
    }
    
    /**
     * Sets array of all "timeMeth" element
     */
    public void setTimeMethArray(edu.umich.icpsr.ddi.TimeMethType[] timeMethArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(timeMethArray, TIMEMETH$0);
        }
    }
    
    /**
     * Sets ith "timeMeth" element
     */
    public void setTimeMethArray(int i, edu.umich.icpsr.ddi.TimeMethType timeMeth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TimeMethType target = null;
            target = (edu.umich.icpsr.ddi.TimeMethType)get_store().find_element_user(TIMEMETH$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(timeMeth);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "timeMeth" element
     */
    public edu.umich.icpsr.ddi.TimeMethType insertNewTimeMeth(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TimeMethType target = null;
            target = (edu.umich.icpsr.ddi.TimeMethType)get_store().insert_element_user(TIMEMETH$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "timeMeth" element
     */
    public edu.umich.icpsr.ddi.TimeMethType addNewTimeMeth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.TimeMethType target = null;
            target = (edu.umich.icpsr.ddi.TimeMethType)get_store().add_element_user(TIMEMETH$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "timeMeth" element
     */
    public void removeTimeMeth(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEMETH$0, i);
        }
    }
    
    /**
     * Gets array of all "dataCollector" elements
     */
    public edu.umich.icpsr.ddi.DataCollectorType[] getDataCollectorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATACOLLECTOR$2, targetList);
            edu.umich.icpsr.ddi.DataCollectorType[] result = new edu.umich.icpsr.ddi.DataCollectorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataCollector" element
     */
    public edu.umich.icpsr.ddi.DataCollectorType getDataCollectorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataCollectorType target = null;
            target = (edu.umich.icpsr.ddi.DataCollectorType)get_store().find_element_user(DATACOLLECTOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataCollector" element
     */
    public int sizeOfDataCollectorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACOLLECTOR$2);
        }
    }
    
    /**
     * Sets array of all "dataCollector" element
     */
    public void setDataCollectorArray(edu.umich.icpsr.ddi.DataCollectorType[] dataCollectorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataCollectorArray, DATACOLLECTOR$2);
        }
    }
    
    /**
     * Sets ith "dataCollector" element
     */
    public void setDataCollectorArray(int i, edu.umich.icpsr.ddi.DataCollectorType dataCollector)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataCollectorType target = null;
            target = (edu.umich.icpsr.ddi.DataCollectorType)get_store().find_element_user(DATACOLLECTOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataCollector);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataCollector" element
     */
    public edu.umich.icpsr.ddi.DataCollectorType insertNewDataCollector(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataCollectorType target = null;
            target = (edu.umich.icpsr.ddi.DataCollectorType)get_store().insert_element_user(DATACOLLECTOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataCollector" element
     */
    public edu.umich.icpsr.ddi.DataCollectorType addNewDataCollector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataCollectorType target = null;
            target = (edu.umich.icpsr.ddi.DataCollectorType)get_store().add_element_user(DATACOLLECTOR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataCollector" element
     */
    public void removeDataCollector(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACOLLECTOR$2, i);
        }
    }
    
    /**
     * Gets array of all "frequenc" elements
     */
    public edu.umich.icpsr.ddi.FrequencType[] getFrequencArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FREQUENC$4, targetList);
            edu.umich.icpsr.ddi.FrequencType[] result = new edu.umich.icpsr.ddi.FrequencType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "frequenc" element
     */
    public edu.umich.icpsr.ddi.FrequencType getFrequencArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FrequencType target = null;
            target = (edu.umich.icpsr.ddi.FrequencType)get_store().find_element_user(FREQUENC$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "frequenc" element
     */
    public int sizeOfFrequencArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FREQUENC$4);
        }
    }
    
    /**
     * Sets array of all "frequenc" element
     */
    public void setFrequencArray(edu.umich.icpsr.ddi.FrequencType[] frequencArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(frequencArray, FREQUENC$4);
        }
    }
    
    /**
     * Sets ith "frequenc" element
     */
    public void setFrequencArray(int i, edu.umich.icpsr.ddi.FrequencType frequenc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FrequencType target = null;
            target = (edu.umich.icpsr.ddi.FrequencType)get_store().find_element_user(FREQUENC$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(frequenc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "frequenc" element
     */
    public edu.umich.icpsr.ddi.FrequencType insertNewFrequenc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FrequencType target = null;
            target = (edu.umich.icpsr.ddi.FrequencType)get_store().insert_element_user(FREQUENC$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "frequenc" element
     */
    public edu.umich.icpsr.ddi.FrequencType addNewFrequenc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FrequencType target = null;
            target = (edu.umich.icpsr.ddi.FrequencType)get_store().add_element_user(FREQUENC$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "frequenc" element
     */
    public void removeFrequenc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FREQUENC$4, i);
        }
    }
    
    /**
     * Gets array of all "sampProc" elements
     */
    public edu.umich.icpsr.ddi.SampProcType[] getSampProcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SAMPPROC$6, targetList);
            edu.umich.icpsr.ddi.SampProcType[] result = new edu.umich.icpsr.ddi.SampProcType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sampProc" element
     */
    public edu.umich.icpsr.ddi.SampProcType getSampProcArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SampProcType target = null;
            target = (edu.umich.icpsr.ddi.SampProcType)get_store().find_element_user(SAMPPROC$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sampProc" element
     */
    public int sizeOfSampProcArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAMPPROC$6);
        }
    }
    
    /**
     * Sets array of all "sampProc" element
     */
    public void setSampProcArray(edu.umich.icpsr.ddi.SampProcType[] sampProcArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sampProcArray, SAMPPROC$6);
        }
    }
    
    /**
     * Sets ith "sampProc" element
     */
    public void setSampProcArray(int i, edu.umich.icpsr.ddi.SampProcType sampProc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SampProcType target = null;
            target = (edu.umich.icpsr.ddi.SampProcType)get_store().find_element_user(SAMPPROC$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sampProc);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sampProc" element
     */
    public edu.umich.icpsr.ddi.SampProcType insertNewSampProc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SampProcType target = null;
            target = (edu.umich.icpsr.ddi.SampProcType)get_store().insert_element_user(SAMPPROC$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sampProc" element
     */
    public edu.umich.icpsr.ddi.SampProcType addNewSampProc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SampProcType target = null;
            target = (edu.umich.icpsr.ddi.SampProcType)get_store().add_element_user(SAMPPROC$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "sampProc" element
     */
    public void removeSampProc(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAMPPROC$6, i);
        }
    }
    
    /**
     * Gets array of all "deviat" elements
     */
    public edu.umich.icpsr.ddi.DeviatType[] getDeviatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DEVIAT$8, targetList);
            edu.umich.icpsr.ddi.DeviatType[] result = new edu.umich.icpsr.ddi.DeviatType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deviat" element
     */
    public edu.umich.icpsr.ddi.DeviatType getDeviatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DeviatType target = null;
            target = (edu.umich.icpsr.ddi.DeviatType)get_store().find_element_user(DEVIAT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deviat" element
     */
    public int sizeOfDeviatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEVIAT$8);
        }
    }
    
    /**
     * Sets array of all "deviat" element
     */
    public void setDeviatArray(edu.umich.icpsr.ddi.DeviatType[] deviatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(deviatArray, DEVIAT$8);
        }
    }
    
    /**
     * Sets ith "deviat" element
     */
    public void setDeviatArray(int i, edu.umich.icpsr.ddi.DeviatType deviat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DeviatType target = null;
            target = (edu.umich.icpsr.ddi.DeviatType)get_store().find_element_user(DEVIAT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(deviat);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deviat" element
     */
    public edu.umich.icpsr.ddi.DeviatType insertNewDeviat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DeviatType target = null;
            target = (edu.umich.icpsr.ddi.DeviatType)get_store().insert_element_user(DEVIAT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deviat" element
     */
    public edu.umich.icpsr.ddi.DeviatType addNewDeviat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DeviatType target = null;
            target = (edu.umich.icpsr.ddi.DeviatType)get_store().add_element_user(DEVIAT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "deviat" element
     */
    public void removeDeviat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEVIAT$8, i);
        }
    }
    
    /**
     * Gets array of all "collMode" elements
     */
    public edu.umich.icpsr.ddi.CollModeType[] getCollModeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLLMODE$10, targetList);
            edu.umich.icpsr.ddi.CollModeType[] result = new edu.umich.icpsr.ddi.CollModeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "collMode" element
     */
    public edu.umich.icpsr.ddi.CollModeType getCollModeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollModeType target = null;
            target = (edu.umich.icpsr.ddi.CollModeType)get_store().find_element_user(COLLMODE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "collMode" element
     */
    public int sizeOfCollModeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLLMODE$10);
        }
    }
    
    /**
     * Sets array of all "collMode" element
     */
    public void setCollModeArray(edu.umich.icpsr.ddi.CollModeType[] collModeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(collModeArray, COLLMODE$10);
        }
    }
    
    /**
     * Sets ith "collMode" element
     */
    public void setCollModeArray(int i, edu.umich.icpsr.ddi.CollModeType collMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollModeType target = null;
            target = (edu.umich.icpsr.ddi.CollModeType)get_store().find_element_user(COLLMODE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(collMode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "collMode" element
     */
    public edu.umich.icpsr.ddi.CollModeType insertNewCollMode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollModeType target = null;
            target = (edu.umich.icpsr.ddi.CollModeType)get_store().insert_element_user(COLLMODE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "collMode" element
     */
    public edu.umich.icpsr.ddi.CollModeType addNewCollMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollModeType target = null;
            target = (edu.umich.icpsr.ddi.CollModeType)get_store().add_element_user(COLLMODE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "collMode" element
     */
    public void removeCollMode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLLMODE$10, i);
        }
    }
    
    /**
     * Gets array of all "resInstru" elements
     */
    public edu.umich.icpsr.ddi.ResInstruType[] getResInstruArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESINSTRU$12, targetList);
            edu.umich.icpsr.ddi.ResInstruType[] result = new edu.umich.icpsr.ddi.ResInstruType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resInstru" element
     */
    public edu.umich.icpsr.ddi.ResInstruType getResInstruArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ResInstruType target = null;
            target = (edu.umich.icpsr.ddi.ResInstruType)get_store().find_element_user(RESINSTRU$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resInstru" element
     */
    public int sizeOfResInstruArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESINSTRU$12);
        }
    }
    
    /**
     * Sets array of all "resInstru" element
     */
    public void setResInstruArray(edu.umich.icpsr.ddi.ResInstruType[] resInstruArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resInstruArray, RESINSTRU$12);
        }
    }
    
    /**
     * Sets ith "resInstru" element
     */
    public void setResInstruArray(int i, edu.umich.icpsr.ddi.ResInstruType resInstru)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ResInstruType target = null;
            target = (edu.umich.icpsr.ddi.ResInstruType)get_store().find_element_user(RESINSTRU$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resInstru);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resInstru" element
     */
    public edu.umich.icpsr.ddi.ResInstruType insertNewResInstru(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ResInstruType target = null;
            target = (edu.umich.icpsr.ddi.ResInstruType)get_store().insert_element_user(RESINSTRU$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resInstru" element
     */
    public edu.umich.icpsr.ddi.ResInstruType addNewResInstru()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ResInstruType target = null;
            target = (edu.umich.icpsr.ddi.ResInstruType)get_store().add_element_user(RESINSTRU$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "resInstru" element
     */
    public void removeResInstru(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESINSTRU$12, i);
        }
    }
    
    /**
     * Gets the "sources" element
     */
    public edu.umich.icpsr.ddi.SourcesType getSources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SourcesType target = null;
            target = (edu.umich.icpsr.ddi.SourcesType)get_store().find_element_user(SOURCES$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sources" element
     */
    public boolean isSetSources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCES$14) != 0;
        }
    }
    
    /**
     * Sets the "sources" element
     */
    public void setSources(edu.umich.icpsr.ddi.SourcesType sources)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SourcesType target = null;
            target = (edu.umich.icpsr.ddi.SourcesType)get_store().find_element_user(SOURCES$14, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.SourcesType)get_store().add_element_user(SOURCES$14);
            }
            target.set(sources);
        }
    }
    
    /**
     * Appends and returns a new empty "sources" element
     */
    public edu.umich.icpsr.ddi.SourcesType addNewSources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SourcesType target = null;
            target = (edu.umich.icpsr.ddi.SourcesType)get_store().add_element_user(SOURCES$14);
            return target;
        }
    }
    
    /**
     * Unsets the "sources" element
     */
    public void unsetSources()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCES$14, 0);
        }
    }
    
    /**
     * Gets array of all "collSitu" elements
     */
    public edu.umich.icpsr.ddi.CollSituType[] getCollSituArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLLSITU$16, targetList);
            edu.umich.icpsr.ddi.CollSituType[] result = new edu.umich.icpsr.ddi.CollSituType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "collSitu" element
     */
    public edu.umich.icpsr.ddi.CollSituType getCollSituArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollSituType target = null;
            target = (edu.umich.icpsr.ddi.CollSituType)get_store().find_element_user(COLLSITU$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "collSitu" element
     */
    public int sizeOfCollSituArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLLSITU$16);
        }
    }
    
    /**
     * Sets array of all "collSitu" element
     */
    public void setCollSituArray(edu.umich.icpsr.ddi.CollSituType[] collSituArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(collSituArray, COLLSITU$16);
        }
    }
    
    /**
     * Sets ith "collSitu" element
     */
    public void setCollSituArray(int i, edu.umich.icpsr.ddi.CollSituType collSitu)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollSituType target = null;
            target = (edu.umich.icpsr.ddi.CollSituType)get_store().find_element_user(COLLSITU$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(collSitu);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "collSitu" element
     */
    public edu.umich.icpsr.ddi.CollSituType insertNewCollSitu(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollSituType target = null;
            target = (edu.umich.icpsr.ddi.CollSituType)get_store().insert_element_user(COLLSITU$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "collSitu" element
     */
    public edu.umich.icpsr.ddi.CollSituType addNewCollSitu()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CollSituType target = null;
            target = (edu.umich.icpsr.ddi.CollSituType)get_store().add_element_user(COLLSITU$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "collSitu" element
     */
    public void removeCollSitu(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLLSITU$16, i);
        }
    }
    
    /**
     * Gets array of all "actMin" elements
     */
    public edu.umich.icpsr.ddi.ActMinType[] getActMinArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTMIN$18, targetList);
            edu.umich.icpsr.ddi.ActMinType[] result = new edu.umich.icpsr.ddi.ActMinType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "actMin" element
     */
    public edu.umich.icpsr.ddi.ActMinType getActMinArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ActMinType target = null;
            target = (edu.umich.icpsr.ddi.ActMinType)get_store().find_element_user(ACTMIN$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "actMin" element
     */
    public int sizeOfActMinArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTMIN$18);
        }
    }
    
    /**
     * Sets array of all "actMin" element
     */
    public void setActMinArray(edu.umich.icpsr.ddi.ActMinType[] actMinArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(actMinArray, ACTMIN$18);
        }
    }
    
    /**
     * Sets ith "actMin" element
     */
    public void setActMinArray(int i, edu.umich.icpsr.ddi.ActMinType actMin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ActMinType target = null;
            target = (edu.umich.icpsr.ddi.ActMinType)get_store().find_element_user(ACTMIN$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(actMin);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "actMin" element
     */
    public edu.umich.icpsr.ddi.ActMinType insertNewActMin(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ActMinType target = null;
            target = (edu.umich.icpsr.ddi.ActMinType)get_store().insert_element_user(ACTMIN$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "actMin" element
     */
    public edu.umich.icpsr.ddi.ActMinType addNewActMin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ActMinType target = null;
            target = (edu.umich.icpsr.ddi.ActMinType)get_store().add_element_user(ACTMIN$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "actMin" element
     */
    public void removeActMin(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTMIN$18, i);
        }
    }
    
    /**
     * Gets array of all "ConOps" elements
     */
    public edu.umich.icpsr.ddi.ConOpsType[] getConOpsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONOPS$20, targetList);
            edu.umich.icpsr.ddi.ConOpsType[] result = new edu.umich.icpsr.ddi.ConOpsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ConOps" element
     */
    public edu.umich.icpsr.ddi.ConOpsType getConOpsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConOpsType target = null;
            target = (edu.umich.icpsr.ddi.ConOpsType)get_store().find_element_user(CONOPS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ConOps" element
     */
    public int sizeOfConOpsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONOPS$20);
        }
    }
    
    /**
     * Sets array of all "ConOps" element
     */
    public void setConOpsArray(edu.umich.icpsr.ddi.ConOpsType[] conOpsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(conOpsArray, CONOPS$20);
        }
    }
    
    /**
     * Sets ith "ConOps" element
     */
    public void setConOpsArray(int i, edu.umich.icpsr.ddi.ConOpsType conOps)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConOpsType target = null;
            target = (edu.umich.icpsr.ddi.ConOpsType)get_store().find_element_user(CONOPS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(conOps);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ConOps" element
     */
    public edu.umich.icpsr.ddi.ConOpsType insertNewConOps(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConOpsType target = null;
            target = (edu.umich.icpsr.ddi.ConOpsType)get_store().insert_element_user(CONOPS$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ConOps" element
     */
    public edu.umich.icpsr.ddi.ConOpsType addNewConOps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ConOpsType target = null;
            target = (edu.umich.icpsr.ddi.ConOpsType)get_store().add_element_user(CONOPS$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "ConOps" element
     */
    public void removeConOps(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONOPS$20, i);
        }
    }
    
    /**
     * Gets array of all "weight" elements
     */
    public edu.umich.icpsr.ddi.WeightType[] getWeightArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WEIGHT$22, targetList);
            edu.umich.icpsr.ddi.WeightType[] result = new edu.umich.icpsr.ddi.WeightType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "weight" element
     */
    public edu.umich.icpsr.ddi.WeightType getWeightArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.WeightType target = null;
            target = (edu.umich.icpsr.ddi.WeightType)get_store().find_element_user(WEIGHT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "weight" element
     */
    public int sizeOfWeightArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WEIGHT$22);
        }
    }
    
    /**
     * Sets array of all "weight" element
     */
    public void setWeightArray(edu.umich.icpsr.ddi.WeightType[] weightArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(weightArray, WEIGHT$22);
        }
    }
    
    /**
     * Sets ith "weight" element
     */
    public void setWeightArray(int i, edu.umich.icpsr.ddi.WeightType weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.WeightType target = null;
            target = (edu.umich.icpsr.ddi.WeightType)get_store().find_element_user(WEIGHT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(weight);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "weight" element
     */
    public edu.umich.icpsr.ddi.WeightType insertNewWeight(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.WeightType target = null;
            target = (edu.umich.icpsr.ddi.WeightType)get_store().insert_element_user(WEIGHT$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "weight" element
     */
    public edu.umich.icpsr.ddi.WeightType addNewWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.WeightType target = null;
            target = (edu.umich.icpsr.ddi.WeightType)get_store().add_element_user(WEIGHT$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "weight" element
     */
    public void removeWeight(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WEIGHT$22, i);
        }
    }
    
    /**
     * Gets array of all "cleanOps" elements
     */
    public edu.umich.icpsr.ddi.CleanOpsType[] getCleanOpsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLEANOPS$24, targetList);
            edu.umich.icpsr.ddi.CleanOpsType[] result = new edu.umich.icpsr.ddi.CleanOpsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "cleanOps" element
     */
    public edu.umich.icpsr.ddi.CleanOpsType getCleanOpsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CleanOpsType target = null;
            target = (edu.umich.icpsr.ddi.CleanOpsType)get_store().find_element_user(CLEANOPS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "cleanOps" element
     */
    public int sizeOfCleanOpsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLEANOPS$24);
        }
    }
    
    /**
     * Sets array of all "cleanOps" element
     */
    public void setCleanOpsArray(edu.umich.icpsr.ddi.CleanOpsType[] cleanOpsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cleanOpsArray, CLEANOPS$24);
        }
    }
    
    /**
     * Sets ith "cleanOps" element
     */
    public void setCleanOpsArray(int i, edu.umich.icpsr.ddi.CleanOpsType cleanOps)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CleanOpsType target = null;
            target = (edu.umich.icpsr.ddi.CleanOpsType)get_store().find_element_user(CLEANOPS$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cleanOps);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cleanOps" element
     */
    public edu.umich.icpsr.ddi.CleanOpsType insertNewCleanOps(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CleanOpsType target = null;
            target = (edu.umich.icpsr.ddi.CleanOpsType)get_store().insert_element_user(CLEANOPS$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cleanOps" element
     */
    public edu.umich.icpsr.ddi.CleanOpsType addNewCleanOps()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CleanOpsType target = null;
            target = (edu.umich.icpsr.ddi.CleanOpsType)get_store().add_element_user(CLEANOPS$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "cleanOps" element
     */
    public void removeCleanOps(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLEANOPS$24, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$26);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$26);
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
            return get_store().find_attribute_user(ID$26) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$26);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$26);
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
            get_store().remove_attribute(ID$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$28);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$28);
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
            return get_store().find_attribute_user(XMLLANG$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$28);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$28);
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
            get_store().remove_attribute(XMLLANG$28);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$30);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$30);
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
            return get_store().find_attribute_user(LANG$30) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$30);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$30);
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
            get_store().remove_attribute(LANG$30);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.DataCollType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$32);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.DataCollType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.DataCollType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataCollType.Source target = null;
            target = (edu.umich.icpsr.ddi.DataCollType.Source)get_store().find_attribute_user(SOURCE$32);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DataCollType.Source)get_default_attribute_value(SOURCE$32);
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
            return get_store().find_attribute_user(SOURCE$32) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.DataCollType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$32);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.DataCollType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataCollType.Source target = null;
            target = (edu.umich.icpsr.ddi.DataCollType.Source)get_store().find_attribute_user(SOURCE$32);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DataCollType.Source)get_store().add_attribute_user(SOURCE$32);
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
            get_store().remove_attribute(SOURCE$32);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.DataCollType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.DataCollType.Source
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
