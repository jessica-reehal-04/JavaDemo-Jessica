package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.model.User;

public interface UserDAO 
{
	public boolean loginValidated(User us);
	
	public void registerUser(User us);
	
	public List<User> loadAll();
	
	public Optional<User> findUser(int uid);
	
	public boolean deleteUser(String username);
	
	public boolean updateUser(String username,User us);
}
