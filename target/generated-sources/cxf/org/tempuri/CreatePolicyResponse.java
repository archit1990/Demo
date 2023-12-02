
package org.tempuri;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.bridgewrapperbl.PolicyResponse;


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
 *         &lt;element name="CreatePolicyResult" type="{http://schemas.datacontract.org/2004/07/BridgeWrapperBL}PolicyResponse" minOccurs="0"/&gt;
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
    "createPolicyResult"
})
@XmlRootElement(name = "CreatePolicyResponse")
public class CreatePolicyResponse {

    @XmlElementRef(name = "CreatePolicyResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<PolicyResponse> createPolicyResult;

    /**
     * Gets the value of the createPolicyResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PolicyResponse }{@code >}
     *     
     */
    public JAXBElement<PolicyResponse> getCreatePolicyResult() {
        return createPolicyResult;
    }

    /**
     * Sets the value of the createPolicyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PolicyResponse }{@code >}
     *     
     */
    public void setCreatePolicyResult(JAXBElement<PolicyResponse> value) {
        this.createPolicyResult = value;
    }

}
