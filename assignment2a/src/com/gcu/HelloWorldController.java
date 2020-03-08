package com.gcu;

import javax.servlet.annotation.WebServlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping(path = "/test1", method = RequestMethod.GET)
	@ResponseBody
	public String sayHello() {
		return "Hello World!";
	}
	
	@RequestMapping(path = "/test2", method = RequestMethod.GET) 
	public String sayHello(ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC");
		return "hello";
	}
	
	@RequestMapping(path = "/test3", method = RequestMethod.GET)
	public ModelAndView sayHello1() {
		ModelAndView obj = new ModelAndView();
		obj.addObject("message", "Hello World from ModelAndView");
		obj.setViewName("hello");
		return obj;
	}
	
	@RequestMapping(path = "/test4", method = RequestMethod.GET)
	public String sayHello(@RequestParam("message") String message, ModelMap model) {
		model.addAttribute("message", message);
		return "hello";
	}
}
