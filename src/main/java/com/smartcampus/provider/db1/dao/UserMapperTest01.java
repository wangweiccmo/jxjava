package com.smartcampus.provider.db1.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import com.smartcampus.provider.entity.User;

@CacheConfig(cacheNames = "baseCache")
public interface UserMapperTest01 {
	@Select("SELECT * FROM USERS WHERE NAME = #{name}")
	@Cacheable
	User findByName(@Param("name") String name);

	@Insert("INSERT INTO USERS(NAME, AGE) VALUES(#{name}, #{age})")
	int insert(@Param("name") String name, @Param("age") Integer age);
}
