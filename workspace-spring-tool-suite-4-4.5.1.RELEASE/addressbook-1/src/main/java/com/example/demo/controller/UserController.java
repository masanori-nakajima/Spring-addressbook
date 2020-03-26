package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.UserRequest;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {

	
	@Autowired
	UserService userService;

	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String displayList(Model model) {
		List<User> userlist = userService.searchAll();
		model.addAttribute("userlist", userlist);
		return "user";
	}

	@RequestMapping(value = "/user/add", method = RequestMethod.GET)
	public String displayAdd(Model model) {
		model.addAttribute("userRequest", new UserRequest());
		return "user/add";
		
	}
	
	@RequestMapping(value="/user/create", method=RequestMethod.POST)
    public String create(@ModelAttribute UserRequest userRequest, Model model) {
		userService.create(userRequest);
		return "redirect:/user/list";
	}
}