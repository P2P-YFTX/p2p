package com.zking.core.model;

import lombok.ToString;

import java.util.Date;

@ToString
public class User {
    private Integer userid;

    private String username;

    private String loginpass;

    private String loginsalt;

    private String email;

    private String phone;

    private String userpic;

    private String realname;

    private Integer inviteuserid;

    private Integer usertype;

    private Integer emailcheck;

    private Integer phonecheck;

    private Integer realnamecheck;

    private Integer islock;

    private Date registertime;

    public User(Integer userid, String username, String loginpass, String loginsalt, String email, String phone, String userpic, String realname, Integer inviteuserid, Integer usertype, Integer emailcheck, Integer phonecheck, Integer realnamecheck, Integer islock, Date registertime) {
        this.userid = userid;
        this.username = username;
        this.loginpass = loginpass;
        this.loginsalt = loginsalt;
        this.email = email;
        this.phone = phone;
        this.userpic = userpic;
        this.realname = realname;
        this.inviteuserid = inviteuserid;
        this.usertype = usertype;
        this.emailcheck = emailcheck;
        this.phonecheck = phonecheck;
        this.realnamecheck = realnamecheck;
        this.islock = islock;
        this.registertime = registertime;
    }

    public User() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginpass() {
        return loginpass;
    }

    public void setLoginpass(String loginpass) {
        this.loginpass = loginpass;
    }

    public String getLoginsalt() {
        return loginsalt;
    }

    public void setLoginsalt(String loginsalt) {
        this.loginsalt = loginsalt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserpic() {
        return userpic;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getInviteuserid() {
        return inviteuserid;
    }

    public void setInviteuserid(Integer inviteuserid) {
        this.inviteuserid = inviteuserid;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Integer getEmailcheck() {
        return emailcheck;
    }

    public void setEmailcheck(Integer emailcheck) {
        this.emailcheck = emailcheck;
    }

    public Integer getPhonecheck() {
        return phonecheck;
    }

    public void setPhonecheck(Integer phonecheck) {
        this.phonecheck = phonecheck;
    }

    public Integer getRealnamecheck() {
        return realnamecheck;
    }

    public void setRealnamecheck(Integer realnamecheck) {
        this.realnamecheck = realnamecheck;
    }

    public Integer getIslock() {
        return islock;
    }

    public void setIslock(Integer islock) {
        this.islock = islock;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }
}