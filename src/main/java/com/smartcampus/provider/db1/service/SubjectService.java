package com.smartcampus.provider.db1.service;

import com.smartcampus.provider.db1.dao.SubjectMapper;
import com.smartcampus.provider.db1.dao.SysDictMapper;
import com.smartcampus.provider.entity.SubjectEntity;
import com.smartcampus.provider.entity.SysDictEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SubjectService {

	@Autowired
	private SubjectMapper subjectMapper;




	public List<SubjectEntity> selectAll() {

		// 获取根节点
		List<SubjectEntity> rootSubjects = subjectMapper.selectByPid(0);

		// 补充子节点
		for(int i = 0;i<rootSubjects.size();i++){
			SubjectEntity subject = rootSubjects.get(i);
			List<SubjectEntity> ls = subjectMapper.selectByPid(subject.getId());
			subject.setChildren(ls);
		}
		return rootSubjects;
	}
}
