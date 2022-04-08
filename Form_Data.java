import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Form_Data extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) 
    throws ServletException, IOException{
        response.setContentType("text/html");

    PrintWriter out=response.getWriter();
    String title="Successfullly Registered";
    String docType="<!doctype html public \"-//w3c//dtd html 4.0 " +
    "transitional//en\">\n";

    out.println(docType+
    "<html>\n"+
    "<head><title>" + title + "</title></head>\n"+
    "<body bgcolor = \"#ABA8A9\">\n" +
    "<h1 align = \"center\">" + title + "</h1>\n" +
    "<ul>\n" +
        "  <li><b>First Name</b>: "
            + request.getParameter("first_name") + "\n" +
        "  <li><b>Last Name</b>: "
            + request.getParameter("last_name") + "\n" +
        "  <li><b>Email-ID</b>: "
            + request.getParameter("email_id") + "\n" +
        "  <li><b>Mobile Number</b>: "
            + request.getParameter("mobile_no") + "\n" +
        "  <li><b>Gender</b>: "
            + request.getParameter("gender") + "\n" +
        "</ul>\n" +        
        "</body>"+
        "</html>"
        );
    }
}