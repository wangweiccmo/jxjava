package com.smartcampus.provider.db1.dao;

import com.smartcampus.provider.entity.UserEntity;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;

public interface UserMapper {
	@Select("SELECT * FROM jx_user WHERE NAME = #{name}  limit 1")
	UserEntity selectByName(@Param("name") String name);

	@Select("SELECT * FROM jx_user WHERE NAME = #{name} and pwd = #{pwd}  limit 1")
	UserEntity selectByNameAndPwd(@Param("name") String name,@Param("pwd") String pwd);

	@Insert("INSERT INTO jx_user(name, pwd) VALUES(#{name}, #{pwd})")
	int insert(@Param("name") String name, @Param("pwd") String pwd);

	// 获取下一个自增序列
	//select AUTO_INCREMENT FROM information_schema.TABLES WHERE  TABLE_NAME = 'jx_user';

	@Insert("INSERT INTO jx_user(name, pwd,role) VALUES(#{userEntity.name}, #{userEntity.pwd}, #{userEntity.role})")
	@SelectKey(statement="SELECT LAST_INSERT_ID() as id", keyProperty="userEntity.id", before=false, resultType=int.class)
	void   insertByEntity(@Param("userEntity") UserEntity userEntity);
}
