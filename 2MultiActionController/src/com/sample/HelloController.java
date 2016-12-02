package com.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author vthoguru
 *
 */
@Controller
public class HelloController{

	@RequestMapping("/hello") //url pattern and this method name anything
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView("hello"); // name of the jsp
		modelAndView.addObject("msg", "Hello from MVC with Annotation"); 
		return modelAndView;
	}
	@RequestMapping("/welcome") //url pattern and this method name anything
	public ModelAndView welco() {
		ModelAndView modelAndView = new ModelAndView("hello"); // name of the jsp
		modelAndView.addObject("msg", "Welcome from MVC with Annotation"); 
		return modelAndView;
	}
	
	
}
