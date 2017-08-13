package com.bankapp.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bankapp.domain.User;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/singup", method = RequestMethod.GET)
	public String singup(Model model) {
		User user = new User();
		
		model.addAttribute("user", user);
		
		return "singup";
	}
	
	@RequestMapping(value = "/singup", method = RequestMethod.POST)
	public void singupPost(@ModelAttribute("user") User user, Model model) {
		

	}
}
