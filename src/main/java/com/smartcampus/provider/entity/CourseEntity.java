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
 * jx_exam
 * 
 * @author bianj
 * @version 1.0.0 2018-12-21
 */

public class CourseEntity implements java.io.Serializable {
    /** 版本号 */
    private static final long serialVersionUID = 8114592410257124675L;

    private Integer id;
    private String code;
    private String name;
    private String esName;
    private Integer type;
    private Integer point;
    private Integer time;
    private String openUnit;
    private String teachers;
    private Integer status;
    private String coverUrl;
    private String books;
    private String info;
    private Integer examType;
    private String classLv;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEsName() {
        return esName;
    }

    public void setEsName(String esName) {
        this.esName = esName;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getOpenUnit() {
        return openUnit;
    }

    public void setOpenUnit(String openUnit) {
        this.openUnit = openUnit;
    }

    public String getTeachers() {
        return teachers;
    }

    public void setTeachers(String teachers) {
        this.teachers = teachers;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getExamType() {
        return examType;
    }

    public void setExamType(Integer examType) {
        this.examType = examType;
    }

    public String getClassLv() {
        return classLv;
    }

    public void setClassLv(String classLv) {
        this.classLv = classLv;
    }
}