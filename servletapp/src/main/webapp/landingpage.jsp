<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

<% if(session.getAttribute("un")==null) {
response.sendRedirect("login.jsp"); 
}else {
out.println("Welcome");
} %>
<a href="login.jsp">Logout</a>

<%
out.println(session.getCreationTime());
out.println(session.getLastAccessedTime());
out.println(session.isNew());
session.setMaxInactiveInterval(1*60);
%>

</body>
</html>