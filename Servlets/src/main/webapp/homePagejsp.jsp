

<%@page import="com.capg.mywebapp.beans.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page session="false" %>
    
    <% HttpSession session = request.getSession(false);
    EmployeeInfo employeeinfo = (EmployeeInfo)session.getAttribute("employeeInfo"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3 style="color:navy">Welcome<%=employeeinfo.getName()%></h3>
<a href="./add">Add Employee</a><br>
<a href="./upDateEmpJsp">Update Employee</a><br>
<a href="./deleteFormJsp">Delete Employee</a><br>
<a href="#">Search Employee</a><br>
<a href="#">See All Employee</a><br>
<a href="./logout2">Logout</a><br>
</body>
</html>