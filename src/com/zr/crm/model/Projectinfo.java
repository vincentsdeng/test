package com.zr.crm.model;

import java.util.Date;

public class Projectinfo {
    private String priNo;

    private String priType;

    private String priLocation;

    private Date priStartTime;

    private String priAssistant;

    private String priStatus;

    private Date updateTime;

    private Date creteTime;
    
    public void setPriNo(String priNo) {
		this.priNo = priNo;
	}
    
    public String getPriNo() {
		return priNo;
	}
 
    public String getPriType() {
        return priType;
    }

    public void setPriType(String priType) {
        this.priType = priType == null ? null : priType.trim();
    }

    public String getPriLocation() {
        return priLocation;
    }

    public void setPriLocation(String priLocation) {
        this.priLocation = priLocation == null ? null : priLocation.trim();
    }

    public Date getPriStartTime() {
        return priStartTime;
    }

    public void setPriStartTime(Date priStartTime) {
        this.priStartTime = priStartTime;
    }

    public String getPriAssistant() {
        return priAssistant;
    }

    public void setPriAssistant(String priAssistant) {
        this.priAssistant = priAssistant == null ? null : priAssistant.trim();
    }

    public String getPriStatus() {
        return priStatus;
    }

    public void setPriStatus(String priStatus) {
        this.priStatus = priStatus == null ? null : priStatus.trim();
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