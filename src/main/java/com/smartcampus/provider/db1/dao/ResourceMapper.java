package com.smartcampus.provider.db1.dao;

import com.smartcampus.provider.entity.PageSearchEntity;
import com.smartcampus.provider.entity.ResourceEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

public interface ResourceMapper {
	@Select("SELECT * FROM jx_resource limit #{offSet},#{pageSize}")
	List<ResourceEntity> selectByPage(PageSearchEntity pageSearchEntity);

	@Insert("INSERT INTO jx_resource(title, resource_type,resource_standard,subject_code,subject_map,map_id,map,bind_id,stick,info,allow_download,create_uid) " +
			"VALUES(#{title}, #{resourceType}, #{resourceStandard}, #{subjectCode}, #{subjectMap}, #{mapId}, #{map}, #{bindId}, #{stick}, #{info}, #{allowDownload}, #{createUid})")
	@SelectKey(statement="SELECT LAST_INSERT_ID() as id", keyProperty="id", before=false, resultType=int.class)
	void   insertByEntity( ResourceEntity resourceEntity);

	@Select("SELECT COUNT(*) FROM jx_resource")
	int count();

}
