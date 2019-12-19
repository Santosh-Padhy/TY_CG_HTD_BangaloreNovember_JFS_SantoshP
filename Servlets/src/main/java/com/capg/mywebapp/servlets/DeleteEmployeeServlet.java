package com.capg.mywebapp.servlets;

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

@WebServlet("/deleteEmployee")
public class DeleteEmployeeServlet extends HttpServlet {
	EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if(session!=null)
		{
			int empId = Integer.parseInt(req.getParameter("empId"));
			PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(service.deleteEmployee(empId))
		{
			out.println("Employee record for"+empId+"Deleted");
		}else {
			out.println("Employee id not found"+empId);
		}
		out.println("</html>");
		out.println("</body>");
		req.getRequestDispatcher("./delet.html").include(req, resp);
		}
		else {
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("Please login first");
			out.println("</html>");
			out.println("</body>");
			req.getRequestDispatcher("./loginPage.html").include(req, resp);
			
			
		}
	}
	
	
	

}
