package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.User;
import com.service.UserDAO;

@Controller
@RequestMapping("/mainapp")
public class RestController 
{
	@Autowired
	UserDAO userDao;
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}

	@GetMapping("/loadall")
	@ResponseBody
	public List<User> loadAll()
	{
		return userDao.loadAll();
	}
	
	@GetMapping("/finduser/{uid}")
	@ResponseBody
	public Optional<User> findUser(@PathVariable() int uid)
	{
		Optional<User> u=userDao.findUser(uid);
		
		return u;
	}
	
	@GetMapping("/deleteuser/{username}")
	@ResponseBody
	public String deleteUser(@PathVariable() String username)
	{
		if(userDao.deleteUser(username))
			return "User deleted successfully";
		return "User not found";
	}
	
	@PutMapping("/updateuser/{username}")
	@ResponseBody
	public String updateUser(@PathVariable() String username,@RequestBody User us)
	{
		if(userDao.updateUser(username,us))
			return "User updated successfully";
		return "User not found";
	}
}
