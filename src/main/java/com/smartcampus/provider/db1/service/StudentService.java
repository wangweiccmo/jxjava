package com.smartcampus.provider.db1.service;

import com.smartcampus.provider.db1.dao.StudentMapper;
import com.smartcampus.provider.db1.dao.UserMapper;
import com.smartcampus.provider.entity.PageSearchEntity;
import com.smartcampus.provider.entity.StudentEntity;
import com.smartcampus.provider.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private UserMapper userMapper;

	@Transactional
	public int insert(StudentEntity studentEntity, UserEntity userEntity) {
		userMapper.insertByEntity(userEntity);
		studentEntity.setUid(userEntity.getId());
		int st2 = studentMapper.insert(studentEntity);
		return st2;
	}

	public List<StudentEntity> selectByPage(PageSearchEntity pageSearchEntity) {
		List<StudentEntity>  st1 = studentMapper.selectByPage(pageSearchEntity);
		return st1;
	}

	public int count() {
		int st2 = studentMapper.count();
		return st2;
	}
}
