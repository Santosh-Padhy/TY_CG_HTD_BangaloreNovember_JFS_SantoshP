package com.capg.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String idVal=req.getParameter("id");
	 resp.setContentType("text/html");
	 PrintWriter out = resp.getWriter();
	 out.println("<html>");
	 out.println("<body>");
	 out.println("Employee Id="+idVal);
	 out.println("Name = Sonu");
	 out.println("Salary=8468346");
	 out.println("</body>");
	 out.println("</html>");
}//end of servlet	
}//end of main
