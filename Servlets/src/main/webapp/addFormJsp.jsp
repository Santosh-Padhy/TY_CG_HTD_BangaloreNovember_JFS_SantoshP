<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page session="false "%>
   <@ String msg= request.getAttribute("msg");%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><a  href="./home">Home</a></h4>
<fieldset>
<legend>Add Employee</legend>
<from action="./addEmployee2" method="post">
<table>
<tr>
 <td>Employee ID</td>
 <td>:</td>
 <td><input type="number" name ="empId" required>
 </tr>
 <tr>
 <td>Employee Name</td>
 <td>:</td>
 <td><input type="text" name="name" required>
 </tr>
 <tr>
 <td>Salary</td>
 <td>:</td>
 <td><input type="number" name="salary" required>
 </tr>
 <tr>
 <td>Designation</td>
 <td>:</td>
 <td><input type="text" name="designation" required>
 </tr>
 <tr>
 <td>Password</td>
 <td>:</td>
 <td><input type="text" name="password" required>
 </tr>
 <tr>
 <td></td>
 <td>:</td>
 <td><input type="text" name="name" required>
 </tr>
 <tr>
 <td colspan="3 align="center"><br><input type="submit value="Add">
 </tr>
</table>

</fieldset>
<%if (msg!=null&&!msg.isEmpty()){ %>
<%=msg %>
<%} %>
</body>
</html>
</body>
</html>