package com.task.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.task.dto.Task;

public class TaskModel {

	public boolean save(Task task) {
		boolean result = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO task(title,details,schedt,status) VALUES(?,?,?,?)");
			stmt.setString(1, task.getTitle());
			stmt.setString(2, task.getDetails());
			stmt.setString(3, task.getSchedt());
			stmt.setString(4, task.getStatus());
			int count = stmt.executeUpdate();
			con.close();
			result = count>0;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
