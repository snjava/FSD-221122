<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
<link rel="stylesheet" href="./css/style.css">

</head>
<body>
<%
String number1 = request.getParameter("num1");
String number2 = request.getParameter("num2");
String option = request.getParameter("opt");
double ans = (Double) request.getAttribute("answer");




%>

	<div align="center">
		<h1>
			<%= number1 %>  <%= option %>  <%= number2 %> = <%= ans %> 
		</h1>
	</div>


</body>
</html>