import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Generic extends GenericServlet {
    public void service(ServletRequest request,ServletResponse response)
    throws ServletException, IOException {
    PrintWriter pw=response.getWriter();
    pw.println("Developing Servlet by GenericServlet");
    System.out.println("This is Service() in First Servlet ");
    }
 }