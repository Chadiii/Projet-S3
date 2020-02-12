package com.JavaEE.bdd;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestBD
 */
@WebServlet("/TestBD")
public class TestBD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestBD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// setup connecion variables
				String user="root";
				String pass="lol123456love";
				
				String jdbcUrl = "jdbc:mysql://localhost:3306/javaee?useSSL=false&serverTimezone=UTC";
				String driver = "com.mysql.cj.jdbc.Driver";
				
				// get connection to database
				try {
					PrintWriter out = response.getWriter();
					
					out.println("Connecting to database: " + jdbcUrl);
					
					Class.forName(driver);
					
					Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
					
					out.println("\nSUCCESS!!!");
					
					BDconnect a = new BDconnect();
					
					System.out.println(a.getPath("image_immob", 921031));
					
					myConn.close();
				
				
				}catch(Exception exc) {
					exc.printStackTrace();
					throw new ServletException(exc);
				}
	}

	

}
