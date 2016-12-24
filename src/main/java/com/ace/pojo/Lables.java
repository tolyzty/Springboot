package com.ace.pojo;

import java.util.Date;

public class Lables {
    private Integer lableId;

    private Integer lableUserid;

    private Integer lableBlogid;

    private Integer lableStut;

    private String lableInfo;

    private Date lableTime;

    public Integer getLableId() {
        return lableId;
    }

    public void setLableId(Integer lableId) {
        this.lableId = lableId;
    }

    public Integer getLableUserid(Integer uid) {
        return lableUserid;
    }

    public void setLableUserid(Integer lableUserid) {
        this.lableUserid = lableUserid;
    }

    public Integer getLableStut() {
        return lableStut;
    }

    public void setLableStut(Integer lableStut) {
        this.lableStut = lableStut;
    }

    public String getLableInfo() {
        return lableInfo;
    }

    public void setLableInfo(String lableInfo) {
        this.lableInfo = lableInfo == null ? null : lableInfo.trim();
    }

    public Date getLableTime() {
        return lableTime;
    }

    public void setLableTime(Date lableTime) {
        this.lableTime = lableTime;
    }

    public Integer getLableBlogid(Integer bid){
        return lableBlogid;
    }

    public void setLableBlogid(Integer lableBlogid){
        this.lableBlogid = lableBlogid;
    }
}