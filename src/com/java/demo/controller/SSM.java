package com.java.demo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.demo.domain.User;
import com.java.demo.mapper.UserMapper;
import com.java.demo.service.UserService;
import com.sun.javafx.collections.MappingChange.Map;

@Controller
public class SSM {
	@Autowired
	private UserService userService;
	@RequestMapping(value="test1.do",method=RequestMethod.POST)
public String test1(Model model,Integer id) {
		
	User user = userService.queryUser(id);
	model.addAttribute("user", user);
	return "/view.jsp";
}
	
	@RequestMapping(value="test2.do")
	public void test2() {
			
		userService.zhuangzhang();
		
	}
	@RequestMapping(value="test3.do")
	public void test3() {
			
		int a = 1 / 0;
		
	}
	@RequestMapping(value="test4.do")
	public void test4() {
			
		System.out.println("test4");
	}
	@RequestMapping(value="test5.do")
	public void test5() {
			
		System.out.println("test5");
	}
	@RequestMapping(value="test7.do",method=RequestMethod.POST)
	public void test7(@RequestBody Map<String, Object> map ){
			System.out.println(map);
		
	}
}
