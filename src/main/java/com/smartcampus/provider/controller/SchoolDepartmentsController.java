package com.smartcampus.provider.controller;

import com.smartcampus.provider.constant.RepCode;
import com.smartcampus.provider.db1.service.SchoolDepartmentsService;
import com.smartcampus.provider.db1.service.UserService;
import com.smartcampus.provider.entity.Rep;
import com.smartcampus.provider.entity.SchoolDepartmentsEntity;
import com.smartcampus.provider.entity.UserEntity;
import com.smartcampus.provider.utils.JwtHelper;
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
@RequestMapping("/departments")
public class SchoolDepartmentsController {
	private static Logger logger = Logger.getLogger(SchoolDepartmentsController.class);

	@Autowired
	private SchoolDepartmentsService schoolDepartmentsService;

	@ResponseBody
	@RequestMapping("/all")
	public Rep all() {
		List<SchoolDepartmentsEntity> list = schoolDepartmentsService.getALl();
		return new Rep(RepCode.OK,list);
	}
}
