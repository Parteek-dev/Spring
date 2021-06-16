package com.spring.mvc.orm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.orm.entities.User;
import com.spring.mvc.orm.service.UserService;

@Controller
@RequestMapping("/userDetails")
public class RegisterFormController {
	
	@Autowired
	UserService userservice;
	
	@RequestMapping("/form")
	public String registerUserDetails() {
		
		return "RegisterForm";
	}
	
	@RequestMapping(path = "/processUser" , method = RequestMethod.POST)
	public String processUserDetails(@ModelAttribute User user, Model model) {
		
		System.out.println("User Detials are : "+user);
		
		int id = userservice.insertUser(user);
		
		model.addAttribute("message","Thanks for register your id is "+id);
		model.addAttribute("user",user);
		
		return "success";
	}
	

}