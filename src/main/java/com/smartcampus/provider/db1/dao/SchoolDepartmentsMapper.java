package com.smartcampus.provider.db1.dao;

import com.smartcampus.provider.entity.SchoolDepartmentsEntity;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SchoolDepartmentsMapper {
	@Select("SELECT * FROM school_departments")
	List<SchoolDepartmentsEntity> getALl();

}
