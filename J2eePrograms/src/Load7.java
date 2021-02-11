
import java.sql.*; 
import java.util.Scanner;

public class Load7
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
			
			String s = "DELETE FROM JUNE24VTURES WHERE USN=?";
			pstmt = con.prepareStatement(s);
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter the usn whose values has to be deleted");
			String USN=scan.next();
			
			
			pstmt.setString(1, USN);
			pstmt.executeUpdate();
			System.out.println("ONE ROW DELETED succussfully");

	
		} 
		catch (Exception e) 
		{
			System.out.println("Some problem");
			e.printStackTrace();
		}

	}

}