package com.sample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * 
 * @author vthoguru
 *
 */
@Controller
public class HelloController{

	@RequestMapping("/helloIndex") //url pattern and this method name anything
	public ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
//		ModelAndView modelAndView = new ModelAndView(); // if not specified, .html name
		ModelAndView modelAndView = new ModelAndView("hello"); // name of the jsp
		modelAndView.addObject("msg", "Hello from MVC with Annotation"); 
		return modelAndView;
	}
	
	
}
