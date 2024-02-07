<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String s=(String)request.getAttribute("msg");
if(s!=null){%>
<h1><%= s %></h1>
	
<%}%>
<form action="signin">

<label>Enter the Name</label>
<input type="text" name="name"></br>

<label>Enter the Email</label>
<input type="email" name="email"></br>

<label>Enter the Password</label>
<input type="password" name="pass"></br>

<label>Enter the Salary</label>
<input type="text" name="sal"></br>

<label>Enter the Phone</label>
<input type="text" name="phone"></br>

<label>Enter the Gender</label>
<input type="text" name="gender"></br>

<label>Enter the JOb</label>
<input type="text" name="job"></br>


<input type="submit">


</form>

</body>
</html>