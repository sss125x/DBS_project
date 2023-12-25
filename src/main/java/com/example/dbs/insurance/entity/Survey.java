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
@ApiModel(value = "Survey对象", description = "")
public class Survey implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer surveyID;

    private Integer age;

    private Object height;

    private Integer weight;

    private Boolean familyHistoryWithOverweight;

    private Boolean favc;

    private Object fcvc;

    private Object ncp;

    private String caec;

    private Boolean smoke;

    private Object ch2o;

    private Boolean scc;

    private Object faf;

    private Object tue;

    private String calc;

    private String mtrans;

    private String nObeyesdad;

    private String custSSN;

    public Integer getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(Integer surveyID) {
        this.surveyID = surveyID;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Object getHeight() {
        return height;
    }

    public void setHeight(Object height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getFamilyHistoryWithOverweight() {
        return familyHistoryWithOverweight;
    }

    public void setFamilyHistoryWithOverweight(Boolean familyHistoryWithOverweight) {
        this.familyHistoryWithOverweight = familyHistoryWithOverweight;
    }

    public Boolean getFavc() {
        return favc;
    }

    public void setFavc(Boolean favc) {
        this.favc = favc;
    }

    public Object getFcvc() {
        return fcvc;
    }

    public void setFcvc(Object fcvc) {
        this.fcvc = fcvc;
    }

    public Object getNcp() {
        return ncp;
    }

    public void setNcp(Object ncp) {
        this.ncp = ncp;
    }

    public String getCaec() {
        return caec;
    }

    public void setCaec(String caec) {
        this.caec = caec;
    }

    public Boolean getSmoke() {
        return smoke;
    }

    public void setSmoke(Boolean smoke) {
        this.smoke = smoke;
    }

    public Object getCh2o() {
        return ch2o;
    }

    public void setCh2o(Object ch2o) {
        this.ch2o = ch2o;
    }

    public Boolean getScc() {
        return scc;
    }

    public void setScc(Boolean scc) {
        this.scc = scc;
    }

    public Object getFaf() {
        return faf;
    }

    public void setFaf(Object faf) {
        this.faf = faf;
    }

    public Object getTue() {
        return tue;
    }

    public void setTue(Object tue) {
        this.tue = tue;
    }

    public String getCalc() {
        return calc;
    }

    public void setCalc(String calc) {
        this.calc = calc;
    }

    public String getMtrans() {
        return mtrans;
    }

    public void setMtrans(String mtrans) {
        this.mtrans = mtrans;
    }

    public String getnObeyesdad() {
        return nObeyesdad;
    }

    public void setnObeyesdad(String nObeyesdad) {
        this.nObeyesdad = nObeyesdad;
    }

    public String getCustSSN() {
        return custSSN;
    }

    public void setCustSSN(String custSSN) {
        this.custSSN = custSSN;
    }

    @Override
    public String toString() {
        return "Survey{" +
            "surveyID = " + surveyID +
            ", age = " + age +
            ", height = " + height +
            ", weight = " + weight +
            ", familyHistoryWithOverweight = " + familyHistoryWithOverweight +
            ", favc = " + favc +
            ", fcvc = " + fcvc +
            ", ncp = " + ncp +
            ", caec = " + caec +
            ", smoke = " + smoke +
            ", ch2o = " + ch2o +
            ", scc = " + scc +
            ", faf = " + faf +
            ", tue = " + tue +
            ", calc = " + calc +
            ", mtrans = " + mtrans +
            ", nObeyesdad = " + nObeyesdad +
            ", custSSN = " + custSSN +
        "}";
    }
}
