package com.agricardconnect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/vendor")
public class VendorHome extends HttpServlet{

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
			
			out.println("<a href='vendorprofile'>Profile Updation</a>&emsp;");
			out.println("<a href='vendorproductgrade'>View current Market Price</a>&emsp;");
			out.println("<a href='sampleproduct'>Add Sample</a>&emsp;");
			out.println("<a href='sellapprove'>Sell Products</a>&emsp;");
			out.println("<a href='vendorproductreport'>View payments</a>&emsp;");
			out.println("<a href='index.html'>logout</a>&emsp;");
			out.println("</div>");
			out.println("<h2>Welcome " + name+"</h2><br>");
			
			
			
			out.println("</body></html>");
			
		}catch (IOException ex) {
			ex.printStackTrace();
		}

		}
	

}
