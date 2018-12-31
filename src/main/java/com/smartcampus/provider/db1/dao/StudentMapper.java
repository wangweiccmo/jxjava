package com.smartcampus.provider.db1.dao;

import com.smartcampus.provider.entity.PageSearchEntity;
import com.smartcampus.provider.entity.StudentEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {


	@Insert("INSERT INTO jx_student(uid, stu_id, stu_name,stu_identity_id,stu_sex,stu_enrollment_date,stu_major,stu_class,stu_schooling_length,stu_address,stu_nationality,stu_status) " +
			"VALUES (#{uid},#{stuId}, #{stuName}, #{stuIdentityId}, #{stuSex}, #{stuEnrollmentDate}, #{stuMajor}, #{stuClass}, #{stuSchoolingLength}, #{stuAddress}, #{stuNationality}, #{stuStatus})")
	int insert(StudentEntity studentEntity);


	@Select("SELECT * FROM jx_student limit #{offSet},#{pageSize}")
	List<StudentEntity> selectByPage(PageSearchEntity pageSearchEntity);

	@Select("SELECT COUNT(*) FROM jx_student")
	int count();

}
