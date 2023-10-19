package com.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.dao.EmployeeDAO;
import com.dao.EmployeeDAOImpl;
import com.model.Employee;

public class EmployeeMain 
{
	public static void main(String[] args) throws SQLException
	{
		Employee emp=new Employee(5,"Riya","Jalandhar");
		EmployeeDAO e=new EmployeeDAOImpl();
		
//		e.addEmployee(emp);
		
		Optional<List<Employee>> al=e.loadAll();
//		for(Employee em:al)
//		{
//			System.out.println(em.getEmpid()+" "+em.getEmpname()+" "+em.getEmpcity());
//		}
		al.get().stream().forEach(employee->System.out.println(employee));
		
		
	}

}
