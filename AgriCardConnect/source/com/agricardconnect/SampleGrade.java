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

@WebServlet("/samplegrade")
public class SampleGrade extends HttpServlet {

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

			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			pst = con.prepareStatement("select * from sample_grade");
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
			out.println("<h4>Add Product Grades</h4>");

			out.println("<form name='samplegradesave' method='post' action='samplegradesave'>");

			out.println("<label for='moisture'>Moisture (%)</label>");
			out.println("<input type='text' id='moisture' name='moisture'required><br><br>");

			out.println("<label for='color'>Color</label>");
			out.println("<input type='text' id='color' name='color' required><br><br>");

			out.println("<label for='price'>Price per kg</label>");
			out.println("<input type='number' id='price' name='price' required><br><br>");

			out.println("<label for='grade'>Grade</label>");
			out.println("<input type='text' id='grade' name='grade' required><br><br>");

			out.println("<input type='submit' value='Save'>");

			out.println("</form>");
			
			out.println("<h4>Product Grades</h4>");

			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<th>SL No</th>");
			out.println("<th>Moisture (%)</th>");
			out.println("<th>Color</th>");
			out.println("<th>Price per kg</th>");
			out.println("<th>Grade</th>");
			out.println("<th colspan='2'>Action</th>");
			out.println("</tr>");
			
			int i = 1;
			while (rs.next()) {
				out.println("<tr>");
			    out.println("<td>" + i + "</td>");
			    out.println("<td>" + rs.getString(2) + "</td>");
			    out.println("<td>" + rs.getString(3) + "</td>");
			    out.println("<td>" + rs.getFloat(4) + "</td>");
			    out.println("<td>" + rs.getString(5) + "</td>");
			    out.println("<td><a href='editsamplegrade?id=" + rs.getInt(1) + "'>Edit</a></td>");
			    out.println("<td><a href='deletesamplegrade?id=" + rs.getInt(1) + "'>Delete</a></td>");
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
