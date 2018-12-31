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
 * jx_tree_data
 * 
 * @author bianj
 * @version 1.0.0 2018-12-21
 */

public class TreeDataEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1006068248639612268L;


    private Integer id;

    private String treeName;

    private String treeContext;

    private Timestamp createDate;

    private Timestamp updateDate;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTreeName() {
        return this.treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public String getTreeContext() {
        return this.treeContext;
    }

    public void setTreeContext(String treeContext) {
        this.treeContext = treeContext;
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
}