package com.jdbcapp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.ConnectionDAL;

public class Insert 
{
    static Statement stmt;
    static String insertdata="insert into employee values(2,'Jessica','Ldh')";
	public static void main(String[] args) 
	{
		ConnectionDAL dal=new ConnectionDAL();
		try
		{
		Connection con=dal.getConnection();
		stmt=con.createStatement();
		
		int a=stmt.executeUpdate(insertdata);
		if(a>0)
			System.out.println("Employee added");
		else
			System.out.println("Something went wrong");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
