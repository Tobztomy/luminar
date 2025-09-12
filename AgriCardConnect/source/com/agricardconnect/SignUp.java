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

@WebServlet("/signup")
public class SignUp extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final String driver = "com.mysql.cj.jdbc.Driver";
	final String url = "jdbc:mysql://localhost:3306/agricardconnect_demo?allowPublicKeyRetrieval=true&useSSL=FALSE";
	final String user = "root";
	final String password = "tobztomy";

	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			String username = request.getParameter("username");
	        String pass = request.getParameter("pass");
	        String role = request.getParameter("role");
	        String fullName = request.getParameter("name");
	        String address = request.getParameter("address");
	        String email = request.getParameter("email");
	        String phoneNo = request.getParameter("phone_no");
	        
	        Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			pst = con.prepareStatement("INSERT INTO users (user_name, user_password, user_role, name, address, email, phone_no)VALUES (?, ?, ?, ?, ?, ?, ?)");
			pst.setString(1, username);
			pst.setString(2, pass); 
			pst.setString(3, role);
			pst.setString(4, fullName);
			pst.setString(5, address);
			pst.setString(6, email);
			pst.setString(7, phoneNo);
			
			int rows = pst.executeUpdate();
			
			if (rows > 0) {
                out.println("<h3>Sign Up Successful! <a href='index.html'>Login here</a></h3>");
            } else {
                out.println("<h3>Failed to Sign Up. Please try again.</h3>");
            }
			con.close();
			
		} catch (IOException | SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}



}
