package com.farmflavour;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/admin")
public class AdminHome extends HttpServlet{

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
		
		out.println("<h1>Welcome " + name+"</h1><br><br>");
		
		out.println("<a href='profile'>Profile Updation</a><br>");
		out.println("<a href='samples'>View Samples</a><br>");
		out.println("<a href='product'>Product Entry</a><br>");
		out.println("<a href='invoices'>View invoices</a><br>");
		out.println("<a href='logout'>logout</a><br>");
		out.println("<img src='/images/cardom.jpg' width='600' height='400'/>");
		
		out.println("</body></html>");



		
	}catch (IOException ex) {
		ex.printStackTrace();
	}

	}
}
