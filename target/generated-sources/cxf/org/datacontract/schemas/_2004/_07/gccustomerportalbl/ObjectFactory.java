
package org.datacontract.schemas._2004._07.gccustomerportalbl;

import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.datacontract.schemas._2004._07.dbutility.DataObjectClass;
import org.datacontract.schemas._2004._07.system.StringBuilder;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.gccustomerportalbl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServiceResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ServiceResult");
    private final static QName _ClsUserData_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsUserData");
    private final static QName _ClsUserDataEndorsementTypeDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsUserData.EndorsementTypeDetails");
    private final static QName _ArrayOfclsDictionary_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ArrayOfclsDictionary");
    private final static QName _ClsDictionary_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsDictionary");
    private final static QName _ArrayOfclsInspUserData_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ArrayOfclsInspUserData");
    private final static QName _ClsInspUserData_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsInspUserData");
    private final static QName _ClsUserDataPortalType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsUserData.PortalType");
    private final static QName _ClsUserDataReportParameterType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsUserData.ReportParameterType");
    private final static QName _ArrayOfclsUWDocServiceResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ArrayOfclsUWDocServiceResult");
    private final static QName _ClsUWDocServiceResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsUWDocServiceResult");
    private final static QName _ClsUserDataProposalMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsUserData.ProposalMode");
    private final static QName _ClsUserDataReportType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsUserData.ReportType");
    private final static QName _ClsUserDataSaveModeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsUserData.SaveModeType");
    private final static QName _ClsClaimUploadResultSet_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsClaimUploadResultSet");
    private final static QName _ClsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsRequest");
    private final static QName _ClsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsResponse");
    private final static QName _ClsResponseDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsResponseDetails");
    private final static QName _SearchResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "SearchResult");
    private final static QName _ArrayOfclsSearchView_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ArrayOfclsSearchView");
    private final static QName _ClsSearchView_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "clsSearchView");
    private final static QName _ClsSearchViewChasisNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ChasisNumber");
    private final static QName _ClsSearchViewClaimStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ClaimStatus");
    private final static QName _ClsSearchViewCustomerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CustomerName");
    private final static QName _ClsSearchViewEndorsementType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "EndorsementType");
    private final static QName _ClsSearchViewEngineNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "EngineNumber");
    private final static QName _ClsSearchViewPolicyEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PolicyEndDate");
    private final static QName _ClsSearchViewPolicyNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PolicyNumber");
    private final static QName _ClsSearchViewPolicyType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PolicyType");
    private final static QName _ClsSearchViewProductCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ProductCode");
    private final static QName _ClsSearchViewRegistrationNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "RegistrationNumber");
    private final static QName _ClsResponseDetailsErrorText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ErrorText");
    private final static QName _ClsResponseDetailsProposalNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ProposalNumber");
    private final static QName _ClsResponseDetailsWorKFlowId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "WorKFlowId");
    private final static QName _ClsUWDocServiceResultDocName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "DocName");
    private final static QName _ClsUWDocServiceResultInfo1_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "Info1");
    private final static QName _ClsUWDocServiceResultInfo2_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "Info2");
    private final static QName _ClsUWDocServiceResultInfo3_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "Info3");
    private final static QName _ClsUWDocServiceResultInfo4_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "Info4");
    private final static QName _ClsUWDocServiceResultInfo5_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "Info5");
    private final static QName _ClsUWDocServiceResultInsertDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InsertDate");
    private final static QName _ClsUWDocServiceResultInsertTransId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InsertTransId");
    private final static QName _ClsUWDocServiceResultModeOfOperation_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ModeOfOperation");
    private final static QName _ClsUWDocServiceResultModifyDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ModifyDate");
    private final static QName _ClsUWDocServiceResultModifyTransId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ModifyTransId");
    private final static QName _ClsUWDocServiceResultRefDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "RefDate");
    private final static QName _ClsUWDocServiceResultReferenceNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ReferenceNo");
    private final static QName _ClsUWDocServiceResultUserId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "UserId");
    private final static QName _ClsUWDocServiceResultUserRole_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "UserRole");
    private final static QName _ClsInspUserDataApprovalNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ApprovalNo");
    private final static QName _ClsInspUserDataBodyColour_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "BodyColour");
    private final static QName _ClsInspUserDataChannelId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ChannelId");
    private final static QName _ClsInspUserDataDeptNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "DeptNo");
    private final static QName _ClsInspUserDataEmployeeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "EmployeeName");
    private final static QName _ClsInspUserDataEmployeeNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "EmployeeNo");
    private final static QName _ClsInspUserDataEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "EndDate");
    private final static QName _ClsInspUserDataEndorsementDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "EndorsementDate");
    private final static QName _ClsInspUserDataEndorsementTypeCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "EndorsementTypeCode");
    private final static QName _ClsInspUserDataID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ID");
    private final static QName _ClsInspUserDataInspectionAgencyCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InspectionAgencyCode");
    private final static QName _ClsInspUserDataInspectionAgencyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InspectionAgencyName");
    private final static QName _ClsInspUserDataInspectionAuthority_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InspectionAuthority");
    private final static QName _ClsInspUserDataInspectionAuthoritySelected_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InspectionAuthoritySelected");
    private final static QName _ClsInspUserDataInspectionOverride_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InspectionOverride");
    private final static QName _ClsInspUserDataInspectionRequestDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InspectionRequestDate");
    private final static QName _ClsInspUserDataInspectionRequestTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InspectionRequestTime");
    private final static QName _ClsInspUserDataInspectionStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InspectionStatus");
    private final static QName _ClsInspUserDataInspectionStatusSelected_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InspectionStatusSelected");
    private final static QName _ClsInspUserDataMailPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "MailPassword");
    private final static QName _ClsInspUserDataMailPort_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "MailPort");
    private final static QName _ClsInspUserDataMailSender_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "MailSender");
    private final static QName _ClsInspUserDataMailServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "MailServer");
    private final static QName _ClsInspUserDataMarketingOfficerCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "MarketingOfficerCode");
    private final static QName _ClsInspUserDataMarketingOfficerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "MarketingOfficerName");
    private final static QName _ClsInspUserDataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "Name");
    private final static QName _ClsInspUserDataOdometerReading_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "OdometerReading");
    private final static QName _ClsInspUserDataOverrideFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "OverrideFlag");
    private final static QName _ClsInspUserDataPolicyNO_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PolicyNO");
    private final static QName _ClsInspUserDataProposalDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ProposalDate");
    private final static QName _ClsInspUserDataReceiptMailID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ReceiptMailID");
    private final static QName _ClsInspUserDataRefNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "RefNo");
    private final static QName _ClsInspUserDataRegdNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "RegdNo");
    private final static QName _ClsInspUserDataRemarks_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "Remarks");
    private final static QName _ClsInspUserDataRetSqlQuery_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "RetSqlQuery");
    private final static QName _ClsInspUserDataRiskEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "RiskEndDate");
    private final static QName _ClsInspUserDataRiskStartDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "RiskStartDate");
    private final static QName _ClsInspUserDataRowCount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "RowCount");
    private final static QName _ClsInspUserDataSenderMailId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "SenderMailId");
    private final static QName _ClsInspUserDataStartDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "StartDate");
    private final static QName _ClsInspUserDataStartTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "StartTime");
    private final static QName _ClsInspUserDataStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "Status");
    private final static QName _ClsInspUserDataSubject_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "Subject");
    private final static QName _ClsInspUserDataUploadedFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "UploadedFileName");
    private final static QName _ClsInspUserDataWorkFlowId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "WorkFlowId");
    private final static QName _ClsDictionaryKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "Key");
    private final static QName _ClsDictionaryOtherInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "OtherInfo");
    private final static QName _ClsDictionaryValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "Value");
    private final static QName _ClsUserDataActualPaymentNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ActualPaymentNumber");
    private final static QName _ClsUserDataActualProductCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ActualProductCode");
    private final static QName _ClsUserDataActualProductIndex_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ActualProductIndex");
    private final static QName _ClsUserDataActualTransactionId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ActualTransactionId");
    private final static QName _ClsUserDataAddressLine1_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "AddressLine1");
    private final static QName _ClsUserDataAddressLine2_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "AddressLine2");
    private final static QName _ClsUserDataAddressLine3_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "AddressLine3");
    private final static QName _ClsUserDataAge_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "Age");
    private final static QName _ClsUserDataApplicableDocs_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ApplicableDocs");
    private final static QName _ClsUserDataApplicableDocuments_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ApplicableDocuments");
    private final static QName _ClsUserDataApplicationNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ApplicationNumber");
    private final static QName _ClsUserDataAuthenticateKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "AuthenticateKey");
    private final static QName _ClsUserDataAutoAcceptedVoucherNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "AutoAcceptedVoucherNo");
    private final static QName _ClsUserDataBGTag_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "BGTag");
    private final static QName _ClsUserDataBankAccountNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "BankAccountNumber");
    private final static QName _ClsUserDataBankBanchAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "BankBanchAddress");
    private final static QName _ClsUserDataBankBranchCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "BankBranchCode");
    private final static QName _ClsUserDataBankBranchName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "BankBranchName");
    private final static QName _ClsUserDataBankCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "BankCode");
    private final static QName _ClsUserDataBankName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "BankName");
    private final static QName _ClsUserDataBasisOfRating_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "BasisOfRating");
    private final static QName _ClsUserDataBlockID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "BlockID");
    private final static QName _ClsUserDataBusinessLocation_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "BusinessLocation");
    private final static QName _ClsUserDataBusinessSourceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "BusinessSourceType");
    private final static QName _ClsUserDataCNGLPGKitValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CNGLPGKitValue");
    private final static QName _ClsUserDataCallEnv_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CallEnv");
    private final static QName _ClsUserDataCallLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CallLevel");
    private final static QName _ClsUserDataCampaign_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "Campaign");
    private final static QName _ClsUserDataCertificateNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CertificateNumber");
    private final static QName _ClsUserDataChassisNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ChassisNumber");
    private final static QName _ClsUserDataChequeDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ChequeDate");
    private final static QName _ClsUserDataChequeNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ChequeNumber");
    private final static QName _ClsUserDataCityDistrictCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CityDistrictCode");
    private final static QName _ClsUserDataCityDistrictFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CityDistrictFlag");
    private final static QName _ClsUserDataCityDistrictName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CityDistrictName");
    private final static QName _ClsUserDataClaimDocCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ClaimDocCode");
    private final static QName _ClsUserDataClaimNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ClaimNumber");
    private final static QName _ClsUserDataCompanyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CompanyName");
    private final static QName _ClsUserDataCompanyShortName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CompanyShortName");
    private final static QName _ClsUserDataConsumeProposalXML_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ConsumeProposalXML");
    private final static QName _ClsUserDataCurrentDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CurrentDate");
    private final static QName _ClsUserDataCustomerFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CustomerFirstName");
    private final static QName _ClsUserDataCustomerId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CustomerId");
    private final static QName _ClsUserDataCustomerLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CustomerLastName");
    private final static QName _ClsUserDataCustomerMiddleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "CustomerMiddleName");
    private final static QName _ClsUserDataDCN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "DCN");
    private final static QName _ClsUserDataDDDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "DDDate");
    private final static QName _ClsUserDataDDNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "DDNumber");
    private final static QName _ClsUserDataDatabaseObjectClasss_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "DatabaseObjectClasss");
    private final static QName _ClsUserDataDaysofTravel_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "DaysofTravel");
    private final static QName _ClsUserDataDetariffDiscountRate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "DetariffDiscountRate");
    private final static QName _ClsUserDataDisplayStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "DisplayStatus");
    private final static QName _ClsUserDataDocCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "DocCode");
    private final static QName _ClsUserDataDocSatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "DocSatus");
    private final static QName _ClsUserDataDocSerialNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "DocSerialNo");
    private final static QName _ClsUserDataECoverNoteHTML_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ECoverNoteHTML");
    private final static QName _ClsUserDataECoverNotePath_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ECoverNotePath");
    private final static QName _ClsUserDataEQZone_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "EQZone");
    private final static QName _ClsUserDataElectricalAccessories_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ElectricalAccessories");
    private final static QName _ClsUserDataEndorsementPremium_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "EndorsementPremium");
    private final static QName _ClsUserDataEndorsementSI_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "EndorsementSI");
    private final static QName _ClsUserDataEndorsementServiceTax_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "EndorsementServiceTax");
    private final static QName _ClsUserDataErrorCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ErrorCode");
    private final static QName _ClsUserDataErrorLogFilePath_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ErrorLogFilePath");
    private final static QName _ClsUserDataErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ErrorMessage");
    private final static QName _ClsUserDataExShowroomPrice_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ExShowroomPrice");
    private final static QName _ClsUserDataExtrnalyBuiltBodyType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ExtrnalyBuiltBodyType");
    private final static QName _ClsUserDataFilePath_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "FilePath");
    private final static QName _ClsUserDataFinancierAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "FinancierAddress");
    private final static QName _ClsUserDataFinancierCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "FinancierCity");
    private final static QName _ClsUserDataFinancierCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "FinancierCode");
    private final static QName _ClsUserDataFinancierDistrict_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "FinancierDistrict");
    private final static QName _ClsUserDataFinancierName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "FinancierName");
    private final static QName _ClsUserDataFinancierPinCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "FinancierPinCode");
    private final static QName _ClsUserDataFinancierState_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "FinancierState");
    private final static QName _ClsUserDataFleetAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "FleetAmount");
    private final static QName _ClsUserDataFleetDiscount_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "FleetDiscount");
    private final static QName _ClsUserDataGLMRate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "GLMRate");
    private final static QName _ClsUserDataGroupXML_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "GroupXML");
    private final static QName _ClsUserDataHostAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "HostAddress");
    private final static QName _ClsUserDataICN_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ICN");
    private final static QName _ClsUserDataIFSCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "IFSCode");
    private final static QName _ClsUserDataInputXML_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InputXML");
    private final static QName _ClsUserDataInspUserDataGrid_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InspUserDataGrid");
    private final static QName _ClsUserDataInspectionAgencyEmailId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InspectionAgencyEmailId");
    private final static QName _ClsUserDataInspectionAgencyLandlineNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InspectionAgencyLandlineNo");
    private final static QName _ClsUserDataInspectionAgencyMobileNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InspectionAgencyMobileNo");
    private final static QName _ClsUserDataInstrumentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "InstrumentType");
    private final static QName _ClsUserDataIntermediaryID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "IntermediaryID");
    private final static QName _ClsUserDataIntermediaryName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "IntermediaryName");
    private final static QName _ClsUserDataIntermediaryRole_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "IntermediaryRole");
    private final static QName _ClsUserDataIsNewPayment_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "IsNewPayment");
    private final static QName _ClsUserDataIsRequired_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "IsRequired");
    private final static QName _ClsUserDataJobErrorMsg_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "JobErrorMsg");
    private final static QName _ClsUserDataLeadNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "LeadNo");
    private final static QName _ClsUserDataLineofBusinessCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "LineofBusinessCode");
    private final static QName _ClsUserDataLineofBusinessName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "LineofBusinessName");
    private final static QName _ClsUserDataLocalHouseBankCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "LocalHouseBankCode");
    private final static QName _ClsUserDataLocationID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "LocationID");
    private final static QName _ClsUserDataLocationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "LocationName");
    private final static QName _ClsUserDataMICRCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "MICRCode");
    private final static QName _ClsUserDataManualCoverNoteNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ManualCoverNoteNumber");
    private final static QName _ClsUserDataMerchantId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "MerchantId");
    private final static QName _ClsUserDataMigratedPolicyNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "MigratedPolicyNumber");
    private final static QName _ClsUserDataMsgType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "MsgType");
    private final static QName _ClsUserDataNewCustPolicyNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "NewCustPolicyNumber");
    private final static QName _ClsUserDataNewGCPolicyNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "NewGCPolicyNumber");
    private final static QName _ClsUserDataNonElectricalAccessories_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "NonElectricalAccessories");
    private final static QName _ClsUserDataObsoleteVehicle_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ObsoleteVehicle");
    private final static QName _ClsUserDataOccupationCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "OccupationCode");
    private final static QName _ClsUserDataOfficeAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "OfficeAddress");
    private final static QName _ClsUserDataOfficeCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "OfficeCode");
    private final static QName _ClsUserDataOfficeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "OfficeID");
    private final static QName _ClsUserDataOfficeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "OfficeName");
    private final static QName _ClsUserDataOldCustPolicyNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "OldCustPolicyNumber");
    private final static QName _ClsUserDataOldGCPolicyNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "OldGCPolicyNumber");
    private final static QName _ClsUserDataOldProposalDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "OldProposalDate");
    private final static QName _ClsUserDataOldProposalNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "OldProposalNumber");
    private final static QName _ClsUserDataOperationMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "OperationMode");
    private final static QName _ClsUserDataPageAction_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PageAction");
    private final static QName _ClsUserDataParentOfficeCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ParentOfficeCode");
    private final static QName _ClsUserDataPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "Password");
    private final static QName _ClsUserDataPayerCD_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PayerCD");
    private final static QName _ClsUserDataPayerCustomerID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PayerCustomerID");
    private final static QName _ClsUserDataPayerID_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PayerID");
    private final static QName _ClsUserDataPayerType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PayerType");
    private final static QName _ClsUserDataPaymentDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PaymentDate");
    private final static QName _ClsUserDataPaymentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PaymentId");
    private final static QName _ClsUserDataPaymentIdStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PaymentIdStatus");
    private final static QName _ClsUserDataPaymentMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PaymentMode");
    private final static QName _ClsUserDataPaymentNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PaymentNumber");
    private final static QName _ClsUserDataPaymentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PaymentType");
    private final static QName _ClsUserDataPaymentTypeCd_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PaymentTypeCd");
    private final static QName _ClsUserDataPolicyDocCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PolicyDocCode");
    private final static QName _ClsUserDataPolicyDocumentDtls_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PolicyDocumentDtls");
    private final static QName _ClsUserDataPreviousPolicyExpiryDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PreviousPolicyExpiryDate");
    private final static QName _ClsUserDataProductIndex_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ProductIndex");
    private final static QName _ClsUserDataProductName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ProductName");
    private final static QName _ClsUserDataProductType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ProductType");
    private final static QName _ClsUserDataProposalStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ProposalStatus");
    private final static QName _ClsUserDataProposalTransactionTypeCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ProposalTransactionTypeCode");
    private final static QName _ClsUserDataProposalTransactionTypeDesc_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ProposalTransactionTypeDesc");
    private final static QName _ClsUserDataQuotationNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "QuotationNumber");
    private final static QName _ClsUserDataQuotationVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "QuotationVersion");
    private final static QName _ClsUserDataReceiptDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ReceiptDate");
    private final static QName _ClsUserDataRecordStatus1_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "RecordStatus1");
    private final static QName _ClsUserDataReferenceDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ReferenceDate");
    private final static QName _ClsUserDataReferenceNo1_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ReferenceNo1");
    private final static QName _ClsUserDataReferenceNo2_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ReferenceNo2");
    private final static QName _ClsUserDataReferenceNo3_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ReferenceNo3");
    private final static QName _ClsUserDataReportHtmlString_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ReportHtmlString");
    private final static QName _ClsUserDataReportTemplateNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ReportTemplateNo");
    private final static QName _ClsUserDataReportTypeCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ReportTypeCode");
    private final static QName _ClsUserDataRetVal_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "RetVal");
    private final static QName _ClsUserDataRiskDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "RiskDate");
    private final static QName _ClsUserDataRiskSerialNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "RiskSerialNo");
    private final static QName _ClsUserDataRsnForCancellation_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "RsnForCancellation");
    private final static QName _ClsUserDataRuleErrorText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "RuleErrorText");
    private final static QName _ClsUserDataSQLQuery_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "SQLQuery");
    private final static QName _ClsUserDataServiceConsumer_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ServiceConsumer");
    private final static QName _ClsUserDataServiceErrorText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ServiceErrorText");
    private final static QName _ClsUserDataServiceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ServiceType");
    private final static QName _ClsUserDataStateCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "StateCode");
    private final static QName _ClsUserDataStateName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "StateName");
    private final static QName _ClsUserDataTotalSumInsured_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "TotalSumInsured");
    private final static QName _ClsUserDataTrailerIDV_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "TrailerIDV");
    private final static QName _ClsUserDataTransactionCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "TransactionCode");
    private final static QName _ClsUserDataTransactionDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "TransactionDate");
    private final static QName _ClsUserDataTransactionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "TransactionType");
    private final static QName _ClsUserDataUWDocDtlsGrid_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "UWDocDtlsGrid");
    private final static QName _ClsUserDataUserObjectTemplate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "UserObjectTemplate");
    private final static QName _ClsUserDataUserObjectTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "UserObjectTypeName");
    private final static QName _ClsUserDataUserResultXml_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "UserResultXml");
    private final static QName _ClsUserDataVehicleInspection_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "VehicleInspection");
    private final static QName _ClsUserDataVehicleRegistrationNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "VehicleRegistrationNumber");
    private final static QName _ClsUserDataVoucherDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "VoucherDate");
    private final static QName _ClsUserDataVoucherNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "VoucherNumber");
    private final static QName _ClsUserDataWarningText_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "WarningText");
    private final static QName _ClsUserDataWorksheetByte_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "WorksheetByte");
    private final static QName _ClsUserDataWorksheetPath_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "WorksheetPath");
    private final static QName _ClsUserDataYNIntermediary_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "YNIntermediary");
    private final static QName _SearchResultLstSearchView_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "LstSearchView");
    private final static QName _ClsResponseResponseDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "ResponseDetails");
    private final static QName _ClsRequestPolicyNoList_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "PolicyNoList");
    private final static QName _ServiceResultUserData_QNAME = new QName("http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", "UserData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.gccustomerportalbl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceResult }
     * 
     */
    public ServiceResult createServiceResult() {
        return new ServiceResult();
    }

    /**
     * Create an instance of {@link ClsClaimUploadResultSet }
     * 
     */
    public ClsClaimUploadResultSet createClsClaimUploadResultSet() {
        return new ClsClaimUploadResultSet();
    }

    /**
     * Create an instance of {@link ClsRequest }
     * 
     */
    public ClsRequest createClsRequest() {
        return new ClsRequest();
    }

    /**
     * Create an instance of {@link ClsResponse }
     * 
     */
    public ClsResponse createClsResponse() {
        return new ClsResponse();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link ClsUserData }
     * 
     */
    public ClsUserData createClsUserData() {
        return new ClsUserData();
    }

    /**
     * Create an instance of {@link ArrayOfclsDictionary }
     * 
     */
    public ArrayOfclsDictionary createArrayOfclsDictionary() {
        return new ArrayOfclsDictionary();
    }

    /**
     * Create an instance of {@link ClsDictionary }
     * 
     */
    public ClsDictionary createClsDictionary() {
        return new ClsDictionary();
    }

    /**
     * Create an instance of {@link ArrayOfclsInspUserData }
     * 
     */
    public ArrayOfclsInspUserData createArrayOfclsInspUserData() {
        return new ArrayOfclsInspUserData();
    }

    /**
     * Create an instance of {@link ClsInspUserData }
     * 
     */
    public ClsInspUserData createClsInspUserData() {
        return new ClsInspUserData();
    }

    /**
     * Create an instance of {@link ArrayOfclsUWDocServiceResult }
     * 
     */
    public ArrayOfclsUWDocServiceResult createArrayOfclsUWDocServiceResult() {
        return new ArrayOfclsUWDocServiceResult();
    }

    /**
     * Create an instance of {@link ClsUWDocServiceResult }
     * 
     */
    public ClsUWDocServiceResult createClsUWDocServiceResult() {
        return new ClsUWDocServiceResult();
    }

    /**
     * Create an instance of {@link ClsResponseDetails }
     * 
     */
    public ClsResponseDetails createClsResponseDetails() {
        return new ClsResponseDetails();
    }

    /**
     * Create an instance of {@link ArrayOfclsSearchView }
     * 
     */
    public ArrayOfclsSearchView createArrayOfclsSearchView() {
        return new ArrayOfclsSearchView();
    }

    /**
     * Create an instance of {@link ClsSearchView }
     * 
     */
    public ClsSearchView createClsSearchView() {
        return new ClsSearchView();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ServiceResult")
    public JAXBElement<ServiceResult> createServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_ServiceResult_QNAME, ServiceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsUserData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsUserData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsUserData")
    public JAXBElement<ClsUserData> createClsUserData(ClsUserData value) {
        return new JAXBElement<ClsUserData>(_ClsUserData_QNAME, ClsUserData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsUserDataEndorsementTypeDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsUserDataEndorsementTypeDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsUserData.EndorsementTypeDetails")
    public JAXBElement<ClsUserDataEndorsementTypeDetails> createClsUserDataEndorsementTypeDetails(ClsUserDataEndorsementTypeDetails value) {
        return new JAXBElement<ClsUserDataEndorsementTypeDetails>(_ClsUserDataEndorsementTypeDetails_QNAME, ClsUserDataEndorsementTypeDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfclsDictionary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfclsDictionary }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ArrayOfclsDictionary")
    public JAXBElement<ArrayOfclsDictionary> createArrayOfclsDictionary(ArrayOfclsDictionary value) {
        return new JAXBElement<ArrayOfclsDictionary>(_ArrayOfclsDictionary_QNAME, ArrayOfclsDictionary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsDictionary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsDictionary }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsDictionary")
    public JAXBElement<ClsDictionary> createClsDictionary(ClsDictionary value) {
        return new JAXBElement<ClsDictionary>(_ClsDictionary_QNAME, ClsDictionary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfclsInspUserData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfclsInspUserData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ArrayOfclsInspUserData")
    public JAXBElement<ArrayOfclsInspUserData> createArrayOfclsInspUserData(ArrayOfclsInspUserData value) {
        return new JAXBElement<ArrayOfclsInspUserData>(_ArrayOfclsInspUserData_QNAME, ArrayOfclsInspUserData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsInspUserData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsInspUserData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsInspUserData")
    public JAXBElement<ClsInspUserData> createClsInspUserData(ClsInspUserData value) {
        return new JAXBElement<ClsInspUserData>(_ClsInspUserData_QNAME, ClsInspUserData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsUserDataPortalType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsUserDataPortalType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsUserData.PortalType")
    public JAXBElement<ClsUserDataPortalType> createClsUserDataPortalType(ClsUserDataPortalType value) {
        return new JAXBElement<ClsUserDataPortalType>(_ClsUserDataPortalType_QNAME, ClsUserDataPortalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsUserDataReportParameterType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsUserDataReportParameterType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsUserData.ReportParameterType")
    public JAXBElement<ClsUserDataReportParameterType> createClsUserDataReportParameterType(ClsUserDataReportParameterType value) {
        return new JAXBElement<ClsUserDataReportParameterType>(_ClsUserDataReportParameterType_QNAME, ClsUserDataReportParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfclsUWDocServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfclsUWDocServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ArrayOfclsUWDocServiceResult")
    public JAXBElement<ArrayOfclsUWDocServiceResult> createArrayOfclsUWDocServiceResult(ArrayOfclsUWDocServiceResult value) {
        return new JAXBElement<ArrayOfclsUWDocServiceResult>(_ArrayOfclsUWDocServiceResult_QNAME, ArrayOfclsUWDocServiceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsUWDocServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsUWDocServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsUWDocServiceResult")
    public JAXBElement<ClsUWDocServiceResult> createClsUWDocServiceResult(ClsUWDocServiceResult value) {
        return new JAXBElement<ClsUWDocServiceResult>(_ClsUWDocServiceResult_QNAME, ClsUWDocServiceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsUserDataProposalMode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsUserDataProposalMode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsUserData.ProposalMode")
    public JAXBElement<ClsUserDataProposalMode> createClsUserDataProposalMode(ClsUserDataProposalMode value) {
        return new JAXBElement<ClsUserDataProposalMode>(_ClsUserDataProposalMode_QNAME, ClsUserDataProposalMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsUserDataReportType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsUserDataReportType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsUserData.ReportType")
    public JAXBElement<ClsUserDataReportType> createClsUserDataReportType(ClsUserDataReportType value) {
        return new JAXBElement<ClsUserDataReportType>(_ClsUserDataReportType_QNAME, ClsUserDataReportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsUserDataSaveModeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsUserDataSaveModeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsUserData.SaveModeType")
    public JAXBElement<ClsUserDataSaveModeType> createClsUserDataSaveModeType(ClsUserDataSaveModeType value) {
        return new JAXBElement<ClsUserDataSaveModeType>(_ClsUserDataSaveModeType_QNAME, ClsUserDataSaveModeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsClaimUploadResultSet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsClaimUploadResultSet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsClaimUploadResultSet")
    public JAXBElement<ClsClaimUploadResultSet> createClsClaimUploadResultSet(ClsClaimUploadResultSet value) {
        return new JAXBElement<ClsClaimUploadResultSet>(_ClsClaimUploadResultSet_QNAME, ClsClaimUploadResultSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsRequest")
    public JAXBElement<ClsRequest> createClsRequest(ClsRequest value) {
        return new JAXBElement<ClsRequest>(_ClsRequest_QNAME, ClsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsResponse")
    public JAXBElement<ClsResponse> createClsResponse(ClsResponse value) {
        return new JAXBElement<ClsResponse>(_ClsResponse_QNAME, ClsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsResponseDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsResponseDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsResponseDetails")
    public JAXBElement<ClsResponseDetails> createClsResponseDetails(ClsResponseDetails value) {
        return new JAXBElement<ClsResponseDetails>(_ClsResponseDetails_QNAME, ClsResponseDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "SearchResult")
    public JAXBElement<SearchResult> createSearchResult(SearchResult value) {
        return new JAXBElement<SearchResult>(_SearchResult_QNAME, SearchResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfclsSearchView }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfclsSearchView }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ArrayOfclsSearchView")
    public JAXBElement<ArrayOfclsSearchView> createArrayOfclsSearchView(ArrayOfclsSearchView value) {
        return new JAXBElement<ArrayOfclsSearchView>(_ArrayOfclsSearchView_QNAME, ArrayOfclsSearchView.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsSearchView }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsSearchView }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "clsSearchView")
    public JAXBElement<ClsSearchView> createClsSearchView(ClsSearchView value) {
        return new JAXBElement<ClsSearchView>(_ClsSearchView_QNAME, ClsSearchView.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ChasisNumber", scope = ClsSearchView.class)
    public JAXBElement<String> createClsSearchViewChasisNumber(String value) {
        return new JAXBElement<String>(_ClsSearchViewChasisNumber_QNAME, String.class, ClsSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ClaimStatus", scope = ClsSearchView.class)
    public JAXBElement<String> createClsSearchViewClaimStatus(String value) {
        return new JAXBElement<String>(_ClsSearchViewClaimStatus_QNAME, String.class, ClsSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CustomerName", scope = ClsSearchView.class)
    public JAXBElement<String> createClsSearchViewCustomerName(String value) {
        return new JAXBElement<String>(_ClsSearchViewCustomerName_QNAME, String.class, ClsSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EndorsementType", scope = ClsSearchView.class)
    public JAXBElement<String> createClsSearchViewEndorsementType(String value) {
        return new JAXBElement<String>(_ClsSearchViewEndorsementType_QNAME, String.class, ClsSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EngineNumber", scope = ClsSearchView.class)
    public JAXBElement<String> createClsSearchViewEngineNumber(String value) {
        return new JAXBElement<String>(_ClsSearchViewEngineNumber_QNAME, String.class, ClsSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PolicyEndDate", scope = ClsSearchView.class)
    public JAXBElement<String> createClsSearchViewPolicyEndDate(String value) {
        return new JAXBElement<String>(_ClsSearchViewPolicyEndDate_QNAME, String.class, ClsSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PolicyNumber", scope = ClsSearchView.class)
    public JAXBElement<String> createClsSearchViewPolicyNumber(String value) {
        return new JAXBElement<String>(_ClsSearchViewPolicyNumber_QNAME, String.class, ClsSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PolicyType", scope = ClsSearchView.class)
    public JAXBElement<String> createClsSearchViewPolicyType(String value) {
        return new JAXBElement<String>(_ClsSearchViewPolicyType_QNAME, String.class, ClsSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProductCode", scope = ClsSearchView.class)
    public JAXBElement<String> createClsSearchViewProductCode(String value) {
        return new JAXBElement<String>(_ClsSearchViewProductCode_QNAME, String.class, ClsSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RegistrationNumber", scope = ClsSearchView.class)
    public JAXBElement<String> createClsSearchViewRegistrationNumber(String value) {
        return new JAXBElement<String>(_ClsSearchViewRegistrationNumber_QNAME, String.class, ClsSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ErrorText", scope = ClsResponseDetails.class)
    public JAXBElement<String> createClsResponseDetailsErrorText(String value) {
        return new JAXBElement<String>(_ClsResponseDetailsErrorText_QNAME, String.class, ClsResponseDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PolicyNumber", scope = ClsResponseDetails.class)
    public JAXBElement<String> createClsResponseDetailsPolicyNumber(String value) {
        return new JAXBElement<String>(_ClsSearchViewPolicyNumber_QNAME, String.class, ClsResponseDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProposalNumber", scope = ClsResponseDetails.class)
    public JAXBElement<String> createClsResponseDetailsProposalNumber(String value) {
        return new JAXBElement<String>(_ClsResponseDetailsProposalNumber_QNAME, String.class, ClsResponseDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "WorKFlowId", scope = ClsResponseDetails.class)
    public JAXBElement<String> createClsResponseDetailsWorKFlowId(String value) {
        return new JAXBElement<String>(_ClsResponseDetailsWorKFlowId_QNAME, String.class, ClsResponseDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "DocName", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultDocName(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultDocName_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Info1", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultInfo1(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInfo1_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Info2", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultInfo2(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInfo2_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Info3", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultInfo3(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInfo3_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Info4", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultInfo4(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInfo4_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Info5", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultInfo5(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInfo5_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InsertDate", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultInsertDate(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInsertDate_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InsertTransId", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultInsertTransId(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInsertTransId_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ModeOfOperation", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultModeOfOperation(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultModeOfOperation_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ModifyDate", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultModifyDate(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultModifyDate_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ModifyTransId", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultModifyTransId(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultModifyTransId_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProductCode", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultProductCode(String value) {
        return new JAXBElement<String>(_ClsSearchViewProductCode_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RefDate", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultRefDate(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultRefDate_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ReferenceNo", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultReferenceNo(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultReferenceNo_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UserId", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultUserId(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultUserId_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UserRole", scope = ClsUWDocServiceResult.class)
    public JAXBElement<String> createClsUWDocServiceResultUserRole(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultUserRole_QNAME, String.class, ClsUWDocServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ApprovalNo", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataApprovalNo(String value) {
        return new JAXBElement<String>(_ClsInspUserDataApprovalNo_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "BodyColour", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataBodyColour(String value) {
        return new JAXBElement<String>(_ClsInspUserDataBodyColour_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ChannelId", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataChannelId(String value) {
        return new JAXBElement<String>(_ClsInspUserDataChannelId_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "DeptNo", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataDeptNo(String value) {
        return new JAXBElement<String>(_ClsInspUserDataDeptNo_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EmployeeName", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataEmployeeName(String value) {
        return new JAXBElement<String>(_ClsInspUserDataEmployeeName_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EmployeeNo", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataEmployeeNo(String value) {
        return new JAXBElement<String>(_ClsInspUserDataEmployeeNo_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EndDate", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataEndDate(String value) {
        return new JAXBElement<String>(_ClsInspUserDataEndDate_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EndorsementDate", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataEndorsementDate(String value) {
        return new JAXBElement<String>(_ClsInspUserDataEndorsementDate_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EndorsementTypeCode", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataEndorsementTypeCode(String value) {
        return new JAXBElement<String>(_ClsInspUserDataEndorsementTypeCode_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ErrorText", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataErrorText(String value) {
        return new JAXBElement<String>(_ClsResponseDetailsErrorText_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ID", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataID(String value) {
        return new JAXBElement<String>(_ClsInspUserDataID_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InsertDate", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataInsertDate(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInsertDate_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InsertTransId", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataInsertTransId(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInsertTransId_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionAgencyCode", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataInspectionAgencyCode(String value) {
        return new JAXBElement<String>(_ClsInspUserDataInspectionAgencyCode_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionAgencyName", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataInspectionAgencyName(String value) {
        return new JAXBElement<String>(_ClsInspUserDataInspectionAgencyName_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionAuthority", scope = ClsInspUserData.class)
    public JAXBElement<ArrayOfstring> createClsInspUserDataInspectionAuthority(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ClsInspUserDataInspectionAuthority_QNAME, ArrayOfstring.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionAuthoritySelected", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataInspectionAuthoritySelected(String value) {
        return new JAXBElement<String>(_ClsInspUserDataInspectionAuthoritySelected_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionOverride", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataInspectionOverride(String value) {
        return new JAXBElement<String>(_ClsInspUserDataInspectionOverride_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionRequestDate", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataInspectionRequestDate(String value) {
        return new JAXBElement<String>(_ClsInspUserDataInspectionRequestDate_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionRequestTime", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataInspectionRequestTime(String value) {
        return new JAXBElement<String>(_ClsInspUserDataInspectionRequestTime_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionStatus", scope = ClsInspUserData.class)
    public JAXBElement<ArrayOfstring> createClsInspUserDataInspectionStatus(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ClsInspUserDataInspectionStatus_QNAME, ArrayOfstring.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionStatusSelected", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataInspectionStatusSelected(String value) {
        return new JAXBElement<String>(_ClsInspUserDataInspectionStatusSelected_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MailPassword", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataMailPassword(String value) {
        return new JAXBElement<String>(_ClsInspUserDataMailPassword_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MailPort", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataMailPort(String value) {
        return new JAXBElement<String>(_ClsInspUserDataMailPort_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MailSender", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataMailSender(String value) {
        return new JAXBElement<String>(_ClsInspUserDataMailSender_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MailServer", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataMailServer(String value) {
        return new JAXBElement<String>(_ClsInspUserDataMailServer_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MarketingOfficerCode", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataMarketingOfficerCode(String value) {
        return new JAXBElement<String>(_ClsInspUserDataMarketingOfficerCode_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MarketingOfficerName", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataMarketingOfficerName(String value) {
        return new JAXBElement<String>(_ClsInspUserDataMarketingOfficerName_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ModeOfOperation", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataModeOfOperation(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultModeOfOperation_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ModifyDate", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataModifyDate(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultModifyDate_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ModifyTransId", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataModifyTransId(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultModifyTransId_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Name", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataName(String value) {
        return new JAXBElement<String>(_ClsInspUserDataName_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OdometerReading", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataOdometerReading(String value) {
        return new JAXBElement<String>(_ClsInspUserDataOdometerReading_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OverrideFlag", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataOverrideFlag(String value) {
        return new JAXBElement<String>(_ClsInspUserDataOverrideFlag_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PolicyNO", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataPolicyNO(String value) {
        return new JAXBElement<String>(_ClsInspUserDataPolicyNO_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProductCode", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataProductCode(String value) {
        return new JAXBElement<String>(_ClsSearchViewProductCode_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProposalDate", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataProposalDate(String value) {
        return new JAXBElement<String>(_ClsInspUserDataProposalDate_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProposalNumber", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataProposalNumber(String value) {
        return new JAXBElement<String>(_ClsResponseDetailsProposalNumber_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ReceiptMailID", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataReceiptMailID(String value) {
        return new JAXBElement<String>(_ClsInspUserDataReceiptMailID_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RefDate", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataRefDate(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultRefDate_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RefNo", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataRefNo(String value) {
        return new JAXBElement<String>(_ClsInspUserDataRefNo_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RegdNo", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataRegdNo(String value) {
        return new JAXBElement<String>(_ClsInspUserDataRegdNo_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Remarks", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataRemarks(String value) {
        return new JAXBElement<String>(_ClsInspUserDataRemarks_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RetSqlQuery", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataRetSqlQuery(String value) {
        return new JAXBElement<String>(_ClsInspUserDataRetSqlQuery_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RiskEndDate", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataRiskEndDate(String value) {
        return new JAXBElement<String>(_ClsInspUserDataRiskEndDate_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RiskStartDate", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataRiskStartDate(String value) {
        return new JAXBElement<String>(_ClsInspUserDataRiskStartDate_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RowCount", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataRowCount(String value) {
        return new JAXBElement<String>(_ClsInspUserDataRowCount_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "SenderMailId", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataSenderMailId(String value) {
        return new JAXBElement<String>(_ClsInspUserDataSenderMailId_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "StartDate", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataStartDate(String value) {
        return new JAXBElement<String>(_ClsInspUserDataStartDate_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "StartTime", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataStartTime(String value) {
        return new JAXBElement<String>(_ClsInspUserDataStartTime_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Status", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataStatus(String value) {
        return new JAXBElement<String>(_ClsInspUserDataStatus_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Subject", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataSubject(String value) {
        return new JAXBElement<String>(_ClsInspUserDataSubject_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UploadedFileName", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataUploadedFileName(String value) {
        return new JAXBElement<String>(_ClsInspUserDataUploadedFileName_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UserId", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataUserId(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultUserId_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UserRole", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataUserRole(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultUserRole_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "WorkFlowId", scope = ClsInspUserData.class)
    public JAXBElement<String> createClsInspUserDataWorkFlowId(String value) {
        return new JAXBElement<String>(_ClsInspUserDataWorkFlowId_QNAME, String.class, ClsInspUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Key", scope = ClsDictionary.class)
    public JAXBElement<String> createClsDictionaryKey(String value) {
        return new JAXBElement<String>(_ClsDictionaryKey_QNAME, String.class, ClsDictionary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OtherInfo", scope = ClsDictionary.class)
    public JAXBElement<String> createClsDictionaryOtherInfo(String value) {
        return new JAXBElement<String>(_ClsDictionaryOtherInfo_QNAME, String.class, ClsDictionary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Value", scope = ClsDictionary.class)
    public JAXBElement<String> createClsDictionaryValue(String value) {
        return new JAXBElement<String>(_ClsDictionaryValue_QNAME, String.class, ClsDictionary.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ActualPaymentNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataActualPaymentNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataActualPaymentNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ActualProductCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataActualProductCode(String value) {
        return new JAXBElement<String>(_ClsUserDataActualProductCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ActualProductIndex", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataActualProductIndex(String value) {
        return new JAXBElement<String>(_ClsUserDataActualProductIndex_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ActualTransactionId", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataActualTransactionId(String value) {
        return new JAXBElement<String>(_ClsUserDataActualTransactionId_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "AddressLine1", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataAddressLine1(String value) {
        return new JAXBElement<String>(_ClsUserDataAddressLine1_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "AddressLine2", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataAddressLine2(String value) {
        return new JAXBElement<String>(_ClsUserDataAddressLine2_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "AddressLine3", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataAddressLine3(String value) {
        return new JAXBElement<String>(_ClsUserDataAddressLine3_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Age", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataAge(String value) {
        return new JAXBElement<String>(_ClsUserDataAge_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ApplicableDocs", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataApplicableDocs(String value) {
        return new JAXBElement<String>(_ClsUserDataApplicableDocs_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ApplicableDocuments", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataApplicableDocuments(String value) {
        return new JAXBElement<String>(_ClsUserDataApplicableDocuments_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ApplicationNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataApplicationNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataApplicationNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ApprovalNo", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataApprovalNo(String value) {
        return new JAXBElement<String>(_ClsInspUserDataApprovalNo_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "AuthenticateKey", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataAuthenticateKey(String value) {
        return new JAXBElement<String>(_ClsUserDataAuthenticateKey_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "AutoAcceptedVoucherNo", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataAutoAcceptedVoucherNo(String value) {
        return new JAXBElement<String>(_ClsUserDataAutoAcceptedVoucherNo_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "BGTag", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataBGTag(String value) {
        return new JAXBElement<String>(_ClsUserDataBGTag_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "BankAccountNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataBankAccountNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataBankAccountNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "BankBanchAddress", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataBankBanchAddress(String value) {
        return new JAXBElement<String>(_ClsUserDataBankBanchAddress_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "BankBranchCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataBankBranchCode(String value) {
        return new JAXBElement<String>(_ClsUserDataBankBranchCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "BankBranchName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataBankBranchName(String value) {
        return new JAXBElement<String>(_ClsUserDataBankBranchName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "BankCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataBankCode(String value) {
        return new JAXBElement<String>(_ClsUserDataBankCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "BankName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataBankName(String value) {
        return new JAXBElement<String>(_ClsUserDataBankName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "BasisOfRating", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataBasisOfRating(String value) {
        return new JAXBElement<String>(_ClsUserDataBasisOfRating_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "BlockID", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataBlockID(String value) {
        return new JAXBElement<String>(_ClsUserDataBlockID_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "BodyColour", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataBodyColour(String value) {
        return new JAXBElement<String>(_ClsInspUserDataBodyColour_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "BusinessLocation", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataBusinessLocation(String value) {
        return new JAXBElement<String>(_ClsUserDataBusinessLocation_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "BusinessSourceType", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataBusinessSourceType(String value) {
        return new JAXBElement<String>(_ClsUserDataBusinessSourceType_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CNGLPGKitValue", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCNGLPGKitValue(String value) {
        return new JAXBElement<String>(_ClsUserDataCNGLPGKitValue_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CallEnv", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCallEnv(String value) {
        return new JAXBElement<String>(_ClsUserDataCallEnv_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CallLevel", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCallLevel(String value) {
        return new JAXBElement<String>(_ClsUserDataCallLevel_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Campaign", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCampaign(String value) {
        return new JAXBElement<String>(_ClsUserDataCampaign_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CertificateNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCertificateNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataCertificateNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ChannelId", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataChannelId(String value) {
        return new JAXBElement<String>(_ClsInspUserDataChannelId_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ChassisNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataChassisNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataChassisNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ChequeDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataChequeDate(String value) {
        return new JAXBElement<String>(_ClsUserDataChequeDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ChequeNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataChequeNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataChequeNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CityDistrictCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCityDistrictCode(String value) {
        return new JAXBElement<String>(_ClsUserDataCityDistrictCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CityDistrictFlag", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCityDistrictFlag(String value) {
        return new JAXBElement<String>(_ClsUserDataCityDistrictFlag_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CityDistrictName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCityDistrictName(String value) {
        return new JAXBElement<String>(_ClsUserDataCityDistrictName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ClaimDocCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataClaimDocCode(String value) {
        return new JAXBElement<String>(_ClsUserDataClaimDocCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ClaimNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataClaimNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataClaimNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CompanyName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCompanyName(String value) {
        return new JAXBElement<String>(_ClsUserDataCompanyName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CompanyShortName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCompanyShortName(String value) {
        return new JAXBElement<String>(_ClsUserDataCompanyShortName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ConsumeProposalXML", scope = ClsUserData.class)
    public JAXBElement<StringBuilder> createClsUserDataConsumeProposalXML(StringBuilder value) {
        return new JAXBElement<StringBuilder>(_ClsUserDataConsumeProposalXML_QNAME, StringBuilder.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CurrentDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCurrentDate(String value) {
        return new JAXBElement<String>(_ClsUserDataCurrentDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CustomerFirstName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCustomerFirstName(String value) {
        return new JAXBElement<String>(_ClsUserDataCustomerFirstName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CustomerId", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCustomerId(String value) {
        return new JAXBElement<String>(_ClsUserDataCustomerId_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CustomerLastName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCustomerLastName(String value) {
        return new JAXBElement<String>(_ClsUserDataCustomerLastName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CustomerMiddleName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCustomerMiddleName(String value) {
        return new JAXBElement<String>(_ClsUserDataCustomerMiddleName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "CustomerName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataCustomerName(String value) {
        return new JAXBElement<String>(_ClsSearchViewCustomerName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "DCN", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataDCN(String value) {
        return new JAXBElement<String>(_ClsUserDataDCN_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "DDDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataDDDate(String value) {
        return new JAXBElement<String>(_ClsUserDataDDDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "DDNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataDDNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataDDNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataObjectClass }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataObjectClass }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "DatabaseObjectClasss", scope = ClsUserData.class)
    public JAXBElement<DataObjectClass> createClsUserDataDatabaseObjectClasss(DataObjectClass value) {
        return new JAXBElement<DataObjectClass>(_ClsUserDataDatabaseObjectClasss_QNAME, DataObjectClass.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "DaysofTravel", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataDaysofTravel(String value) {
        return new JAXBElement<String>(_ClsUserDataDaysofTravel_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "DeptNo", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataDeptNo(String value) {
        return new JAXBElement<String>(_ClsInspUserDataDeptNo_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "DetariffDiscountRate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataDetariffDiscountRate(String value) {
        return new JAXBElement<String>(_ClsUserDataDetariffDiscountRate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "DisplayStatus", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataDisplayStatus(String value) {
        return new JAXBElement<String>(_ClsUserDataDisplayStatus_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "DocCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataDocCode(String value) {
        return new JAXBElement<String>(_ClsUserDataDocCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "DocSatus", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataDocSatus(String value) {
        return new JAXBElement<String>(_ClsUserDataDocSatus_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "DocSerialNo", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataDocSerialNo(String value) {
        return new JAXBElement<String>(_ClsUserDataDocSerialNo_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ECoverNoteHTML", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataECoverNoteHTML(String value) {
        return new JAXBElement<String>(_ClsUserDataECoverNoteHTML_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ECoverNotePath", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataECoverNotePath(String value) {
        return new JAXBElement<String>(_ClsUserDataECoverNotePath_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EQZone", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataEQZone(String value) {
        return new JAXBElement<String>(_ClsUserDataEQZone_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ElectricalAccessories", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataElectricalAccessories(String value) {
        return new JAXBElement<String>(_ClsUserDataElectricalAccessories_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EmployeeName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataEmployeeName(String value) {
        return new JAXBElement<String>(_ClsInspUserDataEmployeeName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EmployeeNo", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataEmployeeNo(String value) {
        return new JAXBElement<String>(_ClsInspUserDataEmployeeNo_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EndDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataEndDate(String value) {
        return new JAXBElement<String>(_ClsInspUserDataEndDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EndorsementDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataEndorsementDate(String value) {
        return new JAXBElement<String>(_ClsInspUserDataEndorsementDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EndorsementPremium", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataEndorsementPremium(String value) {
        return new JAXBElement<String>(_ClsUserDataEndorsementPremium_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EndorsementSI", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataEndorsementSI(String value) {
        return new JAXBElement<String>(_ClsUserDataEndorsementSI_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EndorsementServiceTax", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataEndorsementServiceTax(String value) {
        return new JAXBElement<String>(_ClsUserDataEndorsementServiceTax_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EndorsementTypeCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataEndorsementTypeCode(String value) {
        return new JAXBElement<String>(_ClsInspUserDataEndorsementTypeCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "EngineNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataEngineNumber(String value) {
        return new JAXBElement<String>(_ClsSearchViewEngineNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ErrorCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataErrorCode(String value) {
        return new JAXBElement<String>(_ClsUserDataErrorCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ErrorLogFilePath", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataErrorLogFilePath(String value) {
        return new JAXBElement<String>(_ClsUserDataErrorLogFilePath_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfclsDictionary }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfclsDictionary }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ErrorMessage", scope = ClsUserData.class)
    public JAXBElement<ArrayOfclsDictionary> createClsUserDataErrorMessage(ArrayOfclsDictionary value) {
        return new JAXBElement<ArrayOfclsDictionary>(_ClsUserDataErrorMessage_QNAME, ArrayOfclsDictionary.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ErrorText", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataErrorText(String value) {
        return new JAXBElement<String>(_ClsResponseDetailsErrorText_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ExShowroomPrice", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataExShowroomPrice(String value) {
        return new JAXBElement<String>(_ClsUserDataExShowroomPrice_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ExtrnalyBuiltBodyType", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataExtrnalyBuiltBodyType(String value) {
        return new JAXBElement<String>(_ClsUserDataExtrnalyBuiltBodyType_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "FilePath", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataFilePath(String value) {
        return new JAXBElement<String>(_ClsUserDataFilePath_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "FinancierAddress", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataFinancierAddress(String value) {
        return new JAXBElement<String>(_ClsUserDataFinancierAddress_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "FinancierCity", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataFinancierCity(String value) {
        return new JAXBElement<String>(_ClsUserDataFinancierCity_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "FinancierCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataFinancierCode(String value) {
        return new JAXBElement<String>(_ClsUserDataFinancierCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "FinancierDistrict", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataFinancierDistrict(String value) {
        return new JAXBElement<String>(_ClsUserDataFinancierDistrict_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "FinancierName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataFinancierName(String value) {
        return new JAXBElement<String>(_ClsUserDataFinancierName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "FinancierPinCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataFinancierPinCode(String value) {
        return new JAXBElement<String>(_ClsUserDataFinancierPinCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "FinancierState", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataFinancierState(String value) {
        return new JAXBElement<String>(_ClsUserDataFinancierState_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "FleetAmount", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataFleetAmount(String value) {
        return new JAXBElement<String>(_ClsUserDataFleetAmount_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "FleetDiscount", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataFleetDiscount(String value) {
        return new JAXBElement<String>(_ClsUserDataFleetDiscount_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "GLMRate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataGLMRate(String value) {
        return new JAXBElement<String>(_ClsUserDataGLMRate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "GroupXML", scope = ClsUserData.class)
    public JAXBElement<StringBuilder> createClsUserDataGroupXML(StringBuilder value) {
        return new JAXBElement<StringBuilder>(_ClsUserDataGroupXML_QNAME, StringBuilder.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "HostAddress", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataHostAddress(String value) {
        return new JAXBElement<String>(_ClsUserDataHostAddress_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ICN", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataICN(String value) {
        return new JAXBElement<String>(_ClsUserDataICN_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ID", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataID(String value) {
        return new JAXBElement<String>(_ClsInspUserDataID_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "IFSCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataIFSCode(String value) {
        return new JAXBElement<String>(_ClsUserDataIFSCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Info1", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInfo1(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInfo1_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Info2", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInfo2(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInfo2_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Info3", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInfo3(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInfo3_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Info4", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInfo4(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInfo4_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Info5", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInfo5(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInfo5_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InputXML", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInputXML(String value) {
        return new JAXBElement<String>(_ClsUserDataInputXML_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InsertDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInsertDate(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInsertDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InsertTransId", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInsertTransId(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultInsertTransId_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfclsInspUserData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfclsInspUserData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspUserDataGrid", scope = ClsUserData.class)
    public JAXBElement<ArrayOfclsInspUserData> createClsUserDataInspUserDataGrid(ArrayOfclsInspUserData value) {
        return new JAXBElement<ArrayOfclsInspUserData>(_ClsUserDataInspUserDataGrid_QNAME, ArrayOfclsInspUserData.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionAgencyCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInspectionAgencyCode(String value) {
        return new JAXBElement<String>(_ClsInspUserDataInspectionAgencyCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionAgencyEmailId", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInspectionAgencyEmailId(String value) {
        return new JAXBElement<String>(_ClsUserDataInspectionAgencyEmailId_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionAgencyLandlineNo", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInspectionAgencyLandlineNo(String value) {
        return new JAXBElement<String>(_ClsUserDataInspectionAgencyLandlineNo_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionAgencyMobileNo", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInspectionAgencyMobileNo(String value) {
        return new JAXBElement<String>(_ClsUserDataInspectionAgencyMobileNo_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionAgencyName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInspectionAgencyName(String value) {
        return new JAXBElement<String>(_ClsInspUserDataInspectionAgencyName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionAuthority", scope = ClsUserData.class)
    public JAXBElement<ArrayOfstring> createClsUserDataInspectionAuthority(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ClsInspUserDataInspectionAuthority_QNAME, ArrayOfstring.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionAuthoritySelected", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInspectionAuthoritySelected(String value) {
        return new JAXBElement<String>(_ClsInspUserDataInspectionAuthoritySelected_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionOverride", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInspectionOverride(String value) {
        return new JAXBElement<String>(_ClsInspUserDataInspectionOverride_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionRequestDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInspectionRequestDate(String value) {
        return new JAXBElement<String>(_ClsInspUserDataInspectionRequestDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionRequestTime", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInspectionRequestTime(String value) {
        return new JAXBElement<String>(_ClsInspUserDataInspectionRequestTime_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionStatus", scope = ClsUserData.class)
    public JAXBElement<ArrayOfstring> createClsUserDataInspectionStatus(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ClsInspUserDataInspectionStatus_QNAME, ArrayOfstring.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InspectionStatusSelected", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInspectionStatusSelected(String value) {
        return new JAXBElement<String>(_ClsInspUserDataInspectionStatusSelected_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InstrumentType", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataInstrumentType(String value) {
        return new JAXBElement<String>(_ClsUserDataInstrumentType_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "IntermediaryID", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataIntermediaryID(String value) {
        return new JAXBElement<String>(_ClsUserDataIntermediaryID_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "IntermediaryName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataIntermediaryName(String value) {
        return new JAXBElement<String>(_ClsUserDataIntermediaryName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "IntermediaryRole", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataIntermediaryRole(String value) {
        return new JAXBElement<String>(_ClsUserDataIntermediaryRole_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "IsNewPayment", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataIsNewPayment(String value) {
        return new JAXBElement<String>(_ClsUserDataIsNewPayment_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "IsRequired", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataIsRequired(String value) {
        return new JAXBElement<String>(_ClsUserDataIsRequired_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "JobErrorMsg", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataJobErrorMsg(String value) {
        return new JAXBElement<String>(_ClsUserDataJobErrorMsg_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "LeadNo", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataLeadNo(String value) {
        return new JAXBElement<String>(_ClsUserDataLeadNo_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "LineofBusinessCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataLineofBusinessCode(String value) {
        return new JAXBElement<String>(_ClsUserDataLineofBusinessCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "LineofBusinessName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataLineofBusinessName(String value) {
        return new JAXBElement<String>(_ClsUserDataLineofBusinessName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "LocalHouseBankCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataLocalHouseBankCode(String value) {
        return new JAXBElement<String>(_ClsUserDataLocalHouseBankCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "LocationID", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataLocationID(String value) {
        return new JAXBElement<String>(_ClsUserDataLocationID_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "LocationName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataLocationName(String value) {
        return new JAXBElement<String>(_ClsUserDataLocationName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MICRCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataMICRCode(String value) {
        return new JAXBElement<String>(_ClsUserDataMICRCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MailPassword", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataMailPassword(String value) {
        return new JAXBElement<String>(_ClsInspUserDataMailPassword_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MailPort", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataMailPort(String value) {
        return new JAXBElement<String>(_ClsInspUserDataMailPort_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MailSender", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataMailSender(String value) {
        return new JAXBElement<String>(_ClsInspUserDataMailSender_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MailServer", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataMailServer(String value) {
        return new JAXBElement<String>(_ClsInspUserDataMailServer_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ManualCoverNoteNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataManualCoverNoteNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataManualCoverNoteNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MarketingOfficerCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataMarketingOfficerCode(String value) {
        return new JAXBElement<String>(_ClsInspUserDataMarketingOfficerCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MarketingOfficerName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataMarketingOfficerName(String value) {
        return new JAXBElement<String>(_ClsInspUserDataMarketingOfficerName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MerchantId", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataMerchantId(String value) {
        return new JAXBElement<String>(_ClsUserDataMerchantId_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MigratedPolicyNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataMigratedPolicyNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataMigratedPolicyNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ModeOfOperation", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataModeOfOperation(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultModeOfOperation_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ModifyDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataModifyDate(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultModifyDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ModifyTransId", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataModifyTransId(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultModifyTransId_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "MsgType", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataMsgType(String value) {
        return new JAXBElement<String>(_ClsUserDataMsgType_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Name", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataName(String value) {
        return new JAXBElement<String>(_ClsInspUserDataName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "NewCustPolicyNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataNewCustPolicyNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataNewCustPolicyNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "NewGCPolicyNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataNewGCPolicyNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataNewGCPolicyNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "NonElectricalAccessories", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataNonElectricalAccessories(String value) {
        return new JAXBElement<String>(_ClsUserDataNonElectricalAccessories_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ObsoleteVehicle", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataObsoleteVehicle(String value) {
        return new JAXBElement<String>(_ClsUserDataObsoleteVehicle_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OccupationCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataOccupationCode(String value) {
        return new JAXBElement<String>(_ClsUserDataOccupationCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OdometerReading", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataOdometerReading(String value) {
        return new JAXBElement<String>(_ClsInspUserDataOdometerReading_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OfficeAddress", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataOfficeAddress(String value) {
        return new JAXBElement<String>(_ClsUserDataOfficeAddress_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OfficeCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataOfficeCode(String value) {
        return new JAXBElement<String>(_ClsUserDataOfficeCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OfficeID", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataOfficeID(String value) {
        return new JAXBElement<String>(_ClsUserDataOfficeID_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OfficeName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataOfficeName(String value) {
        return new JAXBElement<String>(_ClsUserDataOfficeName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OldCustPolicyNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataOldCustPolicyNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataOldCustPolicyNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OldGCPolicyNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataOldGCPolicyNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataOldGCPolicyNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OldProposalDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataOldProposalDate(String value) {
        return new JAXBElement<String>(_ClsUserDataOldProposalDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OldProposalNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataOldProposalNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataOldProposalNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OperationMode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataOperationMode(String value) {
        return new JAXBElement<String>(_ClsUserDataOperationMode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "OverrideFlag", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataOverrideFlag(String value) {
        return new JAXBElement<String>(_ClsInspUserDataOverrideFlag_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PageAction", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPageAction(String value) {
        return new JAXBElement<String>(_ClsUserDataPageAction_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ParentOfficeCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataParentOfficeCode(String value) {
        return new JAXBElement<String>(_ClsUserDataParentOfficeCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Password", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPassword(String value) {
        return new JAXBElement<String>(_ClsUserDataPassword_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PayerCD", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPayerCD(String value) {
        return new JAXBElement<String>(_ClsUserDataPayerCD_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PayerCustomerID", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPayerCustomerID(String value) {
        return new JAXBElement<String>(_ClsUserDataPayerCustomerID_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PayerID", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPayerID(String value) {
        return new JAXBElement<String>(_ClsUserDataPayerID_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PayerType", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPayerType(String value) {
        return new JAXBElement<String>(_ClsUserDataPayerType_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PaymentDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPaymentDate(String value) {
        return new JAXBElement<String>(_ClsUserDataPaymentDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PaymentId", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPaymentId(String value) {
        return new JAXBElement<String>(_ClsUserDataPaymentId_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PaymentIdStatus", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPaymentIdStatus(String value) {
        return new JAXBElement<String>(_ClsUserDataPaymentIdStatus_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PaymentMode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPaymentMode(String value) {
        return new JAXBElement<String>(_ClsUserDataPaymentMode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PaymentNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPaymentNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataPaymentNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PaymentType", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPaymentType(String value) {
        return new JAXBElement<String>(_ClsUserDataPaymentType_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PaymentTypeCd", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPaymentTypeCd(String value) {
        return new JAXBElement<String>(_ClsUserDataPaymentTypeCd_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PolicyDocCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPolicyDocCode(String value) {
        return new JAXBElement<String>(_ClsUserDataPolicyDocCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfclsUWDocServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfclsUWDocServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PolicyDocumentDtls", scope = ClsUserData.class)
    public JAXBElement<ArrayOfclsUWDocServiceResult> createClsUserDataPolicyDocumentDtls(ArrayOfclsUWDocServiceResult value) {
        return new JAXBElement<ArrayOfclsUWDocServiceResult>(_ClsUserDataPolicyDocumentDtls_QNAME, ArrayOfclsUWDocServiceResult.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PolicyNO", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPolicyNO(String value) {
        return new JAXBElement<String>(_ClsInspUserDataPolicyNO_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PolicyNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPolicyNumber(String value) {
        return new JAXBElement<String>(_ClsSearchViewPolicyNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PolicyType", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPolicyType(String value) {
        return new JAXBElement<String>(_ClsSearchViewPolicyType_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PreviousPolicyExpiryDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataPreviousPolicyExpiryDate(String value) {
        return new JAXBElement<String>(_ClsUserDataPreviousPolicyExpiryDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProductCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataProductCode(String value) {
        return new JAXBElement<String>(_ClsSearchViewProductCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProductIndex", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataProductIndex(String value) {
        return new JAXBElement<String>(_ClsUserDataProductIndex_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProductName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataProductName(String value) {
        return new JAXBElement<String>(_ClsUserDataProductName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProductType", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataProductType(String value) {
        return new JAXBElement<String>(_ClsUserDataProductType_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProposalDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataProposalDate(String value) {
        return new JAXBElement<String>(_ClsInspUserDataProposalDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProposalNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataProposalNumber(String value) {
        return new JAXBElement<String>(_ClsResponseDetailsProposalNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProposalStatus", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataProposalStatus(String value) {
        return new JAXBElement<String>(_ClsUserDataProposalStatus_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProposalTransactionTypeCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataProposalTransactionTypeCode(String value) {
        return new JAXBElement<String>(_ClsUserDataProposalTransactionTypeCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ProposalTransactionTypeDesc", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataProposalTransactionTypeDesc(String value) {
        return new JAXBElement<String>(_ClsUserDataProposalTransactionTypeDesc_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "QuotationNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataQuotationNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataQuotationNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "QuotationVersion", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataQuotationVersion(String value) {
        return new JAXBElement<String>(_ClsUserDataQuotationVersion_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ReceiptDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataReceiptDate(String value) {
        return new JAXBElement<String>(_ClsUserDataReceiptDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ReceiptMailID", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataReceiptMailID(String value) {
        return new JAXBElement<String>(_ClsInspUserDataReceiptMailID_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RecordStatus1", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataRecordStatus1(String value) {
        return new JAXBElement<String>(_ClsUserDataRecordStatus1_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RefDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataRefDate(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultRefDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RefNo", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataRefNo(String value) {
        return new JAXBElement<String>(_ClsInspUserDataRefNo_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ReferenceDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataReferenceDate(String value) {
        return new JAXBElement<String>(_ClsUserDataReferenceDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ReferenceNo1", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataReferenceNo1(String value) {
        return new JAXBElement<String>(_ClsUserDataReferenceNo1_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ReferenceNo2", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataReferenceNo2(String value) {
        return new JAXBElement<String>(_ClsUserDataReferenceNo2_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ReferenceNo3", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataReferenceNo3(String value) {
        return new JAXBElement<String>(_ClsUserDataReferenceNo3_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RegdNo", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataRegdNo(String value) {
        return new JAXBElement<String>(_ClsInspUserDataRegdNo_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Remarks", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataRemarks(String value) {
        return new JAXBElement<String>(_ClsInspUserDataRemarks_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ReportHtmlString", scope = ClsUserData.class)
    public JAXBElement<StringBuilder> createClsUserDataReportHtmlString(StringBuilder value) {
        return new JAXBElement<StringBuilder>(_ClsUserDataReportHtmlString_QNAME, StringBuilder.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ReportTemplateNo", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataReportTemplateNo(String value) {
        return new JAXBElement<String>(_ClsUserDataReportTemplateNo_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ReportTypeCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataReportTypeCode(String value) {
        return new JAXBElement<String>(_ClsUserDataReportTypeCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RetSqlQuery", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataRetSqlQuery(String value) {
        return new JAXBElement<String>(_ClsInspUserDataRetSqlQuery_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RetVal", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataRetVal(String value) {
        return new JAXBElement<String>(_ClsUserDataRetVal_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RiskDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataRiskDate(String value) {
        return new JAXBElement<String>(_ClsUserDataRiskDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RiskEndDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataRiskEndDate(String value) {
        return new JAXBElement<String>(_ClsInspUserDataRiskEndDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RiskSerialNo", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataRiskSerialNo(String value) {
        return new JAXBElement<String>(_ClsUserDataRiskSerialNo_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RiskStartDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataRiskStartDate(String value) {
        return new JAXBElement<String>(_ClsInspUserDataRiskStartDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RowCount", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataRowCount(String value) {
        return new JAXBElement<String>(_ClsInspUserDataRowCount_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RsnForCancellation", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataRsnForCancellation(String value) {
        return new JAXBElement<String>(_ClsUserDataRsnForCancellation_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "RuleErrorText", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataRuleErrorText(String value) {
        return new JAXBElement<String>(_ClsUserDataRuleErrorText_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "SQLQuery", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataSQLQuery(String value) {
        return new JAXBElement<String>(_ClsUserDataSQLQuery_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "SenderMailId", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataSenderMailId(String value) {
        return new JAXBElement<String>(_ClsInspUserDataSenderMailId_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ServiceConsumer", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataServiceConsumer(String value) {
        return new JAXBElement<String>(_ClsUserDataServiceConsumer_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ServiceErrorText", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataServiceErrorText(String value) {
        return new JAXBElement<String>(_ClsUserDataServiceErrorText_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ServiceType", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataServiceType(String value) {
        return new JAXBElement<String>(_ClsUserDataServiceType_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "StartDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataStartDate(String value) {
        return new JAXBElement<String>(_ClsInspUserDataStartDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "StartTime", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataStartTime(String value) {
        return new JAXBElement<String>(_ClsInspUserDataStartTime_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "StateCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataStateCode(String value) {
        return new JAXBElement<String>(_ClsUserDataStateCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "StateName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataStateName(String value) {
        return new JAXBElement<String>(_ClsUserDataStateName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Status", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataStatus(String value) {
        return new JAXBElement<String>(_ClsInspUserDataStatus_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Subject", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataSubject(String value) {
        return new JAXBElement<String>(_ClsInspUserDataSubject_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "TotalSumInsured", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataTotalSumInsured(String value) {
        return new JAXBElement<String>(_ClsUserDataTotalSumInsured_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "TrailerIDV", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataTrailerIDV(String value) {
        return new JAXBElement<String>(_ClsUserDataTrailerIDV_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "TransactionCode", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataTransactionCode(String value) {
        return new JAXBElement<String>(_ClsUserDataTransactionCode_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "TransactionDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataTransactionDate(String value) {
        return new JAXBElement<String>(_ClsUserDataTransactionDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "TransactionType", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataTransactionType(String value) {
        return new JAXBElement<String>(_ClsUserDataTransactionType_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfclsUWDocServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfclsUWDocServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UWDocDtlsGrid", scope = ClsUserData.class)
    public JAXBElement<ArrayOfclsUWDocServiceResult> createClsUserDataUWDocDtlsGrid(ArrayOfclsUWDocServiceResult value) {
        return new JAXBElement<ArrayOfclsUWDocServiceResult>(_ClsUserDataUWDocDtlsGrid_QNAME, ArrayOfclsUWDocServiceResult.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UploadedFileName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataUploadedFileName(String value) {
        return new JAXBElement<String>(_ClsInspUserDataUploadedFileName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UserId", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataUserId(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultUserId_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UserObjectTemplate", scope = ClsUserData.class)
    public JAXBElement<byte[]> createClsUserDataUserObjectTemplate(byte[] value) {
        return new JAXBElement<byte[]>(_ClsUserDataUserObjectTemplate_QNAME, byte[].class, ClsUserData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UserObjectTypeName", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataUserObjectTypeName(String value) {
        return new JAXBElement<String>(_ClsUserDataUserObjectTypeName_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UserResultXml", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataUserResultXml(String value) {
        return new JAXBElement<String>(_ClsUserDataUserResultXml_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UserRole", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataUserRole(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultUserRole_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "VehicleInspection", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataVehicleInspection(String value) {
        return new JAXBElement<String>(_ClsUserDataVehicleInspection_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "VehicleRegistrationNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataVehicleRegistrationNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataVehicleRegistrationNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "VoucherDate", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataVoucherDate(String value) {
        return new JAXBElement<String>(_ClsUserDataVoucherDate_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "VoucherNumber", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataVoucherNumber(String value) {
        return new JAXBElement<String>(_ClsUserDataVoucherNumber_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "WarningText", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataWarningText(String value) {
        return new JAXBElement<String>(_ClsUserDataWarningText_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "WorkFlowId", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataWorkFlowId(String value) {
        return new JAXBElement<String>(_ClsInspUserDataWorkFlowId_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "WorksheetByte", scope = ClsUserData.class)
    public JAXBElement<byte[]> createClsUserDataWorksheetByte(byte[] value) {
        return new JAXBElement<byte[]>(_ClsUserDataWorksheetByte_QNAME, byte[].class, ClsUserData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "WorksheetPath", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataWorksheetPath(String value) {
        return new JAXBElement<String>(_ClsUserDataWorksheetPath_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "YNIntermediary", scope = ClsUserData.class)
    public JAXBElement<String> createClsUserDataYNIntermediary(String value) {
        return new JAXBElement<String>(_ClsUserDataYNIntermediary_QNAME, String.class, ClsUserData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ErrorText", scope = SearchResult.class)
    public JAXBElement<String> createSearchResultErrorText(String value) {
        return new JAXBElement<String>(_ClsResponseDetailsErrorText_QNAME, String.class, SearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfclsSearchView }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfclsSearchView }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "LstSearchView", scope = SearchResult.class)
    public JAXBElement<ArrayOfclsSearchView> createSearchResultLstSearchView(ArrayOfclsSearchView value) {
        return new JAXBElement<ArrayOfclsSearchView>(_SearchResultLstSearchView_QNAME, ArrayOfclsSearchView.class, SearchResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsResponseDetails }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsResponseDetails }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ResponseDetails", scope = ClsResponse.class)
    public JAXBElement<ClsResponseDetails> createClsResponseResponseDetails(ClsResponseDetails value) {
        return new JAXBElement<ClsResponseDetails>(_ClsResponseResponseDetails_QNAME, ClsResponseDetails.class, ClsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "AuthenticateKey", scope = ClsRequest.class)
    public JAXBElement<String> createClsRequestAuthenticateKey(String value) {
        return new JAXBElement<String>(_ClsUserDataAuthenticateKey_QNAME, String.class, ClsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringBuilder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ConsumeProposalXML", scope = ClsRequest.class)
    public JAXBElement<StringBuilder> createClsRequestConsumeProposalXML(StringBuilder value) {
        return new JAXBElement<StringBuilder>(_ClsUserDataConsumeProposalXML_QNAME, StringBuilder.class, ClsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "InputXML", scope = ClsRequest.class)
    public JAXBElement<String> createClsRequestInputXML(String value) {
        return new JAXBElement<String>(_ClsUserDataInputXML_QNAME, String.class, ClsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ModeOfOperation", scope = ClsRequest.class)
    public JAXBElement<String> createClsRequestModeOfOperation(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultModeOfOperation_QNAME, String.class, ClsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "Password", scope = ClsRequest.class)
    public JAXBElement<String> createClsRequestPassword(String value) {
        return new JAXBElement<String>(_ClsUserDataPassword_QNAME, String.class, ClsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "PolicyNoList", scope = ClsRequest.class)
    public JAXBElement<ArrayOfanyType> createClsRequestPolicyNoList(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_ClsRequestPolicyNoList_QNAME, ArrayOfanyType.class, ClsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UserId", scope = ClsRequest.class)
    public JAXBElement<String> createClsRequestUserId(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultUserId_QNAME, String.class, ClsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UserRole", scope = ClsRequest.class)
    public JAXBElement<String> createClsRequestUserRole(String value) {
        return new JAXBElement<String>(_ClsUWDocServiceResultUserRole_QNAME, String.class, ClsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "ErrorMessage", scope = ClsClaimUploadResultSet.class)
    public JAXBElement<String> createClsClaimUploadResultSetErrorMessage(String value) {
        return new JAXBElement<String>(_ClsUserDataErrorMessage_QNAME, String.class, ClsClaimUploadResultSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsUserData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsUserData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GCCustomerPortalBL", name = "UserData", scope = ServiceResult.class)
    public JAXBElement<ClsUserData> createServiceResultUserData(ClsUserData value) {
        return new JAXBElement<ClsUserData>(_ServiceResultUserData_QNAME, ClsUserData.class, ServiceResult.class, value);
    }

}
