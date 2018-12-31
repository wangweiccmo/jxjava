package com.smartcampus.provider.db2.service;


import com.smartcampus.provider.db2.dao.UserMapperTest02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceTest02 {
	@Autowired
	private UserMapperTest02 userMapperTest02;

	@Transactional
	public String insertTest002(String name, Integer age) {
		userMapperTest02.insert(name, age);
		int i =1/0;
		return "success";
	}

}
