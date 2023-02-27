package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStaticData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			PreparedStatement stmt = con.prepareStatement("DELETE FROM student WHERE id=3");
			int count = stmt.executeUpdate();
			con.close();
			System.out.println(count + " : Rows Deleted...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
