<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BIlling Summary</title>
</head>
<body>
<div align="center">
	<h1>Product 1</h1>
		Name : <%= request.getParameter("p1name") %>
		<br><br>
		Price : <%= request.getParameter("p1price") %><br><br>
		Quantity : <%= request.getParameter("p1qty") %><br><br>
		Total : <%= request.getAttribute("p1total") %><br><br>
	<h1>Product 2</h1>
		Name : <%= request.getParameter("p2name") %><br><br>
		Price : <%= request.getParameter("p2price") %><br><br>
		Quantity : <%= request.getParameter("p2qty") %><br><br>
		Total : <%= request.getAttribute("p2total") %><br><br>
	<hr>
		Total Amount : <%= request.getAttribute("totalAmt")  %>	<br><br>
		Tax Amount : <%= request.getAttribute("taxAmt")  %>	<br><br>
		Payable Amount : <%= request.getAttribute("payAmt")  %>	<br><br>
</div>
</body>
</html>