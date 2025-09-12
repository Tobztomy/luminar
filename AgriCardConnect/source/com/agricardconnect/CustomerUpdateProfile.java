package com.agricardconnect;

import java.io.IOException;
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


@WebServlet("/customerprofileupdate")
public class CustomerUpdateProfile extends HttpServlet{

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
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			
			
			String username = request.getParameter("username");
	        String pass = request.getParameter("pass");
	        String name = request.getParameter("name");
	        String address = request.getParameter("address");
	        String email = request.getParameter("email");
	        String phone = request.getParameter("phone_no");
	        
			pst = con.prepareStatement("UPDATE users SET user_password=?, name=?, address=?, email=?, phone_no=? WHERE user_name=?");
			pst.setString(1, pass);
            pst.setString(2, name);
            pst.setString(3, address);
            pst.setString(4, email);
            pst.setString(5, phone);
			pst.setString(6, username);


			pst.executeUpdate();
			con.close();
			response.sendRedirect("customerprofile");
		
		}catch (IOException | SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

}


