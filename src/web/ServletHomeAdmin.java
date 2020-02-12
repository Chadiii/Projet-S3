package web;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletHomeAdmin")
public class ServletHomeAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletHomeAdmin() {
        super();
        
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
    this.getServletContext().getRequestDispatcher("/HomeAdministrator.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/HomeAdministrator.jsp").forward(request, response);
				
	}

}