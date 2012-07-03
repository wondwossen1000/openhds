/*
 * An XML document type.
 * Localname: codeBook
 * Namespace: http://www.icpsr.umich.edu/DDI
 * Java type: edu.umich.icpsr.ddi.CodeBookDocument
 *
 * Automatically generated - do not modify.
 */
package edu.umich.icpsr.ddi;


/**
 * A document containing one codeBook(@http://www.icpsr.umich.edu/DDI) element.
 *
 * This is a complex type.
 */
public interface CodeBookDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodeBookDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("codebook5587doctype");
    
    /**
     * Gets the "codeBook" element
     */
    edu.umich.icpsr.ddi.CodeBookDocument.CodeBook getCodeBook();
    
    /**
     * Sets the "codeBook" element
     */
    void setCodeBook(edu.umich.icpsr.ddi.CodeBookDocument.CodeBook codeBook);
    
    /**
     * Appends and returns a new empty "codeBook" element
     */
    edu.umich.icpsr.ddi.CodeBookDocument.CodeBook addNewCodeBook();
    
    /**
     * An XML codeBook(@http://www.icpsr.umich.edu/DDI).
     *
     * This is a complex type.
     */
    public interface CodeBook extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodeBook.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("codebookee19elemtype");
        
        /**
         * Gets array of all "docDscr" elements
         */
        edu.umich.icpsr.ddi.DocDscrType[] getDocDscrArray();
        
        /**
         * Gets ith "docDscr" element
         */
        edu.umich.icpsr.ddi.DocDscrType getDocDscrArray(int i);
        
        /**
         * Returns number of "docDscr" element
         */
        int sizeOfDocDscrArray();
        
        /**
         * Sets array of all "docDscr" element
         */
        void setDocDscrArray(edu.umich.icpsr.ddi.DocDscrType[] docDscrArray);
        
        /**
         * Sets ith "docDscr" element
         */
        void setDocDscrArray(int i, edu.umich.icpsr.ddi.DocDscrType docDscr);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "docDscr" element
         */
        edu.umich.icpsr.ddi.DocDscrType insertNewDocDscr(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "docDscr" element
         */
        edu.umich.icpsr.ddi.DocDscrType addNewDocDscr();
        
        /**
         * Removes the ith "docDscr" element
         */
        void removeDocDscr(int i);
        
        /**
         * Gets array of all "stdyDscr" elements
         */
        edu.umich.icpsr.ddi.StdyDscrType[] getStdyDscrArray();
        
        /**
         * Gets ith "stdyDscr" element
         */
        edu.umich.icpsr.ddi.StdyDscrType getStdyDscrArray(int i);
        
        /**
         * Returns number of "stdyDscr" element
         */
        int sizeOfStdyDscrArray();
        
        /**
         * Sets array of all "stdyDscr" element
         */
        void setStdyDscrArray(edu.umich.icpsr.ddi.StdyDscrType[] stdyDscrArray);
        
        /**
         * Sets ith "stdyDscr" element
         */
        void setStdyDscrArray(int i, edu.umich.icpsr.ddi.StdyDscrType stdyDscr);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "stdyDscr" element
         */
        edu.umich.icpsr.ddi.StdyDscrType insertNewStdyDscr(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "stdyDscr" element
         */
        edu.umich.icpsr.ddi.StdyDscrType addNewStdyDscr();
        
        /**
         * Removes the ith "stdyDscr" element
         */
        void removeStdyDscr(int i);
        
        /**
         * Gets array of all "fileDscr" elements
         */
        edu.umich.icpsr.ddi.FileDscrType[] getFileDscrArray();
        
        /**
         * Gets ith "fileDscr" element
         */
        edu.umich.icpsr.ddi.FileDscrType getFileDscrArray(int i);
        
        /**
         * Returns number of "fileDscr" element
         */
        int sizeOfFileDscrArray();
        
        /**
         * Sets array of all "fileDscr" element
         */
        void setFileDscrArray(edu.umich.icpsr.ddi.FileDscrType[] fileDscrArray);
        
        /**
         * Sets ith "fileDscr" element
         */
        void setFileDscrArray(int i, edu.umich.icpsr.ddi.FileDscrType fileDscr);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "fileDscr" element
         */
        edu.umich.icpsr.ddi.FileDscrType insertNewFileDscr(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "fileDscr" element
         */
        edu.umich.icpsr.ddi.FileDscrType addNewFileDscr();
        
        /**
         * Removes the ith "fileDscr" element
         */
        void removeFileDscr(int i);
        
        /**
         * Gets array of all "dataDscr" elements
         */
        edu.umich.icpsr.ddi.DataDscrType[] getDataDscrArray();
        
        /**
         * Gets ith "dataDscr" element
         */
        edu.umich.icpsr.ddi.DataDscrType getDataDscrArray(int i);
        
        /**
         * Returns number of "dataDscr" element
         */
        int sizeOfDataDscrArray();
        
        /**
         * Sets array of all "dataDscr" element
         */
        void setDataDscrArray(edu.umich.icpsr.ddi.DataDscrType[] dataDscrArray);
        
        /**
         * Sets ith "dataDscr" element
         */
        void setDataDscrArray(int i, edu.umich.icpsr.ddi.DataDscrType dataDscr);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "dataDscr" element
         */
        edu.umich.icpsr.ddi.DataDscrType insertNewDataDscr(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "dataDscr" element
         */
        edu.umich.icpsr.ddi.DataDscrType addNewDataDscr();
        
        /**
         * Removes the ith "dataDscr" element
         */
        void removeDataDscr(int i);
        
        /**
         * Gets array of all "otherMat" elements
         */
        edu.umich.icpsr.ddi.OtherMatType[] getOtherMatArray();
        
        /**
         * Gets ith "otherMat" element
         */
        edu.umich.icpsr.ddi.OtherMatType getOtherMatArray(int i);
        
        /**
         * Returns number of "otherMat" element
         */
        int sizeOfOtherMatArray();
        
        /**
         * Sets array of all "otherMat" element
         */
        void setOtherMatArray(edu.umich.icpsr.ddi.OtherMatType[] otherMatArray);
        
        /**
         * Sets ith "otherMat" element
         */
        void setOtherMatArray(int i, edu.umich.icpsr.ddi.OtherMatType otherMat);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "otherMat" element
         */
        edu.umich.icpsr.ddi.OtherMatType insertNewOtherMat(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "otherMat" element
         */
        edu.umich.icpsr.ddi.OtherMatType addNewOtherMat();
        
        /**
         * Removes the ith "otherMat" element
         */
        void removeOtherMat(int i);
        
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
        edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source.Enum getSource();
        
        /**
         * Gets (as xml) the "source" attribute
         */
        edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source xgetSource();
        
        /**
         * True if has "source" attribute
         */
        boolean isSetSource();
        
        /**
         * Sets the "source" attribute
         */
        void setSource(edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source.Enum source);
        
        /**
         * Sets (as xml) the "source" attribute
         */
        void xsetSource(edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source source);
        
        /**
         * Unsets the "source" attribute
         */
        void unsetSource();
        
        /**
         * Gets the "version" attribute
         */
        java.lang.String getVersion();
        
        /**
         * Gets (as xml) the "version" attribute
         */
        org.apache.xmlbeans.XmlString xgetVersion();
        
        /**
         * True if has "version" attribute
         */
        boolean isSetVersion();
        
        /**
         * Sets the "version" attribute
         */
        void setVersion(java.lang.String version);
        
        /**
         * Sets (as xml) the "version" attribute
         */
        void xsetVersion(org.apache.xmlbeans.XmlString version);
        
        /**
         * Unsets the "version" attribute
         */
        void unsetVersion();
        
        /**
         * An XML source(@).
         *
         * This is an atomic type that is a restriction of edu.umich.icpsr.ddi.CodeBookDocument$CodeBook$Source.
         */
        public interface Source extends org.apache.xmlbeans.XmlNMTOKEN
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Source.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5FFD1212A0C2D08A804E0059631A02E2").resolveHandle("source11beattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum ARCHIVE = Enum.forString("archive");
            static final Enum PRODUCER = Enum.forString("producer");
            
            static final int INT_ARCHIVE = Enum.INT_ARCHIVE;
            static final int INT_PRODUCER = Enum.INT_PRODUCER;
            
            /**
             * Enumeration value class for edu.umich.icpsr.ddi.CodeBookDocument$CodeBook$Source.
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
                public static edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source newValue(java.lang.Object obj) {
                  return (edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source) type.newValue( obj ); }
                
                public static edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source newInstance() {
                  return (edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (edu.umich.icpsr.ddi.CodeBookDocument.CodeBook.Source) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static edu.umich.icpsr.ddi.CodeBookDocument.CodeBook newInstance() {
              return (edu.umich.icpsr.ddi.CodeBookDocument.CodeBook) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static edu.umich.icpsr.ddi.CodeBookDocument.CodeBook newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (edu.umich.icpsr.ddi.CodeBookDocument.CodeBook) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static edu.umich.icpsr.ddi.CodeBookDocument newInstance() {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static edu.umich.icpsr.ddi.CodeBookDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static edu.umich.icpsr.ddi.CodeBookDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (edu.umich.icpsr.ddi.CodeBookDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
