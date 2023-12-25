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
@TableName("CUSTOMER_MEMBER_ACCOUNT")
@ApiModel(value = "CustomerMemberAccount对象", description = "")
public class CustomerMemberAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    private String custSSN;

    private Integer accountID;

    private String type;

    public String getCustSSN() {
        return custSSN;
    }

    public void setCustSSN(String custSSN) {
        this.custSSN = custSSN;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CustomerMemberAccount{" +
            "custSSN = " + custSSN +
            ", accountID = " + accountID +
            ", type = " + type +
        "}";
    }
}
