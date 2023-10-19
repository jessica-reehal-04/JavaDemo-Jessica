package com.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.model.Employee;

public interface EmployeeDAO 
{
	public void addEmployee(Employee e) throws SQLException;
	public Optional<List<Employee>> loadAll();
	
}
