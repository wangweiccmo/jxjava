package com.smartcampus.provider.controller;

import com.smartcampus.provider.constant.RepCode;
import com.smartcampus.provider.constant.StatusCode;
import com.smartcampus.provider.db1.service.UserService;
import com.smartcampus.provider.entity.Rep;
import com.smartcampus.provider.entity.UserEntity;
import com.smartcampus.provider.utils.JwtHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("/user")
public class UserController {
	private static Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;


	@ResponseBody
	@RequestMapping("/login")
	public Rep login(@RequestBody Map<String,Object> reqMap) {
		String name = reqMap.get("name").toString();
		String pwd = reqMap.get("pwd").toString();
		logger.info("#####################请求开始####################");
		logger.info(name);
		logger.info(pwd);
		UserEntity userEntity = userService.selectByNameAndPwd(name,pwd);
		if(userEntity != null){
			switch (userEntity.getStatus()){
				case StatusCode.FREEZE:
					// 账号被冻结
					return new Rep(RepCode.NG_LOGIN_FREEZE);
				case StatusCode.FAIL:
					// 审核失败
					return new Rep(RepCode.NG_AUDITING_FAIL);
				case StatusCode.WAIT:
					// 等待审核
					return new Rep(RepCode.NG_AUDITING_WAIT);
				default:
					String token = JwtHelper.getTokenByUserEntity(userEntity);
					userEntity.setPwd("");
					userEntity.setToken(token);
					return new Rep(RepCode.OK,userEntity);
			}


		}else{
			return new Rep(RepCode.NG_LOGIN_ERROR);
		}

	}

	@ResponseBody
	@RequestMapping("/add")
	public String insert(@RequestBody Map<String,Object> reqMap) {
		String name = reqMap.get("name").toString();
		String pwd = reqMap.get("pwd").toString();

		logger.info("insert:" + name+":"+pwd+"...");
		String body = userService.insert(name, pwd);
		return body;
	}

	@ResponseBody
	@RequestMapping("/getUserByName")
	public Rep getUserByName(@RequestBody Map<String,Object> reqMap) {
		String name = reqMap.get("name").toString();

		logger.info("selectByName:" + name);
		UserEntity userEntity = userService.selectByName(name);
		return new Rep(RepCode.OK,userEntity);
	}

}
