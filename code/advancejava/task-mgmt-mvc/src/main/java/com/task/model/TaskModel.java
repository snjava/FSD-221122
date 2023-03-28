package com.task.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Task> getAllTask() {
		ArrayList<Task> list = new ArrayList<Task>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM task");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Task obj = new Task();
				obj.setId(rs.getInt("id"));
				obj.setTitle(rs.getString("title"));
				obj.setDetails(rs.getString("details"));
				obj.setSchedt(rs.getString("schedt"));
				obj.setUpddt(rs.getString("upddt"));
				obj.setStatus(rs.getString("status"));
				list.add(obj);
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}












