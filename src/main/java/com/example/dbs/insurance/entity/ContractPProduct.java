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
@TableName("CONTRACT_P_PRODUCT")
@ApiModel(value = "ContractPProduct对象", description = "")
public class ContractPProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer contractNumber;

    private Integer lineOfBusiness;

    private Integer surveyID;

    private String custSSN;

    public Integer getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Integer getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(Integer lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
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
        return "ContractPProduct{" +
            "contractNumber = " + contractNumber +
            ", lineOfBusiness = " + lineOfBusiness +
            ", surveyID = " + surveyID +
            ", custSSN = " + custSSN +
        "}";
    }
}
