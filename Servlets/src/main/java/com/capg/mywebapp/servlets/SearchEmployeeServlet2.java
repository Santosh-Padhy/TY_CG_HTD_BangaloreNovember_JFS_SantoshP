package com.capg.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.capg.mywebapp.servlets.*;
import com.capg.mywebapp.beans.EmployeeInfo;
@WebServlet("/searchEmployee2")
public class SearchEmployeeServlet2  extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	out.println("<html>");
	out.println("<bpdy>");
		if(session!=null)
		{
			//valid session
			
			String empIdVal = req.getParameter("empId");
			int empId = Integer.parseInt(empIdVal);
			 
			
			
			
			
			
			
			
			
			
		}else {
			//invalid session
			out.println("Please login again");
			req.getRequestDispatcher("./loginPage.html").include(req, resp);	
		}
		out.println("<html>");
		out.println("<bpdy>");
		
		
	}//end method
	
	
}//end of class
