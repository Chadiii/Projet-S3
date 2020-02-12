package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Image_Implem;
import Bean.Immobilier;
import Bean.ImmobilierMetierImp;
import Bean.ImmobilierOperMetier;


@WebServlet("/ServletGestionDesAnnonces")
public class ServletGestionDesAnnonces extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ImmobilierOperMetier metier;
	private Image_Implem img;
	
	private int ter=0,app=0,vill=0,c;
	
	@Override
	public void init() throws ServletException {
		metier=new ImmobilierMetierImp();
		img=new Image_Implem();
		
	}
    public ServletGestionDesAnnonces() {
        super();
  
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			
		ImmobilierModele model=new ImmobilierModele();
		request.setAttribute("model", model);
		
	    String action= request.getParameter("action");
		List<Immobilier> imme=metier.listImmobilier();
		
		for(int i=0;i<imme.size();i++) {
			if(imme.get(i).getType_imm().equals("appartement")) app++;
			else if(imme.get(i).getType_imm().equals("villa")) vill++;
			else if(imme.get(i).getType_imm().equals("terrain")) ter++;
			
			
		}
		model.setImm(imme);	
		if(action!=null) 
		{
			
			if(action.equals("delete")) {
				app=0;
				vill=0;
				ter=0;
				
				int cod=Integer.parseInt(request.getParameter("cod"));
				metier.deleteImmobilier(cod);
				img.deleteImage(cod);	
				model.setImm(metier.listImmobilier());
				List<Immobilier> im=model.getImm();
				for(int j=0;j<im.size();j++) {
					if(im.get(j).getType_imm().equals("appartement")) app++;
					else if(im.get(j).getType_imm().equals("villa")) vill++;
					else if(im.get(j).getType_imm().equals("terrain")) ter++;	
				}
				
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
		
		
		request.getRequestDispatcher("/GestionDesAnnonces.jsp").
		forward(request, response);
		
	}

}
