package com.smartcampus.provider.controller;

import com.smartcampus.provider.constant.RepCode;
import com.smartcampus.provider.db1.service.StudentService;
import com.smartcampus.provider.db1.service.TeacherService;
import com.smartcampus.provider.entity.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("/stu")
public class StudentController {
	private static Logger logger = Logger.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;

	@ResponseBody
	@RequestMapping("/addBase")
	public Rep addBase(@RequestBody Map<String,Object> reqMap) {
		String name = reqMap.get("name").toString();
		String pwd = reqMap.get("pwd").toString();

		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setStuName(name);
		UserEntity userEntity = new UserEntity();
		userEntity.setName(name);
		userEntity.setPwd(pwd);
		userEntity.setRole("teacher");
		int status1 = studentService.insert(studentEntity,userEntity );
		return new Rep(RepCode.OK,status1);
	}

	@ResponseBody
	@RequestMapping("/getListByPage")
	public Rep getListByPage(@RequestBody Map<String,Object> reqMap) {
		String page = reqMap.get("page").toString();
		String pageSize = reqMap.get("pageSize").toString();
		System.out.println("firstRowIndex: " + page + ":" + pageSize);
		PageSearchEntity pageSearchEntity = new PageSearchEntity(page,pageSize);
		List<StudentEntity> st1 = studentService.selectByPage(pageSearchEntity);
		int st2 = studentService.count();
		pageSearchEntity.setTotal(st2);
		return new Rep(RepCode.OK,st1,pageSearchEntity);
	}


}
