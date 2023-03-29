<%@page import="com.task.dto.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Task</title>
</head>
<body>

<%@ include file="menu.jsp" %>
	
<div align="center">
<table class="table table-hover">
	<thead>
		<tr>
			<th>Title</th>
			<th>Details</th>
			<th>Status</th>
			<th>Scheduled Date</th>
			<th>Action</th>
		</tr>
	</thead>

	<tbody>
<%
	List<Task> taskList = (List<Task>) request.getAttribute("list");
	for(Task task : taskList) {
%>
	<tr>
		<td><%=task.getTitle()%></td>
		<td><%=task.getDetails()%></td>
		<td><%=task.getStatus()%></td>
		<td><%=task.getSchedt()%></td>
		<td>
			<a href="#?id=<%=task.getId()%>"><span class="glyphicon glyphicon-pencil"></span></a>
			<a href="#"><span class="glyphicon glyphicon-trash"></span></a>
		</td>
	</tr>

<%		
	}
%>
	</tbody>
</table>
</div>
</body>
</html>







