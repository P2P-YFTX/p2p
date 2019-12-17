package com.zking.core.model;

import java.util.Date;

public class AccountCash {
    private Integer cid;

    private Integer userid;

    private Integer cashstatus;

    private String cardno;

    private String banktype;

    private Float money;

    private Float realmoney;

    private Float fee;

    private String verifyuser;

    private Date verifytime;

    private String verifyremark;

    private Date addtime;

    public AccountCash(Integer cid, Integer userid, Integer cashstatus, String cardno, String banktype, Float money, Float realmoney, Float fee, String verifyuser, Date verifytime, String verifyremark, Date addtime) {
        this.cid = cid;
        this.userid = userid;
        this.cashstatus = cashstatus;
        this.cardno = cardno;
        this.banktype = banktype;
        this.money = money;
        this.realmoney = realmoney;
        this.fee = fee;
        this.verifyuser = verifyuser;
        this.verifytime = verifytime;
        this.verifyremark = verifyremark;
        this.addtime = addtime;
    }

    public AccountCash() {
        super();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCashstatus() {
        return cashstatus;
    }

    public void setCashstatus(Integer cashstatus) {
        this.cashstatus = cashstatus;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getBanktype() {
        return banktype;
    }

    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Float getRealmoney() {
        return realmoney;
    }

    public void setRealmoney(Float realmoney) {
        this.realmoney = realmoney;
    }

    public Float getFee() {
        return fee;
    }

    public void setFee(Float fee) {
        this.fee = fee;
    }

    public String getVerifyuser() {
        return verifyuser;
    }

    public void setVerifyuser(String verifyuser) {
        this.verifyuser = verifyuser;
    }

    public Date getVerifytime() {
        return verifytime;
    }

    public void setVerifytime(Date verifytime) {
        this.verifytime = verifytime;
    }

    public String getVerifyremark() {
        return verifyremark;
    }

    public void setVerifyremark(String verifyremark) {
        this.verifyremark = verifyremark;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}