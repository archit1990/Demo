/**
 * 
 */
package sample.camel.service;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author n1651861
 *
 */
public class PolicyRequest {

	public ArrayList<LstPreviousAddonDetail> lstPreviousAddonDetails;
	public ArrayList<Object> lstAccessories;
	public ArrayList<Object> lstNonElecAccessories;
	public ArrayList<Object> lstVehicleObj;
	@JsonProperty("ParentIMDCode")
	public Object parentIMDCode;
	@JsonProperty("QuickQuoteNumber")
	public String quickQuoteNumber;
	@JsonProperty("IsFullQuote")
	public boolean isFullQuote;
	@JsonProperty("TPSourceName")
	public String tPSourceName;
	@JsonProperty("InspectionReferenceNo")
	public Object inspectionReferenceNo;
	@JsonProperty("SystemIdentifier")
	public Object systemIdentifier;
	@JsonProperty("InputXML")
	public Object inputXML;
	@JsonProperty("UTMNumber")
	public Object uTMNumber;
	@JsonProperty("EmailID")
	public Object emailID;
	@JsonProperty("MakeCode")
	public String makeCode;
	@JsonProperty("ModelCode")
	public String modelCode;
	@JsonProperty("ManfMonth")
	public int manfMonth;
	@JsonProperty("ManfYear")
	public int manfYear;
	@JsonProperty("RtoCode")
	public String rtoCode;
	@JsonProperty("RegNo1")
	public String regNo1;
	@JsonProperty("RegNo2")
	public String regNo2;
	@JsonProperty("RegNo3")
	public String regNo3;
	@JsonProperty("RegNo4")
	public String regNo4;
	@JsonProperty("EngineNo")
	public Object engineNo;
	@JsonProperty("ChassisNo")
	public Object chassisNo;
	@JsonProperty("RegistrationDate")
	public String registrationDate;
	@JsonProperty("DeliveryDate")
	public String deliveryDate;
	@JsonProperty("VehicleIDV")
	public double vehicleIDV;
	@JsonProperty("ConsumableCover")
	public String consumableCover;
	@JsonProperty("DepreciationCover")
	public String depreciationCover;
	@JsonProperty("IsNilDepOptedInPrevPolicy")
	public boolean isNilDepOptedInPrevPolicy;
	@JsonProperty("RoadSideAsstCover")
	public String roadSideAsstCover;
	@JsonProperty("GAPCover")
	public String gAPCover;
	@JsonProperty("GAPCoverSI")
	public int gAPCoverSI;
	@JsonProperty("EngineSafeCover")
	public String engineSafeCover;
	@JsonProperty("KeyLossCover")
	public String keyLossCover;
	@JsonProperty("KeyLossCoverSI")
	public int keyLossCoverSI;
	@JsonProperty("PassengerAsstCover")
	public String passengerAsstCover;
	@JsonProperty("PAOwnerDriver")
	public String pAOwnerDriver;
	@JsonProperty("GeographicalExtn")
	public String geographicalExtn;
	@JsonProperty("GeographicalExtnList")
	public ArrayList<Object> geographicalExtnList;
	@JsonProperty("LegalLiabilityToPaidDriver")
	public String legalLiabilityToPaidDriver;
	@JsonProperty("NoOfPassengerForLLToPaidDriver")
	public int noOfPassengerForLLToPaidDriver;
	@JsonProperty("LegalliabilityToEmployee")
	public String legalliabilityToEmployee;
	@JsonProperty("NoOfPassengerForLLToEmployee")
	public int noOfPassengerForLLToEmployee;
	@JsonProperty("PAUnnnamed")
	public String pAUnnnamed;
	@JsonProperty("NoOfPerunnamed")
	public int noOfPerunnamed;
	@JsonProperty("UnnamedPASI")
	public double unnamedPASI;
	@JsonProperty("ElectricalAccessories")
	public String electricalAccessories;
	@JsonProperty("NonElectricalAccessories")
	public String nonElectricalAccessories;
	@JsonProperty("PANamed")
	public String pANamed;
	@JsonProperty("NoOfPernamed")
	public int noOfPernamed;
	@JsonProperty("NamedPASI")
	public int namedPASI;
	@JsonProperty("ExternalFuelKit")
	public String externalFuelKit;
	@JsonProperty("FuelType")
	public Object fuelType;
	@JsonProperty("FuelSI")
	public int fuelSI;
	@JsonProperty("IsTrailerAttched")
	public Object isTrailerAttched;
	@JsonProperty("TrailerNo")
	public Object trailerNo;
	public Object lstTrailer;
	@JsonProperty("DrivingTuition")
	public String drivingTuition;
	@JsonProperty("FiberGlassTankCover")
	public Object fiberGlassTankCover;
	@JsonProperty("FiberGlassSI")
	public int fiberGlassSI;
	@JsonProperty("PAToPaidDriver")
	public String pAToPaidDriver;
	@JsonProperty("NoOfPaidDriverPassenger")
	public int noOfPaidDriverPassenger;
	@JsonProperty("PAToPaidDriverSI")
	public int pAToPaidDriverSI;
	@JsonProperty("AAIMembship")
	public String aAIMembship;
	@JsonProperty("AAIMembshipNumber")
	public Object aAIMembshipNumber;
	@JsonProperty("AAIAssociationCode")
	public Object aAIAssociationCode;
	@JsonProperty("AAIAssociationName")
	public Object aAIAssociationName;
	@JsonProperty("AAIMembshipExpiryDate")
	public String aAIMembshipExpiryDate;
	@JsonProperty("AntiTheftDevice")
	public String antiTheftDevice;
	@JsonProperty("IsAntiTheftDeviceCertifiedByARAI")
	public boolean isAntiTheftDeviceCertifiedByARAI;
	@JsonProperty("VehicleForHandicap")
	public Object vehicleForHandicap;
	@JsonProperty("VoluntaryExcess")
	public Object voluntaryExcess;
	@JsonProperty("VoluntaryExcessAmt")
	public int voluntaryExcessAmt;
	@JsonProperty("TPPDDiscount")
	public Object tPPDDiscount;
	@JsonProperty("LimtedtoOwnPremise")
	public String limtedtoOwnPremise;
	@JsonProperty("VintageCar")
	public String vintageCar;
	@JsonProperty("ForeignEmbassy")
	public Object foreignEmbassy;
	@JsonProperty("NoNomineeDetails")
	public boolean noNomineeDetails;
	@JsonProperty("NomineeFirstName")
	public Object nomineeFirstName;
	@JsonProperty("NomineeMiddleName")
	public Object nomineeMiddleName;
	@JsonProperty("NomineelastName")
	public Object nomineelastName;
	@JsonProperty("NomineeRelationship")
	public Object nomineeRelationship;
	@JsonProperty("OtherRelation")
	public Object otherRelation;
	@JsonProperty("IsMinor")
	public boolean isMinor;
	@JsonProperty("RepFirstName")
	public Object repFirstName;
	@JsonProperty("RepLastName")
	public Object repLastName;
	@JsonProperty("RepRelationWithMinor")
	public Object repRelationWithMinor;
	@JsonProperty("RepOtherRelation")
	public Object repOtherRelation;
	@JsonProperty("LeadID")
	public Object leadID;
	@JsonProperty("ProposalId")
	public Object proposalId;
	@JsonProperty("ProductCode")
	public String productCode;
	@JsonProperty("PolicyStartDate")
	public String policyStartDate;
	@JsonProperty("PolicyEndDate")
	public String policyEndDate;
	@JsonProperty("Aggregator_KYC_Req_No")
	public Object aggregator_KYC_Req_No;
	@JsonProperty("IC_KYC_No")
	public Object iC_KYC_No;
	@JsonProperty("KYCStage")
	public Object kYCStage;
	@JsonProperty("CKYC_No")
	public Object cKYC_No;
	@JsonProperty("POSPCode")
	public Object pOSPCode;
	@JsonProperty("POSPName")
	public Object pOSPName;
	@JsonProperty("POSPType")
	public Object pOSPType;
	@JsonProperty("AgentCode")
	public String agentCode;
	@JsonProperty("POSPPan")
	public Object pOSPPan;
	@JsonProperty("POSPAadhar")
	public Object pOSPAadhar;
	@JsonProperty("POSPMobileNumber")
	public Object pOSPMobileNumber;
	@JsonProperty("IMDNumber")
	public String iMDNumber;
	@JsonProperty("IMDNumberParent")
	public String iMDNumberParent;
	@JsonProperty("PolicyTenure")
	public int policyTenure;
	@JsonProperty("BusinessType")
	public String businessType;
	@JsonProperty("NoPreviousPolicyHistory")
	public boolean noPreviousPolicyHistory;
	@JsonProperty("PreviousPolicyType")
	public String previousPolicyType;
	@JsonProperty("PreviousPolicyStartDate")
	public String previousPolicyStartDate;
	@JsonProperty("PreviousPolicyEndDate")
	public String previousPolicyEndDate;
	@JsonProperty("PreviousPolicyNumber")
	public String previousPolicyNumber;
	@JsonProperty("NoOfClaims")
	public int noOfClaims;
	@JsonProperty("ClaimAmount")
	public int claimAmount;
	@JsonProperty("PreviousYearNCBPercentage")
	public String previousYearNCBPercentage;
	@JsonProperty("PreviousPolicyTenure")
	public int previousPolicyTenure;
	@JsonProperty("IsInspectionDone")
	public boolean isInspectionDone;
	@JsonProperty("InspectionDoneByWhom")
	public String inspectionDoneByWhom;
	@JsonProperty("ReportDate")
	public String reportDate;
	@JsonProperty("InspectionDate")
	public String inspectionDate;
	@JsonProperty("CustmerObj")
	public Object custmerObj;
	@JsonProperty("PreviousPolicyInsurerName")
	public String previousPolicyInsurerName;
	@JsonProperty("IsFinancierDetails")
	public boolean isFinancierDetails;
	@JsonProperty("AgreementType")
	public Object agreementType;
	@JsonProperty("FinancierName")
	public Object financierName;
	@JsonProperty("FinancierAddress")
	public Object financierAddress;
	@JsonProperty("BuyerState")
	public String buyerState;
	@JsonProperty("GSTIN")
	public Object gSTIN;
	@JsonProperty("LoadingDiscountRateFirstYear")
	public int loadingDiscountRateFirstYear;
	@JsonProperty("LoadingDiscountRateSecondYear")
	public int loadingDiscountRateSecondYear;
	@JsonProperty("LoadingDiscountRateThirdYear")
	public int loadingDiscountRateThirdYear;
	@JsonProperty("LoadingDiscountRateFourthYear")
	public int loadingDiscountRateFourthYear;
	@JsonProperty("LoadingDiscountRateFifthYear")
	public int loadingDiscountRateFifthYear;
	@JsonProperty("LDRateFirstYear")
	public Object lDRateFirstYear;
	@JsonProperty("LDRateSecondYear")
	public Object lDRateSecondYear;
	@JsonProperty("LDRateThirdYear")
	public Object lDRateThirdYear;
	@JsonProperty("LDRateFourthYear")
	public Object lDRateFourthYear;
	@JsonProperty("LDRateFifthYear")
	public Object lDRateFifthYear;
	@JsonProperty("VehicleSubClassCode")
	public Object vehicleSubClassCode;
	@JsonProperty("VehicleClass")
	public Object vehicleClass;
	@JsonProperty("VehicleSegment")
	public Object vehicleSegment;
	@JsonProperty("BodyExShowRoomPrice")
	public int bodyExShowRoomPrice;
	@JsonProperty("ChassisExShowRoomPrice")
	public int chassisExShowRoomPrice;
	@JsonProperty("BodyIDV")
	public int bodyIDV;
	@JsonProperty("ChassisIDV")
	public int chassisIDV;
	@JsonProperty("LLtoNonFarePayingPassenger")
	public Object lLtoNonFarePayingPassenger;
	@JsonProperty("LegalLiablilityToPaidDriverOrConductorCleaner")
	public Object legalLiablilityToPaidDriverOrConductorCleaner;
	@JsonProperty("LlToPassengerExcludingEmployeesIMT46Hearses")
	public Object llToPassengerExcludingEmployeesIMT46Hearses;
	@JsonProperty("LlToPassengerExcludingEmployeesIMT46Ambulance")
	public Object llToPassengerExcludingEmployeesIMT46Ambulance;
	@JsonProperty("NoOfPassengerForIMT46HearsesAmbulances")
	public int noOfPassengerForIMT46HearsesAmbulances;
	@JsonProperty("CoverForLampsTyresTubesMudguardsIMT23")
	public Object coverForLampsTyresTubesMudguardsIMT23;
	@JsonProperty("IndemnityToHirer")
	public Object indemnityToHirer;
	@JsonProperty("VehicleUsage")
	public Object vehicleUsage;
	@JsonProperty("CoverforOverturning")
	public Object coverforOverturning;
	@JsonProperty("ExternalFittedCNG")
	public Object externalFittedCNG;
	@JsonProperty("ExternalFittedLPG")
	public Object externalFittedLPG;
	@JsonProperty("ConfinedtoOwnPremises")
	public Object confinedtoOwnPremises;
	@JsonProperty("EMIProtectionCover")
	public Object eMIProtectionCover;
	@JsonProperty("NoOfEMIs")
	public int noOfEMIs;
	@JsonProperty("MonthlyEMIAmount")
	public int monthlyEMIAmount;
	@JsonProperty("AdditionalTowingExpense")
	public Object additionalTowingExpense;
	@JsonProperty("TowingKM")
	public Object towingKM;
	@JsonProperty("TowingSI")
	public int towingSI;
	@JsonProperty("LegalLiabilityPassenger")
	public Object legalLiabilityPassenger;
	@JsonProperty("IDVFlag")
	public Object iDVFlag;
	@JsonProperty("NoDrivingLicense")
	public boolean noDrivingLicense;
	@JsonProperty("PAOwnerDriverTenure")
	public int pAOwnerDriverTenure;
	@JsonProperty("CPAAlreadyAvailable")
	public boolean cPAAlreadyAvailable;
	@JsonProperty("PreviousPolicyODStartDate")
	public String previousPolicyODStartDate;
	@JsonProperty("PreviousPolicyODEndDate")
	public String previousPolicyODEndDate;
	@JsonProperty("PreviousPolicyTPStartDate")
	public String previousPolicyTPStartDate;
	@JsonProperty("PreviousPolicyTPEndDate")
	public String previousPolicyTPEndDate;
	@JsonProperty("PreviousTPPolicyTenure")
	public int previousTPPolicyTenure;
	@JsonProperty("PreviousPolicyInsurerNameTP")
	public String previousPolicyInsurerNameTP;
	@JsonProperty("PreviousPolicyInsurerNameOD")
	public String previousPolicyInsurerNameOD;
	@JsonProperty("PreviousPolicyNumberTP")
	public String previousPolicyNumberTP;
	@JsonProperty("PreviousPolicyNumberOD")
	public String previousPolicyNumberOD;
	public boolean isActiveTPPolicyAvailable;
	@JsonProperty("BusType")
	public Object busType;
	@JsonProperty("VehicleType")
	public Object vehicleType;
	@JsonProperty("ErrorText")
	public Object errorText;
	@JsonProperty("ExShowRoomPrice")
	public int exShowRoomPrice;
	@JsonProperty("BasicPremium")
	public Object basicPremium;
	@JsonProperty("BasicOdPremium")
	public Object basicOdPremium;
	@JsonProperty("NetPremium")
	public Object netPremium;
	@JsonProperty("BasicTpPremium")
	public Object basicTpPremium;
	@JsonProperty("EndorsementPremium")
	public Object endorsementPremium;
	@JsonProperty("ServiceTax")
	public Object serviceTax;
	@JsonProperty("TotalPremium")
	public Object totalPremium;
	@JsonProperty("CurrentIdv")
	public Object currentIdv;
	@JsonProperty("PassengerAssistCoverPremium")
	public Object passengerAssistCoverPremium;
	@JsonProperty("DepreciationCoverPremium")
	public Object depreciationCoverPremium;
	@JsonProperty("PaToUnnamedCoverPremium")
	public Object paToUnnamedCoverPremium;
	@JsonProperty("ElectricalAccessoriesPremium")
	public Object electricalAccessoriesPremium;
	@JsonProperty("NonElectricalAccessoriesPremium")
	public Object nonElectricalAccessoriesPremium;
	@JsonProperty("PatoOwnerDriverCoverPremium")
	public Object patoOwnerDriverCoverPremium;
	@JsonProperty("LLtoPaidDriverCoverPremium")
	public Object lLtoPaidDriverCoverPremium;
	@JsonProperty("BonusDiscount")
	public Object bonusDiscount;
	@JsonProperty("BonusRate")
	public Object bonusRate;
	@JsonProperty("Detariff")
	public Object detariff;
	@JsonProperty("DetariffPremium")
	public Object detariffPremium;
	@JsonProperty("DetariffRate")
	public Object detariffRate;
	@JsonProperty("NetODPremium")
	public Object netODPremium;
	@JsonProperty("NetTPPremium")
	public Object netTPPremium;
	@JsonProperty("NcbAmount")
	public Object ncbAmount;
	@JsonProperty("GeoGraphicalODRate")
	public Object geoGraphicalODRate;
	@JsonProperty("GeoGraphicalODSumInsured")
	public Object geoGraphicalODSumInsured;
	@JsonProperty("GeoGraphicalTPRate")
	public Object geoGraphicalTPRate;
	@JsonProperty("TPPDPremium")
	public Object tPPDPremium;
	@JsonProperty("TPPDrestrictive")
	public Object tPPDrestrictive;
	@JsonProperty("TPPDRate")
	public Object tPPDRate;
	@JsonProperty("HandicapPremium")
	public Object handicapPremium;
	@JsonProperty("HandicapRate")
	public Object handicapRate;
	@JsonProperty("HandicapSum")
	public Object handicapSum;
	@JsonProperty("HandicapCalculate")
	public Object handicapCalculate;
	@JsonProperty("VoluntaryExcessPremium")
	public Object voluntaryExcessPremium;
	@JsonProperty("VoluntaryExcessRate")
	public Object voluntaryExcessRate;
	@JsonProperty("VoluntaryExcessSum")
	public Object voluntaryExcessSum;
	@JsonProperty("VoluntaryExcessCalculate")
	public Object voluntaryExcessCalculate;
	@JsonProperty("AAIPremium")
	public Object aAIPremium;
	@JsonProperty("AAISum")
	public Object aAISum;
	@JsonProperty("AAIRate")
	public Object aAIRate;
	@JsonProperty("AAICalculate")
	public Object aAICalculate;
	@JsonProperty("ConsumablesCoverPremium")
	public Object consumablesCoverPremium;
	@JsonProperty("AntiTheftPremium")
	public Object antiTheftPremium;
	@JsonProperty("LimitedToOwnPremisePremium")
	public Object limitedToOwnPremisePremium;
	@JsonProperty("LimitedToOwnPremiseRate")
	public Object limitedToOwnPremiseRate;
	@JsonProperty("VintageCarDiscountPremium")
	public Object vintageCarDiscountPremium;
	@JsonProperty("ForeignEmbassyPremium")
	public Object foreignEmbassyPremium;
	@JsonProperty("PaToNamedPremium")
	public Object paToNamedPremium;
	@JsonProperty("PAToNamedSumInsured")
	public Object pAToNamedSumInsured;
	@JsonProperty("PaToPaidPremium")
	public Object paToPaidPremium;
	@JsonProperty("PAToPaidSumInsured")
	public Object pAToPaidSumInsured;
	@JsonProperty("DrivingTutionPremium")
	public Object drivingTutionPremium;
	@JsonProperty("DrivingTutionSumInsured")
	public Object drivingTutionSumInsured;
	@JsonProperty("FiberGlassTankPremium")
	public Object fiberGlassTankPremium;
	@JsonProperty("FiberGlassTankSumInsured")
	public Object fiberGlassTankSumInsured;
	@JsonProperty("FuelKitODPremium")
	public Object fuelKitODPremium;
	@JsonProperty("FuelKitTPPremium")
	public Object fuelKitTPPremium;
	@JsonProperty("GeographicalODPremium")
	public Object geographicalODPremium;
	@JsonProperty("GeographicalTPPremium")
	public Object geographicalTPPremium;
	@JsonProperty("NilDepPremium")
	public Object nilDepPremium;
	@JsonProperty("ConsumablePremium")
	public Object consumablePremium;
	@JsonProperty("GAPPremium")
	public Object gAPPremium;
	@JsonProperty("PassngrAssistPremium")
	public Object passngrAssistPremium;
	@JsonProperty("RoadAssistPremium")
	public Object roadAssistPremium;
	@JsonProperty("KeyLossPremium")
	public Object keyLossPremium;
	@JsonProperty("EngineSafeCoverPremium")
	public Object engineSafeCoverPremium;
	@JsonProperty("QuotationNumber")
	public String quotationNumber;
	@JsonProperty("TotalODPremium")
	public Object totalODPremium;
	@JsonProperty("TotalTpPremium")
	public Object totalTpPremium;
	@JsonProperty("GcCall")
	public Object gcCall;
	@JsonProperty("RoadAssistanceWithoutTax")
	public Object roadAssistanceWithoutTax;
	@JsonProperty("PaToUnnamedSumInsured")
	public Object paToUnnamedSumInsured;
	@JsonProperty("ElectricalAccesorySumInsured")
	public Object electricalAccesorySumInsured;
	@JsonProperty("NonElectricalAccessoriessumInsured")
	public Object nonElectricalAccessoriessumInsured;
	@JsonProperty("PatoOwnerDriversumInsured")
	public Object patoOwnerDriversumInsured;
	@JsonProperty("LLtoPaidDriverSumInsured")
	public Object lLtoPaidDriverSumInsured;
	@JsonProperty("GST")
	public int gST;
	@JsonProperty("SGST")
	public int sGST;
	@JsonProperty("CGST")
	public int cGST;
	@JsonProperty("IGST")
	public int iGST;
	@JsonProperty("UTGST")
	public int uTGST;
	@JsonProperty("PolicyType")
	public Object policyType;
	@JsonProperty("SumInsured")
	public int sumInsured;
	@JsonProperty("IsMultipleVehicle")
	public Object isMultipleVehicle;
	@JsonProperty("IsVehicleDetails")
	public boolean isVehicleDetails;
}
