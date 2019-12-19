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
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	EmployeeService service = new EmployeeServiceImpl();
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String empIdVal = req.getParameter("empId");
	String password = req.getParameter("password");

	int empId = Integer.parseInt(empIdVal);
	EmployeeInfo employeeInfo = service.authenticateInfo(empId, password);
	PrintWriter out=resp.getWriter();
	out.println("<html>");
	out.println("<body>");
	if (employeeInfo != null) {
		//valid credential
		HttpSession session=req.getSession(true) ;//creating the session becoz we have add delete and much more operation have to do  (always go for getSession(true))
		session.setAttribute("employeeInfoBean", employeeInfo);
		out.println("<h2 style='color:blue'>Welcome "+employeeInfo.getName()+" </h2>");
		out.println("<br><a href='#'> Add Employee </a>");
		out.println("<br><a href='#'> Update Employee </a>");
		out.println("<br><a href='./search.html'> Search Employee </a>");
		out.println("<br><a href='#'> Delete Employee </a>");
		out.println("<br><a href='#'> See All Employee </a>");
		out.println("<br><br> <a href='./logout'> Logout </a>");
	} else {
		out.println("<h3 Style='color:red'>Invalid credential</h3>");
		req.getRequestDispatcher("./loginPage.html").include(req, resp);
	}
	out.println("</body>");
	out.println("<html>");
}// end of doPost
	
}//end of post	
	
	
	
	
