package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie")
public class AddCookies extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	Cookie c1=new Cookie("Email","tom@gmail.com");
	c1.setMaxAge(60*60);
	
	Cookie c2=new Cookie("Pass","123");
	
	resp.addCookie(c1);
	resp.addCookie(c2);
	
	resp.getWriter().print("<h1>Cookie Added</h1>");
	}
	
	

}
