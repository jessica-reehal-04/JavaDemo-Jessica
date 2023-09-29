package com.demo;

public class EmployeeAccess 
{
	public static void main(String []args)
	{
		Manager m=new Manager(1,"Riya","Ludhiana",30,40000.8);
		System.out.println(m);
		
		Accountant acc=new Accountant(2,"Aman","Bangalore","Friday",true);
		System.out.println(acc);
	}
			

}
