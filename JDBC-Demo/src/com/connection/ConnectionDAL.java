package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAL 
{
	private Connection connection;
	private DriverManager driverManager;
	
	public ConnectionDAL()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		try 
		{
			connection=driverManager.getConnection("jdbc:mysql://localhost:3306/sunlifedb","root","Nte#25");
		    return connection;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return connection;
		
	}
}
