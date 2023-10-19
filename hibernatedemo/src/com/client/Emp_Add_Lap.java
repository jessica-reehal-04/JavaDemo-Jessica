package com.client;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.context.HibernateContextApp;
import com.mapping.Address;
import com.mapping.Employee;
import com.mapping.Laptop;

public class Emp_Add_Lap 
{

	public static void main(String[] args) 
	{
		Session session=HibernateContextApp.getSession();
		
		Transaction tx=session.beginTransaction();
		
		Laptop laptop=new Laptop(201,"Dell");
		ArrayList<Address> address=new ArrayList<>();
		
		address.add(new Address("Link Road","Ludhiana","Punjab"));
		address.add(new Address("Urban Estate","Focal Point","Punjab"));
		
		
		Employee emp=new Employee(1162,"Jessica",laptop,address);
//		Employee e2=new Employee(1102,"Itashi",new Laptop(202,"HP"),address);
		session.save(emp);
		tx.commit();
		
		System.out.println("User saved");
		
	}

}
