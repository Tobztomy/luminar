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

@WebServlet("/sampleproduct")
public class SampleProduct extends HttpServlet {

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
		// Forward the request to doPost()
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			HttpSession session = request.getSession(false);
			String name = (String) session.getAttribute("user");
			int userId = (Integer) session.getAttribute("id");

			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			pst = con.prepareStatement("select * from samples where user_id=?");
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
			out.println("<h3>Add Sample </h3>");

			out.println("<form name='sampleproductsave' method='post' action='sampleproductsave' enctype='multipart/form-data'> ");
			
			
			out.println("<input type='hidden' name='user_id' value='" + userId + "'>");
			
			out.println("<label for='weight'>Weight (kg):</label>");
		    out.println("<input type='number' id='weight' name='weight' required><br><br>");

		    out.println("<label for='moisture'>Moisture level (%):</label>");
		    out.println("<input type='text' id='moisture' name='moisture' required><br><br>");

		    out.println("<label for='color'>Color:</label>");
		    out.println("<input type='text' id='color' name='color' required><br><br>");

		    out.println("<label for='price'>Price:</label>");
		    out.println("<input type='number' id='price' name='price' required><br><br>");
		    
		    out.println("<label for='image'>Upload Image:</label>");
		    out.println("<input type='file' id='image' name='image' accept='image/*' required><br><br>");

		    out.println("<label for='date'>Date:</label>");
		    out.println("<input type='date' id='date' name='date' required><br><br>");

		    out.println("<input type='submit' value='Add Sample'>");
		    
			out.println("</form>");
			
			out.println("<h4>Product Grades</h4>");
			out.println("<table border='1' cellpadding='8'>");
			out.println("<tr>");
			out.println("<th>SL No</th>");
			out.println("<th>Weight (kg)</th>");
			out.println("<th>Moisture (%)</th>");
			out.println("<th>Color</th>");
			out.println("<th>Image</th>");
			out.println("<th>Price</th>");
			out.println("<th>Date</th>");
			out.println("<th>Delete</th>");
			out.println("<th>Status</th>");
			out.println("</tr>");
			
			int i = 1;
			while (rs.next()) {
				out.println("<tr>");
				out.println("<td>" + i + "</td>");
			    out.println("<td>" + rs.getFloat("sample_weight") + "</td>");
			    out.println("<td>" + rs.getString("sample_moisture_level") + "</td>");
			    out.println("<td>" + rs.getString("sample_color") + "</td>");
			    out.println("<td>" + rs.getString("price") + "</td>");

			
			    out.println("<td>");
			    String imagePath = rs.getString("sample_image");
			    if (imagePath != null && !imagePath.isEmpty()) {
			        out.println("<img src='" + imagePath + "' width='100' height='100'>");
			    }
			    out.println("</td>");
			    
			    out.println("<td>" + rs.getDate("sample_date") + "</td>");
			    out.println("<td><a href='deletesampleproduct?id=" + rs.getInt("sample_id") + "'>Delete</a></td>");

			    
			    String status = rs.getString("sample_status");
			    if (status == null || status.isEmpty()) status = "Pending";
			    out.println("<td>" + status + "</td>");
			    
			    
			    out.println("</tr>");
				i++;
			}

			out.println("</body>");
			out.println("</html>");
			out.close();

		} catch (IOException | SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}


