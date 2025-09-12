package com.agricardconnect;

import java.io.IOException;
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

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

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

	
	String userName="";
	String userRole="";
	int userId=0;

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
	
	try {
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		pst = con.prepareStatement("select user_id,user_name, user_role from users where user_name=? and user_password =?"); 
		pst.setString(1, username);
		pst.setString(2, password);
		
		rs=pst.executeQuery();
		
		while(rs.next()) {
			 	userId = rs.getInt("user_id");
			    userName = rs.getString("user_name");
			    userRole = rs.getString("user_role");
		}
		
		HttpSession session=request.getSession();
		session.setAttribute("user",userName);
		session.setAttribute("id",userId);
		
		if(userRole.equals("admin")){
			response.sendRedirect("admin");
		}else if(userRole.equals("vendor")) {
			response.sendRedirect("vendor");
		}else if(userRole.equals("customer")) {
			response.sendRedirect("customer");
		}else {
			response.sendRedirect("noUser");
		}

		con.close();
		
	} catch (IOException | SQLException | ClassNotFoundException ex) {
		ex.printStackTrace();
	}
	
	}

}
