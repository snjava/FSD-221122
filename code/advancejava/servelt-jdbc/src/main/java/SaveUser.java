

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register-me")
public class SaveUser extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String contact = request.getParameter("contact");
		int count = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd22nov","root","root");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO register(name,password,email,contact,gender,city) VALUES(?,?,?,?,?,?)");
			stmt.setString(1, name);
			stmt.setString(2, pass);
			stmt.setString(3, email);
			stmt.setString(4, contact);
			stmt.setString(5, gender);
			stmt.setString(6, city);
			count = stmt.executeUpdate();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<div align='center'>");
		if(count>0) {
			out.print("<h1 style='color:green'>You are register successfully</h1>");
			out.print("<h1><a href='login'> Click Here </a> to login</h1>");
		} else {
			out.print("<h1 style='color:red'>Registeration failed.. Please try after sometime.</h1>");
			out.print("<h1><a href='register'> Click Here </a> to Register again</h1>");
		}
		out.print("</div>");
	}

}
