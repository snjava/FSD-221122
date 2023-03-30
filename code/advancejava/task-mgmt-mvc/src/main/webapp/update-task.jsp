<%@page import="com.task.dto.Task"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update My Task</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	
<div align="center">
	<h1>Update Task</h1>
	
	<%
		String code = request.getParameter("code");
		String msg = "";
		String color = "";
		if(code != null) {
			switch(code) {
			case "200" :
				msg = "Task Updated Successfully";
				color = "green";
				break;
			case "500" :
				msg = "Task updation Failed...";
				color = "red";
				break;
			}
		}
	%>
	<h1 style="color: <%=color%>"><%= msg %></h1>
	
	<% 
		Task task = (Task) request.getAttribute("taskDetails");
	%>
	
	<form action="update-my-task">
		<input type="hidden" name="id" value="<%=task.getId()%>">
		Enter Title : <input type="text" name="title" value="<%=task.getTitle()%>">
		<br><br>
		Enter Details : <textarea rows="3" cols="15" name="details"><%=task.getDetails()%></textarea>
		<br><br>
		Select Scheduled On : <input type="date" name="schedt" value="<%=task.getSchedt()%>">
		<br><br>
		Select Status : <select name="status">
							<option value="Open">Open</option>
							<option value="In-Progress">In-Progress</option>
							<option value="Close">Close</option>
						</select>
		<br><br>
		<button type="submit">Update Task</button>
	</form>
</div>
</body>
</html>