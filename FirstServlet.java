
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class FirstServlet implements Servlet {
static {
System.out.println("Servlet class loading");
}
public FirstServlet () {
	
	System.out.println("servlet instantiation");
	}
	ServletConfig config;
	public void init(ServletConfig config ) throws ServletException {
	this.config=config;
	System.out.println(" we are in init( ) method ");
	}
	public void service(ServletRequest request, ServletResponse response)
	throws ServletException, IOException {
	System.out.println("We are in service( ) method ");
	PrintWriter out=response.getWriter();
	out.println("welcome to SCWCD");
	}
	public void destroy() {
	System.out.println("We are in destroy() method ");
	}
	public ServletConfig getServletConfig( ) {
	return null ;
	}
	public String getServletInfo() {
	return "Written by Jobs4Times " ;
	}
}