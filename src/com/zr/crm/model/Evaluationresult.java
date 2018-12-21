package com.zr.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class Evaluationresult {
    private BigDecimal resultId;

    private BigDecimal stuId;

    private Date updateTime;

    private Date creteTime;

    private byte[] theResultContent;

    public BigDecimal getResultId() {
        return resultId;
    }

    public void setResultId(BigDecimal resultId) {
        this.resultId = resultId;
    }

    public BigDecimal getStuId() {
        return stuId;
    }

    public void setStuId(BigDecimal stuId) {
        this.stuId = stuId;
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

    public byte[] getTheResultContent() {
        return theResultContent;
    }

    public void setTheResultContent(byte[] theResultContent) {
        this.theResultContent = theResultContent;
    }
}