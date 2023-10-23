package com.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserDAO;

@RestController
@RequestMapping("/mainapp")
public class AppController 
{
	@Autowired
	UserDAO userDao;
	@PostMapping("/login")
	public String loginValid(@ModelAttribute User us)
	{
		if(userDao.loginValidated(us))
		{
			return "Login Success";
		}
		
		return "Login Failure";
	}
	
	@PostMapping("/register")
//	@ResponseBody
	public String registerValid(@ModelAttribute User us)
	{
		userDao.registerUser(us);
		return "Form submitted successfully";
	}
	
	
	
	
}
