<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	div {
		background-color: green;
	}
</style>

<script type="text/javascript">
	alert("This is Test JS on JSP");
</script>

</head>
<body>
	<div align="center">
		<h1>User Registration</h1>
		<form action="">
			Enter User Name: <input type="text" name="name">
			<br><br>
			Enter Password: <input type="password" name="pass">
			<br><br>
			Enter User Email: <input type="text" name="email">
			<br><br>
			Enter User City: 	<select name="city">
									<option value="pune">Pune</option>
									<option value="mumbai">Mumbai</option>
									<option value="banglore">Banglore</option>
									<option value="delhi">Delhi</option>
								</select>
			<br><br> 
			<button type="submit">Register</button>
		</form>
	</div>
</body>
</html>