package com.zr.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class Subject {
    private BigDecimal subjectNo;

    private String subjectName;

    private BigDecimal subjectTimes;

    private BigDecimal subjectPrjManager;

    private Date updateTime;

    private Date creteTime;

    public BigDecimal getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(BigDecimal subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public BigDecimal getSubjectTimes() {
        return subjectTimes;
    }

    public void setSubjectTimes(BigDecimal subjectTimes) {
        this.subjectTimes = subjectTimes;
    }

    public BigDecimal getSubjectPrjManager() {
        return subjectPrjManager;
    }

    public void setSubjectPrjManager(BigDecimal subjectPrjManager) {
        this.subjectPrjManager = subjectPrjManager;
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