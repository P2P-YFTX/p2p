package com.zking.core.model;

import java.util.Date;

public class AccountRecharge {
    private Integer rid;

    private Integer userid;

    private Integer status;

    private Float money;

    private Float realmoney;

    private Float fee;

    private Integer type;

    private String rechargetype;

    private Integer verifyuser;

    private Date verifytime;

    private String verifyremark;

    private Date addtime;

    public AccountRecharge(Integer rid, Integer userid, Integer status, Float money, Float realmoney, Float fee, Integer type, String rechargetype, Integer verifyuser, Date verifytime, String verifyremark, Date addtime) {
        this.rid = rid;
        this.userid = userid;
        this.status = status;
        this.money = money;
        this.realmoney = realmoney;
        this.fee = fee;
        this.type = type;
        this.rechargetype = rechargetype;
        this.verifyuser = verifyuser;
        this.verifytime = verifytime;
        this.verifyremark = verifyremark;
        this.addtime = addtime;
    }

    public AccountRecharge() {
        super();
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRechargetype() {
        return rechargetype;
    }

    public void setRechargetype(String rechargetype) {
        this.rechargetype = rechargetype;
    }

    public Integer getVerifyuser() {
        return verifyuser;
    }

    public void setVerifyuser(Integer verifyuser) {
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