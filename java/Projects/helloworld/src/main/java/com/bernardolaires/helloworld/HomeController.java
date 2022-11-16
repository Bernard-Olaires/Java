package com.bernardolaires.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "Hello World test if it works";
	}
	
	@RequestMapping("/world")
	public String world() {
		return "Class level annotations are cool too!";
	}
	
	@RequestMapping("/greeting/hello")
	public String hello() {
		return "Hello World again!";
	}
}
