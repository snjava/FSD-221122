package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConntection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			
			System.out.println("Connection Created Successfully....");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
