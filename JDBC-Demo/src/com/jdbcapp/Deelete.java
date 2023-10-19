package com.jdbcapp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.ConnectionDAL;

public class Deelete 
{
	static Statement stmt;
    static String updateData="update employee set empname='abc' where empid=1";
	public static void main(String[] args) throws SQLException 
	{
		ConnectionDAL dal=new ConnectionDAL();
		Connection con=dal.getConnection();
		
		stmt=con.createStatement();
		
		int a=stmt.executeUpdate(updateData);
		
		if(a>0)
			System.out.println("Record updated successfully");
		else
			System.out.println("Unable to update");
		
		

	}

}
