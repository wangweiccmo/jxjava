package com.smartcampus.provider.db1.service;

import com.smartcampus.provider.db1.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleAuthService {
	@Autowired
	private UserMapper userMapper;

	@Transactional
	public String insert(String name, String pwd) {
		int st = userMapper.insert(name, pwd);

		return st+"";
	}


}
