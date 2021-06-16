package com.springmvc.redirectview;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/searchApp")
	public String searchApp() {
		
		return "SearchPage";
	}
	
	@RequestMapping("/FirstPageShow")
	public String firstPage() {
		
		return "FirstPage";
	}
	
	/**
	 * This way is best for external URL to redirect the view
	 * because no need to define the internal request mapping method  to  redirect the view
	 * @param keyword
	 * @return
	 */
	@RequestMapping("/search")
	public RedirectView searchWithRedirectView(@RequestParam String keyword) {
		
		String url = "https://www.google.com/search?q=" + keyword;
		
		RedirectView rView  = new  RedirectView();
		rView.setUrl(url);
		
		return rView; //direct hits the external URL
	}
	
	/**
	 * this way is best for internal URL to redirect the view
	 * because we need a internal request mapping method(firstPage line no 18) to redirect the view
	 * @return
	 */
	@RequestMapping("/back")
	public String searchwithRedirectPrefix() {
			
		return "redirect:/FirstPageShow"; // redirect to line no 17 to call request mapping method
	}
	
	@RequestMapping("/test/{id}/{name}")
	public String pathVaiableDemo(@PathVariable("id") int num ,@PathVariable("name") String nameTest ) {
			
	System.out.println(num +" - "+ nameTest);	
		return ""; 
	}
	

}
