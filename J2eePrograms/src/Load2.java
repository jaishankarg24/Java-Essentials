
import java.sql.*;

public class Load2 
{

	public static void main(String[] args) throws SQLException 
	{

		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String un="system";
		String pw="123";
		Connection con;
		Statement stmt;
		ResultSet res;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully");
			
			con = DriverManager.getConnection(url, un, pw);
			System.out.println("connection established");
			
			String s = "SELECT * FROM JUNE24VTURES";
			stmt = con.createStatement();
			
			res = stmt.executeQuery(s);
			
			while(res.next()==true)
			{
				String a = res.getString(1);
				String b = res.getString(2);
				String c = res.getString(3);
				String d = res.getString(4);
				String e = res.getString(5);
				
				System.out.println(a+"  "+b+"  "+c+"  "+d+"  "+e);
			}
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Some problem");
			e.printStackTrace();
		}

	}

}
