
package org.datacontract.schemas._2004._07.bridgewrapperbl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/BridgeWrapperBL}clsResponseProperties"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetPremium" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="QuotationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuotationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalPremium" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotationResponse", propOrder = {
    "errorText",
    "netPremium",
    "quotationNumber",
    "quotationVersion",
    "referenceNumber",
    "responseXML",
    "serviceTax",
    "totalPremium"
})
public class QuotationResponse
    extends ClsResponseProperties
{

    @XmlElementRef(name = "ErrorText", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorText;
    @XmlElement(name = "NetPremium")
    protected Double netPremium;
    @XmlElementRef(name = "QuotationNumber", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quotationNumber;
    @XmlElementRef(name = "QuotationVersion", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quotationVersion;
    @XmlElementRef(name = "ReferenceNumber", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceNumber;
    @XmlElementRef(name = "ResponseXML", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseXML;
    @XmlElement(name = "ServiceTax")
    protected Double serviceTax;
    @XmlElement(name = "TotalPremium")
    protected Double totalPremium;

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorText(JAXBElement<String> value) {
        this.errorText = value;
    }

    /**
     * Gets the value of the netPremium property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNetPremium() {
        return netPremium;
    }

    /**
     * Sets the value of the netPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNetPremium(Double value) {
        this.netPremium = value;
    }

    /**
     * Gets the value of the quotationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuotationNumber() {
        return quotationNumber;
    }

    /**
     * Sets the value of the quotationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuotationNumber(JAXBElement<String> value) {
        this.quotationNumber = value;
    }

    /**
     * Gets the value of the quotationVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuotationVersion() {
        return quotationVersion;
    }

    /**
     * Sets the value of the quotationVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuotationVersion(JAXBElement<String> value) {
        this.quotationVersion = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceNumber(JAXBElement<String> value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the responseXML property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseXML() {
        return responseXML;
    }

    /**
     * Sets the value of the responseXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseXML(JAXBElement<String> value) {
        this.responseXML = value;
    }

    /**
     * Gets the value of the serviceTax property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getServiceTax() {
        return serviceTax;
    }

    /**
     * Sets the value of the serviceTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setServiceTax(Double value) {
        this.serviceTax = value;
    }

    /**
     * Gets the value of the totalPremium property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalPremium() {
        return totalPremium;
    }

    /**
     * Sets the value of the totalPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalPremium(Double value) {
        this.totalPremium = value;
    }

}
