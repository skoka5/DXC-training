package com.dxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String sayHello() {
		System.out.println("Inside of hello action");
		return "myhome";
	}

}
