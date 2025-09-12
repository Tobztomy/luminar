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

@WebServlet("/adminproductreport")
public class AdminReport extends HttpServlet{

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
			String name = (String) session.getAttribute("user");
			
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            
            String sql = "SELECT o.order_id, o.sample_id, o.order_date, o.order_weight, o.total_amount, o.order_status, p.payment_status, p.payment_date, p.delivery_status, s.price, s.sample_color, s.sample_image, u_customer.name AS customer_name, u_vendor.name AS vendor_name FROM orders o JOIN samples s ON o.sample_id = s.sample_id JOIN users u_customer ON o.user_id = u_customer.user_id JOIN users u_vendor ON s.user_id = u_vendor.user_id LEFT JOIN payments p ON o.order_id = p.order_id";

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();


            out.println("<html><body>");
            out.println("<h1>AgricardConnect</h1>");
			out.println("<div style='text-align:right;'>");

			out.println("<a href='customeruserprofile'>customers</a>&emsp;");
			out.println("<a href='vendoruserprofile'>Vendors</a>&emsp;");
			out.println("<a href='samplegrade'>Sample Grade Types</a>&emsp;");
			out.println("<a href='sampleproductapprove'>Approve Product</a>&emsp;");
			out.println("<a href='adminproductreport'>Report</a>&emsp;");
			out.println("<a href='index.html'>logout</a>&emsp;");
			out.println("</div><br><br>");
			out.println("<h1>Welcome " + name + "</h1><br>");
            out.println("<h2>All Product Orders (Admin View)</h2>");
            out.println("<table border='1' cellpadding='8'>");
            out.println("<tr><th>SL. No.</th><th>Sample ID</th><th>Vendor</th><th>Customer</th><th>Date</th>" +
                        "<th>Weight</th><th>Price/Kg</th><th>Total</th><th>Color</th><th>Image</th>" +
                        "<th>Order Status</th><th>Payment</th><th>Payment Date</th><th>Delivery</th></tr>");
            int i=1;
            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + i + "</td>");
                out.println("<td>" + rs.getInt("sample_id") + "</td>");
                out.println("<td>" + rs.getString("vendor_name") + "</td>");
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
                out.println("<td>" + (rs.getString("payment_status") != null ? rs.getString("payment_status") : " ") + "</td>");
                out.println("<td>" + (rs.getString("payment_date") != null ? rs.getString("payment_date") : " ") + "</td>");
                out.println("<td>" + (rs.getString("delivery_status") != null ? rs.getString("delivery_status") : " ") + "</td>");
                out.println("</tr>");
                i++;
            }

            out.println("</table>");
            out.println("</body></html>");

            rs.close();
            pst.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

