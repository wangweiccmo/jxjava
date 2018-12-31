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
 * msg_by_user
 * 
 * @author bianj
 * @version 1.0.0 2018-12-21
 */

public class MsgByUserEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 8065977107072388075L;


    private Integer id;

    private Integer msgId;

    private Integer uid;

    private Integer mbuIsRead;

    private Timestamp mbuReadDate;

    private Timestamp mbuSendDate;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMsgId() {
        return this.msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getMbuIsRead() {
        return this.mbuIsRead;
    }

    public void setMbuIsRead(Integer mbuIsRead) {
        this.mbuIsRead = mbuIsRead;
    }

    public Timestamp getMbuReadDate() {
        return this.mbuReadDate;
    }

    public void setMbuReadDate(Timestamp mbuReadDate) {
        this.mbuReadDate = mbuReadDate;
    }

    public Timestamp getMbuSendDate() {
        return this.mbuSendDate;
    }

    public void setMbuSendDate(Timestamp mbuSendDate) {
        this.mbuSendDate = mbuSendDate;
    }
}