package com.capg.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capg.mywebapp.beans.EmployeeInfo;
import com.capg.mywebapp.service.EmployeeService;
import com.capg.mywebapp.service.EmployeeServiceImpl;
@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet{
	EmployeeService service = new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session =req.getSession(false);
		if(session!=null)
		{
			//valid session
			int empId= Integer.parseInt(req.getParameter("empID"));
			String name = req.getParameter("name");
			int age= Integer.parseInt(req.getParameter("age"));
			double salary = Double.parseDouble(req.getParameter("salary"));
			String designation  = req.getParameter("designation");
			String password = req.getParameter("password");
			EmployeeInfo employeeinfo = new EmployeeInfo();
			employeeinfo.setEmpid(empId);
			employeeinfo.setName(name);
			employeeinfo.setAge(age);
			employeeinfo.setSalary(salary);
			employeeinfo.setDesignation(designation);
			employeeinfo.setPassword(password);
			
	boolean isAdded=	service.addEmployee(employeeinfo);
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(isAdded)
		{
			out.println("<h3> style='color:green>Employee data Added Successfully</h3>");
		}else {
			out.println("<h3> style='color:green>Unable to Adddata </h3>");
		}
		out.println("</html>");
		out.println("</body>");
		req.getRequestDispatcher("./add.html").include(req, resp);	
			
		}else
		{
			//invalid session
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h3 style='color':red>Please login first</h3>");
			out.println("</html>");
			out.println("</body>");
			
			
			
			
		}
	}//end of post
	
	
	
	
	
}//end of class
