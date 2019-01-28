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
import java.util.List;


/**
 * jx_tree_data
 * 
 * @author bianj
 * @version 1.0.0 2018-12-21
 */

public class TreeDataEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 1116068248639612268L;


    private Integer id;

    private Integer bindId;

    private String pmap;

    private Integer deep;

    private String label;

    private Integer pid;

    private Integer hasCld;

    private List<TreeDataEntity> children;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBindId() {
        return bindId;
    }

    public void setBindId(Integer bindId) {
        this.bindId = bindId;
    }

    public String getPmap() {
        return pmap;
    }

    public void setPmap(String pmap) {
        this.pmap = pmap;
    }

    public Integer getDeep() {
        return deep;
    }

    public void setDeep(Integer deep) {
        this.deep = deep;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getHasCld() {
        return hasCld;
    }

    public void setHasCld(Integer hasCld) {
        this.hasCld = hasCld;
    }

    public List<TreeDataEntity> getChildren() {
        return children;
    }

    public void setChildren(List<TreeDataEntity> children) {
        this.children = children;
    }
}