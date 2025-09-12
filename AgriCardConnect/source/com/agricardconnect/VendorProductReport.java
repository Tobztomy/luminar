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
import javax.servlet.http.HttpSession;

@WebServlet("/vendorproductreport")

public class VendorProductReport extends HttpServlet  {

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
            pst = con.prepareStatement("SELECT o.order_id, o.sample_id, o.order_date, o.order_weight, o.total_amount, o.order_status, p.payment_status, p.delivery_status, s.price, s.sample_color, s.sample_image, u.name AS customer_name, p.payment_status, p.delivery_status, p.payment_date FROM orders o JOIN samples s ON o.sample_id = s.sample_id JOIN users u ON o.user_id = u.user_id LEFT JOIN payments p ON o.order_id = p.order_id WHERE s.user_id = ?");
            pst.setInt(1, userId);
            rs = pst.executeQuery();

            out.println("<html><body>");
            
            out.println("<h1>AgricardConnect</h1><br>");
			
			
			out.println("<div style='text-align:right;'>");
			
			out.println("<a href='vendorprofile'>Profile Updation</a>&emsp;");
			out.println("<a href='vendorproductgrade'>View current Market Price</a>&emsp;");
			out.println("<a href='sampleproduct'>Add Sample</a>&emsp;");
			out.println("<a href='sellapprove'>Sell Products</a>&emsp;");
			out.println("<a href='vendorproductreport'>View payments</a>&emsp;");
			out.println("<a href='index.html'>logout</a>&emsp;");
			out.println("</div>");
			out.println("<h2>Welcome " + name+"</h2><br>");
            out.println("<h2>Report</h2>");
            out.println("<table border='1' cellpadding='8'>");
            out.println("<tr><th>SL. No.</th><th>Sample ID</th><th>Customer</th><th>Date</th>" +
                    "<th>Weight</th><th>Price/Kg</th><th>Total</th><th>Color</th><th>Image</th>" +
                    "<th>Status</th><th>Payment</th><th>Payment Date</th><th>Delivery</th></tr>");
            int i=1;
            while (rs.next()) {
                        int orderId = rs.getInt("order_id");
                        out.println("<tr>");
                        out.println("<td>" + i + "</td>");
                        out.println("<td>" + rs.getInt("sample_id") + "</td>");
                        out.println("<td>" + rs.getString("customer_name") + "</td>");
                        out.println("<td>" + rs.getDate("order_date") + "</td>");
                        out.println("<td>" + rs.getFloat("order_weight") + "</td>");
                        out.println("<td>" + rs.getFloat("price") + "</td>");
                        out.println("<td><b>" + rs.getFloat("total_amount") + "</b></td>");
                        out.println("<td>" + rs.getString("sample_color") + "</td>");

                        String imagePath = rs.getString("sample_image");
                        out.println("<td>" + (imagePath != null && !imagePath.isEmpty()
                                ? "<img src='" + imagePath + "' width='80' height='80'>" : "-") + "</td>");

                        out.println("<td>" + rs.getString("order_status") + "</td>");

                        
                       
                        String payment = rs.getString("payment_status");
                        if (payment == null || "UNPAID".equalsIgnoreCase(payment)) {
                            out.println("<td>");
                            out.println("<form action='updatepaymentstatus' method='post'>");
                            out.println("<input type='hidden' name='order_id' value='" + orderId + "'>");
                            out.println("<button type='submit' name='payment_status' value='PAID'>Mark Paid</button>");
                            out.println("</form>");
                            out.println("</td>");
                        } else {
                            out.println("<td><b>Paid</b></td>");
                        }
                        
                        out.println("<td>" + (rs.getString("payment_date") != null ? rs.getString("payment_date") : " ") + "</td>");

                        String delivery = rs.getString("delivery_status");
                        out.println("<td>");

                        
                        if (delivery == null || delivery.isEmpty()) {
                            delivery = "ORDERED"; // default if null
                        }
                        out.println("<h4>Status : " + delivery + "</h4><br>");

                        
                        if (!"DELIVERED".equalsIgnoreCase(delivery)) {
                            out.println("<form action='updatedeliverystatus' method='post'>");
                            out.println("<input type='hidden' name='order_id' value='" + orderId + "'>");
                            out.println("<select name='delivery_status'>");
                            out.println("<option value='ORDERED' "
                                    + ("ORDERED".equalsIgnoreCase(delivery) ? "selected" : "") + ">ORDERED</option>");
                            out.println("<option value='IN TRANSIT' "
                                    + ("IN_TRANSIT".equalsIgnoreCase(delivery) ? "selected" : "") + ">IN TRANSIT / SHIPPED</option>");
                            out.println("<option value='DELIVERED' "
                                    + ("DELIVERED".equalsIgnoreCase(delivery) ? "selected" : "") + ">DELIVERED</option>");
                            out.println("</select>");
                            out.println("<button type='submit'>Update</button>");
                            out.println("</form>");
                        }

                        out.println("</td>");

                        out.println("</tr>");
                        i++;
            }

            out.println("</table>");
            out.println("</body></html>");

            rs.close();
            pst.close();
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}


}
