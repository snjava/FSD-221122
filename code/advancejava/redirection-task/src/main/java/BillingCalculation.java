
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/billing")
public class BillingCalculation extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String p1Name = request.getParameter("p1name");
		String p1price = request.getParameter("p1price");
		String p1qty = request.getParameter("p1qty");
		String p2Name = request.getParameter("p2name");
		String p2price = request.getParameter("p2price");
		String p2qty = request.getParameter("p2qty");

		double p1PriceNum = Double.parseDouble(p1price);
		int p1QtyNum = Integer.parseInt(p1qty);
		double p1total = p1PriceNum * p1QtyNum;
		double p2PriceNum = Double.parseDouble(p2price);
		int p2QtyNum = Integer.parseInt(p2qty);
		double p2total = p2PriceNum * p2QtyNum;
		
		double totalAmt = p1total + p2total;
		double taxAmt = totalAmt * 0.12;
		double payAmt = totalAmt + taxAmt;
		
		request.setAttribute("totalAmt", totalAmt);
		request.setAttribute("taxAmt", taxAmt);
		request.setAttribute("payAmt", payAmt);
		request.setAttribute("p1total", p1total);
		request.setAttribute("p2total", p2total);
		
		RequestDispatcher dis = request.getRequestDispatcher("billing-summary.jsp");
		dis.forward(request, response);
	}

}
