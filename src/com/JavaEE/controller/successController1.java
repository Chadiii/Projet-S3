package com.JavaEE.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.JavaEE.bdd.BDconnect;

/**
 * Servlet implementation class 
 */

public class successController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public successController1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BDconnect a = new BDconnect();
		
		String code_model = request.getParameter("code_model");
		String code_user = request.getParameter("code_user");
		
		int id_model = Integer.parseInt(code_model);
		int id_user = Integer.parseInt(code_user);
		
		if(a.addDataReservModel("reservation_model", id_model, id_user)) {
			
			System.out.println("Donnée Ajouté avec Succès");
		}
		
		this.getServletContext().getRequestDispatcher("/succesReserv.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/succesReserv.jsp").forward(request, response);
	}

}

