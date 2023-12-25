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
@ApiModel(value = "Customer对象", description = "")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    private String custSSN;

    private String custFirstName;

    private String custLastName;

    private String custMiddleInitial;

    private String custSuffix;

    private LocalDateTime custDOB;

    private String gender;

    private String custSalutation;

    private String custAlias;

    private String custAliasSalutation;

    public String getCustSSN() {
        return custSSN;
    }

    public void setCustSSN(String custSSN) {
        this.custSSN = custSSN;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    public String getCustMiddleInitial() {
        return custMiddleInitial;
    }

    public void setCustMiddleInitial(String custMiddleInitial) {
        this.custMiddleInitial = custMiddleInitial;
    }

    public String getCustSuffix() {
        return custSuffix;
    }

    public void setCustSuffix(String custSuffix) {
        this.custSuffix = custSuffix;
    }

    public LocalDateTime getCustDOB() {
        return custDOB;
    }

    public void setCustDOB(LocalDateTime custDOB) {
        this.custDOB = custDOB;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCustSalutation() {
        return custSalutation;
    }

    public void setCustSalutation(String custSalutation) {
        this.custSalutation = custSalutation;
    }

    public String getCustAlias() {
        return custAlias;
    }

    public void setCustAlias(String custAlias) {
        this.custAlias = custAlias;
    }

    public String getCustAliasSalutation() {
        return custAliasSalutation;
    }

    public void setCustAliasSalutation(String custAliasSalutation) {
        this.custAliasSalutation = custAliasSalutation;
    }

    @Override
    public String toString() {
        return "Customer{" +
            "custSSN = " + custSSN +
            ", custFirstName = " + custFirstName +
            ", custLastName = " + custLastName +
            ", custMiddleInitial = " + custMiddleInitial +
            ", custSuffix = " + custSuffix +
            ", custDOB = " + custDOB +
            ", gender = " + gender +
            ", custSalutation = " + custSalutation +
            ", custAlias = " + custAlias +
            ", custAliasSalutation = " + custAliasSalutation +
        "}";
    }
}
