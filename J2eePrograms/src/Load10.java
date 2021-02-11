
import java.sql.*; 
import java.util.Scanner;

public class Load10
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
			
			String s = "INSERT INTO JUNE24VTURES VALUES(?,?,?,?,?)";
			pstmt = con.prepareStatement(s);
			con.setAutoCommit(false);
			for(int i=1;i<=3;i++)
			{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the name");
			String NAME=scan.next();
			
			System.out.println("Enter the usn");
			String USN=scan.next();
			
			System.out.println("Enter the marks1");
			int MARKS1=scan.nextInt();
			
			System.out.println("Enter the marks2");
			int MARKS2=scan.nextInt();
			
			System.out.println("Enter the marks3");
			int MARKS3=scan.nextInt();
			
			pstmt.setString(1, NAME);
			pstmt.setString(2, USN);
			pstmt.setInt(3, MARKS1);
			pstmt.setInt(4,MARKS2);
			pstmt.setInt(5, MARKS3);
			int x=pstmt.executeUpdate();
			System.out.println(i+ "Row inserted succussfully");
			}
			con.commit();
		} 
		catch (Exception e) 
		{
			System.out.println("Some problem");
			e.printStackTrace();
		}

	}

}