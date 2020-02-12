package web;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Bean.Reservation;
import Bean.Reservation_model;
import Bean.ReservtionImpleme;
import Bean.ReservtionModelImpleme;


@WebServlet("/ServletGestionDesModeles")
public class ServletGestionDesModeles extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ReservtionModelImpleme metier;
	
	
	private int ter=0,app=0,vill=0,c;
	
	@Override
	public void init() throws ServletException {
		 metier=new ReservtionModelImpleme();
		
	}
    public ServletGestionDesModeles() {
        super();
  
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			
		modelModel model=new modelModel();
		request.setAttribute("model", model);
		
	    String action= request.getParameter("action");
		List<Reservation_model> res=metier.listModele();
		
		/*for(int i=0;i<res.size();i++) {
			if(imme.get(i).getType_imm().equals("appartement")) app++;
			else if(imme.get(i).getType_imm().equals("villa")) vill++;
			else if(imme.get(i).getType_imm().equals("terrain")) ter++;
			
			
		}*/
		model.setReserv_model(res);	
		if(action!=null) 
		{
			
			if(action.equals("delete")) {
				app=0;
				vill=0;
				ter=0;
				
				int cod=Integer.parseInt(request.getParameter("cod"));
				metier.deleteModele(cod);
					
				model.setReserv_model(metier.listModele());
				/*List<Immobilier> im=model.getImm();
				for(int j=0;j<im.size();j++) {
					if(im.get(j).getType_imm().equals("appartement")) app++;
					else if(im.get(j).getType_imm().equals("villa")) vill++;
					else if(im.get(j).getType_imm().equals("terrain")) ter++;	
				}*/
				
				c=c+1;
			}
			
		}
		
		request.setAttribute("model1", c);
		request.setAttribute("model2", app);
		request.setAttribute("model3", vill);
		request.setAttribute("model4", ter);
		app=0;
		vill=0;
		ter=0;
		
		
		request.getRequestDispatcher("/GestionReservation1.jsp").
		forward(request, response);
		
	}

}
