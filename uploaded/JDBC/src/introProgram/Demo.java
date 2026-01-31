package introProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class demo {
	public static void main(String[] args) {
		String dpath = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/school";
		String user = "root";
		String pass = "Raghav@123";
		Connection con = null;
		Statement stm = null;
		String sql = "select * from student";
		ResultSet rs = null;
		
		try {
//			Step 1 - Loading the driver
			Class.forName(dpath);
			System.out.println("Driver Loaded");
//			Step 2 - Establish connection
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection established");
//			step - 3 Create the medium
			stm=con.createStatement();
			System.out.println("Statement created");
//			step - 4 Query
			rs = stm.executeQuery(sql);
//			Display the result data 
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+ rs.getString(3)+" "+rs.getInt(4));
			}
				
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				stm.close();
				rs.close();
			}
			catch (Exception e ) {
				e.printStackTrace();
			}
		}
	}
}