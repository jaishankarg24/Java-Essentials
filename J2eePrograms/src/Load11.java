
import java.sql.*; 
import java.util.Scanner;

public class Load11
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
			
			String s = "UPDATE JUNE24VTURES SET SEM=? WHERE USN=?";
			pstmt = con.prepareStatement(s);
			for(int i=1;i<=3;i++)
			{
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter the usn");
			String USN=scan.next();
			
			System.out.println("Enter the SEM");
			int SEM=scan.nextInt();
			
			pstmt.setString(2, USN);
			pstmt.setInt(1, SEM);

			pstmt.addBatch();

			}
			pstmt.executeBatch();
	
		} 
		catch (Exception e) 
		{
			System.out.println("Some problem");
			e.printStackTrace();
		}

	}

}
