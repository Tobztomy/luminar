package com.agricardconnect;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/sampleproductsave")

@MultipartConfig(
	    fileSizeThreshold = 1024 * 1024, // 1MB
	    maxFileSize = 1024 * 1024 * 10,  // 10MB
	    maxRequestSize = 1024 * 1024 * 15 // 15MB
	)

public class SampleProductSave extends HttpServlet{

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
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			
			
			int id = Integer.parseInt(request.getParameter("user_id"));
			
			float weight = Float.parseFloat(request.getParameter("weight"));
            String moisture = request.getParameter("moisture");
            String color = request.getParameter("color");
            
            String uploadPath = getServletContext().getRealPath("/images");
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()) uploadDir.mkdirs();

            Part filePart = request.getPart("image");
            String fileName = new File(filePart.getSubmittedFileName()).getName();
            filePart.write(uploadPath + File.separator + fileName);

            String fileDbPath = "images/" + fileName;
            
            float price = Float.parseFloat(request.getParameter("price"));
            
            String dateStr = request.getParameter("date"); 
            
            java.sql.Date sqlDate;
            
            try {
                sqlDate = java.sql.Date.valueOf(dateStr);  // expects format yyyy-MM-dd
            } catch (IllegalArgumentException e) {
                throw new ServletException("Invalid date format. Use yyyy-MM-dd", e);
            }
            
			
			pst = con.prepareStatement("INSERT INTO samples (sample_weight, sample_moisture_level, sample_color, sample_image, price,sample_date, sample_status,user_id)VALUES (?, ?, ?, ?, ?, ?, ?,?)");
			pst.setFloat(1, weight);
            pst.setString(2, moisture);
            pst.setString(3, color);
            pst.setString(4, fileDbPath);
            pst.setFloat(5, price);
            
            pst.setDate(6, sqlDate);
            pst.setString(7, "Pending");
            pst.setInt(8, id);
			pst.executeUpdate();
			
			
			response.sendRedirect("sampleproduct");
			
		}catch (IOException | SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}

}

}
