
package org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.gccustomerportalbl.ServiceResult;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="strLVAuthToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objServiceResult" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}ServiceResult" minOccurs="0"/&gt;
 *         &lt;element name="str_num_claim_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strfile_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strfile_extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="byte_stream" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "strLVAuthToken",
    "objServiceResult",
    "strNumClaimCode",
    "strfileName",
    "strfileExtension",
    "byteStream"
})
@XmlRootElement(name = "UploadClaimFile")
public class UploadClaimFile {

    @XmlElementRef(name = "strLVAuthToken", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strLVAuthToken;
    @XmlElementRef(name = "objServiceResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceResult> objServiceResult;
    @XmlElementRef(name = "str_num_claim_code", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strNumClaimCode;
    @XmlElementRef(name = "strfile_name", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strfileName;
    @XmlElementRef(name = "strfile_extension", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strfileExtension;
    @XmlElementRef(name = "byte_stream", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> byteStream;

    /**
     * Gets the value of the strLVAuthToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrLVAuthToken() {
        return strLVAuthToken;
    }

    /**
     * Sets the value of the strLVAuthToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrLVAuthToken(JAXBElement<String> value) {
        this.strLVAuthToken = value;
    }

    /**
     * Gets the value of the objServiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     *     
     */
    public JAXBElement<ServiceResult> getObjServiceResult() {
        return objServiceResult;
    }

    /**
     * Sets the value of the objServiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     *     
     */
    public void setObjServiceResult(JAXBElement<ServiceResult> value) {
        this.objServiceResult = value;
    }

    /**
     * Gets the value of the strNumClaimCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrNumClaimCode() {
        return strNumClaimCode;
    }

    /**
     * Sets the value of the strNumClaimCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrNumClaimCode(JAXBElement<String> value) {
        this.strNumClaimCode = value;
    }

    /**
     * Gets the value of the strfileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrfileName() {
        return strfileName;
    }

    /**
     * Sets the value of the strfileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrfileName(JAXBElement<String> value) {
        this.strfileName = value;
    }

    /**
     * Gets the value of the strfileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrfileExtension() {
        return strfileExtension;
    }

    /**
     * Sets the value of the strfileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrfileExtension(JAXBElement<String> value) {
        this.strfileExtension = value;
    }

    /**
     * Gets the value of the byteStream property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getByteStream() {
        return byteStream;
    }

    /**
     * Sets the value of the byteStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setByteStream(JAXBElement<byte[]> value) {
        this.byteStream = value;
    }

}
