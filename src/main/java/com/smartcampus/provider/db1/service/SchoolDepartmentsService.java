package com.smartcampus.provider.db1.service;

import com.smartcampus.provider.db1.dao.SchoolDepartmentsMapper;
import com.smartcampus.provider.entity.SchoolDepartmentsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolDepartmentsService {

	@Autowired
	private SchoolDepartmentsMapper schoolDepartmentsMapper;

	public List<SchoolDepartmentsEntity> getALl() {
		return  schoolDepartmentsMapper.getALl();
	}
}
