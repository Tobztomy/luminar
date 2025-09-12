package com.agricardconnect;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/customereditprofile")
public class CustomerEditProfile extends HttpServlet{

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
	
	RequestDispatcher dis = null;

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

			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			pst = con.prepareStatement("select * from users where user_name=? ");
			
			pst.setString(1, name);
			
			rs = pst.executeQuery();

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
			out.println("<h2>" + name+"</h4><br>");
			out.println("<h4>Product</h4><br>");
			
			
			while(rs.next()) {
				out.println("<form name='customerprofileupdate' method='post' action='customerprofileupdate'>");
				
                out.println("Username: <input type='text' name='username' value='" + rs.getString("user_name") + "' readonly><br><br>");
                out.println("Password: <input type='password' name='pass' value='" + rs.getString("user_password") + "'><br><br>");
                out.println("Full Name: <input type='text' name='name' value='" + rs.getString("name") + "'><br><br>");
                out.println("Address: <input type='text' name='address' value='" + rs.getString("address") + "'><br><br>");
                out.println("Email: <input type='email' name='email' value='" + rs.getString("email") + "'><br><br>");
                out.println("Phone: <input type='text' name='phone_no' value='" + rs.getString("phone_no") + "'><br><br>");

                out.println("<input type='submit' value='Update'>");
                out.println("</form>");
                
			}
			out.println("</body></html>");
            out.close();
			
		} catch (IOException | SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}
