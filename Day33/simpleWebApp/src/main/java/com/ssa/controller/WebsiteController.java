package com.ssa.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan(basePackages="com.ssa")
public class WebsiteController {

	@RequestMapping("/about")
	public ModelAndView about(HttpServletRequest request, ModelAndView mv){
//		if(request.getParameter("name")!= null) {
//				mv.addObject("name", request.getParameter("name"));
//		}
		mv.setViewName("about");
		return mv;
}
	@RequestMapping("/")
	public ModelAndView home(HttpServletRequest request, ModelAndView mv){
		if(request.getParameter("name")!= null) {//note -localhost name http://localhost:8080?name=Karen
				mv.addObject("name", request.getParameter("name"));
		}
		mv.setViewName("home");
		return mv;
}
	@RequestMapping("/helpTester")
	public ModelAndView help(HttpServletRequest request, ModelAndView mv){
		if(request.getParameter("name")!= null) {
				mv.addObject("name", request.getParameter("name"));
				
						}
		mv.setViewName("helpTester");
		return mv;
	}
	
	@RequestMapping("/help")
    public ModelAndView crowdsourcing(HttpServletRequest request) throws ParseException {
    	
		String[] messages = {
				"This is art",
				"This is yoga",
				"This is recess",
				"This is potpouri",
				"Hello"
		};
    	ModelAndView mv = new ModelAndView();
    	mv.addObject("id", request.getParameter("id"));
    	String idasString = request.getParameter("id");
    	int id = Integer.parseInt(idasString);
    	mv.addObject("desc", messages [id]);
    		        
    	mv.setViewName("help");
		return mv;
	    }
}
    	  
        
 