
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
 *         &lt;element name="GetRenewalNoticeHtmlResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objServiceResult" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}ServiceResult" minOccurs="0"/&gt;
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
    "getRenewalNoticeHtmlResult",
    "objServiceResult"
})
@XmlRootElement(name = "GetRenewalNoticeHtmlResponse")
public class GetRenewalNoticeHtmlResponse {

    @XmlElementRef(name = "GetRenewalNoticeHtmlResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> getRenewalNoticeHtmlResult;
    @XmlElementRef(name = "objServiceResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceResult> objServiceResult;

    /**
     * Gets the value of the getRenewalNoticeHtmlResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGetRenewalNoticeHtmlResult() {
        return getRenewalNoticeHtmlResult;
    }

    /**
     * Sets the value of the getRenewalNoticeHtmlResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGetRenewalNoticeHtmlResult(JAXBElement<String> value) {
        this.getRenewalNoticeHtmlResult = value;
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

}
