import java.sql.DriverManager;
import java.sql.SQLException;

public class Load1
{

	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String un="system";
		String pw="123";
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully");
			
			DriverManager.getConnection(url, un, pw);
			System.out.println("connection established");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Some problem");
			e.printStackTrace();
		}
	}

}
