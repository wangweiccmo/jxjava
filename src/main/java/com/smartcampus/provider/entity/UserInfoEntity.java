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
 * jx_user_info
 * 
 * @author bianj
 * @version 1.0.0 2018-12-21
 */

public class UserInfoEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3456469706239705977L;


    private Integer id;

    private Integer uid;

    private String uiName;

    private String uiNick;

    private String uiPhone;

    private Long uiAge;

    private String uiHeader;

    private String uiTag;

    private Integer uiLevel;

    private Integer uiPoint;

    private String uiSex;

    private String uiCity;

    private String uiAddress;

    private String uiSign;

    private Timestamp updateDate;

    private Timestamp createDate;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUiName() {
        return this.uiName;
    }

    public void setUiName(String uiName) {
        this.uiName = uiName;
    }

    public String getUiNick() {
        return this.uiNick;
    }

    public void setUiNick(String uiNick) {
        this.uiNick = uiNick;
    }

    public String getUiPhone() {
        return this.uiPhone;
    }

    public void setUiPhone(String uiPhone) {
        this.uiPhone = uiPhone;
    }

    public Long getUiAge() {
        return this.uiAge;
    }

    public void setUiAge(Long uiAge) {
        this.uiAge = uiAge;
    }

    public String getUiHeader() {
        return this.uiHeader;
    }

    public void setUiHeader(String uiHeader) {
        this.uiHeader = uiHeader;
    }

    public String getUiTag() {
        return this.uiTag;
    }

    public void setUiTag(String uiTag) {
        this.uiTag = uiTag;
    }

    public Integer getUiLevel() {
        return this.uiLevel;
    }

    public void setUiLevel(Integer uiLevel) {
        this.uiLevel = uiLevel;
    }

    public Integer getUiPoint() {
        return this.uiPoint;
    }

    public void setUiPoint(Integer uiPoint) {
        this.uiPoint = uiPoint;
    }

    public String getUiSex() {
        return this.uiSex;
    }

    public void setUiSex(String uiSex) {
        this.uiSex = uiSex;
    }

    public String getUiCity() {
        return this.uiCity;
    }

    public void setUiCity(String uiCity) {
        this.uiCity = uiCity;
    }

    public String getUiAddress() {
        return this.uiAddress;
    }

    public void setUiAddress(String uiAddress) {
        this.uiAddress = uiAddress;
    }

    public String getUiSign() {
        return this.uiSign;
    }

    public void setUiSign(String uiSign) {
        this.uiSign = uiSign;
    }

    public Timestamp getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    public Timestamp getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }
}