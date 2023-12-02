
package org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.bridgewrapperbl.QuotationResponse;


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
 *         &lt;element name="QuickQuoteResult" type="{http://schemas.datacontract.org/2004/07/BridgeWrapperBL}QuotationResponse" minOccurs="0"/&gt;
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
    "quickQuoteResult"
})
@XmlRootElement(name = "QuickQuoteResponse")
public class QuickQuoteResponse {

    @XmlElementRef(name = "QuickQuoteResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuotationResponse> quickQuoteResult;

    /**
     * Gets the value of the quickQuoteResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuotationResponse }{@code >}
     *     
     */
    public JAXBElement<QuotationResponse> getQuickQuoteResult() {
        return quickQuoteResult;
    }

    /**
     * Sets the value of the quickQuoteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuotationResponse }{@code >}
     *     
     */
    public void setQuickQuoteResult(JAXBElement<QuotationResponse> value) {
        this.quickQuoteResult = value;
    }

}
