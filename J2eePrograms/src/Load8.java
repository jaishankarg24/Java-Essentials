
import java.sql.*; 
import java.util.Scanner;

public class Load8
{

	public static void main(String[] args) throws SQLException
	{

		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String un="system";
		String pw="123";
		Connection con;
		PreparedStatement pstmt;
	
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully");
			
			con = DriverManager.getConnection(url, un, pw);
			System.out.println("connection established");
			
			String s = "UPDATE JUNE24VTURES SET MARKS2=? WHERE USN=?";
			pstmt = con.prepareStatement(s);
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter the usn");
			String USN=scan.next();
			System.out.println("Enter the MARKS2");
			int m2=scan.nextInt();
			pstmt.setString(2, USN);
			pstmt.setInt(1, m2);
			int x=pstmt.executeUpdate();
			System.out.println(" ROW updated succussfully");
			System.out.println("no of rows affected:" +x);
	
		} 
		catch (Exception e) 
		{
			System.out.println("Some problem");
			e.printStackTrace();
		}

	}

}
