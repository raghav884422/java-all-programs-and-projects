package gettingResultByPassANDUsername;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeletingRowFormDatabase {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;

		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/marksOfStudent ? user=root & password=Raghav@123 ";
		
		String sql = "delete from student where id = ?";
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url);
			ps = con.prepareStatement(sql);
			System.out.println("Enter id of sudent");
			int id = sc.nextInt();
		
			ps.setInt(1, id);
	
			int res = ps.executeUpdate();
			System.out.println(res+" row deleted");
			
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

