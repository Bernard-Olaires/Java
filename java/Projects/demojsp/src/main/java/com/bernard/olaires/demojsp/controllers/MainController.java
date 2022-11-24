package com.bernard.olaires.demojsp.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("name", "Sara");
		return "demo.jsp";
	}
}
