package com.spring.mvc.controller.viewtocontroller.requestparam;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SendingDataViewToController {
	
	//Registration form 
	@RequestMapping("/contact")
	public String showForm() {
		
		return "contact";
	}
	
	/**
	 * This is old way to get data from view to controller.
	 * change the name to processform if you want to call this method
	 */
	@RequestMapping(path="/processform1" ,method = RequestMethod.POST)
	public String processForm(HttpServletRequest request) {
		
		String email = request.getParameter("email");
		
		System.out.println(email);
		
		return "";
	}
	
	/**
	 *  getting data from view to controller using @RequestParam in method parameter.
	 *  also sending the date from controller to view (success page)
	 *  "/processform" and POST is defined in the view page in form tag needs to be 
	 *  same and also email ,  username ,  userpassword , isChecked fields should be
	 *  matched with the name attribute in <input name ="email"> tag 
	 */
	@RequestMapping(path="/processform" ,method = RequestMethod.POST)
	public String processFormWithRequestParam(
			//Defined the field name in the annotation then we can 
			//changed the variable name 
			@RequestParam("email") String userEmail,
			//Not defined the field name in the annotation then variable name 
			//needs to be same. 
			@RequestParam String username,
			@RequestParam String userpassword,
			
			/**
			 * By default @RequestParam required attribute is true to make it optional
			 * field than make it false. if you are using @RequestParam than you will 
			 * get below exception to avoid this use required attribute = false
			 * [org.springframework.web.bind.MissingServletRequestParameterException:
			 * Required boolean parameter 'isChecked' is not present]			
			 */
			
			@RequestParam(required = false) boolean isChecked, Model model) {

		System.out.println("Email:" + userEmail);
		System.out.println("User Name: " + username);
		System.out.println("User Password: " + userpassword);
		System.out.println("Checkbox: " + isChecked);
		
		//setting data in model do that view can use this data
		model.addAttribute("username", username);
		model.addAttribute("email", userEmail);
		
		//calling success page
		return "success";
	}

}
