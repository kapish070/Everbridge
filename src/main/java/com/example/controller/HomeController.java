package com.example.controller;

import org.springframework.security.core.Authentication;

import java.util.List;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Everbridge.SecurityConfig;
import com.example.dao.Users;
import com.example.modal.User;

@Controller
public class HomeController implements ErrorController {

	@Autowired
	private SessionFactory sessionfactory;
	
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
	/* @ModelAttribute */
	public String details(Model m,HttpServletRequest request,User b) throws Exception {
		System.out.print(users.details()); 

		
		  m.addAttribute("details", users.details());
		 
		

		/*
		 * HttpSession sessions = request.getSession(); Session session =
		 * sessionfactory.openSession(); Query query2 = (Query)
		 * session.createQuery("from WORKDAY.WORKER_DETAILS_COMM where rownum=1").
		 * setMaxResults(1).getResultList().stream().findFirst().orElse(null); User
		 * details=(User)query2;
		 */
		//System.out.println(details);
		/* System.out.println(details.getEmployee_id()); */
		/* m.addAttribute("details", details); */
		
		
		
		return "profileDisplay";
	}

}