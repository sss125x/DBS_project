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
@TableName("COMPANY_MEMBER_ACCOUNT")
@ApiModel(value = "CompanyMemberAccount对象", description = "")
public class CompanyMemberAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer companyCode;

    private Integer accountID;

    public Integer getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(Integer companyCode) {
        this.companyCode = companyCode;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    @Override
    public String toString() {
        return "CompanyMemberAccount{" +
            "companyCode = " + companyCode +
            ", accountID = " + accountID +
        "}";
    }
}
