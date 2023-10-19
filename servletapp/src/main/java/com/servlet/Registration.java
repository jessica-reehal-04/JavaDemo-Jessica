package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connectiondb.ConnectionDAL;
import com.pojo.User;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<User> userList=new ArrayList<>();
    public Registration() {
        super();
      
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String username=null;
		String email=null;
		String city=null;
		String password=null;
		if(request.getParameter("username")!="")
		username=request.getParameter("username");
		
		if(request.getParameter("email")!="")
		email=request.getParameter("email");
		
		if(request.getParameter("city")!=null)
		city=request.getParameter("city");
		
		if(request.getParameter("passwd")!="")
		password=request.getParameter("passwd");
		
		userList.add(new User(username,email,city,password));
//		System.out.println(userList);
		
		ConnectionDAL c=new ConnectionDAL();
		Connection con=c.getConnection();
		
		try 
		{
			PreparedStatement ps=con.prepareStatement("insert into users(username,email,city,password) value(?,?,?,?)");
			ps.setString(1, username);
			ps.setString(2, email);
			ps.setString(3, city);
			ps.setString(4, password);
			
			int output=ps.executeUpdate();
			
			if(output>0)
			{
				System.out.println("Inserted successfully...");
			}
			else
			{
				System.out.println("Unable to insert into the database");
			}
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		response.getWriter().println("Form submitted successfully...");
		
		
	}

}
