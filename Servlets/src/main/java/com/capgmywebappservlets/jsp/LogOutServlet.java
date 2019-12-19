package com.capgmywebappservlets.jsp;

import java.io.IOException;

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
			req.setAttribute("msg", "Thank yoiu for visiting our page");
		}else {
			req.setAttribute("msg","You are already logedout");
		}
		
		
		req.getRequestDispatcher("./loginForm").forward(req, resp);
	}
	
	
	
	
}//end of class
