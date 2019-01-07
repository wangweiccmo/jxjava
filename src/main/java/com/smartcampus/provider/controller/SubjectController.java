package com.smartcampus.provider.controller;

import com.smartcampus.provider.constant.RepCode;
import com.smartcampus.provider.db1.service.SubjectService;
import com.smartcampus.provider.db1.service.SysDictService;
import com.smartcampus.provider.entity.Rep;
import com.smartcampus.provider.entity.SubjectEntity;
import com.smartcampus.provider.entity.SysDictEntity;
import com.smartcampus.provider.entity.SysDictParams;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("/subject")
public class SubjectController {
	private static Logger logger = Logger.getLogger(SubjectController.class);

	@Autowired
	private SubjectService subjectService;


	@ResponseBody
	@RequestMapping("/selectAll")
	public Rep selectAll() {
		List<SubjectEntity> rootSubjects = subjectService.selectAll();
		return new Rep(RepCode.OK,rootSubjects);
	}



}
