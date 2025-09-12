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

@WebServlet("/updateorderstatus")
public class UpdateSellStatus extends HttpServlet {

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
            String action = request.getParameter("action");
            

			
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            
            String query = "UPDATE orders SET order_status = ? WHERE order_id = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, action);
            pst.setInt(2, orderId);
            pst.executeUpdate();

            response.sendRedirect("sellapprove");
            pst.close();
            con.close();

        }  catch (IOException | SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
    }
}
