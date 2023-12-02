
package org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="strPolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strEngineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strChasisNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "strPolicyNumber",
    "strEngineNumber",
    "strChasisNumber",
    "strRegistrationNumber"
})
@XmlRootElement(name = "GetSearchView")
public class GetSearchView {

    @XmlElementRef(name = "strLVAuthToken", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strLVAuthToken;
    @XmlElementRef(name = "strPolicyNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strPolicyNumber;
    @XmlElementRef(name = "strEngineNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strEngineNumber;
    @XmlElementRef(name = "strChasisNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strChasisNumber;
    @XmlElementRef(name = "strRegistrationNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strRegistrationNumber;

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
     * Gets the value of the strPolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrPolicyNumber() {
        return strPolicyNumber;
    }

    /**
     * Sets the value of the strPolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrPolicyNumber(JAXBElement<String> value) {
        this.strPolicyNumber = value;
    }

    /**
     * Gets the value of the strEngineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrEngineNumber() {
        return strEngineNumber;
    }

    /**
     * Sets the value of the strEngineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrEngineNumber(JAXBElement<String> value) {
        this.strEngineNumber = value;
    }

    /**
     * Gets the value of the strChasisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrChasisNumber() {
        return strChasisNumber;
    }

    /**
     * Sets the value of the strChasisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrChasisNumber(JAXBElement<String> value) {
        this.strChasisNumber = value;
    }

    /**
     * Gets the value of the strRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrRegistrationNumber() {
        return strRegistrationNumber;
    }

    /**
     * Sets the value of the strRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrRegistrationNumber(JAXBElement<String> value) {
        this.strRegistrationNumber = value;
    }

}
