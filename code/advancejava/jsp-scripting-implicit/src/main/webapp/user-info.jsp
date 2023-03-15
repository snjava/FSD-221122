<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Info</title>
</head>
<body>
<div align="center">
<h1>User Information</h1>
<form action="result.jsp">
	Enter Name : <input type="text" name="name">
	<br><br>
	Select Gender : <input type="radio" name="gender" value="male">Male
					<input type="radio" name="gender" value="female">Female
					
	<br><br>
	<button type="submit">Save</button>
</form>
</div>
</body>
</html>