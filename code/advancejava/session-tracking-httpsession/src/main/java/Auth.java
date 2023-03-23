

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/auth-user")
public class Auth extends HttpServlet {
	Map<String, String> users = new HashMap<String, String>();
	public Auth() {
		users.put("abc@gmail.com", "abc@123");
		users.put("admin@gmail.com", "admin123");
		users.put("xyz@gmail.com", "xyz@321");
		users.put("lmn@gmail.com", "lmn@123");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String userPass = request.getParameter("upass");
		
		if(users.containsKey(userName) && users.get(userName).equals(userPass)) {
			// This line will either create a new session or returns the existing session. 
			// If JSESSION id is already available in the request then it will not create a new session it return the existing session.
			// if JSESSION id not available in the request then it will create new session.
			HttpSession session = request.getSession();
			session.setAttribute("username", userName); // you can add value inside session.
			response.sendRedirect("home.jsp");
		} else {
			response.sendRedirect("login.jsp?code=401");
		}
	}

}
