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

import java.sql.Timestamp;

/**
 * jx_teacher
 *
 * @author bianj
 * @version 1.0.0 2018-12-21
 */

public class TeacherEntity implements java.io.Serializable {
    /**
     * 版本号
     */
    private static final long serialVersionUID = -2193085480498440293L;


    private Integer id;

    private Integer uid;


    private Integer sdId; // 任职部门
    private String teaStaffNumber;

    private String teaName;

    private String teaTel;
    private String teaTelShot;
    private String teaEmail;
    private Integer teaSex;


    private String teaIdNumber;

    private Integer teaStatus;

    private Integer teaIsTemporaryEmployee;

    private Integer teaIsPartTimer;

    private Timestamp createDate;

    private Timestamp updateDate;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTeaStaffNumber() {
        return this.teaStaffNumber;
    }

    public void setTeaStaffNumber(String teaStaffNumber) {
        this.teaStaffNumber = teaStaffNumber;
    }

    public String getTeaName() {
        return this.teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaTel() {
        return this.teaTel;
    }

    public void setTeaTel(String teaTel) {
        this.teaTel = teaTel;
    }

    public Integer getTeaSex() {
        return this.teaSex;
    }

    public void setTeaSex(Integer teaSex) {
        this.teaSex = teaSex;
    }

    public String getTeaIdNumber() {
        return this.teaIdNumber;
    }

    public void setTeaIdNumber(String teaIdNumber) {
        this.teaIdNumber = teaIdNumber;
    }

    public Integer getTeaStatus() {
        return this.teaStatus;
    }

    public void setTeaStatus(Integer teaStatus) {
        this.teaStatus = teaStatus;
    }

    public Integer getTeaIsTemporaryEmployee() {
        return this.teaIsTemporaryEmployee;
    }

    public void setTeaIsTemporaryEmployee(Integer teaIsTemporaryEmployee) {
        this.teaIsTemporaryEmployee = teaIsTemporaryEmployee;
    }

    public Integer getTeaIsPartTimer() {
        return this.teaIsPartTimer;
    }

    public void setTeaIsPartTimer(Integer teaIsPartTimer) {
        this.teaIsPartTimer = teaIsPartTimer;
    }

    public Timestamp getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public String getTeaTelShot() {
        return teaTelShot;
    }

    public void setTeaTelShot(String teaTelShot) {
        this.teaTelShot = teaTelShot;
    }

    public String getTeaEmail() {
        return teaEmail;
    }

    public void setTeaEmail(String teaEmail) {
        this.teaEmail = teaEmail;
    }

    public Integer getSdId() {
        return sdId;
    }

    public void setSdId(Integer sdId) {
        this.sdId = sdId;
    }
}