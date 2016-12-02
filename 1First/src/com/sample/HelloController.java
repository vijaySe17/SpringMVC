package com.sample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * 
 * @author vthoguru
 *
 */
public class HelloController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView = new ModelAndView("hello"); // name of the jsp
		modelAndView.addObject("msg", "hello from MVC"); 
		return modelAndView;
	}
	
	
}
