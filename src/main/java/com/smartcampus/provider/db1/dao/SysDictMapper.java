package com.smartcampus.provider.db1.dao;

import com.smartcampus.provider.entity.SysDictEntity;
import com.smartcampus.provider.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

@CacheConfig(cacheNames = "baseCache")
public interface SysDictMapper {
	@Select("SELECT * FROM sys_dict WHERE dict_type in ( #{dictTypes} ) and del_flag = 0")
	List<SysDictEntity> selectByTypes(@Param("dictTypes") String dictTypes);


	@Select("SELECT * FROM sys_dict WHERE dict_type = #{dictType} and del_flag = 0")
	List<SysDictEntity> selectByType(@Param("dictType") String dictType);

	@Insert("INSERT INTO sys_dict(dict_type, dict_key,dict_value,sort,create_uid,update_uid,remark )" +
			" VALUES(#{sysDictEntity.dictType}, #{sysDictEntity.dictKey}, #{sysDictEntity.sort}, #{sysDictEntity.createUid}, #{sysDictEntity.updateUid}, #{sysDictEntity.remark})")
	void insert(@Param("sysDictEntity") SysDictEntity sysDictEntity);
}
