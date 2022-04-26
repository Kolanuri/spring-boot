package com.springboot.web.springbootfirstwebapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class webController {
	@RequestMapping("/login")
	@ResponseBody
	public String loignMessage() {
		return "Hello world";
	}

}
