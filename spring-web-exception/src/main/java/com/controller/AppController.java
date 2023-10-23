package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDAO;
import com.model.User;
import com.model.Users;

@RestController
@RequestMapping("/userapp")
public class AppController 
{
	@Autowired
	UserDAO userDao;
	
	@GetMapping("/getusers")
	public Users getAllUsers(
			@RequestHeader(name="X-COM-PERSIST",required=true) String headerPersist,
			@RequestHeader(name="X-COM-LOCATION",defaultValue="ASIA") String headerLoc
			)
	{
		return userDao.getAll();
	
	}
	
	@PostMapping("/adduser")
	public ResponseEntity<Object> addUser(@RequestBody User user)
	{
		Users u=userDao.getAll();
		int size=u.getUsers().size()+1;
		
		user.setuId(size);

		userDao.addUser(user);
		return ResponseEntity.ok("User added");
	}
}
