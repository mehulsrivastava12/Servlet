import java.io.Serializable;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public abstract class GenericServlet implements Servlet , ServletConfig , Serializable {
    private transient ServletConfig config ;
    public void init(ServletConfig config) throws ServletException {
    this.config=config ;
    init( );
    }
    public void init( ) throws ServletException { //programmer purpose
    }
    public abstract service(ServletRequest request,ServletResponse response)
    throws ServletException, IOException;
    public void destroy() {
    }
    public ServletConfig getServletConfig( ) {
    return config;
    }
    public String getServletInfo( ) {
        return "this is GenericServlet" ;
    }
}