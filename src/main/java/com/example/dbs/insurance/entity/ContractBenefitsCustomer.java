package com.example.dbs.insurance.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("CONTRACT_BENEFITS_CUSTOMER")
@ApiModel(value = "ContractBenefitsCustomer对象", description = "")
public class ContractBenefitsCustomer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer contractNumber;

    private String custSSN;

    private Integer surveyID;

    public Integer getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getCustSSN() {
        return custSSN;
    }

    public void setCustSSN(String custSSN) {
        this.custSSN = custSSN;
    }

    public Integer getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(Integer surveyID) {
        this.surveyID = surveyID;
    }

    @Override
    public String toString() {
        return "ContractBenefitsCustomer{" +
            "contractNumber = " + contractNumber +
            ", custSSN = " + custSSN +
            ", surveyID = " + surveyID +
        "}";
    }
}
