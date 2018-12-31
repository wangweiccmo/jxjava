package com.smartcampus.provider.db1.dao;

import com.smartcampus.provider.entity.TeacherEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {


	@Insert("INSERT INTO jx_teacher(uid, sd_id, tea_id_number,tea_tel,tea_tel_shot,tea_email) VALUES(#{uid},#{sdId}, #{teaIdNumber}, #{teaTel}, #{teaTelShot}, #{teaEmail})")
	int insertBase(TeacherEntity teacherEntity);

}
