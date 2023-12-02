
package org.datacontract.schemas._2004._07.bridgewrapperbl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentEntryResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentEntryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/BridgeWrapperBL}clsResponseProperties"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndorsementPremium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndorsementSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndorsementServiceTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetPremium" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProposalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalPremium" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VoucherNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WarningText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkflowID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentEntryResponse", propOrder = {
    "endorsementPremium",
    "endorsementSI",
    "endorsementServiceTax",
    "errorText",
    "netPremium",
    "paymentID",
    "policyNumber",
    "proposalNumber",
    "responseXML",
    "serviceTax",
    "totalPremium",
    "voucherNumber",
    "warningText",
    "workflowID"
})
public class PaymentEntryResponse
    extends ClsResponseProperties
{

    @XmlElementRef(name = "EndorsementPremium", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endorsementPremium;
    @XmlElementRef(name = "EndorsementSI", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endorsementSI;
    @XmlElementRef(name = "EndorsementServiceTax", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endorsementServiceTax;
    @XmlElementRef(name = "ErrorText", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorText;
    @XmlElement(name = "NetPremium")
    protected Double netPremium;
    @XmlElementRef(name = "PaymentID", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentID;
    @XmlElementRef(name = "PolicyNumber", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNumber;
    @XmlElementRef(name = "ProposalNumber", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proposalNumber;
    @XmlElementRef(name = "ResponseXML", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseXML;
    @XmlElement(name = "ServiceTax")
    protected Double serviceTax;
    @XmlElement(name = "TotalPremium")
    protected Double totalPremium;
    @XmlElementRef(name = "VoucherNumber", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voucherNumber;
    @XmlElementRef(name = "WarningText", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warningText;
    @XmlElementRef(name = "WorkflowID", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workflowID;

    /**
     * Gets the value of the endorsementPremium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndorsementPremium() {
        return endorsementPremium;
    }

    /**
     * Sets the value of the endorsementPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndorsementPremium(JAXBElement<String> value) {
        this.endorsementPremium = value;
    }

    /**
     * Gets the value of the endorsementSI property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndorsementSI() {
        return endorsementSI;
    }

    /**
     * Sets the value of the endorsementSI property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndorsementSI(JAXBElement<String> value) {
        this.endorsementSI = value;
    }

    /**
     * Gets the value of the endorsementServiceTax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndorsementServiceTax() {
        return endorsementServiceTax;
    }

    /**
     * Sets the value of the endorsementServiceTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndorsementServiceTax(JAXBElement<String> value) {
        this.endorsementServiceTax = value;
    }

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
     * Gets the value of the paymentID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentID() {
        return paymentID;
    }

    /**
     * Sets the value of the paymentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentID(JAXBElement<String> value) {
        this.paymentID = value;
    }

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyNumber(JAXBElement<String> value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the proposalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProposalNumber() {
        return proposalNumber;
    }

    /**
     * Sets the value of the proposalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProposalNumber(JAXBElement<String> value) {
        this.proposalNumber = value;
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

    /**
     * Gets the value of the voucherNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoucherNumber() {
        return voucherNumber;
    }

    /**
     * Sets the value of the voucherNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoucherNumber(JAXBElement<String> value) {
        this.voucherNumber = value;
    }

    /**
     * Gets the value of the warningText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWarningText() {
        return warningText;
    }

    /**
     * Sets the value of the warningText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWarningText(JAXBElement<String> value) {
        this.warningText = value;
    }

    /**
     * Gets the value of the workflowID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkflowID() {
        return workflowID;
    }

    /**
     * Sets the value of the workflowID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkflowID(JAXBElement<String> value) {
        this.workflowID = value;
    }

}
