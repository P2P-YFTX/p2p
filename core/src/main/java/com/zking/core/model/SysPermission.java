package com.zking.core.model;

public class SysPermission {
    private Long spid;

    private String spname;

    private Integer splevel;

    private String sparentpid;

    private String available;

    private String permission;

    public SysPermission(Long spid, String spname, Integer splevel, String sparentpid, String available, String permission) {
        this.spid = spid;
        this.spname = spname;
        this.splevel = splevel;
        this.sparentpid = sparentpid;
        this.available = available;
        this.permission = permission;
    }

    public SysPermission() {
        super();
    }

    public Long getSpid() {
        return spid;
    }

    public void setSpid(Long spid) {
        this.spid = spid;
    }

    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    public Integer getSplevel() {
        return splevel;
    }

    public void setSplevel(Integer splevel) {
        this.splevel = splevel;
    }

    public String getSparentpid() {
        return sparentpid;
    }

    public void setSparentpid(String sparentpid) {
        this.sparentpid = sparentpid;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}