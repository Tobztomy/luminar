package com.agricardconnect;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updatepaymentstatus")
public class UpdatePaymentStatus extends HttpServlet {

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
        	int orderId = Integer.parseInt(request.getParameter("order_id"));
            String paymentStatus = request.getParameter("payment_status");

			
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO payments (order_id, payment_status, payment_date) " +
                    "VALUES (?, ?, NOW()) " +
                    "ON DUPLICATE KEY UPDATE payment_status = VALUES(payment_status), payment_date = NOW()";

       pst = con.prepareStatement(sql);
       pst.setInt(1, orderId);
       pst.setString(2, paymentStatus);

        pst.executeUpdate();
        
        response.sendRedirect("vendorproductreport");

       

       pst.close();
       con.close();


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
