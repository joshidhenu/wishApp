import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;


public class Pra2 extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest Req,HttpServletResponse res)
			throws ServletException,IOException  
			{
				res.setContentType("text/html");
				PrintWriter pw=res.getWriter();
				Calendar cal=Calendar.getInstance();
				int hour=cal.get(Calendar.HOUR_OF_DAY);
				if(hour<12)
					pw.println("Good Morning!!");
				else if(hour<-16)
					pw.println("Good Afternoon");
				else if(hour<20)
					pw.println("Good Evening");
				else
					pw.println("Good Night");
				
				pw.println("<br><br><a href='http://localhost:8080/WishApp/index.html'>Home</a>");
				pw.close();
				
			}

}
