
package org.datacontract.schemas._2004._07.gccustomerportalbl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserData" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}clsUserData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResult", propOrder = {
    "userData"
})
public class ServiceResult {

    @XmlElementRef(name = "UserData", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<ClsUserData> userData;

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ClsUserData }{@code >}
     *     
     */
    public JAXBElement<ClsUserData> getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ClsUserData }{@code >}
     *     
     */
    public void setUserData(JAXBElement<ClsUserData> value) {
        this.userData = value;
    }

}
