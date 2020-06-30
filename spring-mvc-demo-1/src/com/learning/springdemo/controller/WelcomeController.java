package com.learning.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.service.demo.GenericWelcomeService;
import com.learning.service.demo.WelcomeService;

@Controller
public class WelcomeController {
	@Autowired 
	private GenericWelcomeService welcomeService;

	@RequestMapping("/")	//Map web requests to specific handler classes.
							//Web requests are going to come from http://localhost:8080/spring-mvc-demo-1
	public String doWelcome(Model model) {	//doWelcome method is the handler method
		
		// 1. Retrieving the processed data
		//WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Ribhu Kashyap");
		
		// 2.  Add data to the model
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		// 3.  Return logical view name
		return "welcomeNew";
	}
}
