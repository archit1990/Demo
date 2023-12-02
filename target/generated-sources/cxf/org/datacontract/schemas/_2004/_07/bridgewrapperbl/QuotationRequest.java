
package org.datacontract.schemas._2004._07.bridgewrapperbl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuotationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotationRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/BridgeWrapperBL}clsRequestProperties"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InputXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsBankDataRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCutomerAddressRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsFinanciarDataRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsIntermediaryDataRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsManufacturerMappingRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsModelMappingRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRTOMappingRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSerIntermediaryDataRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ModeOfOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OldProposalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuotationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuotationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotationRequest", propOrder = {
    "inputXML",
    "isBankDataRequired",
    "isCutomerAddressRequired",
    "isFinanciarDataRequired",
    "isIntermediaryDataRequired",
    "isManufacturerMappingRequired",
    "isModelMappingRequired",
    "isRTOMappingRequired",
    "isSerIntermediaryDataRequired",
    "modeOfOperation",
    "oldProposalNumber",
    "quotationNumber",
    "quotationVersion",
    "userId",
    "userRole",
    "vehicleClassCode"
})
public class QuotationRequest
    extends ClsRequestProperties
{

    @XmlElementRef(name = "InputXML", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputXML;
    @XmlElement(name = "IsBankDataRequired")
    protected Boolean isBankDataRequired;
    @XmlElement(name = "IsCutomerAddressRequired")
    protected Boolean isCutomerAddressRequired;
    @XmlElement(name = "IsFinanciarDataRequired")
    protected Boolean isFinanciarDataRequired;
    @XmlElement(name = "IsIntermediaryDataRequired")
    protected Boolean isIntermediaryDataRequired;
    @XmlElement(name = "IsManufacturerMappingRequired")
    protected Boolean isManufacturerMappingRequired;
    @XmlElement(name = "IsModelMappingRequired")
    protected Boolean isModelMappingRequired;
    @XmlElement(name = "IsRTOMappingRequired")
    protected Boolean isRTOMappingRequired;
    @XmlElement(name = "IsSerIntermediaryDataRequired")
    protected Boolean isSerIntermediaryDataRequired;
    @XmlElementRef(name = "ModeOfOperation", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modeOfOperation;
    @XmlElementRef(name = "OldProposalNumber", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oldProposalNumber;
    @XmlElementRef(name = "QuotationNumber", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quotationNumber;
    @XmlElementRef(name = "QuotationVersion", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quotationVersion;
    @XmlElementRef(name = "UserId", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userId;
    @XmlElementRef(name = "UserRole", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userRole;
    @XmlElementRef(name = "VehicleClassCode", namespace = "http://schemas.datacontract.org/2004/07/BridgeWrapperBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleClassCode;

    /**
     * Gets the value of the inputXML property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInputXML() {
        return inputXML;
    }

    /**
     * Sets the value of the inputXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInputXML(JAXBElement<String> value) {
        this.inputXML = value;
    }

    /**
     * Gets the value of the isBankDataRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBankDataRequired() {
        return isBankDataRequired;
    }

    /**
     * Sets the value of the isBankDataRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBankDataRequired(Boolean value) {
        this.isBankDataRequired = value;
    }

    /**
     * Gets the value of the isCutomerAddressRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCutomerAddressRequired() {
        return isCutomerAddressRequired;
    }

    /**
     * Sets the value of the isCutomerAddressRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCutomerAddressRequired(Boolean value) {
        this.isCutomerAddressRequired = value;
    }

    /**
     * Gets the value of the isFinanciarDataRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFinanciarDataRequired() {
        return isFinanciarDataRequired;
    }

    /**
     * Sets the value of the isFinanciarDataRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFinanciarDataRequired(Boolean value) {
        this.isFinanciarDataRequired = value;
    }

    /**
     * Gets the value of the isIntermediaryDataRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIntermediaryDataRequired() {
        return isIntermediaryDataRequired;
    }

    /**
     * Sets the value of the isIntermediaryDataRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIntermediaryDataRequired(Boolean value) {
        this.isIntermediaryDataRequired = value;
    }

    /**
     * Gets the value of the isManufacturerMappingRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsManufacturerMappingRequired() {
        return isManufacturerMappingRequired;
    }

    /**
     * Sets the value of the isManufacturerMappingRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsManufacturerMappingRequired(Boolean value) {
        this.isManufacturerMappingRequired = value;
    }

    /**
     * Gets the value of the isModelMappingRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsModelMappingRequired() {
        return isModelMappingRequired;
    }

    /**
     * Sets the value of the isModelMappingRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsModelMappingRequired(Boolean value) {
        this.isModelMappingRequired = value;
    }

    /**
     * Gets the value of the isRTOMappingRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRTOMappingRequired() {
        return isRTOMappingRequired;
    }

    /**
     * Sets the value of the isRTOMappingRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRTOMappingRequired(Boolean value) {
        this.isRTOMappingRequired = value;
    }

    /**
     * Gets the value of the isSerIntermediaryDataRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSerIntermediaryDataRequired() {
        return isSerIntermediaryDataRequired;
    }

    /**
     * Sets the value of the isSerIntermediaryDataRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSerIntermediaryDataRequired(Boolean value) {
        this.isSerIntermediaryDataRequired = value;
    }

    /**
     * Gets the value of the modeOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModeOfOperation() {
        return modeOfOperation;
    }

    /**
     * Sets the value of the modeOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModeOfOperation(JAXBElement<String> value) {
        this.modeOfOperation = value;
    }

    /**
     * Gets the value of the oldProposalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOldProposalNumber() {
        return oldProposalNumber;
    }

    /**
     * Sets the value of the oldProposalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOldProposalNumber(JAXBElement<String> value) {
        this.oldProposalNumber = value;
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
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserId(JAXBElement<String> value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserRole(JAXBElement<String> value) {
        this.userRole = value;
    }

    /**
     * Gets the value of the vehicleClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleClassCode() {
        return vehicleClassCode;
    }

    /**
     * Sets the value of the vehicleClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleClassCode(JAXBElement<String> value) {
        this.vehicleClassCode = value;
    }

}
