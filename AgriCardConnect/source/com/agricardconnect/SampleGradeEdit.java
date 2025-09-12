package com.agricardconnect;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/editsamplegrade")
public class SampleGradeEdit extends HttpServlet{

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
	
	RequestDispatcher dis = null;

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
			
			int pid=Integer.parseInt(request.getParameter("id"));
			pst = con.prepareStatement("select * from sample_grade where grade_id=? ");
			
			pst.setInt(1, pid);
			
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
			out.println("<h2>Sample Grade Edit</h2><br>");
			
			
			
			while(rs.next()) {
				out.println("<form name='updatesamplegrade' method='post' action='updatesamplegrade'>");
				
				out.println("<input type='hidden' name='productId' value='" + rs.getInt(1) + "'>");

                out.println("<label>Moisture (%):</label>");
                out.println("<input type='text' name='moisture' value='" + rs.getString(2) + "' required><br><br>");

                out.println("<label>Color:</label>");
                out.println("<input type='text' name='color' value='" + rs.getString(3) + "' required><br><br>");

                out.println("<label>Price per kg:</label>");
                out.println("<input type='number' name='price' value='" + rs.getFloat(4) + "' required><br><br>");

                out.println("<label>Grade:</label>");
                out.println("<input type='text' name='grade' value='" + rs.getString(5) + "' required><br><br>");

                out.println("<input type='submit' value='Update'>");
                out.println("</form>");
                out.println("</body></html>");
                out.close();

			
			}
			
		} catch (IOException | SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}
