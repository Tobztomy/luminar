package com.agricardconnect;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/selectitemquantity")
public class SelectItemQuantity extends HttpServlet {

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
        	
        	int id = Integer.parseInt(request.getParameter("user_id"));
            int sampleId = Integer.parseInt(request.getParameter("sample_id"));
            float buyWeight = Float.parseFloat(request.getParameter("buy_weight"));
            float price = Float.parseFloat(request.getParameter("price"));
            float totalAmount = buyWeight * price;
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT sample_weight FROM samples WHERE sample_id = ?");
            pst.setInt(1, sampleId);
            rs = pst.executeQuery();
            
            while(rs.next()) {
                float availableWeight = rs.getFloat("sample_weight");
                
                if (buyWeight > availableWeight) {
                    response.getWriter().println("Error: Requested weight exceeds available stock!");
                } else {
                    // Update remaining weight
                    PreparedStatement updatePst = con.prepareStatement("UPDATE samples SET sample_weight = ? WHERE sample_id = ?");
                    updatePst.setFloat(1, availableWeight - buyWeight);
                    updatePst.setInt(2, sampleId);
                    updatePst.executeUpdate();

                    updatePst.close();
                }
 

            PreparedStatement insertPst = con.prepareStatement( "INSERT INTO orders (user_id, sample_id, order_weight, order_date,total_amount,order_status) VALUES (?,?,?, ?, ?, ?)");
            insertPst.setInt(1, id);
			insertPst.setInt(2, sampleId);
			insertPst.setFloat(3, buyWeight);
			insertPst.setDate(4, new Date(System.currentTimeMillis())); // current date
			insertPst.setFloat(5, totalAmount);
			insertPst.setString(6, "pending");
            insertPst.executeUpdate();
            response.sendRedirect("buyproduct");
            rs.close();
            pst.close();
            con.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
