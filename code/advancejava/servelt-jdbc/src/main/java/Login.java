

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Login extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<div align='center'>");
		out.print("<h1>Login User</h1>");
		out.print("<form action='register-me'>");
			out.print("Enter Email : <input type='text' name='email'>");
			out.print("<br><br>");
			out.print("Enter Password : <input type='password' name='pass'>");
			out.print("<br><br>");
			out.print("<button type='submit'>Login</button>");
			out.print("<h3><a href='register'> Not Yet Register? </a></h3>");
			out.print("<h3><a href='#'> Forgot Password? </a></h3>");
		out.print("</form>");
		out.print("</div>");
		
		/*
		To check user name and password use following query
		SELECT * FROM register WHERE email=? AND password=?
		if data row is present in ResultSet then user logged in successfully else It is invalid user.  
		*/
	}

}
