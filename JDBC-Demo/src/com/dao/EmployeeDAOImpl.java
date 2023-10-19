package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.connection.ConnectionDAL;
import com.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO
{ 
	PreparedStatement stmt;
	ConnectionDAL dal=new ConnectionDAL();
	
	Connection con=dal.getConnection();
	
	
	@Override
	public void addEmployee(Employee e) throws SQLException
	{
		String insertdata="insert into employee values(?,?,?)";
		
		stmt=con.prepareStatement(insertdata);
		stmt.setInt(1, e.getEmpid());
		stmt.setString(2, e.getEmpname());
		stmt.setString(3, e.getEmpcity());
		
		int a=stmt.executeUpdate();
		if(a>0)
			System.out.println("Employee added");
		else
			System.out.println("Something went wrong");
		
		stmt.close();
		
		con.close();
		
	}

	@Override
	public Optional<List<Employee>> loadAll() 
	{
		
		Optional<List<Employee>> al= Optional.of(new ArrayList<>());
		
		String selectAll="select * from employee";
		try
		{
			stmt=con.prepareStatement(selectAll);
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				al.get().add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
		}
		catch(SQLException e)
		{
			
		}
		return al;
	}
	
	public Optional<Employee> getEmp(int empid)
	{
		String selectId="select * from employee where empid="+empid;
		Optional<Employee> emp;
		try
		{
			stmt=con.prepareStatement(selectId);
			ResultSet rs=stmt.executeQuery();
	
			
			return Optional.of(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
		catch(SQLException e)
		{
			
		}
		
		return Optional.empty();
	}
	

}
