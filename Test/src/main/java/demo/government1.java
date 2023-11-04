package demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSession;

@WebServlet("/government1")
public class government1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String email,pass,check;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public government1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void check_table(Statement stmt, Connection conn, ResultSet rs, PreparedStatement pstmt)
	{
		try
		{
			String query = "select pass from ooclogin WHERE email = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, email);
			System.out.println("Success");
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				check = rs.getString("pass");
			}
			System.out.println(check);
		}
		catch(Exception e)
		{
			System.out.println("error : "+e);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
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
		//HttpSession session = request.getSession();
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
			stmt = null;
			rs=null;
			pstmt=null;
		}           
		catch(Exception e)
		{
			System.out.println("Cannot connect to database "+ e.getMessage());
		}
		email = request.getParameter("email");
		pass = request.getParameter("passwd");
//		PrintWriter out = response.getWriter();
		check_table(stmt, conn, rs, pstmt);
		if(pass.equals(check))
		{			
			response.sendRedirect("index.html");
		}
		else
		{
			response.sendRedirect("login.html");
		}
	}
}


	


	