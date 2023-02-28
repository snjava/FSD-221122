package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectGroupBy {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			PreparedStatement stmt = con.prepareStatement("SELECT count(id) as stud_count, city FROM student GROUP BY city");
			ResultSet rs = stmt.executeQuery();
			System.out.println("Count \t City");
			while(rs.next()) {
				System.out.print(rs.getString("stud_count") + "\t");
				System.out.print(rs.getString("city") + "\n");
			}
			
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
