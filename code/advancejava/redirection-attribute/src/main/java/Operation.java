

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/operation")
public class Operation extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String number1 = request.getParameter("num1");
		String number2 = request.getParameter("num2");
		String option = request.getParameter("opt");
		double ans = 0;
		double num1 = Double.parseDouble(number1);
		double num2 = Double.parseDouble(number2);
		
		switch(option) {
		case "+" :
			ans = num1 + num2;
			break;
		case "-" :
			ans = num1 - num2;
			break;
		case "*" :
			ans = num1 * num2;
			break;
		case "/" :
			ans = num1 / num2;
			break;
		}
		
		request.setAttribute("answer", ans);
		
		RequestDispatcher dis = request.getRequestDispatcher("result.jsp");
		dis.forward(request, response);
		
		
	}

}
