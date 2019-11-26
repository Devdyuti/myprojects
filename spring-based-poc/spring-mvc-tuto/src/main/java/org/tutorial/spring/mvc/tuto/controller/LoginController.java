package org.tutorial.spring.mvc.tuto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.tutorial.spring.mvc.tuto.model.Login;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcomePage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("welcomePage");
		return mv;
	}
	@RequestMapping(value = "/homePage", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("homePage");
		return mv;
	}
	@RequestMapping(value = "/homePage", method = RequestMethod.POST)
	public ModelAndView homePage(Login login) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("homePage");
		return mv;
	}
	@RequestMapping(value = "loginPage", method = RequestMethod.GET)
	public ModelAndView loginPage(@RequestParam(value = "error", required = false) String error, @RequestParam(value = "logout", required = false) String logout) {
		ModelAndView mv=new ModelAndView();
		
		if(error!=null) {
			mv.addObject("error", "Invalid Credentials provided");
		}
		if(logout!=null) {
			mv.addObject("message", "logout successfully!");
		}
		mv.setViewName("loginPage");
		
		return mv;
	}
}
