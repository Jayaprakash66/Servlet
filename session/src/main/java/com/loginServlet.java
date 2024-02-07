package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.dialect.RDMSOS2200Dialect;

@WebServlet("/login")
public class loginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		String al_email="tom@gmail.com";
		String al_pass="123";
		
		if(email.equals(al_email) && pass.equals(al_pass)) {
			HttpSession session=req.getSession(true);
			
			RequestDispatcher dispatcher=req.getRequestDispatcher("view");
			dispatcher.forward(req, resp);
			
			
		}
		else {
			resp.getWriter().print("<h1>Invalid email or Password</h1>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
	}
	

}
