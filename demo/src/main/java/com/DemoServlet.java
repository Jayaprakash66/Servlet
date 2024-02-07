package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DemoServlet extends GenericServlet{

	public void service(ServletRequest req,ServletResponse resp) throws IOException{
		String num1=req.getParameter("n1");
		String num2=req.getParameter("n2");
		
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		int result=n1+n2;
		
		PrintWriter pt=resp.getWriter();
		pt.print("<fieldset><h1> Result : "+ result +"</h1></fieldset>");
		
		
	}

}
