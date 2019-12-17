package com.zking.core.model;

import lombok.ToString;

import javax.lang.model.element.NestingKind;
import java.util.Date;

@ToString
public class StateStatus {
    private Long asid;

    private Long asuserid;

    private String asrealname;

    private String asidcardno;

    private String asidimg;

    private String asidimg2;

    private Date astime;

    private Integer asstate;

    private String asditor;

    public StateStatus(Long asid, Long asuserid, String asrealname, String asidcardno, String asidimg, String asidimg2, Date astime, Integer asstate, String asditor) {
        this.asid = asid;
        this.asuserid = asuserid;
        this.asrealname = asrealname;
        this.asidcardno = asidcardno;
        this.asidimg = asidimg;
        this.asidimg2 = asidimg2;
        this.astime = astime;
        this.asstate = asstate;
        this.asditor = asditor;
    }

    public StateStatus() {
        super();
    }

    public Long getAsid() {
        return asid;
    }

    public void setAsid(Long asid) {
        this.asid = asid;
    }

    public Long getAsuserid() {
        return asuserid;
    }

    public void setAsuserid(Long asuserid) {
        this.asuserid = asuserid;
    }

    public String getAsrealname() {
        return asrealname;
    }

    public void setAsrealname(String asrealname) {
        this.asrealname = asrealname;
    }

    public String getAsidcardno() {
        return asidcardno;
    }

    public void setAsidcardno(String asidcardno) {
        this.asidcardno = asidcardno;
    }

    public String getAsidimg() {
        return asidimg;
    }

    public void setAsidimg(String asidimg) {
        this.asidimg = asidimg;
    }

    public String getAsidimg2() {
        return asidimg2;
    }

    public void setAsidimg2(String asidimg2) {
        this.asidimg2 = asidimg2;
    }

    public Date getAstime() {
        return astime;
    }

    public void setAstime(Date astime) {
        this.astime = astime;
    }

    public Integer getAsstate() {
        return asstate;
    }

    public void setAsstate(Integer asstate) {
        this.asstate = asstate;
    }

    public String getAsditor() {
        return asditor;
    }

    public void setAsditor(String asditor) {
        this.asditor = asditor;
    }
}