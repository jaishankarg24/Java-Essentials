import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class LoadingDrive {

	public static void main(String[] args) {
		try 
		{
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver loaded Successfully");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("some problem");
			e.printStackTrace();
		// TODO Auto-generated method stub

	}

}
}
