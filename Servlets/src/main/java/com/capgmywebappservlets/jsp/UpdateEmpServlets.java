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
@WebServlet("/upDateEmployee2")
public class UpdateEmpServlets extends HttpServlet {
private EmployeeService service =new EmployeeServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session  = req.getSession(false);
		if(session!=null)
		{//valid session 
			//get data
			int empId = Integer.parseInt(req.getParameter("empId"));
			
			String name = req.getParameter("name");
			
			String salary = req.getParameter("salary");
			String designation  = req.getParameter("designation");
			String password = req.getParameter("password");
			EmployeeInfo employeeinfo = new EmployeeInfo();
			employeeinfo.setEmpid(empId);
			employeeinfo.setName(name);
			String newage= req.getParameter("age");
			if(newage!=null && !newage.isEmpty()) {
				int age=Integer.parseInt(newage);
				employeeinfo.setAge(age);
			}
			String newsalary = req.getParameter(salary);
				if(newsalary!=null&&!newsalary.isEmpty()) {
				double Salary = Double.parseDouble(newsalary);
				employeeinfo.setSalary(Salary); 
			}
			employeeinfo.setDesignation(designation);
			employeeinfo.setPassword(password);
			EmployeeInfo employeeinfo = new EmployeeInfo();
	boolean isUpdated=service.updateEmployee(employeeinfo);
	if(isUpdated) {
		req.setAttribute("msg","Employee Details updated Successfully");
		req.getRequestDispatcher("")
	}else {
		req.
	}
			
			
			
			
			
			
		}else {
			//invalid session
			req.setAttribute("msg","Please login First");
			req.getRequestDispatcher("./loginForm").forward(req, resp);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end of methdo	
}//end of class
