package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStaticData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			PreparedStatement stmt = con.prepareStatement("UPDATE student set contact='1111122222' WHERE id=4");
			int count = stmt.executeUpdate();
			con.close();
			System.out.println(count + " : Rows Updated...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
