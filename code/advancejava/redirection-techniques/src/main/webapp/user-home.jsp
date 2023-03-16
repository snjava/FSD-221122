<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home Page</title>
</head>
<body>

<div align="right">
	<h3>Welcome User, <%= request.getParameter("uname") %> </h3>
</div>
<hr>
<div align="center">
	<h3>Welcome to Home Page</h3>
</div>

</body>
</html>