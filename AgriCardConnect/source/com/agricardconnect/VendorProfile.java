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

@WebServlet("/vendorprofile")
public class VendorProfile extends HttpServlet  {

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
			
			pst = con.prepareStatement("SELECT user_name,user_password,name, address, email, phone_no FROM users WHERE user_role='vendor' AND user_name=?");
			pst.setString(1, name);
			rs = pst.executeQuery();

			out.println("<html><head><title>Vendor Profile</title></head><body>");
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
			out.println("<h3>" + name+" Details</h3>");
			
			while (rs.next()) {
				out.println("<table border='1' cellpadding='8'>");
                out.println("<tr><th>Username</th><td>" + rs.getString("user_name") + "</td></tr>");
                out.println("<tr><th>Password</th><td>" + rs.getString("user_password") + "</td></tr>");
                out.println("<tr><th>Full Name</th><td>" + rs.getString("name") + "</td></tr>");
                out.println("<tr><th>Address</th><td>" + rs.getString("address") + "</td></tr>");
                out.println("<tr><th>Email</th><td>" + rs.getString("email") + "</td></tr>");
                out.println("<tr><th>Phone</th><td>" + rs.getString("phone_no") + "</td></tr>");
                out.println("<tr><td colspan='2' align='center'>"
                        + "<a href='vendoreditprofile?name=" + rs.getString("user_name") + "'>Edit Profile</a>"
                        + "</td></tr>");
                out.println("</table>");
                
			} 
			out.println("</body></html>");

			con.close();
			out.close();

		} catch (IOException | SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}
