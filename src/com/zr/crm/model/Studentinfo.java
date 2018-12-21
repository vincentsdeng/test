package com.zr.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class Studentinfo {
    private BigDecimal stuId;

    private String stuName;

    private String stuSex;

    private BigDecimal stuAge;

    private String stuTel;

    private String stuEdu;

    private String stuMaior;

    private String stuGraduate;

    private String stuAddress;

    private String stuExpe;

    private Date stuTrainTime;

    private BigDecimal stuProjectNo;

    private BigDecimal lateCount;

    private Date updateTime;

    private Date creteTime;

    public BigDecimal getStuId() {
        return stuId;
    }

    public void setStuId(BigDecimal stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public BigDecimal getStuAge() {
        return stuAge;
    }

    public void setStuAge(BigDecimal stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuTel() {
        return stuTel;
    }

    public void setStuTel(String stuTel) {
        this.stuTel = stuTel == null ? null : stuTel.trim();
    }

    public String getStuEdu() {
        return stuEdu;
    }

    public void setStuEdu(String stuEdu) {
        this.stuEdu = stuEdu == null ? null : stuEdu.trim();
    }

    public String getStuMaior() {
        return stuMaior;
    }

    public void setStuMaior(String stuMaior) {
        this.stuMaior = stuMaior == null ? null : stuMaior.trim();
    }

    public String getStuGraduate() {
        return stuGraduate;
    }

    public void setStuGraduate(String stuGraduate) {
        this.stuGraduate = stuGraduate == null ? null : stuGraduate.trim();
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress == null ? null : stuAddress.trim();
    }

    public String getStuExpe() {
        return stuExpe;
    }

    public void setStuExpe(String stuExpe) {
        this.stuExpe = stuExpe == null ? null : stuExpe.trim();
    }

    public Date getStuTrainTime() {
        return stuTrainTime;
    }

    public void setStuTrainTime(Date stuTrainTime) {
        this.stuTrainTime = stuTrainTime;
    }

    public BigDecimal getStuProjectNo() {
        return stuProjectNo;
    }

    public void setStuProjectNo(BigDecimal stuProjectNo) {
        this.stuProjectNo = stuProjectNo;
    }

    public BigDecimal getLateCount() {
        return lateCount;
    }

    public void setLateCount(BigDecimal lateCount) {
        this.lateCount = lateCount;
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