package com.smartcampus.provider.entity;

import java.sql.Timestamp;

public class StudentEntity {

	private Integer id;
    private Integer uid;
	private String stuId;
	private String stuName;
	private String stuIdentityId;
	private String stuSex;
	private Timestamp stuEnrollmentDate;
	private String stuMajor;
	private String stuClass;
	private String stuSchoolingLength;
    private String stuAddress;
    private String stuNationality;
	private String stuStatus;
    private Timestamp createDate;
    private Timestamp updateDate;

    public Integer getId() {
        return id;
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

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuIdentityId() {
        return stuIdentityId;
    }

    public void setStuIdentityId(String stuIdentityId) {
        this.stuIdentityId = stuIdentityId;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public Timestamp getStuEnrollmentDate() {
        return stuEnrollmentDate;
    }

    public void setStuEnrollmentDate(Timestamp stuEnrollmentDate) {
        this.stuEnrollmentDate = stuEnrollmentDate;
    }

    public String getStuMajor() {
        return stuMajor;
    }

    public void setStuMajor(String stuMajor) {
        this.stuMajor = stuMajor;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public String getStuSchoolingLength() {
        return stuSchoolingLength;
    }

    public void setStuSchoolingLength(String stuSchoolingLength) {
        this.stuSchoolingLength = stuSchoolingLength;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public String getStuNationality() {
        return stuNationality;
    }

    public void setStuNationality(String stuNationality) {
        this.stuNationality = stuNationality;
    }

    public String getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }
}
