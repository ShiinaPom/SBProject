package com.cpfmat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(path = "/index")
	public ModelAndView index(){
		ModelAndView view = new ModelAndView("/homePage");
		return view;
	}
}
