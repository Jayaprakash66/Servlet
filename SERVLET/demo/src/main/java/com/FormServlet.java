package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FormServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		PrintWriter p=res.getWriter();
		
		String html="<html>" + "<body>" + " <h1> Email:"+email +"</h1>"
				+"<h1> password:"+pass +"</h1>"
				
				+"</body>"+"</html>";
		
		p.print(html);
		
		
	}
	
	

}
