package com.JavaEE.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.JavaEE.Bean.Model;
import com.JavaEE.bdd.BDconnect;

/**
 * Servlet implementation class ModelController
 */

public class ShowModelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowModelController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/showModel.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BDconnect bd = new BDconnect();
		
		List<Model> listModel = new ArrayList<Model>();
		
		listModel = bd.getDataModel("model");
			
		System.out.println(listModel);
		
		request.setAttribute("listModel", listModel);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/showModel.jsp").forward(request, response);
	}

}
