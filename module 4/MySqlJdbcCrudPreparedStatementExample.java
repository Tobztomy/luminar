package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MySqlJdbcCrudPreparedStatementExample {
	static final String URL = "jdbc:mysql://localhost:3306/luminar?useSSL=FALSE";
	static final String USER_NAME = "root";
	static final String PASS_WORD = "tobztomy";

	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	static boolean flag = false;

	public static boolean insert(String name, float mark, String status) {
		try {
			String sql = "insert into students(student_name,student_mark,student_profile) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setFloat(2, mark);
			pstmt.setString(3, status);
			pstmt.executeUpdate();
			flag = true;
		} catch (SQLException sql) {
			sql.printStackTrace();

		}
		return flag;

	}

	public static boolean update(String name, float mark, String status, int id) {
		try {
			String sql = "update students set student_name =?,student_mark=?,student_profile=? where student_id=? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setFloat(2, mark);
			pstmt.setString(3, status);
			pstmt.setInt(4, id);
			pstmt.executeUpdate();
			flag = true;
		} catch (SQLException sql) {
			sql.printStackTrace();

		}
		return flag;

	}

	public static boolean select(int id) {
		try {
			String sql = "SELECT * FROM students where student_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			System.out.println("ID\tNAME\tMARKS\tPROFILE");

			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3) + "\t" + rs.getString(4));
				flag = true;
			}
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
		return flag;
	}

	public static boolean delete(int id) {
		try {
			String sql = "DELETE FROM students WHERE student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			flag = true;
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int id;
		String name;
		float mark;
		String status;
		int choice;
		boolean flag = false;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER_NAME, PASS_WORD);

			while (true) {
				System.out.println("\n------ STUDENT CRUD MENU ------");
				System.out.println("1. Insert Student");
				System.out.println("2. Update Student");
				System.out.println("3. Select Student");
				System.out.println("4. Delete Student");
				System.out.println("5. Exit");
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();
				sc.nextLine();

				switch (choice) {
				case 1:
					System.out.print("Enter name: ");
					name = sc.nextLine();
					System.out.print("Enter mark: ");
					mark = sc.nextFloat();
					sc.nextLine();
					System.out.print("Enter profile: ");
					status = sc.nextLine();
					flag = insert(name, mark, status);
					if (flag) {
						System.out.println("inserted");
					} else {
						System.out.println("error");
					}
					break;

				case 2:
					System.out.print("Enter ID to update: ");
					id = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter new name: ");
					name = sc.nextLine();
					System.out.print("Enter new mark: ");
					mark = sc.nextFloat();
					sc.nextLine();
					System.out.print("Enter new profile: ");
					status = sc.nextLine();
					flag = update(name, mark, status, id);
					if (flag) {
						System.out.println("updated");
					} else {
						System.out.println("error");
					}
					break;

				case 3:
					System.out.print("Enter ID to select: ");
					id = sc.nextInt();
					flag = select(id);
					if (flag) {
						System.out.println("updated");
					} else {
						System.out.println("error");
					}
					break;

				case 4:
					System.out.print("Enter ID to delete: ");
					id = sc.nextInt();
					flag = delete(id);
					if (flag) {
						System.out.println("deleted");
					} else {
						System.out.println("error");
					}
					break;

				case 5:
					System.exit(0);
					break;

				default:
					System.out.println("Invalid choice. Try again.");
					break;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}
		sc.close();
	}

}
