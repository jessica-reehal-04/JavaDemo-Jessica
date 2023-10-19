package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.context.HibernateContextApp;
import com.entity.Car;

public class Client {

	public static void main(String[] args) 
	{
		Session session=HibernateContextApp.getSession();
		
		Transaction tx=session.beginTransaction();
		Car car=new Car(1,"Thar","SUV","Black",20.6);

		session.save(car);
		
		tx.commit();
		
		System.out.println("User saved");
	}

}
