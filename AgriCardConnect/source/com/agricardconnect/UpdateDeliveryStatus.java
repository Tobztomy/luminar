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

@WebServlet("/updatedeliverystatus")
public class UpdateDeliveryStatus extends HttpServlet {

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

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
        	response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            
            int orderId = Integer.parseInt(request.getParameter("order_id"));
            String deliveryStatus = request.getParameter("delivery_status");

			
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            
            String sql = "UPDATE payments SET delivery_status = ? WHERE order_id = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, deliveryStatus);
            pst.setInt(2, orderId);

            int rowsUpdated = pst.executeUpdate();

            if (rowsUpdated > 0) {
                response.sendRedirect("vendorproductreport"); // back to vendor page
            } else {
                out.println("<h3>No record found for Order ID: " + orderId + "</h3>");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

}
