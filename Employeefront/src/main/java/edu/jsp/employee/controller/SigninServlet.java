package edu.jsp.employee.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import edu.jsp.employee.dao.EmployeeDao;
import edu.jsp.employee.dto.Employee;

@WebServlet("/signin")
public class SigninServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		String gender=req.getParameter("gender");
		double sal=Double.parseDouble(req.getParameter("sal"));
		String job=req.getParameter("job");
		long phone=Long.parseLong(req.getParameter("phone"));
		
		Employee e=new Employee();
		
		e.setName(name);
		e.setEmail(email);
		e.setPassword(pass);
		e.setPhone(phone);
		e.setGender(gender);
		e.setSal(sal);
		e.setJob(job);
		
		
		
		EmployeeDao dao=new EmployeeDao();
		dao.saveEmployee(e);
		
		req.setAttribute("msg", "data Saved Successful");
		RequestDispatcher dispatcher=req.getRequestDispatcher("signin.jsp");
		dispatcher.forward(req, res);
		
	}
	

}
