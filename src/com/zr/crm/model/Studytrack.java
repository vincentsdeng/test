package com.zr.crm.model;

import java.math.BigDecimal;
import java.util.Date;

public class Studytrack {
    private BigDecimal trackId;

    private BigDecimal stuId;

    private BigDecimal subjectNo;

    private Date toCompanyTime;

    private String attendanceStatus;

    private String performance;

    private String taskResponse;

    private Date updateTime;

    private Date creteTime;

    public BigDecimal getTrackId() {
        return trackId;
    }

    public void setTrackId(BigDecimal trackId) {
        this.trackId = trackId;
    }

    public BigDecimal getStuId() {
        return stuId;
    }

    public void setStuId(BigDecimal stuId) {
        this.stuId = stuId;
    }

    public BigDecimal getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(BigDecimal subjectNo) {
        this.subjectNo = subjectNo;
    }

    public Date getToCompanyTime() {
        return toCompanyTime;
    }

    public void setToCompanyTime(Date toCompanyTime) {
        this.toCompanyTime = toCompanyTime;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus == null ? null : attendanceStatus.trim();
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance == null ? null : performance.trim();
    }

    public String getTaskResponse() {
        return taskResponse;
    }

    public void setTaskResponse(String taskResponse) {
        this.taskResponse = taskResponse == null ? null : taskResponse.trim();
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