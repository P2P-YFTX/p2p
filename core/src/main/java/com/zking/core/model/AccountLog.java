package com.zking.core.model;

import java.util.Date;

public class AccountLog {
    private Integer logid;

    private Integer userid;

    private Float logmoney;

    private Integer logtype;

    private String accounttype;

    private Float totalmoney;

    private Float usemoney;

    private Float frostmoney;

    private Float haveinterest;

    private Float waitinterest;

    private Float waittotalmoney;

    private String remark;

    private Date addtime;

    public AccountLog(Integer logid, Integer userid, Float logmoney, Integer logtype, String accounttype, Float totalmoney, Float usemoney, Float frostmoney, Float haveinterest, Float waitinterest, Float waittotalmoney, String remark, Date addtime) {
        this.logid = logid;
        this.userid = userid;
        this.logmoney = logmoney;
        this.logtype = logtype;
        this.accounttype = accounttype;
        this.totalmoney = totalmoney;
        this.usemoney = usemoney;
        this.frostmoney = frostmoney;
        this.haveinterest = haveinterest;
        this.waitinterest = waitinterest;
        this.waittotalmoney = waittotalmoney;
        this.remark = remark;
        this.addtime = addtime;
    }

    public AccountLog() {
        super();
    }

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Float getLogmoney() {
        return logmoney;
    }

    public void setLogmoney(Float logmoney) {
        this.logmoney = logmoney;
    }

    public Integer getLogtype() {
        return logtype;
    }

    public void setLogtype(Integer logtype) {
        this.logtype = logtype;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public Float getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Float totalmoney) {
        this.totalmoney = totalmoney;
    }

    public Float getUsemoney() {
        return usemoney;
    }

    public void setUsemoney(Float usemoney) {
        this.usemoney = usemoney;
    }

    public Float getFrostmoney() {
        return frostmoney;
    }

    public void setFrostmoney(Float frostmoney) {
        this.frostmoney = frostmoney;
    }

    public Float getHaveinterest() {
        return haveinterest;
    }

    public void setHaveinterest(Float haveinterest) {
        this.haveinterest = haveinterest;
    }

    public Float getWaitinterest() {
        return waitinterest;
    }

    public void setWaitinterest(Float waitinterest) {
        this.waitinterest = waitinterest;
    }

    public Float getWaittotalmoney() {
        return waittotalmoney;
    }

    public void setWaittotalmoney(Float waittotalmoney) {
        this.waittotalmoney = waittotalmoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}