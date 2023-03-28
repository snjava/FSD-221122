package com.task.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.task.dto.Task;
import com.task.model.TaskModel;

@WebServlet("/view-my-task")
public class ViewTaskController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TaskModel model = new TaskModel();
		List<Task> taskList = model.getAllTask();
		
		request.setAttribute("list", taskList);
		RequestDispatcher dis = request.getRequestDispatcher("my-task.jsp");
		dis.forward(request, response);
	}

}
