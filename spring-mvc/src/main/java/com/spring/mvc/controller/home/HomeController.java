package com.spring.mvc.controller.home;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // to know the spring this is an Controller
@RequestMapping("/home")
public class HomeController {
	
	//Mapping the client request with URL
	@RequestMapping("/test") // mapping URL http://localhost:9090/spring-mvc/test
	public String test() {
		
		System.out.println("testing.. the url ");
		
		return "test"; // view page name test.jsp
	}
	
	//Sending data from Controller to view via Model
	@RequestMapping("/help")
	public String help(Model model) {
		System.out.println("help URL ");
		
		//setting data
		model.addAttribute("name", "Parteek Sethi");
		
		List<String> list = new ArrayList<>();
		list.add("Rahul");
		list.add("Rinkal");
		list.add("Dheeraj");
		model.addAttribute("nameList", list);
		
		LocalDateTime time = LocalDateTime.now();
		model.addAttribute("localTime", time);
		
		//view name 
		return "help";
	}
	
	//Sending data from Controller to view via ModelAndView
	@RequestMapping("/service")
	public ModelAndView service( ) {
		System.out.println("service url ");
		
		ModelAndView mv= new ModelAndView();
		//setting data
		mv.addObject("name", "Parteek Sethi");
		
		List<String> list = new ArrayList<>();
		list.add("Rahul");
		list.add("Rinkal");
		list.add("Dheeraj");
		mv.addObject("nameList", list);
		
		//setting view name
		mv.setViewName("testService");
		
		// return Model and View Object
		return mv;
	}
	
	/**
	 * Sending data from Controller to view via Model
	 * using EL with JSP page to print the data on view
	 */
		@RequestMapping("/helpUsingEL")
		public String helpUsingEL(Model model) {
			System.out.println("help URL ");
			
			//setting data
			model.addAttribute("name", "Parteek Sethi");
			
			List<String> list = new ArrayList<>();
			list.add("Rahul");
			list.add("Rinkal");
			list.add("Dheeraj");
			model.addAttribute("nameList", list);
			
			LocalDateTime time = LocalDateTime.now();
			model.addAttribute("localTime", time);
			
			//view name 
			return "helpUsingEL";
		}

}
