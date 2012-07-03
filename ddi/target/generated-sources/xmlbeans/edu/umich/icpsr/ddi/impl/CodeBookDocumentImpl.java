/*
 * An XML document type.
 * Localname: codeBook
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.CodeBookDocument
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi.impl;
/**
 * A document containing one codeBook(@http://www.icpsr.umich.edu/DDI) element.
 *
 * This is a complex type.
 */
public class CodeBookDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.CodeBookDocument
{
    private static final long serialVersionUID = 1L;
    
    public CodeBookDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODEBOOK$0 = 
        new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "codeBook");
    
    
    /**
     * Gets the "codeBook" element
     */
    public edu.umich.icpsr.ddi.CodeBookDocument.CodeBook getCodeBook()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CodeBookDocument.CodeBook target = null;
            target = (edu.umich.icpsr.ddi.CodeBookDocument.CodeBook)get_store().find_element_user(CODEBOOK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "codeBook" element
     */
    public void setCodeBook(edu.umich.icpsr.ddi.CodeBookDocument.CodeBook codeBook)
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CodeBookDocument.CodeBook target = null;
            target = (edu.umich.icpsr.ddi.CodeBookDocument.CodeBook)get_store().find_element_user(CODEBOOK$0, 0);
            if (target == null)
            {
                target = (edu.umich.icpsr.ddi.CodeBookDocument.CodeBook)get_store().add_element_user(CODEBOOK$0);
            }
            target.set(codeBook);
        }
    }
    
    /**
     * Appends and returns a new empty "codeBook" element
     */
    public edu.umich.icpsr.ddi.CodeBookDocument.CodeBook addNewCodeBook()
    {
        synchronized (monitor())
        {
            check_orphaned();
            edu.umich.icpsr.ddi.CodeBookDocument.CodeBook target = null;
            target = (edu.umich.icpsr.ddi.CodeBookDocument.CodeBook)get_store().add_element_user(CODEBOOK$0);
            return target;
        }
    }
    /**
     * An XML codeBook(@http://www.icpsr.umich.edu/DDI).
     *
     * This is a complex type.
     */
    public static class CodeBookImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements edu.umich.icpsr.ddi.CodeBookDocument.CodeBook
    {
        private static final long serialVersionUID = 1L;
        
        public CodeBookImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOCDSCR$0 = 
            new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "docDscr");
        private static final javax.xml.namespace.QName STDYDSCR$2 = 
            new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "stdyDscr");
        private static final javax.xml.namespace.QName FILEDSCR$4 = 
            new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "fileDscr");
        private static final javax.xml.namespace.QName DATADSCR$6 = 
            new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "dataDscr");
        private static final javax.xml.namespace.QName OTHERMAT$8 = 
            new javax.xml.namespace.QName("http://www.icpsr.umich.edu/DDI", "otherMat");
        private static final javax.xml.namespace.QName ID$10 = 
            new javax.xml.namespace.QName("", "ID");
        private static final javax.xml.namespace.QName XMLLANG$12 = 
            new javax.xml.namespace.QName("", "xml-lang");
        private static final javax.xml.namespace.QName LANG$14 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        private static final javax.xml.namespace.QName SOURCE$16 = 
            new javax.xml.namespace.QName("", "source");
        private static final javax.xml.namespace.QName VERSION$18 = 
            new javax.xml.namespace.QName("", "version");
        
        
        /**
         * Gets array of all "docDscr" elements
         */
        public edu.umich.icpsr.ddi.DocDscrType[] getDocDscrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DOCDSCR$0, targetList);
                edu.umich.icpsr.ddi.DocDscrType[] result = new edu.umich.icpsr.ddi.DocDscrType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "docDscr" element
         */
        public edu.umich.icpsr.ddi.DocDscrType getDocDscrArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.DocDscrType target = null;
                target = (edu.umich.icpsr.ddi.DocDscrType)get_store().find_element_user(DOCDSCR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "docDscr" element
         */
        public int sizeOfDocDscrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOCDSCR$0);
            }
        }
        
        /**
         * Sets array of all "docDscr" element
         */
        public void setDocDscrArray(edu.umich.icpsr.ddi.DocDscrType[] docDscrArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(docDscrArray, DOCDSCR$0);
            }
        }
        
        /**
         * Sets ith "docDscr" element
         */
        public void setDocDscrArray(int i, edu.umich.icpsr.ddi.DocDscrType docDscr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.DocDscrType target = null;
                target = (edu.umich.icpsr.ddi.DocDscrType)get_store().find_element_user(DOCDSCR$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(docDscr);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "docDscr" element
         */
        public edu.umich.icpsr.ddi.DocDscrType insertNewDocDscr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.DocDscrType target = null;
                target = (edu.umich.icpsr.ddi.DocDscrType)get_store().insert_element_user(DOCDSCR$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "docDscr" element
         */
        public edu.umich.icpsr.ddi.DocDscrType addNewDocDscr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.DocDscrType target = null;
                target = (edu.umich.icpsr.ddi.DocDscrType)get_store().add_element_user(DOCDSCR$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "docDscr" element
         */
        public void removeDocDscr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOCDSCR$0, i);
            }
        }
        
        /**
         * Gets array of all "stdyDscr" elements
         */
        public edu.umich.icpsr.ddi.StdyDscrType[] getStdyDscrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STDYDSCR$2, targetList);
                edu.umich.icpsr.ddi.StdyDscrType[] result = new edu.umich.icpsr.ddi.StdyDscrType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "stdyDscr" element
         */
        public edu.umich.icpsr.ddi.StdyDscrType getStdyDscrArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.StdyDscrType target = null;
                target = (edu.umich.icpsr.ddi.StdyDscrType)get_store().find_element_user(STDYDSCR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "stdyDscr" element
         */
        public int sizeOfStdyDscrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STDYDSCR$2);
            }
        }
        
        /**
         * Sets array of all "stdyDscr" element
         */
        public void setStdyDscrArray(edu.umich.icpsr.ddi.StdyDscrType[] stdyDscrArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(stdyDscrArray, STDYDSCR$2);
            }
        }
        
        /**
         * Sets ith "stdyDscr" element
         */
        public void setStdyDscrArray(int i, edu.umich.icpsr.ddi.StdyDscrType stdyDscr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.StdyDscrType target = null;
                target = (edu.umich.icpsr.ddi.StdyDscrType)get_store().find_element_user(STDYDSCR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(stdyDscr);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "stdyDscr" element
         */
        public edu.umich.icpsr.ddi.StdyDscrType insertNewStdyDscr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.StdyDscrType target = null;
                target = (edu.umich.icpsr.ddi.StdyDscrType)get_store().insert_element_user(STDYDSCR$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "stdyDscr" element
         */
        public edu.umich.icpsr.ddi.StdyDscrType addNewStdyDscr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.StdyDscrType target = null;
                target = (edu.umich.icpsr.ddi.StdyDscrType)get_store().add_element_user(STDYDSCR$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "stdyDscr" element
         */
        public void removeStdyDscr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STDYDSCR$2, i);
            }
        }
        
        /**
         * Gets array of all "fileDscr" elements
         */
        public edu.umich.icpsr.ddi.FileDscrType[] getFileDscrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FILEDSCR$4, targetList);
                edu.umich.icpsr.ddi.FileDscrType[] result = new edu.umich.icpsr.ddi.FileDscrType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "fileDscr" element
         */
        public edu.umich.icpsr.ddi.FileDscrType getFileDscrArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.FileDscrType target = null;
                target = (edu.umich.icpsr.ddi.FileDscrType)get_store().find_element_user(FILEDSCR$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "fileDscr" element
         */
        public int sizeOfFileDscrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FILEDSCR$4);
            }
        }
        
        /**
         * Sets array of all "fileDscr" element
         */
        public void setFileDscrArray(edu.umich.icpsr.ddi.FileDscrType[] fileDscrArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fileDscrArray, FILEDSCR$4);
            }
        }
        
        /**
         * Sets ith "fileDscr" element
         */
        public void setFileDscrArray(int i, edu.umich.icpsr.ddi.FileDscrType fileDscr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.FileDscrType target = null;
                target = (edu.umich.icpsr.ddi.FileDscrType)get_store().find_element_user(FILEDSCR$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(fileDscr);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fileDscr" element
         */
        public edu.umich.icpsr.ddi.FileDscrType insertNewFileDscr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.FileDscrType target = null;
                target = (edu.umich.icpsr.ddi.FileDscrType)get_store().insert_element_user(FILEDSCR$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fileDscr" element
         */
        public edu.umich.icpsr.ddi.FileDscrType addNewFileDscr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.FileDscrType target = null;
                target = (edu.umich.icpsr.ddi.FileDscrType)get_store().add_element_user(FILEDSCR$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "fileDscr" element
         */
        public void removeFileDscr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FILEDSCR$4, i);
            }
        }
        
        /**
         * Gets array of all "dataDscr" elements
         */
        public edu.umich.icpsr.ddi.DataDscrType[] getDataDscrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DATADSCR$6, targetList);
                edu.umich.icpsr.ddi.DataDscrType[] result = new edu.umich.icpsr.ddi.DataDscrType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "dataDscr" element
         */
        public edu.umich.icpsr.ddi.DataDscrType getDataDscrArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.DataDscrType target = null;
                target = (edu.umich.icpsr.ddi.DataDscrType)get_store().find_element_user(DATADSCR$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "dataDscr" element
         */
        public int sizeOfDataDscrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DATADSCR$6);
            }
        }
        
        /**
         * Sets array of all "dataDscr" element
         */
        public void setDataDscrArray(edu.umich.icpsr.ddi.DataDscrType[] dataDscrArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(dataDscrArray, DATADSCR$6);
            }
        }
        
        /**
         * Sets ith "dataDscr" element
         */
        public void setDataDscrArray(int i, edu.umich.icpsr.ddi.DataDscrType dataDscr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.DataDscrType target = null;
                target = (edu.umich.icpsr.ddi.DataDscrType)get_store().find_element_user(DATADSCR$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(dataDscr);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dataDscr" element
         */
        public edu.umich.icpsr.ddi.DataDscrType insertNewDataDscr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.DataDscrType target = null;
                target = (edu.umich.icpsr.ddi.DataDscrType)get_store().insert_element_user(DATADSCR$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dataDscr" element
         */
        public edu.umich.icpsr.ddi.DataDscrType addNewDataDscr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.DataDscrType target = null;
                target = (edu.umich.icpsr.ddi.DataDscrType)get_store().add_element_user(DATADSCR$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "dataDscr" element
         */
        public void removeDataDscr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DATADSCR$6, i);
            }
        }
        
        /**
         * Gets array of all "otherMat" elements
         */
        public edu.umich.icpsr.ddi.OtherMatType[] getOtherMatArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OTHERMAT$8, targetList);
                edu.umich.icpsr.ddi.OtherMatType[] result = new edu.umich.icpsr.ddi.OtherMatType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "otherMat" element
         */
        public edu.umich.icpsr.ddi.OtherMatType getOtherMatArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.OtherMatType target = null;
                target = (edu.umich.icpsr.ddi.OtherMatType)get_store().find_element_user(OTHERMAT$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "otherMat" element
         */
        public int sizeOfOtherMatArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OTHERMAT$8);
            }
        }
        
        /**
         * Sets array of all "otherMat" element
         */
        public void setOtherMatArray(edu.umich.icpsr.ddi.OtherMatType[] otherMatArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(otherMatArray, OTHERMAT$8);
            }
        }
        
        /**
         * Sets ith "otherMat" element
         */
        public void setOtherMatArray(int i, edu.umich.icpsr.ddi.OtherMatType otherMat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.OtherMatType target = null;
                target = (edu.umich.icpsr.ddi.OtherMatType)get_store().find_element_user(OTHERMAT$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(otherMat);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "otherMat" element
         */
        public edu.umich.icpsr.ddi.OtherMatType insertNewOtherMat(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.OtherMatType target = null;
                target = (edu.umich.icpsr.ddi.OtherMatType)get_store().insert_element_user(OTHERMAT$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "otherMat" element
         */
        public edu.umich.icpsr.ddi.OtherMatType addNewOtherMat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.OtherMatType target = null;
                target = (edu.umich.icpsr.ddi.OtherMatType)get_store().add_element_user(OTHERMAT$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "otherMat" element
         */
        public void removeOtherMat(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OTHERMAT$8, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
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
                return get_store().find_attribute_user(ID$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
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
                target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$10);
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
                get_store().remove_attribute(ID$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$12);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$12);
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
                return get_store().find_attribute_user(XMLLANG$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(XMLLANG$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(XMLLANG$12);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(XMLLANG$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(XMLLANG$12);
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
                get_store().remove_attribute(XMLLANG$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$14);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$14);
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
                return get_store().find_attribute_user(LANG$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$14);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$14);
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
                get_store().remove_attribute(LANG$14);
            }
        }
        
        /**
         * Gets the "source" attribute
         */
        public edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source.Enum getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(SOURCE$16);
                }
                if (target == null)
                {
                    return null;
                }
                return (edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "source" attribute
         */
        public edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source xgetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source target = null;
                target = (edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source)get_store().find_attribute_user(SOURCE$16);
                if (target == null)
                {
                    target = (edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source)get_default_attribute_value(SOURCE$16);
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
                return get_store().find_attribute_user(SOURCE$16) != null;
            }
        }
        
        /**
         * Sets the "source" attribute
         */
        public void setSource(edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source.Enum source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SOURCE$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SOURCE$16);
                }
                target.setEnumValue(source);
            }
        }
        
        /**
         * Sets (as xml) the "source" attribute
         */
        public void xsetSource(edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source target = null;
                target = (edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source)get_store().find_attribute_user(SOURCE$16);
                if (target == null)
                {
                    target = (edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source)get_store().add_attribute_user(SOURCE$16);
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
                get_store().remove_attribute(SOURCE$16);
            }
        }
        
        /**
         * Gets the "version" attribute
         */
        public java.lang.String getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$18);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "version" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(VERSION$18);
                }
                return target;
            }
        }
        
        /**
         * True if has "version" attribute
         */
        public boolean isSetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VERSION$18) != null;
            }
        }
        
        /**
         * Sets the "version" attribute
         */
        public void setVersion(java.lang.String version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$18);
                }
                target.setStringValue(version);
            }
        }
        
        /**
         * Sets (as xml) the "version" attribute
         */
        public void xsetVersion(org.apache.xmlbeans.XmlString version)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$18);
                }
                target.set(version);
            }
        }
        
        /**
         * Unsets the "version" attribute
         */
        public void unsetVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VERSION$18);
            }
        }
        /**
         * An XML source(@).
         *
         * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CodeBookDocument$CodeBook$Source.
         */
        public static class SourceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source
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
}
