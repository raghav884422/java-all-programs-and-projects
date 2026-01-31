package gettingResultByPassANDUsername;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class InsertingRowInDatabase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	PreparedStatement ps = null;

	String dpath = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/marksOfStudent ? user=root & password=Raghav@123 ";
	
	String sql = "insert into student values (?,?,?,?,?,?)";
	try {
		Class.forName(dpath);
		con = DriverManager.getConnection(url);
		ps = con.prepareStatement(sql);
		System.out.println("Enter -id,name,age,marks,username,passworld");
		int id = sc.nextInt();
		String name = sc.next();
		int age = sc.nextInt();
		int marks = sc.nextInt();
		String username = sc.next();
		String pswd = sc.next();
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.setInt(4, marks);
		ps.setString(5, username);
		ps.setString(6, pswd);
		int res = ps.executeUpdate();
		System.out.println(res+" row affected");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(con!=null) con.close();
			if(ps!=null) ps.close();
			
			if(sc!=null) sc.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
}
}
