package com.client;


import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.context.HibernateContextApp;
import com.entity.Employee;
import com.entity.Laptop;
import com.entity.Semester;
import com.entity.Student;

public class Client {

	public static void main(String[] args)
	{
		Session session=HibernateContextApp.getSession();
		
		Transaction tx=session.beginTransaction();
//		Laptop l=new Laptop(1,"Dell");
//		Employee emp=new Employee(104,"Jess","Ludhiana",l);
//		
//		Semester sem=new Semester(1,60,2300);
//		Student st=new Student(5,"Riya","1-B",sem);
//		session.save(st);
		
		ArrayList<Laptop> ar=new ArrayList<>();
		ar.add(new Laptop(1,"Dell"));
		ar.add(new Laptop(2,"HP"));
		
		Employee em=new Employee(111,"Jessica","Ludhiana",ar);
		session.save(em);
		tx.commit();
		
		System.out.println("User saved");
	}

}
