package com.capg.mywebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout")
public class LogOutServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session!=null)
		{
			session.invalidate();
		}
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3 style='color'>You successfully logedout</h3>");
		out.println("<html>");
		out.println("<body>");
		req.getRequestDispatcher("./loginPage.html").include(req, resp);
		
	}
	
	
	
}//end of class
