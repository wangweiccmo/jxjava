package com.smartcampus.provider.db1.dao;

import com.smartcampus.provider.entity.TreeEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TreeMapper {
	@Select("SELECT * FROM jx_tree")
	List<TreeEntity> selectAll();

	@Select("SELECT * FROM jx_tree WHERE id = #{id}  limit 1")
	TreeEntity selectById(@Param("id") int id);

	@Select("SELECT * FROM jx_tree WHERE bind_id = #{bindId}  limit 1")
	TreeEntity selectByBindId(@Param("bindId") int bindId);

	@Insert("INSERT INTO jx_tree(bind_id, name,info,map) VALUES(#{treeEntity.bindId}, #{treeEntity.name}, #{treeEntity.info}, #{treeEntity.map})")
	void insert(@Param("treeEntity") TreeEntity treeEntity);

	@Update("UPDATE jx_tree SET bind_id =  #{treeEntity.bindId} , info = #{treeEntity.info}, name = #{treeEntity.name}, map = #{treeEntity.map} where " +
			" id = #{treeEntity.id}")
	void updateById(@Param("treeEntity") TreeEntity treeEntity);
}
