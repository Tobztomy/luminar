package com.agricardconnect;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/customeruserprofile")
public class CustomerUsersProfile extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final String driver = "com.mysql.cj.jdbc.Driver";
	final String url = "jdbc:mysql://localhost:3306/agricardconnect_demo?useSSL=FALSE";
	final String user = "root";
	final String password = "tobztomy";

	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			HttpSession session = request.getSession(false);
			String name = (String) session.getAttribute("user");

			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			pst = con.prepareStatement("SELECT name, address, email, phone_no FROM users WHERE user_role='customer'");
			rs = pst.executeQuery();

			out.println("<html><head><title>Customer Profile</title></head><body>");
			out.println("<h1>AgricardConnect</h1>");
			out.println("<div style='text-align:right;'>");

			out.println("<a href='customeruserprofile'>customers</a>&emsp;");
			out.println("<a href='vendoruserprofile'>Vendors</a>&emsp;");
			out.println("<a href='samplegrade'>Sample Grade Types</a>&emsp;");
			out.println("<a href='sampleproductapprove'>Approve Product</a>&emsp;");
			out.println("<a href='adminproductreport'>Report</a>&emsp;");
			out.println("<a href='index.html'>logout</a>&emsp;");
			out.println("</div><br><br>");
			out.println("<h1>Welcome " + name + "</h1><br>");
			out.println("<h2>Customer Details</h2>");
			
			out.println("<table border='1' cellpadding='8'>");
		    out.println("<tr>");
		    out.println("<th>Full Name</th>");
		    out.println("<th>Address</th>");
		    out.println("<th>Email</th>");
		    out.println("<th>Phone</th>");			
		    out.println("</tr>");
		    
			while (rs.next()) {
			    out.println("<tr>");
			    out.println("<td>" + rs.getString("name") + "</td>");
			    out.println("<td>" + rs.getString("address") + "</td>");
			    out.println("<td>" + rs.getString("email") + "</td>");
			    out.println("<td>" + rs.getString("phone_no") + "</td>");
			    out.println("</tr>");
			    
			} 
			out.println("</table>");
			out.println("</body></html>");

			con.close();
			out.close();

		} catch (IOException | SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}
