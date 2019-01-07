package com.smartcampus.provider.controller;

import com.smartcampus.provider.constant.RepCode;
import com.smartcampus.provider.db1.service.SysDictService;
import com.smartcampus.provider.entity.Rep;
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
@RequestMapping("/dict")
public class SysDictController {
	private static Logger logger = Logger.getLogger(SysDictController.class);

	@Autowired
	private SysDictService sysDictService;

	@ResponseBody
	@RequestMapping("/add")
	public Rep insert(@RequestBody SysDictEntity sysDictEntity) {
		sysDictService.insert(sysDictEntity);
		return new Rep(RepCode.OK);
	}
	@ResponseBody
	@RequestMapping("/selectByType")
	public Rep selectByType(@RequestBody Map<String,Object> reqMap) {
		String type = reqMap.get("type").toString();
		List<SysDictEntity> ls = sysDictService.selectByType(type);
		return new Rep(RepCode.OK,ls);
	}

	@ResponseBody
	@PostMapping("/selectByTypes")
	public Rep selectByTypes(@RequestBody SysDictParams sysDictParams) {
		System.out.println("参数：ids：");
		String[] types = sysDictParams.getTypes();
		logger.info("insert:" +types.toString());
		Map<String,Object> map = sysDictService.selectByTypes(types);
		return new Rep(RepCode.OK,map);
	}

}
