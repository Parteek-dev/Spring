package com.springmvc.exceptionhandling;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HandleExceptions {

	@SuppressWarnings("null")
	@RequestMapping("/go")
	public String go() {
		
		String s= null;
		s.length(); // NullPointerException
		
	return "";	
	}
	
	@RequestMapping("/go1")
	public String go1() throws Exception {
		
		throw new Exception();
		
	}
	
	/**
	 * If you are using centralize exception handling then 
	 * no need to define the @ExceptionHandler at every controller class
	 * just use the @ControllerAdvice . Hence, commenting below code
	 * */
	
	//handle specific exceptions if you know
	/**@ExceptionHandler(value = NullPointerException.class)
	public String handleException(Model m) {
	
		m.addAttribute("msg", "NullPointerException has been occured");
		
		return "errorPage";
	}
	
	//handle generic exceptions if you don't know
	@ExceptionHandler(value = Exception.class)
	public String handleExceptionGenreic(Model m) {
	
		m.addAttribute("msg", "Exception has been occured");
		
		return "errorPage";
	}*/

}
