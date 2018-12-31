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
 * jx_auth
 * 
 * @author bianj
 * @version 1.0.0 2018-12-21
 */

public class AuthEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 6364532001149288831L;

    private Integer id;

    private String authAbbreviate;

    private String authName;

    private String authInfo;

    private Integer authStatus;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthAbbreviate() {
        return this.authAbbreviate;
    }

    public void setAuthAbbreviate(String authAbbreviate) {
        this.authAbbreviate = authAbbreviate;
    }

    public String getAuthName() {
        return this.authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getAuthInfo() {
        return this.authInfo;
    }

    public void setAuthInfo(String authInfo) {
        this.authInfo = authInfo;
    }

    public Integer getAuthStatus() {
        return this.authStatus;
    }

    public void setAuthStatus(Integer authStatus) {
        this.authStatus = authStatus;
    }
}