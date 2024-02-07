package com;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.ServletRequest;

public class DemoServlet extends GenericServlet{

	public void service(ServletRequest req, ServletResponse resp) throws IOException {

		PrintWriter out = resp.getWriter();

		String html = "<html>" + "<body>" + "<h1>Static web appplication</h1>" + "<body>" + "</html>";
		out.print(html);
	}

}
