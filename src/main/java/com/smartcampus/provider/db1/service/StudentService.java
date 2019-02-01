package com.smartcampus.provider.db1.service;

import com.smartcampus.provider.constant.RepCode;
import com.smartcampus.provider.db1.dao.StudentMapper;
import com.smartcampus.provider.db1.dao.UserMapper;
import com.smartcampus.provider.entity.PageSearchEntity;
import com.smartcampus.provider.entity.Rep;
import com.smartcampus.provider.entity.StudentEntity;
import com.smartcampus.provider.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

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

	public int delById(Integer id) {
		int st2 = studentMapper.delById(id);
		return st2;
	}

	@ResponseBody
	@RequestMapping("/delById")
	public Rep delById(@RequestBody Map<String,Object> reqMap) {
		Integer id = Integer.valueOf(reqMap.get("id").toString());
		int status1 = studentMapper.delById(id);
		return new Rep(RepCode.OK,status1);
	}
}
