package demo;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/government")
public class government extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public government() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String n = request.getParameter("name");
		//response.sendRedirect("index.html");
		Connection conn;
		String userName;
		String url;
		String password;
		Statement stmt;
		ResultSet rs;
		PreparedStatement pstmt;
		conn = null;
		stmt = null;
		rs = null;
		pstmt = null;
		try
		{
			conn = null;
			userName = "root";
			password = "root";
			url = "jdbc:mysql://localhost:3306/ooc";
			Class.forName ("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,userName,password);
			System.out.println("Database connection established");
			stmt = conn.createStatement();
			System.out.println("Name: "+n);
			String e = request.getParameter("email");
			String p = request.getParameter("passwd");
			String query = "insert into ooclogin(name,email,pass) values(?,?,?)";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, n);
			pstmt.setString(2, e);
			pstmt.setString(3, p);
			pstmt.executeUpdate();
			response.sendRedirect("login.html");
			//stmt = null;
			//rs = null;
		}
		catch(Exception e)
		{
			System.out.println("Cannot connect to database "+ e.getMessage());
		}
	}



}
