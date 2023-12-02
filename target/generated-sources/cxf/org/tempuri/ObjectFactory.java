
package org.tempuri;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.datacontract.schemas._2004._07.bridgewrapperbl.GenerateScheduleRequest;
import org.datacontract.schemas._2004._07.bridgewrapperbl.GenerateScheduleResponse;
import org.datacontract.schemas._2004._07.bridgewrapperbl.PaymentEntryRequest;
import org.datacontract.schemas._2004._07.bridgewrapperbl.PolicyCancelRequest;
import org.datacontract.schemas._2004._07.bridgewrapperbl.PolicyCancellationResponse;
import org.datacontract.schemas._2004._07.bridgewrapperbl.PolicyRequest;
import org.datacontract.schemas._2004._07.bridgewrapperbl.PolicyResponse;
import org.datacontract.schemas._2004._07.bridgewrapperbl.QuotationRequest;
import org.datacontract.schemas._2004._07.bridgewrapperbl.QuotationResponse;
import org.datacontract.schemas._2004._07.gccustomerportalbl.ClsClaimUploadResultSet;
import org.datacontract.schemas._2004._07.gccustomerportalbl.ClsRequest;
import org.datacontract.schemas._2004._07.gccustomerportalbl.ClsResponse;
import org.datacontract.schemas._2004._07.gccustomerportalbl.SearchResult;
import org.datacontract.schemas._2004._07.gccustomerportalbl.ServiceResult;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _AuthenticateUserID_QNAME = new QName("http://tempuri.org/", "UserID");
    private final static QName _AuthenticatePassword_QNAME = new QName("http://tempuri.org/", "Password");
    private final static QName _AuthenticateResponseAuthenticateResult_QNAME = new QName("http://tempuri.org/", "AuthenticateResult");
    private final static QName _GetUserRoleStrLVAuthToken_QNAME = new QName("http://tempuri.org/", "strLVAuthToken");
    private final static QName _GetUserRoleResponseGetUserRoleResult_QNAME = new QName("http://tempuri.org/", "GetUserRoleResult");
    private final static QName _CalculatePremiumObjServiceResult_QNAME = new QName("http://tempuri.org/", "objServiceResult");
    private final static QName _FetchProposalXmlResponseFetchProposalXmlResult_QNAME = new QName("http://tempuri.org/", "FetchProposalXmlResult");
    private final static QName _ProposalCancellationResponseProposalCancellationResult_QNAME = new QName("http://tempuri.org/", "ProposalCancellationResult");
    private final static QName _FetchQuotationXmlResponseFetchQuotationXmlResult_QNAME = new QName("http://tempuri.org/", "FetchQuotationXmlResult");
    private final static QName _GetPolicyScheduleForPortalResponseGetPolicyScheduleForPortalResult_QNAME = new QName("http://tempuri.org/", "GetPolicyScheduleForPortalResult");
    private final static QName _GetECoverNoteForPortalResponseGetECoverNoteForPortalResult_QNAME = new QName("http://tempuri.org/", "GetECoverNoteForPortalResult");
    private final static QName _GetWorkSheetResponseGetWorkSheetResult_QNAME = new QName("http://tempuri.org/", "GetWorkSheetResult");
    private final static QName _GetRenewalNoticeHtmlResponseGetRenewalNoticeHtmlResult_QNAME = new QName("http://tempuri.org/", "GetRenewalNoticeHtmlResult");
    private final static QName _UploadFileStrNumPolicyCode_QNAME = new QName("http://tempuri.org/", "str_num_policy_code");
    private final static QName _UploadFileStrfileName_QNAME = new QName("http://tempuri.org/", "strfile_name");
    private final static QName _UploadFileStrfileExtension_QNAME = new QName("http://tempuri.org/", "strfile_extension");
    private final static QName _UploadFileByteStream_QNAME = new QName("http://tempuri.org/", "byte_stream");
    private final static QName _GetWorkSheetForPortalResponseGetWorkSheetForPortalResult_QNAME = new QName("http://tempuri.org/", "GetWorkSheetForPortalResult");
    private final static QName _GetRenwalNoticeForPortalResponseGetRenwalNoticeForPortalResult_QNAME = new QName("http://tempuri.org/", "GetRenwalNoticeForPortalResult");
    private final static QName _GetRenwalRejectionForPortalResponseGetRenwalRejectionForPortalResult_QNAME = new QName("http://tempuri.org/", "GetRenwalRejectionForPortalResult");
    private final static QName _UploadClaimFileStrNumClaimCode_QNAME = new QName("http://tempuri.org/", "str_num_claim_code");
    private final static QName _UploadClaimFileResponseUploadClaimFileResult_QNAME = new QName("http://tempuri.org/", "UploadClaimFileResult");
    private final static QName _GetDataForNilEndorsementResponseGetDataForNilEndorsementResult_QNAME = new QName("http://tempuri.org/", "GetDataForNilEndorsementResult");
    private final static QName _GetDataForNonNilEndorsementResponseGetDataForNonNilEndorsementResult_QNAME = new QName("http://tempuri.org/", "GetDataForNonNilEndorsementResult");
    private final static QName _GetDataForCancellationEndorsementResponseGetDataForCancellationEndorsementResult_QNAME = new QName("http://tempuri.org/", "GetDataForCancellationEndorsementResult");
    private final static QName _QuickQuoteObjRequest_QNAME = new QName("http://tempuri.org/", "objRequest");
    private final static QName _QuickQuoteResponseQuickQuoteResult_QNAME = new QName("http://tempuri.org/", "QuickQuoteResult");
    private final static QName _CreateQuoteResponseCreateQuoteResult_QNAME = new QName("http://tempuri.org/", "CreateQuoteResult");
    private final static QName _ModifyQuoteResponseModifyQuoteResult_QNAME = new QName("http://tempuri.org/", "ModifyQuoteResult");
    private final static QName _QuoteToPolicyResponseQuoteToPolicyResult_QNAME = new QName("http://tempuri.org/", "QuoteToPolicyResult");
    private final static QName _CreatePolicyResponseCreatePolicyResult_QNAME = new QName("http://tempuri.org/", "CreatePolicyResult");
    private final static QName _CancelPolicyResponseCancelPolicyResult_QNAME = new QName("http://tempuri.org/", "CancelPolicyResult");
    private final static QName _PaymentEntryResponsePaymentEntryResult_QNAME = new QName("http://tempuri.org/", "PaymentEntryResult");
    private final static QName _GeneratePolicySchedulePDFResponseGeneratePolicySchedulePDFResult_QNAME = new QName("http://tempuri.org/", "GeneratePolicySchedulePDFResult");
    private final static QName _QuickEndorsementResponseQuickEndorsementResult_QNAME = new QName("http://tempuri.org/", "QuickEndorsementResult");
    private final static QName _FetchMultiBlockProposalXmlResponseFetchMultiBlockProposalXmlResult_QNAME = new QName("http://tempuri.org/", "FetchMultiBlockProposalXmlResult");
    private final static QName _GetLatestPolicyNumberResponseGetLatestPolicyNumberResult_QNAME = new QName("http://tempuri.org/", "GetLatestPolicyNumberResult");
    private final static QName _GetPolicyNoPIResponseGetPolicyNoPIResult_QNAME = new QName("http://tempuri.org/", "GetPolicyNoPIResult");
    private final static QName _GetSearchViewStrPolicyNumber_QNAME = new QName("http://tempuri.org/", "strPolicyNumber");
    private final static QName _GetSearchViewStrEngineNumber_QNAME = new QName("http://tempuri.org/", "strEngineNumber");
    private final static QName _GetSearchViewStrChasisNumber_QNAME = new QName("http://tempuri.org/", "strChasisNumber");
    private final static QName _GetSearchViewStrRegistrationNumber_QNAME = new QName("http://tempuri.org/", "strRegistrationNumber");
    private final static QName _GetSearchViewResponseGetSearchViewResult_QNAME = new QName("http://tempuri.org/", "GetSearchViewResult");
    private final static QName _SetPolicyEndorsementStatusStrEndoStatus_QNAME = new QName("http://tempuri.org/", "strEndoStatus");
    private final static QName _SetPolicyEndorsementStatusStrPortalName_QNAME = new QName("http://tempuri.org/", "strPortalName");
    private final static QName _SetPolicyEndorsementStatusResponseSetPolicyEndorsementStatusResult_QNAME = new QName("http://tempuri.org/", "SetPolicyEndorsementStatusResult");
    private final static QName _GetClaimCountResponseGetClaimCountResult_QNAME = new QName("http://tempuri.org/", "GetClaimCountResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link AuthenticateResponse }
     * 
     */
    public AuthenticateResponse createAuthenticateResponse() {
        return new AuthenticateResponse();
    }

    /**
     * Create an instance of {@link GetUserRole }
     * 
     */
    public GetUserRole createGetUserRole() {
        return new GetUserRole();
    }

    /**
     * Create an instance of {@link GetUserRoleResponse }
     * 
     */
    public GetUserRoleResponse createGetUserRoleResponse() {
        return new GetUserRoleResponse();
    }

    /**
     * Create an instance of {@link IsAuthenticatedUser }
     * 
     */
    public IsAuthenticatedUser createIsAuthenticatedUser() {
        return new IsAuthenticatedUser();
    }

    /**
     * Create an instance of {@link IsAuthenticatedUserResponse }
     * 
     */
    public IsAuthenticatedUserResponse createIsAuthenticatedUserResponse() {
        return new IsAuthenticatedUserResponse();
    }

    /**
     * Create an instance of {@link CalculatePremium }
     * 
     */
    public CalculatePremium createCalculatePremium() {
        return new CalculatePremium();
    }

    /**
     * Create an instance of {@link CalculatePremiumResponse }
     * 
     */
    public CalculatePremiumResponse createCalculatePremiumResponse() {
        return new CalculatePremiumResponse();
    }

    /**
     * Create an instance of {@link SaveProposal }
     * 
     */
    public SaveProposal createSaveProposal() {
        return new SaveProposal();
    }

    /**
     * Create an instance of {@link SaveProposalResponse }
     * 
     */
    public SaveProposalResponse createSaveProposalResponse() {
        return new SaveProposalResponse();
    }

    /**
     * Create an instance of {@link GetHtmlReport }
     * 
     */
    public GetHtmlReport createGetHtmlReport() {
        return new GetHtmlReport();
    }

    /**
     * Create an instance of {@link GetHtmlReportResponse }
     * 
     */
    public GetHtmlReportResponse createGetHtmlReportResponse() {
        return new GetHtmlReportResponse();
    }

    /**
     * Create an instance of {@link GetProposalData }
     * 
     */
    public GetProposalData createGetProposalData() {
        return new GetProposalData();
    }

    /**
     * Create an instance of {@link GetProposalDataResponse }
     * 
     */
    public GetProposalDataResponse createGetProposalDataResponse() {
        return new GetProposalDataResponse();
    }

    /**
     * Create an instance of {@link AddCustomer }
     * 
     */
    public AddCustomer createAddCustomer() {
        return new AddCustomer();
    }

    /**
     * Create an instance of {@link AddCustomerResponse }
     * 
     */
    public AddCustomerResponse createAddCustomerResponse() {
        return new AddCustomerResponse();
    }

    /**
     * Create an instance of {@link EditCustomer }
     * 
     */
    public EditCustomer createEditCustomer() {
        return new EditCustomer();
    }

    /**
     * Create an instance of {@link EditCustomerResponse }
     * 
     */
    public EditCustomerResponse createEditCustomerResponse() {
        return new EditCustomerResponse();
    }

    /**
     * Create an instance of {@link ViewCustomer }
     * 
     */
    public ViewCustomer createViewCustomer() {
        return new ViewCustomer();
    }

    /**
     * Create an instance of {@link ViewCustomerResponse }
     * 
     */
    public ViewCustomerResponse createViewCustomerResponse() {
        return new ViewCustomerResponse();
    }

    /**
     * Create an instance of {@link GeneratePaymentReceipt }
     * 
     */
    public GeneratePaymentReceipt createGeneratePaymentReceipt() {
        return new GeneratePaymentReceipt();
    }

    /**
     * Create an instance of {@link GeneratePaymentReceiptResponse }
     * 
     */
    public GeneratePaymentReceiptResponse createGeneratePaymentReceiptResponse() {
        return new GeneratePaymentReceiptResponse();
    }

    /**
     * Create an instance of {@link PolicyRenewalGetData }
     * 
     */
    public PolicyRenewalGetData createPolicyRenewalGetData() {
        return new PolicyRenewalGetData();
    }

    /**
     * Create an instance of {@link PolicyRenewalGetDataResponse }
     * 
     */
    public PolicyRenewalGetDataResponse createPolicyRenewalGetDataResponse() {
        return new PolicyRenewalGetDataResponse();
    }

    /**
     * Create an instance of {@link PolicyRenewalSaveData }
     * 
     */
    public PolicyRenewalSaveData createPolicyRenewalSaveData() {
        return new PolicyRenewalSaveData();
    }

    /**
     * Create an instance of {@link PolicyRenewalSaveDataResponse }
     * 
     */
    public PolicyRenewalSaveDataResponse createPolicyRenewalSaveDataResponse() {
        return new PolicyRenewalSaveDataResponse();
    }

    /**
     * Create an instance of {@link PolicyRenewalSaveDataWithoutModification }
     * 
     */
    public PolicyRenewalSaveDataWithoutModification createPolicyRenewalSaveDataWithoutModification() {
        return new PolicyRenewalSaveDataWithoutModification();
    }

    /**
     * Create an instance of {@link PolicyRenewalSaveDataWithoutModificationResponse }
     * 
     */
    public PolicyRenewalSaveDataWithoutModificationResponse createPolicyRenewalSaveDataWithoutModificationResponse() {
        return new PolicyRenewalSaveDataWithoutModificationResponse();
    }

    /**
     * Create an instance of {@link CaculateRenewalPremium }
     * 
     */
    public CaculateRenewalPremium createCaculateRenewalPremium() {
        return new CaculateRenewalPremium();
    }

    /**
     * Create an instance of {@link CaculateRenewalPremiumResponse }
     * 
     */
    public CaculateRenewalPremiumResponse createCaculateRenewalPremiumResponse() {
        return new CaculateRenewalPremiumResponse();
    }

    /**
     * Create an instance of {@link FetchProposalXml }
     * 
     */
    public FetchProposalXml createFetchProposalXml() {
        return new FetchProposalXml();
    }

    /**
     * Create an instance of {@link FetchProposalXmlResponse }
     * 
     */
    public FetchProposalXmlResponse createFetchProposalXmlResponse() {
        return new FetchProposalXmlResponse();
    }

    /**
     * Create an instance of {@link ProposalCancellation }
     * 
     */
    public ProposalCancellation createProposalCancellation() {
        return new ProposalCancellation();
    }

    /**
     * Create an instance of {@link ProposalCancellationResponse }
     * 
     */
    public ProposalCancellationResponse createProposalCancellationResponse() {
        return new ProposalCancellationResponse();
    }

    /**
     * Create an instance of {@link FetchQuotationXml }
     * 
     */
    public FetchQuotationXml createFetchQuotationXml() {
        return new FetchQuotationXml();
    }

    /**
     * Create an instance of {@link FetchQuotationXmlResponse }
     * 
     */
    public FetchQuotationXmlResponse createFetchQuotationXmlResponse() {
        return new FetchQuotationXmlResponse();
    }

    /**
     * Create an instance of {@link GetPolicyScheduleForPortal }
     * 
     */
    public GetPolicyScheduleForPortal createGetPolicyScheduleForPortal() {
        return new GetPolicyScheduleForPortal();
    }

    /**
     * Create an instance of {@link GetPolicyScheduleForPortalResponse }
     * 
     */
    public GetPolicyScheduleForPortalResponse createGetPolicyScheduleForPortalResponse() {
        return new GetPolicyScheduleForPortalResponse();
    }

    /**
     * Create an instance of {@link GetECoverNoteForPortal }
     * 
     */
    public GetECoverNoteForPortal createGetECoverNoteForPortal() {
        return new GetECoverNoteForPortal();
    }

    /**
     * Create an instance of {@link GetECoverNoteForPortalResponse }
     * 
     */
    public GetECoverNoteForPortalResponse createGetECoverNoteForPortalResponse() {
        return new GetECoverNoteForPortalResponse();
    }

    /**
     * Create an instance of {@link GetPolicyRenewalMinimumData }
     * 
     */
    public GetPolicyRenewalMinimumData createGetPolicyRenewalMinimumData() {
        return new GetPolicyRenewalMinimumData();
    }

    /**
     * Create an instance of {@link GetPolicyRenewalMinimumDataResponse }
     * 
     */
    public GetPolicyRenewalMinimumDataResponse createGetPolicyRenewalMinimumDataResponse() {
        return new GetPolicyRenewalMinimumDataResponse();
    }

    /**
     * Create an instance of {@link GetWorkSheet }
     * 
     */
    public GetWorkSheet createGetWorkSheet() {
        return new GetWorkSheet();
    }

    /**
     * Create an instance of {@link GetWorkSheetResponse }
     * 
     */
    public GetWorkSheetResponse createGetWorkSheetResponse() {
        return new GetWorkSheetResponse();
    }

    /**
     * Create an instance of {@link GetRenewalNoticeHtml }
     * 
     */
    public GetRenewalNoticeHtml createGetRenewalNoticeHtml() {
        return new GetRenewalNoticeHtml();
    }

    /**
     * Create an instance of {@link GetRenewalNoticeHtmlResponse }
     * 
     */
    public GetRenewalNoticeHtmlResponse createGetRenewalNoticeHtmlResponse() {
        return new GetRenewalNoticeHtmlResponse();
    }

    /**
     * Create an instance of {@link SaveVehicleInspection }
     * 
     */
    public SaveVehicleInspection createSaveVehicleInspection() {
        return new SaveVehicleInspection();
    }

    /**
     * Create an instance of {@link SaveVehicleInspectionResponse }
     * 
     */
    public SaveVehicleInspectionResponse createSaveVehicleInspectionResponse() {
        return new SaveVehicleInspectionResponse();
    }

    /**
     * Create an instance of {@link UploadFile }
     * 
     */
    public UploadFile createUploadFile() {
        return new UploadFile();
    }

    /**
     * Create an instance of {@link UploadFileResponse }
     * 
     */
    public UploadFileResponse createUploadFileResponse() {
        return new UploadFileResponse();
    }

    /**
     * Create an instance of {@link GetWorkSheetForPortal }
     * 
     */
    public GetWorkSheetForPortal createGetWorkSheetForPortal() {
        return new GetWorkSheetForPortal();
    }

    /**
     * Create an instance of {@link GetWorkSheetForPortalResponse }
     * 
     */
    public GetWorkSheetForPortalResponse createGetWorkSheetForPortalResponse() {
        return new GetWorkSheetForPortalResponse();
    }

    /**
     * Create an instance of {@link GetRenwalNoticeForPortal }
     * 
     */
    public GetRenwalNoticeForPortal createGetRenwalNoticeForPortal() {
        return new GetRenwalNoticeForPortal();
    }

    /**
     * Create an instance of {@link GetRenwalNoticeForPortalResponse }
     * 
     */
    public GetRenwalNoticeForPortalResponse createGetRenwalNoticeForPortalResponse() {
        return new GetRenwalNoticeForPortalResponse();
    }

    /**
     * Create an instance of {@link GetRenwalRejectionForPortal }
     * 
     */
    public GetRenwalRejectionForPortal createGetRenwalRejectionForPortal() {
        return new GetRenwalRejectionForPortal();
    }

    /**
     * Create an instance of {@link GetRenwalRejectionForPortalResponse }
     * 
     */
    public GetRenwalRejectionForPortalResponse createGetRenwalRejectionForPortalResponse() {
        return new GetRenwalRejectionForPortalResponse();
    }

    /**
     * Create an instance of {@link UploadClaimFile }
     * 
     */
    public UploadClaimFile createUploadClaimFile() {
        return new UploadClaimFile();
    }

    /**
     * Create an instance of {@link UploadClaimFileResponse }
     * 
     */
    public UploadClaimFileResponse createUploadClaimFileResponse() {
        return new UploadClaimFileResponse();
    }

    /**
     * Create an instance of {@link SaveDeatailQuote }
     * 
     */
    public SaveDeatailQuote createSaveDeatailQuote() {
        return new SaveDeatailQuote();
    }

    /**
     * Create an instance of {@link SaveDeatailQuoteResponse }
     * 
     */
    public SaveDeatailQuoteResponse createSaveDeatailQuoteResponse() {
        return new SaveDeatailQuoteResponse();
    }

    /**
     * Create an instance of {@link ViewPolicy }
     * 
     */
    public ViewPolicy createViewPolicy() {
        return new ViewPolicy();
    }

    /**
     * Create an instance of {@link ViewPolicyResponse }
     * 
     */
    public ViewPolicyResponse createViewPolicyResponse() {
        return new ViewPolicyResponse();
    }

    /**
     * Create an instance of {@link GetDataForNilEndorsement }
     * 
     */
    public GetDataForNilEndorsement createGetDataForNilEndorsement() {
        return new GetDataForNilEndorsement();
    }

    /**
     * Create an instance of {@link GetDataForNilEndorsementResponse }
     * 
     */
    public GetDataForNilEndorsementResponse createGetDataForNilEndorsementResponse() {
        return new GetDataForNilEndorsementResponse();
    }

    /**
     * Create an instance of {@link CreateNilEndorsement }
     * 
     */
    public CreateNilEndorsement createCreateNilEndorsement() {
        return new CreateNilEndorsement();
    }

    /**
     * Create an instance of {@link CreateNilEndorsementResponse }
     * 
     */
    public CreateNilEndorsementResponse createCreateNilEndorsementResponse() {
        return new CreateNilEndorsementResponse();
    }

    /**
     * Create an instance of {@link GetDataForNonNilEndorsement }
     * 
     */
    public GetDataForNonNilEndorsement createGetDataForNonNilEndorsement() {
        return new GetDataForNonNilEndorsement();
    }

    /**
     * Create an instance of {@link GetDataForNonNilEndorsementResponse }
     * 
     */
    public GetDataForNonNilEndorsementResponse createGetDataForNonNilEndorsementResponse() {
        return new GetDataForNonNilEndorsementResponse();
    }

    /**
     * Create an instance of {@link CreateNonNilEndorsement }
     * 
     */
    public CreateNonNilEndorsement createCreateNonNilEndorsement() {
        return new CreateNonNilEndorsement();
    }

    /**
     * Create an instance of {@link CreateNonNilEndorsementResponse }
     * 
     */
    public CreateNonNilEndorsementResponse createCreateNonNilEndorsementResponse() {
        return new CreateNonNilEndorsementResponse();
    }

    /**
     * Create an instance of {@link GetDataForCancellationEndorsement }
     * 
     */
    public GetDataForCancellationEndorsement createGetDataForCancellationEndorsement() {
        return new GetDataForCancellationEndorsement();
    }

    /**
     * Create an instance of {@link GetDataForCancellationEndorsementResponse }
     * 
     */
    public GetDataForCancellationEndorsementResponse createGetDataForCancellationEndorsementResponse() {
        return new GetDataForCancellationEndorsementResponse();
    }

    /**
     * Create an instance of {@link CreateCancellationEndorsement }
     * 
     */
    public CreateCancellationEndorsement createCreateCancellationEndorsement() {
        return new CreateCancellationEndorsement();
    }

    /**
     * Create an instance of {@link CreateCancellationEndorsementResponse }
     * 
     */
    public CreateCancellationEndorsementResponse createCreateCancellationEndorsementResponse() {
        return new CreateCancellationEndorsementResponse();
    }

    /**
     * Create an instance of {@link CalculateEndorsementPremium }
     * 
     */
    public CalculateEndorsementPremium createCalculateEndorsementPremium() {
        return new CalculateEndorsementPremium();
    }

    /**
     * Create an instance of {@link CalculateEndorsementPremiumResponse }
     * 
     */
    public CalculateEndorsementPremiumResponse createCalculateEndorsementPremiumResponse() {
        return new CalculateEndorsementPremiumResponse();
    }

    /**
     * Create an instance of {@link ConvertICNToPolicy }
     * 
     */
    public ConvertICNToPolicy createConvertICNToPolicy() {
        return new ConvertICNToPolicy();
    }

    /**
     * Create an instance of {@link ConvertICNToPolicyResponse }
     * 
     */
    public ConvertICNToPolicyResponse createConvertICNToPolicyResponse() {
        return new ConvertICNToPolicyResponse();
    }

    /**
     * Create an instance of {@link QuickQuote }
     * 
     */
    public QuickQuote createQuickQuote() {
        return new QuickQuote();
    }

    /**
     * Create an instance of {@link QuickQuoteResponse }
     * 
     */
    public QuickQuoteResponse createQuickQuoteResponse() {
        return new QuickQuoteResponse();
    }

    /**
     * Create an instance of {@link CreateQuote }
     * 
     */
    public CreateQuote createCreateQuote() {
        return new CreateQuote();
    }

    /**
     * Create an instance of {@link CreateQuoteResponse }
     * 
     */
    public CreateQuoteResponse createCreateQuoteResponse() {
        return new CreateQuoteResponse();
    }

    /**
     * Create an instance of {@link ModifyQuote }
     * 
     */
    public ModifyQuote createModifyQuote() {
        return new ModifyQuote();
    }

    /**
     * Create an instance of {@link ModifyQuoteResponse }
     * 
     */
    public ModifyQuoteResponse createModifyQuoteResponse() {
        return new ModifyQuoteResponse();
    }

    /**
     * Create an instance of {@link QuoteToPolicy }
     * 
     */
    public QuoteToPolicy createQuoteToPolicy() {
        return new QuoteToPolicy();
    }

    /**
     * Create an instance of {@link QuoteToPolicyResponse }
     * 
     */
    public QuoteToPolicyResponse createQuoteToPolicyResponse() {
        return new QuoteToPolicyResponse();
    }

    /**
     * Create an instance of {@link CreatePolicy }
     * 
     */
    public CreatePolicy createCreatePolicy() {
        return new CreatePolicy();
    }

    /**
     * Create an instance of {@link CreatePolicyResponse }
     * 
     */
    public CreatePolicyResponse createCreatePolicyResponse() {
        return new CreatePolicyResponse();
    }

    /**
     * Create an instance of {@link CancelPolicy }
     * 
     */
    public CancelPolicy createCancelPolicy() {
        return new CancelPolicy();
    }

    /**
     * Create an instance of {@link CancelPolicyResponse }
     * 
     */
    public CancelPolicyResponse createCancelPolicyResponse() {
        return new CancelPolicyResponse();
    }

    /**
     * Create an instance of {@link PaymentEntry }
     * 
     */
    public PaymentEntry createPaymentEntry() {
        return new PaymentEntry();
    }

    /**
     * Create an instance of {@link org.tempuri.PaymentEntryResponse }
     * 
     */
    public org.tempuri.PaymentEntryResponse createPaymentEntryResponse() {
        return new org.tempuri.PaymentEntryResponse();
    }

    /**
     * Create an instance of {@link GeneratePolicySchedulePDF }
     * 
     */
    public GeneratePolicySchedulePDF createGeneratePolicySchedulePDF() {
        return new GeneratePolicySchedulePDF();
    }

    /**
     * Create an instance of {@link GeneratePolicySchedulePDFResponse }
     * 
     */
    public GeneratePolicySchedulePDFResponse createGeneratePolicySchedulePDFResponse() {
        return new GeneratePolicySchedulePDFResponse();
    }

    /**
     * Create an instance of {@link CreatePolicyXml }
     * 
     */
    public CreatePolicyXml createCreatePolicyXml() {
        return new CreatePolicyXml();
    }

    /**
     * Create an instance of {@link CreatePolicyXmlResponse }
     * 
     */
    public CreatePolicyXmlResponse createCreatePolicyXmlResponse() {
        return new CreatePolicyXmlResponse();
    }

    /**
     * Create an instance of {@link CancelProposal }
     * 
     */
    public CancelProposal createCancelProposal() {
        return new CancelProposal();
    }

    /**
     * Create an instance of {@link CancelProposalResponse }
     * 
     */
    public CancelProposalResponse createCancelProposalResponse() {
        return new CancelProposalResponse();
    }

    /**
     * Create an instance of {@link QuickEndorsement }
     * 
     */
    public QuickEndorsement createQuickEndorsement() {
        return new QuickEndorsement();
    }

    /**
     * Create an instance of {@link QuickEndorsementResponse }
     * 
     */
    public QuickEndorsementResponse createQuickEndorsementResponse() {
        return new QuickEndorsementResponse();
    }

    /**
     * Create an instance of {@link CancelDeclarationCertificate }
     * 
     */
    public CancelDeclarationCertificate createCancelDeclarationCertificate() {
        return new CancelDeclarationCertificate();
    }

    /**
     * Create an instance of {@link CancelDeclarationCertificateResponse }
     * 
     */
    public CancelDeclarationCertificateResponse createCancelDeclarationCertificateResponse() {
        return new CancelDeclarationCertificateResponse();
    }

    /**
     * Create an instance of {@link FetchMultiBlockProposalXml }
     * 
     */
    public FetchMultiBlockProposalXml createFetchMultiBlockProposalXml() {
        return new FetchMultiBlockProposalXml();
    }

    /**
     * Create an instance of {@link FetchMultiBlockProposalXmlResponse }
     * 
     */
    public FetchMultiBlockProposalXmlResponse createFetchMultiBlockProposalXmlResponse() {
        return new FetchMultiBlockProposalXmlResponse();
    }

    /**
     * Create an instance of {@link CalculateMultiBlockPremium }
     * 
     */
    public CalculateMultiBlockPremium createCalculateMultiBlockPremium() {
        return new CalculateMultiBlockPremium();
    }

    /**
     * Create an instance of {@link CalculateMultiBlockPremiumResponse }
     * 
     */
    public CalculateMultiBlockPremiumResponse createCalculateMultiBlockPremiumResponse() {
        return new CalculateMultiBlockPremiumResponse();
    }

    /**
     * Create an instance of {@link SaveProposalMultiBlock }
     * 
     */
    public SaveProposalMultiBlock createSaveProposalMultiBlock() {
        return new SaveProposalMultiBlock();
    }

    /**
     * Create an instance of {@link SaveProposalMultiBlockResponse }
     * 
     */
    public SaveProposalMultiBlockResponse createSaveProposalMultiBlockResponse() {
        return new SaveProposalMultiBlockResponse();
    }

    /**
     * Create an instance of {@link CalculateBlockWisePremium }
     * 
     */
    public CalculateBlockWisePremium createCalculateBlockWisePremium() {
        return new CalculateBlockWisePremium();
    }

    /**
     * Create an instance of {@link CalculateBlockWisePremiumResponse }
     * 
     */
    public CalculateBlockWisePremiumResponse createCalculateBlockWisePremiumResponse() {
        return new CalculateBlockWisePremiumResponse();
    }

    /**
     * Create an instance of {@link CalculateMultiBlockRenewalPremium }
     * 
     */
    public CalculateMultiBlockRenewalPremium createCalculateMultiBlockRenewalPremium() {
        return new CalculateMultiBlockRenewalPremium();
    }

    /**
     * Create an instance of {@link CalculateMultiBlockRenewalPremiumResponse }
     * 
     */
    public CalculateMultiBlockRenewalPremiumResponse createCalculateMultiBlockRenewalPremiumResponse() {
        return new CalculateMultiBlockRenewalPremiumResponse();
    }

    /**
     * Create an instance of {@link SaveRenewalProposalMultiBlock }
     * 
     */
    public SaveRenewalProposalMultiBlock createSaveRenewalProposalMultiBlock() {
        return new SaveRenewalProposalMultiBlock();
    }

    /**
     * Create an instance of {@link SaveRenewalProposalMultiBlockResponse }
     * 
     */
    public SaveRenewalProposalMultiBlockResponse createSaveRenewalProposalMultiBlockResponse() {
        return new SaveRenewalProposalMultiBlockResponse();
    }

    /**
     * Create an instance of {@link GetLatestPolicyNumber }
     * 
     */
    public GetLatestPolicyNumber createGetLatestPolicyNumber() {
        return new GetLatestPolicyNumber();
    }

    /**
     * Create an instance of {@link GetLatestPolicyNumberResponse }
     * 
     */
    public GetLatestPolicyNumberResponse createGetLatestPolicyNumberResponse() {
        return new GetLatestPolicyNumberResponse();
    }

    /**
     * Create an instance of {@link GetTaxDetails }
     * 
     */
    public GetTaxDetails createGetTaxDetails() {
        return new GetTaxDetails();
    }

    /**
     * Create an instance of {@link GetTaxDetailsResponse }
     * 
     */
    public GetTaxDetailsResponse createGetTaxDetailsResponse() {
        return new GetTaxDetailsResponse();
    }

    /**
     * Create an instance of {@link GetUpdatedPolicyNoAfterQC }
     * 
     */
    public GetUpdatedPolicyNoAfterQC createGetUpdatedPolicyNoAfterQC() {
        return new GetUpdatedPolicyNoAfterQC();
    }

    /**
     * Create an instance of {@link GetUpdatedPolicyNoAfterQCResponse }
     * 
     */
    public GetUpdatedPolicyNoAfterQCResponse createGetUpdatedPolicyNoAfterQCResponse() {
        return new GetUpdatedPolicyNoAfterQCResponse();
    }

    /**
     * Create an instance of {@link GetPolicyNoPI }
     * 
     */
    public GetPolicyNoPI createGetPolicyNoPI() {
        return new GetPolicyNoPI();
    }

    /**
     * Create an instance of {@link GetPolicyNoPIResponse }
     * 
     */
    public GetPolicyNoPIResponse createGetPolicyNoPIResponse() {
        return new GetPolicyNoPIResponse();
    }

    /**
     * Create an instance of {@link GetSearchView }
     * 
     */
    public GetSearchView createGetSearchView() {
        return new GetSearchView();
    }

    /**
     * Create an instance of {@link GetSearchViewResponse }
     * 
     */
    public GetSearchViewResponse createGetSearchViewResponse() {
        return new GetSearchViewResponse();
    }

    /**
     * Create an instance of {@link SetPolicyEndorsementStatus }
     * 
     */
    public SetPolicyEndorsementStatus createSetPolicyEndorsementStatus() {
        return new SetPolicyEndorsementStatus();
    }

    /**
     * Create an instance of {@link SetPolicyEndorsementStatusResponse }
     * 
     */
    public SetPolicyEndorsementStatusResponse createSetPolicyEndorsementStatusResponse() {
        return new SetPolicyEndorsementStatusResponse();
    }

    /**
     * Create an instance of {@link GetClaimCount }
     * 
     */
    public GetClaimCount createGetClaimCount() {
        return new GetClaimCount();
    }

    /**
     * Create an instance of {@link GetClaimCountResponse }
     * 
     */
    public GetClaimCountResponse createGetClaimCountResponse() {
        return new GetClaimCountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserID", scope = Authenticate.class)
    public JAXBElement<String> createAuthenticateUserID(String value) {
        return new JAXBElement<String>(_AuthenticateUserID_QNAME, String.class, Authenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Password", scope = Authenticate.class)
    public JAXBElement<String> createAuthenticatePassword(String value) {
        return new JAXBElement<String>(_AuthenticatePassword_QNAME, String.class, Authenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AuthenticateResult", scope = AuthenticateResponse.class)
    public JAXBElement<String> createAuthenticateResponseAuthenticateResult(String value) {
        return new JAXBElement<String>(_AuthenticateResponseAuthenticateResult_QNAME, String.class, AuthenticateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetUserRole.class)
    public JAXBElement<String> createGetUserRoleStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetUserRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserID", scope = GetUserRole.class)
    public JAXBElement<String> createGetUserRoleUserID(String value) {
        return new JAXBElement<String>(_AuthenticateUserID_QNAME, String.class, GetUserRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetUserRoleResult", scope = GetUserRoleResponse.class)
    public JAXBElement<String> createGetUserRoleResponseGetUserRoleResult(String value) {
        return new JAXBElement<String>(_GetUserRoleResponseGetUserRoleResult_QNAME, String.class, GetUserRoleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = IsAuthenticatedUser.class)
    public JAXBElement<String> createIsAuthenticatedUserStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, IsAuthenticatedUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = CalculatePremium.class)
    public JAXBElement<String> createCalculatePremiumStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, CalculatePremium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CalculatePremium.class)
    public JAXBElement<ServiceResult> createCalculatePremiumObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CalculatePremium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CalculatePremiumResponse.class)
    public JAXBElement<ServiceResult> createCalculatePremiumResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CalculatePremiumResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = SaveProposal.class)
    public JAXBElement<String> createSaveProposalStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, SaveProposal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = SaveProposal.class)
    public JAXBElement<ServiceResult> createSaveProposalObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, SaveProposal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = SaveProposalResponse.class)
    public JAXBElement<ServiceResult> createSaveProposalResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, SaveProposalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetHtmlReport.class)
    public JAXBElement<String> createGetHtmlReportStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetHtmlReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetHtmlReport.class)
    public JAXBElement<ServiceResult> createGetHtmlReportObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetHtmlReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetHtmlReportResponse.class)
    public JAXBElement<ServiceResult> createGetHtmlReportResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetHtmlReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetProposalData.class)
    public JAXBElement<String> createGetProposalDataStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetProposalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetProposalData.class)
    public JAXBElement<ServiceResult> createGetProposalDataObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetProposalData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetProposalDataResponse.class)
    public JAXBElement<ServiceResult> createGetProposalDataResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetProposalDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = AddCustomer.class)
    public JAXBElement<String> createAddCustomerStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, AddCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = AddCustomer.class)
    public JAXBElement<ServiceResult> createAddCustomerObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, AddCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = AddCustomerResponse.class)
    public JAXBElement<ServiceResult> createAddCustomerResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, AddCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = EditCustomer.class)
    public JAXBElement<String> createEditCustomerStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, EditCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = EditCustomer.class)
    public JAXBElement<ServiceResult> createEditCustomerObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, EditCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = EditCustomerResponse.class)
    public JAXBElement<ServiceResult> createEditCustomerResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, EditCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = ViewCustomer.class)
    public JAXBElement<String> createViewCustomerStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, ViewCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = ViewCustomer.class)
    public JAXBElement<ServiceResult> createViewCustomerObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, ViewCustomer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = ViewCustomerResponse.class)
    public JAXBElement<ServiceResult> createViewCustomerResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, ViewCustomerResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GeneratePaymentReceipt.class)
    public JAXBElement<String> createGeneratePaymentReceiptStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GeneratePaymentReceipt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GeneratePaymentReceipt.class)
    public JAXBElement<ServiceResult> createGeneratePaymentReceiptObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GeneratePaymentReceipt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GeneratePaymentReceiptResponse.class)
    public JAXBElement<ServiceResult> createGeneratePaymentReceiptResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GeneratePaymentReceiptResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = PolicyRenewalGetData.class)
    public JAXBElement<String> createPolicyRenewalGetDataStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, PolicyRenewalGetData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = PolicyRenewalGetData.class)
    public JAXBElement<ServiceResult> createPolicyRenewalGetDataObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, PolicyRenewalGetData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = PolicyRenewalGetDataResponse.class)
    public JAXBElement<ServiceResult> createPolicyRenewalGetDataResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, PolicyRenewalGetDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = PolicyRenewalSaveData.class)
    public JAXBElement<String> createPolicyRenewalSaveDataStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, PolicyRenewalSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = PolicyRenewalSaveData.class)
    public JAXBElement<ServiceResult> createPolicyRenewalSaveDataObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, PolicyRenewalSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = PolicyRenewalSaveDataResponse.class)
    public JAXBElement<ServiceResult> createPolicyRenewalSaveDataResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, PolicyRenewalSaveDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = PolicyRenewalSaveDataWithoutModification.class)
    public JAXBElement<String> createPolicyRenewalSaveDataWithoutModificationStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, PolicyRenewalSaveDataWithoutModification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = PolicyRenewalSaveDataWithoutModification.class)
    public JAXBElement<ServiceResult> createPolicyRenewalSaveDataWithoutModificationObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, PolicyRenewalSaveDataWithoutModification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = PolicyRenewalSaveDataWithoutModificationResponse.class)
    public JAXBElement<ServiceResult> createPolicyRenewalSaveDataWithoutModificationResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, PolicyRenewalSaveDataWithoutModificationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = CaculateRenewalPremium.class)
    public JAXBElement<String> createCaculateRenewalPremiumStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, CaculateRenewalPremium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CaculateRenewalPremium.class)
    public JAXBElement<ServiceResult> createCaculateRenewalPremiumObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CaculateRenewalPremium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CaculateRenewalPremiumResponse.class)
    public JAXBElement<ServiceResult> createCaculateRenewalPremiumResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CaculateRenewalPremiumResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = FetchProposalXml.class)
    public JAXBElement<String> createFetchProposalXmlStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, FetchProposalXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = FetchProposalXml.class)
    public JAXBElement<ServiceResult> createFetchProposalXmlObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, FetchProposalXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FetchProposalXmlResult", scope = FetchProposalXmlResponse.class)
    public JAXBElement<String> createFetchProposalXmlResponseFetchProposalXmlResult(String value) {
        return new JAXBElement<String>(_FetchProposalXmlResponseFetchProposalXmlResult_QNAME, String.class, FetchProposalXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = FetchProposalXmlResponse.class)
    public JAXBElement<ServiceResult> createFetchProposalXmlResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, FetchProposalXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = ProposalCancellation.class)
    public JAXBElement<String> createProposalCancellationStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, ProposalCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = ProposalCancellation.class)
    public JAXBElement<ServiceResult> createProposalCancellationObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, ProposalCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProposalCancellationResult", scope = ProposalCancellationResponse.class)
    public JAXBElement<String> createProposalCancellationResponseProposalCancellationResult(String value) {
        return new JAXBElement<String>(_ProposalCancellationResponseProposalCancellationResult_QNAME, String.class, ProposalCancellationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = ProposalCancellationResponse.class)
    public JAXBElement<ServiceResult> createProposalCancellationResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, ProposalCancellationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = FetchQuotationXml.class)
    public JAXBElement<String> createFetchQuotationXmlStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, FetchQuotationXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = FetchQuotationXml.class)
    public JAXBElement<ServiceResult> createFetchQuotationXmlObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, FetchQuotationXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FetchQuotationXmlResult", scope = FetchQuotationXmlResponse.class)
    public JAXBElement<String> createFetchQuotationXmlResponseFetchQuotationXmlResult(String value) {
        return new JAXBElement<String>(_FetchQuotationXmlResponseFetchQuotationXmlResult_QNAME, String.class, FetchQuotationXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = FetchQuotationXmlResponse.class)
    public JAXBElement<ServiceResult> createFetchQuotationXmlResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, FetchQuotationXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetPolicyScheduleForPortal.class)
    public JAXBElement<String> createGetPolicyScheduleForPortalStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetPolicyScheduleForPortal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetPolicyScheduleForPortal.class)
    public JAXBElement<ServiceResult> createGetPolicyScheduleForPortalObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetPolicyScheduleForPortal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPolicyScheduleForPortalResult", scope = GetPolicyScheduleForPortalResponse.class)
    public JAXBElement<String> createGetPolicyScheduleForPortalResponseGetPolicyScheduleForPortalResult(String value) {
        return new JAXBElement<String>(_GetPolicyScheduleForPortalResponseGetPolicyScheduleForPortalResult_QNAME, String.class, GetPolicyScheduleForPortalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetPolicyScheduleForPortalResponse.class)
    public JAXBElement<ServiceResult> createGetPolicyScheduleForPortalResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetPolicyScheduleForPortalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetECoverNoteForPortal.class)
    public JAXBElement<String> createGetECoverNoteForPortalStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetECoverNoteForPortal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetECoverNoteForPortal.class)
    public JAXBElement<ServiceResult> createGetECoverNoteForPortalObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetECoverNoteForPortal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetECoverNoteForPortalResult", scope = GetECoverNoteForPortalResponse.class)
    public JAXBElement<String> createGetECoverNoteForPortalResponseGetECoverNoteForPortalResult(String value) {
        return new JAXBElement<String>(_GetECoverNoteForPortalResponseGetECoverNoteForPortalResult_QNAME, String.class, GetECoverNoteForPortalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetECoverNoteForPortalResponse.class)
    public JAXBElement<ServiceResult> createGetECoverNoteForPortalResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetECoverNoteForPortalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetPolicyRenewalMinimumData.class)
    public JAXBElement<String> createGetPolicyRenewalMinimumDataStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetPolicyRenewalMinimumData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetPolicyRenewalMinimumData.class)
    public JAXBElement<ServiceResult> createGetPolicyRenewalMinimumDataObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetPolicyRenewalMinimumData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetPolicyRenewalMinimumDataResponse.class)
    public JAXBElement<ServiceResult> createGetPolicyRenewalMinimumDataResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetPolicyRenewalMinimumDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetWorkSheet.class)
    public JAXBElement<String> createGetWorkSheetStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetWorkSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetWorkSheet.class)
    public JAXBElement<ServiceResult> createGetWorkSheetObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetWorkSheet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetWorkSheetResult", scope = GetWorkSheetResponse.class)
    public JAXBElement<String> createGetWorkSheetResponseGetWorkSheetResult(String value) {
        return new JAXBElement<String>(_GetWorkSheetResponseGetWorkSheetResult_QNAME, String.class, GetWorkSheetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetWorkSheetResponse.class)
    public JAXBElement<ServiceResult> createGetWorkSheetResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetWorkSheetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetRenewalNoticeHtml.class)
    public JAXBElement<String> createGetRenewalNoticeHtmlStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetRenewalNoticeHtml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetRenewalNoticeHtml.class)
    public JAXBElement<ServiceResult> createGetRenewalNoticeHtmlObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetRenewalNoticeHtml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRenewalNoticeHtmlResult", scope = GetRenewalNoticeHtmlResponse.class)
    public JAXBElement<String> createGetRenewalNoticeHtmlResponseGetRenewalNoticeHtmlResult(String value) {
        return new JAXBElement<String>(_GetRenewalNoticeHtmlResponseGetRenewalNoticeHtmlResult_QNAME, String.class, GetRenewalNoticeHtmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetRenewalNoticeHtmlResponse.class)
    public JAXBElement<ServiceResult> createGetRenewalNoticeHtmlResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetRenewalNoticeHtmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = SaveVehicleInspection.class)
    public JAXBElement<String> createSaveVehicleInspectionStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, SaveVehicleInspection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = SaveVehicleInspection.class)
    public JAXBElement<ServiceResult> createSaveVehicleInspectionObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, SaveVehicleInspection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = SaveVehicleInspectionResponse.class)
    public JAXBElement<ServiceResult> createSaveVehicleInspectionResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, SaveVehicleInspectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = UploadFile.class)
    public JAXBElement<String> createUploadFileStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, UploadFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = UploadFile.class)
    public JAXBElement<ServiceResult> createUploadFileObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, UploadFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "str_num_policy_code", scope = UploadFile.class)
    public JAXBElement<String> createUploadFileStrNumPolicyCode(String value) {
        return new JAXBElement<String>(_UploadFileStrNumPolicyCode_QNAME, String.class, UploadFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strfile_name", scope = UploadFile.class)
    public JAXBElement<String> createUploadFileStrfileName(String value) {
        return new JAXBElement<String>(_UploadFileStrfileName_QNAME, String.class, UploadFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strfile_extension", scope = UploadFile.class)
    public JAXBElement<String> createUploadFileStrfileExtension(String value) {
        return new JAXBElement<String>(_UploadFileStrfileExtension_QNAME, String.class, UploadFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "byte_stream", scope = UploadFile.class)
    public JAXBElement<byte[]> createUploadFileByteStream(byte[] value) {
        return new JAXBElement<byte[]>(_UploadFileByteStream_QNAME, byte[].class, UploadFile.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = UploadFileResponse.class)
    public JAXBElement<ServiceResult> createUploadFileResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, UploadFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetWorkSheetForPortal.class)
    public JAXBElement<String> createGetWorkSheetForPortalStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetWorkSheetForPortal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetWorkSheetForPortal.class)
    public JAXBElement<ServiceResult> createGetWorkSheetForPortalObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetWorkSheetForPortal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetWorkSheetForPortalResult", scope = GetWorkSheetForPortalResponse.class)
    public JAXBElement<String> createGetWorkSheetForPortalResponseGetWorkSheetForPortalResult(String value) {
        return new JAXBElement<String>(_GetWorkSheetForPortalResponseGetWorkSheetForPortalResult_QNAME, String.class, GetWorkSheetForPortalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetWorkSheetForPortalResponse.class)
    public JAXBElement<ServiceResult> createGetWorkSheetForPortalResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetWorkSheetForPortalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetRenwalNoticeForPortal.class)
    public JAXBElement<String> createGetRenwalNoticeForPortalStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetRenwalNoticeForPortal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetRenwalNoticeForPortal.class)
    public JAXBElement<ServiceResult> createGetRenwalNoticeForPortalObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetRenwalNoticeForPortal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRenwalNoticeForPortalResult", scope = GetRenwalNoticeForPortalResponse.class)
    public JAXBElement<String> createGetRenwalNoticeForPortalResponseGetRenwalNoticeForPortalResult(String value) {
        return new JAXBElement<String>(_GetRenwalNoticeForPortalResponseGetRenwalNoticeForPortalResult_QNAME, String.class, GetRenwalNoticeForPortalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetRenwalNoticeForPortalResponse.class)
    public JAXBElement<ServiceResult> createGetRenwalNoticeForPortalResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetRenwalNoticeForPortalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetRenwalRejectionForPortal.class)
    public JAXBElement<String> createGetRenwalRejectionForPortalStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetRenwalRejectionForPortal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetRenwalRejectionForPortal.class)
    public JAXBElement<ServiceResult> createGetRenwalRejectionForPortalObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetRenwalRejectionForPortal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRenwalRejectionForPortalResult", scope = GetRenwalRejectionForPortalResponse.class)
    public JAXBElement<String> createGetRenwalRejectionForPortalResponseGetRenwalRejectionForPortalResult(String value) {
        return new JAXBElement<String>(_GetRenwalRejectionForPortalResponseGetRenwalRejectionForPortalResult_QNAME, String.class, GetRenwalRejectionForPortalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetRenwalRejectionForPortalResponse.class)
    public JAXBElement<ServiceResult> createGetRenwalRejectionForPortalResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetRenwalRejectionForPortalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = UploadClaimFile.class)
    public JAXBElement<String> createUploadClaimFileStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, UploadClaimFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = UploadClaimFile.class)
    public JAXBElement<ServiceResult> createUploadClaimFileObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, UploadClaimFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "str_num_claim_code", scope = UploadClaimFile.class)
    public JAXBElement<String> createUploadClaimFileStrNumClaimCode(String value) {
        return new JAXBElement<String>(_UploadClaimFileStrNumClaimCode_QNAME, String.class, UploadClaimFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strfile_name", scope = UploadClaimFile.class)
    public JAXBElement<String> createUploadClaimFileStrfileName(String value) {
        return new JAXBElement<String>(_UploadFileStrfileName_QNAME, String.class, UploadClaimFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strfile_extension", scope = UploadClaimFile.class)
    public JAXBElement<String> createUploadClaimFileStrfileExtension(String value) {
        return new JAXBElement<String>(_UploadFileStrfileExtension_QNAME, String.class, UploadClaimFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "byte_stream", scope = UploadClaimFile.class)
    public JAXBElement<byte[]> createUploadClaimFileByteStream(byte[] value) {
        return new JAXBElement<byte[]>(_UploadFileByteStream_QNAME, byte[].class, UploadClaimFile.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsClaimUploadResultSet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsClaimUploadResultSet }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UploadClaimFileResult", scope = UploadClaimFileResponse.class)
    public JAXBElement<ClsClaimUploadResultSet> createUploadClaimFileResponseUploadClaimFileResult(ClsClaimUploadResultSet value) {
        return new JAXBElement<ClsClaimUploadResultSet>(_UploadClaimFileResponseUploadClaimFileResult_QNAME, ClsClaimUploadResultSet.class, UploadClaimFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = SaveDeatailQuote.class)
    public JAXBElement<ServiceResult> createSaveDeatailQuoteObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, SaveDeatailQuote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = SaveDeatailQuoteResponse.class)
    public JAXBElement<ServiceResult> createSaveDeatailQuoteResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, SaveDeatailQuoteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = ViewPolicy.class)
    public JAXBElement<String> createViewPolicyStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, ViewPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = ViewPolicy.class)
    public JAXBElement<ServiceResult> createViewPolicyObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, ViewPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = ViewPolicyResponse.class)
    public JAXBElement<ServiceResult> createViewPolicyResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, ViewPolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetDataForNilEndorsement.class)
    public JAXBElement<String> createGetDataForNilEndorsementStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetDataForNilEndorsement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetDataForNilEndorsement.class)
    public JAXBElement<ServiceResult> createGetDataForNilEndorsementObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetDataForNilEndorsement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataForNilEndorsementResult", scope = GetDataForNilEndorsementResponse.class)
    public JAXBElement<String> createGetDataForNilEndorsementResponseGetDataForNilEndorsementResult(String value) {
        return new JAXBElement<String>(_GetDataForNilEndorsementResponseGetDataForNilEndorsementResult_QNAME, String.class, GetDataForNilEndorsementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetDataForNilEndorsementResponse.class)
    public JAXBElement<ServiceResult> createGetDataForNilEndorsementResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetDataForNilEndorsementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = CreateNilEndorsement.class)
    public JAXBElement<String> createCreateNilEndorsementStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, CreateNilEndorsement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CreateNilEndorsement.class)
    public JAXBElement<ServiceResult> createCreateNilEndorsementObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CreateNilEndorsement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CreateNilEndorsementResponse.class)
    public JAXBElement<ServiceResult> createCreateNilEndorsementResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CreateNilEndorsementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetDataForNonNilEndorsement.class)
    public JAXBElement<String> createGetDataForNonNilEndorsementStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetDataForNonNilEndorsement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetDataForNonNilEndorsement.class)
    public JAXBElement<ServiceResult> createGetDataForNonNilEndorsementObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetDataForNonNilEndorsement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataForNonNilEndorsementResult", scope = GetDataForNonNilEndorsementResponse.class)
    public JAXBElement<String> createGetDataForNonNilEndorsementResponseGetDataForNonNilEndorsementResult(String value) {
        return new JAXBElement<String>(_GetDataForNonNilEndorsementResponseGetDataForNonNilEndorsementResult_QNAME, String.class, GetDataForNonNilEndorsementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetDataForNonNilEndorsementResponse.class)
    public JAXBElement<ServiceResult> createGetDataForNonNilEndorsementResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetDataForNonNilEndorsementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = CreateNonNilEndorsement.class)
    public JAXBElement<String> createCreateNonNilEndorsementStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, CreateNonNilEndorsement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CreateNonNilEndorsement.class)
    public JAXBElement<ServiceResult> createCreateNonNilEndorsementObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CreateNonNilEndorsement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CreateNonNilEndorsementResponse.class)
    public JAXBElement<ServiceResult> createCreateNonNilEndorsementResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CreateNonNilEndorsementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetDataForCancellationEndorsement.class)
    public JAXBElement<String> createGetDataForCancellationEndorsementStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetDataForCancellationEndorsement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetDataForCancellationEndorsement.class)
    public JAXBElement<ServiceResult> createGetDataForCancellationEndorsementObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetDataForCancellationEndorsement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataForCancellationEndorsementResult", scope = GetDataForCancellationEndorsementResponse.class)
    public JAXBElement<String> createGetDataForCancellationEndorsementResponseGetDataForCancellationEndorsementResult(String value) {
        return new JAXBElement<String>(_GetDataForCancellationEndorsementResponseGetDataForCancellationEndorsementResult_QNAME, String.class, GetDataForCancellationEndorsementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetDataForCancellationEndorsementResponse.class)
    public JAXBElement<ServiceResult> createGetDataForCancellationEndorsementResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetDataForCancellationEndorsementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = CreateCancellationEndorsement.class)
    public JAXBElement<String> createCreateCancellationEndorsementStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, CreateCancellationEndorsement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CreateCancellationEndorsement.class)
    public JAXBElement<ServiceResult> createCreateCancellationEndorsementObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CreateCancellationEndorsement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CreateCancellationEndorsementResponse.class)
    public JAXBElement<ServiceResult> createCreateCancellationEndorsementResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CreateCancellationEndorsementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = CalculateEndorsementPremium.class)
    public JAXBElement<String> createCalculateEndorsementPremiumStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, CalculateEndorsementPremium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CalculateEndorsementPremium.class)
    public JAXBElement<ServiceResult> createCalculateEndorsementPremiumObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CalculateEndorsementPremium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CalculateEndorsementPremiumResponse.class)
    public JAXBElement<ServiceResult> createCalculateEndorsementPremiumResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CalculateEndorsementPremiumResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = ConvertICNToPolicy.class)
    public JAXBElement<String> createConvertICNToPolicyStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, ConvertICNToPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = ConvertICNToPolicy.class)
    public JAXBElement<ServiceResult> createConvertICNToPolicyObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, ConvertICNToPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = ConvertICNToPolicyResponse.class)
    public JAXBElement<ServiceResult> createConvertICNToPolicyResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, ConvertICNToPolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotationRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QuotationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objRequest", scope = QuickQuote.class)
    public JAXBElement<QuotationRequest> createQuickQuoteObjRequest(QuotationRequest value) {
        return new JAXBElement<QuotationRequest>(_QuickQuoteObjRequest_QNAME, QuotationRequest.class, QuickQuote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QuotationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "QuickQuoteResult", scope = QuickQuoteResponse.class)
    public JAXBElement<QuotationResponse> createQuickQuoteResponseQuickQuoteResult(QuotationResponse value) {
        return new JAXBElement<QuotationResponse>(_QuickQuoteResponseQuickQuoteResult_QNAME, QuotationResponse.class, QuickQuoteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotationRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QuotationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objRequest", scope = CreateQuote.class)
    public JAXBElement<QuotationRequest> createCreateQuoteObjRequest(QuotationRequest value) {
        return new JAXBElement<QuotationRequest>(_QuickQuoteObjRequest_QNAME, QuotationRequest.class, CreateQuote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QuotationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreateQuoteResult", scope = CreateQuoteResponse.class)
    public JAXBElement<QuotationResponse> createCreateQuoteResponseCreateQuoteResult(QuotationResponse value) {
        return new JAXBElement<QuotationResponse>(_CreateQuoteResponseCreateQuoteResult_QNAME, QuotationResponse.class, CreateQuoteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotationRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QuotationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objRequest", scope = ModifyQuote.class)
    public JAXBElement<QuotationRequest> createModifyQuoteObjRequest(QuotationRequest value) {
        return new JAXBElement<QuotationRequest>(_QuickQuoteObjRequest_QNAME, QuotationRequest.class, ModifyQuote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QuotationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ModifyQuoteResult", scope = ModifyQuoteResponse.class)
    public JAXBElement<QuotationResponse> createModifyQuoteResponseModifyQuoteResult(QuotationResponse value) {
        return new JAXBElement<QuotationResponse>(_ModifyQuoteResponseModifyQuoteResult_QNAME, QuotationResponse.class, ModifyQuoteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotationRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QuotationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objRequest", scope = QuoteToPolicy.class)
    public JAXBElement<QuotationRequest> createQuoteToPolicyObjRequest(QuotationRequest value) {
        return new JAXBElement<QuotationRequest>(_QuickQuoteObjRequest_QNAME, QuotationRequest.class, QuoteToPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolicyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "QuoteToPolicyResult", scope = QuoteToPolicyResponse.class)
    public JAXBElement<PolicyResponse> createQuoteToPolicyResponseQuoteToPolicyResult(PolicyResponse value) {
        return new JAXBElement<PolicyResponse>(_QuoteToPolicyResponseQuoteToPolicyResult_QNAME, PolicyResponse.class, QuoteToPolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolicyRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objRequest", scope = CreatePolicy.class)
    public JAXBElement<PolicyRequest> createCreatePolicyObjRequest(PolicyRequest value) {
        return new JAXBElement<PolicyRequest>(_QuickQuoteObjRequest_QNAME, PolicyRequest.class, CreatePolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolicyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreatePolicyResult", scope = CreatePolicyResponse.class)
    public JAXBElement<PolicyResponse> createCreatePolicyResponseCreatePolicyResult(PolicyResponse value) {
        return new JAXBElement<PolicyResponse>(_CreatePolicyResponseCreatePolicyResult_QNAME, PolicyResponse.class, CreatePolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyCancelRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolicyCancelRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objRequest", scope = CancelPolicy.class)
    public JAXBElement<PolicyCancelRequest> createCancelPolicyObjRequest(PolicyCancelRequest value) {
        return new JAXBElement<PolicyCancelRequest>(_QuickQuoteObjRequest_QNAME, PolicyCancelRequest.class, CancelPolicy.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyCancellationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolicyCancellationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancelPolicyResult", scope = CancelPolicyResponse.class)
    public JAXBElement<PolicyCancellationResponse> createCancelPolicyResponseCancelPolicyResult(PolicyCancellationResponse value) {
        return new JAXBElement<PolicyCancellationResponse>(_CancelPolicyResponseCancelPolicyResult_QNAME, PolicyCancellationResponse.class, CancelPolicyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentEntryRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentEntryRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objRequest", scope = PaymentEntry.class)
    public JAXBElement<PaymentEntryRequest> createPaymentEntryObjRequest(PaymentEntryRequest value) {
        return new JAXBElement<PaymentEntryRequest>(_QuickQuoteObjRequest_QNAME, PaymentEntryRequest.class, PaymentEntry.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.bridgewrapperbl.PaymentEntryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.bridgewrapperbl.PaymentEntryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PaymentEntryResult", scope = org.tempuri.PaymentEntryResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.bridgewrapperbl.PaymentEntryResponse> createPaymentEntryResponsePaymentEntryResult(org.datacontract.schemas._2004._07.bridgewrapperbl.PaymentEntryResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.bridgewrapperbl.PaymentEntryResponse>(_PaymentEntryResponsePaymentEntryResult_QNAME, org.datacontract.schemas._2004._07.bridgewrapperbl.PaymentEntryResponse.class, org.tempuri.PaymentEntryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateScheduleRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerateScheduleRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objRequest", scope = GeneratePolicySchedulePDF.class)
    public JAXBElement<GenerateScheduleRequest> createGeneratePolicySchedulePDFObjRequest(GenerateScheduleRequest value) {
        return new JAXBElement<GenerateScheduleRequest>(_QuickQuoteObjRequest_QNAME, GenerateScheduleRequest.class, GeneratePolicySchedulePDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateScheduleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GenerateScheduleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GeneratePolicySchedulePDFResult", scope = GeneratePolicySchedulePDFResponse.class)
    public JAXBElement<GenerateScheduleResponse> createGeneratePolicySchedulePDFResponseGeneratePolicySchedulePDFResult(GenerateScheduleResponse value) {
        return new JAXBElement<GenerateScheduleResponse>(_GeneratePolicySchedulePDFResponseGeneratePolicySchedulePDFResult_QNAME, GenerateScheduleResponse.class, GeneratePolicySchedulePDFResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = CreatePolicyXml.class)
    public JAXBElement<String> createCreatePolicyXmlStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, CreatePolicyXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CreatePolicyXml.class)
    public JAXBElement<ServiceResult> createCreatePolicyXmlObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CreatePolicyXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CreatePolicyXmlResponse.class)
    public JAXBElement<ServiceResult> createCreatePolicyXmlResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CreatePolicyXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = CancelProposal.class)
    public JAXBElement<String> createCancelProposalStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, CancelProposal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CancelProposal.class)
    public JAXBElement<ServiceResult> createCancelProposalObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CancelProposal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CancelProposalResponse.class)
    public JAXBElement<ServiceResult> createCancelProposalResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CancelProposalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = QuickEndorsement.class)
    public JAXBElement<String> createQuickEndorsementStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, QuickEndorsement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objRequest", scope = QuickEndorsement.class)
    public JAXBElement<ClsRequest> createQuickEndorsementObjRequest(ClsRequest value) {
        return new JAXBElement<ClsRequest>(_QuickQuoteObjRequest_QNAME, ClsRequest.class, QuickEndorsement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "QuickEndorsementResult", scope = QuickEndorsementResponse.class)
    public JAXBElement<ClsResponse> createQuickEndorsementResponseQuickEndorsementResult(ClsResponse value) {
        return new JAXBElement<ClsResponse>(_QuickEndorsementResponseQuickEndorsementResult_QNAME, ClsResponse.class, QuickEndorsementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objRequest", scope = QuickEndorsementResponse.class)
    public JAXBElement<ClsRequest> createQuickEndorsementResponseObjRequest(ClsRequest value) {
        return new JAXBElement<ClsRequest>(_QuickQuoteObjRequest_QNAME, ClsRequest.class, QuickEndorsementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = CancelDeclarationCertificate.class)
    public JAXBElement<String> createCancelDeclarationCertificateStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, CancelDeclarationCertificate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CancelDeclarationCertificate.class)
    public JAXBElement<ServiceResult> createCancelDeclarationCertificateObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CancelDeclarationCertificate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CancelDeclarationCertificateResponse.class)
    public JAXBElement<ServiceResult> createCancelDeclarationCertificateResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CancelDeclarationCertificateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = FetchMultiBlockProposalXml.class)
    public JAXBElement<String> createFetchMultiBlockProposalXmlStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, FetchMultiBlockProposalXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = FetchMultiBlockProposalXml.class)
    public JAXBElement<ServiceResult> createFetchMultiBlockProposalXmlObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, FetchMultiBlockProposalXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FetchMultiBlockProposalXmlResult", scope = FetchMultiBlockProposalXmlResponse.class)
    public JAXBElement<String> createFetchMultiBlockProposalXmlResponseFetchMultiBlockProposalXmlResult(String value) {
        return new JAXBElement<String>(_FetchMultiBlockProposalXmlResponseFetchMultiBlockProposalXmlResult_QNAME, String.class, FetchMultiBlockProposalXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = FetchMultiBlockProposalXmlResponse.class)
    public JAXBElement<ServiceResult> createFetchMultiBlockProposalXmlResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, FetchMultiBlockProposalXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = CalculateMultiBlockPremium.class)
    public JAXBElement<String> createCalculateMultiBlockPremiumStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, CalculateMultiBlockPremium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CalculateMultiBlockPremium.class)
    public JAXBElement<ServiceResult> createCalculateMultiBlockPremiumObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CalculateMultiBlockPremium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CalculateMultiBlockPremiumResponse.class)
    public JAXBElement<ServiceResult> createCalculateMultiBlockPremiumResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CalculateMultiBlockPremiumResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = SaveProposalMultiBlock.class)
    public JAXBElement<String> createSaveProposalMultiBlockStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, SaveProposalMultiBlock.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = SaveProposalMultiBlock.class)
    public JAXBElement<ServiceResult> createSaveProposalMultiBlockObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, SaveProposalMultiBlock.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = SaveProposalMultiBlockResponse.class)
    public JAXBElement<ServiceResult> createSaveProposalMultiBlockResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, SaveProposalMultiBlockResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = CalculateBlockWisePremium.class)
    public JAXBElement<String> createCalculateBlockWisePremiumStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, CalculateBlockWisePremium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CalculateBlockWisePremium.class)
    public JAXBElement<ServiceResult> createCalculateBlockWisePremiumObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CalculateBlockWisePremium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CalculateBlockWisePremiumResponse.class)
    public JAXBElement<ServiceResult> createCalculateBlockWisePremiumResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CalculateBlockWisePremiumResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = CalculateMultiBlockRenewalPremium.class)
    public JAXBElement<String> createCalculateMultiBlockRenewalPremiumStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, CalculateMultiBlockRenewalPremium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CalculateMultiBlockRenewalPremium.class)
    public JAXBElement<ServiceResult> createCalculateMultiBlockRenewalPremiumObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CalculateMultiBlockRenewalPremium.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = CalculateMultiBlockRenewalPremiumResponse.class)
    public JAXBElement<ServiceResult> createCalculateMultiBlockRenewalPremiumResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, CalculateMultiBlockRenewalPremiumResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = SaveRenewalProposalMultiBlock.class)
    public JAXBElement<String> createSaveRenewalProposalMultiBlockStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, SaveRenewalProposalMultiBlock.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = SaveRenewalProposalMultiBlock.class)
    public JAXBElement<ServiceResult> createSaveRenewalProposalMultiBlockObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, SaveRenewalProposalMultiBlock.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = SaveRenewalProposalMultiBlockResponse.class)
    public JAXBElement<ServiceResult> createSaveRenewalProposalMultiBlockResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, SaveRenewalProposalMultiBlockResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetLatestPolicyNumber.class)
    public JAXBElement<String> createGetLatestPolicyNumberStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetLatestPolicyNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetLatestPolicyNumber.class)
    public JAXBElement<ServiceResult> createGetLatestPolicyNumberObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetLatestPolicyNumber.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetLatestPolicyNumberResult", scope = GetLatestPolicyNumberResponse.class)
    public JAXBElement<String> createGetLatestPolicyNumberResponseGetLatestPolicyNumberResult(String value) {
        return new JAXBElement<String>(_GetLatestPolicyNumberResponseGetLatestPolicyNumberResult_QNAME, String.class, GetLatestPolicyNumberResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetLatestPolicyNumberResponse.class)
    public JAXBElement<ServiceResult> createGetLatestPolicyNumberResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetLatestPolicyNumberResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetTaxDetails.class)
    public JAXBElement<String> createGetTaxDetailsStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetTaxDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetTaxDetails.class)
    public JAXBElement<ServiceResult> createGetTaxDetailsObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetTaxDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetTaxDetailsResponse.class)
    public JAXBElement<ServiceResult> createGetTaxDetailsResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetTaxDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetUpdatedPolicyNoAfterQC.class)
    public JAXBElement<String> createGetUpdatedPolicyNoAfterQCStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetUpdatedPolicyNoAfterQC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetUpdatedPolicyNoAfterQC.class)
    public JAXBElement<ServiceResult> createGetUpdatedPolicyNoAfterQCObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetUpdatedPolicyNoAfterQC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetUpdatedPolicyNoAfterQCResponse.class)
    public JAXBElement<ServiceResult> createGetUpdatedPolicyNoAfterQCResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetUpdatedPolicyNoAfterQCResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetPolicyNoPI.class)
    public JAXBElement<String> createGetPolicyNoPIStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetPolicyNoPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetPolicyNoPI.class)
    public JAXBElement<ServiceResult> createGetPolicyNoPIObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetPolicyNoPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPolicyNoPIResult", scope = GetPolicyNoPIResponse.class)
    public JAXBElement<String> createGetPolicyNoPIResponseGetPolicyNoPIResult(String value) {
        return new JAXBElement<String>(_GetPolicyNoPIResponseGetPolicyNoPIResult_QNAME, String.class, GetPolicyNoPIResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "objServiceResult", scope = GetPolicyNoPIResponse.class)
    public JAXBElement<ServiceResult> createGetPolicyNoPIResponseObjServiceResult(ServiceResult value) {
        return new JAXBElement<ServiceResult>(_CalculatePremiumObjServiceResult_QNAME, ServiceResult.class, GetPolicyNoPIResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetSearchView.class)
    public JAXBElement<String> createGetSearchViewStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strPolicyNumber", scope = GetSearchView.class)
    public JAXBElement<String> createGetSearchViewStrPolicyNumber(String value) {
        return new JAXBElement<String>(_GetSearchViewStrPolicyNumber_QNAME, String.class, GetSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strEngineNumber", scope = GetSearchView.class)
    public JAXBElement<String> createGetSearchViewStrEngineNumber(String value) {
        return new JAXBElement<String>(_GetSearchViewStrEngineNumber_QNAME, String.class, GetSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strChasisNumber", scope = GetSearchView.class)
    public JAXBElement<String> createGetSearchViewStrChasisNumber(String value) {
        return new JAXBElement<String>(_GetSearchViewStrChasisNumber_QNAME, String.class, GetSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strRegistrationNumber", scope = GetSearchView.class)
    public JAXBElement<String> createGetSearchViewStrRegistrationNumber(String value) {
        return new JAXBElement<String>(_GetSearchViewStrRegistrationNumber_QNAME, String.class, GetSearchView.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSearchViewResult", scope = GetSearchViewResponse.class)
    public JAXBElement<SearchResult> createGetSearchViewResponseGetSearchViewResult(SearchResult value) {
        return new JAXBElement<SearchResult>(_GetSearchViewResponseGetSearchViewResult_QNAME, SearchResult.class, GetSearchViewResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = SetPolicyEndorsementStatus.class)
    public JAXBElement<String> createSetPolicyEndorsementStatusStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, SetPolicyEndorsementStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strPolicyNumber", scope = SetPolicyEndorsementStatus.class)
    public JAXBElement<String> createSetPolicyEndorsementStatusStrPolicyNumber(String value) {
        return new JAXBElement<String>(_GetSearchViewStrPolicyNumber_QNAME, String.class, SetPolicyEndorsementStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strEndoStatus", scope = SetPolicyEndorsementStatus.class)
    public JAXBElement<String> createSetPolicyEndorsementStatusStrEndoStatus(String value) {
        return new JAXBElement<String>(_SetPolicyEndorsementStatusStrEndoStatus_QNAME, String.class, SetPolicyEndorsementStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strPortalName", scope = SetPolicyEndorsementStatus.class)
    public JAXBElement<String> createSetPolicyEndorsementStatusStrPortalName(String value) {
        return new JAXBElement<String>(_SetPolicyEndorsementStatusStrPortalName_QNAME, String.class, SetPolicyEndorsementStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SetPolicyEndorsementStatusResult", scope = SetPolicyEndorsementStatusResponse.class)
    public JAXBElement<String> createSetPolicyEndorsementStatusResponseSetPolicyEndorsementStatusResult(String value) {
        return new JAXBElement<String>(_SetPolicyEndorsementStatusResponseSetPolicyEndorsementStatusResult_QNAME, String.class, SetPolicyEndorsementStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strLVAuthToken", scope = GetClaimCount.class)
    public JAXBElement<String> createGetClaimCountStrLVAuthToken(String value) {
        return new JAXBElement<String>(_GetUserRoleStrLVAuthToken_QNAME, String.class, GetClaimCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "strPolicyNumber", scope = GetClaimCount.class)
    public JAXBElement<String> createGetClaimCountStrPolicyNumber(String value) {
        return new JAXBElement<String>(_GetSearchViewStrPolicyNumber_QNAME, String.class, GetClaimCount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetClaimCountResult", scope = GetClaimCountResponse.class)
    public JAXBElement<String> createGetClaimCountResponseGetClaimCountResult(String value) {
        return new JAXBElement<String>(_GetClaimCountResponseGetClaimCountResult_QNAME, String.class, GetClaimCountResponse.class, value);
    }

}
