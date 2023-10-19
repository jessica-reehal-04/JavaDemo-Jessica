package com.main;

import com.model.Employee;

public class EmployeeMain 
{
	public static void main(String[] args) {
		Employee e=new Employee(1,"abc",22,4500);
		
		e.setAge(40);
		System.out.println(e.getAge());
		
		System.out.println(e);
	}

}
