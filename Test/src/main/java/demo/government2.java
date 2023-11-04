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

/**
 * Servlet implementation class government2
 */
@WebServlet("/government2")
public class government2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public government2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
	    //String n = request.getParameter("name");
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
			
			String e = request.getParameter("email");
			String n = request.getParameter("name");
			String ex = request.getParameter("rate");
			String re = request.getParameter("reas");
			String g = request.getParameter("goal");
			String i = request.getParameter("imp");
			String query = "insert into feedback(email,name,exp,reason,goal,imp) values(?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,e);
			pstmt.setString(2,n);
			pstmt.setString(3,ex);
			pstmt.setString(4,re);
			pstmt.setString(5,g);
			pstmt.setString(6,i);
			pstmt.executeUpdate();
			/*stmt = null;
			rs = null;*/
			response.sendRedirect("thankyou.html");
		}
		catch(Exception e)
		{
			System.out.println("Cannot connect to database "+ e.getMessage());
		}
	}



	}
