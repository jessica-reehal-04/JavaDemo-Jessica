package com.client;

import org.hibernate.Session;

import com.context.HibernateContextApp;
import com.entity.Employee;

public class LoadSingle {

	public static void main(String[] args) {
		Session session=HibernateContextApp.getSession();
		Employee em=(Employee)session.get(Employee.class, 4);
		
		System.out.println(em);

	}

}
