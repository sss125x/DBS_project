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
@ApiModel(value = "Product对象", description = "")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer lineOfBusiness;

    private String govtAgency;

    private String pSGName;

    private String pPGName;

    private String seriesName;

    private String planName;

    public Integer getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(Integer lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    public String getGovtAgency() {
        return govtAgency;
    }

    public void setGovtAgency(String govtAgency) {
        this.govtAgency = govtAgency;
    }

    public String getpSGName() {
        return pSGName;
    }

    public void setpSGName(String pSGName) {
        this.pSGName = pSGName;
    }

    public String getpPGName() {
        return pPGName;
    }

    public void setpPGName(String pPGName) {
        this.pPGName = pPGName;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    @Override
    public String toString() {
        return "Product{" +
            "lineOfBusiness = " + lineOfBusiness +
            ", govtAgency = " + govtAgency +
            ", pSGName = " + pSGName +
            ", pPGName = " + pPGName +
            ", seriesName = " + seriesName +
            ", planName = " + planName +
        "}";
    }
}
