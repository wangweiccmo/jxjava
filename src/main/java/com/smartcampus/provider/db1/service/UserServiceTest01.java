package com.smartcampus.provider.db1.service;

import com.smartcampus.provider.db2.dao.UserMapperTest02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartcampus.provider.db1.dao.UserMapperTest01;

@Service
public class UserServiceTest01 {
	@Autowired
	private UserMapperTest01 userMapperTest01;

	@Autowired
	private UserMapperTest02 userMapperTest02;

	@Transactional
	public String insertTest001(String name, Integer age) {
		userMapperTest01.insert(name, age);
		userMapperTest02.insert(name, age);
//		int i = 1 / 0;
		return "success";
	}


}
