package firstjavaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebService(name="/addition" )
public class MyFirstController  extends HttpServlet
{
 
	private static final long serialVersionUID = 1L;
  
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	String s1=req.getParameter("a1");
	String s2=req.getParameter("a2");
	
	int i1=Integer.parseInt(s1);
	int i2=Integer.parseInt(s2);
	int total=i1+i2;
	
	PrintWriter pw=resp.getWriter();
	pw.println("<html><body>");  
	pw.println("Welcome to servlet"); 
	pw.print("your total value is "+total );
	pw.println("</body></html>");  
	
	
	}
	
	
	
	
}
