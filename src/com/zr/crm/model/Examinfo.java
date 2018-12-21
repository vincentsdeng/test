package com.zr.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class Examinfo {
    private BigDecimal examId;

    private String examName;

    private BigDecimal examNo;

    private String examTitle;

    private String subExamTitle;

    private String subExamContent;

    private BigDecimal subExamScore;

    private String subExamAnswer;

    private Date updateTime;

    private Date creatTime;

    public BigDecimal getExamId() {
        return examId;
    }

    public void setExamId(BigDecimal examId) {
        this.examId = examId;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName == null ? null : examName.trim();
    }

    public BigDecimal getExamNo() {
        return examNo;
    }

    public void setExamNo(BigDecimal examNo) {
        this.examNo = examNo;
    }

    public String getExamTitle() {
        return examTitle;
    }

    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle == null ? null : examTitle.trim();
    }

    public String getSubExamTitle() {
        return subExamTitle;
    }

    public void setSubExamTitle(String subExamTitle) {
        this.subExamTitle = subExamTitle == null ? null : subExamTitle.trim();
    }

    public String getSubExamContent() {
        return subExamContent;
    }

    public void setSubExamContent(String subExamContent) {
        this.subExamContent = subExamContent == null ? null : subExamContent.trim();
    }

    public BigDecimal getSubExamScore() {
        return subExamScore;
    }

    public void setSubExamScore(BigDecimal subExamScore) {
        this.subExamScore = subExamScore;
    }

    public String getSubExamAnswer() {
        return subExamAnswer;
    }

    public void setSubExamAnswer(String subExamAnswer) {
        this.subExamAnswer = subExamAnswer == null ? null : subExamAnswer.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }
}