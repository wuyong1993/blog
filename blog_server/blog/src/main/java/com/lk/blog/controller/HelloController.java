package com.lk.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("测试")
@RestController
@RequestMapping("/test")
public class HelloController {
	
	@ApiOperation("测试接口")
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "helllo world";
	}
}
