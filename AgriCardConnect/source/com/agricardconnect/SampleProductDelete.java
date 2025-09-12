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

@WebServlet("/deletesampleproduct")
public class SampleProductDelete extends HttpServlet {

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

			
			int sampleId = Integer.parseInt(request.getParameter("id"));
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "DELETE FROM samples WHERE sample_id = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, sampleId);
            pst.executeUpdate();
            
            response.sendRedirect("sampleproduct");
		} catch (IOException | SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		
	}
}


