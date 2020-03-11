package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.UserRequestDto.UserRequest;
import com.example.demo.controller.UserService.UserService;
import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="/user", method= RequestMethod.GET)
	public String displayList (Model model) {
			List<User> userlist = userRepository.findAll();
			model.addAttribute("user", userlist);
			return "user";
	}

	@RequestMapping(value = "/user/add", method=RequestMethod.GET)
	public String displayAdd(Model model) {
			model.addAttribute("userRequest", new UserRequest());
			return "user/add";
	}
	@RequestMapping(value="/user/create", method=RequestMethod.POST)
	public String create(@ModelAttribute UserRequest userRequest, Model model) {
				UserService.create(userRequest);
				return "redirect:/user/list";
	}
}
