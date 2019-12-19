package com.capg.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capg.mywebapp.beans.EmployeeInfo;
import com.capg.mywebapp.service.EmployeeService;
import com.capg.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/serchEmployee")
public class SearchEmployeeServlet extends HttpServlet {
private EmployeeService employeeService = new EmployeeServiceImpl();
@Override
protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//get the form data
	
String empId=	req.getParameter("empid");
int empid = Integer.parseInt(empId);


 EmployeeInfo employeeinfo=employeeService.searchInfo(empid);
resp.setContentType("text/html");
PrintWriter out = resp.getWriter();
out.print("<html>");
out.print("<body>");
if(employeeinfo !=null)
{
	out.println("<h3>Employee Id"+empId+"Found-</h3>");
	out.println("Name"+employeeinfo.getName());
	out.println("Name"+employeeinfo.getAge());
	out.println("Name"+employeeinfo.getSalary());
	out.println("Name"+employeeinfo.getDesignation());	
}else
{
	out.println("<h3>Employee Id"+empId+"Found-</h3>");
}

 
 
 
 
 
	
}//end of method

}//end of class

