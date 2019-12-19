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
@WebServlet("/addEmployee2")
public class AddServlet extends HttpServlet{
	private EmployeeService service=new EmployeeServiceImpl();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session = req.getSession(false);
	if(session!=null)
	{//get the form Data
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
		
boolean isAdded=service.addEmployee(employeeinfo);
if(isAdded) {
	req.setAttribute("msg","Added sucessfully");
	req.getRequestDispatcher("./addFormJSp.jsp").forward(req, resp);
}else {
	req.setAttribute("msg","Unable to the employee Record");
}
req.getRequestDispatcher("./addFormJsp.jsp").forward(req, resp);	
	}else {
		
		req.setAttribute("msg","please login first");
		req.getRequestDispatcher("./loginFormJSp.jsp").forward(req, resp);
		
	}
	
	
	
	
	
	
	
	}//end of method	

	
}
//end of class
