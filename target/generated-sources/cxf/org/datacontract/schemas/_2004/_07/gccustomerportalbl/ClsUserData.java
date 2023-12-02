
package org.datacontract.schemas._2004._07.gccustomerportalbl;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.dbutility.DataObjectClass;
import org.datacontract.schemas._2004._07.system.StringBuilder;


/**
 * <p>Java class for clsUserData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsUserData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualPaymentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualProductIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActualTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicableDocs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicableDocuments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuthenticateKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AutoAcceptedVoucherNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BGTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankBanchAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankBranchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BasisOfRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BlockID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BodyColour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessSourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CGSTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CNGLPGKitValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CallEnv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CallLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Campaign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChassisNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChequeDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChequeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityDistrictFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClaimDocCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClaimNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsumeProposalXML" type="{http://schemas.datacontract.org/2004/07/System.Text}StringBuilder" minOccurs="0"/&gt;
 *         &lt;element name="CurrentBasicODPremium" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CurrentBasicTPPremium" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CurrentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentIDV" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CurrentNetODPremium" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CurrentNetTPPremium" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="CustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DDDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatabaseObjectClasss" type="{http://schemas.datacontract.org/2004/07/DbUtility}DataObjectClass" minOccurs="0"/&gt;
 *         &lt;element name="DaysofTravel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeptNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DetariffDiscountRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DisplayStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocSatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DocSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ECoverNoteHTML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ECoverNotePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EQZone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ElectricalAccessories" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndorsementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndorsementPremium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndorsementSI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndorsementServiceTax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndorsementType" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}clsUserData.EndorsementTypeDetails" minOccurs="0"/&gt;
 *         &lt;element name="EndorsementTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EngineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorLogFilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}ArrayOfclsDictionary" minOccurs="0"/&gt;
 *         &lt;element name="ErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExShowroomPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtrnalyBuiltBodyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FilePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinancierAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinancierCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinancierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinancierDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinancierName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinancierPinCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinancierState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FleetAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FleetDiscount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GLMRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GroupXML" type="{http://schemas.datacontract.org/2004/07/System.Text}StringBuilder" minOccurs="0"/&gt;
 *         &lt;element name="HostAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ICN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IFSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IGSTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Info1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Info2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Info3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Info4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Info5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InputXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsertDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InsertTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InspUserDataGrid" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}ArrayOfclsInspUserData" minOccurs="0"/&gt;
 *         &lt;element name="InspectionAgencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InspectionAgencyEmailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InspectionAgencyLandlineNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InspectionAgencyMobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InspectionAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InspectionAuthority" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="InspectionAuthoritySelected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InspectionOverride" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InspectionRequestDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InspectionRequestTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InspectionStatus" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="InspectionStatusSelected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstrumentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntermediaryID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntermediaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IntermediaryRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsCDAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCommercialPCV" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCommercialTrailer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCommercialVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsCustomerDetailsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsInternalRiskGrid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMappedProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMultiYearPolicy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMultiYearPolicyFetch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsNewPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsProposalFetchTypeRenewal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsRequiredForamtedUserXML" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsValidUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsWorkSheetRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="JobErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KCessAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="LVGIPortalType" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}clsUserData.PortalType" minOccurs="0"/&gt;
 *         &lt;element name="LeadNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineofBusinessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineofBusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocalHouseBankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MICRCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailSender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManualCoverNoteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarketingOfficerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarketingOfficerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MethodAccountsTracker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MethodCallingTracker" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MigratedPolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModeOfOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModifyTransId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MsgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NetPremium" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NewCustPolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NewGCPolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NonElectricalAccessories" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ODDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ODLoading" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ObsoleteVehicle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OccupationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OdometerReading" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OldCustPolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OldGCPolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OldProposalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OldProposalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OptionalParameter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OverrideFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PageAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParameterType" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}clsUserData.ReportParameterType" minOccurs="0"/&gt;
 *         &lt;element name="ParentOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerCustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PayerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentIdStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PolicyAlreadyGenerated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PolicyDocCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PolicyDocumentDtls" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}ArrayOfclsUWDocServiceResult" minOccurs="0"/&gt;
 *         &lt;element name="PolicyNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PolicyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PolicyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousPolicyExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProposalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProposalGenerationMode" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}clsUserData.ProposalMode" minOccurs="0"/&gt;
 *         &lt;element name="ProposalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProposalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProposalTransactionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProposalTransactionTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuotationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QuotationVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptMailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecordStatus1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceNo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceNo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceNo3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportAsPDF" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReportGenerationType" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}clsUserData.ReportType" minOccurs="0"/&gt;
 *         &lt;element name="ReportHtmlString" type="{http://schemas.datacontract.org/2004/07/System.Text}StringBuilder" minOccurs="0"/&gt;
 *         &lt;element name="ReportTemplateNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetSqlQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RiskDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RiskEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RiskSerialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RiskStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RowCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RsnForCancellation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RuleErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SGSTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="SQLQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaveType" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}clsUserData.SaveModeType" minOccurs="0"/&gt;
 *         &lt;element name="SenderMailId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceConsumer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceErrorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StampDuty" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TPDiscount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TPLoading" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalPremium" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalSI" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TotalSumInsured" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrailerIDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UGSTAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UWDocDtlsGrid" type="{http://schemas.datacontract.org/2004/07/GCCustomerPortalBL}ArrayOfclsUWDocServiceResult" minOccurs="0"/&gt;
 *         &lt;element name="UploadedFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserObjectTemplate" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="UserObjectTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserResultXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleInspection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleRegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VoucherDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VoucherNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WarningText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkFlowId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorksheetByte" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="WorksheetInByte" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WorksheetPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="YNIntermediary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsUserData", propOrder = {
    "actualPaymentNumber",
    "actualProductCode",
    "actualProductIndex",
    "actualTransactionId",
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "age",
    "applicableDocs",
    "applicableDocuments",
    "applicationNumber",
    "approvalNo",
    "authenticateKey",
    "autoAcceptedVoucherNo",
    "bgTag",
    "bankAccountNumber",
    "bankBanchAddress",
    "bankBranchCode",
    "bankBranchName",
    "bankCode",
    "bankName",
    "basisOfRating",
    "blockID",
    "bodyColour",
    "businessLocation",
    "businessSourceType",
    "cgstAmount",
    "cnglpgKitValue",
    "callEnv",
    "callLevel",
    "campaign",
    "certificateNumber",
    "channelId",
    "chassisNumber",
    "chequeDate",
    "chequeNumber",
    "cityDistrictCode",
    "cityDistrictFlag",
    "cityDistrictName",
    "claimDocCode",
    "claimNumber",
    "companyName",
    "companyShortName",
    "consumeProposalXML",
    "currentBasicODPremium",
    "currentBasicTPPremium",
    "currentDate",
    "currentIDV",
    "currentNetODPremium",
    "currentNetTPPremium",
    "customerFirstName",
    "customerId",
    "customerLastName",
    "customerMiddleName",
    "customerName",
    "dcn",
    "ddDate",
    "ddNumber",
    "databaseObjectClasss",
    "daysofTravel",
    "deptNo",
    "detariffDiscountRate",
    "displayStatus",
    "docCode",
    "docSatus",
    "docSerialNo",
    "eCoverNoteHTML",
    "eCoverNotePath",
    "eqZone",
    "electricalAccessories",
    "employeeName",
    "employeeNo",
    "endDate",
    "endorsementDate",
    "endorsementPremium",
    "endorsementSI",
    "endorsementServiceTax",
    "endorsementType",
    "endorsementTypeCode",
    "engineNumber",
    "errorCode",
    "errorLogFilePath",
    "errorMessage",
    "errorText",
    "exShowroomPrice",
    "extrnalyBuiltBodyType",
    "filePath",
    "financierAddress",
    "financierCity",
    "financierCode",
    "financierDistrict",
    "financierName",
    "financierPinCode",
    "financierState",
    "fleetAmount",
    "fleetDiscount",
    "glmRate",
    "groupXML",
    "hostAddress",
    "icn",
    "id",
    "ifsCode",
    "igstAmount",
    "info1",
    "info2",
    "info3",
    "info4",
    "info5",
    "inputXML",
    "insertDate",
    "insertTransId",
    "inspUserDataGrid",
    "inspectionAgencyCode",
    "inspectionAgencyEmailId",
    "inspectionAgencyLandlineNo",
    "inspectionAgencyMobileNo",
    "inspectionAgencyName",
    "inspectionAuthority",
    "inspectionAuthoritySelected",
    "inspectionOverride",
    "inspectionRequestDate",
    "inspectionRequestTime",
    "inspectionStatus",
    "inspectionStatusSelected",
    "instrumentType",
    "intermediaryID",
    "intermediaryName",
    "intermediaryRole",
    "isCDAccount",
    "isCommercialPCV",
    "isCommercialTrailer",
    "isCommercialVehicle",
    "isCustomerDetailsRequired",
    "isInternalRiskGrid",
    "isMappedProduct",
    "isMultiYearPolicy",
    "isMultiYearPolicyFetch",
    "isNewPayment",
    "isProposalFetchTypeRenewal",
    "isRequired",
    "isRequiredForamtedUserXML",
    "isValidUser",
    "isWorkSheetRequired",
    "jobErrorMsg",
    "kCessAmount",
    "lvgiPortalType",
    "leadNo",
    "lineofBusinessCode",
    "lineofBusinessName",
    "localHouseBankCode",
    "locationID",
    "locationName",
    "micrCode",
    "mailPassword",
    "mailPort",
    "mailSender",
    "mailServer",
    "manualCoverNoteNumber",
    "marketingOfficerCode",
    "marketingOfficerName",
    "merchantId",
    "methodAccountsTracker",
    "methodCallingTracker",
    "migratedPolicyNumber",
    "modeOfOperation",
    "modifyDate",
    "modifyTransId",
    "msgType",
    "name",
    "netPremium",
    "newCustPolicyNumber",
    "newGCPolicyNumber",
    "nonElectricalAccessories",
    "odDiscount",
    "odLoading",
    "obsoleteVehicle",
    "occupationCode",
    "odometerReading",
    "officeAddress",
    "officeCode",
    "officeID",
    "officeName",
    "oldCustPolicyNumber",
    "oldGCPolicyNumber",
    "oldProposalDate",
    "oldProposalNumber",
    "operationMode",
    "optionalParameter",
    "overrideFlag",
    "pageAction",
    "parameterType",
    "parentOfficeCode",
    "password",
    "payerCD",
    "payerCustomerID",
    "payerID",
    "payerType",
    "paymentAmount",
    "paymentDate",
    "paymentId",
    "paymentIdStatus",
    "paymentMode",
    "paymentNumber",
    "paymentType",
    "paymentTypeCd",
    "policyAlreadyGenerated",
    "policyDocCode",
    "policyDocumentDtls",
    "policyNO",
    "policyNumber",
    "policyType",
    "previousPolicyExpiryDate",
    "productCode",
    "productIndex",
    "productName",
    "productType",
    "proposalDate",
    "proposalGenerationMode",
    "proposalNumber",
    "proposalStatus",
    "proposalTransactionTypeCode",
    "proposalTransactionTypeDesc",
    "quotationNumber",
    "quotationVersion",
    "receiptDate",
    "receiptMailID",
    "recordStatus1",
    "refDate",
    "refNo",
    "referenceDate",
    "referenceNo1",
    "referenceNo2",
    "referenceNo3",
    "regdNo",
    "remarks",
    "reportAsPDF",
    "reportGenerationType",
    "reportHtmlString",
    "reportTemplateNo",
    "reportTypeCode",
    "retSqlQuery",
    "retVal",
    "riskDate",
    "riskEndDate",
    "riskSerialNo",
    "riskStartDate",
    "rowCount",
    "rsnForCancellation",
    "ruleErrorText",
    "sgstAmount",
    "sqlQuery",
    "saveType",
    "senderMailId",
    "serviceConsumer",
    "serviceErrorText",
    "serviceTax",
    "serviceType",
    "stampDuty",
    "startDate",
    "startTime",
    "stateCode",
    "stateName",
    "status",
    "subject",
    "tpDiscount",
    "tpLoading",
    "totalPremium",
    "totalSI",
    "totalSumInsured",
    "trailerIDV",
    "transactionCode",
    "transactionDate",
    "transactionId",
    "transactionType",
    "ugstAmount",
    "uwDocDtlsGrid",
    "uploadedFileName",
    "userId",
    "userObjectTemplate",
    "userObjectTypeName",
    "userResultXml",
    "userRole",
    "vehicleInspection",
    "vehicleRegistrationNumber",
    "voucherDate",
    "voucherNumber",
    "warningText",
    "workFlowId",
    "worksheetByte",
    "worksheetInByte",
    "worksheetPath",
    "ynIntermediary"
})
public class ClsUserData {

    @XmlElementRef(name = "ActualPaymentNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actualPaymentNumber;
    @XmlElementRef(name = "ActualProductCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actualProductCode;
    @XmlElementRef(name = "ActualProductIndex", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actualProductIndex;
    @XmlElementRef(name = "ActualTransactionId", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actualTransactionId;
    @XmlElementRef(name = "AddressLine1", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine1;
    @XmlElementRef(name = "AddressLine2", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine2;
    @XmlElementRef(name = "AddressLine3", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressLine3;
    @XmlElementRef(name = "Age", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> age;
    @XmlElementRef(name = "ApplicableDocs", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicableDocs;
    @XmlElementRef(name = "ApplicableDocuments", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicableDocuments;
    @XmlElementRef(name = "ApplicationNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicationNumber;
    @XmlElementRef(name = "ApprovalNo", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> approvalNo;
    @XmlElementRef(name = "AuthenticateKey", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authenticateKey;
    @XmlElementRef(name = "AutoAcceptedVoucherNo", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> autoAcceptedVoucherNo;
    @XmlElementRef(name = "BGTag", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bgTag;
    @XmlElementRef(name = "BankAccountNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankAccountNumber;
    @XmlElementRef(name = "BankBanchAddress", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankBanchAddress;
    @XmlElementRef(name = "BankBranchCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankBranchCode;
    @XmlElementRef(name = "BankBranchName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankBranchName;
    @XmlElementRef(name = "BankCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankCode;
    @XmlElementRef(name = "BankName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankName;
    @XmlElementRef(name = "BasisOfRating", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> basisOfRating;
    @XmlElementRef(name = "BlockID", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> blockID;
    @XmlElementRef(name = "BodyColour", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bodyColour;
    @XmlElementRef(name = "BusinessLocation", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessLocation;
    @XmlElementRef(name = "BusinessSourceType", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessSourceType;
    @XmlElement(name = "CGSTAmount")
    protected Double cgstAmount;
    @XmlElementRef(name = "CNGLPGKitValue", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cnglpgKitValue;
    @XmlElementRef(name = "CallEnv", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callEnv;
    @XmlElementRef(name = "CallLevel", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callLevel;
    @XmlElementRef(name = "Campaign", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> campaign;
    @XmlElementRef(name = "CertificateNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificateNumber;
    @XmlElementRef(name = "ChannelId", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> channelId;
    @XmlElementRef(name = "ChassisNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chassisNumber;
    @XmlElementRef(name = "ChequeDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chequeDate;
    @XmlElementRef(name = "ChequeNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chequeNumber;
    @XmlElementRef(name = "CityDistrictCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cityDistrictCode;
    @XmlElementRef(name = "CityDistrictFlag", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cityDistrictFlag;
    @XmlElementRef(name = "CityDistrictName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cityDistrictName;
    @XmlElementRef(name = "ClaimDocCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claimDocCode;
    @XmlElementRef(name = "ClaimNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claimNumber;
    @XmlElementRef(name = "CompanyName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyName;
    @XmlElementRef(name = "CompanyShortName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyShortName;
    @XmlElementRef(name = "ConsumeProposalXML", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<StringBuilder> consumeProposalXML;
    @XmlElement(name = "CurrentBasicODPremium")
    protected Double currentBasicODPremium;
    @XmlElement(name = "CurrentBasicTPPremium")
    protected Double currentBasicTPPremium;
    @XmlElementRef(name = "CurrentDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currentDate;
    @XmlElement(name = "CurrentIDV")
    protected Double currentIDV;
    @XmlElement(name = "CurrentNetODPremium")
    protected Double currentNetODPremium;
    @XmlElement(name = "CurrentNetTPPremium")
    protected Double currentNetTPPremium;
    @XmlElementRef(name = "CustomerFirstName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerFirstName;
    @XmlElementRef(name = "CustomerId", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerId;
    @XmlElementRef(name = "CustomerLastName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerLastName;
    @XmlElementRef(name = "CustomerMiddleName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerMiddleName;
    @XmlElementRef(name = "CustomerName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerName;
    @XmlElementRef(name = "DCN", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dcn;
    @XmlElementRef(name = "DDDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ddDate;
    @XmlElementRef(name = "DDNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ddNumber;
    @XmlElementRef(name = "DatabaseObjectClasss", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<DataObjectClass> databaseObjectClasss;
    @XmlElementRef(name = "DaysofTravel", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> daysofTravel;
    @XmlElementRef(name = "DeptNo", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deptNo;
    @XmlElementRef(name = "DetariffDiscountRate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> detariffDiscountRate;
    @XmlElementRef(name = "DisplayStatus", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> displayStatus;
    @XmlElementRef(name = "DocCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> docCode;
    @XmlElementRef(name = "DocSatus", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> docSatus;
    @XmlElementRef(name = "DocSerialNo", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> docSerialNo;
    @XmlElementRef(name = "ECoverNoteHTML", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eCoverNoteHTML;
    @XmlElementRef(name = "ECoverNotePath", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eCoverNotePath;
    @XmlElementRef(name = "EQZone", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eqZone;
    @XmlElementRef(name = "ElectricalAccessories", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> electricalAccessories;
    @XmlElementRef(name = "EmployeeName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeName;
    @XmlElementRef(name = "EmployeeNo", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeNo;
    @XmlElementRef(name = "EndDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endDate;
    @XmlElementRef(name = "EndorsementDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endorsementDate;
    @XmlElementRef(name = "EndorsementPremium", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endorsementPremium;
    @XmlElementRef(name = "EndorsementSI", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endorsementSI;
    @XmlElementRef(name = "EndorsementServiceTax", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endorsementServiceTax;
    @XmlElement(name = "EndorsementType")
    @XmlSchemaType(name = "string")
    protected ClsUserDataEndorsementTypeDetails endorsementType;
    @XmlElementRef(name = "EndorsementTypeCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endorsementTypeCode;
    @XmlElementRef(name = "EngineNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> engineNumber;
    @XmlElementRef(name = "ErrorCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode;
    @XmlElementRef(name = "ErrorLogFilePath", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorLogFilePath;
    @XmlElementRef(name = "ErrorMessage", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfclsDictionary> errorMessage;
    @XmlElementRef(name = "ErrorText", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorText;
    @XmlElementRef(name = "ExShowroomPrice", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exShowroomPrice;
    @XmlElementRef(name = "ExtrnalyBuiltBodyType", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extrnalyBuiltBodyType;
    @XmlElementRef(name = "FilePath", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> filePath;
    @XmlElementRef(name = "FinancierAddress", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> financierAddress;
    @XmlElementRef(name = "FinancierCity", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> financierCity;
    @XmlElementRef(name = "FinancierCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> financierCode;
    @XmlElementRef(name = "FinancierDistrict", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> financierDistrict;
    @XmlElementRef(name = "FinancierName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> financierName;
    @XmlElementRef(name = "FinancierPinCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> financierPinCode;
    @XmlElementRef(name = "FinancierState", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> financierState;
    @XmlElementRef(name = "FleetAmount", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fleetAmount;
    @XmlElementRef(name = "FleetDiscount", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fleetDiscount;
    @XmlElementRef(name = "GLMRate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> glmRate;
    @XmlElementRef(name = "GroupXML", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<StringBuilder> groupXML;
    @XmlElementRef(name = "HostAddress", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hostAddress;
    @XmlElementRef(name = "ICN", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> icn;
    @XmlElementRef(name = "ID", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "IFSCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ifsCode;
    @XmlElement(name = "IGSTAmount")
    protected Double igstAmount;
    @XmlElementRef(name = "Info1", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> info1;
    @XmlElementRef(name = "Info2", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> info2;
    @XmlElementRef(name = "Info3", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> info3;
    @XmlElementRef(name = "Info4", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> info4;
    @XmlElementRef(name = "Info5", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> info5;
    @XmlElementRef(name = "InputXML", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inputXML;
    @XmlElementRef(name = "InsertDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insertDate;
    @XmlElementRef(name = "InsertTransId", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> insertTransId;
    @XmlElementRef(name = "InspUserDataGrid", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfclsInspUserData> inspUserDataGrid;
    @XmlElementRef(name = "InspectionAgencyCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inspectionAgencyCode;
    @XmlElementRef(name = "InspectionAgencyEmailId", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inspectionAgencyEmailId;
    @XmlElementRef(name = "InspectionAgencyLandlineNo", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inspectionAgencyLandlineNo;
    @XmlElementRef(name = "InspectionAgencyMobileNo", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inspectionAgencyMobileNo;
    @XmlElementRef(name = "InspectionAgencyName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inspectionAgencyName;
    @XmlElementRef(name = "InspectionAuthority", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> inspectionAuthority;
    @XmlElementRef(name = "InspectionAuthoritySelected", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inspectionAuthoritySelected;
    @XmlElementRef(name = "InspectionOverride", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inspectionOverride;
    @XmlElementRef(name = "InspectionRequestDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inspectionRequestDate;
    @XmlElementRef(name = "InspectionRequestTime", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inspectionRequestTime;
    @XmlElementRef(name = "InspectionStatus", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> inspectionStatus;
    @XmlElementRef(name = "InspectionStatusSelected", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inspectionStatusSelected;
    @XmlElementRef(name = "InstrumentType", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instrumentType;
    @XmlElementRef(name = "IntermediaryID", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> intermediaryID;
    @XmlElementRef(name = "IntermediaryName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> intermediaryName;
    @XmlElementRef(name = "IntermediaryRole", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> intermediaryRole;
    @XmlElement(name = "IsCDAccount")
    protected Boolean isCDAccount;
    @XmlElement(name = "IsCommercialPCV")
    protected Boolean isCommercialPCV;
    @XmlElement(name = "IsCommercialTrailer")
    protected Boolean isCommercialTrailer;
    @XmlElement(name = "IsCommercialVehicle")
    protected Boolean isCommercialVehicle;
    @XmlElement(name = "IsCustomerDetailsRequired")
    protected Boolean isCustomerDetailsRequired;
    @XmlElement(name = "IsInternalRiskGrid")
    protected Boolean isInternalRiskGrid;
    @XmlElement(name = "IsMappedProduct")
    protected Boolean isMappedProduct;
    @XmlElement(name = "IsMultiYearPolicy")
    protected Boolean isMultiYearPolicy;
    @XmlElement(name = "IsMultiYearPolicyFetch")
    protected Boolean isMultiYearPolicyFetch;
    @XmlElementRef(name = "IsNewPayment", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isNewPayment;
    @XmlElement(name = "IsProposalFetchTypeRenewal")
    protected Boolean isProposalFetchTypeRenewal;
    @XmlElementRef(name = "IsRequired", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isRequired;
    @XmlElement(name = "IsRequiredForamtedUserXML")
    protected Boolean isRequiredForamtedUserXML;
    @XmlElement(name = "IsValidUser")
    protected Boolean isValidUser;
    @XmlElement(name = "IsWorkSheetRequired")
    protected Boolean isWorkSheetRequired;
    @XmlElementRef(name = "JobErrorMsg", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobErrorMsg;
    @XmlElement(name = "KCessAmount")
    protected Double kCessAmount;
    @XmlElement(name = "LVGIPortalType")
    @XmlSchemaType(name = "string")
    protected ClsUserDataPortalType lvgiPortalType;
    @XmlElementRef(name = "LeadNo", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> leadNo;
    @XmlElementRef(name = "LineofBusinessCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineofBusinessCode;
    @XmlElementRef(name = "LineofBusinessName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineofBusinessName;
    @XmlElementRef(name = "LocalHouseBankCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localHouseBankCode;
    @XmlElementRef(name = "LocationID", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationID;
    @XmlElementRef(name = "LocationName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationName;
    @XmlElementRef(name = "MICRCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> micrCode;
    @XmlElementRef(name = "MailPassword", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailPassword;
    @XmlElementRef(name = "MailPort", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailPort;
    @XmlElementRef(name = "MailSender", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailSender;
    @XmlElementRef(name = "MailServer", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailServer;
    @XmlElementRef(name = "ManualCoverNoteNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> manualCoverNoteNumber;
    @XmlElementRef(name = "MarketingOfficerCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingOfficerCode;
    @XmlElementRef(name = "MarketingOfficerName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingOfficerName;
    @XmlElementRef(name = "MerchantId", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> merchantId;
    @XmlElement(name = "MethodAccountsTracker")
    protected Boolean methodAccountsTracker;
    @XmlElement(name = "MethodCallingTracker")
    protected Boolean methodCallingTracker;
    @XmlElementRef(name = "MigratedPolicyNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> migratedPolicyNumber;
    @XmlElementRef(name = "ModeOfOperation", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modeOfOperation;
    @XmlElementRef(name = "ModifyDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifyDate;
    @XmlElementRef(name = "ModifyTransId", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> modifyTransId;
    @XmlElementRef(name = "MsgType", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> msgType;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "NetPremium")
    protected Double netPremium;
    @XmlElementRef(name = "NewCustPolicyNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newCustPolicyNumber;
    @XmlElementRef(name = "NewGCPolicyNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> newGCPolicyNumber;
    @XmlElementRef(name = "NonElectricalAccessories", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nonElectricalAccessories;
    @XmlElement(name = "ODDiscount")
    protected Double odDiscount;
    @XmlElement(name = "ODLoading")
    protected Double odLoading;
    @XmlElementRef(name = "ObsoleteVehicle", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> obsoleteVehicle;
    @XmlElementRef(name = "OccupationCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> occupationCode;
    @XmlElementRef(name = "OdometerReading", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> odometerReading;
    @XmlElementRef(name = "OfficeAddress", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> officeAddress;
    @XmlElementRef(name = "OfficeCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> officeCode;
    @XmlElementRef(name = "OfficeID", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> officeID;
    @XmlElementRef(name = "OfficeName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> officeName;
    @XmlElementRef(name = "OldCustPolicyNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oldCustPolicyNumber;
    @XmlElementRef(name = "OldGCPolicyNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oldGCPolicyNumber;
    @XmlElementRef(name = "OldProposalDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oldProposalDate;
    @XmlElementRef(name = "OldProposalNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oldProposalNumber;
    @XmlElementRef(name = "OperationMode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationMode;
    @XmlElement(name = "OptionalParameter")
    protected Boolean optionalParameter;
    @XmlElementRef(name = "OverrideFlag", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> overrideFlag;
    @XmlElementRef(name = "PageAction", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pageAction;
    @XmlElement(name = "ParameterType")
    @XmlSchemaType(name = "string")
    protected ClsUserDataReportParameterType parameterType;
    @XmlElementRef(name = "ParentOfficeCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentOfficeCode;
    @XmlElementRef(name = "Password", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "PayerCD", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payerCD;
    @XmlElementRef(name = "PayerCustomerID", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payerCustomerID;
    @XmlElementRef(name = "PayerID", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payerID;
    @XmlElementRef(name = "PayerType", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payerType;
    @XmlElement(name = "PaymentAmount")
    protected Double paymentAmount;
    @XmlElementRef(name = "PaymentDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentDate;
    @XmlElementRef(name = "PaymentId", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentId;
    @XmlElementRef(name = "PaymentIdStatus", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentIdStatus;
    @XmlElementRef(name = "PaymentMode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentMode;
    @XmlElementRef(name = "PaymentNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentNumber;
    @XmlElementRef(name = "PaymentType", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentType;
    @XmlElementRef(name = "PaymentTypeCd", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentTypeCd;
    @XmlElement(name = "PolicyAlreadyGenerated")
    protected Boolean policyAlreadyGenerated;
    @XmlElementRef(name = "PolicyDocCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyDocCode;
    @XmlElementRef(name = "PolicyDocumentDtls", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfclsUWDocServiceResult> policyDocumentDtls;
    @XmlElementRef(name = "PolicyNO", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNO;
    @XmlElementRef(name = "PolicyNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyNumber;
    @XmlElementRef(name = "PolicyType", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> policyType;
    @XmlElementRef(name = "PreviousPolicyExpiryDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousPolicyExpiryDate;
    @XmlElementRef(name = "ProductCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productCode;
    @XmlElementRef(name = "ProductIndex", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productIndex;
    @XmlElementRef(name = "ProductName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productName;
    @XmlElementRef(name = "ProductType", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productType;
    @XmlElementRef(name = "ProposalDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proposalDate;
    @XmlElement(name = "ProposalGenerationMode")
    @XmlSchemaType(name = "string")
    protected ClsUserDataProposalMode proposalGenerationMode;
    @XmlElementRef(name = "ProposalNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proposalNumber;
    @XmlElementRef(name = "ProposalStatus", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proposalStatus;
    @XmlElementRef(name = "ProposalTransactionTypeCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proposalTransactionTypeCode;
    @XmlElementRef(name = "ProposalTransactionTypeDesc", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proposalTransactionTypeDesc;
    @XmlElementRef(name = "QuotationNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quotationNumber;
    @XmlElementRef(name = "QuotationVersion", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quotationVersion;
    @XmlElementRef(name = "ReceiptDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptDate;
    @XmlElementRef(name = "ReceiptMailID", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> receiptMailID;
    @XmlElementRef(name = "RecordStatus1", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordStatus1;
    @XmlElementRef(name = "RefDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refDate;
    @XmlElementRef(name = "RefNo", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refNo;
    @XmlElementRef(name = "ReferenceDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceDate;
    @XmlElementRef(name = "ReferenceNo1", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceNo1;
    @XmlElementRef(name = "ReferenceNo2", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceNo2;
    @XmlElementRef(name = "ReferenceNo3", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceNo3;
    @XmlElementRef(name = "RegdNo", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> regdNo;
    @XmlElementRef(name = "Remarks", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remarks;
    @XmlElement(name = "ReportAsPDF")
    protected Boolean reportAsPDF;
    @XmlElement(name = "ReportGenerationType")
    @XmlSchemaType(name = "string")
    protected ClsUserDataReportType reportGenerationType;
    @XmlElementRef(name = "ReportHtmlString", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<StringBuilder> reportHtmlString;
    @XmlElementRef(name = "ReportTemplateNo", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportTemplateNo;
    @XmlElementRef(name = "ReportTypeCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportTypeCode;
    @XmlElementRef(name = "RetSqlQuery", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retSqlQuery;
    @XmlElementRef(name = "RetVal", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retVal;
    @XmlElementRef(name = "RiskDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> riskDate;
    @XmlElementRef(name = "RiskEndDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> riskEndDate;
    @XmlElementRef(name = "RiskSerialNo", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> riskSerialNo;
    @XmlElementRef(name = "RiskStartDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> riskStartDate;
    @XmlElementRef(name = "RowCount", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rowCount;
    @XmlElementRef(name = "RsnForCancellation", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rsnForCancellation;
    @XmlElementRef(name = "RuleErrorText", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ruleErrorText;
    @XmlElement(name = "SGSTAmount")
    protected Double sgstAmount;
    @XmlElementRef(name = "SQLQuery", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sqlQuery;
    @XmlElement(name = "SaveType")
    @XmlSchemaType(name = "string")
    protected ClsUserDataSaveModeType saveType;
    @XmlElementRef(name = "SenderMailId", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderMailId;
    @XmlElementRef(name = "ServiceConsumer", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceConsumer;
    @XmlElementRef(name = "ServiceErrorText", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceErrorText;
    @XmlElement(name = "ServiceTax")
    protected Double serviceTax;
    @XmlElementRef(name = "ServiceType", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceType;
    @XmlElement(name = "StampDuty")
    protected Double stampDuty;
    @XmlElementRef(name = "StartDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startDate;
    @XmlElementRef(name = "StartTime", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startTime;
    @XmlElementRef(name = "StateCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateCode;
    @XmlElementRef(name = "StateName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateName;
    @XmlElementRef(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "Subject", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subject;
    @XmlElement(name = "TPDiscount")
    protected Double tpDiscount;
    @XmlElement(name = "TPLoading")
    protected Double tpLoading;
    @XmlElement(name = "TotalPremium")
    protected Double totalPremium;
    @XmlElement(name = "TotalSI")
    protected Double totalSI;
    @XmlElementRef(name = "TotalSumInsured", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalSumInsured;
    @XmlElementRef(name = "TrailerIDV", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trailerIDV;
    @XmlElementRef(name = "TransactionCode", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionCode;
    @XmlElementRef(name = "TransactionDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionDate;
    @XmlElement(name = "TransactionId")
    protected Double transactionId;
    @XmlElementRef(name = "TransactionType", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionType;
    @XmlElement(name = "UGSTAmount")
    protected Double ugstAmount;
    @XmlElementRef(name = "UWDocDtlsGrid", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfclsUWDocServiceResult> uwDocDtlsGrid;
    @XmlElementRef(name = "UploadedFileName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uploadedFileName;
    @XmlElementRef(name = "UserId", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userId;
    @XmlElementRef(name = "UserObjectTemplate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> userObjectTemplate;
    @XmlElementRef(name = "UserObjectTypeName", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userObjectTypeName;
    @XmlElementRef(name = "UserResultXml", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userResultXml;
    @XmlElementRef(name = "UserRole", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userRole;
    @XmlElementRef(name = "VehicleInspection", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleInspection;
    @XmlElementRef(name = "VehicleRegistrationNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vehicleRegistrationNumber;
    @XmlElementRef(name = "VoucherDate", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voucherDate;
    @XmlElementRef(name = "VoucherNumber", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> voucherNumber;
    @XmlElementRef(name = "WarningText", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> warningText;
    @XmlElementRef(name = "WorkFlowId", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workFlowId;
    @XmlElementRef(name = "WorksheetByte", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> worksheetByte;
    @XmlElement(name = "WorksheetInByte")
    protected Boolean worksheetInByte;
    @XmlElementRef(name = "WorksheetPath", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> worksheetPath;
    @XmlElementRef(name = "YNIntermediary", namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ynIntermediary;

    /**
     * Gets the value of the actualPaymentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActualPaymentNumber() {
        return actualPaymentNumber;
    }

    /**
     * Sets the value of the actualPaymentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActualPaymentNumber(JAXBElement<String> value) {
        this.actualPaymentNumber = value;
    }

    /**
     * Gets the value of the actualProductCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActualProductCode() {
        return actualProductCode;
    }

    /**
     * Sets the value of the actualProductCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActualProductCode(JAXBElement<String> value) {
        this.actualProductCode = value;
    }

    /**
     * Gets the value of the actualProductIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActualProductIndex() {
        return actualProductIndex;
    }

    /**
     * Sets the value of the actualProductIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActualProductIndex(JAXBElement<String> value) {
        this.actualProductIndex = value;
    }

    /**
     * Gets the value of the actualTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActualTransactionId() {
        return actualTransactionId;
    }

    /**
     * Sets the value of the actualTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActualTransactionId(JAXBElement<String> value) {
        this.actualTransactionId = value;
    }

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine1(JAXBElement<String> value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine2(JAXBElement<String> value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressLine3(JAXBElement<String> value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAge(JAXBElement<String> value) {
        this.age = value;
    }

    /**
     * Gets the value of the applicableDocs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicableDocs() {
        return applicableDocs;
    }

    /**
     * Sets the value of the applicableDocs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicableDocs(JAXBElement<String> value) {
        this.applicableDocs = value;
    }

    /**
     * Gets the value of the applicableDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicableDocuments() {
        return applicableDocuments;
    }

    /**
     * Sets the value of the applicableDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicableDocuments(JAXBElement<String> value) {
        this.applicableDocuments = value;
    }

    /**
     * Gets the value of the applicationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * Sets the value of the applicationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicationNumber(JAXBElement<String> value) {
        this.applicationNumber = value;
    }

    /**
     * Gets the value of the approvalNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApprovalNo() {
        return approvalNo;
    }

    /**
     * Sets the value of the approvalNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApprovalNo(JAXBElement<String> value) {
        this.approvalNo = value;
    }

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
     * Gets the value of the autoAcceptedVoucherNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAutoAcceptedVoucherNo() {
        return autoAcceptedVoucherNo;
    }

    /**
     * Sets the value of the autoAcceptedVoucherNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAutoAcceptedVoucherNo(JAXBElement<String> value) {
        this.autoAcceptedVoucherNo = value;
    }

    /**
     * Gets the value of the bgTag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBGTag() {
        return bgTag;
    }

    /**
     * Sets the value of the bgTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBGTag(JAXBElement<String> value) {
        this.bgTag = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankAccountNumber(JAXBElement<String> value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the bankBanchAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankBanchAddress() {
        return bankBanchAddress;
    }

    /**
     * Sets the value of the bankBanchAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankBanchAddress(JAXBElement<String> value) {
        this.bankBanchAddress = value;
    }

    /**
     * Gets the value of the bankBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankBranchCode() {
        return bankBranchCode;
    }

    /**
     * Sets the value of the bankBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankBranchCode(JAXBElement<String> value) {
        this.bankBranchCode = value;
    }

    /**
     * Gets the value of the bankBranchName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankBranchName() {
        return bankBranchName;
    }

    /**
     * Sets the value of the bankBranchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankBranchName(JAXBElement<String> value) {
        this.bankBranchName = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankCode(JAXBElement<String> value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankName(JAXBElement<String> value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the basisOfRating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBasisOfRating() {
        return basisOfRating;
    }

    /**
     * Sets the value of the basisOfRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBasisOfRating(JAXBElement<String> value) {
        this.basisOfRating = value;
    }

    /**
     * Gets the value of the blockID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlockID() {
        return blockID;
    }

    /**
     * Sets the value of the blockID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlockID(JAXBElement<String> value) {
        this.blockID = value;
    }

    /**
     * Gets the value of the bodyColour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBodyColour() {
        return bodyColour;
    }

    /**
     * Sets the value of the bodyColour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBodyColour(JAXBElement<String> value) {
        this.bodyColour = value;
    }

    /**
     * Gets the value of the businessLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessLocation() {
        return businessLocation;
    }

    /**
     * Sets the value of the businessLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessLocation(JAXBElement<String> value) {
        this.businessLocation = value;
    }

    /**
     * Gets the value of the businessSourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessSourceType() {
        return businessSourceType;
    }

    /**
     * Sets the value of the businessSourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessSourceType(JAXBElement<String> value) {
        this.businessSourceType = value;
    }

    /**
     * Gets the value of the cgstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCGSTAmount() {
        return cgstAmount;
    }

    /**
     * Sets the value of the cgstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCGSTAmount(Double value) {
        this.cgstAmount = value;
    }

    /**
     * Gets the value of the cnglpgKitValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCNGLPGKitValue() {
        return cnglpgKitValue;
    }

    /**
     * Sets the value of the cnglpgKitValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCNGLPGKitValue(JAXBElement<String> value) {
        this.cnglpgKitValue = value;
    }

    /**
     * Gets the value of the callEnv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallEnv() {
        return callEnv;
    }

    /**
     * Sets the value of the callEnv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallEnv(JAXBElement<String> value) {
        this.callEnv = value;
    }

    /**
     * Gets the value of the callLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallLevel() {
        return callLevel;
    }

    /**
     * Sets the value of the callLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallLevel(JAXBElement<String> value) {
        this.callLevel = value;
    }

    /**
     * Gets the value of the campaign property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCampaign() {
        return campaign;
    }

    /**
     * Sets the value of the campaign property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCampaign(JAXBElement<String> value) {
        this.campaign = value;
    }

    /**
     * Gets the value of the certificateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertificateNumber(JAXBElement<String> value) {
        this.certificateNumber = value;
    }

    /**
     * Gets the value of the channelId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChannelId(JAXBElement<String> value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the chassisNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChassisNumber() {
        return chassisNumber;
    }

    /**
     * Sets the value of the chassisNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChassisNumber(JAXBElement<String> value) {
        this.chassisNumber = value;
    }

    /**
     * Gets the value of the chequeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChequeDate() {
        return chequeDate;
    }

    /**
     * Sets the value of the chequeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChequeDate(JAXBElement<String> value) {
        this.chequeDate = value;
    }

    /**
     * Gets the value of the chequeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChequeNumber() {
        return chequeNumber;
    }

    /**
     * Sets the value of the chequeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChequeNumber(JAXBElement<String> value) {
        this.chequeNumber = value;
    }

    /**
     * Gets the value of the cityDistrictCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCityDistrictCode() {
        return cityDistrictCode;
    }

    /**
     * Sets the value of the cityDistrictCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCityDistrictCode(JAXBElement<String> value) {
        this.cityDistrictCode = value;
    }

    /**
     * Gets the value of the cityDistrictFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCityDistrictFlag() {
        return cityDistrictFlag;
    }

    /**
     * Sets the value of the cityDistrictFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCityDistrictFlag(JAXBElement<String> value) {
        this.cityDistrictFlag = value;
    }

    /**
     * Gets the value of the cityDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCityDistrictName() {
        return cityDistrictName;
    }

    /**
     * Sets the value of the cityDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCityDistrictName(JAXBElement<String> value) {
        this.cityDistrictName = value;
    }

    /**
     * Gets the value of the claimDocCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaimDocCode() {
        return claimDocCode;
    }

    /**
     * Sets the value of the claimDocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaimDocCode(JAXBElement<String> value) {
        this.claimDocCode = value;
    }

    /**
     * Gets the value of the claimNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaimNumber() {
        return claimNumber;
    }

    /**
     * Sets the value of the claimNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaimNumber(JAXBElement<String> value) {
        this.claimNumber = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyName(JAXBElement<String> value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyShortName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyShortName() {
        return companyShortName;
    }

    /**
     * Sets the value of the companyShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyShortName(JAXBElement<String> value) {
        this.companyShortName = value;
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
     * Gets the value of the currentBasicODPremium property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentBasicODPremium() {
        return currentBasicODPremium;
    }

    /**
     * Sets the value of the currentBasicODPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentBasicODPremium(Double value) {
        this.currentBasicODPremium = value;
    }

    /**
     * Gets the value of the currentBasicTPPremium property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentBasicTPPremium() {
        return currentBasicTPPremium;
    }

    /**
     * Sets the value of the currentBasicTPPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentBasicTPPremium(Double value) {
        this.currentBasicTPPremium = value;
    }

    /**
     * Gets the value of the currentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrentDate() {
        return currentDate;
    }

    /**
     * Sets the value of the currentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrentDate(JAXBElement<String> value) {
        this.currentDate = value;
    }

    /**
     * Gets the value of the currentIDV property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentIDV() {
        return currentIDV;
    }

    /**
     * Sets the value of the currentIDV property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentIDV(Double value) {
        this.currentIDV = value;
    }

    /**
     * Gets the value of the currentNetODPremium property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentNetODPremium() {
        return currentNetODPremium;
    }

    /**
     * Sets the value of the currentNetODPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentNetODPremium(Double value) {
        this.currentNetODPremium = value;
    }

    /**
     * Gets the value of the currentNetTPPremium property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentNetTPPremium() {
        return currentNetTPPremium;
    }

    /**
     * Sets the value of the currentNetTPPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentNetTPPremium(Double value) {
        this.currentNetTPPremium = value;
    }

    /**
     * Gets the value of the customerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * Sets the value of the customerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerFirstName(JAXBElement<String> value) {
        this.customerFirstName = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerId(JAXBElement<String> value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Sets the value of the customerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerLastName(JAXBElement<String> value) {
        this.customerLastName = value;
    }

    /**
     * Gets the value of the customerMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerMiddleName() {
        return customerMiddleName;
    }

    /**
     * Sets the value of the customerMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerMiddleName(JAXBElement<String> value) {
        this.customerMiddleName = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerName(JAXBElement<String> value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the dcn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDCN() {
        return dcn;
    }

    /**
     * Sets the value of the dcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDCN(JAXBElement<String> value) {
        this.dcn = value;
    }

    /**
     * Gets the value of the ddDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDDDate() {
        return ddDate;
    }

    /**
     * Sets the value of the ddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDDDate(JAXBElement<String> value) {
        this.ddDate = value;
    }

    /**
     * Gets the value of the ddNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDDNumber() {
        return ddNumber;
    }

    /**
     * Sets the value of the ddNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDDNumber(JAXBElement<String> value) {
        this.ddNumber = value;
    }

    /**
     * Gets the value of the databaseObjectClasss property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataObjectClass }{@code >}
     *     
     */
    public JAXBElement<DataObjectClass> getDatabaseObjectClasss() {
        return databaseObjectClasss;
    }

    /**
     * Sets the value of the databaseObjectClasss property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataObjectClass }{@code >}
     *     
     */
    public void setDatabaseObjectClasss(JAXBElement<DataObjectClass> value) {
        this.databaseObjectClasss = value;
    }

    /**
     * Gets the value of the daysofTravel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDaysofTravel() {
        return daysofTravel;
    }

    /**
     * Sets the value of the daysofTravel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDaysofTravel(JAXBElement<String> value) {
        this.daysofTravel = value;
    }

    /**
     * Gets the value of the deptNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeptNo() {
        return deptNo;
    }

    /**
     * Sets the value of the deptNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeptNo(JAXBElement<String> value) {
        this.deptNo = value;
    }

    /**
     * Gets the value of the detariffDiscountRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetariffDiscountRate() {
        return detariffDiscountRate;
    }

    /**
     * Sets the value of the detariffDiscountRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetariffDiscountRate(JAXBElement<String> value) {
        this.detariffDiscountRate = value;
    }

    /**
     * Gets the value of the displayStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisplayStatus() {
        return displayStatus;
    }

    /**
     * Sets the value of the displayStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisplayStatus(JAXBElement<String> value) {
        this.displayStatus = value;
    }

    /**
     * Gets the value of the docCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocCode() {
        return docCode;
    }

    /**
     * Sets the value of the docCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocCode(JAXBElement<String> value) {
        this.docCode = value;
    }

    /**
     * Gets the value of the docSatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocSatus() {
        return docSatus;
    }

    /**
     * Sets the value of the docSatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocSatus(JAXBElement<String> value) {
        this.docSatus = value;
    }

    /**
     * Gets the value of the docSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocSerialNo() {
        return docSerialNo;
    }

    /**
     * Sets the value of the docSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocSerialNo(JAXBElement<String> value) {
        this.docSerialNo = value;
    }

    /**
     * Gets the value of the eCoverNoteHTML property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECoverNoteHTML() {
        return eCoverNoteHTML;
    }

    /**
     * Sets the value of the eCoverNoteHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECoverNoteHTML(JAXBElement<String> value) {
        this.eCoverNoteHTML = value;
    }

    /**
     * Gets the value of the eCoverNotePath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getECoverNotePath() {
        return eCoverNotePath;
    }

    /**
     * Sets the value of the eCoverNotePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setECoverNotePath(JAXBElement<String> value) {
        this.eCoverNotePath = value;
    }

    /**
     * Gets the value of the eqZone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEQZone() {
        return eqZone;
    }

    /**
     * Sets the value of the eqZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEQZone(JAXBElement<String> value) {
        this.eqZone = value;
    }

    /**
     * Gets the value of the electricalAccessories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getElectricalAccessories() {
        return electricalAccessories;
    }

    /**
     * Sets the value of the electricalAccessories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setElectricalAccessories(JAXBElement<String> value) {
        this.electricalAccessories = value;
    }

    /**
     * Gets the value of the employeeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeName() {
        return employeeName;
    }

    /**
     * Sets the value of the employeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeName(JAXBElement<String> value) {
        this.employeeName = value;
    }

    /**
     * Gets the value of the employeeNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeNo() {
        return employeeNo;
    }

    /**
     * Sets the value of the employeeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeNo(JAXBElement<String> value) {
        this.employeeNo = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<String> value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the endorsementDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndorsementDate() {
        return endorsementDate;
    }

    /**
     * Sets the value of the endorsementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndorsementDate(JAXBElement<String> value) {
        this.endorsementDate = value;
    }

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
     * Gets the value of the endorsementType property.
     * 
     * @return
     *     possible object is
     *     {@link ClsUserDataEndorsementTypeDetails }
     *     
     */
    public ClsUserDataEndorsementTypeDetails getEndorsementType() {
        return endorsementType;
    }

    /**
     * Sets the value of the endorsementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsUserDataEndorsementTypeDetails }
     *     
     */
    public void setEndorsementType(ClsUserDataEndorsementTypeDetails value) {
        this.endorsementType = value;
    }

    /**
     * Gets the value of the endorsementTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndorsementTypeCode() {
        return endorsementTypeCode;
    }

    /**
     * Sets the value of the endorsementTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndorsementTypeCode(JAXBElement<String> value) {
        this.endorsementTypeCode = value;
    }

    /**
     * Gets the value of the engineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEngineNumber() {
        return engineNumber;
    }

    /**
     * Sets the value of the engineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEngineNumber(JAXBElement<String> value) {
        this.engineNumber = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorCode(JAXBElement<String> value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorLogFilePath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getErrorLogFilePath() {
        return errorLogFilePath;
    }

    /**
     * Sets the value of the errorLogFilePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setErrorLogFilePath(JAXBElement<String> value) {
        this.errorLogFilePath = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfclsDictionary }{@code >}
     *     
     */
    public JAXBElement<ArrayOfclsDictionary> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfclsDictionary }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<ArrayOfclsDictionary> value) {
        this.errorMessage = value;
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
     * Gets the value of the exShowroomPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExShowroomPrice() {
        return exShowroomPrice;
    }

    /**
     * Sets the value of the exShowroomPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExShowroomPrice(JAXBElement<String> value) {
        this.exShowroomPrice = value;
    }

    /**
     * Gets the value of the extrnalyBuiltBodyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtrnalyBuiltBodyType() {
        return extrnalyBuiltBodyType;
    }

    /**
     * Sets the value of the extrnalyBuiltBodyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtrnalyBuiltBodyType(JAXBElement<String> value) {
        this.extrnalyBuiltBodyType = value;
    }

    /**
     * Gets the value of the filePath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFilePath() {
        return filePath;
    }

    /**
     * Sets the value of the filePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFilePath(JAXBElement<String> value) {
        this.filePath = value;
    }

    /**
     * Gets the value of the financierAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinancierAddress() {
        return financierAddress;
    }

    /**
     * Sets the value of the financierAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinancierAddress(JAXBElement<String> value) {
        this.financierAddress = value;
    }

    /**
     * Gets the value of the financierCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinancierCity() {
        return financierCity;
    }

    /**
     * Sets the value of the financierCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinancierCity(JAXBElement<String> value) {
        this.financierCity = value;
    }

    /**
     * Gets the value of the financierCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinancierCode() {
        return financierCode;
    }

    /**
     * Sets the value of the financierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinancierCode(JAXBElement<String> value) {
        this.financierCode = value;
    }

    /**
     * Gets the value of the financierDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinancierDistrict() {
        return financierDistrict;
    }

    /**
     * Sets the value of the financierDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinancierDistrict(JAXBElement<String> value) {
        this.financierDistrict = value;
    }

    /**
     * Gets the value of the financierName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinancierName() {
        return financierName;
    }

    /**
     * Sets the value of the financierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinancierName(JAXBElement<String> value) {
        this.financierName = value;
    }

    /**
     * Gets the value of the financierPinCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinancierPinCode() {
        return financierPinCode;
    }

    /**
     * Sets the value of the financierPinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinancierPinCode(JAXBElement<String> value) {
        this.financierPinCode = value;
    }

    /**
     * Gets the value of the financierState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinancierState() {
        return financierState;
    }

    /**
     * Sets the value of the financierState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinancierState(JAXBElement<String> value) {
        this.financierState = value;
    }

    /**
     * Gets the value of the fleetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFleetAmount() {
        return fleetAmount;
    }

    /**
     * Sets the value of the fleetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFleetAmount(JAXBElement<String> value) {
        this.fleetAmount = value;
    }

    /**
     * Gets the value of the fleetDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFleetDiscount() {
        return fleetDiscount;
    }

    /**
     * Sets the value of the fleetDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFleetDiscount(JAXBElement<String> value) {
        this.fleetDiscount = value;
    }

    /**
     * Gets the value of the glmRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGLMRate() {
        return glmRate;
    }

    /**
     * Sets the value of the glmRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGLMRate(JAXBElement<String> value) {
        this.glmRate = value;
    }

    /**
     * Gets the value of the groupXML property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     *     
     */
    public JAXBElement<StringBuilder> getGroupXML() {
        return groupXML;
    }

    /**
     * Sets the value of the groupXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     *     
     */
    public void setGroupXML(JAXBElement<StringBuilder> value) {
        this.groupXML = value;
    }

    /**
     * Gets the value of the hostAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHostAddress() {
        return hostAddress;
    }

    /**
     * Sets the value of the hostAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHostAddress(JAXBElement<String> value) {
        this.hostAddress = value;
    }

    /**
     * Gets the value of the icn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getICN() {
        return icn;
    }

    /**
     * Sets the value of the icn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setICN(JAXBElement<String> value) {
        this.icn = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setID(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the ifsCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIFSCode() {
        return ifsCode;
    }

    /**
     * Sets the value of the ifsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIFSCode(JAXBElement<String> value) {
        this.ifsCode = value;
    }

    /**
     * Gets the value of the igstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIGSTAmount() {
        return igstAmount;
    }

    /**
     * Sets the value of the igstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIGSTAmount(Double value) {
        this.igstAmount = value;
    }

    /**
     * Gets the value of the info1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfo1() {
        return info1;
    }

    /**
     * Sets the value of the info1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfo1(JAXBElement<String> value) {
        this.info1 = value;
    }

    /**
     * Gets the value of the info2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfo2() {
        return info2;
    }

    /**
     * Sets the value of the info2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfo2(JAXBElement<String> value) {
        this.info2 = value;
    }

    /**
     * Gets the value of the info3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfo3() {
        return info3;
    }

    /**
     * Sets the value of the info3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfo3(JAXBElement<String> value) {
        this.info3 = value;
    }

    /**
     * Gets the value of the info4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfo4() {
        return info4;
    }

    /**
     * Sets the value of the info4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfo4(JAXBElement<String> value) {
        this.info4 = value;
    }

    /**
     * Gets the value of the info5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfo5() {
        return info5;
    }

    /**
     * Sets the value of the info5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfo5(JAXBElement<String> value) {
        this.info5 = value;
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
     * Gets the value of the insertDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsertDate() {
        return insertDate;
    }

    /**
     * Sets the value of the insertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsertDate(JAXBElement<String> value) {
        this.insertDate = value;
    }

    /**
     * Gets the value of the insertTransId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInsertTransId() {
        return insertTransId;
    }

    /**
     * Sets the value of the insertTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInsertTransId(JAXBElement<String> value) {
        this.insertTransId = value;
    }

    /**
     * Gets the value of the inspUserDataGrid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfclsInspUserData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfclsInspUserData> getInspUserDataGrid() {
        return inspUserDataGrid;
    }

    /**
     * Sets the value of the inspUserDataGrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfclsInspUserData }{@code >}
     *     
     */
    public void setInspUserDataGrid(JAXBElement<ArrayOfclsInspUserData> value) {
        this.inspUserDataGrid = value;
    }

    /**
     * Gets the value of the inspectionAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInspectionAgencyCode() {
        return inspectionAgencyCode;
    }

    /**
     * Sets the value of the inspectionAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInspectionAgencyCode(JAXBElement<String> value) {
        this.inspectionAgencyCode = value;
    }

    /**
     * Gets the value of the inspectionAgencyEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInspectionAgencyEmailId() {
        return inspectionAgencyEmailId;
    }

    /**
     * Sets the value of the inspectionAgencyEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInspectionAgencyEmailId(JAXBElement<String> value) {
        this.inspectionAgencyEmailId = value;
    }

    /**
     * Gets the value of the inspectionAgencyLandlineNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInspectionAgencyLandlineNo() {
        return inspectionAgencyLandlineNo;
    }

    /**
     * Sets the value of the inspectionAgencyLandlineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInspectionAgencyLandlineNo(JAXBElement<String> value) {
        this.inspectionAgencyLandlineNo = value;
    }

    /**
     * Gets the value of the inspectionAgencyMobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInspectionAgencyMobileNo() {
        return inspectionAgencyMobileNo;
    }

    /**
     * Sets the value of the inspectionAgencyMobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInspectionAgencyMobileNo(JAXBElement<String> value) {
        this.inspectionAgencyMobileNo = value;
    }

    /**
     * Gets the value of the inspectionAgencyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInspectionAgencyName() {
        return inspectionAgencyName;
    }

    /**
     * Sets the value of the inspectionAgencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInspectionAgencyName(JAXBElement<String> value) {
        this.inspectionAgencyName = value;
    }

    /**
     * Gets the value of the inspectionAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getInspectionAuthority() {
        return inspectionAuthority;
    }

    /**
     * Sets the value of the inspectionAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setInspectionAuthority(JAXBElement<ArrayOfstring> value) {
        this.inspectionAuthority = value;
    }

    /**
     * Gets the value of the inspectionAuthoritySelected property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInspectionAuthoritySelected() {
        return inspectionAuthoritySelected;
    }

    /**
     * Sets the value of the inspectionAuthoritySelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInspectionAuthoritySelected(JAXBElement<String> value) {
        this.inspectionAuthoritySelected = value;
    }

    /**
     * Gets the value of the inspectionOverride property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInspectionOverride() {
        return inspectionOverride;
    }

    /**
     * Sets the value of the inspectionOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInspectionOverride(JAXBElement<String> value) {
        this.inspectionOverride = value;
    }

    /**
     * Gets the value of the inspectionRequestDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInspectionRequestDate() {
        return inspectionRequestDate;
    }

    /**
     * Sets the value of the inspectionRequestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInspectionRequestDate(JAXBElement<String> value) {
        this.inspectionRequestDate = value;
    }

    /**
     * Gets the value of the inspectionRequestTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInspectionRequestTime() {
        return inspectionRequestTime;
    }

    /**
     * Sets the value of the inspectionRequestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInspectionRequestTime(JAXBElement<String> value) {
        this.inspectionRequestTime = value;
    }

    /**
     * Gets the value of the inspectionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getInspectionStatus() {
        return inspectionStatus;
    }

    /**
     * Sets the value of the inspectionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setInspectionStatus(JAXBElement<ArrayOfstring> value) {
        this.inspectionStatus = value;
    }

    /**
     * Gets the value of the inspectionStatusSelected property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInspectionStatusSelected() {
        return inspectionStatusSelected;
    }

    /**
     * Sets the value of the inspectionStatusSelected property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInspectionStatusSelected(JAXBElement<String> value) {
        this.inspectionStatusSelected = value;
    }

    /**
     * Gets the value of the instrumentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstrumentType() {
        return instrumentType;
    }

    /**
     * Sets the value of the instrumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstrumentType(JAXBElement<String> value) {
        this.instrumentType = value;
    }

    /**
     * Gets the value of the intermediaryID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIntermediaryID() {
        return intermediaryID;
    }

    /**
     * Sets the value of the intermediaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIntermediaryID(JAXBElement<String> value) {
        this.intermediaryID = value;
    }

    /**
     * Gets the value of the intermediaryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIntermediaryName() {
        return intermediaryName;
    }

    /**
     * Sets the value of the intermediaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIntermediaryName(JAXBElement<String> value) {
        this.intermediaryName = value;
    }

    /**
     * Gets the value of the intermediaryRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIntermediaryRole() {
        return intermediaryRole;
    }

    /**
     * Sets the value of the intermediaryRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIntermediaryRole(JAXBElement<String> value) {
        this.intermediaryRole = value;
    }

    /**
     * Gets the value of the isCDAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCDAccount() {
        return isCDAccount;
    }

    /**
     * Sets the value of the isCDAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCDAccount(Boolean value) {
        this.isCDAccount = value;
    }

    /**
     * Gets the value of the isCommercialPCV property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCommercialPCV() {
        return isCommercialPCV;
    }

    /**
     * Sets the value of the isCommercialPCV property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCommercialPCV(Boolean value) {
        this.isCommercialPCV = value;
    }

    /**
     * Gets the value of the isCommercialTrailer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCommercialTrailer() {
        return isCommercialTrailer;
    }

    /**
     * Sets the value of the isCommercialTrailer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCommercialTrailer(Boolean value) {
        this.isCommercialTrailer = value;
    }

    /**
     * Gets the value of the isCommercialVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCommercialVehicle() {
        return isCommercialVehicle;
    }

    /**
     * Sets the value of the isCommercialVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCommercialVehicle(Boolean value) {
        this.isCommercialVehicle = value;
    }

    /**
     * Gets the value of the isCustomerDetailsRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCustomerDetailsRequired() {
        return isCustomerDetailsRequired;
    }

    /**
     * Sets the value of the isCustomerDetailsRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCustomerDetailsRequired(Boolean value) {
        this.isCustomerDetailsRequired = value;
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
     * Gets the value of the isMappedProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMappedProduct() {
        return isMappedProduct;
    }

    /**
     * Sets the value of the isMappedProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMappedProduct(Boolean value) {
        this.isMappedProduct = value;
    }

    /**
     * Gets the value of the isMultiYearPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultiYearPolicy() {
        return isMultiYearPolicy;
    }

    /**
     * Sets the value of the isMultiYearPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiYearPolicy(Boolean value) {
        this.isMultiYearPolicy = value;
    }

    /**
     * Gets the value of the isMultiYearPolicyFetch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultiYearPolicyFetch() {
        return isMultiYearPolicyFetch;
    }

    /**
     * Sets the value of the isMultiYearPolicyFetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiYearPolicyFetch(Boolean value) {
        this.isMultiYearPolicyFetch = value;
    }

    /**
     * Gets the value of the isNewPayment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsNewPayment() {
        return isNewPayment;
    }

    /**
     * Sets the value of the isNewPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsNewPayment(JAXBElement<String> value) {
        this.isNewPayment = value;
    }

    /**
     * Gets the value of the isProposalFetchTypeRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProposalFetchTypeRenewal() {
        return isProposalFetchTypeRenewal;
    }

    /**
     * Sets the value of the isProposalFetchTypeRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProposalFetchTypeRenewal(Boolean value) {
        this.isProposalFetchTypeRenewal = value;
    }

    /**
     * Gets the value of the isRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsRequired() {
        return isRequired;
    }

    /**
     * Sets the value of the isRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsRequired(JAXBElement<String> value) {
        this.isRequired = value;
    }

    /**
     * Gets the value of the isRequiredForamtedUserXML property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequiredForamtedUserXML() {
        return isRequiredForamtedUserXML;
    }

    /**
     * Sets the value of the isRequiredForamtedUserXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequiredForamtedUserXML(Boolean value) {
        this.isRequiredForamtedUserXML = value;
    }

    /**
     * Gets the value of the isValidUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValidUser() {
        return isValidUser;
    }

    /**
     * Sets the value of the isValidUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValidUser(Boolean value) {
        this.isValidUser = value;
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
     * Gets the value of the jobErrorMsg property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobErrorMsg() {
        return jobErrorMsg;
    }

    /**
     * Sets the value of the jobErrorMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobErrorMsg(JAXBElement<String> value) {
        this.jobErrorMsg = value;
    }

    /**
     * Gets the value of the kCessAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKCessAmount() {
        return kCessAmount;
    }

    /**
     * Sets the value of the kCessAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKCessAmount(Double value) {
        this.kCessAmount = value;
    }

    /**
     * Gets the value of the lvgiPortalType property.
     * 
     * @return
     *     possible object is
     *     {@link ClsUserDataPortalType }
     *     
     */
    public ClsUserDataPortalType getLVGIPortalType() {
        return lvgiPortalType;
    }

    /**
     * Sets the value of the lvgiPortalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsUserDataPortalType }
     *     
     */
    public void setLVGIPortalType(ClsUserDataPortalType value) {
        this.lvgiPortalType = value;
    }

    /**
     * Gets the value of the leadNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLeadNo() {
        return leadNo;
    }

    /**
     * Sets the value of the leadNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLeadNo(JAXBElement<String> value) {
        this.leadNo = value;
    }

    /**
     * Gets the value of the lineofBusinessCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineofBusinessCode() {
        return lineofBusinessCode;
    }

    /**
     * Sets the value of the lineofBusinessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineofBusinessCode(JAXBElement<String> value) {
        this.lineofBusinessCode = value;
    }

    /**
     * Gets the value of the lineofBusinessName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineofBusinessName() {
        return lineofBusinessName;
    }

    /**
     * Sets the value of the lineofBusinessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineofBusinessName(JAXBElement<String> value) {
        this.lineofBusinessName = value;
    }

    /**
     * Gets the value of the localHouseBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalHouseBankCode() {
        return localHouseBankCode;
    }

    /**
     * Sets the value of the localHouseBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalHouseBankCode(JAXBElement<String> value) {
        this.localHouseBankCode = value;
    }

    /**
     * Gets the value of the locationID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationID() {
        return locationID;
    }

    /**
     * Sets the value of the locationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationID(JAXBElement<String> value) {
        this.locationID = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationName(JAXBElement<String> value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the micrCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMICRCode() {
        return micrCode;
    }

    /**
     * Sets the value of the micrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMICRCode(JAXBElement<String> value) {
        this.micrCode = value;
    }

    /**
     * Gets the value of the mailPassword property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailPassword() {
        return mailPassword;
    }

    /**
     * Sets the value of the mailPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailPassword(JAXBElement<String> value) {
        this.mailPassword = value;
    }

    /**
     * Gets the value of the mailPort property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailPort() {
        return mailPort;
    }

    /**
     * Sets the value of the mailPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailPort(JAXBElement<String> value) {
        this.mailPort = value;
    }

    /**
     * Gets the value of the mailSender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailSender() {
        return mailSender;
    }

    /**
     * Sets the value of the mailSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailSender(JAXBElement<String> value) {
        this.mailSender = value;
    }

    /**
     * Gets the value of the mailServer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailServer() {
        return mailServer;
    }

    /**
     * Sets the value of the mailServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailServer(JAXBElement<String> value) {
        this.mailServer = value;
    }

    /**
     * Gets the value of the manualCoverNoteNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManualCoverNoteNumber() {
        return manualCoverNoteNumber;
    }

    /**
     * Sets the value of the manualCoverNoteNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManualCoverNoteNumber(JAXBElement<String> value) {
        this.manualCoverNoteNumber = value;
    }

    /**
     * Gets the value of the marketingOfficerCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingOfficerCode() {
        return marketingOfficerCode;
    }

    /**
     * Sets the value of the marketingOfficerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingOfficerCode(JAXBElement<String> value) {
        this.marketingOfficerCode = value;
    }

    /**
     * Gets the value of the marketingOfficerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingOfficerName() {
        return marketingOfficerName;
    }

    /**
     * Sets the value of the marketingOfficerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingOfficerName(JAXBElement<String> value) {
        this.marketingOfficerName = value;
    }

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMerchantId(JAXBElement<String> value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the methodAccountsTracker property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMethodAccountsTracker() {
        return methodAccountsTracker;
    }

    /**
     * Sets the value of the methodAccountsTracker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMethodAccountsTracker(Boolean value) {
        this.methodAccountsTracker = value;
    }

    /**
     * Gets the value of the methodCallingTracker property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMethodCallingTracker() {
        return methodCallingTracker;
    }

    /**
     * Sets the value of the methodCallingTracker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMethodCallingTracker(Boolean value) {
        this.methodCallingTracker = value;
    }

    /**
     * Gets the value of the migratedPolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMigratedPolicyNumber() {
        return migratedPolicyNumber;
    }

    /**
     * Sets the value of the migratedPolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMigratedPolicyNumber(JAXBElement<String> value) {
        this.migratedPolicyNumber = value;
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
     * Gets the value of the modifyDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModifyDate() {
        return modifyDate;
    }

    /**
     * Sets the value of the modifyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModifyDate(JAXBElement<String> value) {
        this.modifyDate = value;
    }

    /**
     * Gets the value of the modifyTransId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getModifyTransId() {
        return modifyTransId;
    }

    /**
     * Sets the value of the modifyTransId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setModifyTransId(JAXBElement<String> value) {
        this.modifyTransId = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsgType(JAXBElement<String> value) {
        this.msgType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
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
     * Gets the value of the newCustPolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewCustPolicyNumber() {
        return newCustPolicyNumber;
    }

    /**
     * Sets the value of the newCustPolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewCustPolicyNumber(JAXBElement<String> value) {
        this.newCustPolicyNumber = value;
    }

    /**
     * Gets the value of the newGCPolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNewGCPolicyNumber() {
        return newGCPolicyNumber;
    }

    /**
     * Sets the value of the newGCPolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNewGCPolicyNumber(JAXBElement<String> value) {
        this.newGCPolicyNumber = value;
    }

    /**
     * Gets the value of the nonElectricalAccessories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNonElectricalAccessories() {
        return nonElectricalAccessories;
    }

    /**
     * Sets the value of the nonElectricalAccessories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNonElectricalAccessories(JAXBElement<String> value) {
        this.nonElectricalAccessories = value;
    }

    /**
     * Gets the value of the odDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getODDiscount() {
        return odDiscount;
    }

    /**
     * Sets the value of the odDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setODDiscount(Double value) {
        this.odDiscount = value;
    }

    /**
     * Gets the value of the odLoading property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getODLoading() {
        return odLoading;
    }

    /**
     * Sets the value of the odLoading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setODLoading(Double value) {
        this.odLoading = value;
    }

    /**
     * Gets the value of the obsoleteVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObsoleteVehicle() {
        return obsoleteVehicle;
    }

    /**
     * Sets the value of the obsoleteVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObsoleteVehicle(JAXBElement<String> value) {
        this.obsoleteVehicle = value;
    }

    /**
     * Gets the value of the occupationCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOccupationCode() {
        return occupationCode;
    }

    /**
     * Sets the value of the occupationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOccupationCode(JAXBElement<String> value) {
        this.occupationCode = value;
    }

    /**
     * Gets the value of the odometerReading property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOdometerReading() {
        return odometerReading;
    }

    /**
     * Sets the value of the odometerReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOdometerReading(JAXBElement<String> value) {
        this.odometerReading = value;
    }

    /**
     * Gets the value of the officeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfficeAddress() {
        return officeAddress;
    }

    /**
     * Sets the value of the officeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfficeAddress(JAXBElement<String> value) {
        this.officeAddress = value;
    }

    /**
     * Gets the value of the officeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfficeCode(JAXBElement<String> value) {
        this.officeCode = value;
    }

    /**
     * Gets the value of the officeID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfficeID() {
        return officeID;
    }

    /**
     * Sets the value of the officeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfficeID(JAXBElement<String> value) {
        this.officeID = value;
    }

    /**
     * Gets the value of the officeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfficeName() {
        return officeName;
    }

    /**
     * Sets the value of the officeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfficeName(JAXBElement<String> value) {
        this.officeName = value;
    }

    /**
     * Gets the value of the oldCustPolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOldCustPolicyNumber() {
        return oldCustPolicyNumber;
    }

    /**
     * Sets the value of the oldCustPolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOldCustPolicyNumber(JAXBElement<String> value) {
        this.oldCustPolicyNumber = value;
    }

    /**
     * Gets the value of the oldGCPolicyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOldGCPolicyNumber() {
        return oldGCPolicyNumber;
    }

    /**
     * Sets the value of the oldGCPolicyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOldGCPolicyNumber(JAXBElement<String> value) {
        this.oldGCPolicyNumber = value;
    }

    /**
     * Gets the value of the oldProposalDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOldProposalDate() {
        return oldProposalDate;
    }

    /**
     * Sets the value of the oldProposalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOldProposalDate(JAXBElement<String> value) {
        this.oldProposalDate = value;
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
     * Gets the value of the operationMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationMode() {
        return operationMode;
    }

    /**
     * Sets the value of the operationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationMode(JAXBElement<String> value) {
        this.operationMode = value;
    }

    /**
     * Gets the value of the optionalParameter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionalParameter() {
        return optionalParameter;
    }

    /**
     * Sets the value of the optionalParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionalParameter(Boolean value) {
        this.optionalParameter = value;
    }

    /**
     * Gets the value of the overrideFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOverrideFlag() {
        return overrideFlag;
    }

    /**
     * Sets the value of the overrideFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOverrideFlag(JAXBElement<String> value) {
        this.overrideFlag = value;
    }

    /**
     * Gets the value of the pageAction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPageAction() {
        return pageAction;
    }

    /**
     * Sets the value of the pageAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPageAction(JAXBElement<String> value) {
        this.pageAction = value;
    }

    /**
     * Gets the value of the parameterType property.
     * 
     * @return
     *     possible object is
     *     {@link ClsUserDataReportParameterType }
     *     
     */
    public ClsUserDataReportParameterType getParameterType() {
        return parameterType;
    }

    /**
     * Sets the value of the parameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsUserDataReportParameterType }
     *     
     */
    public void setParameterType(ClsUserDataReportParameterType value) {
        this.parameterType = value;
    }

    /**
     * Gets the value of the parentOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentOfficeCode() {
        return parentOfficeCode;
    }

    /**
     * Sets the value of the parentOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentOfficeCode(JAXBElement<String> value) {
        this.parentOfficeCode = value;
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
     * Gets the value of the payerCD property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayerCD() {
        return payerCD;
    }

    /**
     * Sets the value of the payerCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayerCD(JAXBElement<String> value) {
        this.payerCD = value;
    }

    /**
     * Gets the value of the payerCustomerID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayerCustomerID() {
        return payerCustomerID;
    }

    /**
     * Sets the value of the payerCustomerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayerCustomerID(JAXBElement<String> value) {
        this.payerCustomerID = value;
    }

    /**
     * Gets the value of the payerID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayerID() {
        return payerID;
    }

    /**
     * Sets the value of the payerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayerID(JAXBElement<String> value) {
        this.payerID = value;
    }

    /**
     * Gets the value of the payerType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayerType() {
        return payerType;
    }

    /**
     * Sets the value of the payerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayerType(JAXBElement<String> value) {
        this.payerType = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPaymentAmount(Double value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentDate(JAXBElement<String> value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentId(JAXBElement<String> value) {
        this.paymentId = value;
    }

    /**
     * Gets the value of the paymentIdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentIdStatus() {
        return paymentIdStatus;
    }

    /**
     * Sets the value of the paymentIdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentIdStatus(JAXBElement<String> value) {
        this.paymentIdStatus = value;
    }

    /**
     * Gets the value of the paymentMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentMode() {
        return paymentMode;
    }

    /**
     * Sets the value of the paymentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentMode(JAXBElement<String> value) {
        this.paymentMode = value;
    }

    /**
     * Gets the value of the paymentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentNumber() {
        return paymentNumber;
    }

    /**
     * Sets the value of the paymentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentNumber(JAXBElement<String> value) {
        this.paymentNumber = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentType(JAXBElement<String> value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the paymentTypeCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentTypeCd() {
        return paymentTypeCd;
    }

    /**
     * Sets the value of the paymentTypeCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentTypeCd(JAXBElement<String> value) {
        this.paymentTypeCd = value;
    }

    /**
     * Gets the value of the policyAlreadyGenerated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPolicyAlreadyGenerated() {
        return policyAlreadyGenerated;
    }

    /**
     * Sets the value of the policyAlreadyGenerated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPolicyAlreadyGenerated(Boolean value) {
        this.policyAlreadyGenerated = value;
    }

    /**
     * Gets the value of the policyDocCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyDocCode() {
        return policyDocCode;
    }

    /**
     * Sets the value of the policyDocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyDocCode(JAXBElement<String> value) {
        this.policyDocCode = value;
    }

    /**
     * Gets the value of the policyDocumentDtls property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfclsUWDocServiceResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfclsUWDocServiceResult> getPolicyDocumentDtls() {
        return policyDocumentDtls;
    }

    /**
     * Sets the value of the policyDocumentDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfclsUWDocServiceResult }{@code >}
     *     
     */
    public void setPolicyDocumentDtls(JAXBElement<ArrayOfclsUWDocServiceResult> value) {
        this.policyDocumentDtls = value;
    }

    /**
     * Gets the value of the policyNO property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyNO() {
        return policyNO;
    }

    /**
     * Sets the value of the policyNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyNO(JAXBElement<String> value) {
        this.policyNO = value;
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
     * Gets the value of the policyType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPolicyType() {
        return policyType;
    }

    /**
     * Sets the value of the policyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPolicyType(JAXBElement<String> value) {
        this.policyType = value;
    }

    /**
     * Gets the value of the previousPolicyExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousPolicyExpiryDate() {
        return previousPolicyExpiryDate;
    }

    /**
     * Sets the value of the previousPolicyExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousPolicyExpiryDate(JAXBElement<String> value) {
        this.previousPolicyExpiryDate = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductCode(JAXBElement<String> value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the productIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductIndex() {
        return productIndex;
    }

    /**
     * Sets the value of the productIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductIndex(JAXBElement<String> value) {
        this.productIndex = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductName(JAXBElement<String> value) {
        this.productName = value;
    }

    /**
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductType(JAXBElement<String> value) {
        this.productType = value;
    }

    /**
     * Gets the value of the proposalDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProposalDate() {
        return proposalDate;
    }

    /**
     * Sets the value of the proposalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProposalDate(JAXBElement<String> value) {
        this.proposalDate = value;
    }

    /**
     * Gets the value of the proposalGenerationMode property.
     * 
     * @return
     *     possible object is
     *     {@link ClsUserDataProposalMode }
     *     
     */
    public ClsUserDataProposalMode getProposalGenerationMode() {
        return proposalGenerationMode;
    }

    /**
     * Sets the value of the proposalGenerationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsUserDataProposalMode }
     *     
     */
    public void setProposalGenerationMode(ClsUserDataProposalMode value) {
        this.proposalGenerationMode = value;
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
     * Gets the value of the proposalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProposalStatus() {
        return proposalStatus;
    }

    /**
     * Sets the value of the proposalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProposalStatus(JAXBElement<String> value) {
        this.proposalStatus = value;
    }

    /**
     * Gets the value of the proposalTransactionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProposalTransactionTypeCode() {
        return proposalTransactionTypeCode;
    }

    /**
     * Sets the value of the proposalTransactionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProposalTransactionTypeCode(JAXBElement<String> value) {
        this.proposalTransactionTypeCode = value;
    }

    /**
     * Gets the value of the proposalTransactionTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProposalTransactionTypeDesc() {
        return proposalTransactionTypeDesc;
    }

    /**
     * Sets the value of the proposalTransactionTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProposalTransactionTypeDesc(JAXBElement<String> value) {
        this.proposalTransactionTypeDesc = value;
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
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptDate(JAXBElement<String> value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the receiptMailID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReceiptMailID() {
        return receiptMailID;
    }

    /**
     * Sets the value of the receiptMailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReceiptMailID(JAXBElement<String> value) {
        this.receiptMailID = value;
    }

    /**
     * Gets the value of the recordStatus1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecordStatus1() {
        return recordStatus1;
    }

    /**
     * Sets the value of the recordStatus1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecordStatus1(JAXBElement<String> value) {
        this.recordStatus1 = value;
    }

    /**
     * Gets the value of the refDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefDate() {
        return refDate;
    }

    /**
     * Sets the value of the refDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefDate(JAXBElement<String> value) {
        this.refDate = value;
    }

    /**
     * Gets the value of the refNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefNo() {
        return refNo;
    }

    /**
     * Sets the value of the refNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefNo(JAXBElement<String> value) {
        this.refNo = value;
    }

    /**
     * Gets the value of the referenceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceDate() {
        return referenceDate;
    }

    /**
     * Sets the value of the referenceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceDate(JAXBElement<String> value) {
        this.referenceDate = value;
    }

    /**
     * Gets the value of the referenceNo1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceNo1() {
        return referenceNo1;
    }

    /**
     * Sets the value of the referenceNo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceNo1(JAXBElement<String> value) {
        this.referenceNo1 = value;
    }

    /**
     * Gets the value of the referenceNo2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceNo2() {
        return referenceNo2;
    }

    /**
     * Sets the value of the referenceNo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceNo2(JAXBElement<String> value) {
        this.referenceNo2 = value;
    }

    /**
     * Gets the value of the referenceNo3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceNo3() {
        return referenceNo3;
    }

    /**
     * Sets the value of the referenceNo3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceNo3(JAXBElement<String> value) {
        this.referenceNo3 = value;
    }

    /**
     * Gets the value of the regdNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegdNo() {
        return regdNo;
    }

    /**
     * Sets the value of the regdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegdNo(JAXBElement<String> value) {
        this.regdNo = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRemarks(JAXBElement<String> value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the reportAsPDF property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReportAsPDF() {
        return reportAsPDF;
    }

    /**
     * Sets the value of the reportAsPDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReportAsPDF(Boolean value) {
        this.reportAsPDF = value;
    }

    /**
     * Gets the value of the reportGenerationType property.
     * 
     * @return
     *     possible object is
     *     {@link ClsUserDataReportType }
     *     
     */
    public ClsUserDataReportType getReportGenerationType() {
        return reportGenerationType;
    }

    /**
     * Sets the value of the reportGenerationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsUserDataReportType }
     *     
     */
    public void setReportGenerationType(ClsUserDataReportType value) {
        this.reportGenerationType = value;
    }

    /**
     * Gets the value of the reportHtmlString property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     *     
     */
    public JAXBElement<StringBuilder> getReportHtmlString() {
        return reportHtmlString;
    }

    /**
     * Sets the value of the reportHtmlString property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     *     
     */
    public void setReportHtmlString(JAXBElement<StringBuilder> value) {
        this.reportHtmlString = value;
    }

    /**
     * Gets the value of the reportTemplateNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportTemplateNo() {
        return reportTemplateNo;
    }

    /**
     * Sets the value of the reportTemplateNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportTemplateNo(JAXBElement<String> value) {
        this.reportTemplateNo = value;
    }

    /**
     * Gets the value of the reportTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportTypeCode() {
        return reportTypeCode;
    }

    /**
     * Sets the value of the reportTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportTypeCode(JAXBElement<String> value) {
        this.reportTypeCode = value;
    }

    /**
     * Gets the value of the retSqlQuery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetSqlQuery() {
        return retSqlQuery;
    }

    /**
     * Sets the value of the retSqlQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetSqlQuery(JAXBElement<String> value) {
        this.retSqlQuery = value;
    }

    /**
     * Gets the value of the retVal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetVal() {
        return retVal;
    }

    /**
     * Sets the value of the retVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetVal(JAXBElement<String> value) {
        this.retVal = value;
    }

    /**
     * Gets the value of the riskDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRiskDate() {
        return riskDate;
    }

    /**
     * Sets the value of the riskDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRiskDate(JAXBElement<String> value) {
        this.riskDate = value;
    }

    /**
     * Gets the value of the riskEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRiskEndDate() {
        return riskEndDate;
    }

    /**
     * Sets the value of the riskEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRiskEndDate(JAXBElement<String> value) {
        this.riskEndDate = value;
    }

    /**
     * Gets the value of the riskSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRiskSerialNo() {
        return riskSerialNo;
    }

    /**
     * Sets the value of the riskSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRiskSerialNo(JAXBElement<String> value) {
        this.riskSerialNo = value;
    }

    /**
     * Gets the value of the riskStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRiskStartDate() {
        return riskStartDate;
    }

    /**
     * Sets the value of the riskStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRiskStartDate(JAXBElement<String> value) {
        this.riskStartDate = value;
    }

    /**
     * Gets the value of the rowCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRowCount() {
        return rowCount;
    }

    /**
     * Sets the value of the rowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRowCount(JAXBElement<String> value) {
        this.rowCount = value;
    }

    /**
     * Gets the value of the rsnForCancellation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRsnForCancellation() {
        return rsnForCancellation;
    }

    /**
     * Sets the value of the rsnForCancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRsnForCancellation(JAXBElement<String> value) {
        this.rsnForCancellation = value;
    }

    /**
     * Gets the value of the ruleErrorText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRuleErrorText() {
        return ruleErrorText;
    }

    /**
     * Sets the value of the ruleErrorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRuleErrorText(JAXBElement<String> value) {
        this.ruleErrorText = value;
    }

    /**
     * Gets the value of the sgstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSGSTAmount() {
        return sgstAmount;
    }

    /**
     * Sets the value of the sgstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSGSTAmount(Double value) {
        this.sgstAmount = value;
    }

    /**
     * Gets the value of the sqlQuery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSQLQuery() {
        return sqlQuery;
    }

    /**
     * Sets the value of the sqlQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSQLQuery(JAXBElement<String> value) {
        this.sqlQuery = value;
    }

    /**
     * Gets the value of the saveType property.
     * 
     * @return
     *     possible object is
     *     {@link ClsUserDataSaveModeType }
     *     
     */
    public ClsUserDataSaveModeType getSaveType() {
        return saveType;
    }

    /**
     * Sets the value of the saveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsUserDataSaveModeType }
     *     
     */
    public void setSaveType(ClsUserDataSaveModeType value) {
        this.saveType = value;
    }

    /**
     * Gets the value of the senderMailId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderMailId() {
        return senderMailId;
    }

    /**
     * Sets the value of the senderMailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderMailId(JAXBElement<String> value) {
        this.senderMailId = value;
    }

    /**
     * Gets the value of the serviceConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceConsumer() {
        return serviceConsumer;
    }

    /**
     * Sets the value of the serviceConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceConsumer(JAXBElement<String> value) {
        this.serviceConsumer = value;
    }

    /**
     * Gets the value of the serviceErrorText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceErrorText() {
        return serviceErrorText;
    }

    /**
     * Sets the value of the serviceErrorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceErrorText(JAXBElement<String> value) {
        this.serviceErrorText = value;
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
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceType(JAXBElement<String> value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the stampDuty property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStampDuty() {
        return stampDuty;
    }

    /**
     * Sets the value of the stampDuty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStampDuty(Double value) {
        this.stampDuty = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<String> value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<String> value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateCode(JAXBElement<String> value) {
        this.stateCode = value;
    }

    /**
     * Gets the value of the stateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateName() {
        return stateName;
    }

    /**
     * Sets the value of the stateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateName(JAXBElement<String> value) {
        this.stateName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubject(JAXBElement<String> value) {
        this.subject = value;
    }

    /**
     * Gets the value of the tpDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTPDiscount() {
        return tpDiscount;
    }

    /**
     * Sets the value of the tpDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTPDiscount(Double value) {
        this.tpDiscount = value;
    }

    /**
     * Gets the value of the tpLoading property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTPLoading() {
        return tpLoading;
    }

    /**
     * Sets the value of the tpLoading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTPLoading(Double value) {
        this.tpLoading = value;
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
     * Gets the value of the totalSI property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalSI() {
        return totalSI;
    }

    /**
     * Sets the value of the totalSI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalSI(Double value) {
        this.totalSI = value;
    }

    /**
     * Gets the value of the totalSumInsured property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalSumInsured() {
        return totalSumInsured;
    }

    /**
     * Sets the value of the totalSumInsured property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalSumInsured(JAXBElement<String> value) {
        this.totalSumInsured = value;
    }

    /**
     * Gets the value of the trailerIDV property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrailerIDV() {
        return trailerIDV;
    }

    /**
     * Sets the value of the trailerIDV property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrailerIDV(JAXBElement<String> value) {
        this.trailerIDV = value;
    }

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionCode(JAXBElement<String> value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionDate(JAXBElement<String> value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTransactionId(Double value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionType(JAXBElement<String> value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the ugstAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUGSTAmount() {
        return ugstAmount;
    }

    /**
     * Sets the value of the ugstAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUGSTAmount(Double value) {
        this.ugstAmount = value;
    }

    /**
     * Gets the value of the uwDocDtlsGrid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfclsUWDocServiceResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfclsUWDocServiceResult> getUWDocDtlsGrid() {
        return uwDocDtlsGrid;
    }

    /**
     * Sets the value of the uwDocDtlsGrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfclsUWDocServiceResult }{@code >}
     *     
     */
    public void setUWDocDtlsGrid(JAXBElement<ArrayOfclsUWDocServiceResult> value) {
        this.uwDocDtlsGrid = value;
    }

    /**
     * Gets the value of the uploadedFileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUploadedFileName() {
        return uploadedFileName;
    }

    /**
     * Sets the value of the uploadedFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUploadedFileName(JAXBElement<String> value) {
        this.uploadedFileName = value;
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
     * Gets the value of the userObjectTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getUserObjectTemplate() {
        return userObjectTemplate;
    }

    /**
     * Sets the value of the userObjectTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setUserObjectTemplate(JAXBElement<byte[]> value) {
        this.userObjectTemplate = value;
    }

    /**
     * Gets the value of the userObjectTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserObjectTypeName() {
        return userObjectTypeName;
    }

    /**
     * Sets the value of the userObjectTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserObjectTypeName(JAXBElement<String> value) {
        this.userObjectTypeName = value;
    }

    /**
     * Gets the value of the userResultXml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserResultXml() {
        return userResultXml;
    }

    /**
     * Sets the value of the userResultXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserResultXml(JAXBElement<String> value) {
        this.userResultXml = value;
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
     * Gets the value of the vehicleInspection property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleInspection() {
        return vehicleInspection;
    }

    /**
     * Sets the value of the vehicleInspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleInspection(JAXBElement<String> value) {
        this.vehicleInspection = value;
    }

    /**
     * Gets the value of the vehicleRegistrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    /**
     * Sets the value of the vehicleRegistrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVehicleRegistrationNumber(JAXBElement<String> value) {
        this.vehicleRegistrationNumber = value;
    }

    /**
     * Gets the value of the voucherDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVoucherDate() {
        return voucherDate;
    }

    /**
     * Sets the value of the voucherDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVoucherDate(JAXBElement<String> value) {
        this.voucherDate = value;
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
     * Gets the value of the workFlowId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkFlowId() {
        return workFlowId;
    }

    /**
     * Sets the value of the workFlowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkFlowId(JAXBElement<String> value) {
        this.workFlowId = value;
    }

    /**
     * Gets the value of the worksheetByte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getWorksheetByte() {
        return worksheetByte;
    }

    /**
     * Sets the value of the worksheetByte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setWorksheetByte(JAXBElement<byte[]> value) {
        this.worksheetByte = value;
    }

    /**
     * Gets the value of the worksheetInByte property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWorksheetInByte() {
        return worksheetInByte;
    }

    /**
     * Sets the value of the worksheetInByte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWorksheetInByte(Boolean value) {
        this.worksheetInByte = value;
    }

    /**
     * Gets the value of the worksheetPath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorksheetPath() {
        return worksheetPath;
    }

    /**
     * Sets the value of the worksheetPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorksheetPath(JAXBElement<String> value) {
        this.worksheetPath = value;
    }

    /**
     * Gets the value of the ynIntermediary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getYNIntermediary() {
        return ynIntermediary;
    }

    /**
     * Sets the value of the ynIntermediary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setYNIntermediary(JAXBElement<String> value) {
        this.ynIntermediary = value;
    }

}
