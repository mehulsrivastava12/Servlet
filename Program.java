import java.io.IOException;    
import java.io.PrintWriter;    
import java.sql.*;    
import javax.servlet.ServletException;    
import javax.servlet.annotation.WebServlet;    
import javax.servlet.http.HttpServlet;    
import javax.servlet.http.HttpServletRequest;    
import javax.servlet.http.HttpServletResponse;    
    

@WebServlet("/Program")    
public class Program extends HttpServlet {    
    private static final long serialVersionUID = 1L;    
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    

    }    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    
            
		String url="jdbc:mysql://localhost:3306/Registration";    
		String user="root";    
		String password="Mehul@1234";  
		String query="insert into Data1 values(?,?,?,?,?)"; 
 
        response.setContentType("text/html");    
        PrintWriter pw=response.getWriter();  

        String first_name=request.getParameter("first_name");    
        String last_name=request.getParameter("last_name");    
        String email_id=request.getParameter("email_id");    
        String mobile_no=request.getParameter("mobile_no");    
        String gender=request.getParameter("gender");      
        try    
        {    
            Class.forName("com.mysql.jdbc.Driver");      
                
            Connection con=DriverManager.getConnection(url, user, password);       
            PreparedStatement pstmt=con.prepareStatement(query);    
            pstmt.setString(1, first_name);    
            pstmt.setString(2, last_name);    
            pstmt.setString(3,email_id);    
            pstmt.setString(4, mobile_no);    
            pstmt.setString(5, gender);    
                
            int x=pstmt.executeUpdate(); 
                
            if(x>0)    
            {    
            pw.println("Values Inserted Successfully");    
            }    
                
        }    
        catch(Exception e)    
        {    
                e.printStackTrace();    
        }         
    }    
    
}    