
package org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.bridgewrapperbl.QuotationRequest;


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
 *         &lt;element name="objRequest" type="{http://schemas.datacontract.org/2004/07/BridgeWrapperBL}QuotationRequest" minOccurs="0"/&gt;
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
    "objRequest"
})
@XmlRootElement(name = "QuoteToPolicy")
public class QuoteToPolicy {

    @XmlElementRef(name = "objRequest", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<QuotationRequest> objRequest;

    /**
     * Gets the value of the objRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QuotationRequest }{@code >}
     *     
     */
    public JAXBElement<QuotationRequest> getObjRequest() {
        return objRequest;
    }

    /**
     * Sets the value of the objRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QuotationRequest }{@code >}
     *     
     */
    public void setObjRequest(JAXBElement<QuotationRequest> value) {
        this.objRequest = value;
    }

}
