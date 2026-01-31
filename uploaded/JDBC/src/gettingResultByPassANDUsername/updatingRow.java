package gettingResultByPassANDUsername;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class updatingRow {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	PreparedStatement ps = null;

	String dpath = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/marksOfStudent ? user=root & password=Raghav@123 ";
	
	String sql = "update student set marks = ? where id =?";
	try {
		Class.forName(dpath);
		con = DriverManager.getConnection(url);
		ps = con.prepareStatement(sql);
		System.out.println("Enter - marks  and id ");
	
		int marks = sc.nextInt();
		int id = sc.nextInt();
	
		ps.setInt(1, marks);
	
		ps.setInt(2, id);
	
		int res = ps.executeUpdate();
		System.out.println(res+" row updated");
		
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
