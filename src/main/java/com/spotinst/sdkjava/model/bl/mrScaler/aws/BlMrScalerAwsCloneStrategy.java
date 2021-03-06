package com.spotinst.sdkjava.model.bl.mrScaler.aws;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;

public class BlMrScalerAwsCloneStrategy {
    //region Members
    private String originClusterId;
    private Boolean includeSteps;
    private Integer numberOfRetries;
    // endregion

    //region Constructor
    public BlMrScalerAwsCloneStrategy() { }
    // endregion

    // region methods
    // region originClusterId
    public String getOriginClusterId(){ return originClusterId;}

    public void setOriginClusterId(String originClusterId){
        this.originClusterId = originClusterId;
    }
    // endregion

    // region includeSteps
    public Boolean getIncludeSteps(){ return includeSteps;}

    public void setIncludeSteps(Boolean includeSteps){
        this.includeSteps = includeSteps;
    }
    // endregion

    // region numberOfRetries
    public Integer getNumberOfRetries(){ return numberOfRetries;}

    public void setNumberOfRetries(Integer numberOfRetries){
        this.numberOfRetries = numberOfRetries;
    }
    // endregion
    // endregion
}
