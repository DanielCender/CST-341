package com.gcu.controller;

import java.util.List;

import javax.validation.Valid;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.gcu.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping(path = "/add", method = RequestMethod.GET) 
	public ModelAndView displayForm() {
		return new ModelAndView("addUser", "user", new User());
	}
	
	@RequestMapping(path="/adduser", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("user") @Valid User user, BindingResult result) {
		if(result.hasErrors()) {
			return new ModelAndView("addUser", "user", user);
		} else {
			List<User> users = getUsers(user);
			return new ModelAndView("displayUsers", "users", users);
		}
	}
	
	private List<User> getUsers(User u) {
		List<User> users = new ArrayList<User>();
		users.add(new User("Brian", "Stetson", 0));
		users.add(new User("Norma", "Rivers", 0));
		users.add(new User("Jack", "Link", 0));
		users.add(u); // Add recently added user
		return users;
	}
}
