
package org.datacontract.schemas._2004._07.dbutility;

import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.dbutility package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DataObjectClass_QNAME = new QName("http://schemas.datacontract.org/2004/07/DbUtility", "DataObjectClass");
    private final static QName _DataObjectClassAuthenticateID_QNAME = new QName("http://schemas.datacontract.org/2004/07/DbUtility", "AuthenticateID");
    private final static QName _DataObjectClassContextSourceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/DbUtility", "ContextSourceType");
    private final static QName _DataObjectClassMessageID_QNAME = new QName("http://schemas.datacontract.org/2004/07/DbUtility", "MessageID");
    private final static QName _DataObjectClassTransactionID_QNAME = new QName("http://schemas.datacontract.org/2004/07/DbUtility", "TransactionID");
    private final static QName _DataObjectClassUserID_QNAME = new QName("http://schemas.datacontract.org/2004/07/DbUtility", "UserID");
    private final static QName _DataObjectClassObjCVHash_QNAME = new QName("http://schemas.datacontract.org/2004/07/DbUtility", "objCVHash");
    private final static QName _DataObjectClassObjOraDB_QNAME = new QName("http://schemas.datacontract.org/2004/07/DbUtility", "objOraDB");
    private final static QName _DataObjectClassStrCVAuthenticateId_QNAME = new QName("http://schemas.datacontract.org/2004/07/DbUtility", "strCVAuthenticateId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.dbutility
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataObjectClass }
     * 
     */
    public DataObjectClass createDataObjectClass() {
        return new DataObjectClass();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataObjectClass }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataObjectClass }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DbUtility", name = "DataObjectClass")
    public JAXBElement<DataObjectClass> createDataObjectClass(DataObjectClass value) {
        return new JAXBElement<DataObjectClass>(_DataObjectClass_QNAME, DataObjectClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DbUtility", name = "AuthenticateID", scope = DataObjectClass.class)
    public JAXBElement<String> createDataObjectClassAuthenticateID(String value) {
        return new JAXBElement<String>(_DataObjectClassAuthenticateID_QNAME, String.class, DataObjectClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DbUtility", name = "ContextSourceType", scope = DataObjectClass.class)
    public JAXBElement<String> createDataObjectClassContextSourceType(String value) {
        return new JAXBElement<String>(_DataObjectClassContextSourceType_QNAME, String.class, DataObjectClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DbUtility", name = "MessageID", scope = DataObjectClass.class)
    public JAXBElement<String> createDataObjectClassMessageID(String value) {
        return new JAXBElement<String>(_DataObjectClassMessageID_QNAME, String.class, DataObjectClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DbUtility", name = "TransactionID", scope = DataObjectClass.class)
    public JAXBElement<String> createDataObjectClassTransactionID(String value) {
        return new JAXBElement<String>(_DataObjectClassTransactionID_QNAME, String.class, DataObjectClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DbUtility", name = "UserID", scope = DataObjectClass.class)
    public JAXBElement<String> createDataObjectClassUserID(String value) {
        return new JAXBElement<String>(_DataObjectClassUserID_QNAME, String.class, DataObjectClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfanyTypeanyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfanyTypeanyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DbUtility", name = "objCVHash", scope = DataObjectClass.class)
    public JAXBElement<ArrayOfKeyValueOfanyTypeanyType> createDataObjectClassObjCVHash(ArrayOfKeyValueOfanyTypeanyType value) {
        return new JAXBElement<ArrayOfKeyValueOfanyTypeanyType>(_DataObjectClassObjCVHash_QNAME, ArrayOfKeyValueOfanyTypeanyType.class, DataObjectClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DbUtility", name = "objOraDB", scope = DataObjectClass.class)
    public JAXBElement<Object> createDataObjectClassObjOraDB(Object value) {
        return new JAXBElement<Object>(_DataObjectClassObjOraDB_QNAME, Object.class, DataObjectClass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DbUtility", name = "strCVAuthenticateId", scope = DataObjectClass.class)
    public JAXBElement<String> createDataObjectClassStrCVAuthenticateId(String value) {
        return new JAXBElement<String>(_DataObjectClassStrCVAuthenticateId_QNAME, String.class, DataObjectClass.class, value);
    }

}
