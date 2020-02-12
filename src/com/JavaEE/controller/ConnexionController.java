package com.JavaEE.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.JavaEE.Form.HomeConnexionForm;

/**
 * Servlet implementation class ConnexionController
 */
@WebServlet("/ConnexionController")
public class ConnexionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConnexionController() {
        super();
            }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HomeConnexionForm form = new HomeConnexionForm();
		
			form.VerificationIdentifiant(request);
		
			form.Verificationconnexion(request);
		
			request.setAttribute("form", form);
			
		
		 if(form.isResultat()){
			
			 
			String email = request.getParameter("email");
			
			String id_user = form.VerificationId(request);
			
			if(form.VerificationAdmin(request)) {
				response.sendRedirect("Home_Admin");
			
			}
			else {
			
			HttpSession session = request.getSession();
			
			session.setAttribute("email", email);
			
			session.setAttribute("id_user", id_user);
			
			if(form.VerificationType(request).equals("demandeur")) {
				response.sendRedirect("DemandeurHome");
			} else {
				response.sendRedirect("homeoffreur");
			}
			
			}
			
		
		}else {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
		
		}
	}

}
