package com.dao;

import org.springframework.stereotype.Service;

import com.model.User;
import com.model.Users;

@Service
public class UserDAOImpl implements UserDAO
{
	private static Users list=new Users();
	
	static
	{
		list.getUsers().add(new User(1,"Jess","jess@gmail.com","Ludhiana"));
		list.getUsers().add(new User(2,"Ana","ana@gmail.com","Bangalore"));
	}

	@Override
	public Users getAll() {
		
		return list;
	}

	@Override
	public void addUser(User user) {
		list.getUsers().add(user);
		
	}

}
