package com.jai.conn;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadDriver {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String un="system";
		String pw="system";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successfully");
			
			DriverManager.getConnection(url, un, pw);
			System.out.println("Connection Established successfully");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Some Problem");
			e.printStackTrace();
		}
		
	}

}