package com.example.dbs.insurance.entity;

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
@ApiModel(value = "Companies对象", description = "")
public class Companies implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer companyCode;

    private String companyName;

    private Integer legacyCompanyNo;

    public Integer getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(Integer companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Integer getLegacyCompanyNo() {
        return legacyCompanyNo;
    }

    public void setLegacyCompanyNo(Integer legacyCompanyNo) {
        this.legacyCompanyNo = legacyCompanyNo;
    }

    @Override
    public String toString() {
        return "Companies{" +
            "companyCode = " + companyCode +
            ", companyName = " + companyName +
            ", legacyCompanyNo = " + legacyCompanyNo +
        "}";
    }
}
