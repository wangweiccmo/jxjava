package com.smartcampus.provider.controller;

import com.smartcampus.provider.constant.RepCode;
import com.smartcampus.provider.db1.service.SchoolDepartmentsService;
import com.smartcampus.provider.db1.service.TeacherService;
import com.smartcampus.provider.db1.service.UserService;
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
@RequestMapping("/teacher")
public class TeacherController {
	private static Logger logger = Logger.getLogger(TeacherController.class);

	@Autowired
	private TeacherService teacherService;

	@ResponseBody
	@RequestMapping("/addBase")
	public Rep addBase(@RequestBody Map<String,Object> reqMap) {
		Integer sdId = Integer.valueOf(reqMap.get("sdId").toString());
		String name = reqMap.get("name").toString();
		String pwd = reqMap.get("pwd").toString();
		String teaIdNumber = reqMap.get("teaIdNumber").toString();
		String teaTel = reqMap.get("teaTel").toString();
		String teaTelShot = reqMap.get("teaTelShot").toString();
		String teaEmail = reqMap.get("teaEmail").toString();
		TeacherEntity teacherEntity = new TeacherEntity();
		teacherEntity.setSdId(sdId);
		teacherEntity.setTeaIdNumber(teaIdNumber);
		teacherEntity.setTeaTel(teaTel);
		teacherEntity.setTeaTelShot(teaTelShot);
		teacherEntity.setTeaEmail(teaEmail);
		UserEntity userEntity = new UserEntity();
		userEntity.setName(name);
		userEntity.setPwd(pwd);
		userEntity.setRole("teacher");
		int status1 = teacherService.insertBase(teacherEntity,userEntity );
		return new Rep(RepCode.OK,status1);
	}

	@ResponseBody
	@RequestMapping("/getListByPage")
	public Rep getListByPage(@RequestBody Map<String,Object> reqMap) {
		String page = reqMap.get("page").toString();
		String pageSize = reqMap.get("pageSize").toString();
		System.out.println("firstRowIndex: " + page + ":" + pageSize);
		PageSearchEntity pageSearchEntity = new PageSearchEntity(page,pageSize);
		List<TeacherEntity> st1 = teacherService.selectByPage(pageSearchEntity);
		int st2 = teacherService.count();
		pageSearchEntity.setTotal(st2);
		return new Rep(RepCode.OK,st1,pageSearchEntity);
	}

	@ResponseBody
	@RequestMapping("/delById")
	public Rep delById(@RequestBody Map<String,Object> reqMap) {
		Integer id = Integer.valueOf(reqMap.get("id").toString());
		int status1 = teacherService.delById(id);
		return new Rep(RepCode.OK,status1);
	}
}
