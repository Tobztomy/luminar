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

@WebServlet("/updatesamplegrade")
public class SampleGradeUpdate extends HttpServlet {

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
			
			int pid=Integer.parseInt(request.getParameter("productId"));
			String moisture = request.getParameter("moisture");
            String color = request.getParameter("color");
            String price = request.getParameter("price");
            String grade = request.getParameter("grade");
			
			pst = con.prepareStatement("UPDATE sample_grade SET sample_moisture=?, sample_color=?, price=?, grade=? WHERE grade_id=?");
			pst.setString(1, moisture);
            pst.setString(2, color);
            pst.setString(3, price);
            pst.setString(4, grade);
            pst.setInt(5, pid);

			pst.executeUpdate();
			con.close();
		
			dis = request.getRequestDispatcher("samplegrade");
			dis.forward(request, response);
		
		}catch (IOException | SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}


}
