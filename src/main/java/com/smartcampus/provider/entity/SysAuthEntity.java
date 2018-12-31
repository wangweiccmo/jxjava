/*
 * Welcome to use the TableGo Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:5.8.8
 */

package com.smartcampus.provider.entity;



/**
 * sys_auth
 * 
 * @author bianj
 * @version 1.0.0 2018-12-21
 */

public class SysAuthEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1964749494263684362L;

    private Integer id;

    private String sysAbbreviate;

    private String sysName;

    private String sysInfo;

    private Integer sysStatus;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSysAbbreviate() {
        return this.sysAbbreviate;
    }

    public void setSysAbbreviate(String sysAbbreviate) {
        this.sysAbbreviate = sysAbbreviate;
    }

    public String getSysName() {
        return this.sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getSysInfo() {
        return this.sysInfo;
    }

    public void setSysInfo(String sysInfo) {
        this.sysInfo = sysInfo;
    }

    public Integer getSysStatus() {
        return this.sysStatus;
    }

    public void setSysStatus(Integer sysStatus) {
        this.sysStatus = sysStatus;
    }
}