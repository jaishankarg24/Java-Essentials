

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

public void service(HttpServletRequest req, HttpServletResponse res) 
{
	try
	{
		PrintWriter pw=res.getWriter();
		pw.println("<html>");
		pw.println("<html>");
		pw.println("<title>Hi...</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<p>Hello Everyone</p>");
		pw.println("</body>");
		pw.println("</html>");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
