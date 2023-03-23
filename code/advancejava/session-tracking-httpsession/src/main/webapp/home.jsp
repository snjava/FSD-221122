<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<div align="right">
	<h1>User, <%= session.getAttribute("username") %></h1>
	<h3><a href="logout">Logout</a> </h3>
</div>
<hr>
<div align="center">
	<h1>Welcome User To Home Page</h1>
</div>
</body>
</html>