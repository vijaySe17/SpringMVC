package com.sample;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author vthoguru
 *
 */
@Controller
public class HelloController{

	@RequestMapping("/hello/{user}") //url pattern with pathVariable
	public ModelAndView hello(@PathVariable("user") String pUser) {
		ModelAndView modelAndView = new ModelAndView("hello"); // name of the jsp
		modelAndView.addObject("msg", "Hello " +pUser); 
		return modelAndView;
	}
	@RequestMapping("/hello/{contry}/{user}") //url pattern with multiple pathVariable
	public ModelAndView hello(@PathVariable("user") String pUser, @PathVariable("contry") String pContry) {
		ModelAndView modelAndView = new ModelAndView("hello"); 
		modelAndView.addObject("msg", "Hello " +pUser + ". U r from "+pContry); 
		return modelAndView;
	}
	@RequestMapping("/welcome/{contry}/{user}") //url pattern with multiple pathVariable using Map
	public ModelAndView hello(@PathVariable Map<String, String> pVars) {
		ModelAndView modelAndView = new ModelAndView("hello"); 
		modelAndView.addObject("msg", "Welcome " +pVars.get("user") + ". U r from "+pVars.get("contry")); 
		return modelAndView;
	}
	
	
}
