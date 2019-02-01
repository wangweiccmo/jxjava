package com.smartcampus.provider.controller;

import com.smartcampus.provider.constant.RepCode;
import com.smartcampus.provider.db1.service.TreeDataService;
import com.smartcampus.provider.db1.service.TreeService;
import com.smartcampus.provider.entity.Rep;
import com.smartcampus.provider.entity.TreeDataEntity;
import com.smartcampus.provider.entity.TreeEntity;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("/tree")
public class TreeController {
	private static Logger logger = Logger.getLogger(TreeController.class);

	@Autowired
	private TreeService treeService;
	@Autowired
	private TreeDataService treeDataService;

	@ResponseBody
	@RequestMapping("/addNode")
	public Rep addNode(@RequestBody TreeDataEntity treeDataEntity) {
		TreeDataEntity resData = treeDataService.addNode(treeDataEntity);
		return new Rep(RepCode.OK,resData);
	}

	@ResponseBody
	@RequestMapping("/upNode")
	public Rep upNode(@RequestBody TreeDataEntity treeDataEntity) {
		treeDataService.addNode(treeDataEntity);
		return new Rep(RepCode.OK);
	}

	@ResponseBody
	@RequestMapping("/delNode/{nodeId}")
	public Rep delNode(@PathVariable Integer nodeId) {
		System.out.println("nodeId:"+nodeId);
		treeDataService.delNode(nodeId);
		return new Rep(RepCode.OK);
	}



	@ResponseBody
	@RequestMapping("/bindId/{bindId}")
	public Rep getTree(@PathVariable Integer bindId) {
		List<TreeDataEntity> tree = treeDataService.selectTree(bindId);
		return new Rep(RepCode.OK,tree);
	}

	@ResponseBody
	@RequestMapping("/add")
	public Rep insert(@RequestBody TreeEntity treeEntity) {
		treeService.insert(treeEntity);
		return new Rep(RepCode.OK);
	}


	@ResponseBody
	@RequestMapping("/updateById")
	public Rep updateById(@RequestBody TreeEntity treeEntity) {
		treeService.updateById(treeEntity);
		return new Rep(RepCode.OK);
	}


	@ResponseBody
	@RequestMapping("/selectAll")
	public Rep selectAll() {
		List<TreeEntity> lt  = treeService.selectAll();
		return new Rep(RepCode.OK,lt);
	}


	@ResponseBody
	@RequestMapping("/selectById")
	public Rep selectById(@RequestBody Map<String,Object> reqMap) {
		String id = reqMap.get("id").toString();
		TreeEntity lt  = treeService.selectById(Integer.valueOf(id));
		return new Rep(RepCode.OK,lt);
	}

	@ResponseBody
	@RequestMapping("/selectByBindId")
	public Rep selectByBindId(@RequestBody Map<String,Object> reqMap) {
		String bindId = reqMap.get("bindId").toString();
		TreeEntity lt  = treeService.selectByBindId(Integer.valueOf(bindId));
		return new Rep(RepCode.OK,lt);
	}

}
