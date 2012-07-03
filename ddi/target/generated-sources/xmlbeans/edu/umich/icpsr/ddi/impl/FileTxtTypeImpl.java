/*
 * XML Type:  fileTxtType
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.FileTxtType
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * An XML fileTxtType(@http://www.icpsr.umich.edu/DDI).
 *
 * This is a complex type.
 */
public class FileTxtTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.FileTxtType
{
    private static final long serialVersionUID = 1L;
    
    public FileTxtTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILENAME$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "fileName");
    private static final javax.xml.namespace.QName FILECONT$2 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "fileCont");
    private static final javax.xml.namespace.QName FILESTRC$4 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "fileStrc");
    private static final javax.xml.namespace.QName DIMENSNS$6 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "dimensns");
    private static final javax.xml.namespace.QName FILETYPE$8 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "fileType");
    private static final javax.xml.namespace.QName FORMAT$10 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "format");
    private static final javax.xml.namespace.QName FILEPLAC$12 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "filePlac");
    private static final javax.xml.namespace.QName DATACHCK$14 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "dataChck");
    private static final javax.xml.namespace.QName PROCSTAT$16 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "ProcStat");
    private static final javax.xml.namespace.QName DATAMSNG$18 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "dataMsng");
    private static final javax.xml.namespace.QName SOFTWARE$20 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "software");
    private static final javax.xml.namespace.QName VERSTMT$22 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "verStmt");
    private static final javax.xml.namespace.QName ID$24 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName XMLLANG$26 = 
        new javax.xml.namespace.QName("", "xml-lang");
    private static final javax.xml.namespace.QName LANG$28 = 
        new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
    private static final javax.xml.namespace.QName SOURCE$30 = 
        new javax.xml.namespace.QName("", "source");
    
    
    /**
     * Gets the "fileName" element
     */
    public edu.umich.icpsr.ddi.FileNameType getFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileNameType target = null;
            target = (edu.umich.icpsr.ddi.FileNameType)get_store().find_element_user(FILENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fileName" element
     */
    public boolean isSetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILENAME$0) != 0;
        }
    }
    
    /**
     * Sets the "fileName" element
     */
    public void setFileName(edu.umich.icpsr.ddi.FileNameType fileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileNameType target = null;
            target = (edu.umich.icpsr.ddi.FileNameType)get_store().find_element_user(FILENAME$0, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FileNameType)get_store().add_element_user(FILENAME$0);
            }
            target.set(fileName);
        }
    }
    
    /**
     * Appends and returns a new empty "fileName" element
     */
    public edu.umich.icpsr.ddi.FileNameType addNewFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileNameType target = null;
            target = (edu.umich.icpsr.ddi.FileNameType)get_store().add_element_user(FILENAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "fileName" element
     */
    public void unsetFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILENAME$0, 0);
        }
    }
    
    /**
     * Gets the "fileCont" element
     */
    public edu.umich.icpsr.ddi.FileContType getFileCont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileContType target = null;
            target = (edu.umich.icpsr.ddi.FileContType)get_store().find_element_user(FILECONT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fileCont" element
     */
    public boolean isSetFileCont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILECONT$2) != 0;
        }
    }
    
    /**
     * Sets the "fileCont" element
     */
    public void setFileCont(edu.umich.icpsr.ddi.FileContType fileCont)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileContType target = null;
            target = (edu.umich.icpsr.ddi.FileContType)get_store().find_element_user(FILECONT$2, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FileContType)get_store().add_element_user(FILECONT$2);
            }
            target.set(fileCont);
        }
    }
    
    /**
     * Appends and returns a new empty "fileCont" element
     */
    public edu.umich.icpsr.ddi.FileContType addNewFileCont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileContType target = null;
            target = (edu.umich.icpsr.ddi.FileContType)get_store().add_element_user(FILECONT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "fileCont" element
     */
    public void unsetFileCont()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILECONT$2, 0);
        }
    }
    
    /**
     * Gets the "fileStrc" element
     */
    public edu.umich.icpsr.ddi.FileStrcType getFileStrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileStrcType target = null;
            target = (edu.umich.icpsr.ddi.FileStrcType)get_store().find_element_user(FILESTRC$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fileStrc" element
     */
    public boolean isSetFileStrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILESTRC$4) != 0;
        }
    }
    
    /**
     * Sets the "fileStrc" element
     */
    public void setFileStrc(edu.umich.icpsr.ddi.FileStrcType fileStrc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileStrcType target = null;
            target = (edu.umich.icpsr.ddi.FileStrcType)get_store().find_element_user(FILESTRC$4, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FileStrcType)get_store().add_element_user(FILESTRC$4);
            }
            target.set(fileStrc);
        }
    }
    
    /**
     * Appends and returns a new empty "fileStrc" element
     */
    public edu.umich.icpsr.ddi.FileStrcType addNewFileStrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileStrcType target = null;
            target = (edu.umich.icpsr.ddi.FileStrcType)get_store().add_element_user(FILESTRC$4);
            return target;
        }
    }
    
    /**
     * Unsets the "fileStrc" element
     */
    public void unsetFileStrc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILESTRC$4, 0);
        }
    }
    
    /**
     * Gets the "dimensns" element
     */
    public edu.umich.icpsr.ddi.DimensnsType getDimensns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DimensnsType target = null;
            target = (edu.umich.icpsr.ddi.DimensnsType)get_store().find_element_user(DIMENSNS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dimensns" element
     */
    public boolean isSetDimensns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSNS$6) != 0;
        }
    }
    
    /**
     * Sets the "dimensns" element
     */
    public void setDimensns(edu.umich.icpsr.ddi.DimensnsType dimensns)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DimensnsType target = null;
            target = (edu.umich.icpsr.ddi.DimensnsType)get_store().find_element_user(DIMENSNS$6, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DimensnsType)get_store().add_element_user(DIMENSNS$6);
            }
            target.set(dimensns);
        }
    }
    
    /**
     * Appends and returns a new empty "dimensns" element
     */
    public edu.umich.icpsr.ddi.DimensnsType addNewDimensns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DimensnsType target = null;
            target = (edu.umich.icpsr.ddi.DimensnsType)get_store().add_element_user(DIMENSNS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "dimensns" element
     */
    public void unsetDimensns()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSNS$6, 0);
        }
    }
    
    /**
     * Gets the "fileType" element
     */
    public edu.umich.icpsr.ddi.FileTypeType getFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileTypeType target = null;
            target = (edu.umich.icpsr.ddi.FileTypeType)get_store().find_element_user(FILETYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "fileType" element
     */
    public boolean isSetFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILETYPE$8) != 0;
        }
    }
    
    /**
     * Sets the "fileType" element
     */
    public void setFileType(edu.umich.icpsr.ddi.FileTypeType fileType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileTypeType target = null;
            target = (edu.umich.icpsr.ddi.FileTypeType)get_store().find_element_user(FILETYPE$8, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FileTypeType)get_store().add_element_user(FILETYPE$8);
            }
            target.set(fileType);
        }
    }
    
    /**
     * Appends and returns a new empty "fileType" element
     */
    public edu.umich.icpsr.ddi.FileTypeType addNewFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileTypeType target = null;
            target = (edu.umich.icpsr.ddi.FileTypeType)get_store().add_element_user(FILETYPE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "fileType" element
     */
    public void unsetFileType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILETYPE$8, 0);
        }
    }
    
    /**
     * Gets the "format" element
     */
    public edu.umich.icpsr.ddi.FormatType getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FormatType target = null;
            target = (edu.umich.icpsr.ddi.FormatType)get_store().find_element_user(FORMAT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "format" element
     */
    public boolean isSetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMAT$10) != 0;
        }
    }
    
    /**
     * Sets the "format" element
     */
    public void setFormat(edu.umich.icpsr.ddi.FormatType format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FormatType target = null;
            target = (edu.umich.icpsr.ddi.FormatType)get_store().find_element_user(FORMAT$10, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FormatType)get_store().add_element_user(FORMAT$10);
            }
            target.set(format);
        }
    }
    
    /**
     * Appends and returns a new empty "format" element
     */
    public edu.umich.icpsr.ddi.FormatType addNewFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FormatType target = null;
            target = (edu.umich.icpsr.ddi.FormatType)get_store().add_element_user(FORMAT$10);
            return target;
        }
    }
    
    /**
     * Unsets the "format" element
     */
    public void unsetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMAT$10, 0);
        }
    }
    
    /**
     * Gets the "filePlac" element
     */
    public edu.umich.icpsr.ddi.FilePlacType getFilePlac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FilePlacType target = null;
            target = (edu.umich.icpsr.ddi.FilePlacType)get_store().find_element_user(FILEPLAC$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "filePlac" element
     */
    public boolean isSetFilePlac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILEPLAC$12) != 0;
        }
    }
    
    /**
     * Sets the "filePlac" element
     */
    public void setFilePlac(edu.umich.icpsr.ddi.FilePlacType filePlac)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FilePlacType target = null;
            target = (edu.umich.icpsr.ddi.FilePlacType)get_store().find_element_user(FILEPLAC$12, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FilePlacType)get_store().add_element_user(FILEPLAC$12);
            }
            target.set(filePlac);
        }
    }
    
    /**
     * Appends and returns a new empty "filePlac" element
     */
    public edu.umich.icpsr.ddi.FilePlacType addNewFilePlac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FilePlacType target = null;
            target = (edu.umich.icpsr.ddi.FilePlacType)get_store().add_element_user(FILEPLAC$12);
            return target;
        }
    }
    
    /**
     * Unsets the "filePlac" element
     */
    public void unsetFilePlac()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILEPLAC$12, 0);
        }
    }
    
    /**
     * Gets array of all "dataChck" elements
     */
    public edu.umich.icpsr.ddi.DataChckType[] getDataChckArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATACHCK$14, targetList);
            edu.umich.icpsr.ddi.DataChckType[] result = new edu.umich.icpsr.ddi.DataChckType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataChck" element
     */
    public edu.umich.icpsr.ddi.DataChckType getDataChckArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataChckType target = null;
            target = (edu.umich.icpsr.ddi.DataChckType)get_store().find_element_user(DATACHCK$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataChck" element
     */
    public int sizeOfDataChckArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATACHCK$14);
        }
    }
    
    /**
     * Sets array of all "dataChck" element
     */
    public void setDataChckArray(edu.umich.icpsr.ddi.DataChckType[] dataChckArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataChckArray, DATACHCK$14);
        }
    }
    
    /**
     * Sets ith "dataChck" element
     */
    public void setDataChckArray(int i, edu.umich.icpsr.ddi.DataChckType dataChck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataChckType target = null;
            target = (edu.umich.icpsr.ddi.DataChckType)get_store().find_element_user(DATACHCK$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataChck);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataChck" element
     */
    public edu.umich.icpsr.ddi.DataChckType insertNewDataChck(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataChckType target = null;
            target = (edu.umich.icpsr.ddi.DataChckType)get_store().insert_element_user(DATACHCK$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataChck" element
     */
    public edu.umich.icpsr.ddi.DataChckType addNewDataChck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataChckType target = null;
            target = (edu.umich.icpsr.ddi.DataChckType)get_store().add_element_user(DATACHCK$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataChck" element
     */
    public void removeDataChck(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATACHCK$14, i);
        }
    }
    
    /**
     * Gets the "ProcStat" element
     */
    public edu.umich.icpsr.ddi.ProcStatType getProcStat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProcStatType target = null;
            target = (edu.umich.icpsr.ddi.ProcStatType)get_store().find_element_user(PROCSTAT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProcStat" element
     */
    public boolean isSetProcStat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCSTAT$16) != 0;
        }
    }
    
    /**
     * Sets the "ProcStat" element
     */
    public void setProcStat(edu.umich.icpsr.ddi.ProcStatType procStat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProcStatType target = null;
            target = (edu.umich.icpsr.ddi.ProcStatType)get_store().find_element_user(PROCSTAT$16, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.ProcStatType)get_store().add_element_user(PROCSTAT$16);
            }
            target.set(procStat);
        }
    }
    
    /**
     * Appends and returns a new empty "ProcStat" element
     */
    public edu.umich.icpsr.ddi.ProcStatType addNewProcStat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.ProcStatType target = null;
            target = (edu.umich.icpsr.ddi.ProcStatType)get_store().add_element_user(PROCSTAT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "ProcStat" element
     */
    public void unsetProcStat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCSTAT$16, 0);
        }
    }
    
    /**
     * Gets the "dataMsng" element
     */
    public edu.umich.icpsr.ddi.DataMsngType getDataMsng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataMsngType target = null;
            target = (edu.umich.icpsr.ddi.DataMsngType)get_store().find_element_user(DATAMSNG$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataMsng" element
     */
    public boolean isSetDataMsng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAMSNG$18) != 0;
        }
    }
    
    /**
     * Sets the "dataMsng" element
     */
    public void setDataMsng(edu.umich.icpsr.ddi.DataMsngType dataMsng)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataMsngType target = null;
            target = (edu.umich.icpsr.ddi.DataMsngType)get_store().find_element_user(DATAMSNG$18, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.DataMsngType)get_store().add_element_user(DATAMSNG$18);
            }
            target.set(dataMsng);
        }
    }
    
    /**
     * Appends and returns a new empty "dataMsng" element
     */
    public edu.umich.icpsr.ddi.DataMsngType addNewDataMsng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.DataMsngType target = null;
            target = (edu.umich.icpsr.ddi.DataMsngType)get_store().add_element_user(DATAMSNG$18);
            return target;
        }
    }
    
    /**
     * Unsets the "dataMsng" element
     */
    public void unsetDataMsng()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAMSNG$18, 0);
        }
    }
    
    /**
     * Gets array of all "software" elements
     */
    public edu.umich.icpsr.ddi.SoftwareType[] getSoftwareArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOFTWARE$20, targetList);
            edu.umich.icpsr.ddi.SoftwareType[] result = new edu.umich.icpsr.ddi.SoftwareType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "software" element
     */
    public edu.umich.icpsr.ddi.SoftwareType getSoftwareArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SoftwareType target = null;
            target = (edu.umich.icpsr.ddi.SoftwareType)get_store().find_element_user(SOFTWARE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "software" element
     */
    public int sizeOfSoftwareArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTWARE$20);
        }
    }
    
    /**
     * Sets array of all "software" element
     */
    public void setSoftwareArray(edu.umich.icpsr.ddi.SoftwareType[] softwareArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(softwareArray, SOFTWARE$20);
        }
    }
    
    /**
     * Sets ith "software" element
     */
    public void setSoftwareArray(int i, edu.umich.icpsr.ddi.SoftwareType software)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SoftwareType target = null;
            target = (edu.umich.icpsr.ddi.SoftwareType)get_store().find_element_user(SOFTWARE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(software);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "software" element
     */
    public edu.umich.icpsr.ddi.SoftwareType insertNewSoftware(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SoftwareType target = null;
            target = (edu.umich.icpsr.ddi.SoftwareType)get_store().insert_element_user(SOFTWARE$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "software" element
     */
    public edu.umich.icpsr.ddi.SoftwareType addNewSoftware()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.SoftwareType target = null;
            target = (edu.umich.icpsr.ddi.SoftwareType)get_store().add_element_user(SOFTWARE$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "software" element
     */
    public void removeSoftware(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTWARE$20, i);
        }
    }
    
    /**
     * Gets the "verStmt" element
     */
    public edu.umich.icpsr.ddi.VerStmtType getVerStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerStmtType target = null;
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().find_element_user(VERSTMT$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "verStmt" element
     */
    public boolean isSetVerStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSTMT$22) != 0;
        }
    }
    
    /**
     * Sets the "verStmt" element
     */
    public void setVerStmt(edu.umich.icpsr.ddi.VerStmtType verStmt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerStmtType target = null;
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().find_element_user(VERSTMT$22, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.VerStmtType)get_store().add_element_user(VERSTMT$22);
            }
            target.set(verStmt);
        }
    }
    
    /**
     * Appends and returns a new empty "verStmt" element
     */
    public edu.umich.icpsr.ddi.VerStmtType addNewVerStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.VerStmtType target = null;
            target = (edu.umich.icpsr.ddi.VerStmtType)get_store().add_element_user(VERSTMT$22);
            return target;
        }
    }
    
    /**
     * Unsets the "verStmt" element
     */
    public void unsetVerStmt()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSTMT$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$24);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$24);
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
            return get_store().find_attribute_user(ID$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$24);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$24);
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
            get_store().remove_attribute(ID$24);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$26);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$26);
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
            return get_store().find_attribute_user(XMLLANG$26) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$26);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$26);
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
            get_store().remove_attribute(XMLLANG$26);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$28);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$28);
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
            return get_store().find_attribute_user(LANG$28) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$28);
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
            target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$28);
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
            get_store().remove_attribute(LANG$28);
        }
    }
    
    /**
     * Gets the "source" attribute
     */
    public edu.umich.icpsr.ddi.FileTxtType.Source.Enum getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$30);
            }
            if (target == null)
            {
                return null;
            }
            return (edu.umich.icpsr.ddi.FileTxtType.Source.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" attribute
     */
    public edu.umich.icpsr.ddi.FileTxtType.Source xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileTxtType.Source target = null;
            target = (edu.umich.icpsr.ddi.FileTxtType.Source)get_store().find_attribute_user(SOURCE$30);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FileTxtType.Source)get_default_attribute_value(SOURCE$30);
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
            return get_store().find_attribute_user(SOURCE$30) != null;
        }
    }
    
    /**
     * Sets the "source" attribute
     */
    public void setSource(edu.umich.icpsr.ddi.FileTxtType.Source.Enum source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$30);
            }
            target.setEnumValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" attribute
     */
    public void xsetSource(edu.umich.icpsr.ddi.FileTxtType.Source source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.FileTxtType.Source target = null;
            target = (edu.umich.icpsr.ddi.FileTxtType.Source)get_store().find_attribute_user(SOURCE$30);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.FileTxtType.Source)get_store().add_attribute_user(SOURCE$30);
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
            get_store().remove_attribute(SOURCE$30);
        }
    }
    /**
     * An XML source(@).
     *
     * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.FileTxtType$Source.
     */
    public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.FileTxtType.Source
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
