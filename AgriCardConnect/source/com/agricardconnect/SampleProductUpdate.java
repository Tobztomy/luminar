package com.agricardconnect;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updatesamplestatus")
public class SampleProductUpdate extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	final String driver = "com.mysql.cj.jdbc.Driver";
    final String url = "jdbc:mysql://localhost:3306/agricardconnect_demo?useSSL=FALSE";
    final String user = "root";
    final String password = "tobztomy";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        String status = request.getParameter("status");

        if (id != null && status != null) {
            try {
                int sampleId = Integer.parseInt(id);

                Class.forName(driver);
                Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement pst = con.prepareStatement("UPDATE samples SET sample_status=? WHERE sample_id=?");
                pst.setString(1, status);
                pst.setInt(2, sampleId);
                pst.executeUpdate();

                con.close();
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        // Redirect back to admin page
        response.sendRedirect("sampleproductapprove");
    }

}
