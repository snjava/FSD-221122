<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Preview</title>
</head>
<body>

<%
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String contact = request.getParameter("contact");
	String city = request.getParameter("city");
	String pincode = request.getParameter("pin");
	String state = request.getParameter("state");
%>

<div align="center">
<h1><a href="save-data?name=<%=name%>&email=<%=email%>&contact=<%=contact%>&city=<%=city%>&pin=<%=pincode%>&state=<%=state%>"> Save & Continue </a></h1>

<h1>Personal Details</h1>
	<h3>Name : <%=name%> </h3>
	<h3>Email : <%=email%> </h3>
	<h3>Contact : <%=contact%> </h3>
<hr>
<h1>Address Details</h1>
	<h3>City : <%=city%> </h3>
	<h3>Pincode : <%=pincode%> </h3>
	<h3>State : <%=state%></h3>
</div>

</body>
</html>