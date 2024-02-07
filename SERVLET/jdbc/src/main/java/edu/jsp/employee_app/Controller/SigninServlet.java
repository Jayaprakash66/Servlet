package edu.jsp.employee_app.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import edu.jsp.employee_app.dao.EmployeeDao;
import edu.jsp.employee_app.dto.Employee;

@WebServlet("/signin")
public class SigninServlet  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("password");
		String gender=req.getParameter("gender");
	     double sal=Double.parseDouble(req.getParameter("salary"));
		String job=req.getParameter("job");
		long phone=Long.parseLong(req.getParameter("phone"));
		
		Employee e=new Employee();
		
		e.setName(name);
		e.setEmail(email);
		e.setPassword(pass);
		e.setGender(gender);
		e.setJob(job);
		e.setPhone(phone);
		e.setSal(sal);
		
		EmployeeDao dao=new EmployeeDao();
		
		dao.saveEmployee(e);
		
		PrintWriter out=res.getWriter();
		
         out.print("<h1> INSERTED SUCCESSFULLY</h1>");
		
		
	}
	
	
	

	
}
