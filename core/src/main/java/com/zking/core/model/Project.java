package com.zking.core.model;

import java.util.Date;

public class Project {
    private Integer id;

    private Long prouserid;

    private String protitle;

    private String protype;

    private Float promoney;

    private Date protimelimit;

    private Date proendtime;

    private Float proapr;

    private Integer prostyle;

    private String prodescription;

    private Integer prostatus;

    private Integer proverifyuser;

    private Integer proverifytime;

    private String proverifyremark;

    private Float repayment;

    private Float repaymentyes;

    private Date repaytime;

    private Short latedays;

    private Integer lateinterest;

    public Project(Integer id, Long prouserid, String protitle, String protype, Float promoney, Date protimelimit, Date proendtime, Float proapr, Integer prostyle, String prodescription, Integer prostatus, Integer proverifyuser, Integer proverifytime, String proverifyremark, Float repayment, Float repaymentyes, Date repaytime, Short latedays, Integer lateinterest) {
        this.id = id;
        this.prouserid = prouserid;
        this.protitle = protitle;
        this.protype = protype;
        this.promoney = promoney;
        this.protimelimit = protimelimit;
        this.proendtime = proendtime;
        this.proapr = proapr;
        this.prostyle = prostyle;
        this.prodescription = prodescription;
        this.prostatus = prostatus;
        this.proverifyuser = proverifyuser;
        this.proverifytime = proverifytime;
        this.proverifyremark = proverifyremark;
        this.repayment = repayment;
        this.repaymentyes = repaymentyes;
        this.repaytime = repaytime;
        this.latedays = latedays;
        this.lateinterest = lateinterest;
    }

    public Project() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getProuserid() {
        return prouserid;
    }

    public void setProuserid(Long prouserid) {
        this.prouserid = prouserid;
    }

    public String getProtitle() {
        return protitle;
    }

    public void setProtitle(String protitle) {
        this.protitle = protitle;
    }

    public String getProtype() {
        return protype;
    }

    public void setProtype(String protype) {
        this.protype = protype;
    }

    public Float getPromoney() {
        return promoney;
    }

    public void setPromoney(Float promoney) {
        this.promoney = promoney;
    }

    public Date getProtimelimit() {
        return protimelimit;
    }

    public void setProtimelimit(Date protimelimit) {
        this.protimelimit = protimelimit;
    }

    public Date getProendtime() {
        return proendtime;
    }

    public void setProendtime(Date proendtime) {
        this.proendtime = proendtime;
    }

    public Float getProapr() {
        return proapr;
    }

    public void setProapr(Float proapr) {
        this.proapr = proapr;
    }

    public Integer getProstyle() {
        return prostyle;
    }

    public void setProstyle(Integer prostyle) {
        this.prostyle = prostyle;
    }

    public String getProdescription() {
        return prodescription;
    }

    public void setProdescription(String prodescription) {
        this.prodescription = prodescription;
    }

    public Integer getProstatus() {
        return prostatus;
    }

    public void setProstatus(Integer prostatus) {
        this.prostatus = prostatus;
    }

    public Integer getProverifyuser() {
        return proverifyuser;
    }

    public void setProverifyuser(Integer proverifyuser) {
        this.proverifyuser = proverifyuser;
    }

    public Integer getProverifytime() {
        return proverifytime;
    }

    public void setProverifytime(Integer proverifytime) {
        this.proverifytime = proverifytime;
    }

    public String getProverifyremark() {
        return proverifyremark;
    }

    public void setProverifyremark(String proverifyremark) {
        this.proverifyremark = proverifyremark;
    }

    public Float getRepayment() {
        return repayment;
    }

    public void setRepayment(Float repayment) {
        this.repayment = repayment;
    }

    public Float getRepaymentyes() {
        return repaymentyes;
    }

    public void setRepaymentyes(Float repaymentyes) {
        this.repaymentyes = repaymentyes;
    }

    public Date getRepaytime() {
        return repaytime;
    }

    public void setRepaytime(Date repaytime) {
        this.repaytime = repaytime;
    }

    public Short getLatedays() {
        return latedays;
    }

    public void setLatedays(Short latedays) {
        this.latedays = latedays;
    }

    public Integer getLateinterest() {
        return lateinterest;
    }

    public void setLateinterest(Integer lateinterest) {
        this.lateinterest = lateinterest;
    }
}