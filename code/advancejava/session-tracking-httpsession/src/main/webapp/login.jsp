<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<%
	String code = request.getParameter("code");
	String msg = "";
	String color = "";
	if(code!=null) {
		switch(code) {
		case "401":
			msg = "Invalid User Name or password";
			color="red";
			break;
		case "202":
			msg = "You have been loggout successfully..";
			color="green";
			break;
		}
	}

%>
	<div align="center">
		<h3 style="color: <%=color%>"><%=msg%></h3>
		<form action="auth-user">
			Enter User Name : <input type="text" name="uname">
			<br><br>
			Enter Password : <input type="password" name="upass">
			<br><br>
			<button type="submit">Login</button>
		</form>
	</div>


</body>
</html>