package com.training;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loans
 */
public class Loans extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><meta http-equiv=Content-Type content=text/html; charset=ISO-8859-1>");
		out.println("<title>Loans Public Page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Loans Page</h3>");
		out.println("<h5><img src=\"images/loans_image.jpg\"></h5>");
		out.println("<a href=\"/ServletSample/BankHomePage\">Click here to go back to homepage</a>");
		out.println("</body></html>");

	}

}
