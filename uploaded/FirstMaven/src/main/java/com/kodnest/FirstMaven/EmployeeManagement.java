package com.kodnest.FirstMaven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeManagement {
	Scanner sc = new Scanner(System.in);
	Connection con = null;

	String dpath = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/employee ? user=root & password=Raghav@123 ";

	public EmployeeManagement() {
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void getEmployeeById(int id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select * from employee where id=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4)
						+ " " + rs.getString(5));
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				rs.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

	void getAllEmployee() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			String sql = "select * from employee";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4)
						+ " " + rs.getInt(5));
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				rs.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

	void addEmployee(int id, String name, int salary, String email, String type) {
//			creat ps
//			set data to ps 
//			Queey to insert
//          display the no. of row affected 
//			close ps
		PreparedStatement ps = null;

		try {
			String sql = "insert into employee values(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			ps.setString(4, email);
			ps.setString(5, type);
			int rs = ps.executeUpdate();
			System.out.println(rs + "row affecred");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				ps.close();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

	void update(int id) {
//			creat ps 
//			display menue a= update name b= saray c type other invailid
//			create ps in perticular case 
//			set data in prepared statement 
//			exicute quey
//          display the no. of row affected 
//			close wirh null checks

		System.out.println("enter your choice  A: update name/ B: update salary/ C: update type");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'A': {
			try {
				String sql = "update employee set name =? where id =?";
				PreparedStatement ps = con.prepareStatement(sql);
				String name = sc.next();
				ps.setString(1, name);
				ps.setInt(2, id);
				int res = ps.executeUpdate();
				System.out.println(res + " row affected");

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();

			}

			break;
		}
		case 'B': {
			try {
				String sql = "update employee set salary =? where id =?";
				PreparedStatement ps = con.prepareStatement(sql);
				int salary = sc.nextInt();
				ps.setInt(1, salary);
				ps.setInt(2, id);
				int res = ps.executeUpdate();
				System.out.println(res + " row affected");

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();

			}

			break;
		}
		case 'C': {
			try {
				String sql = "update employee set type =? where id =?";
				PreparedStatement ps = con.prepareStatement(sql);
				String type = sc.next();
				ps.setString(1, type);
				ps.setInt(2, id);
				int res = ps.executeUpdate();
				System.out.println(res + " row affected");

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();

			}

			break;
		}
		default:
			System.out.println("Put the proper input to perform updation");
			update(id);
		}

	}

	void deleteEmployee(int id) {
//			creat ps
//			set data to ps 
//			Queey to insert
//          display the no. of row affected 
//			close ps
		try {
			String sql = "delete from employee where id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int res = ps.executeUpdate();
			System.out.println(res + "row affected");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
