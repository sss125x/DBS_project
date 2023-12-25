package com.example.dbs.insurance.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author PuW
 * @since 2023-12-23
 */
@ApiModel(value = "Contract对象", description = "")
public class Contract implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer contractNumber;

    private String coverageType;

    private String activityStatus;

    private String cardType;

    private LocalDateTime expirationDate;

    private Integer creditCardNo;

    private Integer duration;

    private Integer surveyID;

    private String custSSN;

    public Integer getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(String coverageType) {
        this.coverageType = coverageType;
    }

    public String getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(Integer creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(Integer surveyID) {
        this.surveyID = surveyID;
    }

    public String getCustSSN() {
        return custSSN;
    }

    public void setCustSSN(String custSSN) {
        this.custSSN = custSSN;
    }

    @Override
    public String toString() {
        return "Contract{" +
            "contractNumber = " + contractNumber +
            ", coverageType = " + coverageType +
            ", activityStatus = " + activityStatus +
            ", cardType = " + cardType +
            ", expirationDate = " + expirationDate +
            ", creditCardNo = " + creditCardNo +
            ", duration = " + duration +
            ", surveyID = " + surveyID +
            ", custSSN = " + custSSN +
        "}";
    }
}
