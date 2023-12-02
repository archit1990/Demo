
package org.datacontract.schemas._2004._07.dbutility;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfanyTypeanyType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataObjectClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataObjectClass"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthenticateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContextSourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MessageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objCVHash" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfanyTypeanyType" minOccurs="0"/&gt;
 *         &lt;element name="objOraDB" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="strCVAuthenticateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataObjectClass", propOrder = {
    "authenticateID",
    "contextSourceType",
    "messageID",
    "transactionID",
    "userID",
    "objCVHash",
    "objOraDB",
    "strCVAuthenticateId"
})
public class DataObjectClass {

    @XmlElementRef(name = "AuthenticateID", namespace = "http://schemas.datacontract.org/2004/07/DbUtility", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authenticateID;
    @XmlElementRef(name = "ContextSourceType", namespace = "http://schemas.datacontract.org/2004/07/DbUtility", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contextSourceType;
    @XmlElementRef(name = "MessageID", namespace = "http://schemas.datacontract.org/2004/07/DbUtility", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messageID;
    @XmlElementRef(name = "TransactionID", namespace = "http://schemas.datacontract.org/2004/07/DbUtility", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionID;
    @XmlElementRef(name = "UserID", namespace = "http://schemas.datacontract.org/2004/07/DbUtility", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userID;
    @XmlElementRef(name = "objCVHash", namespace = "http://schemas.datacontract.org/2004/07/DbUtility", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfanyTypeanyType> objCVHash;
    @XmlElementRef(name = "objOraDB", namespace = "http://schemas.datacontract.org/2004/07/DbUtility", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> objOraDB;
    @XmlElementRef(name = "strCVAuthenticateId", namespace = "http://schemas.datacontract.org/2004/07/DbUtility", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strCVAuthenticateId;

    /**
     * Gets the value of the authenticateID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthenticateID() {
        return authenticateID;
    }

    /**
     * Sets the value of the authenticateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthenticateID(JAXBElement<String> value) {
        this.authenticateID = value;
    }

    /**
     * Gets the value of the contextSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContextSourceType() {
        return contextSourceType;
    }

    /**
     * Sets the value of the contextSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContextSourceType(JAXBElement<String> value) {
        this.contextSourceType = value;
    }

    /**
     * Gets the value of the messageID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageID() {
        return messageID;
    }

    /**
     * Sets the value of the messageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageID(JAXBElement<String> value) {
        this.messageID = value;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionID(JAXBElement<String> value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserID(JAXBElement<String> value) {
        this.userID = value;
    }

    /**
     * Gets the value of the objCVHash property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfanyTypeanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfanyTypeanyType> getObjCVHash() {
        return objCVHash;
    }

    /**
     * Sets the value of the objCVHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfanyTypeanyType }{@code >}
     *     
     */
    public void setObjCVHash(JAXBElement<ArrayOfKeyValueOfanyTypeanyType> value) {
        this.objCVHash = value;
    }

    /**
     * Gets the value of the objOraDB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getObjOraDB() {
        return objOraDB;
    }

    /**
     * Sets the value of the objOraDB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setObjOraDB(JAXBElement<Object> value) {
        this.objOraDB = value;
    }

    /**
     * Gets the value of the strCVAuthenticateId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrCVAuthenticateId() {
        return strCVAuthenticateId;
    }

    /**
     * Sets the value of the strCVAuthenticateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrCVAuthenticateId(JAXBElement<String> value) {
        this.strCVAuthenticateId = value;
    }

}
