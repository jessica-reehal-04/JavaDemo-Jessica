package com.dao;

import com.model.User;
import com.model.Users;

public interface UserDAO 
{
	public Users getAll();
	public void addUser(User user);
}
