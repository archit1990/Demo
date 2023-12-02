
package org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.gccustomerportalbl.ClsRequest;


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
 *         &lt;element name="objRequest" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}clsRequest" minOccurs="0"/&gt;
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
    "objRequest"
})
@XmlRootElement(name = "QuickEndorsement")
public class QuickEndorsement {

    @XmlElementRef(name = "strLVAuthToken", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strLVAuthToken;
    @XmlElementRef(name = "objRequest", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ClsRequest> objRequest;

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
     * Gets the value of the objRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClsRequest }{@code >}
     *     
     */
    public JAXBElement<ClsRequest> getObjRequest() {
        return objRequest;
    }

    /**
     * Sets the value of the objRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClsRequest }{@code >}
     *     
     */
    public void setObjRequest(JAXBElement<ClsRequest> value) {
        this.objRequest = value;
    }

}
