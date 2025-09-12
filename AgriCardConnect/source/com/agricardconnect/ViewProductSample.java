package com.agricardconnect;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/viewproductsample")
public class ViewProductSample extends HttpServlet {

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

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            
            HttpSession session = request.getSession(false);
            int userId = (Integer) session.getAttribute("id");
            String name = (String) session.getAttribute("user");
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            pst = con.prepareStatement("SELECT * FROM samples WHERE sample_status = 'Approved'");
            rs = pst.executeQuery();
            
            out.println("<html><body>");
            
            out.println("<h1>AgricardConnect</h1><br>");
			
			
			out.println("<div style='text-align:right;'>");
			out.println("<a href='customerprofile'>Profile</a>&emsp;");
			out.println("<a href='customerproductgrade'>Current Market Price</a>&emsp;");
			
			out.println("<a href='viewproductsample'>View Samples</a>&emsp;");
			out.println("<a href='buyproduct'>Purchase Details</a>&emsp;");
			out.println("<a href='customerproductreport'>report</a>&emsp;");
			
			out.println("<a href='index.html'>logout</a>&emsp;");
			out.println("</div>");
			out.println("<h2>" + name+"</h4><br>");
            out.println("<h4>Purchase Products Here</h4>");
            out.println("<table border='1' cellpadding='8'>");
            out.println("<tr>");
            out.println("<th>SL No</th>");
            out.println("<th>Weight (kg)</th>");
            out.println("<th>Moisture (%)</th>");
            out.println("<th>Color</th>");
            out.println("<th>Image</th>");
            out.println("<th>Date</th>");
            out.println("<th>Price per Kg (₹)</th>");
            out.println("<th>Action</th>");
            out.println("</tr>");
            
            int i = 1;
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + i + "</td>");
                out.println("<td>" + rs.getFloat("sample_weight") + "</td>");
                out.println("<td>" + rs.getString("sample_moisture_level") + "</td>");
                out.println("<td>" + rs.getString("sample_color") + "</td>");

                String imagePath = rs.getString("sample_image");
                out.println("<td>");
                if (imagePath != null && !imagePath.isEmpty()) {
                    out.println("<img src='" + imagePath + "' width='100' height='100'>");
                }
                out.println("</td>");

                out.println("<td>" + rs.getDate("sample_date") + "</td>");
                out.println("<td>" + rs.getFloat("price") + "</td>");

                // Buy button
                out.println("<td>");
                out.println("<form name='selectitemquantity' method='post' action='selectitemquantity'>");
                out.println("<input type='hidden' name='user_id' value='" + userId + "'>");
                out.println("<input type='hidden' name='price' value='" + rs.getFloat("price") + "'>");
                out.println("<input type='hidden' name='sample_id' value='" + rs.getInt("sample_id") + "'>");
                out.println("Weight (kg): <input type='number' name='buy_weight' step='0.01' min='0.01' max='" + rs.getFloat("sample_weight") + "' required>");
                out.println("<input type='submit' value='Buy'>");
                out.println("</form>");
                out.println("</td>");

                out.println("</tr>");
                i++;
                
            }
            out.println("</table>");
            out.println("</body></html>");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
