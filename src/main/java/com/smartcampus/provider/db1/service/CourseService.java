package com.smartcampus.provider.db1.service;

import com.smartcampus.provider.db1.dao.CourseMapper;
import com.smartcampus.provider.entity.CourseEntity;
import com.smartcampus.provider.entity.PageSearchEntity;
import com.smartcampus.provider.entity.ResourceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseService {
	@Autowired
	private CourseMapper courseMapper;

	@Transactional
	public int insert(CourseEntity courseEntity) {
		return courseMapper.insert(courseEntity);
	}

	@Transactional
	public int updateById(CourseEntity courseEntity) {
		return courseMapper.updateById(courseEntity);
	}
	
	public CourseEntity selectById(Integer id) {
		CourseEntity courseEntity = courseMapper.selectById(id);
		return courseEntity;
	}

	public Integer delById(Integer id) {
		int i = courseMapper.delById(id);
		return i;
	}



	public CourseEntity selectByCode(String code) {
		CourseEntity courseEntity = courseMapper.selectByCode(code);
		return courseEntity;
	}

	public CourseEntity selectByName(String name) {
		CourseEntity courseEntity = courseMapper.selectByName(name);
		return courseEntity;
	}

	public List<CourseEntity> selectByPage(PageSearchEntity pageSearchEntity) {
		List<CourseEntity>  courseEntitys = courseMapper.selectByPage(pageSearchEntity);
		return courseEntitys;
	}


}
