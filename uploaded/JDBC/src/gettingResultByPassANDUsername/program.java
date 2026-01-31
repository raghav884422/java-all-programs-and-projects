package gettingResultByPassANDUsername;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/marksOfStudent";
		String username = "root";
		String pass = "Raghav@123";
		String sql = "select * from student where username =? and passworld =?";
		
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url,username,pass);
			ps = con.prepareStatement(sql);
			System.out.println("enter username and passworld ");
			String user = sc.next();
			String passworld =sc.next();
			ps.setString(1, user);
			ps.setString(2, passworld);
			rs = ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			}else {
				InvalidUsernamePassword in = new InvalidUsernamePassword();
				System.out.println(in.getMessage());
			}
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null) con.close();
				if(ps!=null) ps.close();
				if(rs!=null) rs.close();
				if(sc!=null) sc.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
				
   }
}