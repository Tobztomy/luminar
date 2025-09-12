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

@WebServlet("/samplegradesave")
public class SampleGradeSave extends HttpServlet{

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
			
			String moisture = request.getParameter("moisture");
            String color = request.getParameter("color");
            String price = request.getParameter("price");
            String grade = request.getParameter("grade");
			
			pst = con.prepareStatement("INSERT INTO sample_grade (sample_moisture, sample_color, price, grade) VALUES (?, ?, ?, ?)");
			pst.setString(1, moisture);
            pst.setString(2, color);
            pst.setString(3, price);
            pst.setString(4, grade);
			pst.executeUpdate();
			
			dis = request.getRequestDispatcher("samplegrade");
			dis.forward(request, response);//different page
			
			//response.sendRedirect("product");
			
		}catch (IOException | SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}

}


}
