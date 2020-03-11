package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.User;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="/user", method= RequestMethod.GET)
	//@RequestMapping("user")
	public String index(Model model) {
		List<User> user=userRepository.findAll();
		model.addAttribute("user", user);
		
		return "user";
	}
			
}