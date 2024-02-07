package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/lifecycle")
public class Lifecycle extends GenericServlet {

	static int count = 0;

	@Override
	public void destroy() {
		System.out.println("this is destroy method");
	}

	@Override
	public void init() {
		System.out.println("this is init method");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		System.out.println("this is service method ");

		res.getWriter().print("<h1>" + ++count + "</h1>");

	}

}
