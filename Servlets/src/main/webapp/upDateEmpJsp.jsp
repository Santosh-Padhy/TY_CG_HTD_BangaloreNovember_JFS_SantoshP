<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
     <%@ page session="false "%>
     <%String msg=request.getAttribute(msg); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><a href="./home">Home</a></h4>
<fieldset>
<legend>Update Employee</legend>
<from action="./Employee2" method="post">
<table>
<tr>
 <td>Employee ID</td>
 <td>:</td>
 <td><input type="number" name ="empId" required>
 </tr>
</table>
</fieldset>




</body>
</html>