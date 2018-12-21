package com.zr.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class Testresult {
    private Long testNo;

    private Long subjectNo;

    private Long stuId;

    private BigDecimal testScore;

    private String testStatus;

    private Date testTime;

    private Date updateTime;

    private Date creteTime;

    public Long getTestNo() {
        return testNo;
    }

    public void setTestNo(Long testNo) {
        this.testNo = testNo;
    }

    public Long getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(Long subjectNo) {
        this.subjectNo = subjectNo;
    }

    public Long getStuId() {
        return stuId;
    }

    public void setStuId(Long stuId) {
        this.stuId = stuId;
    }

    public BigDecimal getTestScore() {
        return testScore;
    }

    public void setTestScore(BigDecimal testScore) {
        this.testScore = testScore;
    }

    public String getTestStatus() {
        return testStatus;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus == null ? null : testStatus.trim();
    }

    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
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