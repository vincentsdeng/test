package com.zr.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class Projectmanagerinfo {
    private BigDecimal prjMngId;

    private String prjMngName;

    private String prjMngMajor;

    private BigDecimal prjMngYears;

    private Date prjMngJoin;

    private Date updateTime;

    private Date creteTime;

    public BigDecimal getPrjMngId() {
        return prjMngId;
    }

    public void setPrjMngId(BigDecimal prjMngId) {
        this.prjMngId = prjMngId;
    }

    public String getPrjMngName() {
        return prjMngName;
    }

    public void setPrjMngName(String prjMngName) {
        this.prjMngName = prjMngName == null ? null : prjMngName.trim();
    }

    public String getPrjMngMajor() {
        return prjMngMajor;
    }

    public void setPrjMngMajor(String prjMngMajor) {
        this.prjMngMajor = prjMngMajor == null ? null : prjMngMajor.trim();
    }

    public BigDecimal getPrjMngYears() {
        return prjMngYears;
    }

    public void setPrjMngYears(BigDecimal prjMngYears) {
        this.prjMngYears = prjMngYears;
    }

    public Date getPrjMngJoin() {
        return prjMngJoin;
    }

    public void setPrjMngJoin(Date prjMngJoin) {
        this.prjMngJoin = prjMngJoin;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Date creteTime) {
        this.creteTime = creteTime;
    }
}