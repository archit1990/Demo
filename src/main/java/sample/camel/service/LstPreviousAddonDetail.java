package sample.camel.service;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LstPreviousAddonDetail{
    @JsonProperty("IsConsumableOptedInPrevPolicy") 
    public boolean isConsumableOptedInPrevPolicy;
    @JsonProperty("IsRoadSideAsstOptedInPrevPolicy") 
    public boolean isRoadSideAsstOptedInPrevPolicy;
    @JsonProperty("IsGAPCoverOptedInPrevPolicy") 
    public boolean isGAPCoverOptedInPrevPolicy;
    @JsonProperty("IsEngineSafeOptedInPrevPolicy") 
    public boolean isEngineSafeOptedInPrevPolicy;
    @JsonProperty("IsKeyLossOptedInPrevPolicy") 
    public boolean isKeyLossOptedInPrevPolicy;
    @JsonProperty("IsPassengerAsstOptedInPrevPolicy") 
    public boolean isPassengerAsstOptedInPrevPolicy;
    @JsonProperty("IsNilDepreicationOptedInPrevPolicy") 
    public boolean isNilDepreicationOptedInPrevPolicy;
    @JsonProperty("IsTowingExpenseOptedInPrevPolicy") 
    public boolean isTowingExpenseOptedInPrevPolicy;
    @JsonProperty("IsEMICoverOptedInPrevPolicy") 
    public boolean isEMICoverOptedInPrevPolicy;
}
