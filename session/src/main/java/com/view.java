package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/view")
public class view extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession(false);
		
		if(session !=null) {
			String html="<html>"
					+"<body>"
					+"<h1>INBOX PAGE</h1>"
					+"<table border='2px'>"
					+"		<tr>"
					+"		<th>ID</th>"
					+"		<th>NAME</th>"
					+"		<th>AGE</th>"
					+"		</tr>"
					+"		<tr>"
					+"			<td>1</td>"
					+"			<td>tom</td>"
					+"			<td>22</td>"
					+"		</tr>"
					+"		<tr>"
					+"			<td>2</td>"
					+"			<td>jerry</td>"
					+"			<td>25</td>"
					+"		</tr>"		
					+"</table>"
					+"</body>"
					+"</html>";
			resp.getWriter().print(html);
		}else {
			resp.getWriter().print("<h1>Go and login first</h1>");
		}
		
	}
	
	
	
	
}
