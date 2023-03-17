<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Basic Calculations</title>
</head>
<body>
	<div align="center">
		<h1>Perform Basic Calculations</h1>
		<form action="operation">
			Enter 1st Number : <input type="text" name="num1">
			<br><br>
			Enter 2nd Number : <input type="text" name="num2">
			<br><br>
			Select Operation : 	<select name="opt">
									<option value="+">+</option>
									<option value="-">-</option>
									<option value="*">*</option>
									<option value="/">/</option>
								</select>
			<br><br>
			<button type="submit">Calculate</button>
		</form>
	</div>



</body>
</html>