package com.vijay.controller;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vijay.dto.User;

/**
 * 
 * @author vthoguru
 *
 */
@Controller
public class UserController{
	private Set<User> data = new HashSet<User>();
	@RequestMapping(value="/userForm.html", method=RequestMethod.GET) //url pattern with method (by default it will be GET)
	public ModelAndView getUserForm() {
		ModelAndView view = new ModelAndView("userForm"); // name of the jsp
		return view;
	}
	/*@RequestMapping(value="/submitForm.html", method=RequestMethod.POST) //url pattern with POST method
	public ModelAndView hello(@RequestParam("name") String pName, @RequestParam("age") String pAge) {
		ModelAndView modelAndView = new ModelAndView("submitForm"); 
		modelAndView.addObject("msg", "Data :: name="+pName+" age="+pAge); 
		return modelAndView;
	}*/
	@RequestMapping(value="/submitForm.html", method=RequestMethod.POST) //url pattern with POST method
	public ModelAndView submit(@RequestParam Map<String,String> pParams) {
		ModelAndView modelAndView = new ModelAndView("submitForm"); 
		User user = new User(pParams.get("name"),Integer.parseInt(pParams.get("age")));
		data.add(user);
		modelAndView.addObject("msg", "With Map Data :: "+user); 
		return modelAndView;
	}
	@RequestMapping(value="/viewAll.html", method=RequestMethod.GET) //url pattern with method (by default it will be GET)
	public ModelAndView getAllUsers() {
		ModelAndView modelAndView = new ModelAndView("allUsers"); // name of the jsp
		modelAndView.addObject("msg", data); 
		for (User user : data) {
			System.out.println(user);
		}
		return modelAndView;
	}
}
