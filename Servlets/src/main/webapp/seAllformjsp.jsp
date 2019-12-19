<%@page import="java.util.List"%>
<%@page import="com.capg.mywebapp.beans.EmployeeInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@ page session="false" %>
          <%	List<EmployeeInfo>  list= (List<EmployeeInfo>)request.getAttribute("list");
          String msg= (String)request.getAttribute("msg");
          
          %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><a href="./home">Home</a></h4>
<%if(list!=null&&!list.isEmpty()) {%>
<table>
  <tr>
    <th>EmpId</th>
    <th>Name</th>
    <th>Age</th>
    <th>Designation</th>
  </tr>
  <%for(EmployeeInfo employeelist:list){%>
  <tr>
  <td><%=employeelist.getEmpId() %></td>
  <td><%=employeelist.getName() %></td>
  <td><%=employeelist.getAge() %></td>
  <td><%=employeelist.getSalary() %></td>
  <td><%=employeelist.getDesignation() %></td>
 
  
  
  </tr>
  <%} %>
</table>
<%} %>
<%if (msg!=null &&msg.isEmpty()){ %>

<%=msg %>


<%} %>
</body>
</html>