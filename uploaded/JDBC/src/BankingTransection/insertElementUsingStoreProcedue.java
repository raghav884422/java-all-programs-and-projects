package BankingTransection;



import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;
public class insertElementUsingStoreProcedue {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Connection con = null;
			CallableStatement cs = null;

			String dpath = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/bank ? user=root & password=Raghav@123 ";

			String sql1 = "call insertCostumer(?,?,?,?,?)";
			try {
				Class.forName(dpath);
				con = DriverManager.getConnection(url);
				cs=con.prepareCall(sql1);
				System.out.println("insert id ,name,mobile number,password,balance");
			    cs.setInt(1, sc.nextInt());
			    cs.setString(2, sc.next());
			    cs.setInt(3, sc.nextInt());
			    cs.setString(4, sc.next());
			    cs.setInt(5, sc.nextInt());
			    boolean res =cs.execute();
			    if(res) {
			    ResultSet rs= cs.getResultSet();
			   
//			    ResultSetMetaData rsmd =rs.getMetaData();
//			    for(int i =1;i<=rsmd.getColumnCount();i++) {
//			    	if(rsmd.getColumnTypeName(i).equals("Integer")) {
//			    		System.out.println(rs.getInt(i));
//			    	}
//			    	else if(rsmd.getColumnTypeName(i).equals("String")) {
//			    		System.out.println(rs.getString(i));
//			    	}
//			    }
//			    }
//			    else {
//			    	int result = cs.getUpdateCount();
//			    	System.out.println(result+ " row affected");
//			    }
			    while(rs.next()) {
			    	System.out.println(rs.getInt(1)+rs.getString(2)+rs.getInt(3)+rs.getString(4)+rs.getInt(5));
			    }
			    }
			    }

				
				
				

			 catch (Exception e) {
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
					
					
					if(sc!=null) sc.close();
				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
