package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Estimer;

public class ControlEStimer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Estimer metie;
	@Override
	public void init() throws ServletException {
		metie=new Estimer();
	}
	@Override
protected void doGet(HttpServletRequest request, 
		HttpServletResponse response) 
		 throws ServletException, IOException {
	doPost(request, response);
}
	@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
	EstimerModel modele=new EstimerModel();
	String action=request.getParameter("action");
	if(action!=null) {
		if (action.equals("Calculer")) {
			
			modele.setSuperfici(Integer.parseInt(request.getParameter("superfici")));
			modele.setStatu(request.getParameter("statu"));
			modele.setQuartie(request.getParameter("quartie"));
			modele.setFinition(request.getParameter("finition"));
			modele.setImmo_type(request.getParameter("immobilie"));
			Double result=metie.Calculer(modele.getSuperfici(),modele.getQuartie() , modele.getStatu(),
							             modele.getImmo_type(),modele.getFinition() );
			modele.setResult(result);
			request.setAttribute("model", modele);
			
		}
		
	}
	
	request.getRequestDispatcher("/WEB-INF/FormulairEstimer.jsp").
	forward(request, response);
	
}
}
	


