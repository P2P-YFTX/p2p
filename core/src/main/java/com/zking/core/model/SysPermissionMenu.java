package com.zking.core.model;

public class SysPermissionMenu {
    private Long spmid;

    private Long spmspid;

    private Long spmsmid;

    public SysPermissionMenu(Long spmid, Long spmspid, Long spmsmid) {
        this.spmid = spmid;
        this.spmspid = spmspid;
        this.spmsmid = spmsmid;
    }

    public SysPermissionMenu() {
        super();
    }

    public Long getSpmid() {
        return spmid;
    }

    public void setSpmid(Long spmid) {
        this.spmid = spmid;
    }

    public Long getSpmspid() {
        return spmspid;
    }

    public void setSpmspid(Long spmspid) {
        this.spmspid = spmspid;
    }

    public Long getSpmsmid() {
        return spmsmid;
    }

    public void setSpmsmid(Long spmsmid) {
        this.spmsmid = spmsmid;
    }
}