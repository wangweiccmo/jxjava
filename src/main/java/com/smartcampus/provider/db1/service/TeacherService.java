package com.smartcampus.provider.db1.service;

import com.smartcampus.provider.db1.dao.TeacherMapper;
import com.smartcampus.provider.db1.dao.UserMapper;
import com.smartcampus.provider.entity.PageSearchEntity;
import com.smartcampus.provider.entity.StudentEntity;
import com.smartcampus.provider.entity.TeacherEntity;
import com.smartcampus.provider.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TeacherService {
	@Autowired
	private TeacherMapper teacherMapper;
	@Autowired
	private UserMapper userMapper;
	@Transactional
	public int insertBase(TeacherEntity teacherEntity, UserEntity userEntity) {
		userMapper.insertByEntity(userEntity);
		teacherEntity.setUid(userEntity.getId());
		int st2 = teacherMapper.insertBase(teacherEntity);
		return st2;
	}
	public List<TeacherEntity> selectByPage(PageSearchEntity pageSearchEntity) {
		List<TeacherEntity>  st1 = teacherMapper.selectByPage(pageSearchEntity);
		return st1;
	}

	public int count() {
		int st2 = teacherMapper.count();
		return st2;
	}

	public int delById(Integer id) {
		int st2 = teacherMapper.delById(id);
		return st2;
	}
}
