package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class insert  extends GenericServlet{

public void service(ServletRequest res, ServletResponse resq) throws IOException,ServletException{
		
		String name=res.getParameter("name");
		String age=res.getParameter("age");
		String dob=res.getParameter("dob");
		String gender=res.getParameter("gender");
		String email=res.getParameter("email");
		
		String pass=res.getParameter("pass");
		
		PrintWriter out=resq.getWriter();
		
//		String html="<html>"+"<body>"+"<h1>name:"+name+"</h1>"+
//		"<h1>age:"+age+"</h1>"+
//	    "<h1>dob:"+dob+"</h1>"+
//		"<h1>gender:"+gender+"</h1>"+
//		"<h1>email:"+email+"</h1>"+
//		"<h1>pass:"+pass+"</h1>"
//				+"</body>"+"</html>";
	
//		out.print(html);	
		
		
	
		
		try {
			//establish the connection --1
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//get the connection --2
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			
			
			//create statement--3
			Statement s = c.createStatement();
			
			//execute qurey--4

			// s.executeUpdate("insert into movies values('leo','Lokesh kanagaraj',10,9)");
//			s.executeUpdate("insert into movies values('Kaithi','Lokesh kanagaraj',1,800)");
//			s.executeUpdate("insert into movies values('Maanagaram','Lokesh kanagaraj',10,9)");

//			s.executeUpdate(("delete from movies where MovieName='leo'"));

			s.executeUpdate(("update movies set boxOffice=20000 where MovieName='kaithi' "));
//			s.executeUpdate(("alter movies set "));
			System.out.println("Data inserted");
			
			
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
