package BankingTransection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

class ICICbank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;

		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/bank ? user=root & password=Raghav@123 ";

		String sql1 = "update icicbank set balence=balence-? where userID=? and passworld=?";
		String sql2 = "update icicbank set balence=balence+? where userID= ?";
		try {
			Class.forName(dpath);
			con = DriverManager.getConnection(url);
			ps1 = con.prepareStatement(sql1);
			ps2 = con.prepareStatement(sql2);

			System.out.println("Enter the userId and passWorld");
			int fid = sc.nextInt();
			String pwd = sc.next();

			System.out.println("Enter the useid where we have to send money");
			int tid = sc.nextInt();

			System.out.println("enter the amout which you want to send");
			int amt = sc.nextInt();
			ps1.setInt(1,amt);
			ps1.setInt(2, fid);
			ps1.setString(3, pwd);
			ps2.setInt(1, amt);
			ps2.setInt(2, tid);
			con.setAutoCommit(false);
			int res = ps1.executeUpdate();
			int res2 = ps2.executeUpdate();
			con.commit();
			System.out.println((res+res2)+" row updated");

		} catch (Exception e) {
			// TODO: handle exception
			try {
				con.rollback();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null) con.close();
				if(ps1!=null) ps1.close();
				if(ps2!=null) ps2.close();
				
				if(sc!=null) sc.close();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}