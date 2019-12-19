package com.capgmywebappservlets.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capg.mywebapp.service.EmployeeService;
import com.capg.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/deleteEmployee2")
public class DeleteServlet extends HttpServlet{
	private EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =req.getSession(false);
		if(session!=null)
		{
			int empId = Integer.parseInt(req.getParameter("empId"));
	boolean isDeleted=	service.deleteEmployee(empId);
	if(isDeleted) {
		req.setAttribute("msg","Record for Employee id"+empId+"Deleted ");
	}else {
		req.setAttribute("msg","Record for Employee id"+empId+"Not found");
	}
	req.getRequestDispatcher("./deleteEmployee2" ).forward(req, resp);
	
	
		}else
		{//invalid session
			req.setAttribute("msg","Login first to Delete the Data");
			req.getRequestDispatcher("./loginFormJsp.jsp").forward(req, resp);
		}
		
		
		
		
		
		
		
		
		
		
	}//emd of method
}//end of class
