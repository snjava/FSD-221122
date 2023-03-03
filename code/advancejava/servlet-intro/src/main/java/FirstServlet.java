import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first-servlet-demo")
public class FirstServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello, This is my first servlet"); // display msg on console
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Hello This is the reponse"); // display the msg in the browser by returning response
		out.print("<h1>Hello, this is HTML type of response</h1>");
		
		
	}
}




