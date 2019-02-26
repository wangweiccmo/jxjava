package com.smartcampus.provider.controller;

import com.smartcampus.provider.constant.RepCode;
import com.smartcampus.provider.db1.service.CourseService;
import com.smartcampus.provider.db1.service.StudentService;
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
@RequestMapping("/course")
public class CourseController {
	private static Logger logger = Logger.getLogger(CourseController.class);

	@Autowired
	private CourseService courseService;

	@ResponseBody
	@RequestMapping("/selectById")
	public Rep selectById(@RequestBody Map<String,Object> reqMap) {
		Integer id = Integer.valueOf(reqMap.get("id").toString());
		CourseEntity courseEntity = courseService.selectById(id);
		return new Rep(RepCode.OK,courseEntity);
	}

	@ResponseBody
	@RequestMapping("/selectByCode")
	public Rep selectByCode(@RequestBody Map<String,Object> reqMap) {
		String code = reqMap.get("code").toString();
		CourseEntity courseEntity = courseService.selectByCode(code);
		return new Rep(RepCode.OK,courseEntity);
	}

	@ResponseBody
	@RequestMapping("/selectByName")
	public Rep selectByName(@RequestBody Map<String,Object> reqMap) {
		String name = reqMap.get("name").toString();
		CourseEntity courseEntity = courseService.selectByName(name);
		return new Rep(RepCode.OK,courseEntity);
	}

	@ResponseBody
	@RequestMapping("/insert")
	public Rep selectByPage(@RequestBody CourseEntity courseEntity) {
		int i = courseService.insert(courseEntity);
		return new Rep(RepCode.OK,i);
	}

	@ResponseBody
	@RequestMapping("/selectByPage")
	public Rep selectByPage(@RequestBody Map<String,Object> reqMap){
		String page = reqMap.get("page").toString();
		String pageSize = reqMap.get("pageSize").toString();
		System.out.println("firstRowIndex: " + page + ":" + pageSize);
		PageSearchEntity pageSearchEntity = new PageSearchEntity(page,pageSize);
		List<CourseEntity> courseEntitys = courseService.selectByPage(pageSearchEntity);
		return new Rep(RepCode.OK,courseEntitys);
	}
}
