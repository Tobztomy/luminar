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

@WebServlet("/sampleproductapprove")
public class SampleProductApprove extends HttpServlet {

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
            pst = con.prepareStatement("SELECT * FROM samples");
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
			out.println("<h2>Approve or Reject Product Samples</h2>");

            out.println("<table border='1' cellpadding='8'>");
            out.println("<tr>");
            out.println("<th>SL No</th>");
            out.println("<th>Weight (kg)</th>");
            out.println("<th>Moisture (%)</th>");
            out.println("<th>Color</th>");
            out.println("<th>Price</th>");
            out.println("<th>Image</th>");
            out.println("<th>Date</th>");
            out.println("<th>Status</th>");
            out.println("<th>Action</th>");
            out.println("</tr>");

            int i = 1;
            while (rs.next()) {
                int sampleId = rs.getInt("sample_id");
                String status = rs.getString("sample_status");
                if (status == null || status.isEmpty()) status = "Pending";

                out.println("<tr>");
                out.println("<td>" + i + "</td>");
                out.println("<td>" + rs.getFloat("sample_weight") + "</td>");
                out.println("<td>" + rs.getString("sample_moisture_level") + "</td>");
                out.println("<td>" + rs.getString("sample_color") + "</td>");
                out.println("<td>" + rs.getString("price") + "</td>");

                String imagePath = rs.getString("sample_image");
                out.println("<td>");
                if (imagePath != null && !imagePath.isEmpty()) {
                    out.println("<img src='" + imagePath + "' width='100' height='100'>");
                }
                out.println("</td>");

                out.println("<td>" + rs.getDate("sample_date") + "</td>");
                out.println("<td>" + status + "</td>");

                // Approve/Reject buttons
                out.println("<td>");
                if (!status.equals("Approved")) {
                    out.println("<a href='updatesamplestatus?id=" + sampleId + "&status=Approved'>Approve</a> ");
                }
                if (!status.equals("Rejected")) {
                    out.println("<a href='updatesamplestatus?id=" + sampleId + "&status=Rejected'>Reject</a>");
                }
                out.println("</td>");

                out.println("</tr>");
                i++;
            }

            out.println("</table>");
            out.println("</body></html>");
            out.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
