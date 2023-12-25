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
@TableName("CUSTOMER_CLAIMS_CONTRACT")
@ApiModel(value = "CustomerClaimsContract对象", description = "")
public class CustomerClaimsContract implements Serializable {

    private static final long serialVersionUID = 1L;

    private String custSSN;

    private Integer contractNumber;

    private Integer surveyID;

    public String getCustSSN() {
        return custSSN;
    }

    public void setCustSSN(String custSSN) {
        this.custSSN = custSSN;
    }

    public Integer getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Integer contractNumber) {
        this.contractNumber = contractNumber;
    }

    public Integer getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(Integer surveyID) {
        this.surveyID = surveyID;
    }

    @Override
    public String toString() {
        return "CustomerClaimsContract{" +
            "custSSN = " + custSSN +
            ", contractNumber = " + contractNumber +
            ", surveyID = " + surveyID +
        "}";
    }
}
