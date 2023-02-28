package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDynamicData {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = scan.nextInt();
		System.out.println("Enter Contact : ");
		String contact = scan.next();
		scan.close();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			PreparedStatement stmt = con.prepareStatement("UPDATE student SET contact=? WHERE id=?");
			stmt.setString(1, contact);
			stmt.setInt(2, id);
			int count = stmt.executeUpdate();
			con.close();
			System.out.println(count + " : Rows Updated...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
