

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-message")
public class UserMessage extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>User Message</h1>");
		out.print("<form action='display-message'>");
			out.print("Enter Your Name: <input type='text' name='nm'>");
			out.print("<br/><br/>");
			out.print("Enter Your Message: <textarea rows='3' cols='15' name='msg' ></textarea>");
			out.print("<br/><br/>");
			out.print("<input type='Submit' value='Send Message'>");
		out.print("</form>");
	}

}
