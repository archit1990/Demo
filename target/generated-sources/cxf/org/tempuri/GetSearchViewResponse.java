
package org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.gccustomerportalbl.SearchResult;


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
 *         &lt;element name="GetSearchViewResult" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}SearchResult" minOccurs="0"/&gt;
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
    "getSearchViewResult"
})
@XmlRootElement(name = "GetSearchViewResponse")
public class GetSearchViewResponse {

    @XmlElementRef(name = "GetSearchViewResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<SearchResult> getSearchViewResult;

    /**
     * Gets the value of the getSearchViewResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SearchResult }{@code >}
     *     
     */
    public JAXBElement<SearchResult> getGetSearchViewResult() {
        return getSearchViewResult;
    }

    /**
     * Sets the value of the getSearchViewResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SearchResult }{@code >}
     *     
     */
    public void setGetSearchViewResult(JAXBElement<SearchResult> value) {
        this.getSearchViewResult = value;
    }

}
