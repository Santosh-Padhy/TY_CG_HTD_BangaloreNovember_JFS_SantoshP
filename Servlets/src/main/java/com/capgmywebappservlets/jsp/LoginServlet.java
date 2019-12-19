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
@WebServlet("/login2")
public class LoginServlet extends HttpServlet {

private EmployeeService service = new EmployeeServiceImpl();
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int empId = Integer.parseInt(req.getParameter("empId"));
	String password = req.getParameter(req.getParameter("password"));
	EmployeeInfo employeeinfo = service.authenticateInfo(empId, password);
	if(employeeinfo!=null)
	{//validation
		
		HttpSession session = req.getSession(true);
		session.setAttribute("emoployeeInfo",employeeinfo );
		session.setMaxInactiveInterval(60);
		
	}else {
		req.setAttribute("msg","Invalid Credential");
		req.getRequestDispatcher("./loginForm").forward(req,resp);
	}
	
	
	
	
	
	
	
	
}//end of dopost
	
	
	
}//end of class
