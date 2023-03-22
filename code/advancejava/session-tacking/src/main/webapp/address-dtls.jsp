<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address Details</title>
</head>
<body>
<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String contact = request.getParameter("contact");
%>
<div align="center">
	<h1>Address Details</h1>
	<form action="preview.jsp">
		Enter City : <input type="text" name="city">
		<br><br>
		Enter Pincode : <input type="text" name="pin">
		<br><br>
		Enter State : <input type="text" name="state">
		<br><br>
		<button type="submit">Preview</button>
		<input type="hidden" name="name" value="<%=name%>">
		<input type="hidden" name="email" value="<%=email%>">
		<input type="hidden" name="contact" value="<%=contact%>">
	</form>
</div>
</body>
</html>