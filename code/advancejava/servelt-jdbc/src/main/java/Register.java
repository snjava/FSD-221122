

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<div align='center'>");
		out.print("<h1>Register User</h1>");
		out.print("<form action='register-me'>");
			out.print("Enter Name : <input type='text' name='name'>");
			out.print("<br><br>");
			out.print("Enter Email : <input type='text' name='email'>");
			out.print("<br><br>");
			out.print("Enter Password : <input type='password' name='pass'>");
			out.print("<br><br>");
			out.print("Enter Contact : <input type='text' name='contact'>");
			out.print("<br><br>");
			out.print("Select Gender : <input type='radio' name='gender' value='Male'>Male");
			out.print("<input type='radio' name='gender' value='Female'>Female");
			out.print("<br><br>");
			out.print("Select City : <select name='city'>");
				out.print("<option value='Pune'>Pune</option>");
				out.print("<option value='Mumbai'>Mumbai</option>");
				out.print("<option value='Nashik'>Nashik</option>");
				out.print("<option value='Delhi'>Delhi</option>");
			out.print("</select>");
			out.print("<br><br>");
			out.print("<button type='submit'>Register Me</button>");
			out.print("<h3><a href='login'> Already Register? </a></h3>");
		out.print("</form>");
		out.print("</div>");
	}
}
