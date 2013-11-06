package com.hskj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/login.do")
	public String f(){
		System.out.println("aaaaaaaaaa");
		return "index";
	}

}
