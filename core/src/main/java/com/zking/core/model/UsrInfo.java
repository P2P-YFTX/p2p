package com.zking.core.model;

public class UsrInfo {
    private Integer userid;

    private String ufrealname;

    private String ufsex;

    private String ufidnumber;

    private String ufphonenumber;

    private String ufbirthday;

    private Float ufincomegrade;

    private String ufmarriage;

    private String ufkidcount;

    private String ufeducationbackground;

    private String ufliveplace;

    public UsrInfo(Integer userid, String ufrealname, String ufsex, String ufidnumber, String ufphonenumber, String ufbirthday, Float ufincomegrade, String ufmarriage, String ufkidcount, String ufeducationbackground, String ufliveplace) {
        this.userid = userid;
        this.ufrealname = ufrealname;
        this.ufsex = ufsex;
        this.ufidnumber = ufidnumber;
        this.ufphonenumber = ufphonenumber;
        this.ufbirthday = ufbirthday;
        this.ufincomegrade = ufincomegrade;
        this.ufmarriage = ufmarriage;
        this.ufkidcount = ufkidcount;
        this.ufeducationbackground = ufeducationbackground;
        this.ufliveplace = ufliveplace;
    }

    public UsrInfo() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUfrealname() {
        return ufrealname;
    }

    public void setUfrealname(String ufrealname) {
        this.ufrealname = ufrealname;
    }

    public String getUfsex() {
        return ufsex;
    }

    public void setUfsex(String ufsex) {
        this.ufsex = ufsex;
    }

    public String getUfidnumber() {
        return ufidnumber;
    }

    public void setUfidnumber(String ufidnumber) {
        this.ufidnumber = ufidnumber;
    }

    public String getUfphonenumber() {
        return ufphonenumber;
    }

    public void setUfphonenumber(String ufphonenumber) {
        this.ufphonenumber = ufphonenumber;
    }

    public String getUfbirthday() {
        return ufbirthday;
    }

    public void setUfbirthday(String ufbirthday) {
        this.ufbirthday = ufbirthday;
    }

    public Float getUfincomegrade() {
        return ufincomegrade;
    }

    public void setUfincomegrade(Float ufincomegrade) {
        this.ufincomegrade = ufincomegrade;
    }

    public String getUfmarriage() {
        return ufmarriage;
    }

    public void setUfmarriage(String ufmarriage) {
        this.ufmarriage = ufmarriage;
    }

    public String getUfkidcount() {
        return ufkidcount;
    }

    public void setUfkidcount(String ufkidcount) {
        this.ufkidcount = ufkidcount;
    }

    public String getUfeducationbackground() {
        return ufeducationbackground;
    }

    public void setUfeducationbackground(String ufeducationbackground) {
        this.ufeducationbackground = ufeducationbackground;
    }

    public String getUfliveplace() {
        return ufliveplace;
    }

    public void setUfliveplace(String ufliveplace) {
        this.ufliveplace = ufliveplace;
    }
}