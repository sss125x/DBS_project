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
@ApiModel(value = "Associate对象", description = "")
public class Associate implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer assocSSN;

    private String assocFirstName;

    private String assocLastName;

    private String assocMiddleInitial;

    private String assocSuffix;

    private Integer assocPhone;

    public Integer getAssocSSN() {
        return assocSSN;
    }

    public void setAssocSSN(Integer assocSSN) {
        this.assocSSN = assocSSN;
    }

    public String getAssocFirstName() {
        return assocFirstName;
    }

    public void setAssocFirstName(String assocFirstName) {
        this.assocFirstName = assocFirstName;
    }

    public String getAssocLastName() {
        return assocLastName;
    }

    public void setAssocLastName(String assocLastName) {
        this.assocLastName = assocLastName;
    }

    public String getAssocMiddleInitial() {
        return assocMiddleInitial;
    }

    public void setAssocMiddleInitial(String assocMiddleInitial) {
        this.assocMiddleInitial = assocMiddleInitial;
    }

    public String getAssocSuffix() {
        return assocSuffix;
    }

    public void setAssocSuffix(String assocSuffix) {
        this.assocSuffix = assocSuffix;
    }

    public Integer getAssocPhone() {
        return assocPhone;
    }

    public void setAssocPhone(Integer assocPhone) {
        this.assocPhone = assocPhone;
    }

    @Override
    public String toString() {
        return "Associate{" +
            "assocSSN = " + assocSSN +
            ", assocFirstName = " + assocFirstName +
            ", assocLastName = " + assocLastName +
            ", assocMiddleInitial = " + assocMiddleInitial +
            ", assocSuffix = " + assocSuffix +
            ", assocPhone = " + assocPhone +
        "}";
    }
}
