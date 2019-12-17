package com.zking.core.model;

import java.util.Date;

public class FinRepay {
    private Long rid;

    private Integer userid;

    private Integer status;

    private Long projectid;

    private Date borrowtime;

    private Integer repaytime;

    private Integer repayyestime;

    private Float repayaccount;

    private Float repayyesaccount;

    private Integer lateday;

    private Float lateinterest;

    private Float capital;

    private Float interest;

    public FinRepay(Long rid, Integer userid, Integer status, Long projectid, Date borrowtime, Integer repaytime, Integer repayyestime, Float repayaccount, Float repayyesaccount, Integer lateday, Float lateinterest, Float capital, Float interest) {
        this.rid = rid;
        this.userid = userid;
        this.status = status;
        this.projectid = projectid;
        this.borrowtime = borrowtime;
        this.repaytime = repaytime;
        this.repayyestime = repayyestime;
        this.repayaccount = repayaccount;
        this.repayyesaccount = repayyesaccount;
        this.lateday = lateday;
        this.lateinterest = lateinterest;
        this.capital = capital;
        this.interest = interest;
    }

    public FinRepay() {
        super();
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
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

    public Long getProjectid() {
        return projectid;
    }

    public void setProjectid(Long projectid) {
        this.projectid = projectid;
    }

    public Date getBorrowtime() {
        return borrowtime;
    }

    public void setBorrowtime(Date borrowtime) {
        this.borrowtime = borrowtime;
    }

    public Integer getRepaytime() {
        return repaytime;
    }

    public void setRepaytime(Integer repaytime) {
        this.repaytime = repaytime;
    }

    public Integer getRepayyestime() {
        return repayyestime;
    }

    public void setRepayyestime(Integer repayyestime) {
        this.repayyestime = repayyestime;
    }

    public Float getRepayaccount() {
        return repayaccount;
    }

    public void setRepayaccount(Float repayaccount) {
        this.repayaccount = repayaccount;
    }

    public Float getRepayyesaccount() {
        return repayyesaccount;
    }

    public void setRepayyesaccount(Float repayyesaccount) {
        this.repayyesaccount = repayyesaccount;
    }

    public Integer getLateday() {
        return lateday;
    }

    public void setLateday(Integer lateday) {
        this.lateday = lateday;
    }

    public Float getLateinterest() {
        return lateinterest;
    }

    public void setLateinterest(Float lateinterest) {
        this.lateinterest = lateinterest;
    }

    public Float getCapital() {
        return capital;
    }

    public void setCapital(Float capital) {
        this.capital = capital;
    }

    public Float getInterest() {
        return interest;
    }

    public void setInterest(Float interest) {
        this.interest = interest;
    }
}