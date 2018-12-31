package com.smartcampus.provider.db1.dao;

import com.smartcampus.provider.entity.Auth;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@CacheConfig(cacheNames = "authCache")
public interface RoleAuthMapper {

    // 根据角色获取角色权限
	@Select("SELECT c.* FROM role a LEFT JOIN role_auth b ON a.id = b.role_id LEFT JOIN auth c ON b.auth_id = c.id \n" +
            "WHERE a.status = 1 AND c.status = 1 AND a.name = #{name}")
	@Cacheable
    public List<Auth> getAuthByRoleName(@Param("name") String name);

    // 根据角色获取系统权限
    @Select("SELECT c.* FROM role a LEFT JOIN sys_role_auth b ON a.id = b.role_id LEFT JOIN sys_auth c ON b.sys_auth_id = c.id \n" +
            "WHERE a.status = 1 AND c.status = 1 AND a.name = #{name}")
    @Cacheable
    public List<Auth> getSysAuthByRoleName(@Param("name") String name);
}
