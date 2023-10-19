package com.jdbcapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.ConnectionDAL;

public class InsertDemo
{
    static PreparedStatement stmt;
    static String insertdata="insert into employee values(?,?,?)";
	public static void main(String[] args) 
	{
		ConnectionDAL dal=new ConnectionDAL();
		try
		{
		Connection con=dal.getConnection();
		stmt=con.prepareStatement(insertdata);
		stmt.setInt(1, 3);
		stmt.setString(2, "xyz");
		stmt.setString(3, "Bangalore");
		
		int a=stmt.executeUpdate();
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
