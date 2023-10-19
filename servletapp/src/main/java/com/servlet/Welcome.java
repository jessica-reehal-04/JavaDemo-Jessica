package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Welcome() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		if(request.getParameter("uname").equals("admin") && request.getParameter("pass").equals("manager"))
//		{
			HttpSession session=request.getSession();
			session.setAttribute("un",request.getParameter("uname"));
			session.setAttribute("pass", request.getParameter("pass"));
			response.sendRedirect("landingpage.jsp");
		}
//		else
//		response.getWriter().println("Incorrect");
//	}

}
