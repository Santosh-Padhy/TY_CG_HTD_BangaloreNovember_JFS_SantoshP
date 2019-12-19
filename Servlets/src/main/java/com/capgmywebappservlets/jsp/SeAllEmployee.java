package com.capgmywebappservlets.jsp;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capg.mywebapp.beans.EmployeeInfo;
import com.capg.mywebapp.service.EmployeeService;
import com.capg.mywebapp.service.EmployeeServiceImpl;

public class SeAllEmployee extends  HttpServlet{

private EmployeeService service =new EmployeeServiceImpl();
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session = req.getSession(false);
	if(session!=null)
	{//valid session
		List<EmployeeInfo> list = service.getAllEmployees();
		if(list!=null&& !list.isEmpty())
		{
			req.setAttribute("employeeList",list);
			
		}else
		{
			req.setAttribute("msg","There is nothing to Dispalay");
		}
		req.getRequestDispatcher("./seeAllformjsp.jsp").forward(req, resp);
	}else
	{
		req.setAttribute("msg","Please login first");
		req.getRequestDispatcher("./loginForm").forward(req,resp);
	}
	
	
}//end of method	
	
}//end of class
