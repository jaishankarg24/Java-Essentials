

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.OracleDriver;


public class GetResult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Connection con;
       PreparedStatement pstmt;
       ResultSet resset;
    public void init() throws ServletException
      {
    	String url="jdbc:oracle:thin:@//localhost:1521/XE";
    	String un="system";
    	String pw="123";
    	
    	try
    	{
    		DriverManager.registerDriver(new OracleDriver());
    		con = DriverManager.getConnection(url, un, pw);
    		System.out.println("Driver loaded and connection established");
    	}
    	
    	catch(SQLException e)
    	{
    		System.out.println("Some Problem");
 
    				
    	}
    	
    }
    
   
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException 
    {
    	try
    	{
    		String s="SELECT * FROM JUNE24VTURES WHERE USN=?";
    		pstmt=con.prepareStatement(s);
    		
    		String temp= req.getParameter("USN");
    		pstmt.setString(1, temp);
    		resset = pstmt.executeQuery();
    		
    		while(resset.next()==true)
    		{
    			String name=resset.getString(1);
    			String usn=resset.getString(2);
    			int m1=resset.getInt(3);
    			int m2=resset.getInt(4);
    			int m3=resset.getInt(5);
    			int sem=resset.getInt(6);
    			
    			PrintWriter pw=res.getWriter();
    			pw.println(name+" "+usn+" "+m1+" "+m2+" "+m3+" "+sem);
    			
    		}
    		
    	}
    	catch (SQLException e)
    	{
    		System.out.println("SOme problem in bussiness logic");
    	}
    }
    
    
    public void destroy() 
    {
    	try
    	{
    		con.close();
    	}
    	catch (SQLException e)
    	{
    		e.printStackTrace();
    	}
    	
    }
   
}
