<%@page import="edu.jsp.employee.dto.Employee" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Employee> list= (List<Employee>) request.getAttribute("l"); %>

<table border="2px">

	<tr>
		<th>NAME</th>
		<th>EMAIL</th>	
		<th>PASSWORD</th>
		<th>GENDER</th>
		<th>SALARY</th>
		<th>JOB</th>
		<th>PHONE</th>
	</tr>
	<% for(Employee e:list){ %>
	
	<tr>
		<td><%= e.getName() %></td>
		<td><%= e.getEmail() %></td>
		<td><%= e.getPassword() %></td>
		<td><%= e.getGender() %></td>
		<td><%= e.getSal() %></td>
		<td><%= e.getJob() %></td>
		<td><%= e.getPhone() %></td>
	</tr>
	<%} %>

</table>
</body>
</html>