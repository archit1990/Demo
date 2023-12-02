
package org.datacontract.schemas._2004._07.gccustomerportalbl;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.StringBuilder;


/**
 * <p>Java class for clsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthenticateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsumeProposalXML" type="{http://schemas.datacontract.org/2004/07/System.Text}StringBuilder" minOccurs="0"/&gt;
 *         &lt;element name="InputXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsInternalRiskGrid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsWorkSheetRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ModeOfOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PolicyNoList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType" minOccurs="0"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsRequest", propOrder = {
    "authenticateKey",
    "consumeProposalXML",
    "inputXML",
    "isInternalRiskGrid",
    "isWorkSheetRequired",
    "modeOfOperation",
    "password",
    "policyNoList",
    "userId",
    "userRole"
})
public class ClsRequest {

    @XmlElementRef(name = "AuthenticateKey", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authenticateKey;
    @XmlElementRef(name = "ConsumeProposalXML", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<StringBuilder> consumeProposalXML;
    @XmlElementRef(name = "InputXML", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputXML;
    @XmlElement(name = "IsInternalRiskGrid")
    protected Boolean isInternalRiskGrid;
    @XmlElement(name = "IsWorkSheetRequired")
    protected Boolean isWorkSheetRequired;
    @XmlElementRef(name = "ModeOfOperation", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modeOfOperation;
    @XmlElementRef(name = "Password", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "PolicyNoList", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfanyType> policyNoList;
    @XmlElementRef(name = "UserId", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userId;
    @XmlElementRef(name = "UserRole", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userRole;

    /**
     * Gets the value of the authenticateKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthenticateKey() {
        return authenticateKey;
    }

    /**
     * Sets the value of the authenticateKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthenticateKey(JAXBElement<String> value) {
        this.authenticateKey = value;
    }

    /**
     * Gets the value of the consumeProposalXML property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     *     
     */
    public JAXBElement<StringBuilder> getConsumeProposalXML() {
        return consumeProposalXML;
    }

    /**
     * Sets the value of the consumeProposalXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     *     
     */
    public void setConsumeProposalXML(JAXBElement<StringBuilder> value) {
        this.consumeProposalXML = value;
    }

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
     * Gets the value of the isInternalRiskGrid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInternalRiskGrid() {
        return isInternalRiskGrid;
    }

    /**
     * Sets the value of the isInternalRiskGrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInternalRiskGrid(Boolean value) {
        this.isInternalRiskGrid = value;
    }

    /**
     * Gets the value of the isWorkSheetRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWorkSheetRequired() {
        return isWorkSheetRequired;
    }

    /**
     * Sets the value of the isWorkSheetRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWorkSheetRequired(Boolean value) {
        this.isWorkSheetRequired = value;
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
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Gets the value of the policyNoList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfanyType> getPolicyNoList() {
        return policyNoList;
    }

    /**
     * Sets the value of the policyNoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public void setPolicyNoList(JAXBElement<ArrayOfanyType> value) {
        this.policyNoList = value;
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

}
