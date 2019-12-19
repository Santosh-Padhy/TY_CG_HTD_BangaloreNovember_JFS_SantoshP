<%@page import="com.capg.mywebapp.beans.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>


<%
	EmployeeInfo empolyeeinfo = (EmployeeInfo) request.getAttribute("employeeinfo");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Search Employee</legend>
		<form action="./searchEmployee3" method="get">
			Employee ID: <input type="number" name="empid" required> <br>
			<input type="submit" value="search">
		</form>
	</fieldset>
	<%
		if (empolyeeinfo == null) {
	%>
	<h3>"Employee ID not found</h3>

	%>else{%>
	<h3 style="color: green">
		Details for Employee ID
		<%=empolyeeinfo.getEmpid()%></h3>
	Employee Name =
	<%=empolyeeinfo.getAge()%><br> Employee Age =
	<%=empolyeeinfo.getDesignation()%><br> Employee Designation =
	<%=empolyeeinfo.getSalary()%><br>
	<%
		}
	%>


</body>
</html>