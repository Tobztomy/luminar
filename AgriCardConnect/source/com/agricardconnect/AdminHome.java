package com.agricardconnect;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/admin")
public class AdminHome extends HttpServlet {

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
		// Forward the request to doPost()
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			HttpSession session = request.getSession(false);
			String name = (String) session.getAttribute("user");

			out.println("<html><body>");
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
			out.println("<table border='1' align='center'>");

			// First row: Vendor | Customer
			out.println("<tr>");
			out.println("<td>Total Vendors<br>"+ getVendorCount() + "</td>");
			out.println("<td>Total Customers<br>" + getCustomerCount() + "</td>");
			out.println("</tr>");

			// Second row: Samples | Stock
			out.println("<tr>");
			out.println("<td>Total Samples<br>" + getSampleCount() + "</td>");
			out.println("<td>Available Stock (kg)<br>"+ getAvailableStock() + "</td>");
			out.println("</tr>");

			out.println("</table>");
			out.println("</body></html>");
			
			

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
	}
	public int getVendorCount() {
	    int count = 0;
	    try {
	        Class.forName(driver);
	        con = DriverManager.getConnection(url, user, password);

	        String sql = "SELECT COUNT(*) FROM users WHERE user_role = 'vendor'";
	        pst = con.prepareStatement(sql);
	        rs = pst.executeQuery();

	        if (rs.next()) {
	            count = rs.getInt(1);  // directly store as int
	        }

	        rs.close();
	        pst.close();
	        con.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return count;
	}
	
	
	public int getCustomerCount() {
	    int count = 0;
	    try {
	        Class.forName(driver);
	        con = DriverManager.getConnection(url, user, password);

	        String sql = "SELECT COUNT(*) FROM users WHERE user_role = 'customer'";
	        pst = con.prepareStatement(sql);
	        rs = pst.executeQuery();

	        if (rs.next()) {
	            count = rs.getInt(1);  // directly store as int
	        }

	        rs.close();
	        pst.close();
	        con.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return count;
	}
	
	
	public int getSampleCount() {
	    int count = 0;
	    try {
	        Class.forName(driver);
	        con = DriverManager.getConnection(url, user, password);

	        String sql = "SELECT COUNT(*) FROM samples";
	        pst = con.prepareStatement(sql);
	        rs = pst.executeQuery();

	        if (rs.next()) {
	            count = rs.getInt(1);  // directly store as int
	        }

	        rs.close();
	        pst.close();
	        con.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return count;
	}
	
	
	public int getAvailableStock() {
	    int count = 0;
	    try {
	        Class.forName(driver);
	        con = DriverManager.getConnection(url, user, password);

	        String sql = "SELECT SUM(sample_weight) FROM samples";
	        pst = con.prepareStatement(sql);
	        rs = pst.executeQuery();

	        if (rs.next()) {
	            count = rs.getInt(1);  // directly store as int
	        }

	        rs.close();
	        pst.close();
	        con.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return count;
	}
}
