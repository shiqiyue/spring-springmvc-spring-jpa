package cn.wuwenyao.test.hhhh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.wuwenyao.test.hhhh.entity.User;
import cn.wuwenyao.test.hhhh.service.UserService;

@Controller
@RequestMapping("test")
public class TestController {
	
	private static Logger log = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private UserService userService;

	@RequestMapping("add")
	@ResponseBody
	public boolean addUser(){
		User user = new User();
		user.setUsername("www");
		return userService.addUser(user);
	}
	
	@RequestMapping("get")
	@ResponseBody
	public String findUser(){
		User user = userService.findUserById(1L);
		return user.getUsername();
	}
}
