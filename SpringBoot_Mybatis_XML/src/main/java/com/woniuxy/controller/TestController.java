package com.woniuxy.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.woniuxy.bean.LoginBean;
import com.woniuxy.dao.LoginMapper;
import com.woniuxy.service.LoginService;

@RestController
@RequestMapping("/main")
public class TestController {
	
	@Autowired
	private LoginService service;
	
	@Autowired
	private LoginMapper Mapper;
	
	@RequestMapping("/test.do")
	@ResponseBody
	public String test(HttpServletResponse response){
		System.out.println("测试");
		return "MyJsp.jsp";
	}
	@RequestMapping("/test2.do")
	@ResponseBody
	public String test2() {
		System.out.println("测试2");
		String welcome = "welcome";
		LoginBean bean= Mapper.findById(1);
		return bean.toString();
	}
	
	
}
