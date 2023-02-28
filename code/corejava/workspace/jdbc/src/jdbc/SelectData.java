package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM student");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("id") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("city") + "\t");
				System.out.print(rs.getString("contact") + "\t");
				System.out.print(rs.getInt("age") + "\t");
				System.out.print(rs.getString("gender") + "\n");
			}
			
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
