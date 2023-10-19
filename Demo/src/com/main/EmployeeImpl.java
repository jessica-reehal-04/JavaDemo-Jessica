package com.main;

import com.model.Employee;

public class EmployeeImpl implements EmployeeDAO
{

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
	   System.out.println(e.getEmpName()+" "+e.getAge());
		
	}
	
	public static void main(String[] args) {
		EmployeeDAO emp=new EmployeeImpl();
		emp.addEmployee(new Employee(1,"abc",22,4500));
	}

	

}
