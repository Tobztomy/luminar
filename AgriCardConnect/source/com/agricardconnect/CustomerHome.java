package com.agricardconnect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/customer")
public class CustomerHome extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward the request to doPost()
        doPost(request, response);
    }
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
	
	try {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		String name = (String) session.getAttribute("user");
		
		out.println("<html><body>");
		
		out.println("<h1>AgricardConnect</h1><br>");
		
		
		out.println("<div style='text-align:right;'>");
		out.println("<a href='customerprofile'>Profile</a>&emsp;");
		out.println("<a href='customerproductgrade'>Current Market Price</a>&emsp;");
		
		out.println("<a href='viewproductsample'>View Samples</a>&emsp;");
		out.println("<a href='buyproduct'>Purchase Details</a>&emsp;");
		out.println("<a href='customerproductreport'>report</a>&emsp;");
		
		out.println("<a href='index.html'>logout</a>&emsp;");
		out.println("</div>");
		out.println("<h4>Welcome " + name+"</h4><br>");
		out.println("<img src='images/cardom1.jpg' width='600' height='400'/>");
		
		out.println("</body></html>");



		
	}catch (IOException ex) {
		ex.printStackTrace();
	}

	}

}
