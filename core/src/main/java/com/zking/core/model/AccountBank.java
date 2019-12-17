package com.zking.core.model;

import java.util.Date;

public class AccountBank {
    private Integer abid;

    private Integer auserid;

    private String abank;

    private String banktype;

    private Long abankphone;

    private Long abankpass;

    private Integer acity;

    private Integer aprovince;

    private Integer aisbind;

    private Date addtime;

    public AccountBank(Integer abid, Integer auserid, String abank, String banktype, Long abankphone, Long abankpass, Integer acity, Integer aprovince, Integer aisbind, Date addtime) {
        this.abid = abid;
        this.auserid = auserid;
        this.abank = abank;
        this.banktype = banktype;
        this.abankphone = abankphone;
        this.abankpass = abankpass;
        this.acity = acity;
        this.aprovince = aprovince;
        this.aisbind = aisbind;
        this.addtime = addtime;
    }

    public AccountBank() {
        super();
    }

    public Integer getAbid() {
        return abid;
    }

    public void setAbid(Integer abid) {
        this.abid = abid;
    }

    public Integer getAuserid() {
        return auserid;
    }

    public void setAuserid(Integer auserid) {
        this.auserid = auserid;
    }

    public String getAbank() {
        return abank;
    }

    public void setAbank(String abank) {
        this.abank = abank;
    }

    public String getBanktype() {
        return banktype;
    }

    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    public Long getAbankphone() {
        return abankphone;
    }

    public void setAbankphone(Long abankphone) {
        this.abankphone = abankphone;
    }

    public Long getAbankpass() {
        return abankpass;
    }

    public void setAbankpass(Long abankpass) {
        this.abankpass = abankpass;
    }

    public Integer getAcity() {
        return acity;
    }

    public void setAcity(Integer acity) {
        this.acity = acity;
    }

    public Integer getAprovince() {
        return aprovince;
    }

    public void setAprovince(Integer aprovince) {
        this.aprovince = aprovince;
    }

    public Integer getAisbind() {
        return aisbind;
    }

    public void setAisbind(Integer aisbind) {
        this.aisbind = aisbind;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}