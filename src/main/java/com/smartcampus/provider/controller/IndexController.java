
package com.smartcampus.provider.controller;


import com.smartcampus.provider.entity.User;
import com.smartcampus.provider.utils.JwtHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@Controller
public class IndexController {
	private static Logger log = Logger.getLogger(IndexController.class);
	@Autowired
	private com.smartcampus.provider.db1.dao.UserMapperTest01 userMapperTest01;
	@Autowired
	private com.smartcampus.provider.db2.dao.UserMapperTest02 userMapperTest02;
	@Autowired
	private com.smartcampus.provider.db1.service.UserServiceTest01 userServiceTest01;
	@Autowired
	private CacheManager cacheManager;

	@Value("${itmayiedu}")
	private String itmayiedu;



	@RequestMapping("/index")
	public String index() {
		return "index";
	}



	@ResponseBody
	@RequestMapping("/insertTest001")
	public String insertTest001(String name, Integer age) {
		userServiceTest01.insertTest001(name, age);
		return "success";
	}

	@ResponseBody
	@RequestMapping("/findByNameTest01")
	public User findByNameTest01(String name) {
		log.info("####findByName()####name:" + name);
		return userMapperTest01.findByName(name);
	}

	@ResponseBody
	@RequestMapping("/insertTest002")
	public String insertTest002(String name, Integer age) {
		userMapperTest02.insert(name, age);
		return "success";
	}

	@ResponseBody
	@RequestMapping("/getValue")
	public String getValue() {
		return itmayiedu;
	}

	@ResponseBody
	@RequestMapping("/getToken")
	public String getToken() {

		return JwtHelper.getToken(1,"role","{name:1}");
	}
	@ResponseBody
	@RequestMapping("/getToken1")
	public String getToken1() {
		String k1 = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ7bmFtZToxfSIsInJvbGUiOiJyb2xlIiwiaWQiOiJpZCIsImV4cCI6MTU0MjExOTAzOCwiaWF0IjoxNTQyMTExODM4LCJqdGkiOiJpZCJ9._1Py9cVxyOfCMwOlsLbwOQOu83g3mP7D7vXm9vJe77A";
		String k2 = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ7bmFtZToxfSIsInJvbGUiOiJyb2xlIiwiaWQiOiJpZCIsImV4cCI6MTU0MjExMDk0OCwiaWF0IjoxNTQyMTEwOTQ4LCJqdGkiOiJpZCJ9.H8LIfig0UR1h6nj41IgL7xdTib06RILR6NXUVHf0a8U";
		return JwtHelper.parseJWT(k1);
	}
	@RequestMapping("/removeKey")
	public String removeKey(String key) {
		cacheManager.getCache("baseCache").clear();
		return "success";
	}


}
