

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet 
{
	public void srvice(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		try
		{
			res.sendRedirect("/ServletExample/Message.html");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
