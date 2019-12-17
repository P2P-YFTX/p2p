package com.zking.core.model;

public class UsrAccount {
    private Integer aid;

    private Integer userid;

    private Float totalmoney;

    private String tradepassword;

    private String salt;

    private Float usemoney;

    private Float frostmoney;

    private Float haveinterest;

    private Float waitinterest;

    private Float waittotalmoney;

    private Float unreturnamount;

    private Integer remainborrowlimit;

    private Integer borrowlimit;

    public UsrAccount(Integer aid, Integer userid, Float totalmoney, String tradepassword, String salt, Float usemoney, Float frostmoney, Float haveinterest, Float waitinterest, Float waittotalmoney, Float unreturnamount, Integer remainborrowlimit, Integer borrowlimit) {
        this.aid = aid;
        this.userid = userid;
        this.totalmoney = totalmoney;
        this.tradepassword = tradepassword;
        this.salt = salt;
        this.usemoney = usemoney;
        this.frostmoney = frostmoney;
        this.haveinterest = haveinterest;
        this.waitinterest = waitinterest;
        this.waittotalmoney = waittotalmoney;
        this.unreturnamount = unreturnamount;
        this.remainborrowlimit = remainborrowlimit;
        this.borrowlimit = borrowlimit;
    }

    public UsrAccount() {
        super();
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Float getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(Float totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getTradepassword() {
        return tradepassword;
    }

    public void setTradepassword(String tradepassword) {
        this.tradepassword = tradepassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
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

    public Float getUnreturnamount() {
        return unreturnamount;
    }

    public void setUnreturnamount(Float unreturnamount) {
        this.unreturnamount = unreturnamount;
    }

    public Integer getRemainborrowlimit() {
        return remainborrowlimit;
    }

    public void setRemainborrowlimit(Integer remainborrowlimit) {
        this.remainborrowlimit = remainborrowlimit;
    }

    public Integer getBorrowlimit() {
        return borrowlimit;
    }

    public void setBorrowlimit(Integer borrowlimit) {
        this.borrowlimit = borrowlimit;
    }
}