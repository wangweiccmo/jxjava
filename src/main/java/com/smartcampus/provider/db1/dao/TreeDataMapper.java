package com.smartcampus.provider.db1.dao;

import com.smartcampus.provider.entity.TreeEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface TreeDataMapper {
	@Select("SELECT * FROM jx_tree_data where bindId=#{bindId}")
	List<TreeEntity> selectAllByBindId(@Param("bindId") int bindId);


}
