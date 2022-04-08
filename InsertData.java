
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException
	{
		try {
			String url = "jdbc:mysql://localhost:3306/Registration";
			String user = "root";
			String password ="Mehul@1234";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			PreparedStatement st = con.prepareStatement("Insert into Data values ( ?, ?, ?, ?)");
			st.setString(1, request.getParameter("first_name"));
			st.setString(2, request.getParameter("last_name"));
			st.setString(3, request.getParameter("email_id"));
			st.setInt(4, Integer.parseInt(request.getParameter("mobile_no")));
			st.setString(5, request.getParameter("gender"));
			st.executeUpdate();
			st.close();
			con.close();
			PrintWriter out = response.getWriter();
			out.println("<html><body><b>Successfully Inserted"
			+ "</b></body></html>");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
