package com.smartcampus.provider.db1.service;

import com.smartcampus.provider.db1.dao.UserMapper;
import com.smartcampus.provider.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	@Transactional
	public String insert(String name, String pwd) {
		int st = userMapper.insert(name, pwd);
		return st+"";
	}

	public UserEntity selectByNameAndPwd(String name, String pwd) {
		return  userMapper.selectByNameAndPwd(name,pwd);
	}

	public UserEntity selectByName(String name) {
		return  userMapper.selectByName(name);
	}
}
