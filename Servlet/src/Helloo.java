

import java.io.IOException; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Helloo extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse res) 
	{
		try 
		{
			res.sendRedirect("/Servlet/message.html");
		} 
		catch (IOException e)
		{
		
			e.printStackTrace();
		}
	}
	

}
