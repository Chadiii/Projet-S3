package com.JavaEE.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.JavaEE.Bean.Bien;
import com.JavaEE.bdd.BDconnect;

/**
 * Servlet implementation class ShowGood
 */
@WebServlet("/ShowGoodController")
public class ShowGoodController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowGoodController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/showGood3.jsp").forward(request, response);	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BDconnect bd = new BDconnect();
		
		List<Bien> listBien = new ArrayList<Bien>();
		
		String searchBar = request.getParameter("searchBar");
		
		if(searchBar == "") {
		
			listBien = bd.getDataBien("immobilier");
			
		} else {
			
			listBien = bd.getDataBienSearchBar("immobilier", searchBar);
		
		}
		System.out.println(listBien);
		
		request.setAttribute("listBien", listBien);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/showGood3.jsp").forward(request, response);
	
	}

}
