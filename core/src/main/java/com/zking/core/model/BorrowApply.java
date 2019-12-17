package com.zking.core.model;

import java.util.Date;

public class BorrowApply {
    private Integer id;

    private Integer userid;

    private String name;

    private Float money;

    private Integer timelimit;

    private String phone;

    private String realname;

    private Integer province;

    private Integer city;

    private Date addtime;

    private Integer status;

    private Integer verifyuser;

    private Date verifytime;

    private String verifyremark;

    public BorrowApply(Integer id, Integer userid, String name, Float money, Integer timelimit, String phone, String realname, Integer province, Integer city, Date addtime, Integer status, Integer verifyuser, Date verifytime, String verifyremark) {
        this.id = id;
        this.userid = userid;
        this.name = name;
        this.money = money;
        this.timelimit = timelimit;
        this.phone = phone;
        this.realname = realname;
        this.province = province;
        this.city = city;
        this.addtime = addtime;
        this.status = status;
        this.verifyuser = verifyuser;
        this.verifytime = verifytime;
        this.verifyremark = verifyremark;
    }

    public BorrowApply() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public Integer getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Integer timelimit) {
        this.timelimit = timelimit;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
}