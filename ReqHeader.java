import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReqHeader extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {
        PrintWriter out = response.getWriter( ) ;
        Enumeration e = request.getHeaderNames( ) ;
            while(e.hasMoreElements( ) ) {
            String hname=(String)e.nextElement( );
            String hvalue=request.getHeader(hname);
            out.println(hname+"------"+hvalue);
        }
    }
}