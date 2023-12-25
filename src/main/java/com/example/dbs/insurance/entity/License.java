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
@ApiModel(value = "License对象", description = "")
public class License implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer assocSSN;

    private Integer contractNumber;

    private Integer licenseNumber;

    private Integer writingNumber;

    private String licenseState;

    private LocalDateTime issueDate;

    private LocalDateTime expirationDate;

    private Integer surveyID;

    private String custSSN;

    public Integer getAssocSSN() {
        return assocSSN;
    }

    public void setAssocSSN(Integer assocSSN) {
        this.assocSSN = assocSSN;
    }

    public Integer getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Integer getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(Integer licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Integer getWritingNumber() {
        return writingNumber;
    }

    public void setWritingNumber(Integer writingNumber) {
        this.writingNumber = writingNumber;
    }

    public String getLicenseState() {
        return licenseState;
    }

    public void setLicenseState(String licenseState) {
        this.licenseState = licenseState;
    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
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
        return "License{" +
            "assocSSN = " + assocSSN +
            ", contractNumber = " + contractNumber +
            ", licenseNumber = " + licenseNumber +
            ", writingNumber = " + writingNumber +
            ", licenseState = " + licenseState +
            ", issueDate = " + issueDate +
            ", expirationDate = " + expirationDate +
            ", surveyID = " + surveyID +
            ", custSSN = " + custSSN +
        "}";
    }
}
