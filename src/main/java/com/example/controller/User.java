package com.example.controller;

import org.springframework.security.core.Authentication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Everbridge.SecurityConfig;
import com.example.dao.Users;

@Controller
public class User implements ErrorController {

	@Autowired
	private Users users;

	
	@Autowired
	private SecurityConfig SecurityConfig;

	@RequestMapping("/")
	public String user() {
		return "index";
	}

	@RequestMapping("/login")
	public Authentication login() {
		return SecurityConfig.getAuthentication();
	}

	@Override
	@RequestMapping("/error")

	public String getErrorPath() {

		
		return "No Mapping Found";
	}

	@RequestMapping("/details")
	public String details(Model m) {
		System.out.print(users.details());
		
		m.addAttribute("details", users.details());

		return "profileDisplay";
	}

}