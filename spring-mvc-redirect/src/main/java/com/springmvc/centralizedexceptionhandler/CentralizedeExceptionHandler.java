package com.springmvc.centralizedexceptionhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CentralizedeExceptionHandler {
	
	/**
	 * you can handle all your exceptions here because we are using @ControllerAdvice
	 */
	
		//handle specific exceptions if you know
		@ExceptionHandler(value = NullPointerException.class)
		public String handleException(Model m) {
		
			m.addAttribute("msg", "NullPointerException has been occured");
			
			return "errorPage";
		}
		
		//handle generic exceptions if you don't know
		@ExceptionHandler(value = Exception.class)
		public String handleExceptionGenreic(Model m) {
		
			m.addAttribute("msg", "Exception has been occured");
			
			return "errorPage";
		}

}