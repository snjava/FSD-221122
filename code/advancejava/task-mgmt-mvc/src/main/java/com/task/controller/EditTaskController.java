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

@WebServlet("/edit-my-task")
public class EditTaskController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		int tid = Integer.parseInt(id);
		
		TaskModel model = new TaskModel();
		Task task = model.getTaskById(tid);
		
		request.setAttribute("taskDetails", task);
		RequestDispatcher dis = request.getRequestDispatcher("update-task.jsp");
		dis.forward(request, response);
		
	}

}
