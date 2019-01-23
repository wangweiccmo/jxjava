package com.smartcampus.provider.db1.dao;

import com.smartcampus.provider.entity.TreeDataEntity;
import com.smartcampus.provider.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

public interface TreeDataMapper {
	@Select("SELECT * FROM jx_tree_data where bind_id=#{bindId} and deep = 0")
	List<TreeDataEntity> selectRoot(@Param("bindId") int bindId);

	@Select("SELECT * FROM jx_tree_data where pid=#{pid}")
	List<TreeDataEntity> selectNodes(@Param("pid") int pid );

	@Insert("INSERT INTO jx_tree_data(bind_id, pmap,deep,label,pid,has_cld) " +
			"VALUES(#{tde.bindId}, #{tde.pmap}, #{tde.deep}, #{tde.label}, #{tde.pid}, #{tde.hasCld})")
	@SelectKey(statement="SELECT LAST_INSERT_ID() as id", keyProperty="tde.id", before=false, resultType=int.class)
	int addnode(@Param("tde") TreeDataEntity treeDataEntity);
}
