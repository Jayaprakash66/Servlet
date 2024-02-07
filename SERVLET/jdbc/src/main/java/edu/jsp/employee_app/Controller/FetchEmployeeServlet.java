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

@WebServlet("/get")
public class FetchEmployeeServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));

		EmployeeDao dao = new EmployeeDao();

		Employee e = dao.getEmployeeById(id);

		PrintWriter out = res.getWriter();

		out.print("<h1>" + e + "</h1>");

	}

}
