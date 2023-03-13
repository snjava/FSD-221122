

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display-message")
public class DisplayMessage extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("nm"); 
		String message = request.getParameter("msg"); 
		
		out.print("<h1>Welcome User, '"+name+"'</h1>");
		out.print("<h1>Your Message is '"+message+"'</h1>");
		
		out.print("<h1><a href='user-message'>Back To Home</a></h1>");
		
	}
}
