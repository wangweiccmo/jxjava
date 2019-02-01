package com.smartcampus.provider.db1.dao;

import com.smartcampus.provider.entity.PageSearchEntity;
import com.smartcampus.provider.entity.StudentEntity;
import com.smartcampus.provider.entity.TeacherEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {


	@Insert("INSERT INTO jx_teacher(uid, sd_id, tea_id_number,tea_tel,tea_tel_shot,tea_email) VALUES(#{uid},#{sdId}, #{teaIdNumber}, #{teaTel}, #{teaTelShot}, #{teaEmail})")
	int insertBase(TeacherEntity teacherEntity);

	@Select("SELECT * FROM jx_teacher limit #{offSet},#{pageSize}")
	List<TeacherEntity> selectByPage(PageSearchEntity pageSearchEntity);

	@Select("SELECT COUNT(*) FROM jx_teacher")
	int count();

	@Delete("DELETE from jx_teacher where id=#{id}" )
	int delById(@Param("id") Integer id);
}
