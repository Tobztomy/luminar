package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

class Students {
	int id;
	String name;
	float mark;
	String profile;

	Students(int id, String name, float mark, String profile) {
		this.id = id;
		this.name = name;
		this.mark = mark;
		this.profile = profile;
	}

//	@Override
//	public String toString() {
//		return id + "\t" + name + "\t" + mark + "\t" + profile;
//	}

}

public class StudentCollection {
	static final String URL = "jdbc:mysql://localhost:3306/luminar?useSSL=FALSE";
	static final String USER_NAME = "root";
	static final String PASS_WORD = "tobztomy";

	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
		List<Students> students = new ArrayList<Students>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER_NAME, PASS_WORD);
			pstmt = conn.prepareStatement("select * from students");
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				float mark = rs.getFloat(3);
				String profile = rs.getString(4);
				Students student = new Students(id, name, mark, profile);//FULL ARGUMENT CONSTRUCTOR
				students.add(student);
			}
			System.out.println("ID\tNAME\tMARK\tPROFILE");
			for(Students i:students) {
				//System.out.println(i);
				System.out.println(i.id+"\t"+i.name+"\t"+i.mark+"\t"+i.profile);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
