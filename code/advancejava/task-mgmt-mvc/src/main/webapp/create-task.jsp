<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create new Task</title>
</head>
<body>
<div align="center">
	<h1>Add New Task</h1>
	
	<%
		String code = request.getParameter("code");
		String msg = "";
		String color = "";
		if(code != null) {
			switch(code) {
			case "200" :
				msg = "Task Created Successfully";
				color = "green";
				break;
			case "500" :
				msg = "Task Creation Failed...";
				color = "red";
				break;
			}
		}
	%>
	<h1 style="color: <%=color%>"><%= msg %></h1>
	<form action="add-task">
		Enter Title : <input type="text" name="title">
		<br><br>
		Enter Details : <textarea rows="3" cols="15" name="details"></textarea>
		<br><br>
		Select Scheduled On : <input type="date" name="schedt">
		<br><br>
		Select Status : <select name="status">
							<option value="Open">Open</option>
							<option value="In-Progress">In-Progress</option>
							<option value="Close">Close</option>
						</select>
		<br><br>
		<button type="submit">Add Task</button>
	</form>
</div>
</body>
</html>