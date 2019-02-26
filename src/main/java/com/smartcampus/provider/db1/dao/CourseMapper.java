package com.smartcampus.provider.db1.dao;

import com.smartcampus.provider.entity.CourseEntity;
import com.smartcampus.provider.entity.PageSearchEntity;
import com.smartcampus.provider.entity.StudentEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

public interface CourseMapper {
	@Select("SELECT * FROM jx_course WHERE id = #{id} limit 1")
	CourseEntity selectById(@Param("id") Integer id);

	@Select("SELECT * FROM jx_course WHERE code = #{code} limit 1")
	CourseEntity selectByCode(@Param("code") String code);

	@Select("SELECT * FROM jx_course WHERE name = #{name} limit 1")
	CourseEntity selectByName(@Param("name") String name);

	@Insert("INSERT INTO jx_course(code, name, es_name,type,point,time,open_unit,teachers,status,cover_url,books,info,exam_type,class_lv) " +
			"VALUES (#{code},#{name}, #{esName}, #{type}, #{point}, #{time}, #{openUnit}, #{teachers}, #{status}, #{coverUrl}, #{books}, #{info}, #{examType}, #{classLv})")
	@SelectKey(statement="SELECT LAST_INSERT_ID() as id", keyProperty="courseEntity.id", before=false, resultType=int.class)
	int insert(CourseEntity courseEntity);

	@Select("SELECT * FROM jx_course limit #{offSet},#{pageSize}")
	List<CourseEntity> selectByPage(PageSearchEntity pageSearchEntity);
}
