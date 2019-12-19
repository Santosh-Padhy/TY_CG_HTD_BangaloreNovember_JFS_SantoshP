package com.capgmywebappservlets.jsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capg.mywebapp.beans.EmployeeInfo;
import com.capg.mywebapp.service.EmployeeService;
import com.capg.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/searchEmployee3")
public class GetEmployeeServlet extends HttpServlet{
	EmployeeService service = new EmployeeServiceImpl();
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	HttpSession session = req.getSession(false);
	if(session!=null)
	{//valid session
		int empId = Integer.parseInt(req.getParameter("empId"));
	EmployeeInfo employeeinfo =	service.searchInfo(empId);
	req.setAttribute("employeeInfo",employeeinfo);
		
		
	}else
	{
		req.setAttribute("msg","please login first to search the data");
		req.getRequestDispatcher("./loginForm").forward(req,resp);
	}
	
	
	
	
	
}//end of method
}//end of class
