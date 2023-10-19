package com.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.context.HibernateContextApp;
import com.entity.Employee;

public class FetchUser {

	public static void main(String[] args) 
	{
		Session session=HibernateContextApp.getSession();
		Query query=session.createQuery("from Employee");
		List<Employee> emp=query.list();
		
		for(Employee e:emp)
		{
			System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpCity());
		}
		
	}

}
