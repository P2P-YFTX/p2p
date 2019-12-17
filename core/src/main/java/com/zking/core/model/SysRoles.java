package com.zking.core.model;

public class SysRoles {
    private Long srid;

    private String srname;

    private String srdescription;

    public SysRoles(Long srid, String srname, String srdescription) {
        this.srid = srid;
        this.srname = srname;
        this.srdescription = srdescription;
    }

    public SysRoles() {
        super();
    }

    public Long getSrid() {
        return srid;
    }

    public void setSrid(Long srid) {
        this.srid = srid;
    }

    public String getSrname() {
        return srname;
    }

    public void setSrname(String srname) {
        this.srname = srname;
    }

    public String getSrdescription() {
        return srdescription;
    }

    public void setSrdescription(String srdescription) {
        this.srdescription = srdescription;
    }
}