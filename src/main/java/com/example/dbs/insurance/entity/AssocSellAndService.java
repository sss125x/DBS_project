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
@TableName("ASSOC_SELL_AND_SERVICE")
@ApiModel(value = "AssocSellAndService对象", description = "")
public class AssocSellAndService implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer assocSSN;

    private Integer accountID;

    private Integer sitCode;

    private String assocType;

    public Integer getAssocSSN() {
        return assocSSN;
    }

    public void setAssocSSN(Integer assocSSN) {
        this.assocSSN = assocSSN;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public Integer getSitCode() {
        return sitCode;
    }

    public void setSitCode(Integer sitCode) {
        this.sitCode = sitCode;
    }

    public String getAssocType() {
        return assocType;
    }

    public void setAssocType(String assocType) {
        this.assocType = assocType;
    }

    @Override
    public String toString() {
        return "AssocSellAndService{" +
            "assocSSN = " + assocSSN +
            ", accountID = " + accountID +
            ", sitCode = " + sitCode +
            ", assocType = " + assocType +
        "}";
    }
}
