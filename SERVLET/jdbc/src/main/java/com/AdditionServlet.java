package com;

import java.awt.image.RescaleOp;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.module.ModuleDescriptor.Requires;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String num1 = req.getParameter("n1");
		String num2 = req.getParameter("n2");

		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);

		
		int result = n1 + n2;

//		PrintWriter out=res.getWriter();--to reduce lines of code we using directly to print

		res.getWriter().print("<h1>RESULT: " + result + "</h1>");

	}

}
