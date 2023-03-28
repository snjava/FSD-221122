package com.task.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.task.dto.Task;
import com.task.model.TaskModel;

@WebServlet("/add-task")
public class CreateTaskController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String details = request.getParameter("details");
		String schedt = request.getParameter("schedt");
		String status = request.getParameter("status");
		
		Task task = new Task(); // DTO (Data Transfer Object)
			task.setTitle(title);
			task.setDetails(details);
			task.setSchedt(schedt);
			task.setStatus(status);
			
		TaskModel model = new TaskModel();
		boolean value = model.save(task);
		int code = value ? 200 : 500;
		
		response.sendRedirect("create-task.jsp?code="+code);
		
			
	}

}
