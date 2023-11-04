package demo;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class iitbhu
 */
@WebServlet("/iitbhu")
public class iitbhu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public iitbhu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
response.setContentType("text/html");
		
		//response.sendRedirect("index.html");
		Connection conn;
		String userName;
		String url;
		String password;
		Statement stmt;
		ResultSet rs,ps;
		PreparedStatement pstmt;
		conn = null;
		stmt = null;
		rs = null;
		pstmt = null;
		
		PrintWriter out = response.getWriter();
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
			out.println("<!DOCTYPE html>\r\n"
					+ "<html lang=\"en\">\r\n"
					+ "<head>\r\n"
					+ "    <meta charset=\"UTF-8\">\r\n"
					+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
					+ "    <title>Document</title>\r\n"
					+ "<style>\r\n"
					+ "    table\r\n"
					+ "    {\r\n"
					+ "        width: 100vw;\r\n"
					+ "    }\r\n"
					+ "    h1,h4{\r\n"
					+ "        text-align: center;\r\n"
					+ "    }\r\n"
					+ "    table,\r\n"
					+ "    td {\r\n"
					+ "        border: 1px solid #333;\r\n"
					+ "        /* height: 150px; */\r\n"
					+ "    }\r\n"
					+ "    th{\r\n"
					+ "        line-height: 2;\r\n"
					+ "    }\r\n"
					+ "    \r\n"
					+ "    thead\r\n"
					+ "     {\r\n"
					+ "        background-color: rgb(37, 33, 33);\r\n"
					+ "        color: #fff;\r\n"
					+ "    }\r\n"
					+ "    thead,\r\n"
					+ "    tr\r\n"
					+ "     {\r\n"
					+ "       font-size: large;\r\n"
					+ "    }\r\n"
					+ "    tfoot {\r\n"
					+ "        background-color: rgb(205, 69, 69);\r\n"
					+ "        color: #fff;\r\n"
					+ "        \r\n"
					+ "        \r\n"
					+ "    }\r\n"
					+ "    /* tfoot td{\r\n"
					+ "        width: 100vw;\r\n"
					+ "\r\n"
					+ "    } */\r\n"
					+ "    ul li{\r\n"
					+ "        /* padding: 10px; */\r\n"
					+ "        line-height: 30px;\r\n"
					+ "    }\r\n"
					+ "    </style>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "    <h1>IIT, BANARAS HINDU UNIVERSITY</h1>\r\n"
					+ "    <table>\r\n"
					+ "        <thead>\r\n"
					+ "            <tr>\r\n"
					+ "                <th colspan=\"2\"> IIT BHU Various Post Non Faculty Recruitment 2023\r\n"
					+ "                    <br>\r\n"
					+ "                   \r\n"
					+ "                    </th>\r\n"
					+ "            </tr>\r\n"
					+ "        </thead>\r\n"
					+ "        <tbody>\r\n"
					+ "            <tr>\r\n"
					+ "                <td>\r\n"
					+ "                    <h4>Important Dates</h4>\r\n"
					+ "                    <ul >\r\n"
					+ "                        <li>	Application Begin : 04/02/2023</li>\r\n"
					+ "                        <li>	Last Date for Apply Online : 28/02/2023 upto 5PM</li>\r\n"
					+ "                                         </ul>\r\n"
					+ "                </td>\r\n"
					+ "                <td>\r\n"
					+ "                    <h4>Application Fee</h4>\r\n"
					+ "                    <ul>\r\n"
					+  ""); 
					         rs = stmt.executeQuery("select * from feesbhu");
										while (rs.next())
						             {
						                 String n = rs.getString("fees");
						                 out.println("<li>"+n+"</li>");
						             }
					         out.println("</ul>\r\n"
					+ "                </td>\r\n"
					+ "            </tr>\r\n"
					+ "        </tbody>\r\n"
					+ "        <tfoot>\r\n"
					+ "            <td>\r\n"
					+ "                <h4> Eligibility</h4>\r\n"
					+ "               \r\n");
					         rs = stmt.executeQuery("select * from eligbhu");
								while (rs.next())
				             {
				                 String n = rs.getString("post");
				                 out.println("<li>"+n+"</li>");
				             }
					out.println("\r\n"
					+ "\r\n"
					+ "                </td>\r\n"
					+ "        </tfoot>\r\n"
					+ "    </table>\r\n"
					+ "    <table>\r\n"
					+ "        <thead>\r\n"
					+ "            <tr>\r\n"
					+ "                <th colspan=\"2\">IIT BHU RECRUITMENT 2023\r\n"
					+ "                    </th>\r\n"
					+ "            </tr>\r\n"
					+ "        </thead>\r\n"
					+ "                </table>\r\n"
					+ "              <table>");
					out.println("<thead><tr><th >POST</th><th>TOTAL</th><th>DESCRIPTION</th></tr></thead>");  
		             rs = stmt.executeQuery("select * from eligbhuu");
		             while (rs.next()) 
		             {  
		                 String n = rs.getString("post");  
		                 String nm = rs.getString("total");  
		                 String m = rs.getString("descr");  
		                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + m + "</td></tr>");   
		             }  
		             out.println("</table>"
		            + "                </td>\r\n"
					+ "            </tr>\r\n"
					+ "        </tbody>\r\n"
					+ "    </table>\r\n"
					+ "    <br>\r\n"
					+ "\r\n"
					+ "    <table>\r\n"
					+ "        <thead>\r\n"
					+ "            <tr>\r\n"
					+ "                <th colspan=\"2\">Selection Of Staff\r\n"
					+ "        \r\n"
					+ "                    </th>\r\n"
					+ "            </tr>\r\n"
					+ "        </thead>\r\n"
					+ "        <tbody>\r\n"
					+ "            <tr>\r\n"
					+ "                <td>\r\n"
					+ "                    <ul >\r\n");
				       rs = stmt.executeQuery("select * from exambhu");
						while (rs.next())
		             {
		                 String n = rs.getString("exam");
		                 out.println("<li>"+n+"</li>");
		             }
					       out.println("</ul>\r\n"
				
					+ "                </td>\r\n"
					+ "                <br>\r\n"
					+ "                <table>\r\n"
					+ "                    <thead>\r\n"
					+ "                        <tr>\r\n"
					+ "                            <th colspan=\"2\">How to Fill IIT BHU \r\n"
					+ "                    \r\n"
					+ "                                </th>\r\n"
					+ "                        </tr>\r\n"
					+ "                    </thead>\r\n"
					+ "                    <tbody>\r\n"
					+ "                        <tr>\r\n"
					+ "                            <td>\r\n"
					+ "                                <ul >\r\n");
					       rs = stmt.executeQuery("select * from howbhu");
							while (rs.next())
			             {
			                 String n = rs.getString("how");
			                 out.println("<li>"+n+"</li>");
			             }
						       out.println("</ul>\r\n"
					+ "                            </td>\r\n"
					+ "                            </tr>\r\n"
					+ "                            </tbody>\r\n"
					+ "                            </table>\r\n"
					+ " \r\n"
						+ "                            </body>\r\n"
						+ "                            </html>\r\n"
						+ "");
		
		}
		catch(Exception e)
		{
			System.out.println("Cannot connect to database "+ e.getMessage());
		}

	
	}
}
