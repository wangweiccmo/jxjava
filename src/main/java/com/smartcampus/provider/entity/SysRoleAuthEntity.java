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
 * sys_role_auth
 * 
 * @author bianj
 * @version 1.0.0 2018-12-21
 */

public class SysRoleAuthEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7672303964200600444L;

    private Integer id;

    private Integer roleId;

    private Integer sysAuthId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getSysAuthId() {
        return this.sysAuthId;
    }

    public void setSysAuthId(Integer sysAuthId) {
        this.sysAuthId = sysAuthId;
    }
}