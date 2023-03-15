<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h1>Hello User,</h1>
	<% 
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String temp = "Ms. ";
		if("male".equals(gender)) {
			temp = "Mr. ";
		} else {
			temp = "Ms. ";
		}
	%>
	
	<h1> <%= temp + name %> </h1>
</div>
</body>
</html>