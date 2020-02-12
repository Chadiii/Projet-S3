package com.JavaEE.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.JavaEE.Form.SignUpForm;

/**
 * Servlet implementation class SignUpController
 */
@WebServlet("/SignUpController")
public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpController() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/SignUp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SignUpForm signForm = new SignUpForm();
		
		signForm.addData(request);
		
		request.setAttribute("signForm", signForm);
		
		System.out.println(signForm.getErreur());
		
		if(signForm.isResult()) {
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
			
		}else {
			
			this.getServletContext().getRequestDispatcher("/WEB-INF/SignUp.jsp").forward(request, response);
		}
		
	}

}
