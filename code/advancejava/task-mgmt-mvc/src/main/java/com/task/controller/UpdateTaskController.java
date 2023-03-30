package com.task.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.task.dto.Task;
import com.task.model.TaskModel;

@WebServlet("/update-my-task")
public class UpdateTaskController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id= request.getParameter("id");
		String title = request.getParameter("title");
		String details = request.getParameter("details");
		String schedate = request.getParameter("schedt");
		String status = request.getParameter("status");
		
		Task task = new Task();
		task.setId(Integer.parseInt(id));
		task.setTitle(title);
		task.setDetails(details);
		task.setSchedt(schedate);
		task.setStatus(status);
		
		TaskModel model = new TaskModel();
		boolean result = model.update(task);
		String code = result ? "200" : "500";
		
		request.setAttribute("taskDetails", task);
		RequestDispatcher dis = request.getRequestDispatcher("update-task.jsp?code="+code);
		dis.forward(request, response);
		
		
	}

}
