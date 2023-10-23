package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AppDAO;
import com.model.User;

@Service
public class UserDAOImpl implements UserDAO
{
	@Autowired
	AppDAO appDao;
	List<User> user=new ArrayList<User>();
	@Override
	public boolean loginValidated(User us) 
	{
		for(User u:user)
		{
			if(u.getUsername().equals(us.getUsername()) && u.getPassword().equals(us.getPassword()))
				return true;
			
		}
		return false;
	}
	@Override
	public void registerUser(User us) 
	{
		appDao.save(us);
	}
	@Override
	public List<User> loadAll() 
	{
		return (List<User>) appDao.findAll();
	}
	@Override
	public Optional<User> findUser(int uid) 
	{
		Optional<User> op=appDao.findById(uid);
		if(op.isPresent())
			return op;
		
		return Optional.empty();
	}
	@Override
	public boolean deleteUser(String username) 
	{
	
		int idx=-1;
		for(int i=0;i<user.size();i++)
		{
			if(user.get(i).getUsername().equalsIgnoreCase(username))
			{
				idx=i;
			}
		}
		if(idx!=-1)
			return true;
		return false;
	}
	@Override
	public boolean updateUser(String username, User us)
	{
		for(User u:user)
		{
			if(u.getUsername().equalsIgnoreCase(username))
			{
				u.setUsername(us.getUsername());
				u.setPassword(us.getPassword());
				u.setEmail(us.getEmail());
				u.setCity(us.getCity());
				return true;
				
			}
		}
		return false;
	}

	
}
