

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-validate")
public class Validate extends HttpServlet {

	HashMap<String, String> users = new HashMap<String, String>();
	public Validate() {
		users.put("Abc", "abc123");
		users.put("Admin", "admin@123");
		users.put("Xyz", "xyz123");
		users.put("Pqr", "pqr123");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname"); 
		String pass = request.getParameter("upass"); 
		
		if(users.containsKey(name) && users.get(name).equals(pass) ) {
			// valid user
			RequestDispatcher dis = request.getRequestDispatcher("user-home.jsp");
			dis.forward(request, response);
		} else {
			// Invalid User
			response.sendRedirect("error.jsp");
		}
	}

}
