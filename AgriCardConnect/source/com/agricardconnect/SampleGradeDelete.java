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

@WebServlet("/deletesamplegrade")
public class SampleGradeDelete extends HttpServlet {

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
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			int id = Integer.parseInt( request.getParameter("id"));
			
			String sql = "DELETE FROM sample_grade WHERE grade_id = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            
            int rowsDeleted = pst.executeUpdate();

            if (rowsDeleted > 0) {
                response.sendRedirect("samplegrade");
            } else {
                response.getWriter().println("No record found with ID: " + id);
            }
		} catch (IOException | SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}



			

}
