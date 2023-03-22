<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>
</head>
<body>

<div align="center">
	<form action="billing">
		<h1>Product1 Details</h1>
		Enter Name : <input type="text" name="p1name">
		<br><br>
		Enter Price : <input type="text" name="p1price">
		<br><br>
		Enter Quantity : <input type="text" name="p1qty">
		
		<h1>Product2 Details</h1>
		Enter Name : <input type="text" name="p2name">
		<br><br>
		Enter Price : <input type="text" name="p2price">
		<br><br>
		Enter Quantity : <input type="text" name="p2qty">
		<br><br>
		<button type="submit">Place Order</button>
	</form>
</div>


</body>
</html>