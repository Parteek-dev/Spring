package com.spring.mvc.controller.viewtocontroller.modelattribute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SendingDataViewToControllerWithModelAtrribute {
	
	@RequestMapping("/registerForm")
	public String userForm() {
		
		return "contactformodel";
	}
	
	/**
	 * If we need to define the common data for view then use @ModelAttribute
	 * on method level and also add the attributes to be used on the view page. 
	 * @param model
	 */
	@ModelAttribute
	public void commonData(Model model) {		
		model.addAttribute("Header", "Registration Form");
		model.addAttribute("desc", "Coding is fun");
	}
	
	/**
	 * no need to define @RequestMapping for every variable then use below annotation
	 * this will reduced the line of code and increase the readability of code.
	 * And also we don't need of Model object 
	 * @return
	 */
	@RequestMapping(path = "/processformformodel" , method = RequestMethod.POST)
	public String processForm(@ModelAttribute User user/* ,Model model */) {
		
		System.out.println(user+"\n"+user.getUsername());
		
		//don't need of Model object 
		//model.addAttribute("user", user);
		
		//automatically get view input data(contactformodel) in this below view(successformodel)
		return "successformodel";
	}

}
