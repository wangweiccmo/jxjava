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
 * jx_user
 * 
 * @author bianj
 * @version 1.0.0 2018-12-21
 */

public class SysDictParams implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 3174299263363584743L;


    private String[] types;

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }
}