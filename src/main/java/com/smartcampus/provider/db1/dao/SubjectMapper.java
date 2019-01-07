package com.smartcampus.provider.db1.dao;

import com.smartcampus.provider.entity.SubjectEntity;
import com.smartcampus.provider.entity.SysDictEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

@CacheConfig(cacheNames = "baseCache")
public interface SubjectMapper {

	@Select("SELECT * FROM jx_subject WHERE p_id = #{pid} and is_del = 0")
	List<SubjectEntity> selectByPid(@Param("pid") int pid);


}
