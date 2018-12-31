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
 * msg
 * 
 * @author bianj
 * @version 1.0.0 2018-12-21
 */

public class MsgEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = -7690004042702372367L;


    private Integer id;

    private String msgTitle;

    private String msgContent;

    private Integer msgRemind;

    private Timestamp msgTiming;

    private Integer msgSend;

    private Timestamp msgSendDate;

    private Integer createUid;

    private Timestamp createDate;

    private Integer updateUid;

    private Timestamp updateDate;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsgTitle() {
        return this.msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public String getMsgContent() {
        return this.msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public Integer getMsgRemind() {
        return this.msgRemind;
    }

    public void setMsgRemind(Integer msgRemind) {
        this.msgRemind = msgRemind;
    }

    public Timestamp getMsgTiming() {
        return this.msgTiming;
    }

    public void setMsgTiming(Timestamp msgTiming) {
        this.msgTiming = msgTiming;
    }

    public Integer getMsgSend() {
        return this.msgSend;
    }

    public void setMsgSend(Integer msgSend) {
        this.msgSend = msgSend;
    }

    public Timestamp getMsgSendDate() {
        return this.msgSendDate;
    }

    public void setMsgSendDate(Timestamp msgSendDate) {
        this.msgSendDate = msgSendDate;
    }

    public Integer getCreateUid() {
        return this.createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    public Timestamp getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Integer getUpdateUid() {
        return this.updateUid;
    }

    public void setUpdateUid(Integer updateUid) {
        this.updateUid = updateUid;
    }

    public Timestamp getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }
}