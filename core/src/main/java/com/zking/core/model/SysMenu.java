package com.zking.core.model;

public class SysMenu {
    private Long smid;

    private String smname;

    private String smpath;

    private String smparameter;

    private String smmethod;

    private String smfunctiondesc;

    public SysMenu(Long smid, String smname, String smpath, String smparameter, String smmethod, String smfunctiondesc) {
        this.smid = smid;
        this.smname = smname;
        this.smpath = smpath;
        this.smparameter = smparameter;
        this.smmethod = smmethod;
        this.smfunctiondesc = smfunctiondesc;
    }

    public SysMenu() {
        super();
    }

    public Long getSmid() {
        return smid;
    }

    public void setSmid(Long smid) {
        this.smid = smid;
    }

    public String getSmname() {
        return smname;
    }

    public void setSmname(String smname) {
        this.smname = smname;
    }

    public String getSmpath() {
        return smpath;
    }

    public void setSmpath(String smpath) {
        this.smpath = smpath;
    }

    public String getSmparameter() {
        return smparameter;
    }

    public void setSmparameter(String smparameter) {
        this.smparameter = smparameter;
    }

    public String getSmmethod() {
        return smmethod;
    }

    public void setSmmethod(String smmethod) {
        this.smmethod = smmethod;
    }

    public String getSmfunctiondesc() {
        return smfunctiondesc;
    }

    public void setSmfunctiondesc(String smfunctiondesc) {
        this.smfunctiondesc = smfunctiondesc;
    }
}