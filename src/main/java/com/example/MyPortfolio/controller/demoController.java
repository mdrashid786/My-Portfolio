package com.example.MyPortfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class demoController {
	
//	@GetMapping("deshbord")
//	public String deshboard(Model madel) {
//		return "index-dark";
//		
//	}
	
	@GetMapping("blog-dark")
	public String blogDark(Model madel) {
		return "blog-dark";
		
	}
	
	@GetMapping("blog-post-dark")
	public String blogPostDark(Model madel) {
		return "blog-post-dark";
		
	}
	
	
	

}
