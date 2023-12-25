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
@ApiModel(value = "Address对象", description = "")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer zip;

    private String address1;

    private String address2;

    private String city;

    private String state;

    private String custSSN;

    private Integer assocSSN;

    private Integer accountID;

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCustSSN() {
        return custSSN;
    }

    public void setCustSSN(String custSSN) {
        this.custSSN = custSSN;
    }

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

    @Override
    public String toString() {
        return "Address{" +
            "zip = " + zip +
            ", address1 = " + address1 +
            ", address2 = " + address2 +
            ", city = " + city +
            ", state = " + state +
            ", custSSN = " + custSSN +
            ", assocSSN = " + assocSSN +
            ", accountID = " + accountID +
        "}";
    }
}
