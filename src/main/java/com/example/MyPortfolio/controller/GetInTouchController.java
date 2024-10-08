package com.example.MyPortfolio.controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.MyPortfolio.beans.GetInTouch;
import com.example.MyPortfolio.service.GetInTouchService;

@Controller
public class GetInTouchController {
	
	
	@Autowired
	private GetInTouchService getInTouchService;
	
	@GetMapping("/")
	public String GetInTouch(Model model) {
		
		List<GetInTouch>  getInTouchList=getInTouchService.getAllGetInTouch();
		model.addAttribute("getInTouchList",getInTouchList);
		
		model.addAttribute("getInTouch",new GetInTouch());
		
		return "index-dark";
	}
	
	@PostMapping("saveGetInTouch")
	public String saveGetInTouch(@Valid @ModelAttribute("getInTouch") GetInTouch getInTouch, BindingResult bResult, Model model) {
		
		List<GetInTouch>  getInTouchList=getInTouchService.getAllGetInTouch();
		if (bResult.hasErrors()) {
			System.out.println("Error :"+bResult);
			model.addAttribute("getInTouchList",getInTouchList);
			return "index-dark";
		}
		else {
			getInTouchService.saveGetInTouch(getInTouch);
			return "redirect:/";
		}
	}

}
