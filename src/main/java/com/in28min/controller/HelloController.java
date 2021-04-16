package com.in28min.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.model.HelloBean;

@RestController
public class HelloController {
	
	//@RequestMapping(method = RequestMethod.GET,path = "/hello")
	@GetMapping("/hello")
	public String hello() {
		return "Welcome to Microservices SpringCloud";
	}
	
	@GetMapping("/helloBean")
	public HelloBean helloBean() {
		return new HelloBean("Hello Bean Not Git Activated");
	}
}
