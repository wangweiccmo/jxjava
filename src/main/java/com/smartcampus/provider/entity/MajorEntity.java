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
 * jx_user
 * 
 * @author bianj
 * @version 1.0.0 2018-12-21
 */

public class MajorEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3174229262263584748L;


    private Integer id;

    private String name;
    private String code;
    private String parantId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParantId() {
        return parantId;
    }

    public void setParantId(String parantId) {
        this.parantId = parantId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}